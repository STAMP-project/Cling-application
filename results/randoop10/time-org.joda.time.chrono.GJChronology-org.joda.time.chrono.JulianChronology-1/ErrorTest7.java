import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3501");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone5.getShortName((long) (short) -1, locale7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str11 = dateTimeZone10.getID();
        boolean boolean12 = dateTimeZone10.isFixed();
        long long14 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, (long) (byte) 1);
        boolean boolean15 = dateTimeZone5.isFixed();
        org.joda.time.Chronology chronology16 = gJChronology0.withZone(dateTimeZone5);
        long long19 = dateTimeZone5.adjustOffset((-59082429599991L), false);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, readableInstant22);
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology23.getZone();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology23.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology23.getZone();
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, (org.joda.time.ReadableInstant) instant29);
        java.lang.String str31 = instant29.toString();
        int int32 = dateTimeZone20.getOffset((org.joda.time.ReadableInstant) instant29);
        boolean boolean33 = dateTimeZone20.isFixed();
        long long35 = dateTimeZone5.getMillisKeepLocal(dateTimeZone20, (-12839710758129L));
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone37);
        boolean boolean39 = dateTimeZone37.isFixed();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40, readableInstant41);
        org.joda.time.DateTimeZone dateTimeZone43 = gJChronology42.getZone();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology42.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = gJChronology42.getZone();
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46, (org.joda.time.ReadableInstant) instant48);
        java.lang.String str50 = instant48.toString();
        boolean boolean51 = instant48.isEqualNow();
        int int52 = dateTimeZone37.getOffset((org.joda.time.ReadableInstant) instant48);
        org.joda.time.MutableDateTime mutableDateTime53 = instant48.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.chrono.GJChronology gJChronology56 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54, readableInstant55);
        org.joda.time.DateTimeZone dateTimeZone57 = gJChronology56.getZone();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str60 = dateTimeZone59.getID();
        org.joda.time.Chronology chronology61 = gJChronology56.withZone(dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone62 = gJChronology56.getZone();
        org.joda.time.MutableDateTime mutableDateTime63 = instant48.toMutableDateTime(dateTimeZone62);
        org.joda.time.Chronology chronology64 = instant48.getChronology();
        org.joda.time.MutableDateTime mutableDateTime65 = instant48.toMutableDateTime();
        org.joda.time.chrono.GJChronology gJChronology66 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20, (org.joda.time.ReadableInstant) mutableDateTime65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and mutableDateTime53", (instant29.compareTo(mutableDateTime53) == 0) == instant29.equals(mutableDateTime53));
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3502");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DurationField durationField5 = gJChronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology2.add(readablePeriod8, (long) 3600000, 3600000);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = gJChronology2.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField14, and durationField5", !(durationField5.compareTo(durationField14) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField14.compareTo(durationField5))));
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3503");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant7.minus(readableDuration8);
        org.joda.time.Instant instant12 = instant9.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant9.plus(readableDuration13);
        org.joda.time.Instant instant15 = instant14.toInstant();
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant18 = instant16.plus(readableDuration17);
        org.joda.time.MutableDateTime mutableDateTime19 = instant18.toMutableDateTime();
        boolean boolean20 = instant14.isEqual((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) mutableDateTime19, (int) (short) 1);
        java.lang.String str23 = mutableDateTime19.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean27 = dateTimeZone25.isStandardOffset((long) (-1));
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField29 = gJChronology28.hours();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology28.millisOfSecond();
        org.joda.time.DateTime dateTime31 = mutableDateTime19.toDateTime((org.joda.time.Chronology) gJChronology28);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology28.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime19", (instant16.compareTo(mutableDateTime19) == 0) == instant16.equals(mutableDateTime19));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3504");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant8.minus(readableDuration24);
        java.util.Date date26 = instant8.toDate();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, readableInstant28);
        org.joda.time.DateTimeZone dateTimeZone30 = gJChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology29.dayOfYear();
        org.joda.time.Instant instant33 = gJChronology29.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant33.minus(readableDuration34);
        org.joda.time.Instant instant38 = instant35.withDurationAdded((-12219292800000L), 0);
        boolean boolean39 = instant8.isEqual((org.joda.time.ReadableInstant) instant35);
        org.joda.time.DateTimeZone dateTimeZone40 = instant35.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        boolean boolean42 = instant35.isSupported(dateTimeFieldType41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, readableInstant44);
        org.joda.time.Chronology chronology46 = gJChronology45.withUTC();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology45.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology45.millisOfDay();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology45.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology45.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime51 = instant35.toMutableDateTime((org.joda.time.Chronology) gJChronology45);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.Instant instant53 = instant35.plus(readableDuration52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant53 and mutableDateTime51", (instant53.compareTo(mutableDateTime51) == 0) == instant53.equals(mutableDateTime51));
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3505");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.secondOfMinute();
        org.joda.time.DurationField durationField6 = gJChronology2.eras();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField9 = gJChronology2.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField9, and durationField6", !(durationField6.compareTo(durationField9) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField9.compareTo(durationField6))));
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3506");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime10 = instant7.toMutableDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = instant7.toDateTime();
        org.joda.time.Instant instant13 = instant7.withMillis(100L);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DurationField durationField15 = gJChronology14.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime10", (instant7.compareTo(mutableDateTime10) == 0) == instant7.equals(mutableDateTime10));
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3507");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        boolean boolean3 = instant0.isBeforeNow();
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant8 = instant5.withDurationAdded(readableDuration6, 0);
        java.util.Date date9 = instant5.toDate();
        long long10 = instant5.getMillis();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology13.getZone();
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, (org.joda.time.ReadableInstant) instant19);
        java.lang.String str21 = instant19.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, readableInstant23);
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology24.getZone();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology24.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology24.dayOfYear();
        org.joda.time.Instant instant28 = gJChronology24.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant30 = instant28.minus(readableDuration29);
        org.joda.time.Instant instant33 = instant30.withDurationAdded((-12219292800000L), 0);
        int int34 = instant19.compareTo((org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35, readableInstant36);
        org.joda.time.Chronology chronology38 = gJChronology37.withUTC();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology37.dayOfWeek();
        org.joda.time.DurationField durationField40 = gJChronology37.years();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology37.weekyear();
        boolean boolean42 = instant19.equals((java.lang.Object) dateTimeField41);
        org.joda.time.Instant instant44 = instant19.withMillis(32L);
        boolean boolean45 = instant5.isEqual((org.joda.time.ReadableInstant) instant44);
        boolean boolean46 = instant0.equals((java.lang.Object) instant5);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Instant instant48 = instant0.plus(readableDuration47);
        boolean boolean49 = instant0.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.chrono.GJChronology gJChronology52 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone50, readableInstant51);
        org.joda.time.Chronology chronology53 = gJChronology52.withUTC();
        java.lang.String str54 = gJChronology52.toString();
        org.joda.time.DurationField durationField55 = gJChronology52.eras();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology52.millisOfDay();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology52.weekOfWeekyear();
        long long61 = gJChronology52.add(1644572759806L, (-71999991L), (int) (short) 1);
        java.lang.String str62 = gJChronology52.toString();
        boolean boolean63 = instant0.equals((java.lang.Object) gJChronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField40 and durationField55", Math.signum(durationField40.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField40)));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3508");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        boolean boolean13 = instant8.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.Chronology chronology17 = gJChronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology16.monthOfYear();
        boolean boolean24 = instant8.equals((java.lang.Object) dateTimeField23);
        org.joda.time.Instant instant26 = instant8.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = instant26.isSupported(dateTimeFieldType27);
        org.joda.time.Chronology chronology29 = instant26.getChronology();
        org.joda.time.Instant instant31 = instant26.withMillis((-35999968L));
        org.joda.time.Chronology chronology32 = instant26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = instant26.toMutableDateTimeISO();
        org.joda.time.Instant instant35 = new org.joda.time.Instant(18600000L);
        boolean boolean36 = mutableDateTime33.isBefore((org.joda.time.ReadableInstant) instant35);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology37.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology37.dayOfMonth();
        org.joda.time.DateTime dateTime40 = mutableDateTime33.toDateTime((org.joda.time.Chronology) gJChronology37);
        org.joda.time.DateTimeField dateTimeField41 = gJChronology37.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant26 and mutableDateTime33", (instant26.compareTo(mutableDateTime33) == 0) == instant26.equals(mutableDateTime33));
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3509");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology3.getZone();
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant7.plus(readableDuration8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, readableInstant11);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology12.dayOfYear();
        org.joda.time.Instant instant16 = gJChronology12.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant18 = instant16.minus(readableDuration17);
        org.joda.time.Instant instant21 = instant18.withDurationAdded((-12219292800000L), 0);
        boolean boolean23 = instant18.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, readableInstant25);
        org.joda.time.Chronology chronology27 = gJChronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology26.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology26.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology26.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology26.monthOfYear();
        boolean boolean34 = instant18.equals((java.lang.Object) dateTimeField33);
        org.joda.time.Instant instant36 = instant18.withMillis(1L);
        boolean boolean37 = instant7.equals((java.lang.Object) 1L);
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39, readableInstant40);
        org.joda.time.DateTimeZone dateTimeZone42 = gJChronology41.getZone();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str45 = dateTimeZone44.getID();
        org.joda.time.Chronology chronology46 = gJChronology41.withZone(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = gJChronology41.getZone();
        long long49 = dateTimeZone47.nextTransition((-12219292800000L));
        long long51 = dateTimeZone47.convertUTCToLocal((long) 1);
        java.util.Locale locale53 = null;
        java.lang.String str54 = dateTimeZone47.getName((long) (-1), locale53);
        long long58 = dateTimeZone47.convertLocalToUTC(1L, true, (long) 0);
        org.joda.time.Instant instant60 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.Instant instant62 = instant60.plus(readableDuration61);
        java.lang.String str63 = instant60.toString();
        boolean boolean64 = dateTimeZone47.equals((java.lang.Object) instant60);
        java.lang.String str66 = dateTimeZone47.getShortName(8L);
        org.joda.time.MutableDateTime mutableDateTime67 = instant7.toMutableDateTime(dateTimeZone47);
        int int69 = dateTimeZone47.getOffset((-110L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime67", (instant7.compareTo(mutableDateTime67) == 0) == instant7.equals(mutableDateTime67));
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3510");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        boolean boolean13 = instant8.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.Chronology chronology17 = gJChronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology16.monthOfYear();
        boolean boolean24 = instant8.equals((java.lang.Object) dateTimeField23);
        org.joda.time.Instant instant26 = instant8.withMillis(1L);
        org.joda.time.Chronology chronology27 = instant26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.chrono.JulianChronology julianChronology31 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone29);
        boolean boolean33 = julianChronology31.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology34 = julianChronology31.withUTC();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology36 = julianChronology31.withZone(dateTimeZone35);
        org.joda.time.DurationField durationField37 = julianChronology31.days();
        org.joda.time.DateTimeField dateTimeField38 = julianChronology31.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField39 = julianChronology31.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = julianChronology31.add(readablePeriod40, (long) (short) 100, 126000000);
        org.joda.time.MutableDateTime mutableDateTime44 = instant26.toMutableDateTime((org.joda.time.Chronology) julianChronology31);
        org.joda.time.Instant instant47 = instant26.withDurationAdded((-12219364800000L), 20);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone48, readableInstant49);
        org.joda.time.Chronology chronology51 = gJChronology50.withUTC();
        java.lang.String str52 = gJChronology50.toString();
        org.joda.time.DateTimeField dateTimeField53 = gJChronology50.monthOfYear();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology50.millisOfDay();
        org.joda.time.DateTimeField dateTimeField55 = gJChronology50.yearOfEra();
        org.joda.time.Chronology chronology56 = gJChronology50.withUTC();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology50.secondOfMinute();
        org.joda.time.DurationField durationField58 = gJChronology50.seconds();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology50.era();
        boolean boolean60 = instant47.equals((java.lang.Object) dateTimeField59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant26 and mutableDateTime44", (instant26.compareTo(mutableDateTime44) == 0) == instant26.equals(mutableDateTime44));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3511");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.halfdays();
        org.joda.time.DurationField durationField2 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = gJChronology0.weekyears();
        java.lang.String str5 = gJChronology0.toString();
        org.joda.time.DurationField durationField6 = gJChronology0.centuries();
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3512");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        java.lang.String str19 = dateTimeZone8.getNameKey((long) (short) 100);
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, readableInstant22);
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology23.getZone();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology23.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology23.getZone();
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, (org.joda.time.ReadableInstant) instant29);
        org.joda.time.DateTime dateTime31 = instant29.toDateTime();
        boolean boolean32 = instant29.isAfterNow();
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, (org.joda.time.ReadableInstant) instant29);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        boolean boolean37 = instant35.isSupported(dateTimeFieldType36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone38, readableInstant39);
        org.joda.time.DateTimeZone dateTimeZone41 = gJChronology40.getZone();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology40.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology40.dayOfYear();
        org.joda.time.Instant instant44 = gJChronology40.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.Instant instant46 = instant44.minus(readableDuration45);
        org.joda.time.Instant instant49 = instant46.withDurationAdded((-12219292800000L), 0);
        boolean boolean51 = instant46.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52, readableInstant53);
        org.joda.time.Chronology chronology55 = gJChronology54.withUTC();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology54.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology54.millisOfDay();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology54.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology54.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology54.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField61 = gJChronology54.monthOfYear();
        boolean boolean62 = instant46.equals((java.lang.Object) dateTimeField61);
        org.joda.time.Instant instant64 = instant46.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = null;
        boolean boolean66 = instant64.isSupported(dateTimeFieldType65);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = null;
        boolean boolean68 = instant64.isSupported(dateTimeFieldType67);
        org.joda.time.Instant instant71 = instant64.withDurationAdded(151199999L, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.chrono.GJChronology gJChronology74 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone72, readableInstant73);
        org.joda.time.DateTimeZone dateTimeZone75 = gJChronology74.getZone();
        org.joda.time.DateTimeField dateTimeField76 = gJChronology74.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField77 = gJChronology74.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone78 = gJChronology74.getZone();
        java.lang.String str79 = dateTimeZone78.getID();
        long long81 = dateTimeZone78.nextTransition((long) 10);
        long long83 = dateTimeZone78.nextTransition((-35999900L));
        java.lang.String str85 = dateTimeZone78.getNameKey((long) 1582);
        org.joda.time.MutableDateTime mutableDateTime86 = instant71.toMutableDateTime(dateTimeZone78);
        boolean boolean87 = instant35.isEqual((org.joda.time.ReadableInstant) instant71);
        boolean boolean88 = instant71.isEqualNow();
        org.joda.time.Instant instant89 = instant71.toInstant();
        int int90 = instant29.compareTo((org.joda.time.ReadableInstant) instant89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant89 and mutableDateTime86", (instant89.compareTo(mutableDateTime86) == 0) == instant89.equals(mutableDateTime86));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3513");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = julianChronology3.withUTC();
        org.joda.time.DurationField durationField10 = julianChronology3.years();
        long long14 = julianChronology3.add(151199999L, 35L, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = julianChronology3.getZone();
        org.joda.time.Instant instant17 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.plus(readableDuration18);
        org.joda.time.Instant instant21 = instant19.withMillis((long) (byte) -1);
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        java.lang.String str23 = instant21.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology26 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = julianChronology26.minuteOfDay();
        org.joda.time.DurationField durationField28 = julianChronology26.weekyears();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str31 = dateTimeZone30.getID();
        boolean boolean32 = dateTimeZone30.isFixed();
        long long34 = dateTimeZone30.previousTransition(100L);
        java.util.TimeZone timeZone35 = dateTimeZone30.toTimeZone();
        long long37 = dateTimeZone30.previousTransition(5201L);
        org.joda.time.Chronology chronology38 = julianChronology26.withZone(dateTimeZone30);
        boolean boolean39 = instant21.equals((java.lang.Object) chronology38);
        org.joda.time.DateTime dateTime40 = instant21.toDateTimeISO();
        org.joda.time.Instant instant41 = instant21.toInstant();
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, (org.joda.time.ReadableInstant) instant41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField28", (durationField10.compareTo(durationField28) == 0) == durationField10.equals(durationField28));
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3514");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        boolean boolean13 = instant8.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.Chronology chronology17 = gJChronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology16.monthOfYear();
        boolean boolean24 = instant8.equals((java.lang.Object) dateTimeField23);
        org.joda.time.Instant instant26 = instant8.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = instant26.isSupported(dateTimeFieldType27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, readableInstant30);
        org.joda.time.DateTimeZone dateTimeZone32 = gJChronology31.getZone();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology31.dayOfYear();
        org.joda.time.Instant instant35 = gJChronology31.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant37 = instant35.minus(readableDuration36);
        org.joda.time.Instant instant40 = instant37.withDurationAdded((-12219292800000L), 0);
        boolean boolean42 = instant37.isEqual(35L);
        org.joda.time.Instant instant43 = instant37.toInstant();
        boolean boolean45 = instant43.isBefore((long) ' ');
        boolean boolean46 = instant26.isAfter((org.joda.time.ReadableInstant) instant43);
        boolean boolean47 = instant26.isBeforeNow();
        org.joda.time.DateTime dateTime48 = instant26.toDateTimeISO();
        boolean boolean49 = instant26.isAfterNow();
        org.joda.time.DateTime dateTime50 = instant26.toDateTimeISO();
        org.joda.time.Instant instant52 = new org.joda.time.Instant(0L);
        long long53 = instant52.getMillis();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.chrono.GJChronology gJChronology56 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54, readableInstant55);
        org.joda.time.Chronology chronology57 = gJChronology56.withUTC();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology56.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology56.millisOfDay();
        org.joda.time.DurationField durationField60 = gJChronology56.halfdays();
        org.joda.time.DurationField durationField61 = gJChronology56.millis();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology64 = gJChronology56.withZone(dateTimeZone63);
        org.joda.time.DurationField durationField65 = gJChronology56.minutes();
        org.joda.time.DurationField durationField66 = gJChronology56.weekyears();
        org.joda.time.DurationField durationField67 = gJChronology56.minutes();
        org.joda.time.DateTimeField dateTimeField68 = gJChronology56.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField69 = gJChronology56.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime70 = instant52.toMutableDateTime((org.joda.time.Chronology) gJChronology56);
        org.joda.time.ReadableInstant readableInstant71 = null;
        boolean boolean72 = instant52.isBefore(readableInstant71);
        org.joda.time.Instant instant73 = instant52.toInstant();
        boolean boolean74 = instant26.isAfter((org.joda.time.ReadableInstant) instant73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant73 and mutableDateTime70", (instant73.compareTo(mutableDateTime70) == 0) == instant73.equals(mutableDateTime70));
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3515");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology14.getZone();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology14.getZone();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant20);
        java.lang.String str22 = instant20.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, readableInstant24);
        org.joda.time.DateTimeZone dateTimeZone26 = gJChronology25.getZone();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology25.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.dayOfYear();
        org.joda.time.Instant instant29 = gJChronology25.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant31 = instant29.minus(readableDuration30);
        org.joda.time.Instant instant34 = instant31.withDurationAdded((-12219292800000L), 0);
        int int35 = instant20.compareTo((org.joda.time.ReadableInstant) instant31);
        org.joda.time.Instant instant36 = instant31.toInstant();
        org.joda.time.Instant instant39 = instant36.withDurationAdded((-36000000L), 0);
        org.joda.time.DateTime dateTime40 = instant36.toDateTime();
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, (org.joda.time.ReadableInstant) dateTime40);
        java.util.TimeZone timeZone42 = dateTimeZone5.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and dateTime40", (instant29.compareTo(dateTime40) == 0) == instant29.equals(dateTime40));
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3516");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        org.joda.time.Instant instant6 = instant4.minus((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = instant4.toMutableDateTimeISO();
        java.util.Date date8 = mutableDateTime7.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10);
        org.joda.time.Chronology chronology12 = gJChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology11.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology19.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.Chronology chronology24 = gJChronology19.withZone(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology19.getZone();
        long long27 = dateTimeZone25.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology28 = gJChronology11.withZone(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean32 = dateTimeZone30.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        org.joda.time.chrono.JulianChronology julianChronology36 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone34);
        boolean boolean38 = julianChronology36.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology39 = julianChronology36.withUTC();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology41 = julianChronology36.withZone(dateTimeZone40);
        long long43 = dateTimeZone30.getMillisKeepLocal(dateTimeZone40, 10L);
        org.joda.time.Chronology chronology44 = gJChronology11.withZone(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField45 = gJChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology11.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone47 = gJChronology11.getZone();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime7.toMutableDateTime(dateTimeZone47);
        java.lang.String str49 = dateTimeZone47.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime7", (instant1.compareTo(mutableDateTime7) == 0) == instant1.equals(mutableDateTime7));
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3517");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology14.getZone();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology14.getZone();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant20);
        java.lang.String str22 = instant20.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, readableInstant24);
        org.joda.time.Chronology chronology26 = gJChronology25.withUTC();
        java.lang.String str27 = gJChronology25.toString();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.monthOfYear();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology25.dayOfWeek();
        org.joda.time.Instant instant31 = gJChronology25.getGregorianCutover();
        boolean boolean32 = instant20.equals((java.lang.Object) gJChronology25);
        boolean boolean33 = instant11.isAfter((org.joda.time.ReadableInstant) instant20);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant36 = instant20.withDurationAdded(readableDuration34, (int) (byte) 1);
        boolean boolean38 = instant36.isEqual(0L);
        long long39 = instant36.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        boolean boolean41 = instant36.isSupported(dateTimeFieldType40);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.DateTime dateTime44 = instant43.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone45, readableInstant46);
        org.joda.time.DateTimeZone dateTimeZone48 = gJChronology47.getZone();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str51 = dateTimeZone50.getID();
        org.joda.time.Chronology chronology52 = gJChronology47.withZone(dateTimeZone50);
        java.lang.String str54 = dateTimeZone50.getName((long) (byte) 10);
        org.joda.time.chrono.JulianChronology julianChronology55 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone50);
        org.joda.time.Chronology chronology56 = julianChronology55.withUTC();
        org.joda.time.DateTimeField dateTimeField57 = julianChronology55.dayOfMonth();
        org.joda.time.DurationField durationField58 = julianChronology55.seconds();
        java.lang.String str59 = julianChronology55.toString();
        org.joda.time.DateTime dateTime60 = instant43.toDateTime((org.joda.time.Chronology) julianChronology55);
        boolean boolean61 = instant36.isBefore((org.joda.time.ReadableInstant) instant43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant36 and dateTime44", (instant36.compareTo(dateTime44) == 0) == instant36.equals(dateTime44));
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3518");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = new org.joda.time.Instant(1L);
        boolean boolean6 = instant1.isEqual((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Instant instant8 = new org.joda.time.Instant(100L);
        boolean boolean9 = instant5.isEqual((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant11 = new org.joda.time.Instant(0L);
        long long12 = instant11.getMillis();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant11.minus(readableDuration13);
        org.joda.time.DateTimeZone dateTimeZone15 = instant14.getZone();
        int int16 = instant5.compareTo((org.joda.time.ReadableInstant) instant14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18);
        boolean boolean22 = julianChronology20.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology23 = julianChronology20.withUTC();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology25 = julianChronology20.withZone(dateTimeZone24);
        org.joda.time.DurationField durationField26 = julianChronology20.days();
        org.joda.time.DateTimeField dateTimeField27 = julianChronology20.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = julianChronology20.clockhourOfHalfday();
        org.joda.time.DateTime dateTime29 = instant14.toDateTime((org.joda.time.Chronology) julianChronology20);
        org.joda.time.DateTimeField dateTimeField30 = julianChronology20.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime29", (instant11.compareTo(dateTime29) == 0) == instant11.equals(dateTime29));
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3519");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.seconds();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.Chronology chronology12 = julianChronology3.withZone(dateTimeZone11);
        int int14 = dateTimeZone11.getOffsetFromLocal(6400L);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology17.getZone();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology17.getZone();
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, (org.joda.time.ReadableInstant) instant23);
        java.lang.String str25 = instant23.toString();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26, readableInstant27);
        org.joda.time.DateTimeZone dateTimeZone29 = gJChronology28.getZone();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology28.dayOfYear();
        org.joda.time.Instant instant32 = gJChronology28.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Instant instant34 = instant32.minus(readableDuration33);
        org.joda.time.Instant instant37 = instant34.withDurationAdded((-12219292800000L), 0);
        int int38 = instant23.compareTo((org.joda.time.ReadableInstant) instant34);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Instant instant40 = instant23.minus(readableDuration39);
        java.util.Date date41 = instant23.toDate();
        boolean boolean43 = instant23.isBefore((-62112218399999L));
        org.joda.time.Instant instant44 = instant23.toInstant();
        int int45 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) instant44);
        org.joda.time.Instant instant47 = instant44.withMillis((-16883395099642550L));
        org.joda.time.DateTime dateTime48 = instant44.toDateTime();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Instant instant50 = instant44.minus(readableDuration49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant50 and dateTime48", (instant50.compareTo(dateTime48) == 0) == instant50.equals(dateTime48));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3520");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 10);
        int int4 = dateTimeZone2.getOffset((long) ' ');
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.dayOfYear();
        org.joda.time.Instant instant14 = gJChronology10.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant14.minus(readableDuration15);
        org.joda.time.Instant instant19 = instant16.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant16.plus(readableDuration20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        boolean boolean23 = instant16.isEqual(readableInstant22);
        org.joda.time.Chronology chronology24 = instant16.getChronology();
        org.joda.time.Instant instant26 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.plus(readableDuration27);
        org.joda.time.Instant instant30 = instant28.withMillis((long) (byte) -1);
        boolean boolean31 = instant30.isEqualNow();
        int int32 = instant16.compareTo((org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTime dateTime33 = instant16.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology36 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, readableInstant38);
        org.joda.time.DateTimeZone dateTimeZone40 = gJChronology39.getZone();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology39.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology39.dayOfYear();
        org.joda.time.Instant instant43 = gJChronology39.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Instant instant45 = instant43.minus(readableDuration44);
        org.joda.time.Instant instant48 = instant45.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Instant instant50 = instant45.plus(readableDuration49);
        org.joda.time.chrono.GJChronology gJChronology51 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35, (org.joda.time.ReadableInstant) instant50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52, readableInstant53);
        org.joda.time.DateTimeZone dateTimeZone55 = gJChronology54.getZone();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology54.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology54.dayOfYear();
        org.joda.time.Instant instant58 = gJChronology54.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Instant instant60 = instant58.minus(readableDuration59);
        org.joda.time.Instant instant63 = instant60.withDurationAdded((-12219292800000L), 0);
        boolean boolean65 = instant60.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.chrono.GJChronology gJChronology68 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone66, readableInstant67);
        org.joda.time.Chronology chronology69 = gJChronology68.withUTC();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology68.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField71 = gJChronology68.millisOfDay();
        org.joda.time.DateTimeField dateTimeField72 = gJChronology68.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField73 = gJChronology68.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField74 = gJChronology68.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField75 = gJChronology68.monthOfYear();
        boolean boolean76 = instant60.equals((java.lang.Object) dateTimeField75);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.chrono.GJChronology gJChronology79 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone77, readableInstant78);
        org.joda.time.DateTimeZone dateTimeZone80 = gJChronology79.getZone();
        org.joda.time.DateTimeField dateTimeField81 = gJChronology79.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField82 = gJChronology79.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone83 = gJChronology79.getZone();
        org.joda.time.Instant instant85 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology86 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone83, (org.joda.time.ReadableInstant) instant85);
        java.lang.String str87 = instant85.toString();
        boolean boolean88 = instant85.isEqualNow();
        boolean boolean89 = instant60.isEqual((org.joda.time.ReadableInstant) instant85);
        boolean boolean90 = instant50.isBefore((org.joda.time.ReadableInstant) instant85);
        boolean boolean91 = dateTime33.isBefore((org.joda.time.ReadableInstant) instant85);
        org.joda.time.chrono.GJChronology gJChronology92 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, (org.joda.time.ReadableInstant) instant85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime33", (instant14.compareTo(dateTime33) == 0) == instant14.equals(dateTime33));
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3521");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.DateTime dateTime12 = instant11.toDateTime();
        boolean boolean13 = instant11.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime12", (instant11.compareTo(dateTime12) == 0) == instant11.equals(dateTime12));
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3522");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.centuryOfEra();
        org.joda.time.DurationField durationField10 = julianChronology3.years();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.monthOfYear();
        org.joda.time.DurationField durationField12 = julianChronology3.halfdays();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone14.getName((-1L), locale17);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone14.isLocalDateTimeGap(localDateTime19);
        long long23 = dateTimeZone14.adjustOffset((long) (byte) -1, true);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, 36000001L, 1);
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone14, (int) (short) 1);
        org.joda.time.Chronology chronology29 = julianChronology3.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, readableInstant31);
        org.joda.time.DateTimeZone dateTimeZone33 = gJChronology32.getZone();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.dayOfYear();
        org.joda.time.Instant instant36 = gJChronology32.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Instant instant38 = instant36.minus(readableDuration37);
        java.lang.String str39 = instant36.toString();
        org.joda.time.Instant instant41 = instant36.minus((long) 36000000);
        org.joda.time.Chronology chronology42 = instant41.getChronology();
        boolean boolean44 = instant41.isBefore(100L);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        boolean boolean46 = instant41.isSupported(dateTimeFieldType45);
        org.joda.time.DateTime dateTime47 = instant41.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        boolean boolean49 = instant41.isSupported(dateTimeFieldType48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = instant41.toDateTime(dateTimeZone50);
        int int52 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) instant41);
        java.util.Locale locale54 = null;
        java.lang.String str55 = dateTimeZone14.getName((-60514215041535L), locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant41 and dateTime47", (instant41.compareTo(dateTime47) == 0) == instant41.equals(dateTime47));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3523");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.dayOfYear();
        org.joda.time.Instant instant9 = gJChronology5.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.minus(readableDuration10);
        org.joda.time.Instant instant14 = instant11.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant11.plus(readableDuration15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant16);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology17.millisOfSecond();
        org.joda.time.DurationField durationField19 = gJChronology17.minutes();
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology17.getZone();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, readableInstant22);
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology23.getZone();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology23.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology23.dayOfYear();
        org.joda.time.Instant instant27 = gJChronology23.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone28 = instant27.getZone();
        long long29 = instant27.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = instant27.isSupported(dateTimeFieldType30);
        int int32 = dateTimeZone20.getOffset((org.joda.time.ReadableInstant) instant27);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology33.secondOfMinute();
        int int35 = instant27.get(dateTimeField34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36, readableInstant37);
        org.joda.time.Chronology chronology39 = gJChronology38.withUTC();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology38.dayOfWeek();
        org.joda.time.Chronology chronology41 = gJChronology38.withUTC();
        org.joda.time.DurationField durationField42 = gJChronology38.halfdays();
        org.joda.time.DateTimeZone dateTimeZone43 = gJChronology38.getZone();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone44, readableInstant45);
        org.joda.time.Chronology chronology47 = gJChronology46.withUTC();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology46.dayOfWeek();
        org.joda.time.Chronology chronology49 = gJChronology46.withUTC();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.Chronology chronology52 = chronology49.withZone(dateTimeZone51);
        java.lang.String str53 = dateTimeZone51.getID();
        org.joda.time.Chronology chronology54 = gJChronology38.withZone(dateTimeZone51);
        org.joda.time.DurationField durationField55 = gJChronology38.years();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology38.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime57 = instant27.toMutableDateTime((org.joda.time.Chronology) gJChronology38);
        org.joda.time.Instant instant59 = new org.joda.time.Instant((-33539992L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = null;
        java.lang.String str61 = instant59.toString(dateTimeFormatter60);
        boolean boolean62 = instant27.isBefore((org.joda.time.ReadableInstant) instant59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and mutableDateTime57", (instant27.compareTo(mutableDateTime57) == 0) == instant27.equals(mutableDateTime57));
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3524");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        java.util.Date date5 = instant1.toDate();
        long long6 = instant1.getMillis();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology9.getZone();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, (org.joda.time.ReadableInstant) instant15);
        java.lang.String str17 = instant15.toString();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19);
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology20.getZone();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.dayOfYear();
        org.joda.time.Instant instant24 = gJChronology20.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant26 = instant24.minus(readableDuration25);
        org.joda.time.Instant instant29 = instant26.withDurationAdded((-12219292800000L), 0);
        int int30 = instant15.compareTo((org.joda.time.ReadableInstant) instant26);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, readableInstant32);
        org.joda.time.Chronology chronology34 = gJChronology33.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology33.dayOfWeek();
        org.joda.time.DurationField durationField36 = gJChronology33.years();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology33.weekyear();
        boolean boolean38 = instant15.equals((java.lang.Object) dateTimeField37);
        org.joda.time.Instant instant40 = instant15.withMillis(32L);
        boolean boolean41 = instant1.isEqual((org.joda.time.ReadableInstant) instant40);
        org.joda.time.Instant instant43 = instant40.minus((long) 1200);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone45);
        org.joda.time.chrono.JulianChronology julianChronology47 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone45);
        boolean boolean49 = julianChronology47.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField50 = julianChronology47.months();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone52);
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone52.getName((-1L), locale55);
        org.joda.time.LocalDateTime localDateTime57 = null;
        boolean boolean58 = dateTimeZone52.isLocalDateTimeGap(localDateTime57);
        boolean boolean60 = dateTimeZone52.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology61 = julianChronology47.withZone(dateTimeZone52);
        int int63 = dateTimeZone52.getOffset((-35999900L));
        org.joda.time.chrono.JulianChronology julianChronology64 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone52);
        org.joda.time.DurationField durationField65 = julianChronology64.months();
        org.joda.time.DateTimeField dateTimeField66 = julianChronology64.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField67 = julianChronology64.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime68 = instant43.toMutableDateTime((org.joda.time.Chronology) julianChronology64);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.chrono.GJChronology gJChronology71 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone69, readableInstant70);
        org.joda.time.Chronology chronology72 = gJChronology71.withUTC();
        org.joda.time.DurationField durationField73 = gJChronology71.millis();
        long long77 = gJChronology71.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField78 = gJChronology71.millis();
        org.joda.time.DateTimeField dateTimeField79 = gJChronology71.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField80 = gJChronology71.clockhourOfHalfday();
        org.joda.time.DurationField durationField81 = gJChronology71.years();
        org.joda.time.DateTimeField dateTimeField82 = gJChronology71.millisOfSecond();
        org.joda.time.DateTime dateTime83 = mutableDateTime68.toDateTime((org.joda.time.Chronology) gJChronology71);
        org.joda.time.Chronology chronology84 = mutableDateTime68.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant43 and dateTime83", (instant43.compareTo(dateTime83) == 0) == instant43.equals(dateTime83));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3525");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant9);
        java.lang.String str11 = instant9.toString();
        int int12 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((java.lang.Object) instant9);
        org.joda.time.DateTimeZone dateTimeZone14 = instant9.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology17.getZone();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.dayOfYear();
        org.joda.time.Instant instant21 = gJChronology17.getGregorianCutover();
        java.lang.String str22 = gJChronology17.toString();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology17.dayOfWeek();
        org.joda.time.DurationField durationField24 = gJChronology17.days();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology17.hourOfDay();
        org.joda.time.DurationField durationField26 = gJChronology17.centuries();
        boolean boolean27 = instant9.equals((java.lang.Object) durationField26);
        org.joda.time.DateTime dateTime28 = instant9.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime29 = instant9.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime28", (instant13.compareTo(dateTime28) == 0) == instant13.equals(dateTime28));
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3526");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.MutableDateTime mutableDateTime2 = instant0.toMutableDateTime();
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        boolean boolean9 = julianChronology7.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology10 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.era();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology7.minuteOfHour();
        org.joda.time.DurationField durationField13 = julianChronology7.weeks();
        org.joda.time.DurationField durationField14 = julianChronology7.days();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology7.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField20 = julianChronology7.clockhourOfDay();
        boolean boolean21 = dateTime3.equals((java.lang.Object) julianChronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime2", (instant0.compareTo(mutableDateTime2) == 0) == instant0.equals(mutableDateTime2));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3527");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.Instant instant2 = new org.joda.time.Instant((-36000001L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        boolean boolean8 = julianChronology6.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology9 = julianChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology6.era();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology6.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime12 = instant2.toMutableDateTime((org.joda.time.Chronology) julianChronology6);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant14 = gJChronology13.getGregorianCutover();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime12", (instant2.compareTo(mutableDateTime12) == 0) == instant2.equals(mutableDateTime12));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3528");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        long long8 = instant6.getMillis();
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        boolean boolean15 = julianChronology13.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField16 = julianChronology13.millisOfDay();
        org.joda.time.Instant instant18 = org.joda.time.Instant.parse("1970-01-01T00:00:00.001Z");
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant21 = instant18.withDurationAdded(readableDuration19, 10);
        java.util.Date date22 = instant21.toDate();
        boolean boolean23 = julianChronology13.equals((java.lang.Object) instant21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, readableInstant25);
        org.joda.time.Chronology chronology27 = gJChronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology26.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology26.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology26.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology26.yearOfCentury();
        org.joda.time.DurationField durationField33 = gJChronology26.seconds();
        boolean boolean34 = instant21.equals((java.lang.Object) durationField33);
        boolean boolean35 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) instant21);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant38 = instant21.withDurationAdded(readableDuration36, 28800000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime9", (instant6.compareTo(mutableDateTime9) == 0) == instant6.equals(mutableDateTime9));
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3529");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = julianChronology3.getZone();
        long long11 = dateTimeZone8.convertLocalToUTC(86400000L, false);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology15.getZone();
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, (org.joda.time.ReadableInstant) instant21);
        java.lang.String str23 = instant21.toString();
        int int24 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((java.lang.Object) instant21);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = julianChronology28.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, readableInstant31);
        org.joda.time.DateTimeZone dateTimeZone33 = gJChronology32.getZone();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = gJChronology32.getZone();
        org.joda.time.Chronology chronology37 = julianChronology28.withZone(dateTimeZone36);
        org.joda.time.DurationField durationField38 = julianChronology28.seconds();
        boolean boolean39 = instant25.equals((java.lang.Object) durationField38);
        int int40 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) instant25);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41, readableInstant42);
        org.joda.time.DateTimeZone dateTimeZone44 = gJChronology43.getZone();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology43.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology43.dayOfYear();
        org.joda.time.Instant instant47 = gJChronology43.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime50 = instant47.toMutableDateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = instant47.toDateTime();
        java.util.Date date52 = instant47.toDate();
        boolean boolean53 = instant47.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime54 = instant47.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone55, readableInstant56);
        java.lang.String str58 = gJChronology57.toString();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology57.dayOfYear();
        int int60 = instant47.get(dateTimeField59);
        org.joda.time.Chronology chronology61 = instant47.getChronology();
        org.joda.time.Instant instant63 = instant47.plus(151200000L);
        org.joda.time.Instant instant64 = instant47.toInstant();
        boolean boolean65 = instant25.isAfter((org.joda.time.ReadableInstant) instant64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant64 and mutableDateTime50", (instant64.compareTo(mutableDateTime50) == 0) == instant64.equals(mutableDateTime50));
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3530");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.getID();
        boolean boolean3 = dateTimeZone1.isFixed();
        long long5 = dateTimeZone1.previousTransition(100L);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.Instant instant10 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.plus(readableDuration11);
        boolean boolean13 = instant12.isAfterNow();
        org.joda.time.DateTime dateTime14 = instant12.toDateTime();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime14", (instant10.compareTo(dateTime14) == 0) == instant10.equals(dateTime14));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3531");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant9);
        java.lang.String str11 = instant9.toString();
        int int12 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((java.lang.Object) instant9);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((java.lang.Object) instant13);
        java.util.Date date15 = instant14.toDate();
        org.joda.time.Instant instant17 = instant14.withMillis((long) (byte) 10);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant18.plus(readableDuration19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, readableInstant22);
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology23.getZone();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology23.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology23.dayOfYear();
        org.joda.time.Instant instant27 = gJChronology23.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant29 = instant27.minus(readableDuration28);
        org.joda.time.Instant instant32 = instant29.withDurationAdded((-12219292800000L), 0);
        boolean boolean34 = instant29.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35, readableInstant36);
        org.joda.time.Chronology chronology38 = gJChronology37.withUTC();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology37.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.millisOfDay();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology37.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology37.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology37.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology37.monthOfYear();
        boolean boolean45 = instant29.equals((java.lang.Object) dateTimeField44);
        org.joda.time.Instant instant47 = instant29.withMillis(1L);
        boolean boolean48 = instant18.equals((java.lang.Object) 1L);
        int int49 = instant17.compareTo((org.joda.time.ReadableInstant) instant18);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.Instant instant52 = instant18.withDurationAdded(readableDuration50, (int) (byte) 1);
        org.joda.time.DateTime dateTime53 = instant18.toDateTimeISO();
        org.joda.time.Instant instant54 = instant18.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant54 and dateTime53", (instant54.compareTo(dateTime53) == 0) == instant54.equals(dateTime53));
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3532");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant8.plus(readableDuration12);
        org.joda.time.Instant instant14 = instant13.toInstant();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone16);
        boolean boolean20 = julianChronology18.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField21 = julianChronology18.era();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology18.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology18.era();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology18.year();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology27.getZone();
        java.lang.String str30 = dateTimeZone28.getName((long) 0);
        long long32 = dateTimeZone28.nextTransition(0L);
        org.joda.time.Chronology chronology33 = julianChronology18.withZone(dateTimeZone28);
        boolean boolean34 = instant13.equals((java.lang.Object) dateTimeZone28);
        long long35 = instant13.getMillis();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean39 = dateTimeZone37.isStandardOffset((long) (-1));
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37);
        org.joda.time.DurationField durationField41 = gJChronology40.weeks();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology40.year();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology40.year();
        org.joda.time.DateTime dateTime44 = instant13.toDateTime((org.joda.time.Chronology) gJChronology40);
        org.joda.time.ReadableInstant readableInstant45 = null;
        boolean boolean46 = instant13.isEqual(readableInstant45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime44", (instant13.compareTo(dateTime44) == 0) == instant13.equals(dateTime44));
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3533");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        boolean boolean11 = julianChronology9.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology12 = julianChronology9.withUTC();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology14 = julianChronology9.withZone(dateTimeZone13);
        java.lang.String str15 = dateTimeZone13.getID();
        boolean boolean16 = gJChronology2.equals((java.lang.Object) str15);
        org.joda.time.DurationField durationField17 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField19 = gJChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField21 = gJChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField4, and durationField17", !(durationField21.compareTo(durationField4) == 0) || (Math.signum(durationField21.compareTo(durationField17)) == Math.signum(durationField4.compareTo(durationField17))));
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3534");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-1L), locale4);
        long long7 = dateTimeZone1.previousTransition((long) '#');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField12 = julianChronology11.weeks();
        org.joda.time.DurationField durationField13 = julianChronology11.millis();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology11.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = julianChronology11.add(readablePeriod15, (long) 36000000, 4);
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) 36000000);
        long long21 = dateTimeZone1.nextTransition((-36000001L));
        java.lang.String str23 = dateTimeZone1.getShortName(0L);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, readableInstant25);
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology26.getZone();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology26.dayOfYear();
        org.joda.time.Instant instant30 = gJChronology26.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant32 = instant30.minus(readableDuration31);
        java.lang.String str33 = instant30.toString();
        org.joda.time.Instant instant35 = instant30.minus((long) 36000000);
        boolean boolean37 = instant30.isAfter((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone39);
        org.joda.time.chrono.JulianChronology julianChronology41 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone39);
        org.joda.time.DurationField durationField42 = julianChronology41.centuries();
        org.joda.time.DurationField durationField43 = julianChronology41.weeks();
        org.joda.time.DurationField durationField44 = julianChronology41.days();
        org.joda.time.DurationField durationField45 = julianChronology41.centuries();
        org.joda.time.DateTimeField dateTimeField46 = julianChronology41.hourOfHalfday();
        org.joda.time.Chronology chronology47 = julianChronology41.withUTC();
        org.joda.time.DateTimeField dateTimeField48 = julianChronology41.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField49 = julianChronology41.minuteOfDay();
        boolean boolean50 = instant30.equals((java.lang.Object) dateTimeField49);
        org.joda.time.DateTimeZone dateTimeZone51 = instant30.getZone();
        boolean boolean53 = dateTimeZone51.isStandardOffset((long) 97);
        long long55 = dateTimeZone1.getMillisKeepLocal(dateTimeZone51, (-59082465599991L));
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.chrono.GJChronology gJChronology58 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone56, readableInstant57);
        org.joda.time.Chronology chronology59 = gJChronology58.withUTC();
        org.joda.time.DurationField durationField60 = gJChronology58.millis();
        long long64 = gJChronology58.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField65 = gJChronology58.millis();
        org.joda.time.DateTimeField dateTimeField66 = gJChronology58.hourOfHalfday();
        org.joda.time.Instant instant67 = gJChronology58.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField68 = gJChronology58.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone69 = gJChronology58.getZone();
        java.lang.String str71 = dateTimeZone69.getName((-179999601L));
        boolean boolean72 = dateTimeZone1.equals((java.lang.Object) str71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField60", (durationField13.compareTo(durationField60) == 0) == durationField13.equals(durationField60));
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3535");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.dayOfYear();
        org.joda.time.Instant instant14 = gJChronology10.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime17 = instant14.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = instant14.toDateTime();
        java.util.Date date19 = instant14.toDate();
        boolean boolean20 = gJChronology2.equals((java.lang.Object) instant14);
        org.joda.time.Instant instant23 = instant14.withDurationAdded((-62159565599948L), (int) (byte) 100);
        org.joda.time.Chronology chronology24 = instant23.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime17", (instant14.compareTo(mutableDateTime17) == 0) == instant14.equals(mutableDateTime17));
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3536");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13);
        boolean boolean17 = julianChronology15.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField18 = julianChronology15.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology15.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = julianChronology15.weeks();
        org.joda.time.DateTimeZone dateTimeZone21 = julianChronology15.getZone();
        org.joda.time.DurationField durationField22 = julianChronology15.hours();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology25 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = julianChronology25.minuteOfDay();
        org.joda.time.DurationField durationField27 = julianChronology25.weekyears();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str30 = dateTimeZone29.getID();
        boolean boolean31 = dateTimeZone29.isFixed();
        long long33 = dateTimeZone29.previousTransition(100L);
        java.util.TimeZone timeZone34 = dateTimeZone29.toTimeZone();
        long long36 = dateTimeZone29.previousTransition(5201L);
        org.joda.time.Chronology chronology37 = julianChronology25.withZone(dateTimeZone29);
        java.lang.String str39 = dateTimeZone29.getName(3600000L);
        boolean boolean40 = julianChronology15.equals((java.lang.Object) dateTimeZone29);
        org.joda.time.Chronology chronology41 = gJChronology2.withZone(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField22", (durationField6.compareTo(durationField22) == 0) == durationField6.equals(durationField22));
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3537");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        int int10 = dateTimeZone7.getOffsetFromLocal((long) ' ');
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology12 = gJChronology2.withZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.dayOfYear();
        org.joda.time.Instant instant19 = gJChronology15.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.minus(readableDuration20);
        org.joda.time.Instant instant24 = instant21.withDurationAdded((-12219292800000L), 0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology27.getZone();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology27.getZone();
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, (org.joda.time.ReadableInstant) instant33);
        java.lang.String str35 = instant33.toString();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36, readableInstant37);
        org.joda.time.Chronology chronology39 = gJChronology38.withUTC();
        java.lang.String str40 = gJChronology38.toString();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology38.monthOfYear();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology38.millisOfDay();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology38.dayOfWeek();
        org.joda.time.Instant instant44 = gJChronology38.getGregorianCutover();
        boolean boolean45 = instant33.equals((java.lang.Object) gJChronology38);
        boolean boolean46 = instant24.isAfter((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Instant instant48 = instant33.minus((-61543965598418L));
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant48);
        org.joda.time.DateTimeField dateTimeField50 = gJChronology49.dayOfMonth();
        org.joda.time.DurationField durationField51 = gJChronology49.minutes();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52, readableInstant53);
        org.joda.time.Chronology chronology55 = gJChronology54.withUTC();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology54.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology54.millisOfDay();
        org.joda.time.DurationField durationField58 = gJChronology54.halfdays();
        org.joda.time.DurationField durationField59 = gJChronology54.millis();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology62 = gJChronology54.withZone(dateTimeZone61);
        org.joda.time.DurationField durationField63 = gJChronology54.minutes();
        org.joda.time.DateTimeField dateTimeField64 = gJChronology54.halfdayOfDay();
        org.joda.time.DurationField durationField65 = gJChronology54.centuries();
        org.joda.time.DurationField durationField66 = gJChronology54.days();
        org.joda.time.DurationField durationField67 = gJChronology54.weeks();
        org.joda.time.DateTimeField dateTimeField68 = gJChronology54.monthOfYear();
        org.joda.time.DurationField durationField69 = gJChronology54.halfdays();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology54.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours(9);
        org.joda.time.LocalDateTime localDateTime73 = null;
        boolean boolean74 = dateTimeZone72.isLocalDateTimeGap(localDateTime73);
        org.joda.time.Chronology chronology75 = gJChronology54.withZone(dateTimeZone72);
        org.joda.time.DateTimeField dateTimeField76 = gJChronology54.secondOfMinute();
        org.joda.time.DurationField durationField77 = gJChronology54.millis();
        org.joda.time.DurationField durationField78 = gJChronology54.months();
        org.joda.time.DateTimeZone dateTimeZone79 = gJChronology54.getZone();
        boolean boolean80 = gJChronology49.equals((java.lang.Object) dateTimeZone79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField51 and durationField63", (durationField51.compareTo(durationField63) == 0) == durationField51.equals(durationField63));
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3538");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        java.util.Date date5 = instant1.toDate();
        org.joda.time.Instant instant7 = instant1.plus((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = instant7.isSupported(dateTimeFieldType8);
        org.joda.time.Instant instant11 = instant7.withMillis((-60514215257464L));
        boolean boolean13 = instant7.isAfter((-179999601L));
        org.joda.time.Instant instant15 = instant7.plus((-71999991L));
        org.joda.time.DateTime dateTime16 = instant15.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology19.getZone();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology19.getZone();
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant25);
        java.lang.String str27 = instant25.toString();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29);
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology30.getZone();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology30.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology30.dayOfYear();
        org.joda.time.Instant instant34 = gJChronology30.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant34.minus(readableDuration35);
        org.joda.time.Instant instant39 = instant36.withDurationAdded((-12219292800000L), 0);
        int int40 = instant25.compareTo((org.joda.time.ReadableInstant) instant36);
        boolean boolean42 = instant25.isBefore((long) 'a');
        org.joda.time.Instant instant43 = instant25.toInstant();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone44, readableInstant45);
        org.joda.time.DateTimeZone dateTimeZone47 = gJChronology46.getZone();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology46.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology46.dayOfYear();
        org.joda.time.Instant instant50 = gJChronology46.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Instant instant52 = instant50.minus(readableDuration51);
        org.joda.time.Instant instant55 = instant52.withDurationAdded((-12219292800000L), 0);
        boolean boolean57 = instant52.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone58, readableInstant59);
        org.joda.time.Chronology chronology61 = gJChronology60.withUTC();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology60.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField63 = gJChronology60.millisOfDay();
        org.joda.time.DateTimeField dateTimeField64 = gJChronology60.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField65 = gJChronology60.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField66 = gJChronology60.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField67 = gJChronology60.monthOfYear();
        boolean boolean68 = instant52.equals((java.lang.Object) dateTimeField67);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.chrono.GJChronology gJChronology71 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone69, readableInstant70);
        org.joda.time.DateTimeZone dateTimeZone72 = gJChronology71.getZone();
        org.joda.time.DateTimeField dateTimeField73 = gJChronology71.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField74 = gJChronology71.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone75 = gJChronology71.getZone();
        org.joda.time.Instant instant77 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology78 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone75, (org.joda.time.ReadableInstant) instant77);
        java.lang.String str79 = instant77.toString();
        boolean boolean80 = instant77.isEqualNow();
        boolean boolean81 = instant52.isEqual((org.joda.time.ReadableInstant) instant77);
        org.joda.time.Instant instant83 = instant77.withMillis((long) 36000000);
        boolean boolean84 = instant25.isAfter((org.joda.time.ReadableInstant) instant83);
        boolean boolean85 = dateTime16.isAfter((org.joda.time.ReadableInstant) instant25);
        org.joda.time.DateTimeZone dateTimeZone86 = instant25.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime16", (instant15.compareTo(dateTime16) == 0) == instant15.equals(dateTime16));
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3539");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.millisOfDay();
        org.joda.time.Instant instant6 = gJChronology0.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) ' ');
        long long11 = dateTimeZone9.convertUTCToLocal(17125340659610592L);
        org.joda.time.MutableDateTime mutableDateTime12 = instant6.toMutableDateTime(dateTimeZone9);
        int int14 = dateTimeZone9.getOffset(118860000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime12", (instant6.compareTo(mutableDateTime12) == 0) == instant6.equals(mutableDateTime12));
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        int int9 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.halfdayOfDay();
        org.joda.time.Chronology chronology13 = gJChronology2.withUTC();
        org.joda.time.Chronology chronology14 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField15 = gJChronology2.eras();
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology2.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField15", Math.signum(durationField10.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField10)));
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3541");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6);
        org.joda.time.Chronology chronology8 = gJChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology7.dayOfWeek();
        org.joda.time.Chronology chronology10 = gJChronology7.withUTC();
        org.joda.time.DurationField durationField11 = gJChronology7.halfdays();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology7.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14);
        org.joda.time.Chronology chronology16 = gJChronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.dayOfWeek();
        org.joda.time.Chronology chronology18 = gJChronology15.withUTC();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.Chronology chronology21 = chronology18.withZone(dateTimeZone20);
        java.lang.String str22 = dateTimeZone20.getID();
        org.joda.time.Chronology chronology23 = gJChronology7.withZone(dateTimeZone20);
        long long25 = dateTimeZone20.convertUTCToLocal((-107999990L));
        org.joda.time.Chronology chronology26 = julianChronology2.withZone(dateTimeZone20);
        org.joda.time.DurationField durationField27 = julianChronology2.eras();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.chrono.JulianChronology julianChronology31 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone29);
        boolean boolean33 = julianChronology31.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology34 = julianChronology31.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = julianChronology31.era();
        org.joda.time.DateTimeField dateTimeField36 = julianChronology31.minuteOfHour();
        org.joda.time.DurationField durationField37 = julianChronology31.weeks();
        org.joda.time.DateTimeField dateTimeField38 = julianChronology31.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone39 = julianChronology31.getZone();
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        org.joda.time.Chronology chronology41 = julianChronology2.withZone(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField27", Math.signum(durationField11.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField11)));
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3542");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant9);
        java.lang.String str11 = instant9.toString();
        int int12 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((java.lang.Object) instant9);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology16.getZone();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.dayOfYear();
        org.joda.time.Instant instant20 = gJChronology16.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime23 = instant20.toMutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = instant20.toDateTime();
        java.util.Date date25 = instant20.toDate();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26, readableInstant27);
        org.joda.time.Chronology chronology29 = gJChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology28.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology28.millisOfDay();
        org.joda.time.DurationField durationField32 = gJChronology28.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology28.secondOfMinute();
        int int34 = instant20.get(dateTimeField33);
        org.joda.time.Chronology chronology35 = instant20.getChronology();
        boolean boolean36 = instant9.isAfter((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology37 = instant9.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime23", (instant20.compareTo(mutableDateTime23) == 0) == instant20.equals(mutableDateTime23));
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3543");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField5 = gJChronology2.months();
        org.joda.time.DurationField durationField6 = gJChronology2.weeks();
        org.joda.time.Instant instant7 = gJChronology2.getGregorianCutover();
        long long8 = instant7.getMillis();
        java.lang.String str9 = instant7.toString();
        org.joda.time.MutableDateTime mutableDateTime10 = instant7.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        java.lang.String str14 = gJChronology13.toString();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology13.minuteOfHour();
        org.joda.time.DurationField durationField18 = gJChronology13.weeks();
        org.joda.time.DurationField durationField19 = gJChronology13.days();
        boolean boolean20 = instant7.equals((java.lang.Object) gJChronology13);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology13.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime10", (instant7.compareTo(mutableDateTime10) == 0) == instant7.equals(mutableDateTime10));
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3544");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        long long8 = instant6.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = instant6.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = julianChronology13.minuteOfDay();
        org.joda.time.DurationField durationField15 = julianChronology13.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str18 = dateTimeZone17.getID();
        boolean boolean19 = dateTimeZone17.isFixed();
        long long21 = dateTimeZone17.previousTransition(100L);
        java.util.TimeZone timeZone22 = dateTimeZone17.toTimeZone();
        long long24 = dateTimeZone17.previousTransition(5201L);
        org.joda.time.Chronology chronology25 = julianChronology13.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField26 = julianChronology13.year();
        int int27 = instant6.get(dateTimeField26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant29 = instant6.minus(readableDuration28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant32 = instant29.withDurationAdded(readableDuration30, 660);
        org.joda.time.ReadableInstant readableInstant33 = null;
        boolean boolean34 = instant29.isBefore(readableInstant33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        boolean boolean36 = instant29.isSupported(dateTimeFieldType35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, readableInstant38);
        java.lang.String str40 = gJChronology39.toString();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology39.dayOfYear();
        java.lang.String str42 = gJChronology39.toString();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology39.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology39.monthOfYear();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology39.weekOfWeekyear();
        java.lang.String str46 = gJChronology39.toString();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology39.dayOfWeek();
        org.joda.time.DurationField durationField48 = gJChronology39.minutes();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology39.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology39.secondOfDay();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology39.era();
        org.joda.time.MutableDateTime mutableDateTime52 = instant29.toMutableDateTime((org.joda.time.Chronology) gJChronology39);
        org.joda.time.DurationField durationField53 = gJChronology39.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime52", (instant6.compareTo(mutableDateTime52) == 0) == instant6.equals(mutableDateTime52));
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3545");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        java.lang.String str12 = dateTimeZone5.toString();
        java.lang.String str13 = dateTimeZone5.toString();
        long long16 = dateTimeZone5.convertLocalToUTC((long) 1582, false);
        long long19 = dateTimeZone5.adjustOffset(18599999L, true);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20, readableInstant21);
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology22.getZone();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology22.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology22.dayOfYear();
        org.joda.time.Instant instant26 = gJChronology22.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.minus(readableDuration27);
        boolean boolean29 = instant28.isAfterNow();
        boolean boolean30 = instant28.isAfterNow();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant33 = instant28.withDurationAdded(readableDuration31, 20);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone35);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone35.getName((-1L), locale38);
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone35.isLocalDateTimeGap(localDateTime40);
        long long44 = dateTimeZone35.adjustOffset((long) (byte) -1, true);
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35, 36000001L, 1);
        int int49 = dateTimeZone35.getOffsetFromLocal(36000010L);
        org.joda.time.chrono.JulianChronology julianChronology50 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone35);
        java.util.Locale locale52 = null;
        java.lang.String str53 = dateTimeZone35.getName((-12242519999904L), locale52);
        org.joda.time.MutableDateTime mutableDateTime54 = instant33.toMutableDateTime(dateTimeZone35);
        int int55 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) instant33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant33 and mutableDateTime54", (instant33.compareTo(mutableDateTime54) == 0) == instant33.equals(mutableDateTime54));
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3546");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant9);
        java.lang.String str11 = instant9.toString();
        int int12 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((java.lang.Object) instant9);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology16.getZone();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = gJChronology16.weeks();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.halfdayOfDay();
        boolean boolean22 = instant13.equals((java.lang.Object) gJChronology16);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) 'a');
        boolean boolean25 = instant13.isAfter((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Instant instant27 = new org.joda.time.Instant(1L);
        org.joda.time.DateTimeZone dateTimeZone28 = instant27.getZone();
        boolean boolean29 = instant24.equals((java.lang.Object) instant27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        boolean boolean33 = dateTimeZone31.isFixed();
        long long36 = dateTimeZone31.convertLocalToUTC((-35999990L), true);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone31.getName((long) (short) -1, locale39);
        boolean boolean41 = dateTimeZone31.isFixed();
        long long43 = dateTimeZone31.nextTransition(36009730L);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology46 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = julianChronology46.secondOfMinute();
        org.joda.time.DurationField durationField48 = julianChronology46.centuries();
        org.joda.time.DateTimeField dateTimeField49 = julianChronology46.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone51);
        org.joda.time.chrono.JulianChronology julianChronology53 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone51);
        boolean boolean55 = julianChronology53.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology56 = julianChronology53.withUTC();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology58 = julianChronology53.withZone(dateTimeZone57);
        org.joda.time.DurationField durationField59 = julianChronology53.days();
        org.joda.time.DateTimeField dateTimeField60 = julianChronology53.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone61 = julianChronology53.getZone();
        org.joda.time.DurationField durationField62 = julianChronology53.days();
        org.joda.time.DateTimeField dateTimeField63 = julianChronology53.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone64 = julianChronology53.getZone();
        org.joda.time.Chronology chronology65 = julianChronology46.withZone(dateTimeZone64);
        java.lang.String str67 = dateTimeZone64.getShortName((-12219292800000L));
        long long69 = dateTimeZone31.getMillisKeepLocal(dateTimeZone64, (-60514336721000L));
        org.joda.time.DateTime dateTime70 = instant27.toDateTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone72);
        org.joda.time.chrono.JulianChronology julianChronology74 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone72);
        org.joda.time.DurationField durationField75 = julianChronology74.centuries();
        java.lang.String str76 = julianChronology74.toString();
        org.joda.time.DateTimeZone dateTimeZone77 = julianChronology74.getZone();
        long long79 = dateTimeZone31.getMillisKeepLocal(dateTimeZone77, 60514215171927L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and dateTime70", (instant27.compareTo(dateTime70) == 0) == instant27.equals(dateTime70));
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        long long12 = dateTimeZone5.convertLocalToUTC((-35999900L), false);
        int int14 = dateTimeZone5.getOffsetFromLocal((long) 278);
        boolean boolean16 = dateTimeZone5.isStandardOffset((long) 1582);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology19.getZone();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.dayOfYear();
        org.joda.time.Instant instant23 = gJChronology19.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant23.minus(readableDuration24);
        org.joda.time.Instant instant28 = instant25.withDurationAdded((-12219292800000L), 0);
        boolean boolean30 = instant25.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, readableInstant32);
        org.joda.time.Chronology chronology34 = gJChronology33.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology33.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology33.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology33.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology33.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology33.monthOfYear();
        boolean boolean41 = instant25.equals((java.lang.Object) dateTimeField40);
        org.joda.time.Instant instant43 = instant25.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = null;
        boolean boolean45 = instant43.isSupported(dateTimeFieldType44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        boolean boolean47 = instant43.isSupported(dateTimeFieldType46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = instant43.toString(dateTimeFormatter48);
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, (org.joda.time.ReadableInstant) instant43);
        org.joda.time.Instant instant53 = instant43.withDurationAdded((long) 0, (int) 'a');
        org.joda.time.Chronology chronology54 = instant53.getChronology();
        org.joda.time.Instant instant55 = instant53.toInstant();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.chrono.GJChronology gJChronology58 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone56, readableInstant57);
        java.lang.String str59 = gJChronology58.toString();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology58.dayOfYear();
        java.lang.String str61 = gJChronology58.toString();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology58.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField63 = gJChronology58.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone64 = gJChronology58.getZone();
        org.joda.time.Chronology chronology65 = gJChronology58.withUTC();
        org.joda.time.Chronology chronology66 = gJChronology58.withUTC();
        boolean boolean67 = instant55.equals((java.lang.Object) gJChronology58);
        boolean boolean69 = instant55.isAfter((-35954890L));
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.chrono.GJChronology gJChronology72 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone70, readableInstant71);
        org.joda.time.DateTimeZone dateTimeZone73 = gJChronology72.getZone();
        org.joda.time.DateTimeField dateTimeField74 = gJChronology72.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField75 = gJChronology72.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone76 = gJChronology72.getZone();
        org.joda.time.Instant instant78 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology79 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone76, (org.joda.time.ReadableInstant) instant78);
        org.joda.time.DateTime dateTime80 = instant78.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone81 = dateTime80.getZone();
        boolean boolean82 = dateTime80.isEqualNow();
        org.joda.time.chrono.GJChronology gJChronology83 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField84 = gJChronology83.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField85 = gJChronology83.era();
        org.joda.time.DateTime dateTime86 = dateTime80.toDateTime((org.joda.time.Chronology) gJChronology83);
        int int87 = instant55.compareTo((org.joda.time.ReadableInstant) dateTime80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant78 and dateTime86", (instant78.compareTo(dateTime86) == 0) == instant78.equals(dateTime86));
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3548");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = instant6.toDateTime();
        java.util.Date date11 = instant6.toDate();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology14.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Chronology chronology19 = gJChronology14.withZone(dateTimeZone17);
        java.lang.String str21 = dateTimeZone17.getName((long) (byte) 10);
        java.util.TimeZone timeZone22 = dateTimeZone17.toTimeZone();
        long long26 = dateTimeZone17.convertLocalToUTC((long) 10, false, (long) (byte) 10);
        boolean boolean27 = instant6.equals((java.lang.Object) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime28 = instant6.toMutableDateTimeISO();
        long long29 = instant6.getMillis();
        org.joda.time.Instant instant31 = instant6.minus((-35039992L));
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35, readableInstant36);
        org.joda.time.DateTimeZone dateTimeZone38 = gJChronology37.getZone();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.dayOfYear();
        org.joda.time.Instant instant41 = gJChronology37.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Instant instant43 = instant41.minus(readableDuration42);
        org.joda.time.Instant instant46 = instant43.withDurationAdded((-12219292800000L), 0);
        boolean boolean48 = instant43.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.chrono.GJChronology gJChronology51 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone49, readableInstant50);
        org.joda.time.Chronology chronology52 = gJChronology51.withUTC();
        org.joda.time.DateTimeField dateTimeField53 = gJChronology51.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology51.millisOfDay();
        org.joda.time.DateTimeField dateTimeField55 = gJChronology51.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology51.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology51.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology51.monthOfYear();
        boolean boolean59 = instant43.equals((java.lang.Object) dateTimeField58);
        org.joda.time.Instant instant61 = instant43.withMillis(1L);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone63);
        org.joda.time.chrono.JulianChronology julianChronology65 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone63);
        boolean boolean67 = julianChronology65.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField68 = julianChronology65.days();
        org.joda.time.DateTimeField dateTimeField69 = julianChronology65.yearOfEra();
        org.joda.time.DateTimeField dateTimeField70 = julianChronology65.year();
        java.lang.String str71 = julianChronology65.toString();
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.chrono.GJChronology gJChronology74 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone72, readableInstant73);
        org.joda.time.DateTimeZone dateTimeZone75 = gJChronology74.getZone();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str78 = dateTimeZone77.getID();
        org.joda.time.Chronology chronology79 = gJChronology74.withZone(dateTimeZone77);
        long long82 = dateTimeZone77.convertLocalToUTC((long) (short) 10, false);
        java.util.TimeZone timeZone83 = dateTimeZone77.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone77);
        org.joda.time.Chronology chronology85 = julianChronology65.withZone(dateTimeZone77);
        int int87 = dateTimeZone77.getOffset((long) 1);
        org.joda.time.MutableDateTime mutableDateTime88 = instant43.toMutableDateTime(dateTimeZone77);
        int int89 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) mutableDateTime88);
        boolean boolean90 = instant6.equals((java.lang.Object) int89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant6", (mutableDateTime9.compareTo(instant6) == 0) == mutableDateTime9.equals(instant6));
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3549");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant3.withMillis((long) (byte) -1);
        org.joda.time.Instant instant7 = instant5.plus((long) (short) 0);
        java.lang.String str8 = instant7.toString();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant7.plus(readableDuration9);
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime11.toMutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology16.getZone();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology16.getZone();
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20, (org.joda.time.ReadableInstant) instant22);
        java.lang.String str24 = instant22.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology27.getZone();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology27.dayOfYear();
        org.joda.time.Instant instant31 = gJChronology27.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant31.minus(readableDuration32);
        org.joda.time.Instant instant36 = instant33.withDurationAdded((-12219292800000L), 0);
        int int37 = instant22.compareTo((org.joda.time.ReadableInstant) instant33);
        long long38 = instant22.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = instant22.isSupported(dateTimeFieldType39);
        boolean boolean42 = instant22.isEqual((-593285831998337L));
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant45 = instant22.withDurationAdded(readableDuration43, (int) (short) 100);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Instant instant47 = instant45.plus(readableDuration46);
        boolean boolean48 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) instant47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime11", (instant5.compareTo(mutableDateTime11) == 0) == instant5.equals(mutableDateTime11));
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3550");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, readableInstant25);
        org.joda.time.Chronology chronology27 = gJChronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.dayOfWeek();
        org.joda.time.DurationField durationField29 = gJChronology26.years();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology26.weekyear();
        boolean boolean31 = instant8.equals((java.lang.Object) dateTimeField30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, readableInstant33);
        org.joda.time.DateTimeZone dateTimeZone35 = gJChronology34.getZone();
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone35.getName((long) 36000000, locale37);
        int int40 = dateTimeZone35.getOffset((long) ' ');
        long long44 = dateTimeZone35.convertLocalToUTC(110L, true, 110L);
        org.joda.time.DateTime dateTime45 = instant8.toDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = dateTimeZone35.isLocalDateTimeGap(localDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime45", (instant8.compareTo(dateTime45) == 0) == instant8.equals(dateTime45));
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3551");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.clockhourOfHalfday();
        org.joda.time.Chronology chronology11 = gJChronology9.withUTC();
        org.joda.time.Instant instant12 = gJChronology9.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.minus(readableDuration13);
        org.joda.time.Instant instant16 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant18 = instant16.plus(readableDuration17);
        org.joda.time.Instant instant20 = instant18.withMillis((long) (byte) -1);
        boolean boolean21 = instant20.isEqualNow();
        org.joda.time.Instant instant23 = instant20.plus(31799999L);
        boolean boolean24 = instant23.isAfterNow();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant26 = instant23.minus(readableDuration25);
        boolean boolean27 = instant12.isEqual((org.joda.time.ReadableInstant) instant26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29);
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology30.getZone();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology30.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology30.dayOfYear();
        org.joda.time.Instant instant34 = gJChronology30.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant34.minus(readableDuration35);
        org.joda.time.Instant instant39 = instant36.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Instant instant41 = instant36.plus(readableDuration40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        boolean boolean43 = instant36.isEqual(readableInstant42);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str46 = dateTimeZone45.getID();
        java.lang.String str48 = dateTimeZone45.getName((long) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime49 = instant36.toMutableDateTime(dateTimeZone45);
        boolean boolean50 = instant12.isEqual((org.joda.time.ReadableInstant) instant36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant36 and mutableDateTime49", (instant36.compareTo(mutableDateTime49) == 0) == instant36.equals(mutableDateTime49));
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3552");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        boolean boolean6 = instant4.isEqual((long) 1);
        org.joda.time.DateTime dateTime7 = instant4.toDateTimeISO();
        boolean boolean8 = dateTime7.isAfterNow();
        boolean boolean9 = dateTime7.isAfterNow();
        org.joda.time.ReadableInstant readableInstant10 = null;
        boolean boolean11 = dateTime7.isBefore(readableInstant10);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((-60514287291895L));
        int int14 = dateTime7.compareTo((org.joda.time.ReadableInstant) instant13);
        long long15 = instant13.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime7", (instant1.compareTo(dateTime7) == 0) == instant1.equals(dateTime7));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3553");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970-01-01T09:59:59.999+10:00");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3);
        org.joda.time.Chronology chronology5 = gJChronology4.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.millisOfDay();
        java.lang.String str8 = gJChronology4.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology4.year();
        org.joda.time.DurationField durationField10 = gJChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology4.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology4.getZone();
        boolean boolean13 = instant1.equals((java.lang.Object) dateTimeZone12);
        boolean boolean15 = instant1.isEqual((-35999968L));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, readableInstant17);
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology18.getZone();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = gJChronology18.weeks();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology18.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology18.getZone();
        int int26 = dateTimeZone24.getStandardOffset((long) (byte) 0);
        java.lang.String str28 = dateTimeZone24.getShortName((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology31 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, readableInstant33);
        org.joda.time.DateTimeZone dateTimeZone35 = gJChronology34.getZone();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology34.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology34.dayOfYear();
        org.joda.time.Instant instant38 = gJChronology34.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Instant instant40 = instant38.minus(readableDuration39);
        org.joda.time.Instant instant43 = instant40.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Instant instant45 = instant40.plus(readableDuration44);
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, (org.joda.time.ReadableInstant) instant45);
        int int48 = dateTimeZone30.getOffset(151200000L);
        long long52 = dateTimeZone30.convertLocalToUTC(36000001L, false, (-62112218399999L));
        long long54 = dateTimeZone24.getMillisKeepLocal(dateTimeZone30, 4L);
        java.lang.String str55 = dateTimeZone30.toString();
        java.util.TimeZone timeZone56 = dateTimeZone30.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime57 = instant1.toMutableDateTime(dateTimeZone30);
        long long59 = dateTimeZone30.previousTransition(1644572759771L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime57", (instant1.compareTo(mutableDateTime57) == 0) == instant1.equals(mutableDateTime57));
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3554");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant8.plus(readableDuration12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        boolean boolean15 = instant8.isEqual(readableInstant14);
        org.joda.time.DateTime dateTime16 = instant8.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone17 = instant8.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime16", (instant8.compareTo(dateTime16) == 0) == instant8.equals(dateTime16));
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3555");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        long long24 = instant8.getMillis();
        org.joda.time.Instant instant27 = instant8.withDurationAdded((long) '#', 278);
        org.joda.time.Instant instant30 = instant27.withDurationAdded((long) 4, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str33 = dateTimeZone32.getID();
        boolean boolean34 = dateTimeZone32.isFixed();
        int int36 = dateTimeZone32.getOffsetFromLocal((-12219292800000L));
        org.joda.time.DateTime dateTime37 = instant27.toDateTime(dateTimeZone32);
        org.joda.time.Instant instant39 = instant27.plus((long) 1200);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        boolean boolean41 = instant27.isSupported(dateTimeFieldType40);
        org.joda.time.Instant instant43 = instant27.withMillis((-12219480000349L));
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Instant instant45 = instant43.minus(readableDuration44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and dateTime37", (instant27.compareTo(dateTime37) == 0) == instant27.equals(dateTime37));
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3556");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        long long24 = instant8.getMillis();
        org.joda.time.Instant instant25 = instant8.toInstant();
        org.joda.time.Chronology chronology26 = instant8.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.weekyears();
        org.joda.time.DurationField durationField29 = chronology26.years();
        org.joda.time.DurationField durationField30 = chronology26.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField28 and durationField29", (durationField28.compareTo(durationField29) == 0) == durationField28.equals(durationField29));
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3557");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology2.minutes();
        int int7 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology11.getZone();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.dayOfYear();
        org.joda.time.Instant instant15 = gJChronology11.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant15.minus(readableDuration16);
        org.joda.time.Instant instant20 = instant17.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant17.plus(readableDuration21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        boolean boolean24 = instant17.isEqual(readableInstant23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str27 = dateTimeZone26.getID();
        java.lang.String str29 = dateTimeZone26.getName((long) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime30 = instant17.toMutableDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology31 = gJChronology2.withZone(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime30", (instant15.compareTo(mutableDateTime30) == 0) == instant15.equals(mutableDateTime30));
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3558");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1582-10-15T00:00:00.035Z");
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4);
        java.lang.String str6 = gJChronology5.toString();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.dayOfYear();
        java.lang.String str8 = gJChronology5.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology5.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology5.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology5.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology5.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = instant1.toMutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = instant1.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = mutableDateTime17.isSupported(dateTimeFieldType18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3559");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.minuteOfDay();
        org.joda.time.Instant instant12 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant14 = instant12.minus(0L);
        org.joda.time.Instant instant15 = instant12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20);
        org.joda.time.DateTimeZone dateTimeZone22 = gJChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology21.dayOfYear();
        org.joda.time.Instant instant25 = gJChronology21.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant27 = instant25.minus(readableDuration26);
        org.joda.time.Instant instant30 = instant27.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant32 = instant27.plus(readableDuration31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, (org.joda.time.ReadableInstant) instant32);
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime35 = instant34.toMutableDateTimeISO();
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, (org.joda.time.ReadableInstant) instant34);
        org.joda.time.DateTimeZone dateTimeZone37 = instant34.getZone();
        boolean boolean38 = instant12.isEqual((org.joda.time.ReadableInstant) instant34);
        long long39 = instant12.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant34 and mutableDateTime35", (instant34.compareTo(mutableDateTime35) == 0) == instant34.equals(mutableDateTime35));
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3560");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        int int10 = dateTimeZone7.getOffsetFromLocal((long) ' ');
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology12 = gJChronology2.withZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.dayOfYear();
        org.joda.time.Instant instant19 = gJChronology15.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.minus(readableDuration20);
        org.joda.time.Instant instant24 = instant21.withDurationAdded((-12219292800000L), 0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology27.getZone();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology27.getZone();
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, (org.joda.time.ReadableInstant) instant33);
        java.lang.String str35 = instant33.toString();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36, readableInstant37);
        org.joda.time.Chronology chronology39 = gJChronology38.withUTC();
        java.lang.String str40 = gJChronology38.toString();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology38.monthOfYear();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology38.millisOfDay();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology38.dayOfWeek();
        org.joda.time.Instant instant44 = gJChronology38.getGregorianCutover();
        boolean boolean45 = instant33.equals((java.lang.Object) gJChronology38);
        boolean boolean46 = instant24.isAfter((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Instant instant48 = instant33.minus((-61543965598418L));
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant48);
        boolean boolean50 = instant48.isEqualNow();
        boolean boolean52 = instant48.isAfter((long) 3600000);
        org.joda.time.Instant instant55 = instant48.withDurationAdded((long) 5, (int) (short) -1);
        org.joda.time.DateTime dateTime56 = instant55.toDateTime();
        org.joda.time.Instant instant58 = org.joda.time.Instant.parse("1970-01-01T00:00:00.001Z");
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Instant instant61 = instant58.withDurationAdded(readableDuration59, 10);
        java.util.Date date62 = instant61.toDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = null;
        java.lang.String str64 = instant61.toString(dateTimeFormatter63);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = null;
        boolean boolean66 = instant61.isSupported(dateTimeFieldType65);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = null;
        boolean boolean68 = instant61.isSupported(dateTimeFieldType67);
        int int69 = dateTime56.compareTo((org.joda.time.ReadableInstant) instant61);
        org.joda.time.Instant instant70 = instant61.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant55 and dateTime56", (instant55.compareTo(dateTime56) == 0) == instant55.equals(dateTime56));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.seconds();
        org.joda.time.Instant instant7 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        boolean boolean13 = julianChronology11.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology14 = julianChronology11.withUTC();
        org.joda.time.DateTimeZone dateTimeZone15 = julianChronology11.getZone();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology11.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology11.dayOfWeek();
        org.joda.time.DurationField durationField19 = julianChronology11.months();
        org.joda.time.DateTime dateTime20 = instant7.toDateTime((org.joda.time.Chronology) julianChronology11);
        org.joda.time.DurationField durationField21 = julianChronology11.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime20", (instant7.compareTo(dateTime20) == 0) == instant7.equals(dateTime20));
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3562");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        java.util.Date date5 = instant1.toDate();
        org.joda.time.Instant instant7 = instant1.plus((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = instant7.isSupported(dateTimeFieldType8);
        org.joda.time.Instant instant11 = instant7.withMillis((-60514215257464L));
        boolean boolean13 = instant7.isAfter((-179999601L));
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology16.getZone();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.dayOfYear();
        org.joda.time.Instant instant20 = gJChronology16.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.minus(readableDuration21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant22.plus(readableDuration23);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.joda.time.DateTimeZone dateTimeZone26 = instant24.getZone();
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = julianChronology27.yearOfEra();
        org.joda.time.DurationField durationField29 = julianChronology27.centuries();
        org.joda.time.DateTime dateTime30 = instant7.toDateTime((org.joda.time.Chronology) julianChronology27);
        org.joda.time.DurationField durationField31 = julianChronology27.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime30", (instant1.compareTo(dateTime30) == 0) == instant1.equals(dateTime30));
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3563");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        java.lang.String str8 = julianChronology3.toString();
        org.joda.time.DurationField durationField9 = julianChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField4, and durationField7", !(durationField9.compareTo(durationField4) == 0) || (Math.signum(durationField9.compareTo(durationField7)) == Math.signum(durationField4.compareTo(durationField7))));
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3564");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology15 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        long long18 = dateTimeZone16.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology19 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology20 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.monthOfYear();
        org.joda.time.DurationField durationField22 = gJChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology2.getZone();
        org.joda.time.DurationField durationField24 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField26 = gJChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.chrono.JulianChronology julianChronology30 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone28);
        org.joda.time.DurationField durationField31 = julianChronology30.centuries();
        java.lang.String str32 = julianChronology30.toString();
        org.joda.time.DateTimeZone dateTimeZone33 = julianChronology30.getZone();
        long long36 = dateTimeZone33.convertLocalToUTC((long) 0, true);
        int int38 = dateTimeZone33.getOffsetFromLocal(0L);
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33);
        org.joda.time.Instant instant41 = org.joda.time.Instant.parse("1582-10-15T00:00:00.035Z");
        org.joda.time.DateTime dateTime42 = instant41.toDateTimeISO();
        org.joda.time.Instant instant45 = instant41.withDurationAdded((long) 353, 36000000);
        org.joda.time.MutableDateTime mutableDateTime46 = instant41.toMutableDateTimeISO();
        org.joda.time.Instant instant48 = instant41.withMillis((long) 5);
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33, (org.joda.time.ReadableInstant) instant41);
        org.joda.time.Chronology chronology50 = gJChronology2.withZone(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant41 and dateTime42", (instant41.compareTo(dateTime42) == 0) == instant41.equals(dateTime42));
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3565");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        java.lang.String str3 = dateTimeZone1.getNameKey((-12219292799965L));
        org.joda.time.Instant instant5 = org.joda.time.Instant.parse("1970-01-01T00:00:00.001Z");
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant8 = instant5.withDurationAdded(readableDuration6, 10);
        java.util.Date date9 = instant8.toDate();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant8.plus(readableDuration11);
        org.joda.time.DateTime dateTime13 = instant8.toDateTime();
        org.joda.time.Instant instant14 = instant8.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime13", (instant14.compareTo(dateTime13) == 0) == instant14.equals(dateTime13));
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3566");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        int int9 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.secondOfMinute();
        org.joda.time.DurationField durationField13 = gJChronology2.eras();
        java.lang.String str14 = gJChronology2.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField13", Math.signum(durationField10.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField10)));
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3567");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, readableInstant25);
        org.joda.time.Chronology chronology27 = gJChronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.dayOfWeek();
        org.joda.time.DurationField durationField29 = gJChronology26.years();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology26.weekyear();
        boolean boolean31 = instant8.equals((java.lang.Object) dateTimeField30);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant36 = instant33.withDurationAdded(readableDuration34, 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = instant33.toString(dateTimeFormatter37);
        org.joda.time.Instant instant41 = instant33.withDurationAdded(0L, 1582);
        long long42 = instant41.getMillis();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant45 = instant41.withDurationAdded(readableDuration43, (int) (short) 100);
        boolean boolean46 = instant8.isAfter((org.joda.time.ReadableInstant) instant41);
        java.lang.String str47 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = instant8.toDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology50 = dateTime49.getChronology();
        org.joda.time.Chronology chronology51 = dateTime49.getChronology();
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Instant instant56 = instant53.withDurationAdded(readableDuration54, 0);
        org.joda.time.DateTime dateTime57 = instant53.toDateTimeISO();
        int int58 = dateTime49.compareTo((org.joda.time.ReadableInstant) instant53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime57", (instant8.compareTo(dateTime57) == 0) == instant8.equals(dateTime57));
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3568");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        org.joda.time.DurationField durationField5 = julianChronology3.weeks();
        org.joda.time.DurationField durationField6 = julianChronology3.days();
        org.joda.time.DurationField durationField7 = julianChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.hourOfHalfday();
        org.joda.time.Chronology chronology9 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.era();
        org.joda.time.DateTimeZone dateTimeZone12 = julianChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, 36000001L, 1);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.millisOfSecond();
        org.joda.time.Chronology chronology17 = gJChronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.minuteOfHour();
        int int19 = gJChronology15.getMinimumDaysInFirstWeek();
        org.joda.time.Instant instant21 = new org.joda.time.Instant((-60514215252321L));
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.chrono.JulianChronology julianChronology25 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField26 = julianChronology25.centuries();
        org.joda.time.DurationField durationField27 = julianChronology25.weeks();
        org.joda.time.DurationField durationField28 = julianChronology25.days();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        long long32 = julianChronology25.add(readablePeriod29, 36000000L, 0);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone34.getShortName((-35999890L), locale36);
        org.joda.time.Chronology chronology38 = julianChronology25.withZone(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        org.joda.time.chrono.JulianChronology julianChronology42 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone40);
        boolean boolean44 = julianChronology42.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology45 = julianChronology42.withUTC();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology47 = julianChronology42.withZone(dateTimeZone46);
        org.joda.time.DurationField durationField48 = julianChronology42.days();
        org.joda.time.DateTimeField dateTimeField49 = julianChronology42.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str52 = dateTimeZone51.getID();
        boolean boolean53 = dateTimeZone51.isFixed();
        long long55 = dateTimeZone51.previousTransition(100L);
        java.util.TimeZone timeZone56 = dateTimeZone51.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        org.joda.time.Chronology chronology58 = julianChronology42.withZone(dateTimeZone57);
        java.util.TimeZone timeZone59 = dateTimeZone57.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone59);
        boolean boolean61 = julianChronology25.equals((java.lang.Object) dateTimeZone60);
        org.joda.time.DateTime dateTime62 = instant21.toDateTime(dateTimeZone60);
        org.joda.time.Chronology chronology63 = gJChronology15.withZone(dateTimeZone60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and dateTime62", (instant21.compareTo(dateTime62) == 0) == instant21.equals(dateTime62));
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3569");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.dayOfYear();
        org.joda.time.Instant instant9 = gJChronology5.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.minus(readableDuration10);
        org.joda.time.Instant instant14 = instant11.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant11.plus(readableDuration15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        boolean boolean19 = instant16.isAfter(readableInstant18);
        org.joda.time.Instant instant21 = instant16.withMillis(35999999L);
        org.joda.time.Instant instant23 = instant21.withMillis((-12219364800000L));
        boolean boolean25 = instant23.isAfter((-35999899L));
        long long26 = instant23.getMillis();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, readableInstant28);
        org.joda.time.DateTimeZone dateTimeZone30 = gJChronology29.getZone();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str33 = dateTimeZone32.getID();
        org.joda.time.Chronology chronology34 = gJChronology29.withZone(dateTimeZone32);
        java.lang.String str36 = dateTimeZone32.getName((long) (byte) 10);
        org.joda.time.chrono.JulianChronology julianChronology37 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField38 = julianChronology37.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = julianChronology37.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40, readableInstant41);
        org.joda.time.DateTimeZone dateTimeZone43 = gJChronology42.getZone();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str46 = dateTimeZone45.getID();
        org.joda.time.Chronology chronology47 = gJChronology42.withZone(dateTimeZone45);
        java.lang.String str49 = dateTimeZone45.getName((long) (byte) 10);
        long long52 = dateTimeZone45.convertLocalToUTC((-35999900L), false);
        int int54 = dateTimeZone45.getOffsetFromLocal((long) 278);
        boolean boolean56 = dateTimeZone45.isStandardOffset((long) 4);
        org.joda.time.Chronology chronology57 = julianChronology37.withZone(dateTimeZone45);
        org.joda.time.DateTime dateTime58 = instant23.toDateTime(dateTimeZone45);
        int int60 = dateTimeZone45.getStandardOffset(1080000077L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant23 and dateTime58", (instant23.compareTo(dateTime58) == 0) == instant23.equals(dateTime58));
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3570");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        long long24 = instant8.getMillis();
        org.joda.time.Instant instant25 = instant8.toInstant();
        org.joda.time.Chronology chronology26 = instant8.getChronology();
        boolean boolean27 = instant8.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29);
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology30.getZone();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology30.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology30.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = instant8.toMutableDateTime((org.joda.time.Chronology) gJChronology30);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35, readableInstant36);
        org.joda.time.DateTimeZone dateTimeZone38 = gJChronology37.getZone();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.dayOfYear();
        org.joda.time.Instant instant41 = gJChronology37.getGregorianCutover();
        java.util.Date date42 = instant41.toDate();
        boolean boolean43 = mutableDateTime34.isAfter((org.joda.time.ReadableInstant) instant41);
        java.util.Date date44 = instant41.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime34", (instant8.compareTo(mutableDateTime34) == 0) == instant8.equals(mutableDateTime34));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3571");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant8.plus(readableDuration12);
        java.util.Date date14 = instant13.toDate();
        org.joda.time.Instant instant16 = instant13.plus(35L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime(dateTimeZone18);
        long long22 = dateTimeZone18.convertLocalToUTC((-35998030L), true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime19", (instant16.compareTo(dateTime19) == 0) == instant16.equals(dateTime19));
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3572");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField8 = gJChronology2.weeks();
        org.joda.time.DurationField durationField9 = gJChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField5, and durationField8", !(durationField9.compareTo(durationField5) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField5.compareTo(durationField8))));
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3573");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.dayOfYear();
        org.joda.time.Instant instant14 = gJChronology10.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant14.minus(readableDuration15);
        org.joda.time.Instant instant19 = instant16.withDurationAdded((-12219292800000L), 0);
        boolean boolean21 = instant16.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, readableInstant23);
        org.joda.time.Chronology chronology25 = gJChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology24.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology24.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology24.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology24.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology24.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology24.monthOfYear();
        boolean boolean32 = instant16.equals((java.lang.Object) dateTimeField31);
        org.joda.time.Instant instant34 = instant16.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        boolean boolean36 = instant34.isSupported(dateTimeFieldType35);
        org.joda.time.Instant instant38 = instant34.withMillis(36000001L);
        boolean boolean40 = instant34.isAfter((long) (-1));
        org.joda.time.Instant instant41 = instant34.toInstant();
        boolean boolean42 = julianChronology3.equals((java.lang.Object) instant41);
        org.joda.time.Instant instant43 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Instant instant45 = instant43.plus(readableDuration44);
        boolean boolean46 = instant43.isBeforeNow();
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Instant instant51 = instant48.withDurationAdded(readableDuration49, 0);
        java.util.Date date52 = instant48.toDate();
        long long53 = instant48.getMillis();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.chrono.GJChronology gJChronology56 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54, readableInstant55);
        org.joda.time.DateTimeZone dateTimeZone57 = gJChronology56.getZone();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology56.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology56.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone60 = gJChronology56.getZone();
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology63 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60, (org.joda.time.ReadableInstant) instant62);
        java.lang.String str64 = instant62.toString();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.chrono.GJChronology gJChronology67 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone65, readableInstant66);
        org.joda.time.DateTimeZone dateTimeZone68 = gJChronology67.getZone();
        org.joda.time.DateTimeField dateTimeField69 = gJChronology67.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology67.dayOfYear();
        org.joda.time.Instant instant71 = gJChronology67.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.Instant instant73 = instant71.minus(readableDuration72);
        org.joda.time.Instant instant76 = instant73.withDurationAdded((-12219292800000L), 0);
        int int77 = instant62.compareTo((org.joda.time.ReadableInstant) instant73);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.chrono.GJChronology gJChronology80 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone78, readableInstant79);
        org.joda.time.Chronology chronology81 = gJChronology80.withUTC();
        org.joda.time.DateTimeField dateTimeField82 = gJChronology80.dayOfWeek();
        org.joda.time.DurationField durationField83 = gJChronology80.years();
        org.joda.time.DateTimeField dateTimeField84 = gJChronology80.weekyear();
        boolean boolean85 = instant62.equals((java.lang.Object) dateTimeField84);
        org.joda.time.Instant instant87 = instant62.withMillis(32L);
        boolean boolean88 = instant48.isEqual((org.joda.time.ReadableInstant) instant87);
        boolean boolean89 = instant43.equals((java.lang.Object) instant48);
        org.joda.time.ReadableDuration readableDuration90 = null;
        org.joda.time.Instant instant92 = instant48.withDurationAdded(readableDuration90, 1);
        org.joda.time.DateTimeZone dateTimeZone93 = instant48.getZone();
        org.joda.time.MutableDateTime mutableDateTime94 = instant48.toMutableDateTimeISO();
        boolean boolean95 = instant41.isBefore((org.joda.time.ReadableInstant) instant48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant48 and mutableDateTime94", (instant48.compareTo(mutableDateTime94) == 0) == instant48.equals(mutableDateTime94));
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3574");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.centuryOfEra();
        org.joda.time.DurationField durationField10 = julianChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology13.getZone();
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, (org.joda.time.ReadableInstant) instant19);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.clockhourOfHalfday();
        org.joda.time.Chronology chronology22 = gJChronology20.withUTC();
        org.joda.time.Instant instant23 = gJChronology20.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant23.minus(readableDuration24);
        boolean boolean26 = julianChronology3.equals((java.lang.Object) instant23);
        org.joda.time.Instant instant28 = instant23.minus((-435599901L));
        boolean boolean29 = instant28.isBeforeNow();
        java.lang.String str30 = instant28.toString();
        org.joda.time.Chronology chronology31 = instant28.getChronology();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant28.minus(readableDuration32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant36 = instant33.withDurationAdded(readableDuration34, 1);
        org.joda.time.DateTime dateTime37 = instant36.toDateTimeISO();
        org.joda.time.Chronology chronology38 = instant36.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant36 and dateTime37", (instant36.compareTo(dateTime37) == 0) == instant36.equals(dateTime37));
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3575");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = instant6.toDateTime();
        java.util.Date date11 = instant6.toDate();
        boolean boolean12 = instant6.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime13 = instant6.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        java.lang.String str17 = gJChronology16.toString();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.dayOfYear();
        int int19 = instant6.get(dateTimeField18);
        boolean boolean21 = instant6.isBefore((-1L));
        boolean boolean22 = instant6.isBeforeNow();
        boolean boolean23 = instant6.isEqualNow();
        org.joda.time.ReadableInstant readableInstant24 = null;
        boolean boolean25 = instant6.isEqual(readableInstant24);
        org.joda.time.Instant instant28 = instant6.withDurationAdded((long) (short) 100, 895);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = instant6.toString(dateTimeFormatter29);
        org.joda.time.Instant instant32 = instant6.minus((-75600000L));
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Instant instant34 = instant6.minus(readableDuration33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant37 = instant34.withDurationAdded(readableDuration35, (int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant37 and mutableDateTime9", (instant37.compareTo(mutableDateTime9) == 0) == instant37.equals(mutableDateTime9));
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3576");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = new org.joda.time.Instant(1L);
        boolean boolean6 = instant1.isEqual((org.joda.time.ReadableInstant) instant5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = instant1.isSupported(dateTimeFieldType7);
        boolean boolean10 = instant1.isEqual(151200024L);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Chronology chronology18 = gJChronology13.withZone(dateTimeZone16);
        long long21 = dateTimeZone16.convertLocalToUTC((long) (short) 10, false);
        java.util.TimeZone timeZone22 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.Instant instant26 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.plus(readableDuration27);
        org.joda.time.Instant instant30 = instant28.withMillis((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = instant30.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        boolean boolean33 = instant30.isSupported(dateTimeFieldType32);
        int int34 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Instant instant37 = instant30.withDurationAdded((-107999990L), (int) '#');
        boolean boolean38 = instant1.isAfter((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Instant instant39 = instant1.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant30 and dateTime31", (instant30.compareTo(dateTime31) == 0) == instant30.equals(dateTime31));
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3577");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        long long8 = instant6.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = instant6.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = julianChronology13.minuteOfDay();
        org.joda.time.DurationField durationField15 = julianChronology13.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str18 = dateTimeZone17.getID();
        boolean boolean19 = dateTimeZone17.isFixed();
        long long21 = dateTimeZone17.previousTransition(100L);
        java.util.TimeZone timeZone22 = dateTimeZone17.toTimeZone();
        long long24 = dateTimeZone17.previousTransition(5201L);
        org.joda.time.Chronology chronology25 = julianChronology13.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField26 = julianChronology13.year();
        int int27 = instant6.get(dateTimeField26);
        long long28 = instant6.getMillis();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant30 = instant6.plus(readableDuration29);
        org.joda.time.Instant instant31 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant31.plus(readableDuration32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology36.getZone();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology36.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology36.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = gJChronology36.getZone();
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40, (org.joda.time.ReadableInstant) instant42);
        java.lang.String str44 = instant42.toString();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone45, readableInstant46);
        org.joda.time.DateTimeZone dateTimeZone48 = gJChronology47.getZone();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology47.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology47.dayOfYear();
        org.joda.time.Instant instant51 = gJChronology47.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.Instant instant53 = instant51.minus(readableDuration52);
        org.joda.time.Instant instant56 = instant53.withDurationAdded((-12219292800000L), 0);
        int int57 = instant42.compareTo((org.joda.time.ReadableInstant) instant53);
        long long58 = instant42.getMillis();
        org.joda.time.Instant instant59 = instant42.toInstant();
        org.joda.time.DateTimeZone dateTimeZone60 = instant42.getZone();
        int int61 = instant33.compareTo((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Instant instant63 = instant33.plus((-62158787999900L));
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.Instant instant65 = instant63.plus(readableDuration64);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = null;
        boolean boolean67 = instant63.isSupported(dateTimeFieldType66);
        org.joda.time.Instant instant70 = instant63.withDurationAdded((-61889997599980L), (-1));
        org.joda.time.DateTime dateTime71 = instant70.toDateTime();
        boolean boolean72 = instant6.isBefore((org.joda.time.ReadableInstant) dateTime71);
        boolean boolean74 = instant6.isBefore((-60514214884047L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant70 and dateTime71", (instant70.compareTo(dateTime71) == 0) == instant70.equals(dateTime71));
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3578");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        boolean boolean25 = instant8.isBefore((long) 'a');
        org.joda.time.Instant instant26 = instant8.toInstant();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant8.minus(readableDuration27);
        long long29 = instant28.getMillis();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, readableInstant31);
        org.joda.time.DateTimeZone dateTimeZone33 = gJChronology32.getZone();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.dayOfYear();
        org.joda.time.Instant instant36 = gJChronology32.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone37 = instant36.getZone();
        long long38 = instant36.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = instant36.isSupported(dateTimeFieldType39);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology43 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = julianChronology43.minuteOfDay();
        org.joda.time.DurationField durationField45 = julianChronology43.weekyears();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str48 = dateTimeZone47.getID();
        boolean boolean49 = dateTimeZone47.isFixed();
        long long51 = dateTimeZone47.previousTransition(100L);
        java.util.TimeZone timeZone52 = dateTimeZone47.toTimeZone();
        long long54 = dateTimeZone47.previousTransition(5201L);
        org.joda.time.Chronology chronology55 = julianChronology43.withZone(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField56 = julianChronology43.year();
        int int57 = instant36.get(dateTimeField56);
        org.joda.time.DateTime dateTime58 = instant36.toDateTimeISO();
        org.joda.time.Instant instant60 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.Instant instant63 = instant60.withDurationAdded(readableDuration61, 0);
        java.util.Date date64 = instant60.toDate();
        long long65 = instant60.getMillis();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.chrono.GJChronology gJChronology68 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone66, readableInstant67);
        org.joda.time.Chronology chronology69 = gJChronology68.withUTC();
        java.lang.String str70 = gJChronology68.toString();
        org.joda.time.DateTimeField dateTimeField71 = gJChronology68.monthOfYear();
        org.joda.time.DateTimeField dateTimeField72 = gJChronology68.millisOfDay();
        org.joda.time.DateTimeField dateTimeField73 = gJChronology68.yearOfEra();
        java.lang.String str74 = gJChronology68.toString();
        boolean boolean75 = instant60.equals((java.lang.Object) gJChronology68);
        org.joda.time.Chronology chronology76 = instant60.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = null;
        java.lang.String str78 = instant60.toString(dateTimeFormatter77);
        boolean boolean79 = instant36.isAfter((org.joda.time.ReadableInstant) instant60);
        boolean boolean80 = instant28.isBefore((org.joda.time.ReadableInstant) instant60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and dateTime58", (instant17.compareTo(dateTime58) == 0) == instant17.equals(dateTime58));
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3579");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.plus(readableDuration11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology15.getZone();
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, (org.joda.time.ReadableInstant) instant21);
        java.lang.String str23 = instant21.toString();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, readableInstant25);
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology26.getZone();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology26.dayOfYear();
        org.joda.time.Instant instant30 = gJChronology26.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant32 = instant30.minus(readableDuration31);
        org.joda.time.Instant instant35 = instant32.withDurationAdded((-12219292800000L), 0);
        int int36 = instant21.compareTo((org.joda.time.ReadableInstant) instant32);
        long long37 = instant21.getMillis();
        org.joda.time.Instant instant38 = instant21.toInstant();
        org.joda.time.DateTimeZone dateTimeZone39 = instant21.getZone();
        int int40 = instant12.compareTo((org.joda.time.ReadableInstant) instant21);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Instant instant43 = instant21.withDurationAdded(readableDuration41, 0);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = instant21.toDateTime(chronology44);
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, (org.joda.time.ReadableInstant) dateTime45);
        java.lang.String str47 = dateTime45.toString();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone48, readableInstant49);
        org.joda.time.Chronology chronology51 = gJChronology50.withUTC();
        org.joda.time.DateTimeField dateTimeField52 = gJChronology50.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField53 = gJChronology50.millisOfDay();
        org.joda.time.DurationField durationField54 = gJChronology50.halfdays();
        org.joda.time.DurationField durationField55 = gJChronology50.millis();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology58 = gJChronology50.withZone(dateTimeZone57);
        org.joda.time.DurationField durationField59 = gJChronology50.minutes();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology50.halfdayOfDay();
        org.joda.time.DurationField durationField61 = gJChronology50.centuries();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology50.hourOfDay();
        org.joda.time.DateTimeField dateTimeField63 = gJChronology50.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField64 = gJChronology50.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField65 = gJChronology50.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField66 = gJChronology50.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField67 = gJChronology50.weekyear();
        org.joda.time.DateTime dateTime68 = dateTime45.toDateTime((org.joda.time.Chronology) gJChronology50);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone70);
        org.joda.time.chrono.JulianChronology julianChronology72 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone70);
        boolean boolean74 = julianChronology72.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology75 = julianChronology72.withUTC();
        org.joda.time.DateTimeField dateTimeField76 = julianChronology72.era();
        org.joda.time.DateTimeField dateTimeField77 = julianChronology72.minuteOfHour();
        org.joda.time.DurationField durationField78 = julianChronology72.weeks();
        org.joda.time.DateTimeField dateTimeField79 = julianChronology72.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        long long83 = julianChronology72.add(readablePeriod80, (-60514215303803L), 36000000);
        org.joda.time.DurationField durationField84 = julianChronology72.seconds();
        org.joda.time.DateTimeField dateTimeField85 = julianChronology72.minuteOfHour();
        org.joda.time.DurationField durationField86 = julianChronology72.weeks();
        org.joda.time.DateTimeField dateTimeField87 = julianChronology72.era();
        org.joda.time.DateTimeField dateTimeField88 = julianChronology72.dayOfYear();
        int int89 = dateTime68.get(dateTimeField88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and dateTime45", (instant21.compareTo(dateTime45) == 0) == instant21.equals(dateTime45));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3580");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        org.joda.time.Instant instant6 = instant4.minus((long) (short) -1);
        boolean boolean7 = instant4.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.Chronology chronology11 = gJChronology10.withUTC();
        org.joda.time.DurationField durationField12 = gJChronology10.millis();
        long long16 = gJChronology10.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField17 = gJChronology10.millis();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology10.hourOfHalfday();
        org.joda.time.DurationField durationField19 = gJChronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology10.centuryOfEra();
        org.joda.time.DurationField durationField21 = gJChronology10.weekyears();
        java.lang.String str22 = gJChronology10.toString();
        org.joda.time.DurationField durationField23 = gJChronology10.seconds();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str26 = dateTimeZone25.getID();
        boolean boolean27 = dateTimeZone25.isFixed();
        long long29 = dateTimeZone25.previousTransition(100L);
        org.joda.time.chrono.JulianChronology julianChronology30 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone25);
        java.lang.String str31 = dateTimeZone25.getID();
        int int33 = dateTimeZone25.getOffsetFromLocal((long) 1);
        java.lang.String str35 = dateTimeZone25.getName((long) 8);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology38 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = julianChronology38.minuteOfDay();
        org.joda.time.DurationField durationField40 = julianChronology38.weekyears();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str43 = dateTimeZone42.getID();
        boolean boolean44 = dateTimeZone42.isFixed();
        long long46 = dateTimeZone42.previousTransition(100L);
        java.util.TimeZone timeZone47 = dateTimeZone42.toTimeZone();
        long long49 = dateTimeZone42.previousTransition(5201L);
        org.joda.time.Chronology chronology50 = julianChronology38.withZone(dateTimeZone42);
        long long52 = dateTimeZone25.getMillisKeepLocal(dateTimeZone42, 36000001L);
        java.lang.String str53 = dateTimeZone25.toString();
        org.joda.time.Chronology chronology54 = gJChronology10.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField55 = gJChronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology10.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime58 = instant4.toMutableDateTime((org.joda.time.Chronology) gJChronology10);
        boolean boolean59 = instant4.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime58", (instant4.compareTo(mutableDateTime58) == 0) == instant4.equals(mutableDateTime58));
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3581");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTime dateTime10 = instant8.toDateTime();
        boolean boolean11 = instant8.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField16 = julianChronology14.hours();
        long long20 = julianChronology14.add((long) 36000000, (long) ' ', 3600000);
        org.joda.time.Chronology chronology21 = julianChronology14.withUTC();
        long long25 = julianChronology14.add(0L, (-71999901L), (int) '4');
        org.joda.time.DateTimeField dateTimeField26 = julianChronology14.minuteOfHour();
        org.joda.time.DateTime dateTime27 = instant8.toDateTime((org.joda.time.Chronology) julianChronology14);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology30 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = julianChronology30.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, readableInstant33);
        org.joda.time.DateTimeZone dateTimeZone35 = gJChronology34.getZone();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology34.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology34.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = gJChronology34.getZone();
        org.joda.time.Chronology chronology39 = julianChronology30.withZone(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = julianChronology30.era();
        org.joda.time.DurationField durationField41 = julianChronology30.halfdays();
        org.joda.time.DurationField durationField42 = julianChronology30.minutes();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone44.getName((-1L), locale47);
        long long50 = dateTimeZone44.previousTransition((long) '#');
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone52);
        org.joda.time.chrono.JulianChronology julianChronology54 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone52);
        org.joda.time.DurationField durationField55 = julianChronology54.weeks();
        org.joda.time.DurationField durationField56 = julianChronology54.millis();
        org.joda.time.DateTimeField dateTimeField57 = julianChronology54.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        long long61 = julianChronology54.add(readablePeriod58, (long) 36000000, 4);
        boolean boolean62 = dateTimeZone44.equals((java.lang.Object) 36000000);
        boolean boolean63 = dateTimeZone44.isFixed();
        org.joda.time.Chronology chronology64 = julianChronology30.withZone(dateTimeZone44);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        org.joda.time.Chronology chronology66 = julianChronology14.withZone(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime10", (instant8.compareTo(dateTime10) == 0) == instant8.equals(dateTime10));
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3582");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.year();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology3.getZone();
        org.joda.time.DurationField durationField7 = julianChronology3.eras();
        org.joda.time.DateTimeZone dateTimeZone8 = julianChronology3.getZone();
        int int10 = dateTimeZone8.getOffsetFromLocal(187199999L);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = gJChronology11.eras();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str17 = dateTimeZone16.getID();
        boolean boolean18 = dateTimeZone16.isFixed();
        long long20 = dateTimeZone16.previousTransition(100L);
        org.joda.time.chrono.JulianChronology julianChronology21 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone16);
        java.lang.String str22 = dateTimeZone16.getID();
        int int24 = dateTimeZone16.getOffsetFromLocal((long) 1);
        java.lang.String str26 = dateTimeZone16.getName((long) 8);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology29 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = julianChronology29.minuteOfDay();
        org.joda.time.DurationField durationField31 = julianChronology29.weekyears();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str34 = dateTimeZone33.getID();
        boolean boolean35 = dateTimeZone33.isFixed();
        long long37 = dateTimeZone33.previousTransition(100L);
        java.util.TimeZone timeZone38 = dateTimeZone33.toTimeZone();
        long long40 = dateTimeZone33.previousTransition(5201L);
        org.joda.time.Chronology chronology41 = julianChronology29.withZone(dateTimeZone33);
        long long43 = dateTimeZone16.getMillisKeepLocal(dateTimeZone33, 36000001L);
        org.joda.time.Chronology chronology44 = gJChronology11.withZone(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField31", Math.signum(durationField7.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField7)));
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3583");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.dayOfYear();
        org.joda.time.Instant instant14 = gJChronology10.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime17 = instant14.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = instant14.toDateTime();
        java.util.Date date19 = instant14.toDate();
        boolean boolean20 = gJChronology2.equals((java.lang.Object) instant14);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant14.minus(readableDuration21);
        org.joda.time.Instant instant24 = instant22.plus(50400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant22 and mutableDateTime17", (instant22.compareTo(mutableDateTime17) == 0) == instant22.equals(mutableDateTime17));
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3584");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        long long24 = instant8.getMillis();
        org.joda.time.Instant instant25 = instant8.toInstant();
        long long26 = instant8.getMillis();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, readableInstant28);
        org.joda.time.DateTimeZone dateTimeZone30 = gJChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = gJChronology29.getZone();
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33, (org.joda.time.ReadableInstant) instant35);
        org.joda.time.DateTime dateTime37 = instant35.toDateTime();
        long long38 = dateTime37.getMillis();
        org.joda.time.Instant instant40 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Instant instant42 = instant40.plus(readableDuration41);
        org.joda.time.Instant instant44 = new org.joda.time.Instant(1L);
        boolean boolean45 = instant40.isEqual((org.joda.time.ReadableInstant) instant44);
        boolean boolean46 = dateTime37.isBefore((org.joda.time.ReadableInstant) instant44);
        int int47 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime37);
        long long48 = instant8.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime37", (instant8.compareTo(dateTime37) == 0) == instant8.equals(dateTime37));
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3585");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = instant6.toDateTime();
        java.util.Date date11 = instant6.toDate();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology14.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Chronology chronology19 = gJChronology14.withZone(dateTimeZone17);
        java.lang.String str21 = dateTimeZone17.getName((long) (byte) 10);
        java.util.TimeZone timeZone22 = dateTimeZone17.toTimeZone();
        long long26 = dateTimeZone17.convertLocalToUTC((long) 10, false, (long) (byte) 10);
        boolean boolean27 = instant6.equals((java.lang.Object) (byte) 10);
        org.joda.time.Instant instant29 = instant6.withMillis((long) 1200);
        org.joda.time.Instant instant31 = instant6.minus((-32398031L));
        java.util.Date date32 = instant31.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime9", (instant6.compareTo(mutableDateTime9) == 0) == instant6.equals(mutableDateTime9));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3586");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        boolean boolean6 = instant4.isEqual((long) 1);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant9 = instant4.withDurationAdded(readableDuration7, 4);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        boolean boolean15 = julianChronology13.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField16 = julianChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology13.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime20 = instant4.toMutableDateTime((org.joda.time.Chronology) julianChronology13);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.chrono.JulianChronology julianChronology24 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone22);
        boolean boolean26 = julianChronology24.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology27 = julianChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = julianChronology24.era();
        org.joda.time.DateTimeField dateTimeField29 = julianChronology24.minuteOfHour();
        org.joda.time.DurationField durationField30 = julianChronology24.weeks();
        org.joda.time.DateTimeField dateTimeField31 = julianChronology24.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime20.toMutableDateTime((org.joda.time.Chronology) julianChronology24);
        org.joda.time.DurationField durationField33 = julianChronology24.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime20", (instant1.compareTo(mutableDateTime20) == 0) == instant1.equals(mutableDateTime20));
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3587");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        org.joda.time.Instant instant6 = instant4.minus((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant6.minus(readableDuration8);
        org.joda.time.MutableDateTime mutableDateTime10 = instant6.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant6", (mutableDateTime7.compareTo(instant6) == 0) == mutableDateTime7.equals(instant6));
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3588");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        boolean boolean25 = instant8.isBefore((long) 'a');
        org.joda.time.Instant instant26 = instant8.toInstant();
        boolean boolean27 = instant26.isEqualNow();
        org.joda.time.Instant instant28 = new org.joda.time.Instant((java.lang.Object) instant26);
        org.joda.time.Instant instant30 = instant28.withMillis((-593285867998337L));
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.chrono.JulianChronology julianChronology34 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone32);
        org.joda.time.DurationField durationField35 = julianChronology34.weeks();
        org.joda.time.DurationField durationField36 = julianChronology34.millis();
        org.joda.time.DateTimeField dateTimeField37 = julianChronology34.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = julianChronology34.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = julianChronology34.year();
        org.joda.time.DateTimeField dateTimeField40 = julianChronology34.weekOfWeekyear();
        org.joda.time.DurationField durationField41 = julianChronology34.seconds();
        org.joda.time.DateTimeZone dateTimeZone42 = julianChronology34.getZone();
        org.joda.time.DateTimeZone dateTimeZone43 = julianChronology34.getZone();
        java.lang.String str45 = dateTimeZone43.getName(86400000L);
        org.joda.time.DateTime dateTime46 = instant28.toDateTime(dateTimeZone43);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Instant instant51 = instant48.withDurationAdded(readableDuration49, 0);
        java.util.Date date52 = instant48.toDate();
        long long53 = instant48.getMillis();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.chrono.GJChronology gJChronology56 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54, readableInstant55);
        org.joda.time.Chronology chronology57 = gJChronology56.withUTC();
        java.lang.String str58 = gJChronology56.toString();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology56.monthOfYear();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology56.millisOfDay();
        org.joda.time.DateTimeField dateTimeField61 = gJChronology56.yearOfEra();
        java.lang.String str62 = gJChronology56.toString();
        boolean boolean63 = instant48.equals((java.lang.Object) gJChronology56);
        org.joda.time.Instant instant64 = instant48.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = null;
        boolean boolean66 = instant48.isSupported(dateTimeFieldType65);
        boolean boolean67 = dateTime46.isEqual((org.joda.time.ReadableInstant) instant48);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = null;
        boolean boolean69 = instant48.isSupported(dateTimeFieldType68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime46", (instant8.compareTo(dateTime46) == 0) == instant8.equals(dateTime46));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3589");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        int int19 = dateTimeZone8.getOffset((-35999900L));
        int int21 = dateTimeZone8.getOffset((long) '#');
        java.util.TimeZone timeZone22 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, readableInstant25);
        org.joda.time.Chronology chronology27 = gJChronology26.withUTC();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29);
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology30.getZone();
        java.lang.String str33 = dateTimeZone31.getName((long) 0);
        long long36 = dateTimeZone31.adjustOffset(1L, true);
        org.joda.time.Chronology chronology37 = gJChronology26.withZone(dateTimeZone31);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        long long41 = gJChronology26.add(readablePeriod38, (-107999989L), 24);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone43);
        org.joda.time.chrono.JulianChronology julianChronology45 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone43);
        boolean boolean47 = julianChronology45.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology48 = julianChronology45.withUTC();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology50 = julianChronology45.withZone(dateTimeZone49);
        org.joda.time.DurationField durationField51 = julianChronology45.days();
        org.joda.time.DateTimeField dateTimeField52 = julianChronology45.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str55 = dateTimeZone54.getID();
        boolean boolean56 = dateTimeZone54.isFixed();
        long long58 = dateTimeZone54.previousTransition(100L);
        java.util.TimeZone timeZone59 = dateTimeZone54.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone59);
        org.joda.time.Chronology chronology61 = julianChronology45.withZone(dateTimeZone60);
        java.util.TimeZone timeZone62 = dateTimeZone60.toTimeZone();
        org.joda.time.chrono.GJChronology gJChronology63 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTimeZone dateTimeZone64 = gJChronology63.getZone();
        int int66 = dateTimeZone64.getOffset((-143999601L));
        java.lang.String str67 = dateTimeZone64.toString();
        org.joda.time.Chronology chronology68 = gJChronology26.withZone(dateTimeZone64);
        java.lang.String str69 = dateTimeZone64.toString();
        org.joda.time.Instant instant71 = new org.joda.time.Instant((-35999991L));
        org.joda.time.MutableDateTime mutableDateTime72 = instant71.toMutableDateTimeISO();
        org.joda.time.chrono.GJChronology gJChronology73 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone64, (org.joda.time.ReadableInstant) mutableDateTime72);
        boolean boolean74 = dateTimeZone23.equals((java.lang.Object) gJChronology73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant71 and mutableDateTime72", (instant71.compareTo(mutableDateTime72) == 0) == instant71.equals(mutableDateTime72));
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3590");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, readableInstant5);
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology6.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology6.getZone();
        org.joda.time.Chronology chronology11 = julianChronology2.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology2.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone15);
        boolean boolean19 = julianChronology17.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField20 = julianChronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = julianChronology17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology17.year();
        org.joda.time.DateTimeZone dateTimeZone25 = julianChronology17.getZone();
        org.joda.time.DurationField durationField26 = julianChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = julianChronology17.hourOfHalfday();
        boolean boolean28 = julianChronology2.equals((java.lang.Object) julianChronology17);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        org.joda.time.chrono.JulianChronology julianChronology32 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone30);
        org.joda.time.DurationField durationField33 = julianChronology32.centuries();
        org.joda.time.DurationField durationField34 = julianChronology32.weeks();
        org.joda.time.DurationField durationField35 = julianChronology32.days();
        org.joda.time.DateTimeZone dateTimeZone36 = julianChronology32.getZone();
        int int38 = dateTimeZone36.getStandardOffset(151199999L);
        org.joda.time.Chronology chronology39 = julianChronology2.withZone(dateTimeZone36);
        org.joda.time.DurationField durationField40 = julianChronology2.months();
        org.joda.time.DurationField durationField41 = julianChronology2.weeks();
        java.lang.Object obj42 = null;
        boolean boolean43 = julianChronology2.equals(obj42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField34 and durationField41", (durationField34.compareTo(durationField41) == 0) == durationField34.equals(durationField41));
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3591");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        long long2 = instant1.getMillis();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4);
        org.joda.time.Chronology chronology6 = gJChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.millisOfDay();
        org.joda.time.DurationField durationField9 = gJChronology5.halfdays();
        org.joda.time.DurationField durationField10 = gJChronology5.millis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology13 = gJChronology5.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology5.minutes();
        org.joda.time.DurationField durationField15 = gJChronology5.weekyears();
        org.joda.time.DurationField durationField16 = gJChronology5.minutes();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology5.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = instant1.toMutableDateTime((org.joda.time.Chronology) gJChronology5);
        org.joda.time.ReadableInstant readableInstant20 = null;
        boolean boolean21 = instant1.isBefore(readableInstant20);
        org.joda.time.Instant instant22 = instant1.toInstant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = instant22.toString(dateTimeFormatter23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant22 and mutableDateTime19", (instant22.compareTo(mutableDateTime19) == 0) == instant22.equals(mutableDateTime19));
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3592");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        boolean boolean13 = instant8.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.Chronology chronology17 = gJChronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology16.monthOfYear();
        boolean boolean24 = instant8.equals((java.lang.Object) dateTimeField23);
        org.joda.time.Instant instant26 = instant8.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = instant26.isSupported(dateTimeFieldType27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        boolean boolean30 = instant26.isSupported(dateTimeFieldType29);
        org.joda.time.Instant instant33 = instant26.withDurationAdded(151199999L, (int) (short) 100);
        org.joda.time.Instant instant35 = instant33.withMillis(187199999L);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant38 = instant33.withDurationAdded(readableDuration36, 1200);
        boolean boolean39 = instant33.isAfterNow();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Instant instant41 = instant33.minus(readableDuration40);
        org.joda.time.MutableDateTime mutableDateTime42 = instant33.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, readableInstant44);
        org.joda.time.DateTimeZone dateTimeZone46 = gJChronology45.getZone();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology45.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology45.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone49 = gJChronology45.getZone();
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology52 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone49, (org.joda.time.ReadableInstant) instant51);
        java.lang.String str53 = instant51.toString();
        org.joda.time.DateTimeZone dateTimeZone54 = instant51.getZone();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone55, readableInstant56);
        org.joda.time.DateTimeZone dateTimeZone58 = gJChronology57.getZone();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology57.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology57.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone61 = gJChronology57.getZone();
        org.joda.time.Instant instant63 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology64 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone61, (org.joda.time.ReadableInstant) instant63);
        java.lang.String str65 = instant63.toString();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.chrono.GJChronology gJChronology68 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone66, readableInstant67);
        org.joda.time.DateTimeZone dateTimeZone69 = gJChronology68.getZone();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology68.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField71 = gJChronology68.dayOfYear();
        org.joda.time.Instant instant72 = gJChronology68.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.Instant instant74 = instant72.minus(readableDuration73);
        org.joda.time.Instant instant77 = instant74.withDurationAdded((-12219292800000L), 0);
        int int78 = instant63.compareTo((org.joda.time.ReadableInstant) instant74);
        org.joda.time.ReadableDuration readableDuration79 = null;
        org.joda.time.Instant instant80 = instant63.minus(readableDuration79);
        int int81 = instant51.compareTo((org.joda.time.ReadableInstant) instant63);
        org.joda.time.ReadableDuration readableDuration82 = null;
        org.joda.time.Instant instant83 = instant63.plus(readableDuration82);
        org.joda.time.MutableDateTime mutableDateTime84 = instant83.toMutableDateTimeISO();
        int int85 = mutableDateTime42.compareTo((org.joda.time.ReadableInstant) instant83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant51 and mutableDateTime84", (instant51.compareTo(mutableDateTime84) == 0) == instant51.equals(mutableDateTime84));
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3593");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = julianChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField10 = julianChronology3.seconds();
        int int11 = julianChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.weekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = julianChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology3.centuryOfEra();
        org.joda.time.DurationField durationField17 = julianChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField8, and durationField10", !(durationField17.compareTo(durationField8) == 0) || (Math.signum(durationField17.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3594");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.Instant instant1 = gJChronology0.getGregorianCutover();
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.Instant instant4 = instant1.minus(71923931679849L);
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, readableInstant7);
        org.joda.time.Chronology chronology9 = gJChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology8.dayOfWeek();
        org.joda.time.DurationField durationField11 = gJChronology8.years();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology8.weekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology8.getZone();
        long long18 = gJChronology8.add(1L, (long) (byte) -1, (int) ' ');
        org.joda.time.DurationField durationField19 = gJChronology8.minutes();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime5.toMutableDateTime((org.joda.time.Chronology) gJChronology8);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology21.secondOfMinute();
        org.joda.time.DurationField durationField23 = gJChronology21.halfdays();
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology21.getZone();
        boolean boolean25 = mutableDateTime5.equals((java.lang.Object) gJChronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime20", (instant4.compareTo(mutableDateTime20) == 0) == instant4.equals(mutableDateTime20));
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3595");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, readableInstant5);
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology6.getZone();
        java.lang.String str9 = dateTimeZone7.getName((long) 0);
        long long12 = dateTimeZone7.adjustOffset(1L, true);
        org.joda.time.Chronology chronology13 = gJChronology2.withZone(dateTimeZone7);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = gJChronology2.add(readablePeriod14, (-107999989L), 24);
        org.joda.time.Instant instant18 = gJChronology2.getGregorianCutover();
        long long19 = instant18.getMillis();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone21);
        java.lang.String str25 = dateTimeZone21.getNameKey(10L);
        java.lang.String str27 = dateTimeZone21.getName((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime28 = instant18.toMutableDateTime(dateTimeZone21);
        org.joda.time.Instant instant30 = new org.joda.time.Instant(0L);
        long long31 = instant30.getMillis();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant30.minus(readableDuration32);
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant33.plus(readableDuration35);
        org.joda.time.DateTimeZone dateTimeZone37 = instant36.getZone();
        int int39 = dateTimeZone37.getStandardOffset((-71999900L));
        java.lang.String str40 = dateTimeZone37.toString();
        org.joda.time.DateTime dateTime41 = instant18.toDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology42 = instant18.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime28 and dateTime41", (mutableDateTime28.compareTo(dateTime41) == 0) == mutableDateTime28.equals(dateTime41));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3596");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant3.withMillis((long) (byte) -1);
        org.joda.time.Instant instant7 = instant5.plus((long) (short) 0);
        java.lang.String str8 = instant7.toString();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant7.plus(readableDuration9);
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTimeISO();
        boolean boolean13 = instant10.isAfter(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime11", (instant10.compareTo(mutableDateTime11) == 0) == instant10.equals(mutableDateTime11));
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3597");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.weekyear();
        org.joda.time.DurationField durationField7 = julianChronology3.days();
        org.joda.time.Chronology chronology8 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.hourOfDay();
        org.joda.time.DurationField durationField10 = julianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3598");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.clockhourOfDay();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = gJChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = gJChronology0.halfdays();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10);
        org.joda.time.Chronology chronology12 = gJChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.millisOfDay();
        org.joda.time.DurationField durationField15 = gJChronology11.halfdays();
        org.joda.time.DurationField durationField16 = gJChronology11.millis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology19 = gJChronology11.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField20 = gJChronology11.minutes();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology11.halfdayOfDay();
        org.joda.time.DurationField durationField22 = gJChronology11.centuries();
        org.joda.time.DurationField durationField23 = gJChronology11.days();
        org.joda.time.Instant instant24 = gJChronology11.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology27.getZone();
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone28.getName((long) 36000000, locale30);
        int int33 = dateTimeZone28.getOffset((long) ' ');
        long long35 = dateTimeZone28.previousTransition(1L);
        java.lang.String str37 = dateTimeZone28.getShortName((long) (short) 1);
        long long39 = dateTimeZone28.previousTransition((long) 100);
        java.lang.String str40 = dateTimeZone28.getID();
        org.joda.time.DateTime dateTime41 = instant24.toDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology42 = gJChronology0.withZone(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and dateTime41", (instant24.compareTo(dateTime41) == 0) == instant24.equals(dateTime41));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3599");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology5.getZone();
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, (org.joda.time.ReadableInstant) instant11);
        java.lang.String str13 = instant11.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology16.getZone();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.dayOfYear();
        org.joda.time.Instant instant20 = gJChronology16.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.minus(readableDuration21);
        org.joda.time.Instant instant25 = instant22.withDurationAdded((-12219292800000L), 0);
        int int26 = instant11.compareTo((org.joda.time.ReadableInstant) instant22);
        long long27 = instant11.getMillis();
        org.joda.time.Instant instant28 = instant11.toInstant();
        org.joda.time.DateTimeZone dateTimeZone29 = instant11.getZone();
        int int30 = instant2.compareTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, readableInstant32);
        org.joda.time.DateTimeZone dateTimeZone34 = gJChronology33.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str37 = dateTimeZone36.getID();
        org.joda.time.Chronology chronology38 = gJChronology33.withZone(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone39 = gJChronology33.getZone();
        long long41 = dateTimeZone39.nextTransition((-12219292800000L));
        long long43 = dateTimeZone39.convertUTCToLocal((long) 1);
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone39.getName((long) (-1), locale45);
        long long50 = dateTimeZone39.convertLocalToUTC(1L, true, (long) 0);
        org.joda.time.Instant instant52 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Instant instant54 = instant52.plus(readableDuration53);
        org.joda.time.Instant instant56 = instant54.withMillis((long) (byte) -1);
        java.util.Date date57 = instant54.toDate();
        org.joda.time.chrono.GJChronology gJChronology58 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39, (org.joda.time.ReadableInstant) instant54);
        org.joda.time.DateTime dateTime59 = instant2.toDateTime(dateTimeZone39);
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.Instant instant62 = instant2.withDurationAdded(readableDuration60, 1582);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant62 and dateTime59", (instant62.compareTo(dateTime59) == 0) == instant62.equals(dateTime59));
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3600");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant9);
        java.lang.String str11 = instant9.toString();
        int int12 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((java.lang.Object) instant9);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((java.lang.Object) instant13);
        java.util.Date date15 = instant14.toDate();
        org.joda.time.DateTime dateTime16 = instant14.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology19 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20, readableInstant21);
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology22.getZone();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology22.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology22.dayOfYear();
        org.joda.time.Instant instant26 = gJChronology22.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.minus(readableDuration27);
        org.joda.time.Instant instant31 = instant28.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant28.plus(readableDuration32);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35, readableInstant36);
        org.joda.time.DateTimeZone dateTimeZone38 = gJChronology37.getZone();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.dayOfYear();
        org.joda.time.Instant instant41 = gJChronology37.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Instant instant43 = instant41.minus(readableDuration42);
        org.joda.time.Instant instant46 = instant43.withDurationAdded((-12219292800000L), 0);
        org.joda.time.MutableDateTime mutableDateTime47 = instant43.toMutableDateTime();
        int int48 = instant33.compareTo((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.chrono.GJChronology gJChronology51 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone49, readableInstant50);
        org.joda.time.DateTimeZone dateTimeZone52 = gJChronology51.getZone();
        org.joda.time.DateTimeField dateTimeField53 = gJChronology51.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology51.dayOfYear();
        org.joda.time.Instant instant55 = gJChronology51.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.Instant instant57 = instant55.minus(readableDuration56);
        org.joda.time.Instant instant60 = instant57.withDurationAdded((-12219292800000L), 0);
        boolean boolean62 = instant57.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.chrono.GJChronology gJChronology65 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone63, readableInstant64);
        org.joda.time.Chronology chronology66 = gJChronology65.withUTC();
        org.joda.time.DateTimeField dateTimeField67 = gJChronology65.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField68 = gJChronology65.millisOfDay();
        org.joda.time.DateTimeField dateTimeField69 = gJChronology65.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology65.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField71 = gJChronology65.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField72 = gJChronology65.monthOfYear();
        boolean boolean73 = instant57.equals((java.lang.Object) dateTimeField72);
        org.joda.time.Instant instant75 = instant57.withMillis(1L);
        org.joda.time.ReadableDuration readableDuration76 = null;
        org.joda.time.Instant instant78 = instant57.withDurationAdded(readableDuration76, 1);
        org.joda.time.Instant instant79 = instant78.toInstant();
        boolean boolean80 = mutableDateTime47.isBefore((org.joda.time.ReadableInstant) instant78);
        int int81 = instant14.compareTo((org.joda.time.ReadableInstant) mutableDateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime16", (instant9.compareTo(dateTime16) == 0) == instant9.equals(dateTime16));
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3601");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology14.getZone();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology14.getZone();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant20);
        java.lang.String str22 = instant20.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, readableInstant24);
        org.joda.time.Chronology chronology26 = gJChronology25.withUTC();
        java.lang.String str27 = gJChronology25.toString();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.monthOfYear();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology25.dayOfWeek();
        org.joda.time.Instant instant31 = gJChronology25.getGregorianCutover();
        boolean boolean32 = instant20.equals((java.lang.Object) gJChronology25);
        boolean boolean33 = instant11.isAfter((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Instant instant35 = instant20.minus((-61543965598418L));
        org.joda.time.Instant instant36 = instant35.toInstant();
        boolean boolean38 = instant36.isAfter((-35999275L));
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39, readableInstant40);
        org.joda.time.DateTimeZone dateTimeZone42 = gJChronology41.getZone();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology41.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology41.dayOfYear();
        org.joda.time.Instant instant45 = gJChronology41.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime48 = instant45.toMutableDateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime49 = instant45.toDateTime();
        java.util.Date date50 = instant45.toDate();
        boolean boolean51 = instant45.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime52 = instant45.toMutableDateTimeISO();
        boolean boolean53 = instant45.isBeforeNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = null;
        boolean boolean55 = instant45.isSupported(dateTimeFieldType54);
        boolean boolean56 = instant36.isEqual((org.joda.time.ReadableInstant) instant45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant45 and mutableDateTime48", (instant45.compareTo(mutableDateTime48) == 0) == instant45.equals(mutableDateTime48));
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3602");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.minuteOfDay();
        org.joda.time.Instant instant12 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTime dateTime13 = instant12.toDateTime();
        boolean boolean15 = instant12.isEqual((-60514215249476L));
        boolean boolean16 = instant12.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology19.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.Chronology chronology24 = gJChronology19.withZone(dateTimeZone22);
        java.lang.String str26 = dateTimeZone22.getName((long) (byte) 10);
        long long29 = dateTimeZone22.convertLocalToUTC((-35999900L), false);
        int int31 = dateTimeZone22.getOffsetFromLocal((long) 278);
        boolean boolean33 = dateTimeZone22.isStandardOffset((long) 1582);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology36.getZone();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology36.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology36.dayOfYear();
        org.joda.time.Instant instant40 = gJChronology36.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Instant instant42 = instant40.minus(readableDuration41);
        org.joda.time.Instant instant45 = instant42.withDurationAdded((-12219292800000L), 0);
        boolean boolean47 = instant42.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone48, readableInstant49);
        org.joda.time.Chronology chronology51 = gJChronology50.withUTC();
        org.joda.time.DateTimeField dateTimeField52 = gJChronology50.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField53 = gJChronology50.millisOfDay();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology50.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField55 = gJChronology50.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology50.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology50.monthOfYear();
        boolean boolean58 = instant42.equals((java.lang.Object) dateTimeField57);
        org.joda.time.Instant instant60 = instant42.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        boolean boolean62 = instant60.isSupported(dateTimeFieldType61);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = null;
        boolean boolean64 = instant60.isSupported(dateTimeFieldType63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = null;
        java.lang.String str66 = instant60.toString(dateTimeFormatter65);
        org.joda.time.chrono.GJChronology gJChronology67 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, (org.joda.time.ReadableInstant) instant60);
        org.joda.time.Instant instant70 = instant60.withDurationAdded((long) 0, (int) 'a');
        org.joda.time.Chronology chronology71 = instant70.getChronology();
        org.joda.time.Instant instant72 = instant70.toInstant();
        org.joda.time.DateTimeZone dateTimeZone73 = instant70.getZone();
        boolean boolean74 = instant12.isAfter((org.joda.time.ReadableInstant) instant70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant12", (dateTime13.compareTo(instant12) == 0) == dateTime13.equals(instant12));
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3603");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.minuteOfDay();
        org.joda.time.DurationField durationField4 = julianChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology2.dayOfMonth();
        org.joda.time.DurationField durationField8 = julianChronology2.years();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology2.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField8", (durationField4.compareTo(durationField8) == 0) == durationField4.equals(durationField8));
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3604");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        boolean boolean6 = instant4.isEqual((long) 1);
        org.joda.time.Instant instant8 = instant4.withMillis(25200L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField13 = julianChronology12.centuries();
        org.joda.time.DurationField durationField14 = julianChronology12.weeks();
        org.joda.time.DurationField durationField15 = julianChronology12.days();
        org.joda.time.DurationField durationField16 = julianChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology12.hourOfHalfday();
        org.joda.time.Chronology chronology18 = julianChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology12.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone21);
        boolean boolean25 = julianChronology23.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology26 = julianChronology23.withUTC();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology28 = julianChronology23.withZone(dateTimeZone27);
        long long30 = dateTimeZone27.convertUTCToLocal((-107999990L));
        org.joda.time.Chronology chronology31 = julianChronology12.withZone(dateTimeZone27);
        int int32 = julianChronology12.getMinimumDaysInFirstWeek();
        java.lang.String str33 = julianChronology12.toString();
        org.joda.time.DurationField durationField34 = julianChronology12.seconds();
        org.joda.time.Chronology chronology35 = julianChronology12.withUTC();
        org.joda.time.DateTime dateTime36 = instant4.toDateTime(chronology35);
        boolean boolean37 = instant4.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime36", (instant4.compareTo(dateTime36) == 0) == instant4.equals(dateTime36));
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3605");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        boolean boolean13 = instant8.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.Chronology chronology17 = gJChronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology16.monthOfYear();
        boolean boolean24 = instant8.equals((java.lang.Object) dateTimeField23);
        org.joda.time.Instant instant26 = instant8.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = instant26.isSupported(dateTimeFieldType27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        boolean boolean30 = instant26.isSupported(dateTimeFieldType29);
        org.joda.time.Instant instant33 = instant26.withDurationAdded(151199999L, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology36.getZone();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology36.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology36.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = gJChronology36.getZone();
        java.lang.String str41 = dateTimeZone40.getID();
        long long43 = dateTimeZone40.nextTransition((long) 10);
        long long45 = dateTimeZone40.nextTransition((-35999900L));
        java.lang.String str47 = dateTimeZone40.getNameKey((long) 1582);
        org.joda.time.MutableDateTime mutableDateTime48 = instant33.toMutableDateTime(dateTimeZone40);
        java.lang.String str49 = mutableDateTime48.toString();
        boolean boolean51 = mutableDateTime48.isBefore((-7834319863048000L));
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52, readableInstant53);
        org.joda.time.DateTimeZone dateTimeZone55 = gJChronology54.getZone();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology54.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology54.dayOfYear();
        org.joda.time.Instant instant58 = gJChronology54.getGregorianCutover();
        org.joda.time.DurationField durationField59 = gJChronology54.millis();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology54.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField61 = gJChronology54.hourOfDay();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology54.halfdayOfDay();
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime48.toMutableDateTime((org.joda.time.Chronology) gJChronology54);
        org.joda.time.Instant instant65 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.Instant instant68 = instant65.withDurationAdded(readableDuration66, 0);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.Instant instant70 = instant68.minus(readableDuration69);
        org.joda.time.Instant instant72 = instant68.minus(2780L);
        boolean boolean73 = mutableDateTime63.isBefore((org.joda.time.ReadableInstant) instant72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant33 and mutableDateTime48", (instant33.compareTo(mutableDateTime48) == 0) == instant33.equals(mutableDateTime48));
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3606");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant3.withMillis((long) (byte) -1);
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = instant5.isSupported(dateTimeFieldType7);
        org.joda.time.Instant instant9 = instant5.toInstant();
        java.lang.String str10 = instant5.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant5", (dateTime6.compareTo(instant5) == 0) == dateTime6.equals(instant5));
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3607");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant8.withDurationAdded(readableDuration11, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = instant8.getZone();
        org.joda.time.Instant instant15 = instant8.toInstant();
        org.joda.time.Instant instant17 = instant15.plus(177540895L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.joda.time.chrono.JulianChronology julianChronology21 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField22 = julianChronology21.centuries();
        org.joda.time.DurationField durationField23 = julianChronology21.weeks();
        org.joda.time.DurationField durationField24 = julianChronology21.days();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = julianChronology21.add(readablePeriod25, 36000000L, 0);
        org.joda.time.DurationField durationField29 = julianChronology21.hours();
        org.joda.time.DateTimeField dateTimeField30 = julianChronology21.dayOfYear();
        org.joda.time.DurationField durationField31 = julianChronology21.halfdays();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = julianChronology21.add(readablePeriod32, (long) 36000, 353);
        org.joda.time.DateTimeField dateTimeField36 = julianChronology21.yearOfCentury();
        org.joda.time.DateTime dateTime37 = instant15.toDateTime((org.joda.time.Chronology) julianChronology21);
        org.joda.time.Instant instant39 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Instant instant41 = instant39.plus(readableDuration40);
        org.joda.time.Instant instant43 = instant39.minus((long) 10);
        java.util.Date date44 = instant43.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        boolean boolean46 = instant43.isSupported(dateTimeFieldType45);
        org.joda.time.Instant instant49 = instant43.withDurationAdded((long) '4', (int) (short) 100);
        long long50 = instant49.getMillis();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Instant instant53 = instant49.withDurationAdded(readableDuration51, 36000001);
        boolean boolean54 = instant15.isEqual((org.joda.time.ReadableInstant) instant53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime37", (instant15.compareTo(dateTime37) == 0) == instant15.equals(dateTime37));
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3608");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        int int19 = dateTimeZone8.getOffset((-35999900L));
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20, readableInstant21);
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology22.getZone();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology22.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology22.dayOfYear();
        org.joda.time.Instant instant26 = gJChronology22.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.minus(readableDuration27);
        java.lang.String str29 = instant26.toString();
        org.joda.time.Instant instant31 = instant26.minus((long) 36000000);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, readableInstant33);
        org.joda.time.Chronology chronology35 = gJChronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology34.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology34.millisOfDay();
        org.joda.time.DurationField durationField38 = gJChronology34.halfdays();
        org.joda.time.DurationField durationField39 = gJChronology34.millis();
        org.joda.time.DateTime dateTime40 = instant31.toDateTime((org.joda.time.Chronology) gJChronology34);
        boolean boolean41 = instant31.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone42 = instant31.getZone();
        boolean boolean43 = instant31.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone44 = instant31.getZone();
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, (org.joda.time.ReadableInstant) instant31, 1);
        org.joda.time.DateTimeField dateTimeField47 = gJChronology46.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant31 and dateTime40", (instant31.compareTo(dateTime40) == 0) == instant31.equals(dateTime40));
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3609");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant3.withMillis((long) (byte) -1);
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        boolean boolean8 = instant5.isAfter((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology11.getZone();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.dayOfYear();
        org.joda.time.Instant instant15 = gJChronology11.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant15.minus(readableDuration16);
        org.joda.time.Instant instant20 = instant17.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant17.plus(readableDuration21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        boolean boolean24 = instant17.isEqual(readableInstant23);
        boolean boolean25 = instant5.isEqual((org.joda.time.ReadableInstant) instant17);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime28 = instant5.toMutableDateTime(dateTimeZone26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        boolean boolean30 = instant5.isAfter(readableInstant29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime28", (dateTime6.compareTo(mutableDateTime28) == 0) == dateTime6.equals(mutableDateTime28));
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3610");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 10);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        boolean boolean7 = dateTimeZone1.isStandardOffset((-70955802890L));
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.Chronology chronology11 = gJChronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.millisOfDay();
        org.joda.time.DurationField durationField14 = gJChronology10.halfdays();
        org.joda.time.DurationField durationField15 = gJChronology10.millis();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology18 = gJChronology10.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField19 = gJChronology10.minutes();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology10.halfdayOfDay();
        org.joda.time.DurationField durationField21 = gJChronology10.centuries();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology10.secondOfDay();
        long long26 = gJChronology10.add((long) 9, 0L, 0);
        org.joda.time.Instant instant27 = gJChronology10.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29);
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology30.getZone();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology30.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology30.dayOfYear();
        org.joda.time.Instant instant34 = gJChronology30.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant34.minus(readableDuration35);
        org.joda.time.Instant instant39 = instant36.withDurationAdded((-12219292800000L), 0);
        boolean boolean41 = instant36.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone42, readableInstant43);
        org.joda.time.Chronology chronology45 = gJChronology44.withUTC();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology44.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology44.millisOfDay();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology44.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology44.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology44.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology44.monthOfYear();
        boolean boolean52 = instant36.equals((java.lang.Object) dateTimeField51);
        org.joda.time.Instant instant54 = instant36.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = null;
        boolean boolean56 = instant54.isSupported(dateTimeFieldType55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone57, readableInstant58);
        org.joda.time.DateTimeZone dateTimeZone60 = gJChronology59.getZone();
        org.joda.time.DateTimeField dateTimeField61 = gJChronology59.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology59.dayOfYear();
        org.joda.time.Instant instant63 = gJChronology59.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.Instant instant65 = instant63.minus(readableDuration64);
        org.joda.time.Instant instant68 = instant65.withDurationAdded((-12219292800000L), 0);
        boolean boolean70 = instant65.isEqual(35L);
        org.joda.time.Instant instant71 = instant65.toInstant();
        boolean boolean73 = instant71.isBefore((long) ' ');
        boolean boolean74 = instant54.isAfter((org.joda.time.ReadableInstant) instant71);
        org.joda.time.Instant instant76 = instant54.minus(4L);
        org.joda.time.Chronology chronology77 = instant54.getChronology();
        boolean boolean79 = instant54.isAfter((-107999950L));
        boolean boolean80 = instant27.isEqual((org.joda.time.ReadableInstant) instant54);
        org.joda.time.MutableDateTime mutableDateTime81 = instant27.toMutableDateTimeISO();
        boolean boolean82 = dateTimeZone1.equals((java.lang.Object) mutableDateTime81);
        java.lang.String str84 = dateTimeZone1.getNameKey((-35998418L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and mutableDateTime81", (instant27.compareTo(mutableDateTime81) == 0) == instant27.equals(mutableDateTime81));
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3611");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.weekyearOfCentury();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant8 = instant6.withMillis(297L);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10);
        org.joda.time.Chronology chronology12 = gJChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.millisOfDay();
        org.joda.time.DurationField durationField15 = gJChronology11.halfdays();
        org.joda.time.DurationField durationField16 = gJChronology11.millis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology19 = gJChronology11.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField20 = gJChronology11.minutes();
        org.joda.time.DurationField durationField21 = gJChronology11.weekyears();
        org.joda.time.DurationField durationField22 = gJChronology11.minutes();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology11.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, readableInstant25);
        org.joda.time.Chronology chronology27 = gJChronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology26.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology26.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology26.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology26.monthOfYear();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology26.monthOfYear();
        org.joda.time.DurationField durationField35 = gJChronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology26.hourOfDay();
        boolean boolean37 = gJChronology11.equals((java.lang.Object) gJChronology26);
        org.joda.time.DateTimeField dateTimeField38 = gJChronology26.hourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology26.monthOfYear();
        org.joda.time.DateTime dateTime40 = instant8.toDateTime((org.joda.time.Chronology) gJChronology26);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41, readableInstant42);
        org.joda.time.DateTimeZone dateTimeZone44 = gJChronology43.getZone();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology43.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology43.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = gJChronology43.getZone();
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone47, (org.joda.time.ReadableInstant) instant49);
        org.joda.time.DateTime dateTime51 = instant49.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52, readableInstant53);
        org.joda.time.Chronology chronology55 = gJChronology54.withUTC();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology54.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology54.millisOfDay();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology54.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology54.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology54.dayOfYear();
        boolean boolean61 = instant49.equals((java.lang.Object) dateTimeField60);
        org.joda.time.Chronology chronology62 = instant49.getChronology();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.chrono.GJChronology gJChronology65 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone63, readableInstant64);
        org.joda.time.DateTimeZone dateTimeZone66 = gJChronology65.getZone();
        org.joda.time.DateTimeField dateTimeField67 = gJChronology65.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField68 = gJChronology65.dayOfYear();
        org.joda.time.Instant instant69 = gJChronology65.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.Instant instant71 = instant69.minus(readableDuration70);
        java.lang.String str72 = instant69.toString();
        org.joda.time.Instant instant74 = instant69.minus((long) 36000000);
        org.joda.time.Chronology chronology75 = instant74.getChronology();
        boolean boolean77 = instant74.isBefore(100L);
        boolean boolean78 = instant49.isAfter((org.joda.time.ReadableInstant) instant74);
        boolean boolean79 = dateTime40.isBefore((org.joda.time.ReadableInstant) instant74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant49 and dateTime51", (instant49.compareTo(dateTime51) == 0) == instant49.equals(dateTime51));
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3612");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.minuteOfDay();
        org.joda.time.Instant instant12 = gJChronology2.getGregorianCutover();
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant12.minus(readableDuration14);
        org.joda.time.DateTime dateTime16 = instant15.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime13", (instant15.compareTo(mutableDateTime13) == 0) == instant15.equals(mutableDateTime13));
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3613");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        int int10 = dateTimeZone7.getOffsetFromLocal((long) ' ');
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology12 = gJChronology2.withZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.dayOfYear();
        org.joda.time.Instant instant19 = gJChronology15.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.minus(readableDuration20);
        org.joda.time.Instant instant24 = instant21.withDurationAdded((-12219292800000L), 0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology27.getZone();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology27.getZone();
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, (org.joda.time.ReadableInstant) instant33);
        java.lang.String str35 = instant33.toString();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36, readableInstant37);
        org.joda.time.Chronology chronology39 = gJChronology38.withUTC();
        java.lang.String str40 = gJChronology38.toString();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology38.monthOfYear();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology38.millisOfDay();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology38.dayOfWeek();
        org.joda.time.Instant instant44 = gJChronology38.getGregorianCutover();
        boolean boolean45 = instant33.equals((java.lang.Object) gJChronology38);
        boolean boolean46 = instant24.isAfter((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Instant instant48 = instant33.minus((-61543965598418L));
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.chrono.GJChronology gJChronology52 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone50, readableInstant51);
        org.joda.time.Chronology chronology53 = gJChronology52.withUTC();
        org.joda.time.DurationField durationField54 = gJChronology52.millis();
        long long58 = gJChronology52.add((long) '4', 0L, (int) (byte) -1);
        int int59 = gJChronology52.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology52.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime61 = instant48.toMutableDateTime((org.joda.time.Chronology) gJChronology52);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.Instant instant63 = instant48.plus(readableDuration62);
        org.joda.time.MutableDateTime mutableDateTime64 = instant63.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant63 and mutableDateTime61", (instant63.compareTo(mutableDateTime61) == 0) == instant63.equals(mutableDateTime61));
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3614");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.year();
        org.joda.time.DurationField durationField8 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.secondOfMinute();
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant11.withDurationAdded(readableDuration12, 0);
        boolean boolean16 = instant14.isEqual((long) 1);
        org.joda.time.Instant instant18 = instant14.withMillis(25200L);
        org.joda.time.DateTime dateTime19 = instant14.toDateTime();
        boolean boolean20 = julianChronology3.equals((java.lang.Object) instant14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime19", (instant14.compareTo(dateTime19) == 0) == instant14.equals(dateTime19));
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3615");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology14.getZone();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology14.getZone();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant20);
        java.lang.String str22 = instant20.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, readableInstant24);
        org.joda.time.Chronology chronology26 = gJChronology25.withUTC();
        java.lang.String str27 = gJChronology25.toString();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.monthOfYear();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology25.dayOfWeek();
        org.joda.time.Instant instant31 = gJChronology25.getGregorianCutover();
        boolean boolean32 = instant20.equals((java.lang.Object) gJChronology25);
        boolean boolean33 = instant11.isAfter((org.joda.time.ReadableInstant) instant20);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant36 = instant20.withDurationAdded(readableDuration34, (int) (byte) 1);
        boolean boolean38 = instant36.isEqual(0L);
        long long39 = instant36.getMillis();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40, readableInstant41);
        org.joda.time.DateTimeZone dateTimeZone43 = gJChronology42.getZone();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology42.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = gJChronology42.getZone();
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46, (org.joda.time.ReadableInstant) instant48);
        org.joda.time.DateTimeField dateTimeField50 = gJChronology49.clockhourOfHalfday();
        org.joda.time.Chronology chronology51 = gJChronology49.withUTC();
        org.joda.time.Instant instant52 = gJChronology49.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Instant instant54 = instant52.minus(readableDuration53);
        org.joda.time.DateTimeZone dateTimeZone55 = instant52.getZone();
        boolean boolean56 = instant36.isAfter((org.joda.time.ReadableInstant) instant52);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone57, readableInstant58);
        org.joda.time.Chronology chronology60 = gJChronology59.withUTC();
        java.lang.String str61 = gJChronology59.toString();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology59.yearOfEra();
        org.joda.time.DurationField durationField63 = gJChronology59.minutes();
        org.joda.time.DurationField durationField64 = gJChronology59.months();
        org.joda.time.MutableDateTime mutableDateTime65 = instant36.toMutableDateTime((org.joda.time.Chronology) gJChronology59);
        org.joda.time.DateTimeField dateTimeField66 = gJChronology59.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime65", (instant20.compareTo(mutableDateTime65) == 0) == instant20.equals(mutableDateTime65));
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3616");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        java.util.Date date5 = instant1.toDate();
        org.joda.time.Instant instant7 = instant1.plus((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = instant7.isSupported(dateTimeFieldType8);
        org.joda.time.Instant instant11 = instant7.withMillis((-60514215257464L));
        boolean boolean13 = instant7.isAfter((-179999601L));
        boolean boolean14 = instant7.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone15 = instant7.getZone();
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant20 = instant17.withDurationAdded(readableDuration18, 0);
        org.joda.time.Instant instant22 = instant20.minus((long) (short) -1);
        boolean boolean23 = instant20.isAfterNow();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant20.minus(readableDuration24);
        int int26 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) instant25);
        org.joda.time.DateTime dateTime27 = instant25.toDateTime();
        java.lang.String str28 = instant25.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime27", (instant1.compareTo(dateTime27) == 0) == instant1.equals(dateTime27));
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3617");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        boolean boolean25 = instant8.isBefore((long) 'a');
        org.joda.time.Instant instant26 = instant8.toInstant();
        boolean boolean27 = instant26.isEqualNow();
        org.joda.time.Instant instant28 = new org.joda.time.Instant((java.lang.Object) instant26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, readableInstant30);
        org.joda.time.DateTimeZone dateTimeZone32 = gJChronology31.getZone();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology31.dayOfYear();
        org.joda.time.Instant instant35 = gJChronology31.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant37 = instant35.minus(readableDuration36);
        org.joda.time.Instant instant40 = instant37.withDurationAdded((-12219292800000L), 0);
        boolean boolean42 = instant37.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, readableInstant44);
        org.joda.time.Chronology chronology46 = gJChronology45.withUTC();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology45.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology45.millisOfDay();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology45.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology45.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology45.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField52 = gJChronology45.monthOfYear();
        boolean boolean53 = instant37.equals((java.lang.Object) dateTimeField52);
        org.joda.time.Instant instant55 = instant37.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        boolean boolean57 = instant55.isSupported(dateTimeFieldType56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = null;
        boolean boolean59 = instant55.isSupported(dateTimeFieldType58);
        org.joda.time.Instant instant62 = instant55.withDurationAdded(151199999L, (int) (short) 100);
        org.joda.time.Instant instant64 = instant62.withMillis(187199999L);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.Instant instant67 = instant62.withDurationAdded(readableDuration65, 1200);
        boolean boolean68 = instant26.isEqual((org.joda.time.ReadableInstant) instant62);
        org.joda.time.DateTime dateTime69 = instant26.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = null;
        boolean boolean71 = instant26.isSupported(dateTimeFieldType70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant26 and dateTime69", (instant26.compareTo(dateTime69) == 0) == instant26.equals(dateTime69));
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3618");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField7 = gJChronology2.years();
        org.joda.time.DurationField durationField8 = gJChronology2.weekyears();
        java.lang.String str9 = gJChronology2.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField8", (durationField7.compareTo(durationField8) == 0) == durationField7.equals(durationField8));
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3619");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        long long2 = instant1.getMillis();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4);
        org.joda.time.Chronology chronology6 = gJChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.millisOfDay();
        org.joda.time.DurationField durationField9 = gJChronology5.halfdays();
        org.joda.time.DurationField durationField10 = gJChronology5.millis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology13 = gJChronology5.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology5.minutes();
        org.joda.time.DurationField durationField15 = gJChronology5.weekyears();
        org.joda.time.DurationField durationField16 = gJChronology5.minutes();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology5.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = instant1.toMutableDateTime((org.joda.time.Chronology) gJChronology5);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone21);
        boolean boolean25 = julianChronology23.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology26 = julianChronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = julianChronology23.era();
        org.joda.time.DateTimeField dateTimeField28 = julianChronology23.minuteOfHour();
        org.joda.time.DurationField durationField29 = julianChronology23.weeks();
        org.joda.time.DurationField durationField30 = julianChronology23.days();
        org.joda.time.DateTimeField dateTimeField31 = julianChronology23.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = julianChronology23.getZone();
        int int34 = dateTimeZone32.getOffset((-35999899L));
        java.lang.String str36 = dateTimeZone32.getNameKey((-126000001L));
        int int38 = dateTimeZone32.getStandardOffset((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39, readableInstant40);
        java.lang.String str42 = gJChronology41.toString();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology41.dayOfYear();
        java.lang.String str44 = gJChronology41.toString();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology41.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology41.monthOfYear();
        org.joda.time.DurationField durationField47 = gJChronology41.hours();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone48, readableInstant49);
        org.joda.time.Chronology chronology51 = gJChronology50.withUTC();
        org.joda.time.DurationField durationField52 = gJChronology50.millis();
        long long56 = gJChronology50.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField57 = gJChronology50.millis();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology50.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology50.clockhourOfHalfday();
        org.joda.time.DurationField durationField60 = gJChronology50.months();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.chrono.GJChronology gJChronology63 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone61, readableInstant62);
        org.joda.time.DateTimeZone dateTimeZone64 = gJChronology63.getZone();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str67 = dateTimeZone66.getID();
        org.joda.time.Chronology chronology68 = gJChronology63.withZone(dateTimeZone66);
        long long71 = dateTimeZone66.convertLocalToUTC((long) (short) 10, false);
        java.util.TimeZone timeZone72 = dateTimeZone66.toTimeZone();
        long long75 = dateTimeZone66.convertLocalToUTC((long) (-1), false);
        org.joda.time.Chronology chronology76 = gJChronology50.withZone(dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField77 = gJChronology50.yearOfEra();
        boolean boolean78 = gJChronology41.equals((java.lang.Object) gJChronology50);
        org.joda.time.DateTimeZone dateTimeZone79 = gJChronology50.getZone();
        long long81 = dateTimeZone32.getMillisKeepLocal(dateTimeZone79, (-35990270L));
        org.joda.time.DateTime dateTime82 = mutableDateTime19.toDateTime(dateTimeZone32);
        java.util.Date date83 = mutableDateTime19.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime82", (instant1.compareTo(dateTime82) == 0) == instant1.equals(dateTime82));
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3620");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        java.lang.String str12 = dateTimeZone8.getNameKey(10L);
        java.lang.String str14 = dateTimeZone8.getName((long) (byte) -1);
        org.joda.time.Chronology chronology15 = gJChronology2.withZone(dateTimeZone8);
        long long18 = dateTimeZone8.adjustOffset(0L, true);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone20);
        boolean boolean24 = julianChronology22.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField25 = julianChronology22.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField26 = julianChronology22.secondOfDay();
        long long30 = julianChronology22.add((long) (short) 1, (long) 1, 36000000);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.chrono.JulianChronology julianChronology34 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone32);
        boolean boolean36 = julianChronology34.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology37 = julianChronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField38 = julianChronology34.era();
        org.joda.time.DateTimeField dateTimeField39 = julianChronology34.minuteOfHour();
        org.joda.time.DurationField durationField40 = julianChronology34.weeks();
        org.joda.time.DurationField durationField41 = julianChronology34.days();
        org.joda.time.DateTimeField dateTimeField42 = julianChronology34.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = julianChronology34.millisOfDay();
        org.joda.time.DurationField durationField44 = julianChronology34.millis();
        org.joda.time.DateTimeField dateTimeField45 = julianChronology34.clockhourOfHalfday();
        boolean boolean46 = julianChronology22.equals((java.lang.Object) julianChronology34);
        boolean boolean47 = dateTimeZone8.equals((java.lang.Object) julianChronology22);
        org.joda.time.Chronology chronology48 = julianChronology22.withUTC();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone50);
        org.joda.time.chrono.JulianChronology julianChronology52 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField53 = julianChronology52.year();
        org.joda.time.DateTimeField dateTimeField54 = julianChronology52.weekyear();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology57 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField58 = julianChronology57.clockhourOfDay();
        org.joda.time.DurationField durationField59 = julianChronology57.hours();
        long long63 = julianChronology57.add((long) 36000000, (long) ' ', 3600000);
        org.joda.time.DateTimeField dateTimeField64 = julianChronology57.dayOfWeek();
        boolean boolean65 = julianChronology52.equals((java.lang.Object) julianChronology57);
        boolean boolean66 = julianChronology22.equals((java.lang.Object) julianChronology52);
        org.joda.time.DateTimeField dateTimeField67 = julianChronology52.clockhourOfHalfday();
        org.joda.time.DurationField durationField68 = julianChronology52.hours();
        java.lang.String str69 = julianChronology52.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField59 and durationField68", (durationField59.compareTo(durationField68) == 0) == durationField59.equals(durationField68));
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3621");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant8.plus(readableDuration12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        boolean boolean15 = instant8.isEqual(readableInstant14);
        org.joda.time.Chronology chronology16 = instant8.getChronology();
        org.joda.time.Chronology chronology17 = instant8.getChronology();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant8.minus(readableDuration18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = instant8.isSupported(dateTimeFieldType20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, readableInstant23);
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology24.getZone();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology24.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology24.dayOfYear();
        org.joda.time.Instant instant28 = gJChronology24.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant30 = instant28.minus(readableDuration29);
        org.joda.time.Instant instant33 = instant30.withDurationAdded((-12219292800000L), 0);
        boolean boolean35 = instant30.isEqual(35L);
        org.joda.time.Instant instant36 = instant30.toInstant();
        boolean boolean38 = instant36.isBefore((long) ' ');
        long long39 = instant36.getMillis();
        boolean boolean40 = instant8.isEqual((org.joda.time.ReadableInstant) instant36);
        org.joda.time.MutableDateTime mutableDateTime41 = instant8.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime42 = instant8.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime41", (instant8.compareTo(mutableDateTime41) == 0) == instant8.equals(mutableDateTime41));
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3622");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant3.withMillis((long) (byte) -1);
        org.joda.time.Instant instant7 = instant5.plus((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone9.getName((-1L), locale12);
        long long15 = dateTimeZone9.previousTransition((long) '#');
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        org.joda.time.chrono.JulianChronology julianChronology19 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField20 = julianChronology19.weeks();
        org.joda.time.DurationField durationField21 = julianChronology19.millis();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology19.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = julianChronology19.add(readablePeriod23, (long) 36000000, 4);
        boolean boolean27 = dateTimeZone9.equals((java.lang.Object) 36000000);
        long long29 = dateTimeZone9.nextTransition((-36000001L));
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone31.getName((-1L), locale34);
        long long37 = dateTimeZone31.previousTransition((long) '#');
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone39);
        org.joda.time.chrono.JulianChronology julianChronology41 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone39);
        org.joda.time.DurationField durationField42 = julianChronology41.weeks();
        org.joda.time.DurationField durationField43 = julianChronology41.millis();
        org.joda.time.DateTimeField dateTimeField44 = julianChronology41.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        long long48 = julianChronology41.add(readablePeriod45, (long) 36000000, 4);
        boolean boolean49 = dateTimeZone31.equals((java.lang.Object) 36000000);
        long long51 = dateTimeZone9.getMillisKeepLocal(dateTimeZone31, (-36000001L));
        boolean boolean52 = dateTimeZone9.isFixed();
        org.joda.time.DateTime dateTime53 = instant5.toDateTime(dateTimeZone9);
        boolean boolean54 = dateTime53.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology57 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone58, readableInstant59);
        org.joda.time.DateTimeZone dateTimeZone61 = gJChronology60.getZone();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology60.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField63 = gJChronology60.dayOfYear();
        org.joda.time.Instant instant64 = gJChronology60.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.Instant instant66 = instant64.minus(readableDuration65);
        org.joda.time.Instant instant69 = instant66.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.Instant instant71 = instant66.plus(readableDuration70);
        org.joda.time.chrono.GJChronology gJChronology72 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone56, (org.joda.time.ReadableInstant) instant71);
        int int74 = dateTimeZone56.getOffset(151200000L);
        long long76 = dateTimeZone56.nextTransition((-35998030L));
        org.joda.time.DateTime dateTime77 = dateTime53.toDateTime(dateTimeZone56);
        long long78 = dateTime53.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime77", (instant5.compareTo(dateTime77) == 0) == instant5.equals(dateTime77));
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3623");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        org.joda.time.Instant instant6 = instant4.minus((long) (short) -1);
        boolean boolean8 = instant4.isEqual((long) (short) 1);
        java.lang.String str9 = instant4.toString();
        org.joda.time.Instant instant12 = instant4.withDurationAdded((-1L), 5);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = instant12.isSupported(dateTimeFieldType13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant12.minus(readableDuration15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology19.getZone();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology19.getZone();
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant25);
        java.lang.String str27 = instant25.toString();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29);
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology30.getZone();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology30.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology30.dayOfYear();
        org.joda.time.Instant instant34 = gJChronology30.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant34.minus(readableDuration35);
        org.joda.time.Instant instant39 = instant36.withDurationAdded((-12219292800000L), 0);
        int int40 = instant25.compareTo((org.joda.time.ReadableInstant) instant36);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Instant instant42 = instant25.minus(readableDuration41);
        java.util.Date date43 = instant25.toDate();
        boolean boolean45 = instant25.isBefore((-62112218399999L));
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology48 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = julianChronology48.secondOfMinute();
        long long53 = julianChronology48.add((-35999900L), 0L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField54 = julianChronology48.dayOfWeek();
        int int55 = instant25.get(dateTimeField54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.chrono.GJChronology gJChronology58 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone56, readableInstant57);
        org.joda.time.DateTimeZone dateTimeZone59 = gJChronology58.getZone();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology58.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField61 = gJChronology58.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone62 = gJChronology58.getZone();
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology65 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone62, (org.joda.time.ReadableInstant) instant64);
        java.lang.String str66 = instant64.toString();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.chrono.GJChronology gJChronology69 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone67, readableInstant68);
        org.joda.time.DateTimeZone dateTimeZone70 = gJChronology69.getZone();
        org.joda.time.DateTimeField dateTimeField71 = gJChronology69.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField72 = gJChronology69.dayOfYear();
        org.joda.time.Instant instant73 = gJChronology69.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.Instant instant75 = instant73.minus(readableDuration74);
        org.joda.time.Instant instant78 = instant75.withDurationAdded((-12219292800000L), 0);
        int int79 = instant64.compareTo((org.joda.time.ReadableInstant) instant75);
        long long80 = instant64.getMillis();
        org.joda.time.Instant instant83 = instant64.withDurationAdded((long) '#', 278);
        org.joda.time.Instant instant86 = instant83.withDurationAdded((long) 4, (int) (short) -1);
        boolean boolean87 = instant25.isAfter((org.joda.time.ReadableInstant) instant86);
        org.joda.time.ReadableDuration readableDuration88 = null;
        org.joda.time.Instant instant89 = instant25.plus(readableDuration88);
        org.joda.time.ReadableDuration readableDuration90 = null;
        org.joda.time.Instant instant91 = instant25.plus(readableDuration90);
        org.joda.time.DateTime dateTime92 = instant91.toDateTimeISO();
        boolean boolean93 = instant12.isAfter((org.joda.time.ReadableInstant) instant91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime92", (instant1.compareTo(dateTime92) == 0) == instant1.equals(dateTime92));
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3624");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.minuteOfDay();
        boolean boolean12 = julianChronology3.equals((java.lang.Object) dateTimeField11);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.secondOfMinute();
        int int14 = julianChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField15 = julianChronology3.months();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology3.secondOfMinute();
        int int17 = julianChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology3.hourOfDay();
        org.joda.time.DurationField durationField20 = julianChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField4, and durationField7", !(durationField20.compareTo(durationField4) == 0) || (Math.signum(durationField20.compareTo(durationField7)) == Math.signum(durationField4.compareTo(durationField7))));
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3625");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant3.withMillis((long) (byte) -1);
        org.joda.time.Instant instant7 = instant5.plus((long) (short) 0);
        java.lang.String str8 = instant7.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        boolean boolean14 = julianChronology12.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology15 = julianChronology12.withUTC();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology17 = julianChronology12.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField18 = julianChronology12.days();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology12.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str22 = dateTimeZone21.getID();
        boolean boolean23 = dateTimeZone21.isFixed();
        long long25 = dateTimeZone21.previousTransition(100L);
        java.util.TimeZone timeZone26 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.Chronology chronology28 = julianChronology12.withZone(dateTimeZone27);
        java.util.TimeZone timeZone29 = dateTimeZone27.toTimeZone();
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology30.getZone();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, readableInstant33);
        org.joda.time.DateTimeZone dateTimeZone35 = gJChronology34.getZone();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology34.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology34.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = gJChronology34.getZone();
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone38, (org.joda.time.ReadableInstant) instant40);
        long long43 = dateTimeZone38.nextTransition((long) 0);
        long long45 = dateTimeZone31.getMillisKeepLocal(dateTimeZone38, (long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = instant7.toMutableDateTime(dateTimeZone31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone50);
        org.joda.time.chrono.JulianChronology julianChronology52 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone50);
        boolean boolean54 = julianChronology52.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology55 = julianChronology52.withUTC();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology57 = julianChronology52.withZone(dateTimeZone56);
        org.joda.time.DurationField durationField58 = julianChronology52.days();
        org.joda.time.DateTimeField dateTimeField59 = julianChronology52.millisOfSecond();
        java.lang.Object obj60 = null;
        boolean boolean61 = julianChronology52.equals(obj60);
        org.joda.time.DateTime dateTime62 = mutableDateTime46.toDateTime((org.joda.time.Chronology) julianChronology52);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.Instant instant67 = instant64.withDurationAdded(readableDuration65, 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = null;
        java.lang.String str69 = instant64.toString(dateTimeFormatter68);
        org.joda.time.Instant instant71 = new org.joda.time.Instant(0L);
        long long72 = instant71.getMillis();
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.Instant instant74 = instant71.minus(readableDuration73);
        boolean boolean75 = instant64.isEqual((org.joda.time.ReadableInstant) instant71);
        org.joda.time.MutableDateTime mutableDateTime76 = instant64.toMutableDateTime();
        boolean boolean77 = dateTime62.isAfter((org.joda.time.ReadableInstant) mutableDateTime76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime46", (instant5.compareTo(mutableDateTime46) == 0) == instant5.equals(mutableDateTime46));
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3626");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.weeks();
        org.joda.time.DurationField durationField5 = julianChronology3.millis();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.yearOfCentury();
        org.joda.time.DurationField durationField9 = julianChronology3.seconds();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, readableInstant11);
        org.joda.time.Chronology chronology13 = gJChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology12.getZone();
        java.lang.String str19 = dateTimeZone18.getID();
        long long21 = dateTimeZone18.nextTransition((-61513207200000L));
        java.lang.String str23 = dateTimeZone18.getNameKey(3129100L);
        org.joda.time.Chronology chronology24 = julianChronology3.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology25 = julianChronology3.withUTC();
        org.joda.time.DurationField durationField26 = chronology25.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField4, and durationField5", !(durationField26.compareTo(durationField4) == 0) || (Math.signum(durationField26.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3627");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant8.plus(readableDuration24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26, readableInstant27);
        org.joda.time.DateTimeZone dateTimeZone29 = gJChronology28.getZone();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology28.dayOfYear();
        org.joda.time.Instant instant32 = gJChronology28.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime35 = instant32.toMutableDateTime(dateTimeZone34);
        boolean boolean37 = mutableDateTime35.equals((java.lang.Object) (-35999900L));
        long long38 = mutableDateTime35.getMillis();
        boolean boolean39 = mutableDateTime35.isEqualNow();
        org.joda.time.Instant instant40 = mutableDateTime35.toInstant();
        boolean boolean41 = instant25.isEqual((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.Instant instant42 = instant25.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and mutableDateTime35", (instant17.compareTo(mutableDateTime35) == 0) == instant17.equals(mutableDateTime35));
    }
}

