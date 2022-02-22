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
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.years();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField5", (durationField3.compareTo(durationField5) == 0) == durationField3.equals(durationField5));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField5", (durationField3.compareTo(durationField5) == 0) == durationField3.equals(durationField5));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.DurationField durationField7 = chronology2.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.seconds();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.secondOfDay();
        org.joda.time.DurationField durationField7 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField4", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = durationFieldType0.getField(chronology3);
        org.joda.time.DurationField durationField7 = chronology3.years();
        org.joda.time.DurationField durationField8 = chronology3.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str53 = dateTimeZone51.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfDay();
        long long56 = property55.remainder();
        org.joda.time.LocalDateTime localDateTime57 = property55.roundFloorCopy();
        boolean boolean58 = instant50.equals((java.lang.Object) localDateTime57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime57.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str53 = dateTimeZone51.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime54.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.DateTime dateTime61 = localDateTime59.toDateTime(readableInstant60);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str64 = dateTimeZone62.getShortName((long) (short) 10);
        long long66 = dateTimeZone62.convertUTCToLocal((long) ' ');
        java.lang.String str67 = dateTimeZone62.toString();
        long long69 = dateTimeZone62.previousTransition(32L);
        long long72 = dateTimeZone62.convertLocalToUTC(97L, false);
        boolean boolean73 = dateTime61.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str76 = dateTimeZone74.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime77 = org.joda.time.LocalDateTime.now(dateTimeZone74);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.millisOfDay();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime77.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.DateTime dateTime84 = localDateTime82.toDateTime(readableInstant83);
        long long85 = dateTime84.getMillis();
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str88 = dateTimeZone86.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime89 = org.joda.time.LocalDateTime.now(dateTimeZone86);
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = localDateTime89.getFieldType((int) (short) 0);
        boolean boolean92 = dateTime84.isSupported(dateTimeFieldType91);
        boolean boolean93 = dateTime61.isAfter((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.DateTimeZone dateTimeZone94 = dateTime84.getZone();
        long long95 = dateTime84.getMillis();
        boolean boolean96 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.Instant instant97 = dateTime25.toInstant();
        org.joda.time.Chronology chronology98 = instant97.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType5.getDurationType();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.hours();
        org.joda.time.DurationField durationField12 = durationFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField14 = chronology10.weeks();
        org.joda.time.DurationField durationField15 = durationFieldType6.getField(chronology10);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weekyears();
        org.joda.time.DurationField durationField21 = chronology19.centuries();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology19.clockhourOfHalfday();
        boolean boolean25 = durationFieldType6.isSupported(chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField20", (durationField15.compareTo(durationField20) == 0) == durationField15.equals(durationField20));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        long long15 = dateTimeZone11.convertUTCToLocal((long) ' ');
        java.lang.String str16 = dateTimeZone11.toString();
        long long18 = dateTimeZone11.previousTransition(32L);
        long long21 = dateTimeZone11.convertLocalToUTC(97L, false);
        boolean boolean22 = dateTime10.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        long long34 = dateTime33.getMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDateTime38.getFieldType((int) (short) 0);
        boolean boolean41 = dateTime33.isSupported(dateTimeFieldType40);
        boolean boolean42 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str45 = dateTimeZone43.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime51.toDateTime(readableInstant52);
        long long54 = dateTime53.getMillis();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str57 = dateTimeZone55.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(dateTimeZone55);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = localDateTime58.getFieldType((int) (short) 0);
        boolean boolean61 = dateTime53.isSupported(dateTimeFieldType60);
        boolean boolean62 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Instant instant63 = dateTime53.toInstant();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.plusSeconds(9);
        org.joda.time.LocalDateTime.Property property69 = localDateTime65.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime65.withCenturyOfEra(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.LocalDateTime.Property property73 = localDateTime71.property(dateTimeFieldType72);
        boolean boolean74 = dateTime53.isSupported(dateTimeFieldType72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant63", (dateTime10.compareTo(instant63) == 0) == dateTime10.equals(instant63));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.monthOfYear();
        org.joda.time.DurationField durationField7 = chronology2.months();
        org.joda.time.DurationField durationField8 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str53 = dateTimeZone51.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfDay();
        long long56 = property55.remainder();
        org.joda.time.LocalDateTime localDateTime57 = property55.roundFloorCopy();
        boolean boolean58 = instant50.equals((java.lang.Object) localDateTime57);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.withPeriodAdded(readablePeriod59, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = durationFieldType0.getField(chronology3);
        org.joda.time.DurationField durationField7 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        int int5 = property4.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property4.setCopy((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DurationField durationField13 = durationFieldType8.getField(chronology11);
        boolean boolean14 = localDateTime7.isSupported(durationFieldType8);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType15.getField(chronology16);
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = dateTimeField17.getAsShortText(100, locale20);
        int int23 = dateTimeField17.getLeapAmount((long) (short) 100);
        org.joda.time.DurationField durationField24 = dateTimeField17.getRangeDurationField();
        boolean boolean25 = dateTimeField17.isLenient();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = dateTimeField17.getType();
        boolean boolean27 = localDateTime7.isSupported(dateTimeFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField24", (durationField13.compareTo(durationField24) == 0) == durationField13.equals(durationField24));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str3 = dateTimeZone1.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.minuteOfHour();
        int int9 = property8.get();
        org.joda.time.LocalDateTime localDateTime11 = property8.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.year();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        java.lang.String str15 = localDateTime14.toString();
        int int16 = localDateTime14.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusMonths(2);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        long long31 = dateTime30.getMillis();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str34 = dateTimeZone32.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = localDateTime35.getFieldType((int) (short) 0);
        boolean boolean38 = dateTime30.isSupported(dateTimeFieldType37);
        org.joda.time.DateTime dateTime39 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str42 = dateTimeZone40.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.millisOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.DateTime dateTime50 = localDateTime48.toDateTime(readableInstant49);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str53 = dateTimeZone51.getShortName((long) (short) 10);
        long long55 = dateTimeZone51.convertUTCToLocal((long) ' ');
        java.lang.String str56 = dateTimeZone51.toString();
        long long58 = dateTimeZone51.previousTransition(32L);
        long long61 = dateTimeZone51.convertLocalToUTC(97L, false);
        boolean boolean62 = dateTime50.equals((java.lang.Object) false);
        boolean boolean63 = dateTime39.isEqual((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Instant instant64 = dateTime39.toInstant();
        long long65 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) instant64);
        org.joda.time.DateTimeZone dateTimeZone66 = instant64.getZone();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((java.lang.Object) "26150748", dateTimeZone66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant64", (dateTime39.compareTo(instant64) == 0) == dateTime39.equals(instant64));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str1 = durationFieldType0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.DurationField durationField7 = chronology5.centuries();
        org.joda.time.DurationField durationField8 = durationFieldType2.getField(chronology5);
        boolean boolean9 = durationFieldType0.isSupported(chronology5);
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField10", (durationField6.compareTo(durationField10) == 0) == durationField6.equals(durationField10));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str1 = durationFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime();
        java.lang.String str3 = localDateTime2.toString();
        int int4 = localDateTime2.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusMonths(2);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime(readableInstant17);
        long long19 = dateTime18.getMillis();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime23.getFieldType((int) (short) 0);
        boolean boolean26 = dateTime18.isSupported(dateTimeFieldType25);
        org.joda.time.DateTime dateTime27 = localDateTime6.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str30 = dateTimeZone28.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str41 = dateTimeZone39.getShortName((long) (short) 10);
        long long43 = dateTimeZone39.convertUTCToLocal((long) ' ');
        java.lang.String str44 = dateTimeZone39.toString();
        long long46 = dateTimeZone39.previousTransition(32L);
        long long49 = dateTimeZone39.convertLocalToUTC(97L, false);
        boolean boolean50 = dateTime38.equals((java.lang.Object) false);
        boolean boolean51 = dateTime27.isEqual((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Chronology chronology52 = dateTime38.getChronology();
        org.joda.time.DurationField durationField53 = durationFieldType0.getField(chronology52);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology56 = localDateTime55.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.hours();
        org.joda.time.DurationField durationField58 = durationFieldType0.getField(chronology56);
        org.joda.time.DurationField durationField59 = chronology56.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField53 and durationField58", (durationField53.compareTo(durationField58) == 0) == durationField53.equals(durationField58));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str53 = dateTimeZone51.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime54.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.DateTime dateTime61 = localDateTime59.toDateTime(readableInstant60);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str64 = dateTimeZone62.getShortName((long) (short) 10);
        long long66 = dateTimeZone62.convertUTCToLocal((long) ' ');
        java.lang.String str67 = dateTimeZone62.toString();
        long long69 = dateTimeZone62.previousTransition(32L);
        long long72 = dateTimeZone62.convertLocalToUTC(97L, false);
        boolean boolean73 = dateTime61.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str76 = dateTimeZone74.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime77 = org.joda.time.LocalDateTime.now(dateTimeZone74);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.millisOfDay();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime77.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.DateTime dateTime84 = localDateTime82.toDateTime(readableInstant83);
        long long85 = dateTime84.getMillis();
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str88 = dateTimeZone86.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime89 = org.joda.time.LocalDateTime.now(dateTimeZone86);
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = localDateTime89.getFieldType((int) (short) 0);
        boolean boolean92 = dateTime84.isSupported(dateTimeFieldType91);
        boolean boolean93 = dateTime61.isAfter((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.DateTimeZone dateTimeZone94 = dateTime84.getZone();
        long long95 = dateTime84.getMillis();
        boolean boolean96 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime84);
        long long97 = dateTime84.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.monthOfYear();
        org.joda.time.DurationField durationField7 = chronology2.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName((long) (short) 10);
        long long12 = dateTimeZone8.convertUTCToLocal((long) ' ');
        java.lang.String str13 = dateTimeZone8.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.Chronology chronology15 = chronology2.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = chronology15.weekyears();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField5", (durationField3.compareTo(durationField5) == 0) == durationField3.equals(durationField5));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.monthOfYear();
        org.joda.time.DurationField durationField7 = chronology2.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName((long) (short) 10);
        long long12 = dateTimeZone8.convertUTCToLocal((long) ' ');
        java.lang.String str13 = dateTimeZone8.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.Chronology chronology15 = chronology2.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = chronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology3);
        org.joda.time.DurationField durationField7 = chronology3.millis();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.halfdayOfDay();
        org.joda.time.DurationField durationField10 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField4, and durationField5", !(durationField10.compareTo(durationField4) == 0) || (Math.signum(durationField10.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.era();
        org.joda.time.DurationField durationField7 = dateTimeField6.getDurationField();
        int int9 = dateTimeField6.get((long) 34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.centuries();
        boolean boolean8 = localDateTime5.equals((java.lang.Object) durationFieldType7);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfDay();
        org.joda.time.DurationField durationField14 = durationFieldType7.getField(chronology11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getShortName((long) (short) 10);
        long long19 = dateTimeZone15.convertUTCToLocal((long) ' ');
        java.lang.String str20 = dateTimeZone15.toString();
        long long23 = dateTimeZone15.adjustOffset((long) (short) 100, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.Chronology chronology25 = chronology11.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField26 = durationFieldType1.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField27 = chronology11.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField26", (durationField12.compareTo(durationField26) == 0) == durationField12.equals(durationField26));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDurationAdded(readableDuration2, (int) '#');
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis((-1));
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        java.lang.String str9 = localDateTime8.toString();
        int int10 = localDateTime8.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minusMonths(2);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localDateTime22.toDateTime(readableInstant23);
        long long25 = dateTime24.getMillis();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = localDateTime29.getFieldType((int) (short) 0);
        boolean boolean32 = dateTime24.isSupported(dateTimeFieldType31);
        org.joda.time.DateTime dateTime33 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str36 = dateTimeZone34.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime42.toDateTime(readableInstant43);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str47 = dateTimeZone45.getShortName((long) (short) 10);
        long long49 = dateTimeZone45.convertUTCToLocal((long) ' ');
        java.lang.String str50 = dateTimeZone45.toString();
        long long52 = dateTimeZone45.previousTransition(32L);
        long long55 = dateTimeZone45.convertLocalToUTC(97L, false);
        boolean boolean56 = dateTime44.equals((java.lang.Object) false);
        boolean boolean57 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Instant instant58 = dateTime33.toInstant();
        org.joda.time.DateTime dateTime59 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime60 = localDateTime0.toDateTime((org.joda.time.ReadableInstant) dateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant58", (dateTime33.compareTo(instant58) == 0) == dateTime33.equals(instant58));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.era();
        int int5 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.weekyear();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str8 = durationFieldType7.toString();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        java.lang.String str10 = localDateTime9.toString();
        int int11 = localDateTime9.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusMonths(2);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime(readableInstant24);
        long long26 = dateTime25.getMillis();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str29 = dateTimeZone27.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(dateTimeZone27);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = localDateTime30.getFieldType((int) (short) 0);
        boolean boolean33 = dateTime25.isSupported(dateTimeFieldType32);
        org.joda.time.DateTime dateTime34 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.DateTime dateTime45 = localDateTime43.toDateTime(readableInstant44);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str48 = dateTimeZone46.getShortName((long) (short) 10);
        long long50 = dateTimeZone46.convertUTCToLocal((long) ' ');
        java.lang.String str51 = dateTimeZone46.toString();
        long long53 = dateTimeZone46.previousTransition(32L);
        long long56 = dateTimeZone46.convertLocalToUTC(97L, false);
        boolean boolean57 = dateTime45.equals((java.lang.Object) false);
        boolean boolean58 = dateTime34.isEqual((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Chronology chronology59 = dateTime45.getChronology();
        org.joda.time.DurationField durationField60 = durationFieldType7.getField(chronology59);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology63 = localDateTime62.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.hours();
        org.joda.time.DurationField durationField65 = durationFieldType7.getField(chronology63);
        boolean boolean66 = localDateTime0.isSupported(durationFieldType7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField60 and durationField65", (durationField60.compareTo(durationField65) == 0) == durationField60.equals(durationField65));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        java.lang.String str8 = localDateTime7.toString();
        int int9 = localDateTime7.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusMonths(2);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str15 = dateTimeZone13.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime(readableInstant22);
        long long24 = dateTime23.getMillis();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str27 = dateTimeZone25.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localDateTime28.getFieldType((int) (short) 0);
        boolean boolean31 = dateTime23.isSupported(dateTimeFieldType30);
        org.joda.time.DateTime dateTime32 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str35 = dateTimeZone33.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localDateTime41.toDateTime(readableInstant42);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str46 = dateTimeZone44.getShortName((long) (short) 10);
        long long48 = dateTimeZone44.convertUTCToLocal((long) ' ');
        java.lang.String str49 = dateTimeZone44.toString();
        long long51 = dateTimeZone44.previousTransition(32L);
        long long54 = dateTimeZone44.convertLocalToUTC(97L, false);
        boolean boolean55 = dateTime43.equals((java.lang.Object) false);
        boolean boolean56 = dateTime32.isEqual((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Instant instant57 = dateTime32.toInstant();
        org.joda.time.DateTime dateTime58 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str61 = dateTimeZone59.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now(dateTimeZone59);
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.millisOfDay();
        org.joda.time.ReadableInstant readableInstant64 = null;
        long long65 = property63.getDifferenceAsLong(readableInstant64);
        org.joda.time.DurationField durationField66 = property63.getLeapDurationField();
        java.util.Locale locale67 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet68 = locale67.getUnicodeLocaleAttributes();
        java.lang.String str69 = locale67.getLanguage();
        java.lang.String str70 = locale67.toLanguageTag();
        java.lang.String str71 = property63.getAsShortText(locale67);
        org.joda.time.LocalDateTime localDateTime72 = property63.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plusSeconds(1);
        int int75 = localDateTime72.getSecondOfMinute();
        org.joda.time.DateTime dateTime76 = localDateTime72.toDateTime();
        boolean boolean77 = dateTime58.isAfter((org.joda.time.ReadableInstant) dateTime76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant57", (dateTime32.compareTo(instant57) == 0) == dateTime32.equals(instant57));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.centuries();
        boolean boolean8 = localDateTime5.equals((java.lang.Object) durationFieldType7);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfDay();
        org.joda.time.DurationField durationField14 = durationFieldType7.getField(chronology11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getShortName((long) (short) 10);
        long long19 = dateTimeZone15.convertUTCToLocal((long) ' ');
        java.lang.String str20 = dateTimeZone15.toString();
        long long23 = dateTimeZone15.adjustOffset((long) (short) 100, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.Chronology chronology25 = chronology11.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField26 = durationFieldType1.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField27 = chronology11.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField26", (durationField12.compareTo(durationField26) == 0) == durationField12.equals(durationField26));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = durationFieldType0.getField(chronology3);
        org.joda.time.DurationField durationField7 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str53 = dateTimeZone51.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime54.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.DateTime dateTime61 = localDateTime59.toDateTime(readableInstant60);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str64 = dateTimeZone62.getShortName((long) (short) 10);
        long long66 = dateTimeZone62.convertUTCToLocal((long) ' ');
        java.lang.String str67 = dateTimeZone62.toString();
        long long69 = dateTimeZone62.previousTransition(32L);
        long long72 = dateTimeZone62.convertLocalToUTC(97L, false);
        boolean boolean73 = dateTime61.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str76 = dateTimeZone74.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime77 = org.joda.time.LocalDateTime.now(dateTimeZone74);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.millisOfDay();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime77.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.DateTime dateTime84 = localDateTime82.toDateTime(readableInstant83);
        long long85 = dateTime84.getMillis();
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str88 = dateTimeZone86.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime89 = org.joda.time.LocalDateTime.now(dateTimeZone86);
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = localDateTime89.getFieldType((int) (short) 0);
        boolean boolean92 = dateTime84.isSupported(dateTimeFieldType91);
        boolean boolean93 = dateTime61.isAfter((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.DateTimeZone dateTimeZone94 = dateTime84.getZone();
        long long95 = dateTime84.getMillis();
        boolean boolean96 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.Chronology chronology97 = dateTime84.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology3);
        org.joda.time.DateTimeField dateTimeField7 = chronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField4, and durationField5", !(durationField9.compareTo(durationField4) == 0) || (Math.signum(durationField9.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.era();
        org.joda.time.DurationField durationField7 = dateTimeField6.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusHours((int) '4');
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.era();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusMinutes((-86340));
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withDurationAdded(readableDuration21, (int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType25.getField(chronology26);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale30 = locale29.stripExtensions();
        java.lang.String str31 = dateTimeField27.getAsShortText(100, locale30);
        int int32 = property24.getMaximumShortTextLength(locale30);
        boolean boolean33 = locale30.hasExtensions();
        java.lang.String str34 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDateTime16, locale30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str1 = durationFieldType0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.DurationField durationField7 = chronology5.centuries();
        org.joda.time.DurationField durationField8 = durationFieldType2.getField(chronology5);
        boolean boolean9 = durationFieldType0.isSupported(chronology5);
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField10", (durationField6.compareTo(durationField10) == 0) == durationField6.equals(durationField10));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.dayOfYear();
        org.joda.time.DurationField durationField8 = chronology2.days();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType10.getField(chronology11);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = dateTimeField12.getAsShortText(100, locale15);
        int int18 = dateTimeField12.getLeapAmount((long) (short) 100);
        org.joda.time.DurationField durationField19 = dateTimeField12.getRangeDurationField();
        boolean boolean20 = dateTimeField12.isLenient();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = dateTimeField12.getType();
        int int22 = localDateTime9.indexOf(dateTimeFieldType21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField19", (durationField8.compareTo(durationField19) == 0) == durationField8.equals(durationField19));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.dayOfYear();
        org.joda.time.DurationField durationField4 = chronology2.eras();
        org.joda.time.DurationField durationField5 = chronology2.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField5, and durationField4", !(durationField4.compareTo(durationField5) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField5.compareTo(durationField4))));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.weekyears();
        org.joda.time.DurationField durationField6 = chronology4.centuries();
        org.joda.time.DurationField durationField7 = chronology4.minutes();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology4);
        boolean boolean9 = dateTimeFieldType1.isSupported(chronology4);
        org.joda.time.DateTimeZone dateTimeZone10 = chronology4.getZone();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 55005041, chronology4);
        org.joda.time.DurationField durationField12 = chronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField5, and durationField6", !(durationField12.compareTo(durationField5) == 0) || (Math.signum(durationField12.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.centuries();
        boolean boolean8 = localDateTime5.equals((java.lang.Object) durationFieldType7);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfDay();
        org.joda.time.DurationField durationField14 = durationFieldType7.getField(chronology11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getShortName((long) (short) 10);
        long long19 = dateTimeZone15.convertUTCToLocal((long) ' ');
        java.lang.String str20 = dateTimeZone15.toString();
        long long23 = dateTimeZone15.adjustOffset((long) (short) 100, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.Chronology chronology25 = chronology11.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField26 = durationFieldType1.getField(chronology11);
        java.lang.String str27 = durationFieldType1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField26", (durationField12.compareTo(durationField26) == 0) == durationField12.equals(durationField26));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        int int8 = property7.get();
        org.joda.time.LocalDateTime localDateTime10 = property7.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.year();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        java.lang.String str14 = localDateTime13.toString();
        int int15 = localDateTime13.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusMonths(2);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime(readableInstant28);
        long long30 = dateTime29.getMillis();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = localDateTime34.getFieldType((int) (short) 0);
        boolean boolean37 = dateTime29.isSupported(dateTimeFieldType36);
        org.joda.time.DateTime dateTime38 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str41 = dateTimeZone39.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.millisOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.DateTime dateTime49 = localDateTime47.toDateTime(readableInstant48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName((long) (short) 10);
        long long54 = dateTimeZone50.convertUTCToLocal((long) ' ');
        java.lang.String str55 = dateTimeZone50.toString();
        long long57 = dateTimeZone50.previousTransition(32L);
        long long60 = dateTimeZone50.convertLocalToUTC(97L, false);
        boolean boolean61 = dateTime49.equals((java.lang.Object) false);
        boolean boolean62 = dateTime38.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Instant instant63 = dateTime38.toInstant();
        long long64 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) instant63);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.withDurationAdded(readableDuration66, (int) '#');
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.weekyear();
        org.joda.time.LocalDateTime localDateTime70 = property69.roundHalfFloorCopy();
        int int71 = property12.compareTo((org.joda.time.ReadablePartial) localDateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and instant63", (dateTime38.compareTo(instant63) == 0) == dateTime38.equals(instant63));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withFieldAdded(durationFieldType5, 26149500);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.minusHours((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        java.lang.String str11 = localDateTime10.toString();
        int int12 = localDateTime10.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusMonths(2);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str18 = dateTimeZone16.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime(readableInstant25);
        long long27 = dateTime26.getMillis();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str30 = dateTimeZone28.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(dateTimeZone28);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = localDateTime31.getFieldType((int) (short) 0);
        boolean boolean34 = dateTime26.isSupported(dateTimeFieldType33);
        org.joda.time.DateTime dateTime35 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str38 = dateTimeZone36.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localDateTime44.toDateTime(readableInstant45);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str49 = dateTimeZone47.getShortName((long) (short) 10);
        long long51 = dateTimeZone47.convertUTCToLocal((long) ' ');
        java.lang.String str52 = dateTimeZone47.toString();
        long long54 = dateTimeZone47.previousTransition(32L);
        long long57 = dateTimeZone47.convertLocalToUTC(97L, false);
        boolean boolean58 = dateTime46.equals((java.lang.Object) false);
        boolean boolean59 = dateTime35.isEqual((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Instant instant60 = dateTime35.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int62 = instant60.get(dateTimeFieldType61);
        int int63 = localDateTime3.get(dateTimeFieldType61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant60", (dateTime35.compareTo(instant60) == 0) == dateTime35.equals(instant60));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str1 = durationFieldType0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.DurationField durationField7 = chronology5.centuries();
        org.joda.time.DurationField durationField8 = durationFieldType2.getField(chronology5);
        boolean boolean9 = durationFieldType0.isSupported(chronology5);
        org.joda.time.DurationField durationField10 = chronology5.years();
        long long14 = chronology5.add(1645629378487L, 315446400000L, 999);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField10", (durationField6.compareTo(durationField10) == 0) == durationField6.equals(durationField10));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale4 = locale1.stripExtensions();
        java.lang.String str5 = locale4.getISO3Language();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        java.lang.String str7 = localDateTime6.toString();
        int int8 = localDateTime6.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(2);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime(readableInstant21);
        long long23 = dateTime22.getMillis();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str26 = dateTimeZone24.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = localDateTime27.getFieldType((int) (short) 0);
        boolean boolean30 = dateTime22.isSupported(dateTimeFieldType29);
        org.joda.time.DateTime dateTime31 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str34 = dateTimeZone32.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localDateTime40.toDateTime(readableInstant41);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str45 = dateTimeZone43.getShortName((long) (short) 10);
        long long47 = dateTimeZone43.convertUTCToLocal((long) ' ');
        java.lang.String str48 = dateTimeZone43.toString();
        long long50 = dateTimeZone43.previousTransition(32L);
        long long53 = dateTimeZone43.convertLocalToUTC(97L, false);
        boolean boolean54 = dateTime42.equals((java.lang.Object) false);
        boolean boolean55 = dateTime31.isEqual((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Instant instant56 = dateTime31.toInstant();
        java.util.Locale locale57 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet58 = locale57.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet59 = locale57.getUnicodeLocaleAttributes();
        boolean boolean60 = instant56.equals((java.lang.Object) locale57);
        java.lang.String str61 = locale4.getDisplayLanguage(locale57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant56", (dateTime31.compareTo(instant56) == 0) == dateTime31.equals(instant56));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long4 = dateTimeField2.roundFloor((long) (-1));
        org.joda.time.DurationField durationField5 = dateTimeField2.getDurationField();
        java.lang.String str7 = dateTimeField2.getAsText(0L);
        long long9 = dateTimeField2.roundHalfCeiling(1645629364123L);
        long long11 = dateTimeField2.roundHalfCeiling((-31L));
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weekyears();
        org.joda.time.DurationField durationField18 = chronology16.centuries();
        org.joda.time.DurationField durationField19 = chronology16.minutes();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology16);
        boolean boolean21 = dateTimeFieldType13.isSupported(chronology16);
        org.joda.time.DateTimeZone dateTimeZone22 = chronology16.getZone();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 55005041, chronology16);
        java.util.Locale locale24 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet26 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str27 = locale24.getDisplayLanguage();
        java.lang.String str28 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localDateTime23, locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField19", (durationField5.compareTo(durationField19) == 0) == durationField5.equals(durationField19));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.DurationField durationField7 = chronology2.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        boolean boolean7 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DurationField durationField13 = durationFieldType8.getField(chronology11);
        org.joda.time.Chronology chronology14 = chronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.weekOfWeekyear();
        boolean boolean17 = durationFieldType0.isSupported(chronology11);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.centuries();
        boolean boolean24 = localDateTime21.equals((java.lang.Object) durationFieldType23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withWeekOfWeekyear((int) (byte) 10);
        int int27 = localDateTime26.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.plus(readablePeriod28);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.years();
        boolean boolean32 = durationFieldType0.isSupported(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField31", (durationField4.compareTo(durationField31) == 0) == durationField4.equals(durationField31));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.DurationField durationField9 = chronology2.years();
        org.joda.time.DurationField durationField10 = chronology2.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology2.eras();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusMillis((-1));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYear((int) (short) 100);
        java.lang.String str14 = localDateTime13.toString();
        boolean boolean15 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDateTime13);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray18 = strSet17.toArray();
        boolean boolean19 = strSet17.isEmpty();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray22 = strSet21.toArray();
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        boolean boolean25 = strSet21.removeAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray30 = new org.joda.time.DurationFieldType[] { durationFieldType28, durationFieldType29 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = strSet27.toArray(durationFieldTypeArray30);
        boolean boolean32 = strSet21.containsAll((java.util.Collection<java.lang.String>) strSet27);
        java.lang.Object[] objArray33 = strSet27.toArray();
        boolean boolean34 = strSet17.removeAll((java.util.Collection<java.lang.String>) strSet27);
        java.util.Locale locale35 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray37 = strSet36.toArray();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        boolean boolean40 = strSet36.removeAll((java.util.Collection<java.lang.String>) strSet39);
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray45 = new org.joda.time.DurationFieldType[] { durationFieldType43, durationFieldType44 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray46 = strSet42.toArray(durationFieldTypeArray45);
        boolean boolean47 = strSet36.containsAll((java.util.Collection<java.lang.String>) strSet42);
        java.util.Locale locale48 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray50 = strSet49.toArray();
        java.util.Locale locale51 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        boolean boolean53 = strSet49.removeAll((java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale locale54 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray58 = new org.joda.time.DurationFieldType[] { durationFieldType56, durationFieldType57 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray59 = strSet55.toArray(durationFieldTypeArray58);
        boolean boolean60 = strSet49.containsAll((java.util.Collection<java.lang.String>) strSet55);
        java.lang.Object[] objArray61 = strSet55.toArray();
        boolean boolean62 = strSet36.retainAll((java.util.Collection<java.lang.String>) strSet55);
        boolean boolean63 = strSet27.addAll((java.util.Collection<java.lang.String>) strSet55);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean65 = strSet55.remove((java.lang.Object) dateTimeFieldType64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime3.property(dateTimeFieldType64);
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.weekyears();
        org.joda.time.DurationField durationField72 = chronology70.centuries();
        org.joda.time.DurationField durationField73 = durationFieldType67.getField(chronology70);
        boolean boolean74 = dateTimeFieldType64.isSupported(chronology70);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str77 = dateTimeZone75.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime78 = org.joda.time.LocalDateTime.now(dateTimeZone75);
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.millisOfDay();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime78.plusMonths((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod82 = null;
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.plus(readablePeriod82);
        long long85 = chronology70.set((org.joda.time.ReadablePartial) localDateTime83, 864000010L);
        org.joda.time.DurationField durationField86 = chronology70.weekyears();
        org.joda.time.DateTimeField dateTimeField87 = chronology70.millisOfSecond();
        org.joda.time.DurationField durationField88 = chronology70.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField88, durationField71, and durationField72", !(durationField88.compareTo(durationField71) == 0) || (Math.signum(durationField88.compareTo(durationField72)) == Math.signum(durationField71.compareTo(durationField72))));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        long long4 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.lang.String str5 = dateTimeZone0.toString();
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone0.getShortName((long) (-1), locale9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withField(dateTimeFieldType12, (int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType12.getDurationType();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weekyears();
        org.joda.time.DurationField durationField21 = chronology19.centuries();
        org.joda.time.DurationField durationField22 = durationFieldType16.getField(chronology19);
        org.joda.time.DurationField durationField23 = chronology19.years();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType12.getField(chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField23", (durationField20.compareTo(durationField23) == 0) == durationField20.equals(durationField23));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField5", (durationField3.compareTo(durationField5) == 0) == durationField3.equals(durationField5));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        boolean boolean5 = dateTimeFieldType0.isSupported(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        java.lang.String str7 = localDateTime6.toString();
        int int8 = localDateTime6.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(2);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime(readableInstant21);
        long long23 = dateTime22.getMillis();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str26 = dateTimeZone24.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = localDateTime27.getFieldType((int) (short) 0);
        boolean boolean30 = dateTime22.isSupported(dateTimeFieldType29);
        org.joda.time.DateTime dateTime31 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        int[] intArray33 = chronology3.get((org.joda.time.ReadablePartial) localDateTime10, 11L);
        org.joda.time.DateTimeField dateTimeField34 = chronology3.centuryOfEra();
        org.joda.time.DurationField durationField35 = chronology3.years();
        org.joda.time.Chronology chronology36 = chronology3.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField35", (durationField4.compareTo(durationField35) == 0) == durationField4.equals(durationField35));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.DurationField durationField7 = chronology2.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        boolean boolean6 = localDateTime3.equals((java.lang.Object) durationFieldType5);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField12 = durationFieldType5.getField(chronology9);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.weekyears();
        org.joda.time.DurationField durationField17 = chronology15.seconds();
        org.joda.time.DurationField durationField18 = durationFieldType5.getField(chronology15);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology15.add(readablePeriod19, 153L, (int) '4');
        org.joda.time.DurationField durationField23 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField10, and durationField12", !(durationField23.compareTo(durationField10) == 0) || (Math.signum(durationField23.compareTo(durationField12)) == Math.signum(durationField10.compareTo(durationField12))));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withEra((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.lang.String str25 = dateTimeField21.getAsShortText(100, locale24);
        int int27 = dateTimeField21.getLeapAmount((long) (short) 100);
        java.lang.String str28 = dateTimeField21.getName();
        long long31 = dateTimeField21.add((long) (short) 1, 0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str34 = dateTimeZone32.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfDay();
        org.joda.time.ReadableInstant readableInstant37 = null;
        long long38 = property36.getDifferenceAsLong(readableInstant37);
        org.joda.time.DurationField durationField39 = property36.getLeapDurationField();
        java.lang.String str40 = property36.getAsString();
        org.joda.time.LocalDateTime localDateTime41 = property36.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.weekyears();
        boolean boolean48 = dateTimeFieldType43.isSupported(chronology46);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime();
        java.lang.String str50 = localDateTime49.toString();
        int int51 = localDateTime49.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.minusMonths(2);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str57 = dateTimeZone55.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(dateTimeZone55);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.millisOfDay();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime58.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.DateTime dateTime65 = localDateTime63.toDateTime(readableInstant64);
        long long66 = dateTime65.getMillis();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str69 = dateTimeZone67.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now(dateTimeZone67);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = localDateTime70.getFieldType((int) (short) 0);
        boolean boolean73 = dateTime65.isSupported(dateTimeFieldType72);
        org.joda.time.DateTime dateTime74 = localDateTime53.toDateTime((org.joda.time.ReadableInstant) dateTime65);
        int[] intArray76 = chronology46.get((org.joda.time.ReadablePartial) localDateTime53, 11L);
        int[] intArray78 = dateTimeField21.add((org.joda.time.ReadablePartial) localDateTime41, (int) (short) 10, intArray76, (int) (byte) 0);
        chronology2.validate((org.joda.time.ReadablePartial) localDateTime17, intArray76);
        org.joda.time.LocalDateTime.Property property80 = localDateTime17.era();
        org.joda.time.DurationField durationField81 = property80.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField81, durationField3, and durationField4", !(durationField81.compareTo(durationField3) == 0) || (Math.signum(durationField81.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = durationFieldType0.getField(chronology3);
        org.joda.time.DurationField durationField7 = chronology3.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        long long13 = property12.remainder();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        java.lang.String str16 = localDateTime15.toString();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.plusMonths((int) (short) -1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.yearOfEra();
        int int20 = property12.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime22 = property12.setCopy(26151696);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.lang.String str29 = dateTimeField25.getAsShortText(100, locale28);
        int int31 = dateTimeField25.getLeapAmount((long) (short) 100);
        java.lang.String str32 = dateTimeField25.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = dateTimeField25.getType();
        org.joda.time.LocalDateTime.Property property34 = localDateTime22.property(dateTimeFieldType33);
        long long36 = chronology3.set((org.joda.time.ReadablePartial) localDateTime22, 1645629480641L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        boolean boolean5 = dateTimeFieldType0.isSupported(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        java.lang.String str7 = localDateTime6.toString();
        int int8 = localDateTime6.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(2);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime(readableInstant21);
        long long23 = dateTime22.getMillis();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str26 = dateTimeZone24.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = localDateTime27.getFieldType((int) (short) 0);
        boolean boolean30 = dateTime22.isSupported(dateTimeFieldType29);
        org.joda.time.DateTime dateTime31 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        int[] intArray33 = chronology3.get((org.joda.time.ReadablePartial) localDateTime10, 11L);
        org.joda.time.DateTimeField dateTimeField34 = chronology3.centuryOfEra();
        org.joda.time.DurationField durationField35 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField36 = chronology3.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField35", (durationField4.compareTo(durationField35) == 0) == durationField4.equals(durationField35));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withFieldAdded(durationFieldType15, 26149500);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minusHours((int) 'a');
        long long21 = chronology2.set((org.joda.time.ReadablePartial) localDateTime19, 1908343039481L);
        org.joda.time.DateTimeZone dateTimeZone22 = chronology2.getZone();
        org.joda.time.DateTimeField dateTimeField23 = chronology2.centuryOfEra();
        org.joda.time.DurationField durationField24 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField3, and durationField4", !(durationField24.compareTo(durationField3) == 0) || (Math.signum(durationField24.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.DurationField durationField9 = chronology2.years();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.era();
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.DurationField durationField8 = dateTimeField6.getDurationField();
        int int10 = dateTimeField6.getMaximumValue(2260528390380000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        boolean boolean6 = localDateTime3.equals((java.lang.Object) durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime3.getFieldTypes();
        java.lang.String str8 = localDateTime3.toString();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.plusMillis(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType11.getField(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime3.withField(dateTimeFieldType11, 2);
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType11.getDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.weekyears();
        boolean boolean22 = dateTimeFieldType17.isSupported(chronology20);
        org.joda.time.DurationField durationField23 = chronology20.centuries();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.year();
        boolean boolean25 = durationFieldType16.isSupported(chronology20);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((-100L), chronology29);
        org.joda.time.DateTimeField dateTimeField33 = chronology29.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = chronology29.dayOfWeek();
        boolean boolean35 = durationFieldType16.isSupported(chronology29);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology38 = localDateTime37.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.weekyears();
        org.joda.time.DurationField durationField40 = chronology38.seconds();
        org.joda.time.DurationField durationField41 = chronology38.seconds();
        org.joda.time.DurationField durationField42 = chronology38.seconds();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.secondOfDay();
        org.joda.time.DateTimeField dateTimeField44 = chronology38.secondOfMinute();
        boolean boolean45 = durationFieldType16.isSupported(chronology38);
        org.joda.time.DateTimeZone dateTimeZone46 = chronology38.getZone();
        org.joda.time.DurationField durationField47 = chronology38.halfdays();
        org.joda.time.DurationField durationField48 = chronology38.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField48, durationField21, and durationField23", !(durationField48.compareTo(durationField21) == 0) || (Math.signum(durationField48.compareTo(durationField23)) == Math.signum(durationField21.compareTo(durationField23))));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.era();
        int int5 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekOfWeekyear((int) (byte) 1);
        int int8 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        java.lang.String str12 = durationFieldType11.toString();
        boolean boolean13 = localDateTime10.isSupported(durationFieldType11);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        org.joda.time.DurationField durationField19 = chronology17.centuries();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology17);
        org.joda.time.DurationField durationField21 = chronology17.millis();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.minuteOfDay();
        org.joda.time.DurationField durationField23 = durationFieldType11.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField24 = chronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField27 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.halfdayOfDay();
        org.joda.time.DurationField durationField29 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField18, and durationField19", !(durationField29.compareTo(durationField18) == 0) || (Math.signum(durationField29.compareTo(durationField19)) == Math.signum(durationField18.compareTo(durationField19))));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.DurationField durationField9 = chronology2.years();
        org.joda.time.DurationFieldType durationFieldType10 = durationField9.getType();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.centuries();
        boolean boolean17 = localDateTime14.equals((java.lang.Object) durationFieldType16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.plusDays(67);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime(dateTimeZone22);
        org.joda.time.Chronology chronology24 = dateTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.minutes();
        boolean boolean26 = durationFieldType10.isSupported(chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = durationFieldType0.getField(chronology3);
        org.joda.time.DurationField durationField7 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray2 = strSet1.toArray();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str5 = dateTimeZone3.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.centuries();
        boolean boolean9 = localDateTime6.equals((java.lang.Object) durationFieldType8);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localDateTime6.getFieldTypes();
        java.lang.String str11 = localDateTime6.toString();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plusMillis(22);
        org.joda.time.LocalDateTime.Property property14 = localDateTime6.monthOfYear();
        boolean boolean15 = strSet1.remove((java.lang.Object) property14);
        org.joda.time.LocalDateTime localDateTime16 = property14.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime17 = property14.getLocalDateTime();
        int int18 = property14.getLeapAmount();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        java.lang.String str24 = property23.getName();
        org.joda.time.LocalDateTime localDateTime25 = property23.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str31 = dateTimeZone29.getShortName((long) (short) 10);
        long long33 = dateTimeZone29.convertUTCToLocal((long) ' ');
        java.lang.String str34 = dateTimeZone29.toString();
        boolean boolean36 = dateTimeZone29.equals((java.lang.Object) (short) 100);
        java.util.Locale locale38 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str39 = dateTimeZone29.getShortName((long) (-1), locale38);
        long long42 = dateTimeZone29.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone29);
        org.joda.time.DateTime dateTime44 = localDateTime27.toDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str47 = dateTimeZone45.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        java.lang.String str50 = property49.getName();
        org.joda.time.LocalDateTime localDateTime51 = property49.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean53 = localDateTime51.isSupported(dateTimeFieldType52);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str56 = dateTimeZone54.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now(dateTimeZone54);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType59 = org.joda.time.DurationFieldType.centuries();
        boolean boolean60 = localDateTime57.equals((java.lang.Object) durationFieldType59);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray61 = localDateTime57.getFieldTypes();
        java.lang.String str62 = localDateTime57.toString();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime57.plusMillis(22);
        boolean boolean65 = localDateTime51.isBefore((org.joda.time.ReadablePartial) localDateTime64);
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.plus(readableDuration66);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.withDurationAdded(readableDuration68, 26169);
        org.joda.time.DateTime dateTime71 = localDateTime67.toDateTime();
        org.joda.time.DateTime dateTime72 = localDateTime27.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTimeZone dateTimeZone73 = dateTime72.getZone();
        org.joda.time.Instant instant74 = dateTime72.toInstant();
        org.joda.time.DateTimeZone dateTimeZone75 = dateTime72.getZone();
        int int76 = property14.getDifference((org.joda.time.ReadableInstant) dateTime72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant74", (dateTime44.compareTo(instant74) == 0) == dateTime44.equals(instant74));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        boolean boolean5 = dateTimeFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.halfdayOfDay();
        org.joda.time.DurationField durationField7 = chronology3.weeks();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.minuteOfDay();
        org.joda.time.DurationField durationField10 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology3.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.dayOfYear();
        org.joda.time.DurationField durationField4 = chronology2.eras();
        org.joda.time.DurationField durationField5 = chronology2.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField5, and durationField4", !(durationField4.compareTo(durationField5) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField5.compareTo(durationField4))));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField3, and durationField4", !(durationField6.compareTo(durationField3) == 0) || (Math.signum(durationField6.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        long long15 = dateTimeZone11.convertUTCToLocal((long) ' ');
        java.lang.String str16 = dateTimeZone11.toString();
        long long18 = dateTimeZone11.previousTransition(32L);
        long long21 = dateTimeZone11.convertLocalToUTC(97L, false);
        boolean boolean22 = dateTime10.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        long long34 = dateTime33.getMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDateTime38.getFieldType((int) (short) 0);
        boolean boolean41 = dateTime33.isSupported(dateTimeFieldType40);
        boolean boolean42 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str45 = dateTimeZone43.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime51.toDateTime(readableInstant52);
        long long54 = dateTime53.getMillis();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str57 = dateTimeZone55.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(dateTimeZone55);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = localDateTime58.getFieldType((int) (short) 0);
        boolean boolean61 = dateTime53.isSupported(dateTimeFieldType60);
        boolean boolean62 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime();
        java.lang.String str64 = localDateTime63.toString();
        int int65 = localDateTime63.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.minusMonths(2);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str71 = dateTimeZone69.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime72 = org.joda.time.LocalDateTime.now(dateTimeZone69);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.millisOfDay();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime72.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.DateTime dateTime79 = localDateTime77.toDateTime(readableInstant78);
        long long80 = dateTime79.getMillis();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str83 = dateTimeZone81.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime84 = org.joda.time.LocalDateTime.now(dateTimeZone81);
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = localDateTime84.getFieldType((int) (short) 0);
        boolean boolean87 = dateTime79.isSupported(dateTimeFieldType86);
        org.joda.time.DateTime dateTime88 = localDateTime67.toDateTime((org.joda.time.ReadableInstant) dateTime79);
        java.lang.String str89 = dateTime88.toString();
        boolean boolean90 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.Instant instant91 = dateTime88.toInstant();
        org.joda.time.Instant instant92 = instant91.toInstant();
        org.joda.time.DateTimeZone dateTimeZone93 = instant91.getZone();
        int int95 = dateTimeZone93.getOffset(1645629513178L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime88 and instant91", (dateTime88.compareTo(instant91) == 0) == dateTime88.equals(instant91));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        long long51 = instant50.getMillis();
        org.joda.time.Instant instant52 = instant50.toInstant();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str55 = dateTimeZone53.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now(dateTimeZone53);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.millisOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime56.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.DateTime dateTime63 = localDateTime61.toDateTime(readableInstant62);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str66 = dateTimeZone64.getShortName((long) (short) 10);
        long long68 = dateTimeZone64.convertUTCToLocal((long) ' ');
        java.lang.String str69 = dateTimeZone64.toString();
        long long71 = dateTimeZone64.previousTransition(32L);
        long long74 = dateTimeZone64.convertLocalToUTC(97L, false);
        boolean boolean75 = dateTime63.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str78 = dateTimeZone76.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime79 = org.joda.time.LocalDateTime.now(dateTimeZone76);
        org.joda.time.LocalDateTime.Property property80 = localDateTime79.millisOfDay();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime79.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime79.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.DateTime dateTime86 = localDateTime84.toDateTime(readableInstant85);
        long long87 = dateTime86.getMillis();
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str90 = dateTimeZone88.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime91 = org.joda.time.LocalDateTime.now(dateTimeZone88);
        org.joda.time.DateTimeFieldType dateTimeFieldType93 = localDateTime91.getFieldType((int) (short) 0);
        boolean boolean94 = dateTime86.isSupported(dateTimeFieldType93);
        boolean boolean95 = dateTime63.isAfter((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.DateTimeZone dateTimeZone96 = dateTime86.getZone();
        boolean boolean97 = instant52.isEqual((org.joda.time.ReadableInstant) dateTime86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant52", (dateTime25.compareTo(instant52) == 0) == dateTime25.equals(instant52));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology3);
        org.joda.time.DateTimeField dateTimeField7 = chronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusDays(0);
        long long14 = chronology3.set((org.joda.time.ReadablePartial) localDateTime12, (long) 24);
        org.joda.time.DurationField durationField15 = chronology3.minutes();
        org.joda.time.DurationField durationField16 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField17 = chronology3.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField16", (durationField4.compareTo(durationField16) == 0) == durationField4.equals(durationField16));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        long long15 = dateTimeZone11.convertUTCToLocal((long) ' ');
        java.lang.String str16 = dateTimeZone11.toString();
        long long18 = dateTimeZone11.previousTransition(32L);
        long long21 = dateTimeZone11.convertLocalToUTC(97L, false);
        boolean boolean22 = dateTime10.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        long long34 = dateTime33.getMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDateTime38.getFieldType((int) (short) 0);
        boolean boolean41 = dateTime33.isSupported(dateTimeFieldType40);
        boolean boolean42 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime33);
        java.lang.String str43 = dateTime10.toString();
        long long44 = dateTime10.getMillis();
        org.joda.time.Chronology chronology45 = dateTime10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str48 = dateTimeZone46.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now(dateTimeZone46);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.millisOfDay();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime54.toDateTime(readableInstant55);
        long long57 = dateTime56.getMillis();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str60 = dateTimeZone58.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime61 = org.joda.time.LocalDateTime.now(dateTimeZone58);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = localDateTime61.getFieldType((int) (short) 0);
        boolean boolean64 = dateTime56.isSupported(dateTimeFieldType63);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str67 = dateTimeZone65.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now(dateTimeZone65);
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.millisOfDay();
        org.joda.time.ReadableInstant readableInstant70 = null;
        long long71 = property69.getDifferenceAsLong(readableInstant70);
        org.joda.time.DurationField durationField72 = property69.getLeapDurationField();
        java.lang.String str73 = property69.getAsString();
        org.joda.time.LocalDateTime localDateTime74 = property69.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str79 = dateTimeZone77.getShortName((long) (short) 10);
        long long81 = dateTimeZone77.convertUTCToLocal((long) ' ');
        java.lang.String str82 = dateTimeZone77.toString();
        boolean boolean84 = dateTimeZone77.equals((java.lang.Object) (short) 100);
        java.util.Locale locale86 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str87 = dateTimeZone77.getShortName((long) (-1), locale86);
        org.joda.time.LocalDateTime localDateTime88 = new org.joda.time.LocalDateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime89 = localDateTime76.toDateTime(dateTimeZone77);
        boolean boolean90 = dateTime56.isEqual((org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.Instant instant91 = dateTime56.toInstant();
        boolean boolean92 = dateTime10.equals((java.lang.Object) instant91);
        org.joda.time.DateTimeZone dateTimeZone93 = instant91.getZone();
        java.util.TimeZone timeZone94 = dateTimeZone93.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime56 and instant91", (dateTime56.compareTo(instant91) == 0) == dateTime56.equals(instant91));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.era();
        int int5 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekOfWeekyear((int) (byte) 1);
        int int8 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        java.lang.String str12 = durationFieldType11.toString();
        boolean boolean13 = localDateTime10.isSupported(durationFieldType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        boolean boolean19 = dateTimeFieldType14.isSupported(chronology17);
        org.joda.time.DurationField durationField20 = durationFieldType11.getField(chronology17);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology17.add(readablePeriod21, (long) 27427155, (int) (byte) 0);
        org.joda.time.DurationField durationField25 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        int int29 = dateTimeField26.getDifference((long) 356, 1645514199918L);
        org.joda.time.DurationField durationField30 = dateTimeField26.getDurationField();
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.hours();
        org.joda.time.DurationField durationField37 = durationFieldType32.getField(chronology35);
        org.joda.time.DateTimeField dateTimeField38 = chronology35.hourOfHalfday();
        long long40 = dateTimeField38.roundHalfEven((long) (short) 0);
        long long42 = dateTimeField38.remainder((long) 100);
        long long44 = dateTimeField38.remainder((-27427140000L));
        boolean boolean45 = dateTimeField38.isLenient();
        java.util.Locale.Builder builder47 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder49 = builder47.addUnicodeLocaleAttribute("und");
        java.util.Locale locale50 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = locale50.getDisplayCountry(locale51);
        java.lang.String str53 = locale51.getDisplayName();
        java.util.Locale.Builder builder54 = builder49.setLocale(locale51);
        java.util.Locale.Builder builder56 = builder49.setScript("");
        java.util.Locale locale57 = builder49.build();
        java.lang.String str58 = dateTimeField38.getAsShortText(1645629362661L, locale57);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str61 = dateTimeZone59.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now(dateTimeZone59);
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.millisOfDay();
        long long64 = property63.remainder();
        org.joda.time.LocalDateTime localDateTime65 = property63.roundFloorCopy();
        java.lang.String str66 = property63.getAsShortText();
        java.lang.String str67 = property63.getAsString();
        int int68 = property63.getMaximumValueOverall();
        org.joda.time.DurationField durationField69 = property63.getLeapDurationField();
        org.joda.time.DurationField durationField70 = property63.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime71 = property63.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime72 = property63.withMaximumValue();
        java.util.Locale.Category category74 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale75 = java.util.Locale.FRENCH;
        java.util.Locale.setDefault(category74, locale75);
        java.lang.String str77 = locale75.getDisplayName();
        java.lang.String str78 = locale75.getDisplayName();
        java.lang.String str79 = locale75.getDisplayName();
        java.lang.String str80 = locale75.getISO3Country();
        java.lang.String str81 = dateTimeField38.getAsText((org.joda.time.ReadablePartial) localDateTime72, 915, locale75);
        java.lang.String str82 = dateTimeField26.getAsText(1645629399160L, locale75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField30", (durationField18.compareTo(durationField30) == 0) == durationField18.equals(durationField30));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.weekyears();
        boolean boolean6 = dateTimeFieldType1.isSupported(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.centuries();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName((long) (short) 10);
        long long14 = dateTimeZone10.convertUTCToLocal((long) ' ');
        java.lang.String str15 = dateTimeZone10.toString();
        long long18 = dateTimeZone10.adjustOffset((long) (short) 100, false);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone10);
        int int21 = dateTimeZone10.getOffset(1645629363422L);
        long long23 = dateTimeZone10.convertUTCToLocal((-4871L));
        long long26 = dateTimeZone10.convertLocalToUTC((-86340L), true);
        java.lang.String str27 = dateTimeZone10.toString();
        org.joda.time.Chronology chronology28 = chronology4.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField29 = durationFieldType0.getField(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField5, and durationField7", !(durationField29.compareTo(durationField5) == 0) || (Math.signum(durationField29.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        java.lang.String str5 = property4.getName();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName((long) (short) 10);
        long long14 = dateTimeZone10.convertUTCToLocal((long) ' ');
        java.lang.String str15 = dateTimeZone10.toString();
        boolean boolean17 = dateTimeZone10.equals((java.lang.Object) (short) 100);
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = dateTimeZone10.getShortName((long) (-1), locale19);
        long long23 = dateTimeZone10.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone10);
        org.joda.time.DateTime dateTime25 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        java.lang.String str31 = property30.getName();
        org.joda.time.LocalDateTime localDateTime32 = property30.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean34 = localDateTime32.isSupported(dateTimeFieldType33);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.centuries();
        boolean boolean41 = localDateTime38.equals((java.lang.Object) durationFieldType40);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray42 = localDateTime38.getFieldTypes();
        java.lang.String str43 = localDateTime38.toString();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime38.plusMillis(22);
        boolean boolean46 = localDateTime32.isBefore((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.plus(readableDuration47);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withDurationAdded(readableDuration49, 26169);
        org.joda.time.DateTime dateTime52 = localDateTime48.toDateTime();
        org.joda.time.DateTime dateTime53 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTime53.getZone();
        org.joda.time.Instant instant55 = dateTime53.toInstant();
        org.joda.time.DateTimeZone dateTimeZone56 = dateTime53.getZone();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str59 = dateTimeZone57.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime60 = org.joda.time.LocalDateTime.now(dateTimeZone57);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.millisOfDay();
        java.lang.String str62 = property61.getName();
        org.joda.time.LocalDateTime localDateTime63 = property61.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean65 = localDateTime63.isSupported(dateTimeFieldType64);
        int int66 = dateTime53.get(dateTimeFieldType64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant55", (dateTime25.compareTo(instant55) == 0) == dateTime25.equals(instant55));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        java.lang.String str27 = localDateTime26.toString();
        int int28 = localDateTime26.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.minusMonths(2);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str34 = dateTimeZone32.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localDateTime40.toDateTime(readableInstant41);
        long long43 = dateTime42.getMillis();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str46 = dateTimeZone44.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now(dateTimeZone44);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = localDateTime47.getFieldType((int) (short) 0);
        boolean boolean50 = dateTime42.isSupported(dateTimeFieldType49);
        org.joda.time.DateTime dateTime51 = localDateTime30.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str54 = dateTimeZone52.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.millisOfDay();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime55.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.DateTime dateTime62 = localDateTime60.toDateTime(readableInstant61);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str65 = dateTimeZone63.getShortName((long) (short) 10);
        long long67 = dateTimeZone63.convertUTCToLocal((long) ' ');
        java.lang.String str68 = dateTimeZone63.toString();
        long long70 = dateTimeZone63.previousTransition(32L);
        long long73 = dateTimeZone63.convertLocalToUTC(97L, false);
        boolean boolean74 = dateTime62.equals((java.lang.Object) false);
        boolean boolean75 = dateTime51.isEqual((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Instant instant76 = dateTime51.toInstant();
        long long77 = instant76.getMillis();
        boolean boolean78 = dateTime16.isBefore((org.joda.time.ReadableInstant) instant76);
        org.joda.time.DateTimeZone dateTimeZone79 = dateTime16.getZone();
        java.lang.String str80 = dateTimeZone79.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant76", (dateTime25.compareTo(instant76) == 0) == dateTime25.equals(instant76));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        long long11 = dateTime10.getMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = localDateTime15.getFieldType((int) (short) 0);
        boolean boolean18 = dateTime10.isSupported(dateTimeFieldType17);
        long long19 = dateTime10.getMillis();
        org.joda.time.Instant instant20 = dateTime10.toInstant();
        org.joda.time.Chronology chronology21 = dateTime10.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant20", (dateTime10.compareTo(instant20) == 0) == dateTime10.equals(instant20));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str53 = dateTimeZone51.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfDay();
        long long56 = property55.remainder();
        org.joda.time.LocalDateTime localDateTime57 = property55.roundFloorCopy();
        boolean boolean58 = instant50.equals((java.lang.Object) localDateTime57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.minusYears(81287455);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.ReadableInstant readableInstant5 = null;
        long long6 = property4.getDifferenceAsLong(readableInstant5);
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale7.getISO3Language();
        java.lang.String str9 = property4.getAsShortText(locale7);
        org.joda.time.DurationField durationField10 = property4.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        java.lang.String str16 = property15.getName();
        org.joda.time.LocalDateTime localDateTime17 = property15.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str23 = dateTimeZone21.getShortName((long) (short) 10);
        long long25 = dateTimeZone21.convertUTCToLocal((long) ' ');
        java.lang.String str26 = dateTimeZone21.toString();
        boolean boolean28 = dateTimeZone21.equals((java.lang.Object) (short) 100);
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = dateTimeZone21.getShortName((long) (-1), locale30);
        long long34 = dateTimeZone21.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone21);
        org.joda.time.DateTime dateTime36 = localDateTime19.toDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now(dateTimeZone37);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfDay();
        java.lang.String str42 = property41.getName();
        org.joda.time.LocalDateTime localDateTime43 = property41.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean45 = localDateTime43.isSupported(dateTimeFieldType44);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str48 = dateTimeZone46.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now(dateTimeZone46);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.centuries();
        boolean boolean52 = localDateTime49.equals((java.lang.Object) durationFieldType51);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray53 = localDateTime49.getFieldTypes();
        java.lang.String str54 = localDateTime49.toString();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime49.plusMillis(22);
        boolean boolean57 = localDateTime43.isBefore((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.plus(readableDuration58);
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.withDurationAdded(readableDuration60, 26169);
        org.joda.time.DateTime dateTime63 = localDateTime59.toDateTime();
        org.joda.time.DateTime dateTime64 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTimeZone dateTimeZone65 = dateTime64.getZone();
        org.joda.time.Instant instant66 = dateTime64.toInstant();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str69 = dateTimeZone67.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now(dateTimeZone67);
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.millisOfDay();
        java.lang.String str72 = property71.getName();
        org.joda.time.LocalDateTime localDateTime73 = property71.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str79 = dateTimeZone77.getShortName((long) (short) 10);
        long long81 = dateTimeZone77.convertUTCToLocal((long) ' ');
        java.lang.String str82 = dateTimeZone77.toString();
        boolean boolean84 = dateTimeZone77.equals((java.lang.Object) (short) 100);
        java.util.Locale locale86 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str87 = dateTimeZone77.getShortName((long) (-1), locale86);
        long long90 = dateTimeZone77.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime91 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone77);
        org.joda.time.DateTime dateTime92 = localDateTime75.toDateTime(dateTimeZone77);
        boolean boolean93 = instant66.isBefore((org.joda.time.ReadableInstant) dateTime92);
        long long94 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) instant66);
        int int95 = property4.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant66", (dateTime36.compareTo(instant66) == 0) == dateTime36.equals(instant66));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        long long51 = instant50.getMillis();
        org.joda.time.Instant instant52 = instant50.toInstant();
        org.joda.time.Chronology chronology53 = instant52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusSeconds(9);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minus(readableDuration6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.DurationField durationField13 = chronology11.centuries();
        org.joda.time.DurationField durationField14 = durationFieldType8.getField(chronology11);
        java.lang.String str15 = durationFieldType8.getName();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime7.withFieldAdded(durationFieldType8, 25822088);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime7.minusMonths(26269);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        java.lang.String str22 = localDateTime21.toString();
        int int23 = localDateTime21.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.minusMonths(2);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str29 = dateTimeZone27.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.DateTime dateTime37 = localDateTime35.toDateTime(readableInstant36);
        long long38 = dateTime37.getMillis();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str41 = dateTimeZone39.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now(dateTimeZone39);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = localDateTime42.getFieldType((int) (short) 0);
        boolean boolean45 = dateTime37.isSupported(dateTimeFieldType44);
        org.joda.time.DateTime dateTime46 = localDateTime25.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str49 = dateTimeZone47.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now(dateTimeZone47);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.millisOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime50.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.DateTime dateTime57 = localDateTime55.toDateTime(readableInstant56);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str60 = dateTimeZone58.getShortName((long) (short) 10);
        long long62 = dateTimeZone58.convertUTCToLocal((long) ' ');
        java.lang.String str63 = dateTimeZone58.toString();
        long long65 = dateTimeZone58.previousTransition(32L);
        long long68 = dateTimeZone58.convertLocalToUTC(97L, false);
        boolean boolean69 = dateTime57.equals((java.lang.Object) false);
        boolean boolean70 = dateTime46.isEqual((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Instant instant71 = dateTime46.toInstant();
        java.util.Locale locale72 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet74 = locale72.getUnicodeLocaleAttributes();
        boolean boolean75 = instant71.equals((java.lang.Object) locale72);
        java.lang.String str76 = localDateTime19.toString("26275973", locale72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and instant71", (dateTime46.compareTo(instant71) == 0) == dateTime46.equals(instant71));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.ReadableInstant readableInstant5 = null;
        long long6 = property4.getDifferenceAsLong(readableInstant5);
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale7.getISO3Language();
        java.lang.String str9 = property4.getAsShortText(locale7);
        org.joda.time.DurationField durationField10 = property4.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        java.lang.String str16 = property15.getName();
        org.joda.time.LocalDateTime localDateTime17 = property15.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str23 = dateTimeZone21.getShortName((long) (short) 10);
        long long25 = dateTimeZone21.convertUTCToLocal((long) ' ');
        java.lang.String str26 = dateTimeZone21.toString();
        boolean boolean28 = dateTimeZone21.equals((java.lang.Object) (short) 100);
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = dateTimeZone21.getShortName((long) (-1), locale30);
        long long34 = dateTimeZone21.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone21);
        org.joda.time.DateTime dateTime36 = localDateTime19.toDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now(dateTimeZone37);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfDay();
        java.lang.String str42 = property41.getName();
        org.joda.time.LocalDateTime localDateTime43 = property41.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean45 = localDateTime43.isSupported(dateTimeFieldType44);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str48 = dateTimeZone46.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now(dateTimeZone46);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.centuries();
        boolean boolean52 = localDateTime49.equals((java.lang.Object) durationFieldType51);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray53 = localDateTime49.getFieldTypes();
        java.lang.String str54 = localDateTime49.toString();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime49.plusMillis(22);
        boolean boolean57 = localDateTime43.isBefore((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.plus(readableDuration58);
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.withDurationAdded(readableDuration60, 26169);
        org.joda.time.DateTime dateTime63 = localDateTime59.toDateTime();
        org.joda.time.DateTime dateTime64 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTimeZone dateTimeZone65 = dateTime64.getZone();
        org.joda.time.Instant instant66 = dateTime64.toInstant();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str69 = dateTimeZone67.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now(dateTimeZone67);
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.millisOfDay();
        java.lang.String str72 = property71.getName();
        org.joda.time.LocalDateTime localDateTime73 = property71.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str79 = dateTimeZone77.getShortName((long) (short) 10);
        long long81 = dateTimeZone77.convertUTCToLocal((long) ' ');
        java.lang.String str82 = dateTimeZone77.toString();
        boolean boolean84 = dateTimeZone77.equals((java.lang.Object) (short) 100);
        java.util.Locale locale86 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str87 = dateTimeZone77.getShortName((long) (-1), locale86);
        long long90 = dateTimeZone77.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime91 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone77);
        org.joda.time.DateTime dateTime92 = localDateTime75.toDateTime(dateTimeZone77);
        boolean boolean93 = instant66.isBefore((org.joda.time.ReadableInstant) dateTime92);
        long long94 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) instant66);
        java.util.Locale locale95 = null;
        java.lang.String str96 = property4.getAsText(locale95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant66", (dateTime36.compareTo(instant66) == 0) == dateTime36.equals(instant66));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        boolean boolean6 = localDateTime3.equals((java.lang.Object) durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime3.getFieldTypes();
        java.lang.String str8 = localDateTime3.toString();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.plusMillis(22);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology13 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withDurationAdded(readableDuration17, (int) '#');
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.weekyear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusMillis((-1));
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYear((int) (short) 100);
        java.lang.String str30 = localDateTime29.toString();
        boolean boolean31 = localDateTime19.isAfter((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withEra((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.withYear(26163523);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime29.plus(readablePeriod36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str41 = dateTimeZone39.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.millisOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withEra((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.secondOfMinute();
        java.lang.String str53 = property52.getAsShortText();
        int int54 = property52.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.withDurationAdded(readableDuration56, (int) '#');
        org.joda.time.LocalDateTime.Property property59 = localDateTime55.era();
        int int60 = property52.compareTo((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.LocalDateTime localDateTime62 = property52.setCopy(24);
        org.joda.time.LocalDateTime localDateTime63 = property52.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.minusMillis(69);
        boolean boolean66 = localDateTime37.isEqual((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.weekyears();
        org.joda.time.DurationField durationField72 = chronology70.centuries();
        org.joda.time.DurationField durationField73 = chronology70.hours();
        boolean boolean74 = dateTimeFieldType67.isSupported(chronology70);
        org.joda.time.DateTimeField dateTimeField75 = chronology70.weekOfWeekyear();
        org.joda.time.DurationField durationField76 = chronology70.days();
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime();
        java.lang.String str78 = localDateTime77.toString();
        int int79 = localDateTime77.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime77.minusMonths(2);
        int[] intArray83 = chronology70.get((org.joda.time.ReadablePartial) localDateTime81, 86340010L);
        int int84 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localDateTime63, intArray83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField71", (durationField14.compareTo(durationField71) == 0) == durationField14.equals(durationField71));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.era();
        int int5 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekOfWeekyear((int) (byte) 1);
        int int8 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        java.lang.String str12 = durationFieldType11.toString();
        boolean boolean13 = localDateTime10.isSupported(durationFieldType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        boolean boolean19 = dateTimeFieldType14.isSupported(chronology17);
        org.joda.time.DurationField durationField20 = durationFieldType11.getField(chronology17);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology17.add(readablePeriod21, (long) 27427155, (int) (byte) 0);
        org.joda.time.DurationField durationField25 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str29 = dateTimeZone27.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.minuteOfHour();
        int int35 = property34.get();
        org.joda.time.LocalDateTime localDateTime37 = property34.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfCentury(0);
        int int41 = localDateTime40.getMillisOfDay();
        long long43 = chronology17.set((org.joda.time.ReadablePartial) localDateTime40, 1640157423775L);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime();
        java.lang.String str45 = localDateTime44.toString();
        int int46 = localDateTime44.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime44.minusMonths(2);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime58.toDateTime(readableInstant59);
        long long61 = dateTime60.getMillis();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str64 = dateTimeZone62.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now(dateTimeZone62);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = localDateTime65.getFieldType((int) (short) 0);
        boolean boolean68 = dateTime60.isSupported(dateTimeFieldType67);
        org.joda.time.DateTime dateTime69 = localDateTime48.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str72 = dateTimeZone70.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime73 = org.joda.time.LocalDateTime.now(dateTimeZone70);
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.millisOfDay();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime73.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.DateTime dateTime80 = localDateTime78.toDateTime(readableInstant79);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str83 = dateTimeZone81.getShortName((long) (short) 10);
        long long85 = dateTimeZone81.convertUTCToLocal((long) ' ');
        java.lang.String str86 = dateTimeZone81.toString();
        long long88 = dateTimeZone81.previousTransition(32L);
        long long91 = dateTimeZone81.convertLocalToUTC(97L, false);
        boolean boolean92 = dateTime80.equals((java.lang.Object) false);
        boolean boolean93 = dateTime69.isEqual((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.Instant instant94 = dateTime69.toInstant();
        org.joda.time.DateTime dateTime95 = localDateTime40.toDateTime((org.joda.time.ReadableInstant) instant94);
        org.joda.time.DateTime dateTime96 = localDateTime40.toDateTime();
        java.lang.String str97 = dateTime96.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime69 and instant94", (dateTime69.compareTo(instant94) == 0) == dateTime69.equals(instant94));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusMillis((-1));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYear((int) (short) 100);
        java.lang.String str14 = localDateTime13.toString();
        boolean boolean15 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDateTime13);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray18 = strSet17.toArray();
        boolean boolean19 = strSet17.isEmpty();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray22 = strSet21.toArray();
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        boolean boolean25 = strSet21.removeAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray30 = new org.joda.time.DurationFieldType[] { durationFieldType28, durationFieldType29 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = strSet27.toArray(durationFieldTypeArray30);
        boolean boolean32 = strSet21.containsAll((java.util.Collection<java.lang.String>) strSet27);
        java.lang.Object[] objArray33 = strSet27.toArray();
        boolean boolean34 = strSet17.removeAll((java.util.Collection<java.lang.String>) strSet27);
        java.util.Locale locale35 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray37 = strSet36.toArray();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        boolean boolean40 = strSet36.removeAll((java.util.Collection<java.lang.String>) strSet39);
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray45 = new org.joda.time.DurationFieldType[] { durationFieldType43, durationFieldType44 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray46 = strSet42.toArray(durationFieldTypeArray45);
        boolean boolean47 = strSet36.containsAll((java.util.Collection<java.lang.String>) strSet42);
        java.util.Locale locale48 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray50 = strSet49.toArray();
        java.util.Locale locale51 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        boolean boolean53 = strSet49.removeAll((java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale locale54 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray58 = new org.joda.time.DurationFieldType[] { durationFieldType56, durationFieldType57 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray59 = strSet55.toArray(durationFieldTypeArray58);
        boolean boolean60 = strSet49.containsAll((java.util.Collection<java.lang.String>) strSet55);
        java.lang.Object[] objArray61 = strSet55.toArray();
        boolean boolean62 = strSet36.retainAll((java.util.Collection<java.lang.String>) strSet55);
        boolean boolean63 = strSet27.addAll((java.util.Collection<java.lang.String>) strSet55);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean65 = strSet55.remove((java.lang.Object) dateTimeFieldType64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime3.property(dateTimeFieldType64);
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.weekyears();
        org.joda.time.DurationField durationField72 = chronology70.centuries();
        org.joda.time.DurationField durationField73 = durationFieldType67.getField(chronology70);
        boolean boolean74 = dateTimeFieldType64.isSupported(chronology70);
        org.joda.time.DurationField durationField75 = chronology70.weekyears();
        java.lang.String str76 = chronology70.toString();
        org.joda.time.DurationField durationField77 = chronology70.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField77, durationField71, and durationField72", !(durationField77.compareTo(durationField71) == 0) || (Math.signum(durationField77.compareTo(durationField72)) == Math.signum(durationField71.compareTo(durationField72))));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        java.util.Locale locale51 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet53 = locale51.getUnicodeLocaleAttributes();
        boolean boolean54 = instant50.equals((java.lang.Object) locale51);
        org.joda.time.DateTimeZone dateTimeZone55 = instant50.getZone();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str59 = dateTimeZone57.getShortName((long) (short) 10);
        long long61 = dateTimeZone57.convertUTCToLocal((long) ' ');
        java.lang.String str62 = dateTimeZone57.toString();
        boolean boolean64 = dateTimeZone57.equals((java.lang.Object) (short) 100);
        java.util.Locale locale66 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str67 = dateTimeZone57.getShortName((long) (-1), locale66);
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(dateTimeZone57);
        java.lang.String str70 = dateTimeZone57.getName((long) 26149);
        java.util.Locale.Category category72 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale73 = java.util.Locale.FRENCH;
        java.util.Locale.setDefault(category72, locale73);
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.DateTimeField dateTimeField77 = dateTimeFieldType75.getField(chronology76);
        java.util.Locale locale79 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale80 = locale79.stripExtensions();
        java.lang.String str81 = dateTimeField77.getAsShortText(100, locale80);
        java.util.Locale.setDefault(category72, locale80);
        java.lang.String str83 = dateTimeZone57.getName(0L, locale80);
        java.lang.String str84 = dateTimeZone55.getName(1645629526026L, locale80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.era();
        int int5 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekOfWeekyear((int) (byte) 1);
        int int8 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        java.lang.String str12 = durationFieldType11.toString();
        boolean boolean13 = localDateTime10.isSupported(durationFieldType11);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        org.joda.time.DurationField durationField19 = chronology17.centuries();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology17);
        org.joda.time.DurationField durationField21 = chronology17.millis();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.minuteOfDay();
        org.joda.time.DurationField durationField23 = durationFieldType11.getField(chronology17);
        java.lang.String str24 = durationFieldType11.getName();
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str26 = durationFieldType25.toString();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.weekyears();
        org.joda.time.DurationField durationField32 = chronology30.centuries();
        org.joda.time.DurationField durationField33 = durationFieldType27.getField(chronology30);
        boolean boolean34 = durationFieldType25.isSupported(chronology30);
        org.joda.time.DateTimeField dateTimeField35 = chronology30.millisOfDay();
        org.joda.time.DurationField durationField36 = durationFieldType11.getField(chronology30);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str41 = dateTimeZone39.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.centuries();
        boolean boolean45 = localDateTime42.equals((java.lang.Object) durationFieldType44);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology48 = localDateTime47.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.weekyears();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.minuteOfDay();
        org.joda.time.DurationField durationField51 = durationFieldType44.getField(chronology48);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str54 = dateTimeZone52.getShortName((long) (short) 10);
        long long56 = dateTimeZone52.convertUTCToLocal((long) ' ');
        java.lang.String str57 = dateTimeZone52.toString();
        long long60 = dateTimeZone52.adjustOffset((long) (short) 100, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone52);
        org.joda.time.Chronology chronology62 = chronology48.withZone(dateTimeZone52);
        org.joda.time.DurationField durationField63 = durationFieldType38.getField(chronology48);
        boolean boolean64 = durationFieldType11.isSupported(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField63", (durationField18.compareTo(durationField63) == 0) == durationField18.equals(durationField63));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        java.lang.String str5 = property4.getName();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName((long) (short) 10);
        long long14 = dateTimeZone10.convertUTCToLocal((long) ' ');
        java.lang.String str15 = dateTimeZone10.toString();
        boolean boolean17 = dateTimeZone10.equals((java.lang.Object) (short) 100);
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = dateTimeZone10.getShortName((long) (-1), locale19);
        long long23 = dateTimeZone10.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone10);
        org.joda.time.DateTime dateTime25 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        java.lang.String str31 = property30.getName();
        org.joda.time.LocalDateTime localDateTime32 = property30.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean34 = localDateTime32.isSupported(dateTimeFieldType33);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.centuries();
        boolean boolean41 = localDateTime38.equals((java.lang.Object) durationFieldType40);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray42 = localDateTime38.getFieldTypes();
        java.lang.String str43 = localDateTime38.toString();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime38.plusMillis(22);
        boolean boolean46 = localDateTime32.isBefore((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.plus(readableDuration47);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withDurationAdded(readableDuration49, 26169);
        org.joda.time.DateTime dateTime52 = localDateTime48.toDateTime();
        org.joda.time.DateTime dateTime53 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTime53.getZone();
        org.joda.time.Instant instant55 = dateTime53.toInstant();
        org.joda.time.DateTimeZone dateTimeZone56 = dateTime53.getZone();
        long long60 = dateTimeZone56.convertLocalToUTC(1487759040100L, true, 1645629401341L);
        int int62 = dateTimeZone56.getStandardOffset(1645629557180L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant55", (dateTime25.compareTo(instant55) == 0) == dateTime25.equals(instant55));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.era();
        int int12 = localDateTime7.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withWeekOfWeekyear((int) (byte) 1);
        int int15 = localDateTime7.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime7.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.days();
        java.lang.String str19 = durationFieldType18.toString();
        boolean boolean20 = localDateTime17.isSupported(durationFieldType18);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plus(readablePeriod21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology24 = null;
        boolean boolean25 = durationFieldType23.isSupported(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime17.withFieldAdded(durationFieldType23, 3);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withDate(500, 7, 17);
        long long33 = chronology2.set((org.joda.time.ReadablePartial) localDateTime27, 1645629356615L);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = chronology2.add(readablePeriod34, 1645629436768L, 11);
        org.joda.time.DurationField durationField38 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField3, and durationField4", !(durationField38.compareTo(durationField3) == 0) || (Math.signum(durationField38.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        java.lang.String str8 = localDateTime7.toString();
        int int9 = localDateTime7.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusMonths(2);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str15 = dateTimeZone13.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime(readableInstant22);
        long long24 = dateTime23.getMillis();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str27 = dateTimeZone25.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localDateTime28.getFieldType((int) (short) 0);
        boolean boolean31 = dateTime23.isSupported(dateTimeFieldType30);
        org.joda.time.DateTime dateTime32 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str35 = dateTimeZone33.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localDateTime41.toDateTime(readableInstant42);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str46 = dateTimeZone44.getShortName((long) (short) 10);
        long long48 = dateTimeZone44.convertUTCToLocal((long) ' ');
        java.lang.String str49 = dateTimeZone44.toString();
        long long51 = dateTimeZone44.previousTransition(32L);
        long long54 = dateTimeZone44.convertLocalToUTC(97L, false);
        boolean boolean55 = dateTime43.equals((java.lang.Object) false);
        boolean boolean56 = dateTime32.isEqual((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Instant instant57 = dateTime32.toInstant();
        org.joda.time.DateTime dateTime58 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Chronology chronology59 = dateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant57", (dateTime32.compareTo(instant57) == 0) == dateTime32.equals(instant57));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.era();
        int int5 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekOfWeekyear((int) (byte) 1);
        int int8 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusMillis(53);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusDays(24);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str15 = dateTimeZone13.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        int int18 = localDateTime16.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withSecondOfMinute(21);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        org.joda.time.DurationField durationField24 = dateTimeField23.getRangeDurationField();
        long long26 = dateTimeField23.remainder(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = dateTimeField23.getType();
        int int28 = localDateTime16.indexOf(dateTimeFieldType27);
        java.lang.String str29 = dateTimeFieldType27.getName();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType27.getField(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime10.withField(dateTimeFieldType27, 0);
        java.lang.String str36 = dateTimeFieldType27.getName();
        org.joda.time.DurationFieldType durationFieldType37 = dateTimeFieldType27.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology41 = localDateTime40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.weekyears();
        org.joda.time.DurationField durationField43 = chronology41.centuries();
        org.joda.time.DurationField durationField44 = chronology41.hours();
        boolean boolean45 = dateTimeFieldType38.isSupported(chronology41);
        org.joda.time.DateTimeField dateTimeField46 = chronology41.weekOfWeekyear();
        org.joda.time.DurationField durationField47 = chronology41.days();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime();
        java.lang.String str49 = localDateTime48.toString();
        int int50 = localDateTime48.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.minusMonths(2);
        int[] intArray54 = chronology41.get((org.joda.time.ReadablePartial) localDateTime52, 86340010L);
        org.joda.time.DurationField durationField55 = chronology41.months();
        org.joda.time.DateTimeField dateTimeField56 = chronology41.year();
        org.joda.time.DateTimeField dateTimeField57 = chronology41.year();
        boolean boolean58 = dateTimeFieldType27.isSupported(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField47", (durationField24.compareTo(durationField47) == 0) == durationField24.equals(durationField47));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.hours();
        java.lang.String str7 = chronology5.toString();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfDay();
        int int10 = dateTimeField8.get(1645629354990L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.centuries();
        boolean boolean17 = localDateTime14.equals((java.lang.Object) durationFieldType16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = localDateTime14.getFieldTypes();
        java.lang.String str19 = localDateTime14.toString();
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str21 = dateTimeField8.getAsText((org.joda.time.ReadablePartial) localDateTime14, locale20);
        org.joda.time.Chronology chronology22 = localDateTime14.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.centuries();
        org.joda.time.DurationField durationField24 = durationFieldType1.getField(chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField6, and durationField23", !(durationField24.compareTo(durationField6) == 0) || (Math.signum(durationField24.compareTo(durationField23)) == Math.signum(durationField6.compareTo(durationField23))));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        boolean boolean7 = dateTimeFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = chronology3.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = chronology3.minuteOfDay();
        org.joda.time.DurationField durationField12 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField4, and durationField5", !(durationField12.compareTo(durationField4) == 0) || (Math.signum(durationField12.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.centuries();
        boolean boolean8 = localDateTime5.equals((java.lang.Object) durationFieldType7);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfDay();
        org.joda.time.DurationField durationField14 = durationFieldType7.getField(chronology11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getShortName((long) (short) 10);
        long long19 = dateTimeZone15.convertUTCToLocal((long) ' ');
        java.lang.String str20 = dateTimeZone15.toString();
        long long23 = dateTimeZone15.adjustOffset((long) (short) 100, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.Chronology chronology25 = chronology11.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField26 = durationFieldType1.getField(chronology11);
        org.joda.time.DurationField durationField27 = chronology11.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField26", (durationField12.compareTo(durationField26) == 0) == durationField12.equals(durationField26));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.seconds();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = chronology2.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology2.minutes();
        org.joda.time.DurationField durationField11 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.weekyears();
        org.joda.time.DurationField durationField6 = chronology4.centuries();
        boolean boolean7 = durationFieldType1.isSupported(chronology4);
        org.joda.time.DurationField durationField8 = chronology4.halfdays();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(chronology4);
        org.joda.time.DateTimeField dateTimeField10 = chronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = chronology4.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology4.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField5, and durationField6", !(durationField13.compareTo(durationField5) == 0) || (Math.signum(durationField13.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.era();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfDay();
        org.joda.time.DurationField durationField8 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology2.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.DurationField durationField9 = chronology2.years();
        org.joda.time.DurationField durationField10 = chronology2.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        long long15 = dateTimeZone11.convertUTCToLocal((long) ' ');
        java.lang.String str16 = dateTimeZone11.toString();
        long long18 = dateTimeZone11.previousTransition(32L);
        long long21 = dateTimeZone11.convertLocalToUTC(97L, false);
        boolean boolean22 = dateTime10.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        long long34 = dateTime33.getMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDateTime38.getFieldType((int) (short) 0);
        boolean boolean41 = dateTime33.isSupported(dateTimeFieldType40);
        boolean boolean42 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str45 = dateTimeZone43.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime51.toDateTime(readableInstant52);
        long long54 = dateTime53.getMillis();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str57 = dateTimeZone55.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(dateTimeZone55);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = localDateTime58.getFieldType((int) (short) 0);
        boolean boolean61 = dateTime53.isSupported(dateTimeFieldType60);
        boolean boolean62 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime();
        java.lang.String str64 = localDateTime63.toString();
        int int65 = localDateTime63.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.minusMonths(2);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str71 = dateTimeZone69.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime72 = org.joda.time.LocalDateTime.now(dateTimeZone69);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.millisOfDay();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime72.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.DateTime dateTime79 = localDateTime77.toDateTime(readableInstant78);
        long long80 = dateTime79.getMillis();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str83 = dateTimeZone81.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime84 = org.joda.time.LocalDateTime.now(dateTimeZone81);
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = localDateTime84.getFieldType((int) (short) 0);
        boolean boolean87 = dateTime79.isSupported(dateTimeFieldType86);
        org.joda.time.DateTime dateTime88 = localDateTime67.toDateTime((org.joda.time.ReadableInstant) dateTime79);
        java.lang.String str89 = dateTime88.toString();
        boolean boolean90 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.Instant instant91 = dateTime88.toInstant();
        org.joda.time.Chronology chronology92 = instant91.getChronology();
        org.joda.time.DurationField durationField93 = chronology92.minutes();
        org.joda.time.DurationField durationField94 = chronology92.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime88 and instant91", (dateTime88.compareTo(instant91) == 0) == dateTime88.equals(instant91));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        long long11 = dateTime10.getMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = localDateTime15.getFieldType((int) (short) 0);
        boolean boolean18 = dateTime10.isSupported(dateTimeFieldType17);
        long long19 = dateTime10.getMillis();
        org.joda.time.Instant instant20 = dateTime10.toInstant();
        org.joda.time.Chronology chronology21 = dateTime10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology21.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant20", (dateTime10.compareTo(instant20) == 0) == dateTime10.equals(instant20));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(20);
        java.lang.String str3 = dateTimeZone1.getShortName(1645629374095L);
        long long6 = dateTimeZone1.adjustOffset(1908343015236L, false);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime(readableInstant17);
        long long19 = dateTime18.getMillis();
        int int20 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Instant instant21 = dateTime18.toInstant();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        java.lang.String str23 = localDateTime22.toString();
        int int24 = localDateTime22.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.minusMonths(2);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str30 = dateTimeZone28.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime(readableInstant37);
        long long39 = dateTime38.getMillis();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str42 = dateTimeZone40.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now(dateTimeZone40);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = localDateTime43.getFieldType((int) (short) 0);
        boolean boolean46 = dateTime38.isSupported(dateTimeFieldType45);
        org.joda.time.DateTime dateTime47 = localDateTime26.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str50 = dateTimeZone48.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now(dateTimeZone48);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.millisOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.DateTime dateTime58 = localDateTime56.toDateTime(readableInstant57);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str61 = dateTimeZone59.getShortName((long) (short) 10);
        long long63 = dateTimeZone59.convertUTCToLocal((long) ' ');
        java.lang.String str64 = dateTimeZone59.toString();
        long long66 = dateTimeZone59.previousTransition(32L);
        long long69 = dateTimeZone59.convertLocalToUTC(97L, false);
        boolean boolean70 = dateTime58.equals((java.lang.Object) false);
        boolean boolean71 = dateTime47.isEqual((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Instant instant72 = dateTime47.toInstant();
        boolean boolean73 = dateTime18.isAfter((org.joda.time.ReadableInstant) instant72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and dateTime38", (instant21.compareTo(dateTime38) == 0) == instant21.equals(dateTime38));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        long long4 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.lang.String str5 = dateTimeZone0.toString();
        long long7 = dateTimeZone0.previousTransition(32L);
        long long10 = dateTimeZone0.convertLocalToUTC(1645629374450L, true);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy(500);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYearOfEra(16);
        org.joda.time.DateTime dateTime20 = localDateTime17.toDateTime();
        int int21 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str24 = dateTimeZone22.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        long long30 = dateTimeZone26.convertUTCToLocal((long) ' ');
        java.lang.String str31 = dateTimeZone26.toString();
        boolean boolean33 = dateTimeZone26.equals((java.lang.Object) (short) 100);
        java.util.Locale locale35 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str36 = dateTimeZone26.getShortName((long) (-1), locale35);
        long long38 = dateTimeZone22.getMillisKeepLocal(dateTimeZone26, (long) (byte) -1);
        java.util.Locale locale39 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray41 = strSet40.toArray();
        java.util.Locale locale42 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleAttributes();
        boolean boolean44 = strSet40.removeAll((java.util.Collection<java.lang.String>) strSet43);
        java.util.Locale locale45 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet46 = locale45.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray49 = new org.joda.time.DurationFieldType[] { durationFieldType47, durationFieldType48 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray50 = strSet46.toArray(durationFieldTypeArray49);
        boolean boolean51 = strSet40.containsAll((java.util.Collection<java.lang.String>) strSet46);
        java.util.Locale locale52 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray54 = strSet53.toArray();
        java.util.Locale locale55 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleAttributes();
        boolean boolean57 = strSet53.removeAll((java.util.Collection<java.lang.String>) strSet56);
        java.util.Locale locale58 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet59 = locale58.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType61 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray62 = new org.joda.time.DurationFieldType[] { durationFieldType60, durationFieldType61 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray63 = strSet59.toArray(durationFieldTypeArray62);
        boolean boolean64 = strSet53.containsAll((java.util.Collection<java.lang.String>) strSet59);
        java.lang.Object[] objArray65 = strSet53.toArray();
        boolean boolean66 = strSet46.removeAll((java.util.Collection<java.lang.String>) strSet53);
        boolean boolean67 = dateTimeZone26.equals((java.lang.Object) boolean66);
        long long69 = dateTimeZone26.nextTransition(1645629359098L);
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str73 = dateTimeZone71.getShortName((long) (short) 10);
        long long75 = dateTimeZone71.convertUTCToLocal((long) ' ');
        java.lang.String str76 = dateTimeZone71.toString();
        long long79 = dateTimeZone71.adjustOffset((long) 'a', true);
        org.joda.time.DateTime dateTime80 = localDateTime70.toDateTime(dateTimeZone71);
        java.lang.String str81 = dateTime80.toString();
        org.joda.time.Instant instant82 = dateTime80.toInstant();
        boolean boolean83 = dateTime20.isBefore((org.joda.time.ReadableInstant) instant82);
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str86 = dateTimeZone84.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime87 = org.joda.time.LocalDateTime.now(dateTimeZone84);
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int89 = localDateTime87.get(dateTimeFieldType88);
        org.joda.time.DurationFieldType durationFieldType90 = dateTimeFieldType88.getRangeDurationType();
        int int91 = dateTime20.get(dateTimeFieldType88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime80 and instant82", (dateTime80.compareTo(instant82) == 0) == dateTime80.equals(instant82));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.weekyears();
        org.joda.time.DurationField durationField6 = chronology4.centuries();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology4);
        org.joda.time.DurationField durationField8 = chronology4.millis();
        org.joda.time.DateTimeField dateTimeField9 = chronology4.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology4.halfdayOfDay();
        org.joda.time.DurationField durationField11 = chronology4.years();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 55000019, chronology4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField11", (durationField5.compareTo(durationField11) == 0) == durationField5.equals(durationField11));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField5", (durationField3.compareTo(durationField5) == 0) == durationField3.equals(durationField5));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        int int5 = property4.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        boolean boolean7 = property4.isLeap();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("und");
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale12.getDisplayName();
        java.util.Locale.Builder builder15 = builder10.setLocale(locale12);
        java.util.Locale.Builder builder17 = builder10.setScript("");
        java.util.Locale locale18 = builder10.build();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType26.getField(chronology27);
        long long30 = dateTimeField28.roundFloor((long) (-1));
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder31.addUnicodeLocaleAttribute("und");
        java.util.Locale locale34 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale35 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.lang.String str37 = locale35.getDisplayName();
        java.util.Locale.Builder builder38 = builder33.setLocale(locale35);
        int int39 = dateTimeField28.getMaximumShortTextLength(locale35);
        java.lang.String str40 = dateTimeField24.getAsShortText((long) 'a', locale35);
        java.lang.String str41 = locale18.getDisplayLanguage(locale35);
        java.util.Locale locale42 = locale35.stripExtensions();
        int int43 = property4.getMaximumTextLength(locale42);
        org.joda.time.DurationField durationField44 = property4.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str47 = dateTimeZone45.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime48.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.DateTime dateTime55 = localDateTime53.toDateTime(readableInstant54);
        long long56 = dateTime55.getMillis();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str59 = dateTimeZone57.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime60 = org.joda.time.LocalDateTime.now(dateTimeZone57);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = localDateTime60.getFieldType((int) (short) 0);
        boolean boolean63 = dateTime55.isSupported(dateTimeFieldType62);
        long long64 = dateTime55.getMillis();
        org.joda.time.Instant instant65 = dateTime55.toInstant();
        int int66 = property4.getDifference((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str69 = dateTimeZone67.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now(dateTimeZone67);
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.millisOfDay();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime70.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime70.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime77 = localDateTime75.minusHours((int) (short) 10);
        int int78 = localDateTime75.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime75.minus(readablePeriod79);
        int int81 = localDateTime75.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str84 = dateTimeZone82.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime85 = org.joda.time.LocalDateTime.now(dateTimeZone82);
        org.joda.time.LocalDateTime.Property property86 = localDateTime85.millisOfDay();
        org.joda.time.LocalDateTime localDateTime88 = localDateTime85.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime88.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime92 = localDateTime90.minusDays(0);
        boolean boolean93 = localDateTime75.isBefore((org.joda.time.ReadablePartial) localDateTime90);
        int int94 = property4.compareTo((org.joda.time.ReadablePartial) localDateTime90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime55 and instant65", (dateTime55.compareTo(instant65) == 0) == dateTime55.equals(instant65));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField5", (durationField3.compareTo(durationField5) == 0) == durationField3.equals(durationField5));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        long long11 = dateTime10.getMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.minuteOfHour();
        int int20 = property19.get();
        org.joda.time.LocalDateTime localDateTime22 = property19.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.minuteOfHour();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.year();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        java.lang.String str26 = localDateTime25.toString();
        int int27 = localDateTime25.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.minusMonths(2);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localDateTime39.toDateTime(readableInstant40);
        long long42 = dateTime41.getMillis();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str45 = dateTimeZone43.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone43);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = localDateTime46.getFieldType((int) (short) 0);
        boolean boolean49 = dateTime41.isSupported(dateTimeFieldType48);
        org.joda.time.DateTime dateTime50 = localDateTime29.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str53 = dateTimeZone51.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime54.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.DateTime dateTime61 = localDateTime59.toDateTime(readableInstant60);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str64 = dateTimeZone62.getShortName((long) (short) 10);
        long long66 = dateTimeZone62.convertUTCToLocal((long) ' ');
        java.lang.String str67 = dateTimeZone62.toString();
        long long69 = dateTimeZone62.previousTransition(32L);
        long long72 = dateTimeZone62.convertLocalToUTC(97L, false);
        boolean boolean73 = dateTime61.equals((java.lang.Object) false);
        boolean boolean74 = dateTime50.isEqual((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Instant instant75 = dateTime50.toInstant();
        long long76 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) instant75);
        boolean boolean77 = dateTime10.isBefore((org.joda.time.ReadableInstant) instant75);
        org.joda.time.DateTimeZone dateTimeZone78 = dateTime10.getZone();
        org.joda.time.Instant instant79 = dateTime10.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant75", (dateTime50.compareTo(instant75) == 0) == dateTime50.equals(instant75));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.Chronology chronology5 = chronology2.withUTC();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        boolean boolean5 = dateTimeFieldType0.isSupported(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        java.lang.String str7 = localDateTime6.toString();
        int int8 = localDateTime6.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(2);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime(readableInstant21);
        long long23 = dateTime22.getMillis();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str26 = dateTimeZone24.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = localDateTime27.getFieldType((int) (short) 0);
        boolean boolean30 = dateTime22.isSupported(dateTimeFieldType29);
        org.joda.time.DateTime dateTime31 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        int[] intArray33 = chronology3.get((org.joda.time.ReadablePartial) localDateTime10, 11L);
        org.joda.time.DateTimeField dateTimeField34 = chronology3.centuryOfEra();
        org.joda.time.DurationField durationField35 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField36 = chronology3.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField35", (durationField4.compareTo(durationField35) == 0) == durationField4.equals(durationField35));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        long long51 = instant50.getMillis();
        org.joda.time.Instant instant52 = instant50.toInstant();
        org.joda.time.Chronology chronology53 = instant52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        int int6 = dateTimeField4.getMaximumValue(8228146884657L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusHours((int) (short) 10);
        int int18 = localDateTime15.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.minusYears((int) ' ');
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.minusHours((int) (byte) 1);
        int int23 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        java.lang.String str25 = localDateTime24.toString();
        int int26 = localDateTime24.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.minusMonths(2);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str32 = dateTimeZone30.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime38.toDateTime(readableInstant39);
        long long41 = dateTime40.getMillis();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str44 = dateTimeZone42.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now(dateTimeZone42);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = localDateTime45.getFieldType((int) (short) 0);
        boolean boolean48 = dateTime40.isSupported(dateTimeFieldType47);
        org.joda.time.DateTime dateTime49 = localDateTime28.toDateTime((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime58.toDateTime(readableInstant59);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str63 = dateTimeZone61.getShortName((long) (short) 10);
        long long65 = dateTimeZone61.convertUTCToLocal((long) ' ');
        java.lang.String str66 = dateTimeZone61.toString();
        long long68 = dateTimeZone61.previousTransition(32L);
        long long71 = dateTimeZone61.convertLocalToUTC(97L, false);
        boolean boolean72 = dateTime60.equals((java.lang.Object) false);
        boolean boolean73 = dateTime49.isEqual((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Instant instant74 = dateTime49.toInstant();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str77 = dateTimeZone75.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime78 = org.joda.time.LocalDateTime.now(dateTimeZone75);
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.millisOfDay();
        long long80 = property79.remainder();
        org.joda.time.LocalDateTime localDateTime81 = property79.roundFloorCopy();
        boolean boolean82 = instant74.equals((java.lang.Object) localDateTime81);
        int int83 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localDateTime81);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime81.plusHours(22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and instant74", (dateTime49.compareTo(instant74) == 0) == dateTime49.equals(instant74));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        int int8 = property7.get();
        org.joda.time.LocalDateTime localDateTime10 = property7.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.year();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        java.lang.String str14 = localDateTime13.toString();
        int int15 = localDateTime13.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusMonths(2);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime(readableInstant28);
        long long30 = dateTime29.getMillis();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = localDateTime34.getFieldType((int) (short) 0);
        boolean boolean37 = dateTime29.isSupported(dateTimeFieldType36);
        org.joda.time.DateTime dateTime38 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str41 = dateTimeZone39.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.millisOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.DateTime dateTime49 = localDateTime47.toDateTime(readableInstant48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName((long) (short) 10);
        long long54 = dateTimeZone50.convertUTCToLocal((long) ' ');
        java.lang.String str55 = dateTimeZone50.toString();
        long long57 = dateTimeZone50.previousTransition(32L);
        long long60 = dateTimeZone50.convertLocalToUTC(97L, false);
        boolean boolean61 = dateTime49.equals((java.lang.Object) false);
        boolean boolean62 = dateTime38.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Instant instant63 = dateTime38.toInstant();
        long long64 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) instant63);
        org.joda.time.DateTimeZone dateTimeZone65 = instant63.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and instant63", (dateTime38.compareTo(instant63) == 0) == dateTime38.equals(instant63));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str1 = durationFieldType0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.DurationField durationField7 = chronology5.centuries();
        org.joda.time.DurationField durationField8 = durationFieldType2.getField(chronology5);
        boolean boolean9 = durationFieldType0.isSupported(chronology5);
        org.joda.time.DurationField durationField10 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField10", (durationField6.compareTo(durationField10) == 0) == durationField6.equals(durationField10));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.dayOfYear();
        org.joda.time.DurationField durationField8 = chronology2.days();
        org.joda.time.DateTimeField dateTimeField9 = chronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = chronology2.dayOfYear();
        org.joda.time.DurationField durationField11 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.seconds();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.halfdayOfDay();
        org.joda.time.DurationField durationField7 = chronology2.seconds();
        org.joda.time.DurationField durationField8 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = chronology2.getZone();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.Chronology chronology7 = chronology2.withUTC();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.centuries();
        boolean boolean14 = localDateTime11.equals((java.lang.Object) durationFieldType13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.Locale locale23 = new java.util.Locale("fra", "fran\347ais (Canada)");
        java.lang.String str24 = dateTimeZone19.getShortName((long) 26198, locale23);
        java.lang.String str25 = localDateTime16.toString("26156413", locale23);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.hours();
        org.joda.time.DurationField durationField31 = durationFieldType26.getField(chronology29);
        org.joda.time.Chronology chronology32 = chronology29.withUTC();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str35 = dateTimeZone33.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(dateTimeZone33);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = localDateTime36.getFieldType((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.minusSeconds(55000019);
        int int43 = localDateTime42.size();
        int[] intArray45 = chronology29.get((org.joda.time.ReadablePartial) localDateTime42, 8228146884657L);
        chronology2.validate((org.joda.time.ReadablePartial) localDateTime16, intArray45);
        org.joda.time.DurationField durationField47 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField6, and durationField30", !(durationField47.compareTo(durationField6) == 0) || (Math.signum(durationField47.compareTo(durationField30)) == Math.signum(durationField6.compareTo(durationField30))));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.DurationField durationField9 = chronology2.years();
        org.joda.time.DurationField durationField10 = chronology2.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        java.lang.String str14 = property13.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.weekyears();
        org.joda.time.DurationField durationField20 = chronology18.seconds();
        org.joda.time.DurationField durationField21 = chronology18.seconds();
        org.joda.time.DurationField durationField22 = chronology18.seconds();
        org.joda.time.DateTimeField dateTimeField23 = chronology18.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology18.centuryOfEra();
        boolean boolean25 = dateTimeFieldType15.isSupported(chronology18);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.weekyears();
        org.joda.time.DurationField durationField30 = chronology28.centuries();
        org.joda.time.DurationField durationField31 = chronology28.hours();
        org.joda.time.DurationField durationField32 = chronology28.seconds();
        org.joda.time.DateTimeField dateTimeField33 = chronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = chronology28.millisOfDay();
        org.joda.time.DateTimeField dateTimeField35 = chronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType15.getField(chronology28);
        org.joda.time.DurationFieldType durationFieldType37 = dateTimeFieldType15.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str40 = dateTimeZone38.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(dateTimeZone38);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime41.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime(readableInstant47);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str51 = dateTimeZone49.getShortName((long) (short) 10);
        long long53 = dateTimeZone49.convertUTCToLocal((long) ' ');
        java.lang.String str54 = dateTimeZone49.toString();
        long long56 = dateTimeZone49.previousTransition(32L);
        long long59 = dateTimeZone49.convertLocalToUTC(97L, false);
        boolean boolean60 = dateTime48.equals((java.lang.Object) false);
        org.joda.time.Chronology chronology61 = dateTime48.getChronology();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str64 = dateTimeZone62.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now(dateTimeZone62);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.millisOfDay();
        org.joda.time.ReadableInstant readableInstant67 = null;
        long long68 = property66.getDifferenceAsLong(readableInstant67);
        int int69 = property66.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime70 = property66.roundHalfEvenCopy();
        org.joda.time.DurationField durationField71 = property66.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime72 = property66.roundHalfEvenCopy();
        java.lang.String str73 = property66.getName();
        java.util.Locale locale74 = java.util.Locale.ITALY;
        java.lang.String str75 = property66.getAsText(locale74);
        org.joda.time.LocalDateTime localDateTime77 = property66.addToCopy(26180486);
        long long79 = chronology61.set((org.joda.time.ReadablePartial) localDateTime77, 1645629361196L);
        org.joda.time.DurationField durationField80 = chronology61.eras();
        boolean boolean81 = durationFieldType37.isSupported(chronology61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField80", Math.signum(durationField19.compareTo(durationField80)) == -Math.signum(durationField80.compareTo(durationField19)));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        boolean boolean6 = localDateTime3.equals((java.lang.Object) durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime3.getFieldTypes();
        java.lang.String str8 = localDateTime3.toString();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.plusMillis(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType11.getField(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime3.withField(dateTimeFieldType11, 2);
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType11.getDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.weekyears();
        boolean boolean22 = dateTimeFieldType17.isSupported(chronology20);
        org.joda.time.DurationField durationField23 = chronology20.centuries();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.year();
        boolean boolean25 = durationFieldType16.isSupported(chronology20);
        org.joda.time.DurationField durationField26 = chronology20.months();
        org.joda.time.DurationField durationField27 = chronology20.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField21, and durationField23", !(durationField27.compareTo(durationField21) == 0) || (Math.signum(durationField27.compareTo(durationField23)) == Math.signum(durationField21.compareTo(durationField23))));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        java.lang.String str8 = localDateTime7.toString();
        int int9 = localDateTime7.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusMonths(2);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str15 = dateTimeZone13.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime(readableInstant22);
        long long24 = dateTime23.getMillis();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str27 = dateTimeZone25.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localDateTime28.getFieldType((int) (short) 0);
        boolean boolean31 = dateTime23.isSupported(dateTimeFieldType30);
        org.joda.time.DateTime dateTime32 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str35 = dateTimeZone33.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localDateTime41.toDateTime(readableInstant42);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str46 = dateTimeZone44.getShortName((long) (short) 10);
        long long48 = dateTimeZone44.convertUTCToLocal((long) ' ');
        java.lang.String str49 = dateTimeZone44.toString();
        long long51 = dateTimeZone44.previousTransition(32L);
        long long54 = dateTimeZone44.convertLocalToUTC(97L, false);
        boolean boolean55 = dateTime43.equals((java.lang.Object) false);
        boolean boolean56 = dateTime32.isEqual((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Instant instant57 = dateTime32.toInstant();
        org.joda.time.DateTime dateTime58 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Instant instant59 = dateTime58.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant57", (dateTime32.compareTo(instant57) == 0) == dateTime32.equals(instant57));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        java.lang.String str5 = property4.getName();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName((long) (short) 10);
        long long14 = dateTimeZone10.convertUTCToLocal((long) ' ');
        java.lang.String str15 = dateTimeZone10.toString();
        boolean boolean17 = dateTimeZone10.equals((java.lang.Object) (short) 100);
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = dateTimeZone10.getShortName((long) (-1), locale19);
        long long23 = dateTimeZone10.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone10);
        org.joda.time.DateTime dateTime25 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        java.lang.String str31 = property30.getName();
        org.joda.time.LocalDateTime localDateTime32 = property30.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean34 = localDateTime32.isSupported(dateTimeFieldType33);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.centuries();
        boolean boolean41 = localDateTime38.equals((java.lang.Object) durationFieldType40);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray42 = localDateTime38.getFieldTypes();
        java.lang.String str43 = localDateTime38.toString();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime38.plusMillis(22);
        boolean boolean46 = localDateTime32.isBefore((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.plus(readableDuration47);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withDurationAdded(readableDuration49, 26169);
        org.joda.time.DateTime dateTime52 = localDateTime48.toDateTime();
        org.joda.time.DateTime dateTime53 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTime53.getZone();
        org.joda.time.Instant instant55 = dateTime53.toInstant();
        org.joda.time.DateTimeZone dateTimeZone56 = dateTime53.getZone();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.plusSeconds(9);
        org.joda.time.LocalDateTime.Property property64 = localDateTime60.weekyear();
        org.joda.time.DateTime dateTime65 = localDateTime60.toDateTime();
        int int66 = dateTimeZone58.getOffset((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis((-52));
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(dateTimeZone68);
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now(dateTimeZone68);
        long long72 = dateTimeZone58.getMillisKeepLocal(dateTimeZone68, 98739409986079297L);
        long long74 = dateTimeZone56.getMillisKeepLocal(dateTimeZone58, 225L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant55", (dateTime25.compareTo(instant55) == 0) == dateTime25.equals(instant55));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekyear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusMillis((-1));
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str18 = dateTimeZone16.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.centuries();
        boolean boolean22 = localDateTime19.equals((java.lang.Object) durationFieldType21);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = localDateTime19.getFieldTypes();
        java.lang.String str24 = localDateTime19.toString();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.plusMillis(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean28 = localDateTime19.isSupported(dateTimeFieldType27);
        int int29 = localDateTime15.indexOf(dateTimeFieldType27);
        int[] intArray31 = chronology2.get((org.joda.time.ReadablePartial) localDateTime15, 1645629358650L);
        org.joda.time.DurationField durationField32 = chronology2.millis();
        org.joda.time.DurationField durationField33 = chronology2.hours();
        org.joda.time.DurationField durationField34 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField3, and durationField32", !(durationField34.compareTo(durationField3) == 0) || (Math.signum(durationField34.compareTo(durationField32)) == Math.signum(durationField3.compareTo(durationField32))));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        java.lang.String str14 = property13.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.weekyears();
        org.joda.time.DurationField durationField20 = chronology18.seconds();
        org.joda.time.DurationField durationField21 = chronology18.seconds();
        org.joda.time.DurationField durationField22 = chronology18.seconds();
        org.joda.time.DateTimeField dateTimeField23 = chronology18.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology18.centuryOfEra();
        boolean boolean25 = dateTimeFieldType15.isSupported(chronology18);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.weekyears();
        org.joda.time.DurationField durationField30 = chronology28.centuries();
        org.joda.time.DurationField durationField31 = chronology28.hours();
        org.joda.time.DurationField durationField32 = chronology28.seconds();
        org.joda.time.DateTimeField dateTimeField33 = chronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = chronology28.millisOfDay();
        org.joda.time.DateTimeField dateTimeField35 = chronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType15.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField37 = chronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField38 = chronology28.secondOfDay();
        org.joda.time.DurationField durationField39 = chronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField19, and durationField20", !(durationField39.compareTo(durationField19) == 0) || (Math.signum(durationField39.compareTo(durationField20)) == Math.signum(durationField19.compareTo(durationField20))));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        org.joda.time.DurationField durationField4 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.dayOfWeek();
        org.joda.time.DurationField durationField7 = chronology2.centuries();
        int int10 = durationField7.getDifference((long) 26287632, 0L);
        org.joda.time.DurationFieldType durationFieldType11 = durationField7.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.weekyears();
        org.joda.time.DurationField durationField17 = chronology15.centuries();
        org.joda.time.DurationField durationField18 = chronology15.minutes();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology15);
        boolean boolean20 = dateTimeFieldType12.isSupported(chronology15);
        org.joda.time.DurationField durationField21 = chronology15.months();
        org.joda.time.DurationField durationField22 = chronology15.years();
        boolean boolean23 = durationFieldType11.isSupported(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField22", (durationField4.compareTo(durationField22) == 0) == durationField4.equals(durationField22));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        boolean boolean7 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.monthOfYear();
        org.joda.time.DurationField durationField10 = dateTimeField9.getRangeDurationField();
        boolean boolean12 = dateTimeField9.isLeap(44987L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        boolean boolean7 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DurationField durationField13 = durationFieldType8.getField(chronology11);
        org.joda.time.Chronology chronology14 = chronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.weekOfWeekyear();
        boolean boolean17 = durationFieldType0.isSupported(chronology11);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.minuteOfHour();
        int int26 = property25.get();
        org.joda.time.LocalDateTime localDateTime28 = property25.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = property25.roundCeilingCopy();
        org.joda.time.DateTimeField[] dateTimeFieldArray30 = localDateTime29.getFields();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.centuries();
        boolean boolean37 = localDateTime34.equals((java.lang.Object) durationFieldType36);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray38 = localDateTime34.getFieldTypes();
        java.lang.String str39 = localDateTime34.toString();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime34.plusMillis(22);
        org.joda.time.LocalDateTime.Property property42 = localDateTime34.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str45 = dateTimeZone43.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfDay();
        java.lang.String str48 = property47.getName();
        int int49 = property47.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property47.getFieldType();
        int int51 = localDateTime34.indexOf(dateTimeFieldType50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime29.property(dateTimeFieldType50);
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType50.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology58 = localDateTime57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((-100L), chronology58);
        org.joda.time.DateTimeField dateTimeField62 = chronology58.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(120L, chronology58);
        boolean boolean64 = durationFieldType53.isSupported(chronology58);
        org.joda.time.DateTimeField dateTimeField65 = chronology58.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField66 = chronology58.minuteOfDay();
        boolean boolean67 = durationFieldType0.isSupported(chronology58);
        org.joda.time.DurationField durationField68 = chronology58.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField68, durationField4, and durationField5", !(durationField68.compareTo(durationField4) == 0) || (Math.signum(durationField68.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        long long11 = dateTime10.getMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = localDateTime15.getFieldType((int) (short) 0);
        boolean boolean18 = dateTime10.isSupported(dateTimeFieldType17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.ReadableInstant readableInstant24 = null;
        long long25 = property23.getDifferenceAsLong(readableInstant24);
        org.joda.time.DurationField durationField26 = property23.getLeapDurationField();
        java.lang.String str27 = property23.getAsString();
        org.joda.time.LocalDateTime localDateTime28 = property23.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getShortName((long) (short) 10);
        long long35 = dateTimeZone31.convertUTCToLocal((long) ' ');
        java.lang.String str36 = dateTimeZone31.toString();
        boolean boolean38 = dateTimeZone31.equals((java.lang.Object) (short) 100);
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = dateTimeZone31.getShortName((long) (-1), locale40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime43 = localDateTime30.toDateTime(dateTimeZone31);
        boolean boolean44 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Instant instant45 = dateTime43.toInstant();
        long long46 = instant45.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.weekyears();
        org.joda.time.DurationField durationField52 = chronology50.centuries();
        org.joda.time.DurationField durationField53 = chronology50.minutes();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology50);
        boolean boolean55 = dateTimeFieldType47.isSupported(chronology50);
        int int56 = instant45.get(dateTimeFieldType47);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology60 = localDateTime59.getChronology();
        org.joda.time.DurationField durationField61 = chronology60.weekyears();
        org.joda.time.DurationField durationField62 = chronology60.centuries();
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology60);
        org.joda.time.DateTimeField dateTimeField64 = chronology60.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField65 = chronology60.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusDays(0);
        long long71 = chronology60.set((org.joda.time.ReadablePartial) localDateTime69, (long) 24);
        org.joda.time.DurationField durationField72 = chronology60.minutes();
        org.joda.time.DurationField durationField73 = chronology60.years();
        org.joda.time.DateTimeField dateTimeField74 = dateTimeFieldType47.getField(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and instant45", (dateTime43.compareTo(instant45) == 0) == dateTime43.equals(instant45));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        java.lang.String str26 = dateTime25.toString();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        java.lang.String str28 = localDateTime27.toString();
        int int29 = localDateTime27.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.minusMonths(2);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str35 = dateTimeZone33.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localDateTime41.toDateTime(readableInstant42);
        long long44 = dateTime43.getMillis();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str47 = dateTimeZone45.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now(dateTimeZone45);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = localDateTime48.getFieldType((int) (short) 0);
        boolean boolean51 = dateTime43.isSupported(dateTimeFieldType50);
        org.joda.time.DateTime dateTime52 = localDateTime31.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str55 = dateTimeZone53.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now(dateTimeZone53);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.millisOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime56.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.DateTime dateTime63 = localDateTime61.toDateTime(readableInstant62);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str66 = dateTimeZone64.getShortName((long) (short) 10);
        long long68 = dateTimeZone64.convertUTCToLocal((long) ' ');
        java.lang.String str69 = dateTimeZone64.toString();
        long long71 = dateTimeZone64.previousTransition(32L);
        long long74 = dateTimeZone64.convertLocalToUTC(97L, false);
        boolean boolean75 = dateTime63.equals((java.lang.Object) false);
        boolean boolean76 = dateTime52.isEqual((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Instant instant77 = dateTime52.toInstant();
        long long78 = instant77.getMillis();
        boolean boolean79 = dateTime25.isEqual((org.joda.time.ReadableInstant) instant77);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str82 = dateTimeZone80.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime83 = org.joda.time.LocalDateTime.now(dateTimeZone80);
        org.joda.time.LocalDateTime.Property property84 = localDateTime83.millisOfDay();
        org.joda.time.LocalDateTime localDateTime86 = localDateTime83.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property87 = localDateTime86.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str90 = dateTimeZone88.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime91 = org.joda.time.LocalDateTime.now(dateTimeZone88);
        org.joda.time.DateTime dateTime92 = localDateTime86.toDateTime(dateTimeZone88);
        boolean boolean93 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime92);
        org.joda.time.ReadableInstant readableInstant94 = null;
        boolean boolean95 = dateTime25.isAfter(readableInstant94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime52 and instant77", (dateTime52.compareTo(instant77) == 0) == dateTime52.equals(instant77));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.ReadableInstant readableInstant5 = null;
        long long6 = property4.getDifferenceAsLong(readableInstant5);
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale7.getISO3Language();
        java.lang.String str9 = property4.getAsShortText(locale7);
        org.joda.time.DurationField durationField10 = property4.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime(readableInstant20);
        long long22 = dateTime21.getMillis();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = localDateTime26.getFieldType((int) (short) 0);
        boolean boolean29 = dateTime21.isSupported(dateTimeFieldType28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str32 = dateTimeZone30.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfDay();
        org.joda.time.ReadableInstant readableInstant35 = null;
        long long36 = property34.getDifferenceAsLong(readableInstant35);
        org.joda.time.DurationField durationField37 = property34.getLeapDurationField();
        java.lang.String str38 = property34.getAsString();
        org.joda.time.LocalDateTime localDateTime39 = property34.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str44 = dateTimeZone42.getShortName((long) (short) 10);
        long long46 = dateTimeZone42.convertUTCToLocal((long) ' ');
        java.lang.String str47 = dateTimeZone42.toString();
        boolean boolean49 = dateTimeZone42.equals((java.lang.Object) (short) 100);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone42.getShortName((long) (-1), locale51);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime54 = localDateTime41.toDateTime(dateTimeZone42);
        boolean boolean55 = dateTime21.isEqual((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Instant instant56 = dateTime54.toInstant();
        long long57 = instant56.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology61 = localDateTime60.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.weekyears();
        org.joda.time.DurationField durationField63 = chronology61.centuries();
        org.joda.time.DurationField durationField64 = chronology61.minutes();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology61);
        boolean boolean66 = dateTimeFieldType58.isSupported(chronology61);
        int int67 = instant56.get(dateTimeFieldType58);
        long long68 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) instant56);
        int int69 = property4.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and instant56", (dateTime54.compareTo(instant56) == 0) == dateTime54.equals(instant56));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        long long5 = property4.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundFloorCopy();
        java.lang.String str7 = property4.getAsShortText();
        java.lang.String str8 = property4.getAsString();
        int int9 = property4.getMaximumValueOverall();
        org.joda.time.DurationField durationField10 = property4.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime11 = property4.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime(readableInstant21);
        long long23 = dateTime22.getMillis();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str26 = dateTimeZone24.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = localDateTime27.getFieldType((int) (short) 0);
        boolean boolean30 = dateTime22.isSupported(dateTimeFieldType29);
        long long31 = dateTime22.getMillis();
        org.joda.time.Instant instant32 = dateTime22.toInstant();
        int int33 = property4.compareTo((org.joda.time.ReadableInstant) dateTime22);
        int int34 = property4.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant32", (dateTime22.compareTo(instant32) == 0) == dateTime22.equals(instant32));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(48);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localDateTime10.toDateTime(readableInstant11);
        long long13 = dateTime12.getMillis();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = localDateTime17.getFieldType((int) (short) 0);
        boolean boolean20 = dateTime12.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str23 = dateTimeZone21.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfDay();
        org.joda.time.ReadableInstant readableInstant26 = null;
        long long27 = property25.getDifferenceAsLong(readableInstant26);
        org.joda.time.DurationField durationField28 = property25.getLeapDurationField();
        java.lang.String str29 = property25.getAsString();
        org.joda.time.LocalDateTime localDateTime30 = property25.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str35 = dateTimeZone33.getShortName((long) (short) 10);
        long long37 = dateTimeZone33.convertUTCToLocal((long) ' ');
        java.lang.String str38 = dateTimeZone33.toString();
        boolean boolean40 = dateTimeZone33.equals((java.lang.Object) (short) 100);
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str43 = dateTimeZone33.getShortName((long) (-1), locale42);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime45 = localDateTime32.toDateTime(dateTimeZone33);
        boolean boolean46 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Instant instant47 = dateTime45.toInstant();
        int int48 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime45);
        boolean boolean49 = dateTimeZone1.isFixed();
        java.lang.String str51 = dateTimeZone1.getNameKey(11764123L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and instant47", (dateTime45.compareTo(instant47) == 0) == dateTime45.equals(instant47));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology3);
        org.joda.time.DurationField durationField7 = chronology3.millis();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.halfdayOfDay();
        org.joda.time.DurationField durationField10 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology3.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = chronology2.add(readablePeriod5, 10L, 26149500);
        org.joda.time.DurationField durationField9 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology2.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField9", Math.signum(durationField3.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField3)));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale5.getVariant();
        java.lang.String str8 = locale5.getCountry();
        java.lang.String str9 = locale5.getLanguage();
        int int10 = property4.getMaximumShortTextLength(locale5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime(readableInstant20);
        long long22 = dateTime21.getMillis();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = localDateTime26.getFieldType((int) (short) 0);
        boolean boolean29 = dateTime21.isSupported(dateTimeFieldType28);
        long long30 = dateTime21.getMillis();
        int int31 = property4.getDifference((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime();
        java.lang.String str33 = localDateTime32.toString();
        int int34 = localDateTime32.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.minusMonths(2);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str40 = dateTimeZone38.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(dateTimeZone38);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime41.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime(readableInstant47);
        long long49 = dateTime48.getMillis();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(dateTimeZone50);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = localDateTime53.getFieldType((int) (short) 0);
        boolean boolean56 = dateTime48.isSupported(dateTimeFieldType55);
        org.joda.time.DateTime dateTime57 = localDateTime36.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str60 = dateTimeZone58.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime61 = org.joda.time.LocalDateTime.now(dateTimeZone58);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.millisOfDay();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime61.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime61.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.DateTime dateTime68 = localDateTime66.toDateTime(readableInstant67);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str71 = dateTimeZone69.getShortName((long) (short) 10);
        long long73 = dateTimeZone69.convertUTCToLocal((long) ' ');
        java.lang.String str74 = dateTimeZone69.toString();
        long long76 = dateTimeZone69.previousTransition(32L);
        long long79 = dateTimeZone69.convertLocalToUTC(97L, false);
        boolean boolean80 = dateTime68.equals((java.lang.Object) false);
        boolean boolean81 = dateTime57.isEqual((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.Instant instant82 = dateTime57.toInstant();
        long long83 = instant82.getMillis();
        org.joda.time.Instant instant84 = instant82.toInstant();
        org.joda.time.DateTimeZone dateTimeZone85 = instant82.getZone();
        boolean boolean86 = dateTime21.isEqual((org.joda.time.ReadableInstant) instant82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and instant82", (dateTime57.compareTo(instant82) == 0) == dateTime57.equals(instant82));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str1 = durationFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime();
        java.lang.String str3 = localDateTime2.toString();
        int int4 = localDateTime2.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusMonths(2);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime(readableInstant17);
        long long19 = dateTime18.getMillis();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime23.getFieldType((int) (short) 0);
        boolean boolean26 = dateTime18.isSupported(dateTimeFieldType25);
        org.joda.time.DateTime dateTime27 = localDateTime6.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str30 = dateTimeZone28.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str41 = dateTimeZone39.getShortName((long) (short) 10);
        long long43 = dateTimeZone39.convertUTCToLocal((long) ' ');
        java.lang.String str44 = dateTimeZone39.toString();
        long long46 = dateTimeZone39.previousTransition(32L);
        long long49 = dateTimeZone39.convertLocalToUTC(97L, false);
        boolean boolean50 = dateTime38.equals((java.lang.Object) false);
        boolean boolean51 = dateTime27.isEqual((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Chronology chronology52 = dateTime38.getChronology();
        org.joda.time.DurationField durationField53 = durationFieldType0.getField(chronology52);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology56 = localDateTime55.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.hours();
        org.joda.time.DurationField durationField58 = durationFieldType0.getField(chronology56);
        java.lang.String str59 = durationFieldType0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField53 and durationField58", (durationField53.compareTo(durationField58) == 0) == durationField53.equals(durationField58));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.getName();
        java.lang.String str3 = durationFieldType1.getName();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withDurationAdded(readableDuration5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.era();
        int int9 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withWeekOfWeekyear((int) (byte) 1);
        int int12 = localDateTime4.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime4.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.days();
        java.lang.String str16 = durationFieldType15.toString();
        boolean boolean17 = localDateTime14.isSupported(durationFieldType15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.weekyears();
        boolean boolean23 = dateTimeFieldType18.isSupported(chronology21);
        org.joda.time.DurationField durationField24 = durationFieldType15.getField(chronology21);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = chronology21.add(readablePeriod25, (long) 27427155, (int) (byte) 0);
        org.joda.time.DurationField durationField29 = chronology21.hours();
        org.joda.time.DateTimeField dateTimeField30 = chronology21.weekyearOfCentury();
        org.joda.time.DurationField durationField31 = chronology21.centuries();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.weekyears();
        org.joda.time.DurationField durationField36 = chronology34.seconds();
        org.joda.time.DurationField durationField37 = chronology34.seconds();
        org.joda.time.DurationField durationField38 = chronology34.millis();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.weekyears();
        boolean boolean44 = dateTimeFieldType39.isSupported(chronology42);
        org.joda.time.DateTimeField dateTimeField45 = chronology42.halfdayOfDay();
        org.joda.time.DurationField durationField46 = chronology42.millis();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology42.getZone();
        org.joda.time.Chronology chronology48 = chronology34.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology49 = chronology21.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField50 = durationFieldType1.getField(chronology49);
        java.lang.String str51 = durationFieldType1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField50", (durationField22.compareTo(durationField50) == 0) == durationField22.equals(durationField50));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology3);
        org.joda.time.DateTimeField dateTimeField7 = chronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusDays(0);
        long long14 = chronology3.set((org.joda.time.ReadablePartial) localDateTime12, (long) 24);
        org.joda.time.DateTimeField dateTimeField15 = chronology3.centuryOfEra();
        org.joda.time.DurationField durationField16 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField4, and durationField5", !(durationField16.compareTo(durationField4) == 0) || (Math.signum(durationField16.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusMillis((-1));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYear((int) (short) 100);
        java.lang.String str14 = localDateTime13.toString();
        boolean boolean15 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDateTime13);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray18 = strSet17.toArray();
        boolean boolean19 = strSet17.isEmpty();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray22 = strSet21.toArray();
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        boolean boolean25 = strSet21.removeAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray30 = new org.joda.time.DurationFieldType[] { durationFieldType28, durationFieldType29 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = strSet27.toArray(durationFieldTypeArray30);
        boolean boolean32 = strSet21.containsAll((java.util.Collection<java.lang.String>) strSet27);
        java.lang.Object[] objArray33 = strSet27.toArray();
        boolean boolean34 = strSet17.removeAll((java.util.Collection<java.lang.String>) strSet27);
        java.util.Locale locale35 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray37 = strSet36.toArray();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        boolean boolean40 = strSet36.removeAll((java.util.Collection<java.lang.String>) strSet39);
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray45 = new org.joda.time.DurationFieldType[] { durationFieldType43, durationFieldType44 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray46 = strSet42.toArray(durationFieldTypeArray45);
        boolean boolean47 = strSet36.containsAll((java.util.Collection<java.lang.String>) strSet42);
        java.util.Locale locale48 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray50 = strSet49.toArray();
        java.util.Locale locale51 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        boolean boolean53 = strSet49.removeAll((java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale locale54 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray58 = new org.joda.time.DurationFieldType[] { durationFieldType56, durationFieldType57 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray59 = strSet55.toArray(durationFieldTypeArray58);
        boolean boolean60 = strSet49.containsAll((java.util.Collection<java.lang.String>) strSet55);
        java.lang.Object[] objArray61 = strSet55.toArray();
        boolean boolean62 = strSet36.retainAll((java.util.Collection<java.lang.String>) strSet55);
        boolean boolean63 = strSet27.addAll((java.util.Collection<java.lang.String>) strSet55);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean65 = strSet55.remove((java.lang.Object) dateTimeFieldType64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime3.property(dateTimeFieldType64);
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.weekyears();
        org.joda.time.DurationField durationField72 = chronology70.centuries();
        org.joda.time.DurationField durationField73 = durationFieldType67.getField(chronology70);
        boolean boolean74 = dateTimeFieldType64.isSupported(chronology70);
        org.joda.time.DurationField durationField75 = chronology70.weekyears();
        java.lang.String str76 = chronology70.toString();
        org.joda.time.DateTimeField dateTimeField77 = chronology70.monthOfYear();
        org.joda.time.DateTimeField dateTimeField78 = chronology70.year();
        org.joda.time.DurationField durationField79 = chronology70.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField79, durationField71, and durationField72", !(durationField79.compareTo(durationField71) == 0) || (Math.signum(durationField79.compareTo(durationField72)) == Math.signum(durationField71.compareTo(durationField72))));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusMillis((-1));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYear((int) (short) 100);
        java.lang.String str14 = localDateTime13.toString();
        boolean boolean15 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDateTime13);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray18 = strSet17.toArray();
        boolean boolean19 = strSet17.isEmpty();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray22 = strSet21.toArray();
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        boolean boolean25 = strSet21.removeAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray30 = new org.joda.time.DurationFieldType[] { durationFieldType28, durationFieldType29 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = strSet27.toArray(durationFieldTypeArray30);
        boolean boolean32 = strSet21.containsAll((java.util.Collection<java.lang.String>) strSet27);
        java.lang.Object[] objArray33 = strSet27.toArray();
        boolean boolean34 = strSet17.removeAll((java.util.Collection<java.lang.String>) strSet27);
        java.util.Locale locale35 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray37 = strSet36.toArray();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        boolean boolean40 = strSet36.removeAll((java.util.Collection<java.lang.String>) strSet39);
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray45 = new org.joda.time.DurationFieldType[] { durationFieldType43, durationFieldType44 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray46 = strSet42.toArray(durationFieldTypeArray45);
        boolean boolean47 = strSet36.containsAll((java.util.Collection<java.lang.String>) strSet42);
        java.util.Locale locale48 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray50 = strSet49.toArray();
        java.util.Locale locale51 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        boolean boolean53 = strSet49.removeAll((java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale locale54 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray58 = new org.joda.time.DurationFieldType[] { durationFieldType56, durationFieldType57 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray59 = strSet55.toArray(durationFieldTypeArray58);
        boolean boolean60 = strSet49.containsAll((java.util.Collection<java.lang.String>) strSet55);
        java.lang.Object[] objArray61 = strSet55.toArray();
        boolean boolean62 = strSet36.retainAll((java.util.Collection<java.lang.String>) strSet55);
        boolean boolean63 = strSet27.addAll((java.util.Collection<java.lang.String>) strSet55);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean65 = strSet55.remove((java.lang.Object) dateTimeFieldType64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime3.property(dateTimeFieldType64);
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.weekyears();
        org.joda.time.DurationField durationField72 = chronology70.centuries();
        org.joda.time.DurationField durationField73 = durationFieldType67.getField(chronology70);
        boolean boolean74 = dateTimeFieldType64.isSupported(chronology70);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str77 = dateTimeZone75.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime78 = org.joda.time.LocalDateTime.now(dateTimeZone75);
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.millisOfDay();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime78.plusMonths((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod82 = null;
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.plus(readablePeriod82);
        long long85 = chronology70.set((org.joda.time.ReadablePartial) localDateTime83, 864000010L);
        org.joda.time.DurationField durationField86 = chronology70.halfdays();
        org.joda.time.DateTimeField dateTimeField87 = chronology70.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField88 = chronology70.millisOfDay();
        org.joda.time.DurationField durationField89 = chronology70.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField89, durationField71, and durationField72", !(durationField89.compareTo(durationField71) == 0) || (Math.signum(durationField89.compareTo(durationField72)) == Math.signum(durationField71.compareTo(durationField72))));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        long long15 = dateTimeZone11.convertUTCToLocal((long) ' ');
        java.lang.String str16 = dateTimeZone11.toString();
        long long18 = dateTimeZone11.previousTransition(32L);
        long long21 = dateTimeZone11.convertLocalToUTC(97L, false);
        boolean boolean22 = dateTime10.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        long long34 = dateTime33.getMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDateTime38.getFieldType((int) (short) 0);
        boolean boolean41 = dateTime33.isSupported(dateTimeFieldType40);
        boolean boolean42 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime33);
        java.lang.String str43 = dateTime10.toString();
        boolean boolean45 = dateTime10.equals((java.lang.Object) (short) 1);
        org.joda.time.Instant instant46 = dateTime10.toInstant();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withDurationAdded(readableDuration48, (int) '#');
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.weekyear();
        int int52 = property51.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField53 = property51.getField();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str56 = dateTimeZone54.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now(dateTimeZone54);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.millisOfDay();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.minusHours((int) (short) 10);
        int int65 = dateTimeField53.getMinimumValue((org.joda.time.ReadablePartial) localDateTime64);
        java.lang.String str67 = dateTimeField53.getAsText((long) (-292275054));
        long long69 = dateTimeField53.roundHalfFloor(0L);
        java.util.Locale locale71 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale72 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str73 = locale71.getDisplayCountry(locale72);
        java.util.Locale locale74 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale75 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str76 = locale74.getDisplayCountry(locale75);
        java.lang.String str77 = locale71.getDisplayVariant(locale74);
        java.util.Locale locale78 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale79 = locale78.stripExtensions();
        java.lang.String str80 = locale71.getDisplayLanguage(locale79);
        java.lang.String str81 = dateTimeField53.getAsText((int) (byte) 1, locale71);
        boolean boolean82 = instant46.equals((java.lang.Object) dateTimeField53);
        boolean boolean84 = dateTimeField53.isLeap(1908360000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant46", (dateTime10.compareTo(instant46) == 0) == dateTime10.equals(instant46));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        long long11 = dateTime10.getMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = localDateTime15.getFieldType((int) (short) 0);
        boolean boolean18 = dateTime10.isSupported(dateTimeFieldType17);
        long long19 = dateTime10.getMillis();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfDay();
        org.joda.time.ReadableInstant readableInstant25 = null;
        long long26 = property24.getDifferenceAsLong(readableInstant25);
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = locale27.getISO3Language();
        java.lang.String str29 = property24.getAsShortText(locale27);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str32 = dateTimeZone30.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime38.toDateTime(readableInstant39);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str43 = dateTimeZone41.getShortName((long) (short) 10);
        long long45 = dateTimeZone41.convertUTCToLocal((long) ' ');
        java.lang.String str46 = dateTimeZone41.toString();
        long long48 = dateTimeZone41.previousTransition(32L);
        long long51 = dateTimeZone41.convertLocalToUTC(97L, false);
        boolean boolean52 = dateTime40.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str55 = dateTimeZone53.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now(dateTimeZone53);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.millisOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime56.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.DateTime dateTime63 = localDateTime61.toDateTime(readableInstant62);
        long long64 = dateTime63.getMillis();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str67 = dateTimeZone65.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now(dateTimeZone65);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = localDateTime68.getFieldType((int) (short) 0);
        boolean boolean71 = dateTime63.isSupported(dateTimeFieldType70);
        boolean boolean72 = dateTime40.isAfter((org.joda.time.ReadableInstant) dateTime63);
        java.lang.String str73 = dateTime40.toString();
        long long74 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime40);
        boolean boolean75 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Instant instant76 = dateTime10.toInstant();
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime();
        java.lang.String str78 = localDateTime77.toString();
        int int79 = localDateTime77.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime77.minusMonths(2);
        org.joda.time.LocalDateTime.Property property82 = localDateTime81.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod83 = null;
        org.joda.time.LocalDateTime localDateTime85 = localDateTime81.withPeriodAdded(readablePeriod83, 56);
        org.joda.time.ReadableDuration readableDuration86 = null;
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.minus(readableDuration86);
        org.joda.time.DateTime dateTime88 = localDateTime87.toDateTime();
        boolean boolean89 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and instant76", (dateTime40.compareTo(instant76) == 0) == dateTime40.equals(instant76));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        long long4 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.lang.String str5 = dateTimeZone0.toString();
        long long8 = dateTimeZone0.adjustOffset((long) (short) 100, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) "CA");
        int int13 = dateTimeZone0.getOffsetFromLocal(1094L);
        long long15 = dateTimeZone0.convertUTCToLocal(1645629434501L);
        long long17 = dateTimeZone0.convertUTCToLocal(224L);
        long long19 = dateTimeZone0.convertUTCToLocal((long) 57);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.hours();
        java.lang.String str24 = chronology22.toString();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology22.era();
        org.joda.time.DurationField durationField27 = dateTimeField26.getDurationField();
        java.lang.String str28 = durationField27.getName();
        boolean boolean29 = dateTimeZone0.equals((java.lang.Object) str28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField23 and durationField27", Math.signum(durationField23.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField23)));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology3);
        org.joda.time.DurationField durationField7 = chronology3.millis();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.year();
        org.joda.time.DurationField durationField11 = chronology3.minutes();
        org.joda.time.DurationField durationField12 = chronology3.minutes();
        org.joda.time.DurationField durationField13 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology3.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField13", (durationField4.compareTo(durationField13) == 0) == durationField4.equals(durationField13));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.seconds();
        org.joda.time.DurationField durationField6 = chronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.DurationField durationField13 = chronology11.centuries();
        org.joda.time.DurationField durationField14 = chronology11.minutes();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology11.getZone();
        org.joda.time.Chronology chronology16 = chronology2.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = chronology16.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfDay();
        java.lang.String str23 = property22.getName();
        org.joda.time.LocalDateTime localDateTime24 = property22.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime26 = property22.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withDurationAdded(readableDuration28, (int) '#');
        org.joda.time.LocalDateTime.Property property31 = localDateTime27.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime32 = property31.withMinimumValue();
        boolean boolean33 = localDateTime26.isBefore((org.joda.time.ReadablePartial) localDateTime32);
        int[] intArray35 = chronology16.get((org.joda.time.ReadablePartial) localDateTime32, 0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.ReadableInstant readableInstant5 = null;
        long long6 = property4.getDifferenceAsLong(readableInstant5);
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale7.getISO3Language();
        java.lang.String str9 = property4.getAsShortText(locale7);
        org.joda.time.DurationField durationField10 = property4.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime(readableInstant20);
        long long22 = dateTime21.getMillis();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = localDateTime26.getFieldType((int) (short) 0);
        boolean boolean29 = dateTime21.isSupported(dateTimeFieldType28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str32 = dateTimeZone30.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfDay();
        org.joda.time.ReadableInstant readableInstant35 = null;
        long long36 = property34.getDifferenceAsLong(readableInstant35);
        org.joda.time.DurationField durationField37 = property34.getLeapDurationField();
        java.lang.String str38 = property34.getAsString();
        org.joda.time.LocalDateTime localDateTime39 = property34.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str44 = dateTimeZone42.getShortName((long) (short) 10);
        long long46 = dateTimeZone42.convertUTCToLocal((long) ' ');
        java.lang.String str47 = dateTimeZone42.toString();
        boolean boolean49 = dateTimeZone42.equals((java.lang.Object) (short) 100);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone42.getShortName((long) (-1), locale51);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime54 = localDateTime41.toDateTime(dateTimeZone42);
        boolean boolean55 = dateTime21.isEqual((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Instant instant56 = dateTime54.toInstant();
        long long57 = instant56.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology61 = localDateTime60.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.weekyears();
        org.joda.time.DurationField durationField63 = chronology61.centuries();
        org.joda.time.DurationField durationField64 = chronology61.minutes();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology61);
        boolean boolean66 = dateTimeFieldType58.isSupported(chronology61);
        int int67 = instant56.get(dateTimeFieldType58);
        long long68 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) instant56);
        java.util.Locale locale69 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet70 = locale69.getUnicodeLocaleAttributes();
        java.lang.String str71 = locale69.toLanguageTag();
        java.lang.String str72 = locale69.getScript();
        java.util.Locale locale73 = java.util.Locale.US;
        java.lang.String str74 = locale69.getDisplayName(locale73);
        java.lang.String str75 = locale69.getDisplayCountry();
        java.lang.String str76 = locale69.getDisplayName();
        java.lang.String str77 = property4.getAsText(locale69);
        org.joda.time.LocalDateTime localDateTime78 = property4.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and instant56", (dateTime54.compareTo(instant56) == 0) == dateTime54.equals(instant56));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType5.getDurationType();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.hours();
        org.joda.time.DurationField durationField12 = durationFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField14 = chronology10.weeks();
        org.joda.time.DurationField durationField15 = durationFieldType6.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField16 = chronology10.era();
        long long20 = chronology10.add((long) 2720, 1645629459904L, 0);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.weekyears();
        org.joda.time.DurationField durationField26 = chronology24.centuries();
        org.joda.time.DurationField durationField27 = chronology24.hours();
        boolean boolean28 = durationFieldType21.isSupported(chronology24);
        org.joda.time.DateTimeField dateTimeField29 = chronology24.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str32 = dateTimeZone30.getShortName((long) (short) 10);
        long long34 = dateTimeZone30.convertUTCToLocal((long) ' ');
        java.lang.String str35 = dateTimeZone30.toString();
        long long37 = dateTimeZone30.previousTransition(32L);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withWeekyear(22);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str43 = dateTimeZone41.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.millisOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.withFields((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minus(readablePeriod47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.plusHours(93);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology54 = localDateTime53.getChronology();
        org.joda.time.DurationField durationField55 = chronology54.weekyears();
        org.joda.time.DurationField durationField56 = chronology54.centuries();
        org.joda.time.DurationField durationField57 = chronology54.hours();
        boolean boolean58 = dateTimeFieldType51.isSupported(chronology54);
        org.joda.time.DateTimeField dateTimeField59 = chronology54.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField60 = chronology54.weekyear();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str63 = dateTimeZone61.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.now(dateTimeZone61);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int66 = localDateTime64.get(dateTimeFieldType65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime64.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str70 = dateTimeZone68.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime71 = org.joda.time.LocalDateTime.now(dateTimeZone68);
        org.joda.time.LocalDateTime.Property property72 = localDateTime71.millisOfDay();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.plusMonths((int) (byte) 100);
        boolean boolean75 = localDateTime64.isEqual((org.joda.time.ReadablePartial) localDateTime71);
        java.util.Locale locale77 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale77);
        java.util.Locale locale79 = java.util.Locale.CANADA;
        boolean boolean80 = locale79.hasExtensions();
        java.lang.String str81 = locale77.getDisplayScript(locale79);
        java.lang.String str82 = dateTimeField60.getAsText((org.joda.time.ReadablePartial) localDateTime71, 5, locale77);
        java.lang.String str83 = dateTimeField29.getAsShortText((org.joda.time.ReadablePartial) localDateTime46, locale77);
        int[] intArray85 = chronology10.get((org.joda.time.ReadablePartial) localDateTime46, 1645629424636L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField25", (durationField15.compareTo(durationField25) == 0) == durationField15.equals(durationField25));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusMillis((-1));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYear((int) (short) 100);
        java.lang.String str14 = localDateTime13.toString();
        boolean boolean15 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDateTime13);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray18 = strSet17.toArray();
        boolean boolean19 = strSet17.isEmpty();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray22 = strSet21.toArray();
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        boolean boolean25 = strSet21.removeAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray30 = new org.joda.time.DurationFieldType[] { durationFieldType28, durationFieldType29 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = strSet27.toArray(durationFieldTypeArray30);
        boolean boolean32 = strSet21.containsAll((java.util.Collection<java.lang.String>) strSet27);
        java.lang.Object[] objArray33 = strSet27.toArray();
        boolean boolean34 = strSet17.removeAll((java.util.Collection<java.lang.String>) strSet27);
        java.util.Locale locale35 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray37 = strSet36.toArray();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        boolean boolean40 = strSet36.removeAll((java.util.Collection<java.lang.String>) strSet39);
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray45 = new org.joda.time.DurationFieldType[] { durationFieldType43, durationFieldType44 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray46 = strSet42.toArray(durationFieldTypeArray45);
        boolean boolean47 = strSet36.containsAll((java.util.Collection<java.lang.String>) strSet42);
        java.util.Locale locale48 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray50 = strSet49.toArray();
        java.util.Locale locale51 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        boolean boolean53 = strSet49.removeAll((java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale locale54 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray58 = new org.joda.time.DurationFieldType[] { durationFieldType56, durationFieldType57 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray59 = strSet55.toArray(durationFieldTypeArray58);
        boolean boolean60 = strSet49.containsAll((java.util.Collection<java.lang.String>) strSet55);
        java.lang.Object[] objArray61 = strSet55.toArray();
        boolean boolean62 = strSet36.retainAll((java.util.Collection<java.lang.String>) strSet55);
        boolean boolean63 = strSet27.addAll((java.util.Collection<java.lang.String>) strSet55);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean65 = strSet55.remove((java.lang.Object) dateTimeFieldType64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime3.property(dateTimeFieldType64);
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.weekyears();
        org.joda.time.DurationField durationField72 = chronology70.centuries();
        org.joda.time.DurationField durationField73 = durationFieldType67.getField(chronology70);
        boolean boolean74 = dateTimeFieldType64.isSupported(chronology70);
        org.joda.time.DurationField durationField75 = chronology70.seconds();
        org.joda.time.DurationField durationField76 = chronology70.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField76, durationField71, and durationField72", !(durationField76.compareTo(durationField71) == 0) || (Math.signum(durationField76.compareTo(durationField72)) == Math.signum(durationField71.compareTo(durationField72))));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.hours();
        org.joda.time.DurationField durationField5 = durationFieldType0.getField(chronology3);
        org.joda.time.Chronology chronology6 = chronology3.withUTC();
        org.joda.time.DurationField durationField7 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField4, and durationField5", !(durationField7.compareTo(durationField4) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType5.getDurationType();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.hours();
        org.joda.time.DurationField durationField12 = durationFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField14 = chronology10.weeks();
        org.joda.time.DurationField durationField15 = durationFieldType6.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField16 = chronology10.era();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (byte) 100);
        java.lang.String str19 = localDateTime18.toString();
        int int20 = dateTimeField16.getMaximumValue((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.DurationField durationField21 = dateTimeField16.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField11, and durationField12", !(durationField21.compareTo(durationField11) == 0) || (Math.signum(durationField21.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str1 = durationFieldType0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.DurationField durationField7 = chronology5.centuries();
        org.joda.time.DurationField durationField8 = durationFieldType2.getField(chronology5);
        boolean boolean9 = durationFieldType0.isSupported(chronology5);
        org.joda.time.DurationField durationField10 = chronology5.years();
        long long13 = durationField10.subtract(1645629354802L, (int) 'u');
        long long16 = durationField10.getValueAsLong(1645629386443L, (long) 26149500);
        long long18 = durationField10.getMillis(81256273);
        org.joda.time.DurationFieldType durationFieldType19 = durationField10.getType();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.weekyears();
        org.joda.time.DurationField durationField24 = chronology22.centuries();
        org.joda.time.DurationField durationField25 = chronology22.minutes();
        org.joda.time.DateTimeField dateTimeField26 = chronology22.monthOfYear();
        org.joda.time.DurationField durationField27 = chronology22.months();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str30 = dateTimeZone28.getShortName((long) (short) 10);
        long long32 = dateTimeZone28.convertUTCToLocal((long) ' ');
        java.lang.String str33 = dateTimeZone28.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.Chronology chronology35 = chronology22.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField36 = chronology22.dayOfYear();
        org.joda.time.DurationField durationField37 = durationFieldType19.getField(chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField37", (durationField6.compareTo(durationField37) == 0) == durationField6.equals(durationField37));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.seconds();
        org.joda.time.DurationField durationField6 = chronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.DurationField durationField13 = chronology11.centuries();
        org.joda.time.DurationField durationField14 = chronology11.minutes();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology11.getZone();
        org.joda.time.Chronology chronology16 = chronology2.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = chronology16.years();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        long long4 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.lang.String str5 = dateTimeZone0.toString();
        long long7 = dateTimeZone0.previousTransition(32L);
        java.lang.String str9 = dateTimeZone0.getName(1645629371478L);
        long long12 = dateTimeZone0.convertLocalToUTC(0L, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str15 = dateTimeZone13.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.minuteOfHour();
        int int21 = property20.get();
        org.joda.time.LocalDateTime localDateTime23 = property20.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime24 = property20.roundCeilingCopy();
        org.joda.time.DateTimeField[] dateTimeFieldArray25 = localDateTime24.getFields();
        int int26 = localDateTime24.getWeekyear();
        boolean boolean27 = dateTimeZone0.isLocalDateTimeGap(localDateTime24);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withDurationAdded(readableDuration29, (int) '#');
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.weekyear();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusMillis((-1));
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        java.lang.String str36 = localDateTime35.toString();
        int int37 = localDateTime35.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.minusMonths(2);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str43 = dateTimeZone41.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.millisOfDay();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime44.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.DateTime dateTime51 = localDateTime49.toDateTime(readableInstant50);
        long long52 = dateTime51.getMillis();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str55 = dateTimeZone53.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now(dateTimeZone53);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = localDateTime56.getFieldType((int) (short) 0);
        boolean boolean59 = dateTime51.isSupported(dateTimeFieldType58);
        org.joda.time.DateTime dateTime60 = localDateTime39.toDateTime((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str63 = dateTimeZone61.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.now(dateTimeZone61);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.millisOfDay();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime64.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.DateTime dateTime71 = localDateTime69.toDateTime(readableInstant70);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str74 = dateTimeZone72.getShortName((long) (short) 10);
        long long76 = dateTimeZone72.convertUTCToLocal((long) ' ');
        java.lang.String str77 = dateTimeZone72.toString();
        long long79 = dateTimeZone72.previousTransition(32L);
        long long82 = dateTimeZone72.convertLocalToUTC(97L, false);
        boolean boolean83 = dateTime71.equals((java.lang.Object) false);
        boolean boolean84 = dateTime60.isEqual((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.Instant instant85 = dateTime60.toInstant();
        org.joda.time.DateTime dateTime86 = localDateTime31.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        int int87 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and instant85", (dateTime60.compareTo(instant85) == 0) == dateTime60.equals(instant85));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        long long15 = dateTimeZone11.convertUTCToLocal((long) ' ');
        java.lang.String str16 = dateTimeZone11.toString();
        long long18 = dateTimeZone11.previousTransition(32L);
        long long21 = dateTimeZone11.convertLocalToUTC(97L, false);
        boolean boolean22 = dateTime10.equals((java.lang.Object) false);
        org.joda.time.Chronology chronology23 = dateTime10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str26 = dateTimeZone24.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfDay();
        org.joda.time.ReadableInstant readableInstant29 = null;
        long long30 = property28.getDifferenceAsLong(readableInstant29);
        int int31 = property28.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime32 = property28.roundHalfEvenCopy();
        org.joda.time.DurationField durationField33 = property28.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime34 = property28.roundHalfEvenCopy();
        java.lang.String str35 = property28.getName();
        java.util.Locale locale36 = java.util.Locale.ITALY;
        java.lang.String str37 = property28.getAsText(locale36);
        org.joda.time.LocalDateTime localDateTime39 = property28.addToCopy(26180486);
        long long41 = chronology23.set((org.joda.time.ReadablePartial) localDateTime39, 1645629361196L);
        org.joda.time.DurationField durationField42 = chronology23.eras();
        org.joda.time.DurationField durationField43 = chronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField33 and durationField43", Math.signum(durationField33.compareTo(durationField43)) == -Math.signum(durationField43.compareTo(durationField33)));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        long long4 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.lang.String str5 = dateTimeZone0.toString();
        long long7 = dateTimeZone0.previousTransition(32L);
        long long10 = dateTimeZone0.convertLocalToUTC(97L, false);
        java.lang.String str12 = dateTimeZone0.getShortName((long) 5);
        int int14 = dateTimeZone0.getOffset((long) 567);
        long long16 = dateTimeZone0.nextTransition((long) 26213656);
        long long18 = dateTimeZone0.previousTransition(1645586240327L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime(readableInstant28);
        long long30 = dateTime29.getMillis();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = localDateTime34.getFieldType((int) (short) 0);
        boolean boolean37 = dateTime29.isSupported(dateTimeFieldType36);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str40 = dateTimeZone38.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(dateTimeZone38);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfDay();
        org.joda.time.ReadableInstant readableInstant43 = null;
        long long44 = property42.getDifferenceAsLong(readableInstant43);
        org.joda.time.DurationField durationField45 = property42.getLeapDurationField();
        java.lang.String str46 = property42.getAsString();
        org.joda.time.LocalDateTime localDateTime47 = property42.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName((long) (short) 10);
        long long54 = dateTimeZone50.convertUTCToLocal((long) ' ');
        java.lang.String str55 = dateTimeZone50.toString();
        boolean boolean57 = dateTimeZone50.equals((java.lang.Object) (short) 100);
        java.util.Locale locale59 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str60 = dateTimeZone50.getShortName((long) (-1), locale59);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime62 = localDateTime49.toDateTime(dateTimeZone50);
        boolean boolean63 = dateTime29.isEqual((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Instant instant64 = dateTime62.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = null;
        boolean boolean66 = instant64.isSupported(dateTimeFieldType65);
        int int67 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant64);
        java.lang.String str69 = dateTimeZone0.getShortName(1645629671576L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime62 and instant64", (dateTime62.compareTo(instant64) == 0) == dateTime62.equals(instant64));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        boolean boolean5 = dateTimeFieldType0.isSupported(chronology3);
        long long9 = chronology3.add(2100009L, 1L, 26198);
        org.joda.time.DateTimeField dateTimeField10 = chronology3.dayOfYear();
        org.joda.time.Chronology chronology11 = chronology3.withUTC();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField12", Math.signum(durationField4.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField4)));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        long long15 = dateTimeZone11.convertUTCToLocal((long) ' ');
        java.lang.String str16 = dateTimeZone11.toString();
        long long18 = dateTimeZone11.previousTransition(32L);
        long long21 = dateTimeZone11.convertLocalToUTC(97L, false);
        boolean boolean22 = dateTime10.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        long long34 = dateTime33.getMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDateTime38.getFieldType((int) (short) 0);
        boolean boolean41 = dateTime33.isSupported(dateTimeFieldType40);
        boolean boolean42 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str45 = dateTimeZone43.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime51.toDateTime(readableInstant52);
        long long54 = dateTime53.getMillis();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str57 = dateTimeZone55.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(dateTimeZone55);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = localDateTime58.getFieldType((int) (short) 0);
        boolean boolean61 = dateTime53.isSupported(dateTimeFieldType60);
        boolean boolean62 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime();
        java.lang.String str64 = localDateTime63.toString();
        int int65 = localDateTime63.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.minusMonths(2);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str71 = dateTimeZone69.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime72 = org.joda.time.LocalDateTime.now(dateTimeZone69);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.millisOfDay();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime72.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.DateTime dateTime79 = localDateTime77.toDateTime(readableInstant78);
        long long80 = dateTime79.getMillis();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str83 = dateTimeZone81.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime84 = org.joda.time.LocalDateTime.now(dateTimeZone81);
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = localDateTime84.getFieldType((int) (short) 0);
        boolean boolean87 = dateTime79.isSupported(dateTimeFieldType86);
        org.joda.time.DateTime dateTime88 = localDateTime67.toDateTime((org.joda.time.ReadableInstant) dateTime79);
        java.lang.String str89 = dateTime88.toString();
        boolean boolean90 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.Instant instant91 = dateTime88.toInstant();
        org.joda.time.Chronology chronology92 = instant91.getChronology();
        org.joda.time.DurationField durationField93 = chronology92.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime88 and instant91", (dateTime88.compareTo(instant91) == 0) == dateTime88.equals(instant91));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        java.lang.String str5 = property4.getName();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName((long) (short) 10);
        long long14 = dateTimeZone10.convertUTCToLocal((long) ' ');
        java.lang.String str15 = dateTimeZone10.toString();
        boolean boolean17 = dateTimeZone10.equals((java.lang.Object) (short) 100);
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = dateTimeZone10.getShortName((long) (-1), locale19);
        long long23 = dateTimeZone10.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone10);
        org.joda.time.DateTime dateTime25 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        java.lang.String str31 = property30.getName();
        org.joda.time.LocalDateTime localDateTime32 = property30.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean34 = localDateTime32.isSupported(dateTimeFieldType33);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.centuries();
        boolean boolean41 = localDateTime38.equals((java.lang.Object) durationFieldType40);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray42 = localDateTime38.getFieldTypes();
        java.lang.String str43 = localDateTime38.toString();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime38.plusMillis(22);
        boolean boolean46 = localDateTime32.isBefore((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.plus(readableDuration47);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withDurationAdded(readableDuration49, 26169);
        org.joda.time.DateTime dateTime52 = localDateTime48.toDateTime();
        org.joda.time.DateTime dateTime53 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTime53.getZone();
        org.joda.time.Instant instant55 = dateTime53.toInstant();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str58 = dateTimeZone56.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime59 = org.joda.time.LocalDateTime.now(dateTimeZone56);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.millisOfDay();
        java.lang.String str61 = property60.getName();
        org.joda.time.LocalDateTime localDateTime62 = property60.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str68 = dateTimeZone66.getShortName((long) (short) 10);
        long long70 = dateTimeZone66.convertUTCToLocal((long) ' ');
        java.lang.String str71 = dateTimeZone66.toString();
        boolean boolean73 = dateTimeZone66.equals((java.lang.Object) (short) 100);
        java.util.Locale locale75 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str76 = dateTimeZone66.getShortName((long) (-1), locale75);
        long long79 = dateTimeZone66.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone66);
        org.joda.time.DateTime dateTime81 = localDateTime64.toDateTime(dateTimeZone66);
        boolean boolean82 = instant55.isBefore((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTimeZone dateTimeZone83 = instant55.getZone();
        long long85 = dateTimeZone83.convertUTCToLocal(1645629670179L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant55", (dateTime25.compareTo(instant55) == 0) == dateTime25.equals(instant55));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.minutes();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology3);
        boolean boolean8 = dateTimeFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField9 = chronology3.months();
        org.joda.time.DurationField durationField10 = chronology3.years();
        org.joda.time.DurationField durationField11 = chronology3.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        long long4 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.lang.String str5 = dateTimeZone0.toString();
        long long8 = dateTimeZone0.adjustOffset((long) (short) 100, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) "CA");
        int int13 = dateTimeZone0.getOffset(69000L);
        long long15 = dateTimeZone0.previousTransition((long) 1745);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        java.lang.String str17 = localDateTime16.toString();
        int int18 = localDateTime16.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minusMonths(2);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str24 = dateTimeZone22.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime30.toDateTime(readableInstant31);
        long long33 = dateTime32.getMillis();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str36 = dateTimeZone34.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(dateTimeZone34);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = localDateTime37.getFieldType((int) (short) 0);
        boolean boolean40 = dateTime32.isSupported(dateTimeFieldType39);
        org.joda.time.DateTime dateTime41 = localDateTime20.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str44 = dateTimeZone42.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now(dateTimeZone42);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.millisOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime45.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localDateTime50.toDateTime(readableInstant51);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str55 = dateTimeZone53.getShortName((long) (short) 10);
        long long57 = dateTimeZone53.convertUTCToLocal((long) ' ');
        java.lang.String str58 = dateTimeZone53.toString();
        long long60 = dateTimeZone53.previousTransition(32L);
        long long63 = dateTimeZone53.convertLocalToUTC(97L, false);
        boolean boolean64 = dateTime52.equals((java.lang.Object) false);
        boolean boolean65 = dateTime41.isEqual((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Instant instant66 = dateTime41.toInstant();
        long long67 = instant66.getMillis();
        org.joda.time.Instant instant68 = instant66.toInstant();
        java.lang.String str69 = instant68.toString();
        int int70 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant68);
        java.lang.String str71 = dateTimeZone0.getID();
        boolean boolean72 = dateTimeZone0.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and instant66", (dateTime41.compareTo(instant66) == 0) == dateTime41.equals(instant66));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = dateTimeField2.getAsShortText(100, locale5);
        int int8 = dateTimeField2.getLeapAmount((long) (short) 100);
        org.joda.time.DurationField durationField9 = dateTimeField2.getRangeDurationField();
        boolean boolean10 = dateTimeField2.isLenient();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = dateTimeField2.getType();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withDurationAdded(readableDuration13, (int) '#');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusMillis((-1));
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.dayOfMonth();
        int int20 = localDateTime15.getWeekyear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.plusSeconds(26163523);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.joda.time.DurationField durationField29 = chronology25.seconds();
        org.joda.time.Chronology chronology30 = chronology25.withUTC();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.centuries();
        boolean boolean37 = localDateTime34.equals((java.lang.Object) durationFieldType36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.Locale locale46 = new java.util.Locale("fra", "fran\347ais (Canada)");
        java.lang.String str47 = dateTimeZone42.getShortName((long) 26198, locale46);
        java.lang.String str48 = localDateTime39.toString("26156413", locale46);
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology52 = localDateTime51.getChronology();
        org.joda.time.DurationField durationField53 = chronology52.hours();
        org.joda.time.DurationField durationField54 = durationFieldType49.getField(chronology52);
        org.joda.time.Chronology chronology55 = chronology52.withUTC();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str58 = dateTimeZone56.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime59 = org.joda.time.LocalDateTime.now(dateTimeZone56);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = localDateTime59.getFieldType((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime59.minusSeconds(55000019);
        int int66 = localDateTime65.size();
        int[] intArray68 = chronology52.get((org.joda.time.ReadablePartial) localDateTime65, 8228146884657L);
        chronology25.validate((org.joda.time.ReadablePartial) localDateTime39, intArray68);
        int int70 = dateTimeField2.getMaximumValue((org.joda.time.ReadablePartial) localDateTime15, intArray68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField54", (durationField9.compareTo(durationField54) == 0) == durationField9.equals(durationField54));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.era();
        org.joda.time.DurationField durationField7 = dateTimeField6.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        boolean boolean13 = dateTimeFieldType8.isSupported(chronology11);
        org.joda.time.DurationField durationField14 = chronology11.centuries();
        org.joda.time.DurationField durationField15 = chronology11.minutes();
        org.joda.time.DurationField durationField16 = chronology11.seconds();
        long long19 = durationField16.getMillis(81263329, 1645629566870L);
        int int20 = durationField7.compareTo(durationField16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField12", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField12)) == Math.signum(durationField3.compareTo(durationField12))));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        int int6 = dateTimeField4.getMaximumValue(8228146884657L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusHours((int) (short) 10);
        int int18 = localDateTime15.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.minusYears((int) ' ');
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.minusHours((int) (byte) 1);
        int int23 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        java.lang.String str25 = localDateTime24.toString();
        int int26 = localDateTime24.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.minusMonths(2);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str32 = dateTimeZone30.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime38.toDateTime(readableInstant39);
        long long41 = dateTime40.getMillis();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str44 = dateTimeZone42.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now(dateTimeZone42);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = localDateTime45.getFieldType((int) (short) 0);
        boolean boolean48 = dateTime40.isSupported(dateTimeFieldType47);
        org.joda.time.DateTime dateTime49 = localDateTime28.toDateTime((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime58.toDateTime(readableInstant59);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str63 = dateTimeZone61.getShortName((long) (short) 10);
        long long65 = dateTimeZone61.convertUTCToLocal((long) ' ');
        java.lang.String str66 = dateTimeZone61.toString();
        long long68 = dateTimeZone61.previousTransition(32L);
        long long71 = dateTimeZone61.convertLocalToUTC(97L, false);
        boolean boolean72 = dateTime60.equals((java.lang.Object) false);
        boolean boolean73 = dateTime49.isEqual((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Instant instant74 = dateTime49.toInstant();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str77 = dateTimeZone75.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime78 = org.joda.time.LocalDateTime.now(dateTimeZone75);
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.millisOfDay();
        long long80 = property79.remainder();
        org.joda.time.LocalDateTime localDateTime81 = property79.roundFloorCopy();
        boolean boolean82 = instant74.equals((java.lang.Object) localDateTime81);
        int int83 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localDateTime81);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime81.plusMillis(27426722);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and instant74", (dateTime49.compareTo(instant74) == 0) == dateTime49.equals(instant74));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str53 = dateTimeZone51.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfDay();
        long long56 = property55.remainder();
        org.joda.time.LocalDateTime localDateTime57 = property55.roundFloorCopy();
        boolean boolean58 = instant50.equals((java.lang.Object) localDateTime57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime57.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        long long15 = dateTimeZone11.convertUTCToLocal((long) ' ');
        java.lang.String str16 = dateTimeZone11.toString();
        long long18 = dateTimeZone11.previousTransition(32L);
        long long21 = dateTimeZone11.convertLocalToUTC(97L, false);
        boolean boolean22 = dateTime10.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        long long34 = dateTime33.getMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDateTime38.getFieldType((int) (short) 0);
        boolean boolean41 = dateTime33.isSupported(dateTimeFieldType40);
        boolean boolean42 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime33);
        java.lang.String str43 = dateTime10.toString();
        boolean boolean45 = dateTime10.equals((java.lang.Object) (short) 1);
        org.joda.time.Instant instant46 = dateTime10.toInstant();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withDurationAdded(readableDuration48, (int) '#');
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.weekyear();
        int int52 = property51.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField53 = property51.getField();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str56 = dateTimeZone54.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now(dateTimeZone54);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.millisOfDay();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.minusHours((int) (short) 10);
        int int65 = dateTimeField53.getMinimumValue((org.joda.time.ReadablePartial) localDateTime64);
        java.lang.String str67 = dateTimeField53.getAsText((long) (-292275054));
        long long69 = dateTimeField53.roundHalfFloor(0L);
        java.util.Locale locale71 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale72 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str73 = locale71.getDisplayCountry(locale72);
        java.util.Locale locale74 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale75 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str76 = locale74.getDisplayCountry(locale75);
        java.lang.String str77 = locale71.getDisplayVariant(locale74);
        java.util.Locale locale78 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale79 = locale78.stripExtensions();
        java.lang.String str80 = locale71.getDisplayLanguage(locale79);
        java.lang.String str81 = dateTimeField53.getAsText((int) (byte) 1, locale71);
        boolean boolean82 = instant46.equals((java.lang.Object) dateTimeField53);
        int int84 = dateTimeField53.getMaximumValue((long) (-115031732));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant46", (dateTime10.compareTo(instant46) == 0) == dateTime10.equals(instant46));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.DurationField durationField8 = chronology6.centuries();
        boolean boolean9 = durationFieldType3.isSupported(chronology6);
        org.joda.time.DurationField durationField10 = chronology6.halfdays();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology12 = chronology6.withZone(dateTimeZone11);
        boolean boolean13 = dateTimeFieldType0.isSupported(chronology6);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        java.lang.String str15 = localDateTime14.toString();
        int int16 = localDateTime14.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusMonths(2);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        long long31 = dateTime30.getMillis();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str34 = dateTimeZone32.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = localDateTime35.getFieldType((int) (short) 0);
        boolean boolean38 = dateTime30.isSupported(dateTimeFieldType37);
        org.joda.time.DateTime dateTime39 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str42 = dateTimeZone40.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.millisOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.DateTime dateTime50 = localDateTime48.toDateTime(readableInstant49);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str53 = dateTimeZone51.getShortName((long) (short) 10);
        long long55 = dateTimeZone51.convertUTCToLocal((long) ' ');
        java.lang.String str56 = dateTimeZone51.toString();
        long long58 = dateTimeZone51.previousTransition(32L);
        long long61 = dateTimeZone51.convertLocalToUTC(97L, false);
        boolean boolean62 = dateTime50.equals((java.lang.Object) false);
        boolean boolean63 = dateTime39.isEqual((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Chronology chronology64 = dateTime50.getChronology();
        org.joda.time.DurationField durationField65 = chronology64.minutes();
        boolean boolean66 = dateTimeFieldType0.isSupported(chronology64);
        org.joda.time.DurationField durationField67 = chronology64.weekyears();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology64.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField67", (durationField7.compareTo(durationField67) == 0) == durationField7.equals(durationField67));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology2.monthOfYear();
        org.joda.time.DurationField durationField11 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readablePeriod2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMillis((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfCentury(51);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusWeeks(0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        java.lang.String str15 = property14.getName();
        org.joda.time.LocalDateTime localDateTime16 = property14.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName((long) (short) 10);
        long long24 = dateTimeZone20.convertUTCToLocal((long) ' ');
        java.lang.String str25 = dateTimeZone20.toString();
        boolean boolean27 = dateTimeZone20.equals((java.lang.Object) (short) 100);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone20.getShortName((long) (-1), locale29);
        long long33 = dateTimeZone20.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone20);
        org.joda.time.DateTime dateTime35 = localDateTime18.toDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str38 = dateTimeZone36.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        java.lang.String str41 = property40.getName();
        org.joda.time.LocalDateTime localDateTime42 = property40.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean44 = localDateTime42.isSupported(dateTimeFieldType43);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str47 = dateTimeZone45.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType50 = org.joda.time.DurationFieldType.centuries();
        boolean boolean51 = localDateTime48.equals((java.lang.Object) durationFieldType50);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray52 = localDateTime48.getFieldTypes();
        java.lang.String str53 = localDateTime48.toString();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime48.plusMillis(22);
        boolean boolean56 = localDateTime42.isBefore((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.plus(readableDuration57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withDurationAdded(readableDuration59, 26169);
        org.joda.time.DateTime dateTime62 = localDateTime58.toDateTime();
        org.joda.time.DateTime dateTime63 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime63.getZone();
        org.joda.time.Instant instant65 = dateTime63.toInstant();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str68 = dateTimeZone66.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime69 = org.joda.time.LocalDateTime.now(dateTimeZone66);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.millisOfDay();
        java.lang.String str71 = property70.getName();
        org.joda.time.LocalDateTime localDateTime72 = property70.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str78 = dateTimeZone76.getShortName((long) (short) 10);
        long long80 = dateTimeZone76.convertUTCToLocal((long) ' ');
        java.lang.String str81 = dateTimeZone76.toString();
        boolean boolean83 = dateTimeZone76.equals((java.lang.Object) (short) 100);
        java.util.Locale locale85 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str86 = dateTimeZone76.getShortName((long) (-1), locale85);
        long long89 = dateTimeZone76.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime90 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone76);
        org.joda.time.DateTime dateTime91 = localDateTime74.toDateTime(dateTimeZone76);
        boolean boolean92 = instant65.isBefore((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.DateTime dateTime93 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime91);
        boolean boolean95 = localDateTime9.equals((java.lang.Object) "Samstag");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant65", (dateTime35.compareTo(instant65) == 0) == dateTime35.equals(instant65));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readablePeriod2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMillis((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfCentury(51);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusWeeks(0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        java.lang.String str15 = property14.getName();
        org.joda.time.LocalDateTime localDateTime16 = property14.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName((long) (short) 10);
        long long24 = dateTimeZone20.convertUTCToLocal((long) ' ');
        java.lang.String str25 = dateTimeZone20.toString();
        boolean boolean27 = dateTimeZone20.equals((java.lang.Object) (short) 100);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone20.getShortName((long) (-1), locale29);
        long long33 = dateTimeZone20.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone20);
        org.joda.time.DateTime dateTime35 = localDateTime18.toDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str38 = dateTimeZone36.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        java.lang.String str41 = property40.getName();
        org.joda.time.LocalDateTime localDateTime42 = property40.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean44 = localDateTime42.isSupported(dateTimeFieldType43);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str47 = dateTimeZone45.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType50 = org.joda.time.DurationFieldType.centuries();
        boolean boolean51 = localDateTime48.equals((java.lang.Object) durationFieldType50);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray52 = localDateTime48.getFieldTypes();
        java.lang.String str53 = localDateTime48.toString();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime48.plusMillis(22);
        boolean boolean56 = localDateTime42.isBefore((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.plus(readableDuration57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withDurationAdded(readableDuration59, 26169);
        org.joda.time.DateTime dateTime62 = localDateTime58.toDateTime();
        org.joda.time.DateTime dateTime63 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime63.getZone();
        org.joda.time.Instant instant65 = dateTime63.toInstant();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str68 = dateTimeZone66.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime69 = org.joda.time.LocalDateTime.now(dateTimeZone66);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.millisOfDay();
        java.lang.String str71 = property70.getName();
        org.joda.time.LocalDateTime localDateTime72 = property70.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str78 = dateTimeZone76.getShortName((long) (short) 10);
        long long80 = dateTimeZone76.convertUTCToLocal((long) ' ');
        java.lang.String str81 = dateTimeZone76.toString();
        boolean boolean83 = dateTimeZone76.equals((java.lang.Object) (short) 100);
        java.util.Locale locale85 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str86 = dateTimeZone76.getShortName((long) (-1), locale85);
        long long89 = dateTimeZone76.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime90 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone76);
        org.joda.time.DateTime dateTime91 = localDateTime74.toDateTime(dateTimeZone76);
        boolean boolean92 = instant65.isBefore((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.DateTime dateTime93 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime91);
        long long94 = dateTime93.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant65", (dateTime35.compareTo(instant65) == 0) == dateTime35.equals(instant65));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.halfdayOfDay();
        org.joda.time.DurationField durationField8 = chronology2.centuries();
        org.joda.time.DurationField durationField9 = chronology2.years();
        org.joda.time.DurationField durationField10 = chronology2.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusHours(0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        java.lang.String str10 = dateTime9.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        long long16 = property15.remainder();
        org.joda.time.LocalDateTime localDateTime17 = property15.roundFloorCopy();
        java.lang.String str18 = property15.getAsShortText();
        org.joda.time.DurationField durationField19 = property15.getRangeDurationField();
        java.lang.String str20 = property15.getName();
        org.joda.time.Interval interval21 = property15.toInterval();
        org.joda.time.LocalDateTime localDateTime22 = property15.roundHalfFloorCopy();
        org.joda.time.DurationField durationField23 = property15.getDurationField();
        boolean boolean24 = dateTime9.equals((java.lang.Object) durationField23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        java.lang.String str26 = localDateTime25.toString();
        int int27 = localDateTime25.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.minusMonths(2);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localDateTime39.toDateTime(readableInstant40);
        long long42 = dateTime41.getMillis();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str45 = dateTimeZone43.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone43);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = localDateTime46.getFieldType((int) (short) 0);
        boolean boolean49 = dateTime41.isSupported(dateTimeFieldType48);
        org.joda.time.DateTime dateTime50 = localDateTime29.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str53 = dateTimeZone51.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime54.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.DateTime dateTime61 = localDateTime59.toDateTime(readableInstant60);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str64 = dateTimeZone62.getShortName((long) (short) 10);
        long long66 = dateTimeZone62.convertUTCToLocal((long) ' ');
        java.lang.String str67 = dateTimeZone62.toString();
        long long69 = dateTimeZone62.previousTransition(32L);
        long long72 = dateTimeZone62.convertLocalToUTC(97L, false);
        boolean boolean73 = dateTime61.equals((java.lang.Object) false);
        boolean boolean74 = dateTime50.isEqual((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Instant instant75 = dateTime50.toInstant();
        org.joda.time.DateTimeZone dateTimeZone76 = instant75.getZone();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str79 = dateTimeZone77.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime80 = org.joda.time.LocalDateTime.now(dateTimeZone77);
        org.joda.time.LocalDateTime.Property property81 = localDateTime80.millisOfDay();
        long long82 = property81.remainder();
        org.joda.time.LocalDateTime localDateTime83 = property81.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = property81.getFieldType();
        org.joda.time.DurationFieldType durationFieldType85 = dateTimeFieldType84.getRangeDurationType();
        boolean boolean86 = instant75.isSupported(dateTimeFieldType84);
        org.joda.time.Instant instant87 = instant75.toInstant();
        int int88 = dateTime9.compareTo((org.joda.time.ReadableInstant) instant87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant87", (dateTime50.compareTo(instant87) == 0) == dateTime50.equals(instant87));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        boolean boolean6 = localDateTime3.equals((java.lang.Object) durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime3.getFieldTypes();
        java.lang.String str8 = localDateTime3.toString();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.plusMillis(22);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology13 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology13.getZone();
        org.joda.time.DurationField durationField16 = chronology13.weekyears();
        org.joda.time.DurationField durationField17 = chronology13.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField16", (durationField14.compareTo(durationField16) == 0) == durationField14.equals(durationField16));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        boolean boolean7 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.monthOfYear();
        org.joda.time.DurationField durationField10 = dateTimeField9.getRangeDurationField();
        java.lang.String str11 = dateTimeField9.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str3 = dateTimeZone1.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.centuries();
        boolean boolean7 = localDateTime4.equals((java.lang.Object) durationFieldType6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField13 = durationFieldType6.getField(chronology10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName((long) (short) 10);
        long long18 = dateTimeZone14.convertUTCToLocal((long) ' ');
        java.lang.String str19 = dateTimeZone14.toString();
        long long22 = dateTimeZone14.adjustOffset((long) (short) 100, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.Chronology chronology24 = chronology10.withZone(dateTimeZone14);
        boolean boolean25 = dateTimeZone14.isFixed();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str29 = dateTimeZone27.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.DateTime dateTime37 = localDateTime35.toDateTime(readableInstant36);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str40 = dateTimeZone38.getShortName((long) (short) 10);
        long long42 = dateTimeZone38.convertUTCToLocal((long) ' ');
        java.lang.String str43 = dateTimeZone38.toString();
        long long45 = dateTimeZone38.previousTransition(32L);
        long long48 = dateTimeZone38.convertLocalToUTC(97L, false);
        boolean boolean49 = dateTime37.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime58.toDateTime(readableInstant59);
        long long61 = dateTime60.getMillis();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str64 = dateTimeZone62.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now(dateTimeZone62);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = localDateTime65.getFieldType((int) (short) 0);
        boolean boolean68 = dateTime60.isSupported(dateTimeFieldType67);
        boolean boolean69 = dateTime37.isAfter((org.joda.time.ReadableInstant) dateTime60);
        java.lang.String str70 = dateTime37.toString();
        long long71 = dateTime37.getMillis();
        org.joda.time.Chronology chronology72 = dateTime37.getChronology();
        org.joda.time.DurationField durationField73 = chronology72.hours();
        org.joda.time.DurationField durationField74 = chronology72.weekyears();
        org.joda.time.DurationFieldType durationFieldType75 = durationField74.getType();
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology78 = localDateTime77.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone80 = chronology78.getZone();
        org.joda.time.DurationField durationField81 = chronology78.centuries();
        org.joda.time.DateTimeField dateTimeField82 = chronology78.monthOfYear();
        boolean boolean83 = durationFieldType75.isSupported(chronology78);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime26.withFieldAdded(durationFieldType75, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField74", (durationField11.compareTo(durationField74) == 0) == durationField11.equals(durationField74));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        long long11 = dateTime10.getMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = localDateTime15.getFieldType((int) (short) 0);
        boolean boolean18 = dateTime10.isSupported(dateTimeFieldType17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.ReadableInstant readableInstant24 = null;
        long long25 = property23.getDifferenceAsLong(readableInstant24);
        org.joda.time.DurationField durationField26 = property23.getLeapDurationField();
        java.lang.String str27 = property23.getAsString();
        org.joda.time.LocalDateTime localDateTime28 = property23.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getShortName((long) (short) 10);
        long long35 = dateTimeZone31.convertUTCToLocal((long) ' ');
        java.lang.String str36 = dateTimeZone31.toString();
        boolean boolean38 = dateTimeZone31.equals((java.lang.Object) (short) 100);
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = dateTimeZone31.getShortName((long) (-1), locale40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime43 = localDateTime30.toDateTime(dateTimeZone31);
        boolean boolean44 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Instant instant45 = dateTime43.toInstant();
        long long46 = instant45.getMillis();
        org.joda.time.Instant instant47 = instant45.toInstant();
        org.joda.time.DateTimeZone dateTimeZone48 = instant45.getZone();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str51 = dateTimeZone49.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now(dateTimeZone49);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.millisOfDay();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime57 = property56.roundHalfCeilingCopy();
        boolean boolean58 = instant45.equals((java.lang.Object) property56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and instant45", (dateTime43.compareTo(instant45) == 0) == dateTime43.equals(instant45));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology3);
        org.joda.time.DurationField durationField7 = chronology3.millis();
        org.joda.time.DurationField durationField8 = chronology3.weeks();
        org.joda.time.DurationField durationField9 = chronology3.years();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology3.add(readablePeriod10, 294L, 26371056);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField9", (durationField4.compareTo(durationField9) == 0) == durationField4.equals(durationField9));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.Chronology chronology5 = chronology2.withUTC();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.DurationField durationField7 = chronology2.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        int int5 = property4.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        boolean boolean7 = property4.isLeap();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("und");
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale12.getDisplayName();
        java.util.Locale.Builder builder15 = builder10.setLocale(locale12);
        java.util.Locale.Builder builder17 = builder10.setScript("");
        java.util.Locale locale18 = builder10.build();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType26.getField(chronology27);
        long long30 = dateTimeField28.roundFloor((long) (-1));
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder31.addUnicodeLocaleAttribute("und");
        java.util.Locale locale34 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale35 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.lang.String str37 = locale35.getDisplayName();
        java.util.Locale.Builder builder38 = builder33.setLocale(locale35);
        int int39 = dateTimeField28.getMaximumShortTextLength(locale35);
        java.lang.String str40 = dateTimeField24.getAsShortText((long) 'a', locale35);
        java.lang.String str41 = locale18.getDisplayLanguage(locale35);
        java.util.Locale locale42 = locale35.stripExtensions();
        int int43 = property4.getMaximumTextLength(locale42);
        org.joda.time.DurationField durationField44 = property4.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str47 = dateTimeZone45.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime48.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.DateTime dateTime55 = localDateTime53.toDateTime(readableInstant54);
        long long56 = dateTime55.getMillis();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str59 = dateTimeZone57.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime60 = org.joda.time.LocalDateTime.now(dateTimeZone57);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = localDateTime60.getFieldType((int) (short) 0);
        boolean boolean63 = dateTime55.isSupported(dateTimeFieldType62);
        long long64 = dateTime55.getMillis();
        org.joda.time.Instant instant65 = dateTime55.toInstant();
        int int66 = property4.getDifference((org.joda.time.ReadableInstant) dateTime55);
        int int67 = property4.getLeapAmount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime55 and instant65", (dateTime55.compareTo(instant65) == 0) == dateTime55.equals(instant65));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        java.lang.String str5 = property4.getName();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean8 = localDateTime6.isSupported(dateTimeFieldType7);
        java.lang.String str9 = dateTimeFieldType7.toString();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.weekyears();
        org.joda.time.DurationField durationField14 = chronology12.seconds();
        org.joda.time.DurationField durationField15 = chronology12.seconds();
        org.joda.time.DurationField durationField16 = chronology12.seconds();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType7.getField(chronology12);
        org.joda.time.DurationField durationField20 = chronology12.minutes();
        org.joda.time.DurationField durationField21 = chronology12.weekyears();
        org.joda.time.DurationField durationField22 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField13, and durationField14", !(durationField22.compareTo(durationField13) == 0) || (Math.signum(durationField22.compareTo(durationField14)) == Math.signum(durationField13.compareTo(durationField14))));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        boolean boolean6 = localDateTime3.equals((java.lang.Object) durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime3.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withEra((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.secondOfMinute();
        boolean boolean22 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime3.withYear(32);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str27 = dateTimeZone25.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.centuries();
        boolean boolean31 = localDateTime28.equals((java.lang.Object) durationFieldType30);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray32 = localDateTime28.getFieldTypes();
        java.lang.String str33 = localDateTime28.toString();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime28.plusMillis(22);
        org.joda.time.LocalDateTime.Property property36 = localDateTime28.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now(dateTimeZone37);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfDay();
        java.lang.String str42 = property41.getName();
        int int43 = property41.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property41.getFieldType();
        int int45 = localDateTime28.indexOf(dateTimeFieldType44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime28.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property46.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str50 = dateTimeZone48.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now(dateTimeZone48);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType53 = org.joda.time.DurationFieldType.centuries();
        boolean boolean54 = localDateTime51.equals((java.lang.Object) durationFieldType53);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray55 = localDateTime51.getFieldTypes();
        java.lang.String str56 = localDateTime51.toString();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime51.plusMillis(22);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime51.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology61 = localDateTime51.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.years();
        org.joda.time.DateTimeField dateTimeField63 = chronology61.millisOfDay();
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType47.getField(chronology61);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime24.withField(dateTimeFieldType47, (int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.weekyears();
        org.joda.time.DurationField durationField72 = chronology70.centuries();
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology70);
        org.joda.time.DurationField durationField74 = chronology70.millis();
        org.joda.time.DateTimeField dateTimeField75 = chronology70.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField76 = chronology70.halfdayOfDay();
        org.joda.time.DurationField durationField77 = chronology70.years();
        boolean boolean78 = dateTimeFieldType47.isSupported(chronology70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField62 and durationField71", (durationField62.compareTo(durationField71) == 0) == durationField62.equals(durationField71));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray2 = strSet1.toArray();
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        boolean boolean5 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet4);
        strSet1.clear();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = new org.joda.time.DurationFieldType[] { durationFieldType9, durationFieldType10 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = strSet8.toArray(durationFieldTypeArray11);
        boolean boolean13 = strSet1.addAll((java.util.Collection<java.lang.String>) strSet8);
        java.util.Spliterator<java.lang.String> strSpliterator14 = strSet1.spliterator();
        java.util.Locale.Category category15 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.util.Locale.setDefault(category15, locale16);
        java.lang.String str18 = locale16.getDisplayName();
        java.util.Set<java.lang.String> strSet19 = locale16.getUnicodeLocaleAttributes();
        boolean boolean20 = strSet1.containsAll((java.util.Collection<java.lang.String>) strSet19);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str22 = durationFieldType21.toString();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.weekyears();
        org.joda.time.DurationField durationField28 = chronology26.centuries();
        org.joda.time.DurationField durationField29 = durationFieldType23.getField(chronology26);
        boolean boolean30 = durationFieldType21.isSupported(chronology26);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.year();
        org.joda.time.DateTimeField dateTimeField32 = chronology26.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology26.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.weekyears();
        boolean boolean39 = dateTimeFieldType34.isSupported(chronology37);
        org.joda.time.DateTimeField dateTimeField40 = chronology37.halfdayOfDay();
        org.joda.time.DurationField durationField41 = chronology37.weeks();
        org.joda.time.DateTimeField dateTimeField42 = chronology37.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology37.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str46 = dateTimeZone44.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now(dateTimeZone44);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.millisOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime47.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.DateTime dateTime54 = localDateTime52.toDateTime(readableInstant53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str57 = dateTimeZone55.getShortName((long) (short) 10);
        long long59 = dateTimeZone55.convertUTCToLocal((long) ' ');
        java.lang.String str60 = dateTimeZone55.toString();
        long long62 = dateTimeZone55.previousTransition(32L);
        long long65 = dateTimeZone55.convertLocalToUTC(97L, false);
        boolean boolean66 = dateTime54.equals((java.lang.Object) false);
        org.joda.time.Chronology chronology67 = dateTime54.getChronology();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str70 = dateTimeZone68.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime71 = org.joda.time.LocalDateTime.now(dateTimeZone68);
        org.joda.time.LocalDateTime.Property property72 = localDateTime71.millisOfDay();
        org.joda.time.ReadableInstant readableInstant73 = null;
        long long74 = property72.getDifferenceAsLong(readableInstant73);
        int int75 = property72.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime76 = property72.roundHalfEvenCopy();
        org.joda.time.DurationField durationField77 = property72.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime78 = property72.roundHalfEvenCopy();
        java.lang.String str79 = property72.getName();
        java.util.Locale locale80 = java.util.Locale.ITALY;
        java.lang.String str81 = property72.getAsText(locale80);
        org.joda.time.LocalDateTime localDateTime83 = property72.addToCopy(26180486);
        long long85 = chronology67.set((org.joda.time.ReadablePartial) localDateTime83, 1645629361196L);
        org.joda.time.DurationField durationField86 = chronology67.eras();
        org.joda.time.LocalDateTime localDateTime88 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology89 = localDateTime88.getChronology();
        org.joda.time.DurationField durationField90 = chronology89.hours();
        org.joda.time.DurationField durationField91 = chronology89.weekyears();
        org.joda.time.DateTimeField dateTimeField92 = chronology89.monthOfYear();
        org.joda.time.DateTimeField dateTimeField93 = chronology89.dayOfWeek();
        org.joda.time.DurationField durationField94 = chronology89.centuries();
        org.joda.time.DateTimeField dateTimeField95 = chronology89.halfdayOfDay();
        org.joda.time.Chronology[] chronologyArray96 = new org.joda.time.Chronology[] { chronology26, chronology37, chronology67, chronology89 };
        org.joda.time.Chronology[] chronologyArray97 = strSet19.toArray(chronologyArray96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField86", Math.signum(durationField27.compareTo(durationField86)) == -Math.signum(durationField86.compareTo(durationField27)));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.monthOfYear();
        long long8 = dateTimeField6.roundFloor(1645629384219L);
        long long10 = dateTimeField6.roundCeiling((long) 22);
        int int11 = dateTimeField6.getMaximumValue();
        org.joda.time.DurationField durationField12 = dateTimeField6.getRangeDurationField();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.minutes();
        java.lang.String str14 = durationFieldType13.getName();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        org.joda.time.DurationField durationField19 = chronology17.centuries();
        org.joda.time.DurationField durationField20 = chronology17.hours();
        org.joda.time.DurationField durationField21 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.minuteOfDay();
        org.joda.time.DurationField durationField24 = durationFieldType13.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField25 = chronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.hourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withDurationAdded(readableDuration28, (int) '#');
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.weekyear();
        java.lang.String str32 = property31.getAsString();
        org.joda.time.LocalDateTime localDateTime34 = property31.setCopy(67);
        org.joda.time.LocalDateTime localDateTime35 = property31.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime38 = property36.addWrapFieldToCopy(1);
        int[] intArray40 = chronology17.get((org.joda.time.ReadablePartial) localDateTime38, 1645629474271L);
        org.joda.time.LocalDateTime.Property property41 = localDateTime38.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str44 = dateTimeZone42.getShortName((long) (short) 10);
        long long46 = dateTimeZone42.convertUTCToLocal((long) ' ');
        java.util.Locale locale48 = java.util.Locale.ROOT;
        java.lang.String str49 = dateTimeZone42.getName((long) (short) 0, locale48);
        java.util.Locale locale50 = locale48.stripExtensions();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.hours();
        java.lang.String str55 = chronology53.toString();
        org.joda.time.DateTimeField dateTimeField56 = chronology53.clockhourOfDay();
        int int58 = dateTimeField56.get(1645629354990L);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str61 = dateTimeZone59.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now(dateTimeZone59);
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType64 = org.joda.time.DurationFieldType.centuries();
        boolean boolean65 = localDateTime62.equals((java.lang.Object) durationFieldType64);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray66 = localDateTime62.getFieldTypes();
        java.lang.String str67 = localDateTime62.toString();
        java.util.Locale locale68 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str69 = dateTimeField56.getAsText((org.joda.time.ReadablePartial) localDateTime62, locale68);
        java.lang.String str70 = locale68.getDisplayVariant();
        java.lang.String str71 = locale68.getDisplayVariant();
        java.util.Locale locale73 = java.util.Locale.forLanguageTag("117");
        java.lang.String str74 = locale73.getVariant();
        java.lang.String str75 = locale68.getDisplayLanguage(locale73);
        java.lang.String str76 = locale48.getDisplayName(locale68);
        java.util.Locale locale77 = locale68.stripExtensions();
        java.lang.String str78 = dateTimeField6.getAsShortText((org.joda.time.ReadablePartial) localDateTime38, locale77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusMillis((-1));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYear((int) (short) 100);
        java.lang.String str14 = localDateTime13.toString();
        boolean boolean15 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDateTime13);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray18 = strSet17.toArray();
        boolean boolean19 = strSet17.isEmpty();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray22 = strSet21.toArray();
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        boolean boolean25 = strSet21.removeAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray30 = new org.joda.time.DurationFieldType[] { durationFieldType28, durationFieldType29 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = strSet27.toArray(durationFieldTypeArray30);
        boolean boolean32 = strSet21.containsAll((java.util.Collection<java.lang.String>) strSet27);
        java.lang.Object[] objArray33 = strSet27.toArray();
        boolean boolean34 = strSet17.removeAll((java.util.Collection<java.lang.String>) strSet27);
        java.util.Locale locale35 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray37 = strSet36.toArray();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        boolean boolean40 = strSet36.removeAll((java.util.Collection<java.lang.String>) strSet39);
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray45 = new org.joda.time.DurationFieldType[] { durationFieldType43, durationFieldType44 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray46 = strSet42.toArray(durationFieldTypeArray45);
        boolean boolean47 = strSet36.containsAll((java.util.Collection<java.lang.String>) strSet42);
        java.util.Locale locale48 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray50 = strSet49.toArray();
        java.util.Locale locale51 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        boolean boolean53 = strSet49.removeAll((java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale locale54 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray58 = new org.joda.time.DurationFieldType[] { durationFieldType56, durationFieldType57 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray59 = strSet55.toArray(durationFieldTypeArray58);
        boolean boolean60 = strSet49.containsAll((java.util.Collection<java.lang.String>) strSet55);
        java.lang.Object[] objArray61 = strSet55.toArray();
        boolean boolean62 = strSet36.retainAll((java.util.Collection<java.lang.String>) strSet55);
        boolean boolean63 = strSet27.addAll((java.util.Collection<java.lang.String>) strSet55);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean65 = strSet55.remove((java.lang.Object) dateTimeFieldType64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime3.property(dateTimeFieldType64);
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.weekyears();
        org.joda.time.DurationField durationField72 = chronology70.centuries();
        org.joda.time.DurationField durationField73 = durationFieldType67.getField(chronology70);
        boolean boolean74 = dateTimeFieldType64.isSupported(chronology70);
        org.joda.time.DurationField durationField75 = chronology70.millis();
        org.joda.time.DurationField durationField76 = chronology70.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField76, durationField71, and durationField72", !(durationField76.compareTo(durationField71) == 0) || (Math.signum(durationField76.compareTo(durationField72)) == Math.signum(durationField71.compareTo(durationField72))));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.era();
        org.joda.time.DurationField durationField7 = dateTimeField6.getDurationField();
        int int9 = dateTimeField6.getLeapAmount(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str2 = durationFieldType1.toString();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        java.lang.String str4 = localDateTime3.toString();
        int int5 = localDateTime3.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusMonths(2);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime(readableInstant18);
        long long20 = dateTime19.getMillis();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str23 = dateTimeZone21.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = localDateTime24.getFieldType((int) (short) 0);
        boolean boolean27 = dateTime19.isSupported(dateTimeFieldType26);
        org.joda.time.DateTime dateTime28 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str31 = dateTimeZone29.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localDateTime37.toDateTime(readableInstant38);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str42 = dateTimeZone40.getShortName((long) (short) 10);
        long long44 = dateTimeZone40.convertUTCToLocal((long) ' ');
        java.lang.String str45 = dateTimeZone40.toString();
        long long47 = dateTimeZone40.previousTransition(32L);
        long long50 = dateTimeZone40.convertLocalToUTC(97L, false);
        boolean boolean51 = dateTime39.equals((java.lang.Object) false);
        boolean boolean52 = dateTime28.isEqual((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Chronology chronology53 = dateTime39.getChronology();
        org.joda.time.DurationField durationField54 = durationFieldType1.getField(chronology53);
        org.joda.time.DurationField durationField55 = chronology53.weeks();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(1645629451174L, chronology53);
        org.joda.time.DurationField durationField57 = chronology53.days();
        org.joda.time.DateTimeField dateTimeField58 = chronology53.clockhourOfHalfday();
        org.joda.time.DurationField durationField59 = chronology53.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField59, durationField54, and durationField57", !(durationField59.compareTo(durationField54) == 0) || (Math.signum(durationField59.compareTo(durationField57)) == Math.signum(durationField54.compareTo(durationField57))));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.era();
        int int12 = localDateTime7.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withWeekOfWeekyear((int) (byte) 1);
        int int15 = localDateTime7.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime7.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.days();
        java.lang.String str19 = durationFieldType18.toString();
        boolean boolean20 = localDateTime17.isSupported(durationFieldType18);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plus(readablePeriod21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology24 = null;
        boolean boolean25 = durationFieldType23.isSupported(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime17.withFieldAdded(durationFieldType23, 3);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withDate(500, 7, 17);
        long long33 = chronology2.set((org.joda.time.ReadablePartial) localDateTime27, 1645629356615L);
        org.joda.time.DateTimeZone dateTimeZone34 = chronology2.getZone();
        org.joda.time.DurationField durationField35 = chronology2.years();
        long long39 = chronology2.add(1645629649057L, (long) 26501, 86399999);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField35", (durationField3.compareTo(durationField35) == 0) == durationField3.equals(durationField35));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.seconds();
        org.joda.time.DurationField durationField6 = chronology3.seconds();
        org.joda.time.DurationField durationField7 = chronology3.seconds();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(0L, chronology3);
        org.joda.time.DurationField durationField12 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField4, and durationField5", !(durationField12.compareTo(durationField4) == 0) || (Math.signum(durationField12.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        boolean boolean6 = localDateTime3.equals((java.lang.Object) durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime3.getFieldTypes();
        java.lang.String str8 = localDateTime3.toString();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.plusMillis(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType11.getField(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime3.withField(dateTimeFieldType11, 2);
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType11.getDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.weekyears();
        boolean boolean22 = dateTimeFieldType17.isSupported(chronology20);
        org.joda.time.DurationField durationField23 = chronology20.centuries();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.year();
        boolean boolean25 = durationFieldType16.isSupported(chronology20);
        org.joda.time.DurationField durationField26 = chronology20.years();
        org.joda.time.DateTimeField dateTimeField27 = chronology20.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField26", (durationField21.compareTo(durationField26) == 0) == durationField21.equals(durationField26));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int52 = instant50.get(dateTimeFieldType51);
        java.lang.String str53 = dateTimeFieldType51.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology3);
        org.joda.time.DateTimeField dateTimeField7 = chronology3.halfdayOfDay();
        org.joda.time.DurationField durationField8 = chronology3.weekyears();
        java.lang.String str9 = chronology3.toString();
        org.joda.time.DurationField durationField10 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField4, and durationField5", !(durationField10.compareTo(durationField4) == 0) || (Math.signum(durationField10.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.era();
        int int5 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekOfWeekyear((int) (byte) 1);
        int int8 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        java.lang.String str12 = durationFieldType11.toString();
        boolean boolean13 = localDateTime10.isSupported(durationFieldType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        boolean boolean19 = dateTimeFieldType14.isSupported(chronology17);
        org.joda.time.DurationField durationField20 = durationFieldType11.getField(chronology17);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology17.add(readablePeriod21, (long) 27427155, (int) (byte) 0);
        org.joda.time.DurationField durationField25 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        int int29 = dateTimeField26.getDifference((long) 356, 1645514199918L);
        org.joda.time.DurationField durationField30 = dateTimeField26.getDurationField();
        java.lang.String str32 = dateTimeField26.getAsText(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField30", (durationField18.compareTo(durationField30) == 0) == durationField18.equals(durationField30));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str3 = dateTimeZone1.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfDay();
        long long6 = property5.remainder();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property5.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.centuries();
        boolean boolean15 = localDateTime12.equals((java.lang.Object) durationFieldType14);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.minuteOfDay();
        org.joda.time.DurationField durationField21 = durationFieldType14.getField(chronology18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str24 = dateTimeZone22.getShortName((long) (short) 10);
        long long26 = dateTimeZone22.convertUTCToLocal((long) ' ');
        java.lang.String str27 = dateTimeZone22.toString();
        long long30 = dateTimeZone22.adjustOffset((long) (short) 100, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.Chronology chronology32 = chronology18.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField33 = chronology18.halfdayOfDay();
        boolean boolean34 = dateTimeFieldType8.isSupported(chronology18);
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType0.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField36 = chronology18.clockhourOfDay();
        org.joda.time.DurationField durationField37 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField19, and durationField21", !(durationField37.compareTo(durationField19) == 0) || (Math.signum(durationField37.compareTo(durationField21)) == Math.signum(durationField19.compareTo(durationField21))));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology2.hours();
        org.joda.time.DurationField durationField7 = chronology2.halfdays();
        org.joda.time.DurationField durationField8 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField9 = chronology2.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.getName();
        java.lang.String str3 = durationFieldType1.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.weekyears();
        org.joda.time.DurationField durationField9 = chronology7.centuries();
        org.joda.time.DurationField durationField10 = chronology7.minutes();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology7);
        boolean boolean12 = dateTimeFieldType4.isSupported(chronology7);
        org.joda.time.DateTimeField dateTimeField13 = chronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = chronology7.dayOfWeek();
        org.joda.time.DurationField durationField15 = chronology7.millis();
        org.joda.time.DurationField durationField16 = chronology7.halfdays();
        org.joda.time.DurationField durationField17 = durationFieldType1.getField(chronology7);
        java.lang.String str18 = durationFieldType1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField17", (durationField8.compareTo(durationField17) == 0) == durationField8.equals(durationField17));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        long long4 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = dateTimeZone0.getName((long) (short) 0, locale6);
        java.lang.String str9 = dateTimeZone0.getShortName(1645629371478L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        int int15 = property14.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime16 = property14.withMaximumValue();
        boolean boolean17 = dateTimeZone0.isLocalDateTimeGap(localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusMillis(26239);
        int[] intArray20 = localDateTime16.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.Chronology chronology23 = null;
        boolean boolean24 = dateTimeFieldType21.isSupported(chronology23);
        int int25 = localDateTime16.get(dateTimeFieldType21);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getDurationType();
        java.lang.String str28 = durationFieldType27.getName();
        java.lang.String str29 = durationFieldType27.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.weekyears();
        org.joda.time.DurationField durationField35 = chronology33.centuries();
        org.joda.time.DurationField durationField36 = chronology33.minutes();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology33);
        boolean boolean38 = dateTimeFieldType30.isSupported(chronology33);
        org.joda.time.DateTimeField dateTimeField39 = chronology33.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField40 = chronology33.dayOfWeek();
        org.joda.time.DurationField durationField41 = chronology33.millis();
        org.joda.time.DurationField durationField42 = chronology33.halfdays();
        org.joda.time.DurationField durationField43 = durationFieldType27.getField(chronology33);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime16.withFieldAdded(durationFieldType27, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField34 and durationField43", (durationField34.compareTo(durationField43) == 0) == durationField34.equals(durationField43));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.years();
        org.joda.time.DurationField durationField6 = chronology2.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField5", (durationField3.compareTo(durationField5) == 0) == durationField3.equals(durationField5));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.dayOfYear();
        org.joda.time.DurationField durationField8 = chronology2.days();
        org.joda.time.DateTimeField dateTimeField9 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField10 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.minutes();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology3);
        boolean boolean8 = dateTimeFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeZone dateTimeZone9 = chronology3.getZone();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.weekyear();
        org.joda.time.DurationField durationField11 = chronology3.seconds();
        org.joda.time.DurationField durationField12 = chronology3.years();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.hours();
        java.lang.String str17 = chronology15.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withDurationAdded(readableDuration21, (int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.weekyear();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusMillis((-1));
        org.joda.time.LocalDateTime.Property property27 = localDateTime23.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str31 = dateTimeZone29.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.centuries();
        boolean boolean35 = localDateTime32.equals((java.lang.Object) durationFieldType34);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray36 = localDateTime32.getFieldTypes();
        java.lang.String str37 = localDateTime32.toString();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime32.plusMillis(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean41 = localDateTime32.isSupported(dateTimeFieldType40);
        int int42 = localDateTime28.indexOf(dateTimeFieldType40);
        int[] intArray44 = chronology15.get((org.joda.time.ReadablePartial) localDateTime28, 1645629358650L);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime28.plusWeeks(26149500);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minus(readablePeriod49);
        long long52 = chronology3.set((org.joda.time.ReadablePartial) localDateTime48, (long) 26381);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField12", (durationField4.compareTo(durationField12) == 0) == durationField4.equals(durationField12));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.Chronology chronology5 = chronology2.withUTC();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.weekyears();
        org.joda.time.DurationField durationField6 = chronology4.centuries();
        org.joda.time.DurationField durationField7 = chronology4.minutes();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology4.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 26163523, chronology4);
        org.joda.time.DateTimeField dateTimeField11 = chronology4.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology4.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 55208214, chronology4);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property14.getFieldType();
        org.joda.time.DurationField durationField16 = property14.getDurationField();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.plusSeconds(9);
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withCenturyOfEra(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str29 = dateTimeZone27.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfDay();
        org.joda.time.LocalDateTime localDateTime33 = property31.addToCopy(500);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withYearOfEra(16);
        org.joda.time.DateTime dateTime36 = localDateTime33.toDateTime();
        org.joda.time.Chronology chronology37 = dateTime36.getChronology();
        int int38 = property26.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = dateTime36.getChronology();
        int int40 = property14.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField16", (durationField5.compareTo(durationField16) == 0) == durationField5.equals(durationField16));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        long long15 = dateTimeZone11.convertUTCToLocal((long) ' ');
        java.lang.String str16 = dateTimeZone11.toString();
        long long18 = dateTimeZone11.previousTransition(32L);
        long long21 = dateTimeZone11.convertLocalToUTC(97L, false);
        boolean boolean22 = dateTime10.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        long long34 = dateTime33.getMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDateTime38.getFieldType((int) (short) 0);
        boolean boolean41 = dateTime33.isSupported(dateTimeFieldType40);
        boolean boolean42 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str45 = dateTimeZone43.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime51.toDateTime(readableInstant52);
        long long54 = dateTime53.getMillis();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str57 = dateTimeZone55.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(dateTimeZone55);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = localDateTime58.getFieldType((int) (short) 0);
        boolean boolean61 = dateTime53.isSupported(dateTimeFieldType60);
        boolean boolean62 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime();
        java.lang.String str64 = localDateTime63.toString();
        int int65 = localDateTime63.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.minusMonths(2);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str71 = dateTimeZone69.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime72 = org.joda.time.LocalDateTime.now(dateTimeZone69);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.millisOfDay();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime72.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.DateTime dateTime79 = localDateTime77.toDateTime(readableInstant78);
        long long80 = dateTime79.getMillis();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str83 = dateTimeZone81.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime84 = org.joda.time.LocalDateTime.now(dateTimeZone81);
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = localDateTime84.getFieldType((int) (short) 0);
        boolean boolean87 = dateTime79.isSupported(dateTimeFieldType86);
        org.joda.time.DateTime dateTime88 = localDateTime67.toDateTime((org.joda.time.ReadableInstant) dateTime79);
        java.lang.String str89 = dateTime88.toString();
        boolean boolean90 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.Instant instant91 = dateTime88.toInstant();
        org.joda.time.Instant instant92 = instant91.toInstant();
        org.joda.time.DateTimeZone dateTimeZone93 = instant91.getZone();
        org.joda.time.Instant instant94 = instant91.toInstant();
        java.lang.String str95 = instant91.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime88 and instant91", (dateTime88.compareTo(instant91) == 0) == dateTime88.equals(instant91));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusMonths((int) (short) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.yearOfEra();
        java.lang.String str5 = property4.getAsText();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMinimumValue();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.year();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property8.addWrapFieldToCopy((-1));
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withDurationAdded(readableDuration13, (int) '#');
        int int16 = localDateTime15.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withMinuteOfHour(2);
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        long long31 = dateTime30.getMillis();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str34 = dateTimeZone32.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = localDateTime35.getFieldType((int) (short) 0);
        boolean boolean38 = dateTime30.isSupported(dateTimeFieldType37);
        long long39 = dateTime30.getMillis();
        org.joda.time.Instant instant40 = dateTime30.toInstant();
        org.joda.time.Chronology chronology41 = dateTime30.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime30.getZone();
        boolean boolean43 = dateTime19.isBefore((org.joda.time.ReadableInstant) dateTime30);
        int int44 = property8.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant40", (dateTime30.compareTo(instant40) == 0) == dateTime30.equals(instant40));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        boolean boolean6 = localDateTime3.equals((java.lang.Object) durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime3.getFieldTypes();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        java.lang.String str11 = localDateTime10.toString();
        int int12 = localDateTime10.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusMonths(2);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str18 = dateTimeZone16.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime(readableInstant25);
        long long27 = dateTime26.getMillis();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str30 = dateTimeZone28.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(dateTimeZone28);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = localDateTime31.getFieldType((int) (short) 0);
        boolean boolean34 = dateTime26.isSupported(dateTimeFieldType33);
        org.joda.time.DateTime dateTime35 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str38 = dateTimeZone36.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localDateTime44.toDateTime(readableInstant45);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str49 = dateTimeZone47.getShortName((long) (short) 10);
        long long51 = dateTimeZone47.convertUTCToLocal((long) ' ');
        java.lang.String str52 = dateTimeZone47.toString();
        long long54 = dateTimeZone47.previousTransition(32L);
        long long57 = dateTimeZone47.convertLocalToUTC(97L, false);
        boolean boolean58 = dateTime46.equals((java.lang.Object) false);
        boolean boolean59 = dateTime35.isEqual((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Instant instant60 = dateTime35.toInstant();
        long long61 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) instant60);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str64 = dateTimeZone62.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now(dateTimeZone62);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.millisOfDay();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime65.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.minusHours((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray73 = localDateTime70.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime70.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime75.withDayOfYear(32);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime77.plusHours(26204);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.withMonthOfYear(11);
        java.lang.String str82 = localDateTime79.toString();
        boolean boolean83 = instant60.equals((java.lang.Object) localDateTime79);
        org.joda.time.LocalDateTime.Property property84 = localDateTime79.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant60", (dateTime35.compareTo(instant60) == 0) == dateTime35.equals(instant60));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.months();
        boolean boolean7 = localDateTime3.isSupported(durationFieldType6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        long long13 = property12.remainder();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        java.lang.String str16 = localDateTime15.toString();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.plusMonths((int) (short) -1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.yearOfEra();
        int int20 = property12.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        org.joda.time.DurationField durationField24 = dateTimeField23.getRangeDurationField();
        long long26 = dateTimeField23.remainder(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = dateTimeField23.getType();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getDurationType();
        boolean boolean29 = localDateTime15.isSupported(dateTimeFieldType27);
        int int30 = localDateTime3.indexOf(dateTimeFieldType27);
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType27.getDurationType();
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.hours();
        org.joda.time.DurationField durationField37 = durationFieldType32.getField(chronology35);
        org.joda.time.DateTimeField dateTimeField38 = chronology35.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField39 = chronology35.halfdayOfDay();
        org.joda.time.DurationField durationField40 = chronology35.weekyears();
        boolean boolean41 = dateTimeFieldType27.isSupported(chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField37", (durationField24.compareTo(durationField37) == 0) == durationField24.equals(durationField37));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        long long4 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.lang.String str5 = dateTimeZone0.toString();
        long long7 = dateTimeZone0.previousTransition(32L);
        long long10 = dateTimeZone0.convertLocalToUTC(97L, false);
        java.lang.String str12 = dateTimeZone0.getShortName((long) 5);
        int int14 = dateTimeZone0.getOffset((long) 567);
        long long16 = dateTimeZone0.nextTransition((long) 26213656);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str19 = dateTimeZone17.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.DateTime dateTime27 = localDateTime25.toDateTime(readableInstant26);
        long long28 = dateTime27.getMillis();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str31 = dateTimeZone29.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(dateTimeZone29);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = localDateTime32.getFieldType((int) (short) 0);
        boolean boolean35 = dateTime27.isSupported(dateTimeFieldType34);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str38 = dateTimeZone36.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        org.joda.time.ReadableInstant readableInstant41 = null;
        long long42 = property40.getDifferenceAsLong(readableInstant41);
        org.joda.time.DurationField durationField43 = property40.getLeapDurationField();
        java.lang.String str44 = property40.getAsString();
        org.joda.time.LocalDateTime localDateTime45 = property40.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str50 = dateTimeZone48.getShortName((long) (short) 10);
        long long52 = dateTimeZone48.convertUTCToLocal((long) ' ');
        java.lang.String str53 = dateTimeZone48.toString();
        boolean boolean55 = dateTimeZone48.equals((java.lang.Object) (short) 100);
        java.util.Locale locale57 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str58 = dateTimeZone48.getShortName((long) (-1), locale57);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.joda.time.DateTime dateTime60 = localDateTime47.toDateTime(dateTimeZone48);
        boolean boolean61 = dateTime27.isEqual((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Instant instant62 = dateTime60.toInstant();
        int int63 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant62);
        java.lang.String str65 = dateTimeZone0.getNameKey(102L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and instant62", (dateTime60.compareTo(instant62) == 0) == dateTime60.equals(instant62));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.getName();
        java.lang.String str3 = durationFieldType1.getName();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withDurationAdded(readableDuration5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.era();
        int int9 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withWeekOfWeekyear((int) (byte) 1);
        int int12 = localDateTime4.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime4.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.days();
        java.lang.String str16 = durationFieldType15.toString();
        boolean boolean17 = localDateTime14.isSupported(durationFieldType15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.weekyears();
        boolean boolean23 = dateTimeFieldType18.isSupported(chronology21);
        org.joda.time.DurationField durationField24 = durationFieldType15.getField(chronology21);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = chronology21.add(readablePeriod25, (long) 27427155, (int) (byte) 0);
        org.joda.time.DurationField durationField29 = chronology21.hours();
        org.joda.time.DateTimeField dateTimeField30 = chronology21.weekyearOfCentury();
        org.joda.time.DurationField durationField31 = chronology21.centuries();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.weekyears();
        org.joda.time.DurationField durationField36 = chronology34.seconds();
        org.joda.time.DurationField durationField37 = chronology34.seconds();
        org.joda.time.DurationField durationField38 = chronology34.millis();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.weekyears();
        boolean boolean44 = dateTimeFieldType39.isSupported(chronology42);
        org.joda.time.DateTimeField dateTimeField45 = chronology42.halfdayOfDay();
        org.joda.time.DurationField durationField46 = chronology42.millis();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology42.getZone();
        org.joda.time.Chronology chronology48 = chronology34.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology49 = chronology21.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField50 = durationFieldType1.getField(chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField50", (durationField22.compareTo(durationField50) == 0) == durationField22.equals(durationField50));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.dayOfYear();
        org.joda.time.DurationField durationField8 = chronology2.days();
        org.joda.time.DurationField durationField9 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = durationFieldType0.getField(chronology3);
        org.joda.time.DurationField durationField7 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology3);
        org.joda.time.DurationField durationField7 = chronology3.millis();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.year();
        org.joda.time.DurationField durationField11 = chronology3.minutes();
        org.joda.time.DateTimeField dateTimeField12 = chronology3.millisOfSecond();
        org.joda.time.Chronology chronology13 = chronology3.withUTC();
        org.joda.time.DurationField durationField14 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField4, and durationField5", !(durationField14.compareTo(durationField4) == 0) || (Math.signum(durationField14.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.era();
        int int12 = localDateTime7.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withWeekOfWeekyear((int) (byte) 1);
        int int15 = localDateTime7.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime7.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.days();
        java.lang.String str19 = durationFieldType18.toString();
        boolean boolean20 = localDateTime17.isSupported(durationFieldType18);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plus(readablePeriod21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology24 = null;
        boolean boolean25 = durationFieldType23.isSupported(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime17.withFieldAdded(durationFieldType23, 3);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withDate(500, 7, 17);
        long long33 = chronology2.set((org.joda.time.ReadablePartial) localDateTime27, 1645629356615L);
        org.joda.time.DateTimeZone dateTimeZone34 = chronology2.getZone();
        org.joda.time.DurationField durationField35 = chronology2.years();
        org.joda.time.DurationField durationField36 = chronology2.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField35", (durationField3.compareTo(durationField35) == 0) == durationField3.equals(durationField35));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType5.getDurationType();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.hours();
        org.joda.time.DurationField durationField12 = durationFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField14 = chronology10.weeks();
        org.joda.time.DurationField durationField15 = durationFieldType6.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField16 = chronology10.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.weekyears();
        org.joda.time.DurationField durationField22 = chronology20.centuries();
        org.joda.time.DurationField durationField23 = chronology20.hours();
        boolean boolean24 = dateTimeFieldType17.isSupported(chronology20);
        org.joda.time.DateTimeField dateTimeField25 = chronology20.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology20.weekyear();
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale28);
        java.util.Locale locale30 = java.util.Locale.CANADA;
        boolean boolean31 = locale30.hasExtensions();
        java.lang.String str32 = locale28.getDisplayScript(locale30);
        java.lang.String str33 = dateTimeField26.getAsText(21, locale28);
        long long35 = dateTimeField26.roundCeiling((long) 97);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withDurationAdded(readableDuration37, (int) '#');
        org.joda.time.LocalDateTime.Property property40 = localDateTime36.era();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.minusHours((int) '4');
        java.util.Locale locale44 = new java.util.Locale("2022-02-22T07:15:55.496");
        java.lang.String str45 = dateTimeField26.getAsText((org.joda.time.ReadablePartial) localDateTime36, locale44);
        int int46 = localDateTime36.getMonthOfYear();
        int int47 = localDateTime36.getYear();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str50 = dateTimeZone48.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now(dateTimeZone48);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.millisOfDay();
        org.joda.time.LocalDateTime.Property property53 = localDateTime51.yearOfCentury();
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.year();
        org.joda.time.DateTimeField dateTimeField55 = property54.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology60 = localDateTime59.getChronology();
        org.joda.time.DurationField durationField61 = chronology60.weekyears();
        org.joda.time.DurationField durationField62 = chronology60.seconds();
        org.joda.time.DurationField durationField63 = chronology60.weekyears();
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType57.getField(chronology60);
        java.util.Locale locale67 = null;
        long long68 = dateTimeField64.set((long) 26151696, "26157599", locale67);
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime69.withDurationAdded(readableDuration70, (int) '#');
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.weekyear();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.minusMillis((-1));
        org.joda.time.LocalDateTime.Property property76 = localDateTime72.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime77 = property76.roundHalfFloorCopy();
        java.util.Locale locale80 = new java.util.Locale("26166632", "era");
        java.lang.String str81 = dateTimeField64.getAsShortText((org.joda.time.ReadablePartial) localDateTime77, locale80);
        java.lang.String str82 = dateTimeField55.getAsText(46L, locale80);
        java.lang.String str83 = dateTimeField16.getAsText((org.joda.time.ReadablePartial) localDateTime36, locale80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField21", (durationField15.compareTo(durationField21) == 0) == durationField15.equals(durationField21));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        org.joda.time.DurationField durationField4 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField8 = chronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology2.millisOfDay();
        org.joda.time.DurationField durationField10 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.weekyears();
        org.joda.time.DurationField durationField6 = chronology4.centuries();
        boolean boolean7 = durationFieldType1.isSupported(chronology4);
        org.joda.time.DateTimeField dateTimeField8 = chronology4.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withDurationAdded(readableDuration10, (int) '#');
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        int int14 = localDateTime12.getHourOfDay();
        int[] intArray16 = chronology4.get((org.joda.time.ReadablePartial) localDateTime12, 1645629390642L);
        org.joda.time.DurationField durationField17 = chronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField5, and durationField6", !(durationField17.compareTo(durationField5) == 0) || (Math.signum(durationField17.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        boolean boolean7 = dateTimeFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField8 = chronology3.weekyears();
        org.joda.time.DurationField durationField9 = chronology3.hours();
        org.joda.time.DurationField durationField10 = chronology3.hours();
        org.joda.time.DurationField durationField11 = chronology3.years();
        long long15 = chronology3.add(1645629466181L, 1645629564753L, 2016);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField11", (durationField4.compareTo(durationField11) == 0) == durationField4.equals(durationField11));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str3 = dateTimeZone1.getShortName((long) (short) 10);
        long long5 = dateTimeZone1.convertUTCToLocal((long) ' ');
        java.lang.String str6 = dateTimeZone1.toString();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) (short) 100);
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = dateTimeZone1.getShortName((long) (-1), locale10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withField(dateTimeFieldType13, (int) (short) 100);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.weekyears();
        org.joda.time.DurationField durationField20 = chronology18.centuries();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.minuteOfDay();
        long long25 = chronology18.add((long) 2, (long) 21, (int) '4');
        boolean boolean26 = dateTimeFieldType13.isSupported(chronology18);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str29 = dateTimeZone27.getShortName((long) (short) 10);
        long long31 = dateTimeZone27.convertUTCToLocal((long) ' ');
        java.lang.String str32 = dateTimeZone27.toString();
        long long34 = dateTimeZone27.previousTransition(32L);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology36 = chronology18.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(35L, chronology36);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str41 = dateTimeZone39.getShortName((long) (short) 10);
        long long43 = dateTimeZone39.convertUTCToLocal((long) ' ');
        java.lang.String str44 = dateTimeZone39.toString();
        boolean boolean46 = dateTimeZone39.equals((java.lang.Object) (short) 100);
        java.util.Locale locale48 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str49 = dateTimeZone39.getShortName((long) (-1), locale48);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone39);
        int int52 = dateTimeZone39.getOffset((long) (short) 10);
        java.util.TimeZone timeZone53 = dateTimeZone39.toTimeZone();
        java.lang.String str54 = dateTimeZone39.getID();
        java.lang.String str56 = dateTimeZone39.getShortName(1645629456968L);
        org.joda.time.Chronology chronology57 = chronology36.withZone(dateTimeZone39);
        org.joda.time.DurationField durationField58 = chronology57.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField58, durationField19, and durationField20", !(durationField58.compareTo(durationField19) == 0) || (Math.signum(durationField58.compareTo(durationField20)) == Math.signum(durationField19.compareTo(durationField20))));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.minuteOfDay();
        org.joda.time.DurationField durationField9 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology2.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology2.year();
        org.joda.time.DurationField durationField14 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology3);
        org.joda.time.DurationField durationField7 = chronology3.millis();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.millisOfSecond();
        org.joda.time.Chronology chronology10 = chronology3.withUTC();
        org.joda.time.DurationField durationField11 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField4, and durationField5", !(durationField11.compareTo(durationField4) == 0) || (Math.signum(durationField11.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        boolean boolean6 = localDateTime3.equals((java.lang.Object) durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime3.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withEra((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.secondOfMinute();
        boolean boolean22 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDateTime20);
        int[] intArray23 = localDateTime3.getValues();
        org.joda.time.LocalDateTime.Property property24 = localDateTime3.era();
        int int25 = property24.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime26 = property24.roundCeilingCopy();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.weekyears();
        org.joda.time.DurationField durationField32 = chronology30.seconds();
        org.joda.time.DurationField durationField33 = chronology30.seconds();
        org.joda.time.DurationField durationField34 = chronology30.seconds();
        org.joda.time.DurationField durationField35 = chronology30.weekyears();
        boolean boolean36 = durationFieldType27.isSupported(chronology30);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.hours();
        org.joda.time.DurationField durationField41 = chronology39.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.monthOfYear();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now(chronology39);
        org.joda.time.DurationField durationField45 = durationFieldType27.getField(chronology39);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime26.withFieldAdded(durationFieldType27, 7);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.halfdayOfDay();
        org.joda.time.DurationField durationField52 = chronology50.millis();
        org.joda.time.DateTimeField dateTimeField53 = chronology50.millisOfSecond();
        org.joda.time.DurationField durationField54 = chronology50.years();
        org.joda.time.DurationField durationField55 = durationFieldType27.getField(chronology50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField31 and durationField54", (durationField31.compareTo(durationField54) == 0) == durationField31.equals(durationField54));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.era();
        int int5 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekOfWeekyear((int) (byte) 1);
        int int8 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        java.lang.String str12 = durationFieldType11.toString();
        boolean boolean13 = localDateTime10.isSupported(durationFieldType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        boolean boolean19 = dateTimeFieldType14.isSupported(chronology17);
        org.joda.time.DurationField durationField20 = durationFieldType11.getField(chronology17);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology17.add(readablePeriod21, (long) 27427155, (int) (byte) 0);
        org.joda.time.DurationField durationField25 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str29 = dateTimeZone27.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.minuteOfHour();
        int int35 = property34.get();
        org.joda.time.LocalDateTime localDateTime37 = property34.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfCentury(0);
        int int41 = localDateTime40.getMillisOfDay();
        long long43 = chronology17.set((org.joda.time.ReadablePartial) localDateTime40, 1640157423775L);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime();
        java.lang.String str45 = localDateTime44.toString();
        int int46 = localDateTime44.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime44.minusMonths(2);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime58.toDateTime(readableInstant59);
        long long61 = dateTime60.getMillis();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str64 = dateTimeZone62.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now(dateTimeZone62);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = localDateTime65.getFieldType((int) (short) 0);
        boolean boolean68 = dateTime60.isSupported(dateTimeFieldType67);
        org.joda.time.DateTime dateTime69 = localDateTime48.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str72 = dateTimeZone70.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime73 = org.joda.time.LocalDateTime.now(dateTimeZone70);
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.millisOfDay();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime73.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.DateTime dateTime80 = localDateTime78.toDateTime(readableInstant79);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str83 = dateTimeZone81.getShortName((long) (short) 10);
        long long85 = dateTimeZone81.convertUTCToLocal((long) ' ');
        java.lang.String str86 = dateTimeZone81.toString();
        long long88 = dateTimeZone81.previousTransition(32L);
        long long91 = dateTimeZone81.convertLocalToUTC(97L, false);
        boolean boolean92 = dateTime80.equals((java.lang.Object) false);
        boolean boolean93 = dateTime69.isEqual((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.Instant instant94 = dateTime69.toInstant();
        org.joda.time.DateTime dateTime95 = localDateTime40.toDateTime((org.joda.time.ReadableInstant) instant94);
        org.joda.time.DateTimeZone dateTimeZone96 = instant94.getZone();
        long long98 = dateTimeZone96.previousTransition(1645629369180L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime69 and instant94", (dateTime69.compareTo(instant94) == 0) == dateTime69.equals(instant94));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        org.joda.time.DurationField durationField4 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.halfdayOfDay();
        org.joda.time.DurationField durationField8 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        boolean boolean7 = dateTimeFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.DurationField durationField12 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField4, and durationField5", !(durationField12.compareTo(durationField4) == 0) || (Math.signum(durationField12.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        boolean boolean5 = dateTimeFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.era();
        org.joda.time.DurationField durationField9 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField9", (durationField4.compareTo(durationField9) == 0) == durationField4.equals(durationField9));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.DurationField durationField8 = chronology6.centuries();
        boolean boolean9 = durationFieldType3.isSupported(chronology6);
        org.joda.time.DurationField durationField10 = chronology6.halfdays();
        boolean boolean11 = durationFieldType1.isSupported(chronology6);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DurationField durationField16 = chronology14.centuries();
        org.joda.time.DurationField durationField17 = chronology14.hours();
        org.joda.time.DurationField durationField18 = chronology14.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology14.secondOfDay();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DurationField durationField21 = chronology14.hours();
        boolean boolean22 = durationFieldType1.isSupported(chronology14);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((-100L), chronology26);
        org.joda.time.DateTimeField dateTimeField30 = chronology26.yearOfCentury();
        boolean boolean31 = durationFieldType1.isSupported(chronology26);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.weekyears();
        org.joda.time.DurationField durationField36 = chronology34.centuries();
        org.joda.time.DurationField durationField37 = chronology34.minutes();
        org.joda.time.DateTimeField dateTimeField38 = chronology34.monthOfYear();
        boolean boolean39 = durationFieldType1.isSupported(chronology34);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.weekyears();
        org.joda.time.DurationField durationField45 = chronology43.centuries();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology43);
        org.joda.time.DateTimeField dateTimeField47 = chronology43.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField48 = chronology43.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusDays(0);
        long long54 = chronology43.set((org.joda.time.ReadablePartial) localDateTime52, (long) 24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = localDateTime52.toString(dateTimeFormatter55);
        org.joda.time.Chronology chronology57 = localDateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.millisOfSecond();
        org.joda.time.DurationField durationField59 = durationFieldType1.getField(chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField59, durationField7, and durationField8", !(durationField59.compareTo(durationField7) == 0) || (Math.signum(durationField59.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.ReadableInstant readableInstant5 = null;
        long long6 = property4.getDifferenceAsLong(readableInstant5);
        int int7 = property4.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property4.roundHalfEvenCopy();
        org.joda.time.DurationField durationField9 = property4.getRangeDurationField();
        org.joda.time.DurationField durationField10 = property4.getLeapDurationField();
        int int11 = property4.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime(readableInstant21);
        long long23 = dateTime22.getMillis();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str26 = dateTimeZone24.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = localDateTime27.getFieldType((int) (short) 0);
        boolean boolean30 = dateTime22.isSupported(dateTimeFieldType29);
        long long31 = dateTime22.getMillis();
        org.joda.time.Instant instant32 = dateTime22.toInstant();
        org.joda.time.Chronology chronology33 = dateTime22.getChronology();
        long long34 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime22);
        java.lang.String str35 = property4.toString();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str38 = dateTimeZone36.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        org.joda.time.ReadableInstant readableInstant41 = null;
        long long42 = property40.getDifferenceAsLong(readableInstant41);
        org.joda.time.DurationField durationField43 = property40.getLeapDurationField();
        java.lang.String str44 = property40.getAsString();
        org.joda.time.LocalDateTime localDateTime45 = property40.roundFloorCopy();
        java.util.Locale locale46 = java.util.Locale.ENGLISH;
        java.lang.String str47 = property40.getAsText(locale46);
        org.joda.time.LocalDateTime localDateTime48 = property40.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology51 = localDateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.dayOfYear();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str56 = dateTimeZone54.getShortName((long) (short) 10);
        long long58 = dateTimeZone54.convertUTCToLocal((long) ' ');
        java.lang.String str59 = dateTimeZone54.toString();
        long long61 = dateTimeZone54.previousTransition(32L);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.withWeekyear(22);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str67 = dateTimeZone65.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now(dateTimeZone65);
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.millisOfDay();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime64.withFields((org.joda.time.ReadablePartial) localDateTime68);
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology74 = localDateTime73.getChronology();
        org.joda.time.DurationField durationField75 = chronology74.hours();
        java.lang.String str76 = chronology74.toString();
        org.joda.time.DateTimeField dateTimeField77 = chronology74.clockhourOfDay();
        int int79 = dateTimeField77.get(1645629354990L);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str82 = dateTimeZone80.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime83 = org.joda.time.LocalDateTime.now(dateTimeZone80);
        org.joda.time.LocalDateTime.Property property84 = localDateTime83.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType85 = org.joda.time.DurationFieldType.centuries();
        boolean boolean86 = localDateTime83.equals((java.lang.Object) durationFieldType85);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray87 = localDateTime83.getFieldTypes();
        java.lang.String str88 = localDateTime83.toString();
        java.util.Locale locale89 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str90 = dateTimeField77.getAsText((org.joda.time.ReadablePartial) localDateTime83, locale89);
        java.lang.String str91 = dateTimeField53.getAsText((org.joda.time.ReadablePartial) localDateTime68, 0, locale89);
        java.lang.String str92 = property40.getAsText(locale89);
        java.lang.String str93 = property4.getAsText(locale89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant32", (dateTime22.compareTo(instant32) == 0) == dateTime22.equals(instant32));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        boolean boolean6 = localDateTime3.equals((java.lang.Object) durationFieldType5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withWeekOfWeekyear((int) (byte) 10);
        int int9 = localDateTime8.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfMinute();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str18 = dateTimeZone16.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.centuries();
        boolean boolean22 = localDateTime19.equals((java.lang.Object) durationFieldType21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withWeekOfWeekyear((int) (byte) 10);
        int int25 = localDateTime24.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.plusWeeks(26204);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType28.getField(chronology29);
        long long32 = dateTimeField30.roundFloor((long) (-1));
        java.util.Locale.Builder builder33 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder33.addUnicodeLocaleAttribute("und");
        java.util.Locale locale36 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale37 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.lang.String str39 = locale37.getDisplayName();
        java.util.Locale.Builder builder40 = builder35.setLocale(locale37);
        int int41 = dateTimeField30.getMaximumShortTextLength(locale37);
        int int43 = dateTimeField30.getMaximumValue(1645629352137L);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.weekyears();
        org.joda.time.DurationField durationField48 = chronology46.centuries();
        org.joda.time.DurationField durationField49 = chronology46.hours();
        org.joda.time.DurationField durationField50 = chronology46.seconds();
        org.joda.time.DateTimeField dateTimeField51 = chronology46.secondOfDay();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology46);
        int int53 = localDateTime52.getWeekyear();
        org.joda.time.LocalDateTime.Property property54 = localDateTime52.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str57 = dateTimeZone55.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(dateTimeZone55);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.centuries();
        boolean boolean61 = localDateTime58.equals((java.lang.Object) durationFieldType60);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray62 = localDateTime58.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str65 = dateTimeZone63.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime66 = org.joda.time.LocalDateTime.now(dateTimeZone63);
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.millisOfDay();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime66.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.withEra((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.secondOfMinute();
        boolean boolean77 = localDateTime58.isAfter((org.joda.time.ReadablePartial) localDateTime75);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime58.withYear(32);
        org.joda.time.LocalDateTime.Property property80 = localDateTime79.dayOfMonth();
        int[] intArray81 = localDateTime79.getValues();
        int int82 = dateTimeField30.getMinimumValue((org.joda.time.ReadablePartial) localDateTime52, intArray81);
        int int83 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localDateTime27, intArray81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField47", (durationField14.compareTo(durationField47) == 0) == durationField14.equals(durationField47));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        boolean boolean7 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.year();
        org.joda.time.DurationField durationField9 = chronology3.halfdays();
        org.joda.time.DurationField durationField10 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField4, and durationField5", !(durationField10.compareTo(durationField4) == 0) || (Math.signum(durationField10.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        boolean boolean7 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.year();
        org.joda.time.DurationField durationField9 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField4, and durationField5", !(durationField9.compareTo(durationField4) == 0) || (Math.signum(durationField9.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        long long51 = instant50.getMillis();
        org.joda.time.Instant instant52 = instant50.toInstant();
        org.joda.time.DateTimeZone dateTimeZone53 = instant50.getZone();
        int int55 = dateTimeZone53.getOffset(1115181400729648L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.era();
        int int5 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekOfWeekyear((int) (byte) 1);
        int int8 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        java.lang.String str12 = durationFieldType11.toString();
        boolean boolean13 = localDateTime10.isSupported(durationFieldType11);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        org.joda.time.DurationField durationField19 = chronology17.centuries();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology17);
        org.joda.time.DurationField durationField21 = chronology17.millis();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.minuteOfDay();
        org.joda.time.DurationField durationField23 = durationFieldType11.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField24 = chronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField27 = chronology17.months();
        org.joda.time.DurationField durationField28 = chronology17.years();
        org.joda.time.DurationField durationField29 = chronology17.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField28", (durationField18.compareTo(durationField28) == 0) == durationField18.equals(durationField28));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((java.lang.Object) 54974408L);
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str5 = dateTimeZone3.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.ReadableInstant readableInstant8 = null;
        long long9 = property7.getDifferenceAsLong(readableInstant8);
        org.joda.time.DurationField durationField10 = property7.getLeapDurationField();
        java.lang.String str11 = property7.getAsString();
        org.joda.time.LocalDateTime localDateTime12 = property7.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getShortName((long) (short) 10);
        long long19 = dateTimeZone15.convertUTCToLocal((long) ' ');
        java.lang.String str20 = dateTimeZone15.toString();
        boolean boolean22 = dateTimeZone15.equals((java.lang.Object) (short) 100);
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = dateTimeZone15.getShortName((long) (-1), locale24);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime27 = localDateTime14.toDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        java.lang.String str29 = localDateTime28.toString();
        int int30 = localDateTime28.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.minusMonths(2);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str36 = dateTimeZone34.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime42.toDateTime(readableInstant43);
        long long45 = dateTime44.getMillis();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str48 = dateTimeZone46.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now(dateTimeZone46);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = localDateTime49.getFieldType((int) (short) 0);
        boolean boolean52 = dateTime44.isSupported(dateTimeFieldType51);
        org.joda.time.DateTime dateTime53 = localDateTime32.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str56 = dateTimeZone54.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now(dateTimeZone54);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.millisOfDay();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.DateTime dateTime64 = localDateTime62.toDateTime(readableInstant63);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str67 = dateTimeZone65.getShortName((long) (short) 10);
        long long69 = dateTimeZone65.convertUTCToLocal((long) ' ');
        java.lang.String str70 = dateTimeZone65.toString();
        long long72 = dateTimeZone65.previousTransition(32L);
        long long75 = dateTimeZone65.convertLocalToUTC(97L, false);
        boolean boolean76 = dateTime64.equals((java.lang.Object) false);
        boolean boolean77 = dateTime53.isEqual((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Instant instant78 = dateTime53.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int80 = instant78.get(dateTimeFieldType79);
        int int81 = dateTime27.get(dateTimeFieldType79);
        org.joda.time.Instant instant82 = dateTime27.toInstant();
        boolean boolean83 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime53 and instant78", (dateTime53.compareTo(instant78) == 0) == dateTime53.equals(instant78));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        boolean boolean7 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology3.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology3);
        int int12 = localDateTime11.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int14 = localDateTime11.get(dateTimeFieldType13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime11.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.minus(readablePeriod16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.centuries();
        boolean boolean26 = localDateTime23.equals((java.lang.Object) durationFieldType25);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.minuteOfDay();
        org.joda.time.DurationField durationField32 = durationFieldType25.getField(chronology29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str35 = dateTimeZone33.getShortName((long) (short) 10);
        long long37 = dateTimeZone33.convertUTCToLocal((long) ' ');
        java.lang.String str38 = dateTimeZone33.toString();
        long long41 = dateTimeZone33.adjustOffset((long) (short) 100, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        org.joda.time.Chronology chronology43 = chronology29.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField44 = durationFieldType19.getField(chronology29);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17, chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField44", (durationField4.compareTo(durationField44) == 0) == durationField4.equals(durationField44));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.centuries();
        boolean boolean8 = localDateTime5.equals((java.lang.Object) durationFieldType7);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfDay();
        org.joda.time.DurationField durationField14 = durationFieldType7.getField(chronology11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getShortName((long) (short) 10);
        long long19 = dateTimeZone15.convertUTCToLocal((long) ' ');
        java.lang.String str20 = dateTimeZone15.toString();
        long long23 = dateTimeZone15.adjustOffset((long) (short) 100, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.Chronology chronology25 = chronology11.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField26 = durationFieldType1.getField(chronology11);
        java.lang.String str27 = durationFieldType1.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField26", (durationField12.compareTo(durationField26) == 0) == durationField12.equals(durationField26));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology3);
        org.joda.time.DurationField durationField7 = chronology3.millis();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField12 = chronology3.centuries();
        org.joda.time.DateTimeField dateTimeField13 = chronology3.minuteOfDay();
        org.joda.time.DurationField durationField14 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField4, and durationField5", !(durationField14.compareTo(durationField4) == 0) || (Math.signum(durationField14.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.era();
        int int5 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekOfWeekyear((int) (byte) 1);
        int int8 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        java.lang.String str12 = durationFieldType11.toString();
        boolean boolean13 = localDateTime10.isSupported(durationFieldType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        boolean boolean19 = dateTimeFieldType14.isSupported(chronology17);
        org.joda.time.DurationField durationField20 = durationFieldType11.getField(chronology17);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology17.add(readablePeriod21, (long) 27427155, (int) (byte) 0);
        org.joda.time.DurationField durationField25 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        int int29 = dateTimeField26.getDifference((long) 356, 1645514199918L);
        org.joda.time.DurationField durationField30 = dateTimeField26.getDurationField();
        org.joda.time.DurationField durationField31 = dateTimeField26.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField30", (durationField18.compareTo(durationField30) == 0) == durationField18.equals(durationField30));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.minuteOfDay();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = dateTimeField5.getAsText(1645629393657L, locale7);
        java.lang.String str10 = locale7.getScript();
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Locale.Category category12 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        java.util.Locale.setDefault(category12, locale13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType15.getField(chronology16);
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = dateTimeField17.getAsShortText(100, locale20);
        java.util.Locale.setDefault(category12, locale20);
        org.joda.time.tz.NameProvider nameProvider23 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale24 = java.util.Locale.CANADA;
        java.lang.String str27 = nameProvider23.getShortName(locale24, "fran\347ais", "2022-02-22T07:15:48.066");
        java.util.Locale.setDefault(category12, locale24);
        java.util.Locale locale29 = null;
        java.lang.String str30 = locale24.getDisplayScript(locale29);
        java.util.Locale.Category category31 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale32.getISO3Language();
        java.util.Locale.setDefault(category31, locale32);
        java.util.Locale locale35 = java.util.Locale.getDefault(category31);
        java.util.Locale locale36 = java.util.Locale.getDefault(category31);
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleAttributes();
        java.lang.String str38 = locale24.getDisplayCountry(locale36);
        java.lang.String str39 = locale11.getDisplayCountry(locale24);
        java.lang.String str40 = locale7.getDisplayVariant(locale11);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str43 = dateTimeZone41.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.millisOfDay();
        org.joda.time.ReadableInstant readableInstant46 = null;
        long long47 = property45.getDifferenceAsLong(readableInstant46);
        org.joda.time.DurationField durationField48 = property45.getLeapDurationField();
        java.lang.String str49 = property45.getAsString();
        org.joda.time.LocalDateTime localDateTime50 = property45.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str55 = dateTimeZone53.getShortName((long) (short) 10);
        long long57 = dateTimeZone53.convertUTCToLocal((long) ' ');
        java.lang.String str58 = dateTimeZone53.toString();
        boolean boolean60 = dateTimeZone53.equals((java.lang.Object) (short) 100);
        java.util.Locale locale62 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str63 = dateTimeZone53.getShortName((long) (-1), locale62);
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime65 = localDateTime52.toDateTime(dateTimeZone53);
        org.joda.time.LocalDateTime localDateTime66 = org.joda.time.LocalDateTime.now(dateTimeZone53);
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology69 = localDateTime68.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone71 = chronology69.getZone();
        org.joda.time.DurationField durationField72 = chronology69.centuries();
        org.joda.time.DurationField durationField73 = chronology69.years();
        org.joda.time.DateTimeField dateTimeField74 = chronology69.millisOfDay();
        java.util.Locale locale76 = java.util.Locale.CANADA;
        java.lang.String str77 = dateTimeField74.getAsText(26371056, locale76);
        boolean boolean78 = dateTimeZone53.equals((java.lang.Object) locale76);
        java.lang.String str79 = locale7.getDisplayVariant(locale76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField73", (durationField3.compareTo(durationField73) == 0) == durationField3.equals(durationField73));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology3);
        org.joda.time.DateTimeField dateTimeField7 = chronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.clockhourOfHalfday();
        org.joda.time.Chronology chronology9 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField14 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField4, and durationField5", !(durationField14.compareTo(durationField4) == 0) || (Math.signum(durationField14.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.era();
        int int5 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekOfWeekyear((int) (byte) 1);
        int int8 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        java.lang.String str12 = durationFieldType11.toString();
        boolean boolean13 = localDateTime10.isSupported(durationFieldType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        boolean boolean19 = dateTimeFieldType14.isSupported(chronology17);
        org.joda.time.DurationField durationField20 = durationFieldType11.getField(chronology17);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology17.add(readablePeriod21, (long) 27427155, (int) (byte) 0);
        org.joda.time.DurationField durationField25 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str29 = dateTimeZone27.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.minuteOfHour();
        int int35 = property34.get();
        org.joda.time.LocalDateTime localDateTime37 = property34.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfCentury(0);
        int int41 = localDateTime40.getMillisOfDay();
        long long43 = chronology17.set((org.joda.time.ReadablePartial) localDateTime40, 1640157423775L);
        org.joda.time.DurationField durationField44 = chronology17.years();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField44", (durationField18.compareTo(durationField44) == 0) == durationField18.equals(durationField44));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        java.util.Locale locale51 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet53 = locale51.getUnicodeLocaleAttributes();
        boolean boolean54 = instant50.equals((java.lang.Object) locale51);
        org.joda.time.DateTimeZone dateTimeZone55 = instant50.getZone();
        int int57 = dateTimeZone55.getOffset(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.weekyears();
        org.joda.time.DurationField durationField6 = chronology4.centuries();
        boolean boolean7 = durationFieldType1.isSupported(chronology4);
        org.joda.time.DateTimeField dateTimeField8 = chronology4.halfdayOfDay();
        org.joda.time.Chronology chronology9 = chronology4.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology4.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = chronology4.hourOfDay();
        org.joda.time.DurationField durationField12 = chronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField5, and durationField6", !(durationField12.compareTo(durationField5) == 0) || (Math.signum(durationField12.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        long long4 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.lang.String str5 = dateTimeZone0.toString();
        long long7 = dateTimeZone0.previousTransition(32L);
        long long10 = dateTimeZone0.convertLocalToUTC(97L, false);
        java.lang.String str12 = dateTimeZone0.getShortName((long) 5);
        int int14 = dateTimeZone0.getOffset((long) 567);
        long long16 = dateTimeZone0.nextTransition((long) 26213656);
        long long18 = dateTimeZone0.previousTransition(1645586240327L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime(readableInstant28);
        long long30 = dateTime29.getMillis();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = localDateTime34.getFieldType((int) (short) 0);
        boolean boolean37 = dateTime29.isSupported(dateTimeFieldType36);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str40 = dateTimeZone38.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(dateTimeZone38);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfDay();
        org.joda.time.ReadableInstant readableInstant43 = null;
        long long44 = property42.getDifferenceAsLong(readableInstant43);
        org.joda.time.DurationField durationField45 = property42.getLeapDurationField();
        java.lang.String str46 = property42.getAsString();
        org.joda.time.LocalDateTime localDateTime47 = property42.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName((long) (short) 10);
        long long54 = dateTimeZone50.convertUTCToLocal((long) ' ');
        java.lang.String str55 = dateTimeZone50.toString();
        boolean boolean57 = dateTimeZone50.equals((java.lang.Object) (short) 100);
        java.util.Locale locale59 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str60 = dateTimeZone50.getShortName((long) (-1), locale59);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime62 = localDateTime49.toDateTime(dateTimeZone50);
        boolean boolean63 = dateTime29.isEqual((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Instant instant64 = dateTime62.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = null;
        boolean boolean66 = instant64.isSupported(dateTimeFieldType65);
        int int67 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant64);
        long long70 = dateTimeZone0.convertLocalToUTC(26169744L, false);
        java.lang.String str71 = dateTimeZone0.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime62 and instant64", (dateTime62.compareTo(instant64) == 0) == dateTime62.equals(instant64));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        long long15 = dateTimeZone11.convertUTCToLocal((long) ' ');
        java.lang.String str16 = dateTimeZone11.toString();
        long long18 = dateTimeZone11.previousTransition(32L);
        long long21 = dateTimeZone11.convertLocalToUTC(97L, false);
        boolean boolean22 = dateTime10.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        long long34 = dateTime33.getMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDateTime38.getFieldType((int) (short) 0);
        boolean boolean41 = dateTime33.isSupported(dateTimeFieldType40);
        boolean boolean42 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime33);
        java.lang.String str43 = dateTime10.toString();
        boolean boolean45 = dateTime10.equals((java.lang.Object) (short) 1);
        org.joda.time.Instant instant46 = dateTime10.toInstant();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withDurationAdded(readableDuration48, (int) '#');
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.weekyear();
        int int52 = property51.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField53 = property51.getField();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str56 = dateTimeZone54.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now(dateTimeZone54);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.millisOfDay();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.minusHours((int) (short) 10);
        int int65 = dateTimeField53.getMinimumValue((org.joda.time.ReadablePartial) localDateTime64);
        java.lang.String str67 = dateTimeField53.getAsText((long) (-292275054));
        long long69 = dateTimeField53.roundHalfFloor(0L);
        java.util.Locale locale71 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale72 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str73 = locale71.getDisplayCountry(locale72);
        java.util.Locale locale74 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale75 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str76 = locale74.getDisplayCountry(locale75);
        java.lang.String str77 = locale71.getDisplayVariant(locale74);
        java.util.Locale locale78 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale79 = locale78.stripExtensions();
        java.lang.String str80 = locale71.getDisplayLanguage(locale79);
        java.lang.String str81 = dateTimeField53.getAsText((int) (byte) 1, locale71);
        boolean boolean82 = instant46.equals((java.lang.Object) dateTimeField53);
        org.joda.time.DateTimeZone dateTimeZone83 = instant46.getZone();
        int int85 = dateTimeZone83.getOffset(1645629511462L);
        org.joda.time.LocalDateTime localDateTime86 = org.joda.time.LocalDateTime.now(dateTimeZone83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant46", (dateTime10.compareTo(instant46) == 0) == dateTime10.equals(instant46));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.hours();
        org.joda.time.DurationField durationField5 = durationFieldType0.getField(chronology3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(1439);
        org.joda.time.Chronology chronology8 = chronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField4, and durationField5", !(durationField9.compareTo(durationField4) == 0) || (Math.signum(durationField9.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.seconds();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.secondOfDay();
        org.joda.time.DurationField durationField7 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField7", (durationField3.compareTo(durationField7) == 0) == durationField3.equals(durationField7));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.ReadableInstant readableInstant5 = null;
        long long6 = property4.getDifferenceAsLong(readableInstant5);
        int int7 = property4.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property4.roundHalfEvenCopy();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withWeekyear(59);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withDurationAdded(readableDuration14, (int) '#');
        org.joda.time.LocalDateTime.Property property17 = localDateTime13.era();
        int int18 = localDateTime13.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime13.withWeekOfWeekyear((int) (byte) 1);
        int int21 = localDateTime13.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime13.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.days();
        java.lang.String str25 = durationFieldType24.toString();
        boolean boolean26 = localDateTime23.isSupported(durationFieldType24);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.weekyears();
        org.joda.time.DurationField durationField32 = chronology30.centuries();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology30);
        org.joda.time.DurationField durationField34 = chronology30.millis();
        org.joda.time.DateTimeField dateTimeField35 = chronology30.minuteOfDay();
        org.joda.time.DurationField durationField36 = durationFieldType24.getField(chronology30);
        java.lang.String str37 = durationFieldType24.getName();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime12.withFieldAdded(durationFieldType24, (-19046));
        java.lang.String str40 = durationFieldType24.getName();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str43 = dateTimeZone41.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.millisOfDay();
        org.joda.time.ReadableInstant readableInstant46 = null;
        long long47 = property45.getDifferenceAsLong(readableInstant46);
        java.util.Locale locale48 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str49 = locale48.getISO3Language();
        java.lang.String str50 = property45.getAsShortText(locale48);
        org.joda.time.DurationField durationField51 = property45.getDurationField();
        long long54 = durationField51.add((long) 1, 10);
        boolean boolean55 = durationField51.isPrecise();
        int int57 = durationField51.getValue((long) 26149500);
        int int60 = durationField51.getValue((long) (short) 10, 0L);
        long long63 = durationField51.add((long) 'a', (long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType64 = durationField51.getType();
        org.joda.time.DurationFieldType durationFieldType65 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology68 = localDateTime67.getChronology();
        org.joda.time.DurationField durationField69 = chronology68.hours();
        org.joda.time.DurationField durationField70 = durationFieldType65.getField(chronology68);
        org.joda.time.DateTimeField dateTimeField71 = chronology68.hourOfHalfday();
        org.joda.time.DurationField durationField72 = chronology68.weeks();
        boolean boolean73 = durationFieldType64.isSupported(chronology68);
        org.joda.time.DateTimeField dateTimeField74 = chronology68.year();
        boolean boolean75 = durationFieldType24.isSupported(chronology68);
        org.joda.time.DateTimeField dateTimeField76 = chronology68.weekyear();
        org.joda.time.DurationField durationField77 = chronology68.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField77, durationField31, and durationField32", !(durationField77.compareTo(durationField31) == 0) || (Math.signum(durationField77.compareTo(durationField32)) == Math.signum(durationField31.compareTo(durationField32))));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusMillis((-1));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYear((int) (short) 100);
        java.lang.String str14 = localDateTime13.toString();
        boolean boolean15 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDateTime13);
        java.util.Locale locale16 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray18 = strSet17.toArray();
        boolean boolean19 = strSet17.isEmpty();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray22 = strSet21.toArray();
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        boolean boolean25 = strSet21.removeAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray30 = new org.joda.time.DurationFieldType[] { durationFieldType28, durationFieldType29 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = strSet27.toArray(durationFieldTypeArray30);
        boolean boolean32 = strSet21.containsAll((java.util.Collection<java.lang.String>) strSet27);
        java.lang.Object[] objArray33 = strSet27.toArray();
        boolean boolean34 = strSet17.removeAll((java.util.Collection<java.lang.String>) strSet27);
        java.util.Locale locale35 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray37 = strSet36.toArray();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        boolean boolean40 = strSet36.removeAll((java.util.Collection<java.lang.String>) strSet39);
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray45 = new org.joda.time.DurationFieldType[] { durationFieldType43, durationFieldType44 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray46 = strSet42.toArray(durationFieldTypeArray45);
        boolean boolean47 = strSet36.containsAll((java.util.Collection<java.lang.String>) strSet42);
        java.util.Locale locale48 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray50 = strSet49.toArray();
        java.util.Locale locale51 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        boolean boolean53 = strSet49.removeAll((java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale locale54 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray58 = new org.joda.time.DurationFieldType[] { durationFieldType56, durationFieldType57 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray59 = strSet55.toArray(durationFieldTypeArray58);
        boolean boolean60 = strSet49.containsAll((java.util.Collection<java.lang.String>) strSet55);
        java.lang.Object[] objArray61 = strSet55.toArray();
        boolean boolean62 = strSet36.retainAll((java.util.Collection<java.lang.String>) strSet55);
        boolean boolean63 = strSet27.addAll((java.util.Collection<java.lang.String>) strSet55);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean65 = strSet55.remove((java.lang.Object) dateTimeFieldType64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime3.property(dateTimeFieldType64);
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.weekyears();
        org.joda.time.DurationField durationField72 = chronology70.centuries();
        org.joda.time.DurationField durationField73 = durationFieldType67.getField(chronology70);
        boolean boolean74 = dateTimeFieldType64.isSupported(chronology70);
        org.joda.time.DurationField durationField75 = chronology70.weekyears();
        java.lang.String str76 = chronology70.toString();
        org.joda.time.DateTimeField dateTimeField77 = chronology70.monthOfYear();
        org.joda.time.DateTimeField dateTimeField78 = chronology70.year();
        org.joda.time.DateTimeField dateTimeField79 = chronology70.era();
        org.joda.time.DurationField durationField80 = dateTimeField79.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField80, durationField71, and durationField72", !(durationField80.compareTo(durationField71) == 0) || (Math.signum(durationField80.compareTo(durationField72)) == Math.signum(durationField71.compareTo(durationField72))));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology3);
        org.joda.time.DurationField durationField7 = chronology3.millis();
        org.joda.time.DurationField durationField8 = chronology3.weeks();
        org.joda.time.DurationField durationField9 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField9", (durationField4.compareTo(durationField9) == 0) == durationField4.equals(durationField9));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = chronology2.add(readablePeriod5, 10L, 26149500);
        org.joda.time.DateTimeField dateTimeField9 = chronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = chronology2.months();
        org.joda.time.DurationField durationField11 = chronology2.seconds();
        org.joda.time.DurationField durationField12 = chronology2.seconds();
        org.joda.time.DurationField durationField13 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField10", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField10)) == Math.signum(durationField3.compareTo(durationField10))));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.hours();
        org.joda.time.DurationField durationField5 = durationFieldType0.getField(chronology3);
        org.joda.time.Chronology chronology6 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.era();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.DurationField durationField9 = chronology6.millis();
        org.joda.time.Chronology chronology10 = chronology6.withUTC();
        org.joda.time.DurationField durationField11 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField4, and durationField5", !(durationField11.compareTo(durationField4) == 0) || (Math.signum(durationField11.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        boolean boolean5 = dateTimeFieldType0.isSupported(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        java.lang.String str7 = localDateTime6.toString();
        int int8 = localDateTime6.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(2);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime(readableInstant21);
        long long23 = dateTime22.getMillis();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str26 = dateTimeZone24.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = localDateTime27.getFieldType((int) (short) 0);
        boolean boolean30 = dateTime22.isSupported(dateTimeFieldType29);
        org.joda.time.DateTime dateTime31 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        int[] intArray33 = chronology3.get((org.joda.time.ReadablePartial) localDateTime10, 11L);
        org.joda.time.DateTimeField dateTimeField34 = chronology3.centuryOfEra();
        org.joda.time.DurationField durationField35 = chronology3.years();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str38 = dateTimeZone36.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusHours((int) (short) 10);
        int int47 = localDateTime44.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime44.withHourOfDay(10);
        long long51 = chronology3.set((org.joda.time.ReadablePartial) localDateTime44, (-33288223431674L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField35", (durationField4.compareTo(durationField35) == 0) == durationField4.equals(durationField35));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName((long) (short) 10);
        long long15 = dateTimeZone11.convertUTCToLocal((long) ' ');
        java.lang.String str16 = dateTimeZone11.toString();
        long long18 = dateTimeZone11.previousTransition(32L);
        long long21 = dateTimeZone11.convertLocalToUTC(97L, false);
        boolean boolean22 = dateTime10.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        long long34 = dateTime33.getMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str37 = dateTimeZone35.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDateTime38.getFieldType((int) (short) 0);
        boolean boolean41 = dateTime33.isSupported(dateTimeFieldType40);
        boolean boolean42 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime33);
        java.lang.String str43 = dateTime10.toString();
        boolean boolean45 = dateTime10.equals((java.lang.Object) (short) 1);
        org.joda.time.Instant instant46 = dateTime10.toInstant();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology49 = localDateTime48.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.hours();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusDays(26204);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str56 = dateTimeZone54.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now(dateTimeZone54);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.millisOfDay();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withYear((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology64 = localDateTime63.getChronology();
        org.joda.time.DurationField durationField65 = chronology64.weekyears();
        org.joda.time.DurationField durationField66 = chronology64.centuries();
        org.joda.time.DurationField durationField67 = chronology64.minutes();
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(chronology64);
        boolean boolean69 = dateTimeFieldType61.isSupported(chronology64);
        int int70 = localDateTime60.indexOf(dateTimeFieldType61);
        int int71 = localDateTime51.get(dateTimeFieldType61);
        int int72 = instant46.get(dateTimeFieldType61);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology76 = localDateTime75.getChronology();
        org.joda.time.DurationField durationField77 = chronology76.weekyears();
        boolean boolean78 = dateTimeFieldType73.isSupported(chronology76);
        org.joda.time.DurationField durationField79 = chronology76.centuries();
        org.joda.time.DateTimeField dateTimeField80 = chronology76.year();
        org.joda.time.DateTimeField dateTimeField81 = chronology76.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField82 = chronology76.dayOfMonth();
        boolean boolean83 = dateTimeFieldType61.isSupported(chronology76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant46", (dateTime10.compareTo(instant46) == 0) == dateTime10.equals(instant46));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        boolean boolean7 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.monthOfYear();
        org.joda.time.DurationField durationField10 = dateTimeField9.getRangeDurationField();
        org.joda.time.DurationField durationField11 = dateTimeField9.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField11", (durationField4.compareTo(durationField11) == 0) == durationField4.equals(durationField11));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.era();
        org.joda.time.DurationField durationField7 = dateTimeField6.getDurationField();
        long long9 = dateTimeField6.roundCeiling(1645514214277L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusHours((int) (short) 10);
        int int11 = localDateTime8.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minusMinutes(0);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str15 = durationFieldType14.toString();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weekyears();
        org.joda.time.DurationField durationField21 = chronology19.centuries();
        org.joda.time.DurationField durationField22 = durationFieldType16.getField(chronology19);
        boolean boolean23 = durationFieldType14.isSupported(chronology19);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime8.withFieldAdded(durationFieldType14, (-1));
        int int26 = localDateTime25.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str29 = dateTimeZone27.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.withMonthOfYear((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime25.withFields((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.DateTime dateTime37 = localDateTime36.toDateTime();
        org.joda.time.Instant instant38 = dateTime37.toInstant();
        org.joda.time.Chronology chronology39 = dateTime37.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField40", (durationField22.compareTo(durationField40) == 0) == durationField22.equals(durationField40));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        long long4 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.lang.String str5 = dateTimeZone0.toString();
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone0.getShortName((long) (-1), locale9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withField(dateTimeFieldType12, (int) (short) 100);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        org.joda.time.DurationField durationField19 = chronology17.centuries();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.minuteOfDay();
        long long24 = chronology17.add((long) 2, (long) 21, (int) '4');
        boolean boolean25 = dateTimeFieldType12.isSupported(chronology17);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        long long30 = dateTimeZone26.convertUTCToLocal((long) ' ');
        java.lang.String str31 = dateTimeZone26.toString();
        long long33 = dateTimeZone26.previousTransition(32L);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology35 = chronology17.withZone(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.Chronology chronology38 = chronology17.withZone(dateTimeZone37);
        org.joda.time.Chronology chronology39 = chronology38.withUTC();
        org.joda.time.DurationField durationField40 = chronology38.minutes();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.era();
        org.joda.time.DurationField durationField42 = chronology38.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField18, and durationField19", !(durationField42.compareTo(durationField18) == 0) || (Math.signum(durationField42.compareTo(durationField19)) == Math.signum(durationField18.compareTo(durationField19))));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        boolean boolean6 = localDateTime3.equals((java.lang.Object) durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime3.getFieldTypes();
        java.lang.String str8 = localDateTime3.toString();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.plusMillis(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType11.getField(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime3.withField(dateTimeFieldType11, 2);
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType11.getDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.weekyears();
        boolean boolean22 = dateTimeFieldType17.isSupported(chronology20);
        org.joda.time.DurationField durationField23 = chronology20.centuries();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.year();
        boolean boolean25 = durationFieldType16.isSupported(chronology20);
        org.joda.time.DurationField durationField26 = chronology20.years();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getDurationType();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.weekyears();
        org.joda.time.DurationField durationField33 = chronology31.centuries();
        boolean boolean34 = durationFieldType28.isSupported(chronology31);
        org.joda.time.DurationField durationField35 = chronology31.halfdays();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology37 = chronology31.withZone(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str40 = dateTimeZone38.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(dateTimeZone38);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime41.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime(readableInstant47);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str51 = dateTimeZone49.getShortName((long) (short) 10);
        long long53 = dateTimeZone49.convertUTCToLocal((long) ' ');
        java.lang.String str54 = dateTimeZone49.toString();
        long long56 = dateTimeZone49.previousTransition(32L);
        long long59 = dateTimeZone49.convertLocalToUTC(97L, false);
        boolean boolean60 = dateTime48.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str63 = dateTimeZone61.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.now(dateTimeZone61);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.millisOfDay();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime64.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.DateTime dateTime71 = localDateTime69.toDateTime(readableInstant70);
        long long72 = dateTime71.getMillis();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str75 = dateTimeZone73.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime76 = org.joda.time.LocalDateTime.now(dateTimeZone73);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = localDateTime76.getFieldType((int) (short) 0);
        boolean boolean79 = dateTime71.isSupported(dateTimeFieldType78);
        boolean boolean80 = dateTime48.isAfter((org.joda.time.ReadableInstant) dateTime71);
        java.lang.String str81 = dateTime48.toString();
        boolean boolean83 = dateTime48.equals((java.lang.Object) (short) 1);
        int int84 = dateTimeZone36.getOffset((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.LocalDateTime localDateTime85 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.minusWeeks((-15));
        int[] intArray89 = chronology20.get((org.joda.time.ReadablePartial) localDateTime85, 1645629766073L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField26", (durationField21.compareTo(durationField26) == 0) == durationField21.equals(durationField26));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        java.lang.String str13 = property12.getName();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean16 = localDateTime14.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusMinutes(26147585);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        long long23 = dateTimeField21.roundFloor((long) (-1));
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder24.addUnicodeLocaleAttribute("und");
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale28 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.lang.String str30 = locale28.getDisplayName();
        java.util.Locale.Builder builder31 = builder26.setLocale(locale28);
        int int32 = dateTimeField21.getMaximumShortTextLength(locale28);
        java.lang.String str33 = dateTimeField7.getAsText((org.joda.time.ReadablePartial) localDateTime18, locale28);
        org.joda.time.LocalDateTime.Property property34 = localDateTime18.yearOfEra();
        org.joda.time.DurationField durationField35 = property34.getDurationField();
        org.joda.time.LocalDateTime localDateTime36 = property34.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField35", (durationField3.compareTo(durationField35) == 0) == durationField3.equals(durationField35));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        boolean boolean7 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology3.centuries();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName((long) (short) 10);
        long long14 = dateTimeZone10.convertUTCToLocal((long) ' ');
        java.lang.String str15 = dateTimeZone10.toString();
        long long17 = dateTimeZone10.previousTransition(32L);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYear((-86340));
        int[] intArray22 = chronology3.get((org.joda.time.ReadablePartial) localDateTime18, 1645629554906L);
        org.joda.time.DateTimeField dateTimeField23 = chronology3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.hours();
        java.lang.String str29 = chronology27.toString();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology27.era();
        org.joda.time.DurationField durationField32 = chronology27.halfdays();
        org.joda.time.DurationField durationField33 = chronology27.years();
        org.joda.time.DateTimeField dateTimeField34 = chronology27.clockhourOfDay();
        org.joda.time.DurationField durationField35 = chronology27.seconds();
        org.joda.time.DateTimeField dateTimeField36 = chronology27.secondOfDay();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(1645629433809L, chronology27);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusMinutes(50);
        int int40 = dateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) localDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField33", (durationField4.compareTo(durationField33) == 0) == durationField4.equals(durationField33));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusMillis((-1));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYear((int) (short) 100);
        java.lang.String str14 = localDateTime13.toString();
        boolean boolean15 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withFieldAdded(durationFieldType16, 7);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusMonths(2022);
        int int29 = localDateTime25.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean31 = localDateTime25.equals((java.lang.Object) dateTimeFieldType30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.plusHours(26163523);
        boolean boolean34 = localDateTime18.isBefore((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.days();
        boolean boolean36 = localDateTime18.isSupported(durationFieldType35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getRangeDurationType();
        boolean boolean39 = localDateTime18.isSupported(dateTimeFieldType37);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.weekyears();
        org.joda.time.DurationField durationField44 = chronology42.centuries();
        org.joda.time.DurationField durationField45 = chronology42.minutes();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.monthOfYear();
        org.joda.time.DateTimeField dateTimeField47 = chronology42.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField48 = chronology42.dayOfYear();
        org.joda.time.DateTimeField dateTimeField49 = chronology42.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField50 = chronology42.monthOfYear();
        boolean boolean51 = dateTimeFieldType37.isSupported(chronology42);
        org.joda.time.DateTimeField dateTimeField52 = chronology42.weekyearOfCentury();
        org.joda.time.DurationField durationField53 = chronology42.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField53, durationField43, and durationField44", !(durationField53.compareTo(durationField43) == 0) || (Math.signum(durationField53.compareTo(durationField44)) == Math.signum(durationField43.compareTo(durationField44))));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.halfdayOfDay();
        org.joda.time.DurationField durationField7 = durationFieldType2.getField(chronology5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        boolean boolean13 = dateTimeFieldType8.isSupported(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        java.lang.String str15 = localDateTime14.toString();
        int int16 = localDateTime14.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusMonths(2);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        long long31 = dateTime30.getMillis();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str34 = dateTimeZone32.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = localDateTime35.getFieldType((int) (short) 0);
        boolean boolean38 = dateTime30.isSupported(dateTimeFieldType37);
        org.joda.time.DateTime dateTime39 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        int[] intArray41 = chronology11.get((org.joda.time.ReadablePartial) localDateTime18, 11L);
        org.joda.time.DateTimeField dateTimeField42 = chronology11.centuryOfEra();
        org.joda.time.DurationField durationField43 = chronology11.minutes();
        org.joda.time.DurationField durationField44 = durationFieldType2.getField(chronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField44 and durationField12", Math.signum(durationField44.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField44)));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.era();
        org.joda.time.DurationField durationField7 = dateTimeField6.getDurationField();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.DurationField durationField13 = chronology11.centuries();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology11);
        org.joda.time.DurationField durationField15 = chronology11.millis();
        org.joda.time.DurationField durationField16 = chronology11.months();
        org.joda.time.DurationField durationField17 = chronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = chronology11.hourOfDay();
        long long21 = dateTimeField18.getDifferenceAsLong(1645629465394L, 1645629484270L);
        int int23 = dateTimeField18.getMinimumValue(1908343175219L);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str27 = dateTimeZone25.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfDay();
        org.joda.time.ReadableInstant readableInstant30 = null;
        long long31 = property29.getDifferenceAsLong(readableInstant30);
        org.joda.time.DurationField durationField32 = property29.getLeapDurationField();
        java.util.Locale locale33 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet34 = locale33.getUnicodeLocaleAttributes();
        java.lang.String str35 = locale33.getLanguage();
        java.lang.String str36 = locale33.toLanguageTag();
        java.lang.String str37 = property29.getAsShortText(locale33);
        java.util.Locale locale41 = new java.util.Locale("und", "+00:00:00.097");
        org.joda.time.LocalDateTime localDateTime42 = property29.setCopy("26158910", locale41);
        int int43 = property29.getMinimumValueOverall();
        org.joda.time.DurationField durationField44 = property29.getDurationField();
        java.util.Locale locale46 = java.util.Locale.forLanguageTag("1970-02-18T15:17:52.779");
        java.lang.String str47 = locale46.getScript();
        java.lang.String str48 = property29.getAsShortText(locale46);
        java.lang.String str49 = dateTimeField18.getAsShortText(1645629713102L, locale46);
        int int50 = dateTimeField6.getMaximumShortTextLength(locale46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        boolean boolean6 = localDateTime3.equals((java.lang.Object) durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime3.getFieldTypes();
        java.lang.String str8 = localDateTime3.toString();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.plusMillis(22);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology13 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology13.getZone();
        org.joda.time.DurationField durationField16 = chronology13.days();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology13);
        org.joda.time.DurationField durationField18 = chronology13.weekyears();
        org.joda.time.DurationField durationField19 = chronology13.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField18", (durationField14.compareTo(durationField18) == 0) == durationField14.equals(durationField18));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        long long5 = property4.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property4.getFieldType();
        org.joda.time.LocalDateTime localDateTime8 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusYears(3);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays(56);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusSeconds(25821774);
        org.joda.time.Chronology chronology15 = localDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekyearOfCentury();
        java.lang.String str17 = chronology15.toString();
        org.joda.time.DurationField durationField18 = chronology15.eras();
        org.joda.time.DurationField durationField19 = chronology15.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField19, and durationField18", !(durationField18.compareTo(durationField19) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField19.compareTo(durationField18))));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.era();
        int int5 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekOfWeekyear((int) (byte) 1);
        int int8 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusDays(500);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        java.lang.String str12 = durationFieldType11.toString();
        boolean boolean13 = localDateTime10.isSupported(durationFieldType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        boolean boolean19 = dateTimeFieldType14.isSupported(chronology17);
        org.joda.time.DurationField durationField20 = durationFieldType11.getField(chronology17);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology17.add(readablePeriod21, (long) 27427155, (int) (byte) 0);
        org.joda.time.DurationField durationField25 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str29 = dateTimeZone27.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.minuteOfHour();
        int int35 = property34.get();
        org.joda.time.LocalDateTime localDateTime37 = property34.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfCentury(0);
        int int41 = localDateTime40.getMillisOfDay();
        long long43 = chronology17.set((org.joda.time.ReadablePartial) localDateTime40, 1640157423775L);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime();
        java.lang.String str45 = localDateTime44.toString();
        int int46 = localDateTime44.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime44.minusMonths(2);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime58.toDateTime(readableInstant59);
        long long61 = dateTime60.getMillis();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str64 = dateTimeZone62.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now(dateTimeZone62);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = localDateTime65.getFieldType((int) (short) 0);
        boolean boolean68 = dateTime60.isSupported(dateTimeFieldType67);
        org.joda.time.DateTime dateTime69 = localDateTime48.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str72 = dateTimeZone70.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime73 = org.joda.time.LocalDateTime.now(dateTimeZone70);
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.millisOfDay();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime73.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.DateTime dateTime80 = localDateTime78.toDateTime(readableInstant79);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str83 = dateTimeZone81.getShortName((long) (short) 10);
        long long85 = dateTimeZone81.convertUTCToLocal((long) ' ');
        java.lang.String str86 = dateTimeZone81.toString();
        long long88 = dateTimeZone81.previousTransition(32L);
        long long91 = dateTimeZone81.convertLocalToUTC(97L, false);
        boolean boolean92 = dateTime80.equals((java.lang.Object) false);
        boolean boolean93 = dateTime69.isEqual((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.Instant instant94 = dateTime69.toInstant();
        org.joda.time.DateTime dateTime95 = localDateTime40.toDateTime((org.joda.time.ReadableInstant) instant94);
        org.joda.time.LocalDateTime localDateTime97 = localDateTime40.withCenturyOfEra(26169);
        int[] intArray98 = localDateTime40.getValues();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime69 and instant94", (dateTime69.compareTo(instant94) == 0) == dateTime69.equals(instant94));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        boolean boolean7 = dateTimeFieldType0.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withDurationAdded(readableDuration13, (int) '#');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusMillis((-1));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYear((int) (short) 100);
        java.lang.String str26 = localDateTime25.toString();
        boolean boolean27 = localDateTime15.isAfter((org.joda.time.ReadablePartial) localDateTime25);
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray30 = strSet29.toArray();
        boolean boolean31 = strSet29.isEmpty();
        java.util.Locale locale32 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray34 = strSet33.toArray();
        java.util.Locale locale35 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        boolean boolean37 = strSet33.removeAll((java.util.Collection<java.lang.String>) strSet36);
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray42 = new org.joda.time.DurationFieldType[] { durationFieldType40, durationFieldType41 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray43 = strSet39.toArray(durationFieldTypeArray42);
        boolean boolean44 = strSet33.containsAll((java.util.Collection<java.lang.String>) strSet39);
        java.lang.Object[] objArray45 = strSet39.toArray();
        boolean boolean46 = strSet29.removeAll((java.util.Collection<java.lang.String>) strSet39);
        java.util.Locale locale47 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet48 = locale47.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray49 = strSet48.toArray();
        java.util.Locale locale50 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet51 = locale50.getUnicodeLocaleAttributes();
        boolean boolean52 = strSet48.removeAll((java.util.Collection<java.lang.String>) strSet51);
        java.util.Locale locale53 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet54 = locale53.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray57 = new org.joda.time.DurationFieldType[] { durationFieldType55, durationFieldType56 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray58 = strSet54.toArray(durationFieldTypeArray57);
        boolean boolean59 = strSet48.containsAll((java.util.Collection<java.lang.String>) strSet54);
        java.util.Locale locale60 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet61 = locale60.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray62 = strSet61.toArray();
        java.util.Locale locale63 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleAttributes();
        boolean boolean65 = strSet61.removeAll((java.util.Collection<java.lang.String>) strSet64);
        java.util.Locale locale66 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType68 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType durationFieldType69 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray70 = new org.joda.time.DurationFieldType[] { durationFieldType68, durationFieldType69 };
        org.joda.time.DurationFieldType[] durationFieldTypeArray71 = strSet67.toArray(durationFieldTypeArray70);
        boolean boolean72 = strSet61.containsAll((java.util.Collection<java.lang.String>) strSet67);
        java.lang.Object[] objArray73 = strSet67.toArray();
        boolean boolean74 = strSet48.retainAll((java.util.Collection<java.lang.String>) strSet67);
        boolean boolean75 = strSet39.addAll((java.util.Collection<java.lang.String>) strSet67);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean77 = strSet67.remove((java.lang.Object) dateTimeFieldType76);
        org.joda.time.LocalDateTime.Property property78 = localDateTime15.property(dateTimeFieldType76);
        org.joda.time.ReadableDuration readableDuration79 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime15.minus(readableDuration79);
        int[] intArray82 = chronology3.get((org.joda.time.ReadablePartial) localDateTime80, (long) 27425804);
        org.joda.time.DurationField durationField83 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField83, durationField4, and durationField5", !(durationField83.compareTo(durationField4) == 0) || (Math.signum(durationField83.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType1.getDurationType();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.DurationField durationField7 = chronology5.centuries();
        boolean boolean8 = durationFieldType2.isSupported(chronology5);
        org.joda.time.DurationField durationField9 = chronology5.halfdays();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology11 = chronology5.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = chronology5.years();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((-563388203769L), chronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        int int6 = dateTimeField4.getMaximumValue(8228146884657L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusHours((int) (short) 10);
        int int18 = localDateTime15.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.minusYears((int) ' ');
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.minusHours((int) (byte) 1);
        int int23 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        java.lang.String str25 = localDateTime24.toString();
        int int26 = localDateTime24.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.minusMonths(2);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str32 = dateTimeZone30.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime38.toDateTime(readableInstant39);
        long long41 = dateTime40.getMillis();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str44 = dateTimeZone42.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now(dateTimeZone42);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = localDateTime45.getFieldType((int) (short) 0);
        boolean boolean48 = dateTime40.isSupported(dateTimeFieldType47);
        org.joda.time.DateTime dateTime49 = localDateTime28.toDateTime((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime58.toDateTime(readableInstant59);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str63 = dateTimeZone61.getShortName((long) (short) 10);
        long long65 = dateTimeZone61.convertUTCToLocal((long) ' ');
        java.lang.String str66 = dateTimeZone61.toString();
        long long68 = dateTimeZone61.previousTransition(32L);
        long long71 = dateTimeZone61.convertLocalToUTC(97L, false);
        boolean boolean72 = dateTime60.equals((java.lang.Object) false);
        boolean boolean73 = dateTime49.isEqual((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Instant instant74 = dateTime49.toInstant();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str77 = dateTimeZone75.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime78 = org.joda.time.LocalDateTime.now(dateTimeZone75);
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.millisOfDay();
        long long80 = property79.remainder();
        org.joda.time.LocalDateTime localDateTime81 = property79.roundFloorCopy();
        boolean boolean82 = instant74.equals((java.lang.Object) localDateTime81);
        int int83 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localDateTime81);
        org.joda.time.LocalDateTime.Property property84 = localDateTime81.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = property84.getFieldType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and instant74", (dateTime49.compareTo(instant74) == 0) == dateTime49.equals(instant74));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        int int8 = property7.get();
        org.joda.time.LocalDateTime localDateTime10 = property7.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.year();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        java.lang.String str14 = localDateTime13.toString();
        int int15 = localDateTime13.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusMonths(2);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime(readableInstant28);
        long long30 = dateTime29.getMillis();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = localDateTime34.getFieldType((int) (short) 0);
        boolean boolean37 = dateTime29.isSupported(dateTimeFieldType36);
        org.joda.time.DateTime dateTime38 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str41 = dateTimeZone39.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.millisOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.DateTime dateTime49 = localDateTime47.toDateTime(readableInstant48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName((long) (short) 10);
        long long54 = dateTimeZone50.convertUTCToLocal((long) ' ');
        java.lang.String str55 = dateTimeZone50.toString();
        long long57 = dateTimeZone50.previousTransition(32L);
        long long60 = dateTimeZone50.convertLocalToUTC(97L, false);
        boolean boolean61 = dateTime49.equals((java.lang.Object) false);
        boolean boolean62 = dateTime38.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Instant instant63 = dateTime38.toInstant();
        long long64 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) instant63);
        org.joda.time.DateTimeZone dateTimeZone65 = instant63.getZone();
        int int67 = dateTimeZone65.getOffsetFromLocal(1650122202621L);
        java.lang.String str68 = dateTimeZone65.getID();
        org.joda.time.DurationFieldType durationFieldType69 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology72 = localDateTime71.getChronology();
        org.joda.time.DurationField durationField73 = chronology72.hours();
        org.joda.time.DurationField durationField74 = durationFieldType69.getField(chronology72);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetMillis(1439);
        org.joda.time.Chronology chronology77 = chronology72.withZone(dateTimeZone76);
        long long81 = dateTimeZone76.convertLocalToUTC((-3808629660000L), false, 1645629391605L);
        long long83 = dateTimeZone65.getMillisKeepLocal(dateTimeZone76, 1645629699909L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and instant63", (dateTime38.compareTo(instant63) == 0) == dateTime38.equals(instant63));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.ReadableInstant readableInstant5 = null;
        long long6 = property4.getDifferenceAsLong(readableInstant5);
        int int7 = property4.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property4.roundHalfEvenCopy();
        org.joda.time.DurationField durationField9 = property4.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime10 = property4.roundHalfEvenCopy();
        java.lang.String str11 = property4.getName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = property4.getAsText(locale12);
        org.joda.time.LocalDateTime localDateTime15 = property4.addToCopy(26180486);
        org.joda.time.LocalDateTime localDateTime17 = property4.addToCopy((-52));
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readableDuration18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str24 = dateTimeZone22.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusDays(0);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.minusDays(34);
        org.joda.time.LocalDateTime.Property property35 = localDateTime30.millisOfDay();
        boolean boolean36 = localDateTime19.isBefore((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology40 = localDateTime39.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.weekyears();
        org.joda.time.DurationField durationField42 = chronology40.centuries();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology40);
        org.joda.time.DateTimeField dateTimeField44 = chronology40.halfdayOfDay();
        int int47 = dateTimeField44.getDifference(11L, 0L);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime();
        java.lang.String str49 = localDateTime48.toString();
        int int50 = localDateTime48.getCenturyOfEra();
        int int51 = dateTimeField44.getMinimumValue((org.joda.time.ReadablePartial) localDateTime48);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime48.minusMillis((-115200000));
        org.joda.time.LocalDateTime localDateTime55 = localDateTime48.withYear(22);
        org.joda.time.LocalDateTime.Property property56 = localDateTime48.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str59 = dateTimeZone57.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime60 = org.joda.time.LocalDateTime.now(dateTimeZone57);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.millisOfDay();
        org.joda.time.ReadableInstant readableInstant62 = null;
        long long63 = property61.getDifferenceAsLong(readableInstant62);
        java.util.Locale locale65 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleKeys();
        org.joda.time.LocalDateTime localDateTime67 = property61.setCopy("26153615", locale65);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusYears((-997));
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTimeField dateTimeField72 = dateTimeFieldType70.getField(chronology71);
        java.util.Locale locale74 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.lang.String str76 = dateTimeField72.getAsShortText(100, locale75);
        int int78 = dateTimeField72.getLeapAmount((long) (short) 100);
        org.joda.time.DurationField durationField79 = dateTimeField72.getRangeDurationField();
        boolean boolean80 = dateTimeField72.isLenient();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = dateTimeField72.getType();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime67.withField(dateTimeFieldType81, (int) (byte) 0);
        boolean boolean84 = localDateTime48.equals((java.lang.Object) dateTimeFieldType81);
        boolean boolean85 = localDateTime30.isBefore((org.joda.time.ReadablePartial) localDateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField79", (durationField9.compareTo(durationField79) == 0) == durationField9.equals(durationField79));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime(readableInstant9);
        long long11 = dateTime10.getMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = localDateTime15.getFieldType((int) (short) 0);
        boolean boolean18 = dateTime10.isSupported(dateTimeFieldType17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.ReadableInstant readableInstant24 = null;
        long long25 = property23.getDifferenceAsLong(readableInstant24);
        org.joda.time.DurationField durationField26 = property23.getLeapDurationField();
        java.lang.String str27 = property23.getAsString();
        org.joda.time.LocalDateTime localDateTime28 = property23.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getShortName((long) (short) 10);
        long long35 = dateTimeZone31.convertUTCToLocal((long) ' ');
        java.lang.String str36 = dateTimeZone31.toString();
        boolean boolean38 = dateTimeZone31.equals((java.lang.Object) (short) 100);
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = dateTimeZone31.getShortName((long) (-1), locale40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime43 = localDateTime30.toDateTime(dateTimeZone31);
        boolean boolean44 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Instant instant45 = dateTime43.toInstant();
        long long46 = instant45.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.weekyears();
        org.joda.time.DurationField durationField52 = chronology50.centuries();
        org.joda.time.DurationField durationField53 = chronology50.minutes();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology50);
        boolean boolean55 = dateTimeFieldType47.isSupported(chronology50);
        int int56 = instant45.get(dateTimeFieldType47);
        org.joda.time.DurationFieldType durationFieldType57 = dateTimeFieldType47.getRangeDurationType();
        java.lang.String str58 = dateTimeFieldType47.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and instant45", (dateTime43.compareTo(instant45) == 0) == dateTime43.equals(instant45));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(48);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localDateTime10.toDateTime(readableInstant11);
        long long13 = dateTime12.getMillis();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = localDateTime17.getFieldType((int) (short) 0);
        boolean boolean20 = dateTime12.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str23 = dateTimeZone21.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfDay();
        org.joda.time.ReadableInstant readableInstant26 = null;
        long long27 = property25.getDifferenceAsLong(readableInstant26);
        org.joda.time.DurationField durationField28 = property25.getLeapDurationField();
        java.lang.String str29 = property25.getAsString();
        org.joda.time.LocalDateTime localDateTime30 = property25.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str35 = dateTimeZone33.getShortName((long) (short) 10);
        long long37 = dateTimeZone33.convertUTCToLocal((long) ' ');
        java.lang.String str38 = dateTimeZone33.toString();
        boolean boolean40 = dateTimeZone33.equals((java.lang.Object) (short) 100);
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str43 = dateTimeZone33.getShortName((long) (-1), locale42);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime45 = localDateTime32.toDateTime(dateTimeZone33);
        boolean boolean46 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Instant instant47 = dateTime45.toInstant();
        int int48 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime45);
        boolean boolean49 = dateTimeZone1.isFixed();
        int int51 = dateTimeZone1.getOffset(1645629811113L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and instant47", (dateTime45.compareTo(instant47) == 0) == dateTime45.equals(instant47));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        java.lang.String str8 = localDateTime7.toString();
        int int9 = localDateTime7.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusMonths(2);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str15 = dateTimeZone13.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime(readableInstant22);
        long long24 = dateTime23.getMillis();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str27 = dateTimeZone25.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localDateTime28.getFieldType((int) (short) 0);
        boolean boolean31 = dateTime23.isSupported(dateTimeFieldType30);
        org.joda.time.DateTime dateTime32 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str35 = dateTimeZone33.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localDateTime41.toDateTime(readableInstant42);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str46 = dateTimeZone44.getShortName((long) (short) 10);
        long long48 = dateTimeZone44.convertUTCToLocal((long) ' ');
        java.lang.String str49 = dateTimeZone44.toString();
        long long51 = dateTimeZone44.previousTransition(32L);
        long long54 = dateTimeZone44.convertLocalToUTC(97L, false);
        boolean boolean55 = dateTime43.equals((java.lang.Object) false);
        boolean boolean56 = dateTime32.isEqual((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Instant instant57 = dateTime32.toInstant();
        org.joda.time.DateTime dateTime58 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.LocalDateTime.Property property59 = localDateTime3.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant57", (dateTime32.compareTo(instant57) == 0) == dateTime32.equals(instant57));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        java.lang.String str27 = localDateTime26.toString();
        int int28 = localDateTime26.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.minusMonths(2);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str34 = dateTimeZone32.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localDateTime40.toDateTime(readableInstant41);
        long long43 = dateTime42.getMillis();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str46 = dateTimeZone44.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now(dateTimeZone44);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = localDateTime47.getFieldType((int) (short) 0);
        boolean boolean50 = dateTime42.isSupported(dateTimeFieldType49);
        org.joda.time.DateTime dateTime51 = localDateTime30.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str54 = dateTimeZone52.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.millisOfDay();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime55.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.DateTime dateTime62 = localDateTime60.toDateTime(readableInstant61);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str65 = dateTimeZone63.getShortName((long) (short) 10);
        long long67 = dateTimeZone63.convertUTCToLocal((long) ' ');
        java.lang.String str68 = dateTimeZone63.toString();
        long long70 = dateTimeZone63.previousTransition(32L);
        long long73 = dateTimeZone63.convertLocalToUTC(97L, false);
        boolean boolean74 = dateTime62.equals((java.lang.Object) false);
        boolean boolean75 = dateTime51.isEqual((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Instant instant76 = dateTime51.toInstant();
        long long77 = instant76.getMillis();
        boolean boolean78 = dateTime16.isBefore((org.joda.time.ReadableInstant) instant76);
        org.joda.time.Chronology chronology79 = dateTime16.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant76", (dateTime25.compareTo(instant76) == 0) == dateTime25.equals(instant76));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.ReadableInstant readableInstant5 = null;
        long long6 = property4.getDifferenceAsLong(readableInstant5);
        org.joda.time.DurationField durationField7 = property4.getLeapDurationField();
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale8.getLanguage();
        java.lang.String str11 = locale8.toLanguageTag();
        java.lang.String str12 = property4.getAsShortText(locale8);
        org.joda.time.LocalDateTime localDateTime13 = property4.roundCeilingCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = localDateTime13.toString(dateTimeFormatter14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.plusWeeks(20);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.plusSeconds(9);
        org.joda.time.LocalDateTime.Property property23 = localDateTime19.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.withCenturyOfEra(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.property(dateTimeFieldType26);
        java.lang.String str28 = dateTimeFieldType26.getName();
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType26.getDurationType();
        boolean boolean30 = localDateTime17.isSupported(durationFieldType29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.weekyears();
        org.joda.time.DurationField durationField36 = chronology34.centuries();
        org.joda.time.DurationField durationField37 = chronology34.hours();
        boolean boolean38 = dateTimeFieldType31.isSupported(chronology34);
        org.joda.time.DateTimeField dateTimeField39 = chronology34.weekOfWeekyear();
        org.joda.time.DurationField durationField40 = chronology34.days();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime();
        java.lang.String str42 = localDateTime41.toString();
        int int43 = localDateTime41.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.minusMonths(2);
        int[] intArray47 = chronology34.get((org.joda.time.ReadablePartial) localDateTime45, 86340010L);
        boolean boolean48 = durationFieldType29.isSupported(chronology34);
        org.joda.time.DurationField durationField49 = chronology34.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField49, durationField35, and durationField36", !(durationField49.compareTo(durationField35) == 0) || (Math.signum(durationField49.compareTo(durationField36)) == Math.signum(durationField35.compareTo(durationField36))));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.era();
        int int5 = localDateTime0.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekOfWeekyear((int) (byte) 1);
        int int8 = localDateTime0.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusMillis(53);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.withMillisOfSecond(56);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        java.lang.String str17 = durationFieldType16.getName();
        java.lang.String str18 = durationFieldType16.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.weekyears();
        org.joda.time.DurationField durationField24 = chronology22.centuries();
        org.joda.time.DurationField durationField25 = chronology22.minutes();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology22);
        boolean boolean27 = dateTimeFieldType19.isSupported(chronology22);
        org.joda.time.DateTimeField dateTimeField28 = chronology22.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField29 = chronology22.dayOfWeek();
        org.joda.time.DurationField durationField30 = chronology22.millis();
        org.joda.time.DurationField durationField31 = chronology22.halfdays();
        org.joda.time.DurationField durationField32 = durationFieldType16.getField(chronology22);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime12.withFieldAdded(durationFieldType16, 93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField32", (durationField23.compareTo(durationField32) == 0) == durationField23.equals(durationField32));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.seconds();
        org.joda.time.DurationField durationField6 = chronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.DurationField durationField13 = chronology11.centuries();
        org.joda.time.DurationField durationField14 = chronology11.minutes();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology11.getZone();
        org.joda.time.Chronology chronology16 = chronology2.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = chronology16.years();
        org.joda.time.DurationField durationField18 = chronology16.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusDays(26204);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        org.joda.time.ReadableInstant readableInstant13 = null;
        long long14 = property12.getDifferenceAsLong(readableInstant13);
        org.joda.time.DurationField durationField15 = property12.getLeapDurationField();
        java.lang.String str16 = property12.getAsString();
        org.joda.time.LocalDateTime localDateTime17 = property12.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withWeekyear((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName((long) (short) 10);
        long long24 = dateTimeZone20.convertUTCToLocal((long) ' ');
        java.lang.String str25 = dateTimeZone20.toString();
        boolean boolean27 = dateTimeZone20.equals((java.lang.Object) (short) 100);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone20.getShortName((long) (-1), locale29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime32 = localDateTime19.toDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        java.lang.String str34 = localDateTime33.toString();
        int int35 = localDateTime33.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.minusMonths(2);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str41 = dateTimeZone39.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.millisOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.DateTime dateTime49 = localDateTime47.toDateTime(readableInstant48);
        long long50 = dateTime49.getMillis();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str53 = dateTimeZone51.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(dateTimeZone51);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = localDateTime54.getFieldType((int) (short) 0);
        boolean boolean57 = dateTime49.isSupported(dateTimeFieldType56);
        org.joda.time.DateTime dateTime58 = localDateTime37.toDateTime((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str61 = dateTimeZone59.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now(dateTimeZone59);
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.millisOfDay();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime62.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.DateTime dateTime69 = localDateTime67.toDateTime(readableInstant68);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str72 = dateTimeZone70.getShortName((long) (short) 10);
        long long74 = dateTimeZone70.convertUTCToLocal((long) ' ');
        java.lang.String str75 = dateTimeZone70.toString();
        long long77 = dateTimeZone70.previousTransition(32L);
        long long80 = dateTimeZone70.convertLocalToUTC(97L, false);
        boolean boolean81 = dateTime69.equals((java.lang.Object) false);
        boolean boolean82 = dateTime58.isEqual((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Instant instant83 = dateTime58.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int85 = instant83.get(dateTimeFieldType84);
        int int86 = dateTime32.get(dateTimeFieldType84);
        int int87 = property7.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime58 and instant83", (dateTime58.compareTo(instant83) == 0) == dateTime58.equals(instant83));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        java.lang.String str5 = property4.getName();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean8 = localDateTime6.isSupported(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.centuries();
        boolean boolean15 = localDateTime12.equals((java.lang.Object) durationFieldType14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = localDateTime12.getFieldTypes();
        java.lang.String str17 = localDateTime12.toString();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.plusMillis(22);
        boolean boolean20 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.plus(readableDuration21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = localDateTime19.toString(dateTimeFormatter23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.withWeekyear(26163523);
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        java.lang.String str29 = localDateTime28.toString();
        int int30 = localDateTime28.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.minusMonths(2);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str36 = dateTimeZone34.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime42.toDateTime(readableInstant43);
        long long45 = dateTime44.getMillis();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str48 = dateTimeZone46.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now(dateTimeZone46);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = localDateTime49.getFieldType((int) (short) 0);
        boolean boolean52 = dateTime44.isSupported(dateTimeFieldType51);
        org.joda.time.DateTime dateTime53 = localDateTime32.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str56 = dateTimeZone54.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now(dateTimeZone54);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.millisOfDay();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.DateTime dateTime64 = localDateTime62.toDateTime(readableInstant63);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str67 = dateTimeZone65.getShortName((long) (short) 10);
        long long69 = dateTimeZone65.convertUTCToLocal((long) ' ');
        java.lang.String str70 = dateTimeZone65.toString();
        long long72 = dateTimeZone65.previousTransition(32L);
        long long75 = dateTimeZone65.convertLocalToUTC(97L, false);
        boolean boolean76 = dateTime64.equals((java.lang.Object) false);
        boolean boolean77 = dateTime53.isEqual((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Instant instant78 = dateTime53.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int80 = instant78.get(dateTimeFieldType79);
        int int81 = dateTime27.get(dateTimeFieldType79);
        java.lang.String str82 = dateTimeFieldType79.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime53 and instant78", (dateTime53.compareTo(instant78) == 0) == dateTime53.equals(instant78));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        java.lang.String str1 = localDateTime0.toString();
        int int2 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMonths(2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        long long17 = dateTime16.getMillis();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime21.getFieldType((int) (short) 0);
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.plusHours((int) ' ');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (short) 10);
        long long41 = dateTimeZone37.convertUTCToLocal((long) ' ');
        java.lang.String str42 = dateTimeZone37.toString();
        long long44 = dateTimeZone37.previousTransition(32L);
        long long47 = dateTimeZone37.convertLocalToUTC(97L, false);
        boolean boolean48 = dateTime36.equals((java.lang.Object) false);
        boolean boolean49 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant50 = dateTime25.toInstant();
        java.util.Locale locale51 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet53 = locale51.getUnicodeLocaleAttributes();
        boolean boolean54 = instant50.equals((java.lang.Object) locale51);
        org.joda.time.DateTimeZone dateTimeZone55 = instant50.getZone();
        java.lang.String str57 = dateTimeZone55.getName(1645629445427L);
        boolean boolean59 = dateTimeZone55.equals((java.lang.Object) 59100000L);
        long long61 = dateTimeZone55.nextTransition(283996800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant50", (dateTime25.compareTo(instant50) == 0) == dateTime25.equals(instant50));
    }
}

