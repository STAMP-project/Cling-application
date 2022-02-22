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
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        java.lang.String str21 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.monthOfYear();
        org.joda.time.Chronology chronology26 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField27 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField5, and durationField6", !(durationField27.compareTo(durationField5) == 0) || (Math.signum(durationField27.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = zonedChronology12.weekyears();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DurationField durationField23 = zonedChronology12.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField22", (durationField21.compareTo(durationField22) == 0) == durationField21.equals(durationField22));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField15 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        int int23 = localDateTime20.compareTo((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime20.toDateTime(readableInstant24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        int int30 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        boolean boolean32 = localDateTime27.isEqual((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusWeeks(0);
        int int37 = localDateTime31.compareTo((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime.Property property39 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundHalfCeilingCopy();
        int[] intArray42 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime40, (long) 2814846);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology12.weekyear();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField46 = zonedChronology12.minutes();
        org.joda.time.Chronology chronology47 = zonedChronology12.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField46", (durationField6.compareTo(durationField46) == 0) == durationField6.equals(durationField46));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.year();
        org.joda.time.DurationField durationField22 = zonedChronology12.hours();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.yearOfCentury();
        org.joda.time.DurationField durationField26 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField27 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField26", (durationField6.compareTo(durationField26) == 0) == durationField6.equals(durationField26));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        boolean boolean15 = zonedChronology13.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField16 = zonedChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField18 = zonedChronology13.centuries();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(1645454828186L, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.millisOfSecond();
        org.joda.time.DurationField durationField21 = zonedChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField6, and durationField7", !(durationField21.compareTo(durationField6) == 0) || (Math.signum(durationField21.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.DurationField durationField16 = zonedChronology12.seconds();
        org.joda.time.DurationField durationField17 = zonedChronology12.hours();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.centuryOfEra();
        long long23 = zonedChronology12.add(1645454816905L, (long) (byte) -1, 888);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology36.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology42 = zonedChronology36.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology36.dayOfMonth();
        org.joda.time.Chronology chronology44 = zonedChronology36.withUTC();
        org.joda.time.DurationField durationField45 = zonedChronology36.seconds();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone48 = zonedChronology36.getZone();
        org.joda.time.Chronology chronology49 = zonedChronology12.withZone(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField45", (durationField16.compareTo(durationField45) == 0) == durationField16.equals(durationField45));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.Chronology chronology21 = zonedChronology13.withUTC();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.Chronology chronology25 = zonedChronology13.withZone(dateTimeZone24);
        boolean boolean26 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks(0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        org.joda.time.DurationField durationField33 = chronology31.minutes();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str38 = dateTimeZone36.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology39 = org.joda.time.chrono.ZonedChronology.getInstance(chronology31, dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology39.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean44 = dateTimeZone42.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology45 = zonedChronology39.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology39.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology39.year();
        java.lang.String str48 = zonedChronology39.toString();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology39.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology39.secondOfDay();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology39.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.yearOfEra();
        int int55 = property54.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime56 = property54.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        int int61 = localDateTime58.compareTo((org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.DateTime dateTime63 = localDateTime58.toDateTime(readableInstant62);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(dateTimeZone64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.yearOfEra();
        int int67 = property66.getMinimumValue();
        boolean boolean68 = dateTime63.equals((java.lang.Object) int67);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int70 = dateTime63.get(dateTimeFieldType69);
        long long71 = property54.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTimeZone dateTimeZone72 = dateTime63.getZone();
        org.joda.time.Chronology chronology73 = zonedChronology39.withZone(dateTimeZone72);
        org.joda.time.Chronology chronology74 = zonedChronology13.withZone(dateTimeZone72);
        org.joda.time.DateTimeField dateTimeField75 = zonedChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField76 = zonedChronology13.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        long long80 = zonedChronology13.add(readablePeriod77, 4495664053L, 67657570);
        org.joda.time.DateTimeField dateTimeField81 = zonedChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField82 = zonedChronology13.days();
        org.joda.time.DateTimeField dateTimeField83 = zonedChronology13.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField82", (durationField6.compareTo(durationField82) == 0) == durationField6.equals(durationField82));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField14 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField18 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField18", (durationField6.compareTo(durationField18) == 0) == durationField6.equals(durationField18));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        boolean boolean24 = zonedChronology12.equals((java.lang.Object) "2022-02-22T00:46:43.291+10:00");
        org.joda.time.DateTimeZone dateTimeZone25 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField26 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField27 = zonedChronology12.days();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField27", (durationField5.compareTo(durationField27) == 0) == durationField5.equals(durationField27));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.year();
        org.joda.time.DurationField durationField19 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField19", (durationField6.compareTo(durationField19) == 0) == durationField6.equals(durationField19));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.dayOfMonth();
        int int18 = dateTimeField17.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        int int23 = localDateTime20.compareTo((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        int int28 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        boolean boolean30 = localDateTime25.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        int int35 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime29);
        int int37 = localDateTime20.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property38 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime20.withYear(248);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology44 = null;
        boolean boolean45 = dateTimeFieldType43.isSupported(chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusWeeks(0);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType43.getField(chronology50);
        org.joda.time.DurationField durationField52 = durationFieldType42.getField(chronology50);
        org.joda.time.DurationField durationField53 = chronology50.weeks();
        org.joda.time.DateTimeField dateTimeField54 = chronology50.clockhourOfDay();
        java.util.Locale.Builder builder56 = new java.util.Locale.Builder();
        java.util.Locale locale57 = builder56.build();
        java.lang.String str58 = dateTimeField54.getAsShortText((long) 2814846, locale57);
        java.util.Locale locale59 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet60 = locale59.getExtensionKeys();
        java.util.Iterator<java.lang.Character> charItor61 = charSet60.iterator();
        java.util.Locale locale62 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet63 = locale62.getExtensionKeys();
        java.lang.Object[] objArray64 = charSet63.toArray();
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet66 = locale65.getExtensionKeys();
        boolean boolean67 = charSet63.retainAll((java.util.Collection<java.lang.Character>) charSet66);
        boolean boolean68 = charSet60.containsAll((java.util.Collection<java.lang.Character>) charSet63);
        java.util.Locale.Builder builder69 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder71 = builder69.addUnicodeLocaleAttribute("eras");
        java.util.Locale locale72 = builder71.build();
        boolean boolean73 = charSet60.contains((java.lang.Object) locale72);
        java.lang.String str74 = locale57.getDisplayLanguage(locale72);
        java.lang.String str75 = dateTimeField17.getAsText((org.joda.time.ReadablePartial) localDateTime40, locale72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField53", (durationField13.compareTo(durationField53) == 0) == durationField13.equals(durationField53));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField22 = zonedChronology12.months();
        org.joda.time.DurationField durationField23 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.minuteOfHour();
        org.joda.time.DurationField durationField25 = zonedChronology12.centuries();
        org.joda.time.DurationFieldType durationFieldType26 = durationField25.getType();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks(0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        org.joda.time.DurationField durationField33 = chronology31.minutes();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str38 = dateTimeZone36.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology39 = org.joda.time.chrono.ZonedChronology.getInstance(chronology31, dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology39.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean44 = dateTimeZone42.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology45 = zonedChronology39.withZone(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str50 = dateTimeZone48.getShortName((long) 10);
        java.lang.String str51 = dateTimeZone48.getID();
        org.joda.time.Chronology chronology52 = zonedChronology39.withZone(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int56 = dateTimeZone54.getOffsetFromLocal((long) 100);
        org.joda.time.Chronology chronology57 = zonedChronology39.withZone(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology39.minuteOfHour();
        org.joda.time.DurationField durationField59 = zonedChronology39.halfdays();
        org.joda.time.DurationField durationField60 = durationFieldType26.getField((org.joda.time.Chronology) zonedChronology39);
        org.joda.time.DurationField durationField61 = zonedChronology39.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField60", (durationField23.compareTo(durationField60) == 0) == durationField23.equals(durationField60));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfEra();
        long long3 = property2.remainder();
        int int4 = property2.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime5 = property2.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology7 = null;
        boolean boolean8 = dateTimeFieldType6.isSupported(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusWeeks(0);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType6.getField(chronology13);
        java.lang.String str15 = dateTimeField14.getName();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks(0);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        java.util.Locale locale22 = java.util.Locale.JAPANESE;
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.lang.String str24 = locale22.getISO3Country();
        java.lang.String str25 = dateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDateTime19, 2, locale22);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime19.minusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withMinuteOfHour((int) '#');
        java.util.Date date30 = localDateTime27.toDate();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.plusMillis(305);
        boolean boolean33 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime5.minusYears(2);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        int int41 = localDateTime38.compareTo((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localDateTime38.toDateTime(readableInstant42);
        org.joda.time.DateTime dateTime44 = localDateTime35.toDateTime(readableInstant42);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTime44.getZone();
        java.lang.String str46 = dateTime44.toString();
        java.util.Locale locale47 = java.util.Locale.ITALY;
        java.util.Locale locale48 = locale47.stripExtensions();
        java.lang.String str49 = locale47.getScript();
        java.util.Locale locale50 = java.util.Locale.FRANCE;
        java.lang.String str51 = locale47.getDisplayScript(locale50);
        java.lang.String str52 = locale47.getISO3Language();
        java.lang.String str53 = locale47.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet54 = locale47.getExtensionKeys();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        int int59 = localDateTime56.compareTo((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.DateTime dateTime61 = localDateTime56.toDateTime(readableInstant60);
        boolean boolean63 = dateTime61.equals((java.lang.Object) 'a');
        org.joda.time.Instant instant64 = dateTime61.toInstant();
        boolean boolean65 = charSet54.equals((java.lang.Object) dateTime61);
        boolean boolean66 = dateTime44.isAfter((org.joda.time.ReadableInstant) dateTime61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and instant64", (dateTime43.compareTo(instant64) == 0) == dateTime43.equals(instant64));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.Chronology chronology21 = zonedChronology13.withUTC();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.Chronology chronology25 = zonedChronology13.withZone(dateTimeZone24);
        boolean boolean26 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks(0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        org.joda.time.DurationField durationField33 = chronology31.minutes();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str38 = dateTimeZone36.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology39 = org.joda.time.chrono.ZonedChronology.getInstance(chronology31, dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology39.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean44 = dateTimeZone42.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology45 = zonedChronology39.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology39.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology39.year();
        java.lang.String str48 = zonedChronology39.toString();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology39.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology39.secondOfDay();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology39.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.yearOfEra();
        int int55 = property54.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime56 = property54.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        int int61 = localDateTime58.compareTo((org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.DateTime dateTime63 = localDateTime58.toDateTime(readableInstant62);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(dateTimeZone64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.yearOfEra();
        int int67 = property66.getMinimumValue();
        boolean boolean68 = dateTime63.equals((java.lang.Object) int67);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int70 = dateTime63.get(dateTimeFieldType69);
        long long71 = property54.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTimeZone dateTimeZone72 = dateTime63.getZone();
        org.joda.time.Chronology chronology73 = zonedChronology39.withZone(dateTimeZone72);
        org.joda.time.Chronology chronology74 = zonedChronology13.withZone(dateTimeZone72);
        org.joda.time.DateTimeField dateTimeField75 = zonedChronology13.centuryOfEra();
        org.joda.time.DurationField durationField76 = zonedChronology13.days();
        org.joda.time.DateTimeField dateTimeField77 = zonedChronology13.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField76", (durationField6.compareTo(durationField76) == 0) == durationField6.equals(durationField76));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.year();
        org.joda.time.DurationField durationField22 = zonedChronology12.hours();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.yearOfCentury();
        org.joda.time.DurationField durationField26 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField27 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology12.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField27", (durationField6.compareTo(durationField27) == 0) == durationField6.equals(durationField27));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        int int5 = localDateTime3.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfYear();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withDurationAdded(readableDuration7, 42);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMinimumValue();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.era();
        java.util.Locale locale14 = new java.util.Locale("763");
        int int15 = property12.getMaximumTextLength(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property12.roundHalfFloorCopy();
        org.joda.time.DurationField durationField17 = property12.getRangeDurationField();
        org.joda.time.DurationField durationField18 = property12.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks(0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.days();
        org.joda.time.DurationField durationField26 = chronology24.minutes();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str31 = dateTimeZone29.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology24, dateTimeZone29);
        org.joda.time.DurationField durationField33 = zonedChronology32.weeks();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology32.year();
        org.joda.time.DurationField durationField35 = zonedChronology32.weeks();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology32.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology32.weekyear();
        org.joda.time.Chronology chronology38 = zonedChronology32.withUTC();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(4495702101L, chronology38);
        int int40 = localDateTime39.getYearOfEra();
        int int41 = property12.compareTo((org.joda.time.ReadablePartial) localDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField25", Math.signum(durationField18.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField18)));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime(readableInstant5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        int int10 = property9.getMinimumValue();
        boolean boolean11 = dateTime6.equals((java.lang.Object) int10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int13 = dateTime6.get(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks(0);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DurationField durationField20 = chronology18.minutes();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str25 = dateTimeZone23.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology26 = org.joda.time.chrono.ZonedChronology.getInstance(chronology18, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology26.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean31 = dateTimeZone29.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology32 = zonedChronology26.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology26.minuteOfHour();
        org.joda.time.DurationField durationField34 = zonedChronology26.seconds();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology26.millisOfDay();
        boolean boolean36 = dateTimeFieldType12.isSupported((org.joda.time.Chronology) zonedChronology26);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology26.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology26.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone39 = zonedChronology26.getZone();
        org.joda.time.DurationField durationField40 = zonedChronology26.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField40, durationField19, and durationField20", !(durationField40.compareTo(durationField19) == 0) || (Math.signum(durationField40.compareTo(durationField20)) == Math.signum(durationField19.compareTo(durationField20))));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.Chronology chronology20 = zonedChronology12.withUTC();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        long long24 = property23.remainder();
        int int25 = property23.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime26 = property23.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime27 = property23.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusWeeks(0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.days();
        org.joda.time.DurationField durationField34 = chronology32.minutes();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str39 = dateTimeZone37.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology40 = org.joda.time.chrono.ZonedChronology.getInstance(chronology32, dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology40.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean45 = dateTimeZone43.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology46 = zonedChronology40.withZone(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology40.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology40.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfSecond();
        org.joda.time.LocalDateTime.Property property55 = localDateTime53.weekOfWeekyear();
        int int56 = property55.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime58 = property55.setCopy(4);
        int int59 = localDateTime51.compareTo((org.joda.time.ReadablePartial) localDateTime58);
        int[] intArray61 = zonedChronology40.get((org.joda.time.ReadablePartial) localDateTime51, 4495601000L);
        zonedChronology12.validate((org.joda.time.ReadablePartial) localDateTime27, intArray61);
        long long66 = zonedChronology12.add((long) 30, 2807403L, 553);
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField68 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField68, durationField5, and durationField6", !(durationField68.compareTo(durationField5) == 0) || (Math.signum(durationField68.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField22 = zonedChronology12.seconds();
        org.joda.time.DateTimeZone dateTimeZone23 = zonedChronology12.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.yearOfEra();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.monthOfYear();
        long long29 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime25, (long) 2022);
        org.joda.time.LocalDateTime.Property property30 = localDateTime25.weekOfWeekyear();
        org.joda.time.DateTime dateTime31 = localDateTime25.toDateTime();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.minusDays(0);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.yearOfEra();
        long long37 = property36.remainder();
        int int38 = property36.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime39 = property36.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology41 = null;
        boolean boolean42 = dateTimeFieldType40.isSupported(chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusWeeks(0);
        org.joda.time.Chronology chronology47 = localDateTime46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType40.getField(chronology47);
        java.lang.String str49 = dateTimeField48.getName();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusWeeks(0);
        org.joda.time.Chronology chronology54 = localDateTime53.getChronology();
        java.util.Locale locale56 = java.util.Locale.JAPANESE;
        java.lang.String str57 = locale56.getDisplayLanguage();
        java.lang.String str58 = locale56.getISO3Country();
        java.lang.String str59 = dateTimeField48.getAsShortText((org.joda.time.ReadablePartial) localDateTime53, 2, locale56);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime53.minusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.withMinuteOfHour((int) '#');
        java.util.Date date64 = localDateTime61.toDate();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime61.plusMillis(305);
        boolean boolean67 = localDateTime39.isBefore((org.joda.time.ReadablePartial) localDateTime66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime66.millisOfSecond();
        org.joda.time.DurationField durationField69 = property68.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime71 = property68.addWrapFieldToCopy(387);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime25.withFields((org.joda.time.ReadablePartial) localDateTime71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField69", (durationField22.compareTo(durationField69) == 0) == durationField22.equals(durationField69));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField22 = zonedChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.clockhourOfDay();
        long long28 = zonedChronology12.add(1645454809835L, (long) 4, (-38091));
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.millisOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology12.weekyears();
        org.joda.time.DurationField durationField31 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField5, and durationField6", !(durationField31.compareTo(durationField5) == 0) || (Math.signum(durationField31.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks(0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str33 = dateTimeZone31.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology34 = org.joda.time.chrono.ZonedChronology.getInstance(chronology26, dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology34.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean39 = dateTimeZone37.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology40 = zonedChronology34.withZone(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology34.dayOfMonth();
        org.joda.time.Chronology chronology42 = zonedChronology34.withUTC();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.Chronology chronology46 = zonedChronology34.withZone(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusWeeks(0);
        org.joda.time.Chronology chronology51 = localDateTime50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.days();
        org.joda.time.DurationField durationField53 = chronology51.minutes();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str58 = dateTimeZone56.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology59 = org.joda.time.chrono.ZonedChronology.getInstance(chronology51, dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology59.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean64 = dateTimeZone62.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology65 = zonedChronology59.withZone(dateTimeZone62);
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology59.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology59.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str72 = dateTimeZone70.getShortName((long) 10);
        java.lang.String str73 = dateTimeZone70.getID();
        long long76 = dateTimeZone70.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.Chronology chronology77 = zonedChronology59.withZone(dateTimeZone70);
        org.joda.time.DateTimeZone dateTimeZone78 = zonedChronology59.getZone();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean82 = dateTimeZone80.isStandardOffset((long) (short) 10);
        long long85 = dateTimeZone80.convertLocalToUTC((long) 1439, true);
        long long87 = dateTimeZone78.getMillisKeepLocal(dateTimeZone80, (-1184727463199900L));
        org.joda.time.Chronology chronology88 = zonedChronology34.withZone(dateTimeZone78);
        java.lang.String str90 = dateTimeZone78.getNameKey(1666622848718L);
        org.joda.time.Chronology chronology91 = zonedChronology12.withZone(dateTimeZone78);
        org.joda.time.DurationField durationField92 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField92, durationField5, and durationField6", !(durationField92.compareTo(durationField5) == 0) || (Math.signum(durationField92.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = zonedChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.secondOfMinute();
        org.joda.time.DurationField durationField25 = zonedChronology12.weekyears();
        org.joda.time.DurationField durationField26 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField5, and durationField6", !(durationField26.compareTo(durationField5) == 0) || (Math.signum(durationField26.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.year();
        org.joda.time.DurationField durationField22 = zonedChronology12.hours();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        int int26 = localDateTime25.getYearOfEra();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = localDateTime25.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.plusSeconds((-1));
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusMillis(366);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.plusMonths(52);
        int[] intArray36 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime31, (long) (-1));
        org.joda.time.DurationField durationField37 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField38 = zonedChronology12.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField37", (durationField6.compareTo(durationField37) == 0) == durationField6.equals(durationField37));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField23 = zonedChronology12.millis();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField25 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField5, and durationField6", !(durationField25.compareTo(durationField5) == 0) || (Math.signum(durationField25.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField15 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField16 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        int int21 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        int int28 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        boolean boolean30 = localDateTime25.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        int int35 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime29);
        int[] intArray38 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime36, 70001L);
        java.lang.String str39 = zonedChronology12.toString();
        org.joda.time.DurationField durationField40 = zonedChronology12.months();
        org.joda.time.DurationField durationField41 = zonedChronology12.days();
        org.joda.time.DateTimeZone dateTimeZone42 = zonedChronology12.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField41", (durationField5.compareTo(durationField41) == 0) == durationField5.equals(durationField41));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.plusMonths((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusWeeks(0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.days();
        org.joda.time.DurationField durationField17 = chronology15.minutes();
        org.joda.time.DurationFieldType durationFieldType18 = durationField17.getType();
        boolean boolean19 = localDateTime3.isSupported(durationFieldType18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime3.withYearOfCentury(75);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology24 = null;
        boolean boolean25 = dateTimeFieldType23.isSupported(chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType23.getField(chronology30);
        org.joda.time.DurationField durationField32 = durationFieldType22.getField(chronology30);
        boolean boolean33 = localDateTime3.isSupported(durationFieldType22);
        java.lang.String str34 = durationFieldType22.getName();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusWeeks(0);
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.days();
        org.joda.time.DurationField durationField41 = chronology39.minutes();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str46 = dateTimeZone44.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology47 = org.joda.time.chrono.ZonedChronology.getInstance(chronology39, dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology47.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean52 = dateTimeZone50.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology53 = zonedChronology47.withZone(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology47.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology47.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology47.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology47.dayOfMonth();
        org.joda.time.DurationField durationField58 = zonedChronology47.days();
        boolean boolean59 = durationFieldType22.isSupported((org.joda.time.Chronology) zonedChronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField58", (durationField16.compareTo(durationField58) == 0) == durationField16.equals(durationField58));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.weekyear();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.hourOfHalfday();
        org.joda.time.DurationField durationField20 = zonedChronology12.days();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        int int25 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        int int26 = localDateTime24.getYear();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.minusDays(8110);
        org.joda.time.LocalDateTime.Property property29 = localDateTime24.era();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean33 = dateTimeZone31.isStandardOffset((long) (short) 10);
        long long36 = dateTimeZone31.convertLocalToUTC((long) 1439, true);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.yearOfEra();
        int int40 = property39.getMinimumValue();
        java.lang.String str41 = property39.getAsText();
        org.joda.time.LocalDateTime localDateTime42 = property39.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusMinutes(100);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.plusMonths((int) 'x');
        org.joda.time.DateTimeField[] dateTimeFieldArray47 = localDateTime46.getFields();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        int int52 = localDateTime49.compareTo((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.DateTime dateTime54 = localDateTime49.toDateTime(readableInstant53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        int int59 = localDateTime56.compareTo((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime();
        boolean boolean61 = localDateTime56.isEqual((org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(dateTimeZone62);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.minusWeeks(0);
        int int66 = localDateTime60.compareTo((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime49.withFields((org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.LocalDateTime.Property property68 = localDateTime49.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.DateTime dateTime72 = localDateTime49.toDateTime(dateTimeZone71);
        org.joda.time.DateTime dateTime73 = localDateTime46.toDateTime((org.joda.time.ReadableInstant) dateTime72);
        int int74 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime dateTime75 = localDateTime24.toDateTime((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime24.plusWeeks(120);
        int[] intArray79 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime77, 4495732263L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField20", (durationField5.compareTo(durationField20) == 0) == durationField5.equals(durationField20));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        boolean boolean6 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(0);
        int int11 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int14 = localDateTime8.indexOf(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDateTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks(0);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.days();
        org.joda.time.DurationField durationField22 = chronology20.minutes();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str27 = dateTimeZone25.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology20, dateTimeZone25);
        boolean boolean30 = zonedChronology28.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField31 = zonedChronology28.centuries();
        org.joda.time.DurationField durationField32 = zonedChronology28.months();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        int int37 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localDateTime34.toDateTime(readableInstant38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        int int44 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime();
        boolean boolean46 = localDateTime41.isEqual((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusWeeks(0);
        int int51 = localDateTime45.compareTo((org.joda.time.ReadablePartial) localDateTime48);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime34.withFields((org.joda.time.ReadablePartial) localDateTime45);
        int[] intArray54 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime52, 70001L);
        int int55 = localDateTime52.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.yearOfEra();
        int int57 = localDateTime52.getCenturyOfEra();
        org.joda.time.DateTime dateTime58 = localDateTime52.toDateTime();
        org.joda.time.DateTime dateTime59 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Chronology chronology60 = dateTime58.getChronology();
        org.joda.time.Instant instant61 = dateTime58.toInstant();
        org.joda.time.Instant instant62 = dateTime58.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant61", (dateTime39.compareTo(instant61) == 0) == dateTime39.equals(instant61));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.Object[] objArray2 = charSet1.toArray();
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        boolean boolean5 = charSet1.retainAll((java.util.Collection<java.lang.Character>) charSet4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale6.getDisplayCountry(locale7);
        boolean boolean9 = locale6.hasExtensions();
        boolean boolean10 = charSet4.remove((java.lang.Object) boolean9);
        boolean boolean11 = charSet4.isEmpty();
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.Object[] objArray14 = charSet13.toArray();
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet16 = locale15.getExtensionKeys();
        boolean boolean17 = charSet13.retainAll((java.util.Collection<java.lang.Character>) charSet16);
        charSet13.clear();
        boolean boolean19 = charSet4.retainAll((java.util.Collection<java.lang.Character>) charSet13);
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.Object[] objArray22 = charSet21.toArray();
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        boolean boolean25 = charSet21.retainAll((java.util.Collection<java.lang.Character>) charSet24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        int int30 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime27.toDateTime(readableInstant31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.minusWeeks((int) (short) 1);
        boolean boolean35 = charSet21.remove((java.lang.Object) localDateTime34);
        java.util.stream.Stream<java.lang.Character> charStream36 = charSet21.stream();
        boolean boolean37 = charSet13.removeAll((java.util.Collection<java.lang.Character>) charSet21);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks(0);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.days();
        org.joda.time.DurationField durationField44 = chronology42.minutes();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str49 = dateTimeZone47.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology50 = org.joda.time.chrono.ZonedChronology.getInstance(chronology42, dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology50.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean55 = dateTimeZone53.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology56 = zonedChronology50.withZone(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology50.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology50.year();
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology50.year();
        org.joda.time.DurationField durationField60 = zonedChronology50.hours();
        org.joda.time.DurationField durationField61 = zonedChronology50.centuries();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(dateTimeZone62);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.minusWeeks(0);
        org.joda.time.Chronology chronology66 = localDateTime65.getChronology();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.withYear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(dateTimeZone69);
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.yearOfEra();
        org.joda.time.LocalDateTime.Property property72 = localDateTime70.monthOfYear();
        int int73 = localDateTime65.compareTo((org.joda.time.ReadablePartial) localDateTime70);
        long long75 = zonedChronology50.set((org.joda.time.ReadablePartial) localDateTime65, (long) (byte) 10);
        org.joda.time.DateTimeField dateTimeField76 = zonedChronology50.year();
        boolean boolean77 = charSet13.contains((java.lang.Object) dateTimeField76);
        org.joda.time.DurationField durationField78 = dateTimeField76.getLeapDurationField();
        boolean boolean80 = dateTimeField76.isLeap((long) 292275048);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField78", (durationField43.compareTo(durationField78) == 0) == durationField43.equals(durationField78));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.monthOfYear();
        int int11 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology13 = null;
        boolean boolean14 = dateTimeFieldType12.isSupported(chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusWeeks(0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType12.getRangeDurationType();
        boolean boolean22 = localDateTime8.isSupported(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusWeeks(0);
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.days();
        org.joda.time.DurationField durationField29 = chronology27.minutes();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str34 = dateTimeZone32.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology35 = org.joda.time.chrono.ZonedChronology.getInstance(chronology27, dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology35.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean40 = dateTimeZone38.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology41 = zonedChronology35.withZone(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology35.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology35.year();
        java.lang.String str44 = zonedChronology35.toString();
        boolean boolean45 = dateTimeFieldType12.isSupported((org.joda.time.Chronology) zonedChronology35);
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology35.dayOfWeek();
        org.joda.time.DurationField durationField47 = zonedChronology35.minutes();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology35.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField47", (durationField29.compareTo(durationField47) == 0) == durationField29.equals(durationField47));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField22 = zonedChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.clockhourOfDay();
        long long28 = zonedChronology12.add(1645454809835L, (long) 4, (-38091));
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.secondOfMinute();
        org.joda.time.DurationField durationField31 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology12.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField31", (durationField6.compareTo(durationField31) == 0) == durationField6.equals(durationField31));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.weekyearOfCentury();
        org.joda.time.Chronology chronology24 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField25 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField25", (durationField6.compareTo(durationField25) == 0) == durationField6.equals(durationField25));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str23 = dateTimeZone21.getShortName((long) 10);
        java.lang.String str24 = dateTimeZone21.getID();
        org.joda.time.Chronology chronology25 = zonedChronology12.withZone(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int29 = dateTimeZone27.getOffsetFromLocal((long) 100);
        org.joda.time.Chronology chronology30 = zonedChronology12.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology12.minuteOfHour();
        org.joda.time.DurationField durationField32 = zonedChronology12.halfdays();
        org.joda.time.DurationField durationField33 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField34 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField35 = zonedChronology12.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField34", (durationField6.compareTo(durationField34) == 0) == durationField6.equals(durationField34));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.weekOfWeekyear();
        org.joda.time.Chronology chronology19 = localDateTime16.getChronology();
        int int20 = localDateTime16.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property21 = localDateTime16.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int23 = localDateTime16.indexOf(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone33);
        boolean boolean38 = zonedChronology36.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField39 = zonedChronology36.centuries();
        org.joda.time.DurationField durationField40 = zonedChronology36.months();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        int int45 = localDateTime42.compareTo((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.DateTime dateTime47 = localDateTime42.toDateTime(readableInstant46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        int int52 = localDateTime49.compareTo((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime();
        boolean boolean54 = localDateTime49.isEqual((org.joda.time.ReadablePartial) localDateTime53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusWeeks(0);
        int int59 = localDateTime53.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime42.withFields((org.joda.time.ReadablePartial) localDateTime53);
        int[] intArray62 = zonedChronology36.get((org.joda.time.ReadablePartial) localDateTime60, 70001L);
        zonedChronology12.validate((org.joda.time.ReadablePartial) localDateTime16, intArray62);
        org.joda.time.DurationField durationField64 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology12.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField40 and durationField64", (durationField40.compareTo(durationField64) == 0) == durationField40.equals(durationField64));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        int int22 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime21);
        int int23 = localDateTime21.getYear();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.minusSeconds(3);
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.util.Locale.setDefault(locale26);
        java.util.Locale.setDefault(locale26);
        java.lang.String str29 = dateTimeField17.getAsShortText((org.joda.time.ReadablePartial) localDateTime21, locale26);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = dateTimeField17.getType();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.days();
        org.joda.time.DurationField durationField37 = chronology35.minutes();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str42 = dateTimeZone40.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology43 = org.joda.time.chrono.ZonedChronology.getInstance(chronology35, dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology43.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean48 = dateTimeZone46.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology49 = zonedChronology43.withZone(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology43.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology43.dayOfYear();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology43.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology43.halfdayOfDay();
        org.joda.time.DurationField durationField54 = zonedChronology43.halfdays();
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology43.year();
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology43.minuteOfHour();
        org.joda.time.Chronology chronology57 = zonedChronology43.withUTC();
        boolean boolean58 = dateTimeFieldType30.isSupported((org.joda.time.Chronology) zonedChronology43);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minusWeeks(0);
        org.joda.time.Chronology chronology63 = localDateTime62.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.days();
        org.joda.time.DurationField durationField65 = chronology63.minutes();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str70 = dateTimeZone68.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology71 = org.joda.time.chrono.ZonedChronology.getInstance(chronology63, dateTimeZone68);
        org.joda.time.DateTimeField dateTimeField72 = zonedChronology71.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean76 = dateTimeZone74.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology77 = zonedChronology71.withZone(dateTimeZone74);
        org.joda.time.DateTimeField dateTimeField78 = zonedChronology71.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField79 = zonedChronology71.weekOfWeekyear();
        org.joda.time.Chronology chronology80 = zonedChronology71.withUTC();
        org.joda.time.DurationField durationField81 = zonedChronology71.halfdays();
        org.joda.time.DateTimeField dateTimeField82 = zonedChronology71.dayOfYear();
        org.joda.time.DurationField durationField83 = zonedChronology71.seconds();
        org.joda.time.DateTimeZone dateTimeZone84 = zonedChronology71.getZone();
        org.joda.time.DateTimeField dateTimeField85 = zonedChronology71.millisOfSecond();
        boolean boolean86 = dateTimeFieldType30.isSupported((org.joda.time.Chronology) zonedChronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField54 and durationField81", (durationField54.compareTo(durationField81) == 0) == durationField54.equals(durationField81));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField15 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField16 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone17 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField18 = zonedChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.hourOfDay();
        org.joda.time.DurationField durationField21 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField25 = zonedChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField25", (durationField21.compareTo(durationField25) == 0) == durationField21.equals(durationField25));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.year();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = zonedChronology12.add(readablePeriod24, 0L, 292278993);
        org.joda.time.DurationField durationField28 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField28", (durationField5.compareTo(durationField28) == 0) == durationField5.equals(durationField28));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.year();
        org.joda.time.DurationField durationField22 = zonedChronology12.hours();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.yearOfEra();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.era();
        org.joda.time.LocalDateTime localDateTime27 = property26.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusDays(2795574);
        int[] intArray31 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime29, (long) 305);
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField33 = zonedChronology12.millis();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology12.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone37);
        int int39 = localDateTime38.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusWeeks(0);
        org.joda.time.Chronology chronology44 = localDateTime43.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.days();
        org.joda.time.DurationField durationField46 = chronology44.minutes();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str51 = dateTimeZone49.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology52 = org.joda.time.chrono.ZonedChronology.getInstance(chronology44, dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology52.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean57 = dateTimeZone55.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology58 = zonedChronology52.withZone(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology52.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology52.year();
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology52.year();
        org.joda.time.DurationField durationField62 = zonedChronology52.hours();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology52.year();
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology52);
        boolean boolean65 = localDateTime38.isEqual((org.joda.time.ReadablePartial) localDateTime64);
        java.util.Locale locale68 = new java.util.Locale("2022-02-25T18:47:50.437+100:00", "2022-02-22T00:48:28.248");
        java.util.Locale.setDefault(locale68);
        java.lang.String str70 = dateTimeField34.getAsText((org.joda.time.ReadablePartial) localDateTime38, locale68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField62", (durationField22.compareTo(durationField62) == 0) == durationField22.equals(durationField62));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.weekOfWeekyear();
        int int28 = property27.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime30 = property27.setCopy(4);
        int int31 = localDateTime23.compareTo((org.joda.time.ReadablePartial) localDateTime30);
        int[] intArray33 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime23, 4495601000L);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        int int38 = localDateTime35.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        int int39 = localDateTime35.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusWeeks(0);
        org.joda.time.Chronology chronology44 = localDateTime43.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.days();
        org.joda.time.DurationField durationField46 = chronology44.minutes();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str51 = dateTimeZone49.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology52 = org.joda.time.chrono.ZonedChronology.getInstance(chronology44, dateTimeZone49);
        boolean boolean54 = zonedChronology52.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField55 = zonedChronology52.centuries();
        org.joda.time.DurationField durationField56 = zonedChronology52.months();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        int int61 = localDateTime58.compareTo((org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.DateTime dateTime63 = localDateTime58.toDateTime(readableInstant62);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(dateTimeZone64);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(dateTimeZone66);
        int int68 = localDateTime65.compareTo((org.joda.time.ReadablePartial) localDateTime67);
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime();
        boolean boolean70 = localDateTime65.isEqual((org.joda.time.ReadablePartial) localDateTime69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(dateTimeZone71);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.minusWeeks(0);
        int int75 = localDateTime69.compareTo((org.joda.time.ReadablePartial) localDateTime72);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime58.withFields((org.joda.time.ReadablePartial) localDateTime69);
        int[] intArray78 = zonedChronology52.get((org.joda.time.ReadablePartial) localDateTime76, 70001L);
        zonedChronology12.validate((org.joda.time.ReadablePartial) localDateTime35, intArray78);
        org.joda.time.DateTimeField dateTimeField80 = zonedChronology12.millisOfDay();
        org.joda.time.DurationField durationField81 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField82 = zonedChronology12.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField56 and durationField81", (durationField56.compareTo(durationField81) == 0) == durationField56.equals(durationField81));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = zonedChronology12.add(readablePeriod21, (long) (byte) 10, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField26 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField5, and durationField6", !(durationField26.compareTo(durationField5) == 0) || (Math.signum(durationField26.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = zonedChronology12.getZone();
        java.lang.String str23 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology25 = zonedChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusWeeks(0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.days();
        org.joda.time.DurationField durationField34 = chronology32.minutes();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str39 = dateTimeZone37.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology40 = org.joda.time.chrono.ZonedChronology.getInstance(chronology32, dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology40.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean45 = dateTimeZone43.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology46 = zonedChronology40.withZone(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology40.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology40.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.yearOfEra();
        org.joda.time.LocalDateTime.Property property53 = localDateTime51.monthOfYear();
        java.util.Locale locale54 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleKeys();
        java.util.Locale locale56 = locale54.stripExtensions();
        java.lang.String str57 = dateTimeField49.getAsText((org.joda.time.ReadablePartial) localDateTime51, locale56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime51.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.withDayOfYear(93);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray62 = localDateTime61.getFieldTypes();
        int[] intArray64 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime61, 4495793240L);
        org.joda.time.DurationField durationField65 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField66 = zonedChronology12.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField65", (durationField6.compareTo(durationField65) == 0) == durationField6.equals(durationField65));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime(readableInstant5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusWeeks((int) (short) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localDateTime8.toString(dateTimeFormatter9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean12 = localDateTime8.isSupported(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusWeeks(0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DurationField durationField19 = chronology17.minutes();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str24 = dateTimeZone22.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology25 = org.joda.time.chrono.ZonedChronology.getInstance(chronology17, dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology25.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean30 = dateTimeZone28.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology31 = zonedChronology25.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology25.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology25.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology25.weekyear();
        org.joda.time.DateTimeZone dateTimeZone35 = zonedChronology25.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusWeeks(0);
        org.joda.time.Chronology chronology40 = localDateTime39.getChronology();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime39.withYear(22);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minusMinutes((-292275047));
        long long50 = zonedChronology25.set((org.joda.time.ReadablePartial) localDateTime48, (long) 2022);
        boolean boolean51 = dateTimeFieldType11.isSupported((org.joda.time.Chronology) zonedChronology25);
        org.joda.time.DurationFieldType durationFieldType52 = dateTimeFieldType11.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.minusWeeks(0);
        org.joda.time.Chronology chronology58 = localDateTime57.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.days();
        org.joda.time.DurationField durationField60 = chronology58.minutes();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str65 = dateTimeZone63.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology66 = org.joda.time.chrono.ZonedChronology.getInstance(chronology58, dateTimeZone63);
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology66.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean71 = dateTimeZone69.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology72 = zonedChronology66.withZone(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField73 = zonedChronology66.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField74 = zonedChronology66.year();
        org.joda.time.DateTimeField dateTimeField75 = zonedChronology66.year();
        org.joda.time.DurationField durationField76 = zonedChronology66.weekyears();
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) 8, (org.joda.time.Chronology) zonedChronology66);
        org.joda.time.DurationField durationField78 = zonedChronology66.minutes();
        boolean boolean79 = durationFieldType52.isSupported((org.joda.time.Chronology) zonedChronology66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField78", (durationField19.compareTo(durationField78) == 0) == durationField19.equals(durationField78));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str25 = dateTimeZone23.getShortName((long) 10);
        java.lang.String str26 = dateTimeZone23.getID();
        long long29 = dateTimeZone23.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.Chronology chronology30 = zonedChronology12.withZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.days();
        org.joda.time.DurationField durationField37 = chronology35.minutes();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str42 = dateTimeZone40.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology43 = org.joda.time.chrono.ZonedChronology.getInstance(chronology35, dateTimeZone40);
        boolean boolean45 = zonedChronology43.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField46 = zonedChronology43.centuries();
        org.joda.time.DurationField durationField47 = zonedChronology43.months();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology43.era();
        java.lang.String str49 = zonedChronology43.toString();
        boolean boolean50 = dateTimeZone23.equals((java.lang.Object) str49);
        java.lang.String str52 = dateTimeZone23.getShortName((long) 28);
        boolean boolean53 = dateTimeZone23.isFixed();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.minusWeeks(0);
        org.joda.time.Chronology chronology58 = localDateTime57.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.days();
        org.joda.time.DurationField durationField60 = chronology58.minutes();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str65 = dateTimeZone63.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology66 = org.joda.time.chrono.ZonedChronology.getInstance(chronology58, dateTimeZone63);
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology66.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean71 = dateTimeZone69.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology72 = zonedChronology66.withZone(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField73 = zonedChronology66.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField74 = zonedChronology66.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField75 = zonedChronology66.secondOfDay();
        org.joda.time.DurationField durationField76 = zonedChronology66.minutes();
        long long79 = durationField76.getMillis(2833328, 241819603200542L);
        boolean boolean80 = dateTimeZone23.equals((java.lang.Object) 241819603200542L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField76", (durationField6.compareTo(durationField76) == 0) == durationField6.equals(durationField76));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.Object[] objArray2 = charSet1.toArray();
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        boolean boolean5 = charSet1.retainAll((java.util.Collection<java.lang.Character>) charSet4);
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.lang.Object[] objArray8 = charSet7.toArray();
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        boolean boolean11 = charSet7.retainAll((java.util.Collection<java.lang.Character>) charSet10);
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.lang.String str14 = locale12.getDisplayCountry(locale13);
        boolean boolean15 = locale12.hasExtensions();
        boolean boolean16 = charSet10.remove((java.lang.Object) boolean15);
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet18 = locale17.getExtensionKeys();
        java.util.Iterator<java.lang.Character> charItor19 = charSet18.iterator();
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.Object[] objArray22 = charSet21.toArray();
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        boolean boolean25 = charSet21.retainAll((java.util.Collection<java.lang.Character>) charSet24);
        boolean boolean26 = charSet18.containsAll((java.util.Collection<java.lang.Character>) charSet21);
        java.util.stream.Stream<java.lang.Character> charStream27 = charSet21.stream();
        java.util.stream.Stream<java.lang.Character> charStream28 = charSet21.stream();
        boolean boolean29 = charSet10.containsAll((java.util.Collection<java.lang.Character>) charSet21);
        boolean boolean30 = charSet1.equals((java.lang.Object) boolean29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.days();
        org.joda.time.DurationField durationField37 = chronology35.minutes();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str42 = dateTimeZone40.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology43 = org.joda.time.chrono.ZonedChronology.getInstance(chronology35, dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology43.monthOfYear();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology43.weekOfWeekyear();
        boolean boolean46 = charSet1.remove((java.lang.Object) zonedChronology43);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology43.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology43.secondOfMinute();
        org.joda.time.DurationField durationField49 = zonedChronology43.minutes();
        org.joda.time.DurationField durationField50 = zonedChronology43.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField37 and durationField49", (durationField37.compareTo(durationField49) == 0) == durationField37.equals(durationField49));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField24 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField5, and durationField6", !(durationField24.compareTo(durationField5) == 0) || (Math.signum(durationField24.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField15 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField16 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        int int21 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        int int28 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        boolean boolean30 = localDateTime25.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        int int35 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime29);
        int[] intArray38 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime36, 70001L);
        int int39 = localDateTime36.getCenturyOfEra();
        int int40 = localDateTime36.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology43 = null;
        boolean boolean44 = dateTimeFieldType42.isSupported(chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minusWeeks(0);
        org.joda.time.Chronology chronology49 = localDateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType42.getField(chronology49);
        long long56 = chronology49.getDateTimeMillis(100L, (int) (byte) 0, (int) (short) 1, 10, (int) (short) 1);
        org.joda.time.DurationField durationField57 = chronology49.minutes();
        boolean boolean58 = dateTimeFieldType41.isSupported(chronology49);
        int int59 = localDateTime36.indexOf(dateTimeFieldType41);
        org.joda.time.DurationFieldType durationFieldType60 = dateTimeFieldType41.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(dateTimeZone61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.minusWeeks(0);
        org.joda.time.Chronology chronology65 = localDateTime64.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.days();
        org.joda.time.DurationField durationField67 = chronology65.minutes();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str72 = dateTimeZone70.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology73 = org.joda.time.chrono.ZonedChronology.getInstance(chronology65, dateTimeZone70);
        org.joda.time.DateTimeField dateTimeField74 = zonedChronology73.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean78 = dateTimeZone76.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology79 = zonedChronology73.withZone(dateTimeZone76);
        org.joda.time.DateTimeField dateTimeField80 = zonedChronology73.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField81 = zonedChronology73.dayOfYear();
        org.joda.time.DateTimeField dateTimeField82 = zonedChronology73.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField83 = zonedChronology73.halfdayOfDay();
        org.joda.time.DurationField durationField84 = zonedChronology73.halfdays();
        org.joda.time.DateTimeField dateTimeField85 = zonedChronology73.year();
        org.joda.time.DateTimeField dateTimeField86 = zonedChronology73.minuteOfHour();
        org.joda.time.DurationField durationField87 = durationFieldType60.getField((org.joda.time.Chronology) zonedChronology73);
        java.lang.String str88 = durationFieldType60.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField87", (durationField5.compareTo(durationField87) == 0) == durationField5.equals(durationField87));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.dayOfMonth();
        org.joda.time.DurationField durationField23 = zonedChronology12.days();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField23", (durationField5.compareTo(durationField23) == 0) == durationField5.equals(durationField23));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.hourOfDay();
        org.joda.time.DurationField durationField16 = zonedChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone17 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField18 = zonedChronology12.halfdays();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.secondOfMinute();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.year();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.plus(readablePeriod22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.minusDays(6);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str30 = dateTimeZone28.getShortName((long) 10);
        java.lang.String str31 = dateTimeZone28.getID();
        long long34 = dateTimeZone28.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.DateTime dateTime35 = localDateTime19.toDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks(0);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.days();
        org.joda.time.DurationField durationField44 = chronology42.minutes();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str49 = dateTimeZone47.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology50 = org.joda.time.chrono.ZonedChronology.getInstance(chronology42, dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology50.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean55 = dateTimeZone53.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology56 = zonedChronology50.withZone(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology50.dayOfMonth();
        java.util.Locale locale59 = java.util.Locale.GERMAN;
        java.util.Locale locale60 = java.util.Locale.GERMAN;
        java.lang.String str61 = locale59.getDisplayCountry(locale60);
        java.lang.String str62 = dateTimeField57.getAsText(0L, locale59);
        java.util.Locale.setDefault(locale59);
        java.util.Set<java.lang.String> strSet64 = locale59.getUnicodeLocaleAttributes();
        java.util.Locale locale65 = java.util.Locale.GERMAN;
        java.util.Locale locale66 = java.util.Locale.GERMAN;
        java.lang.String str67 = locale65.getDisplayCountry(locale66);
        java.util.Locale locale68 = java.util.Locale.JAPANESE;
        java.lang.String str69 = locale68.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet70 = locale68.getUnicodeLocaleKeys();
        java.lang.String str71 = locale65.getDisplayCountry(locale68);
        java.lang.String str72 = locale68.getDisplayScript();
        java.lang.String str73 = locale59.getDisplayCountry(locale68);
        java.lang.String str74 = locale68.getISO3Language();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(dateTimeZone75);
        org.joda.time.LocalDateTime.Property property77 = localDateTime76.yearOfEra();
        long long78 = property77.remainder();
        org.joda.time.DurationField durationField79 = property77.getDurationField();
        java.util.Locale locale80 = java.util.Locale.CANADA;
        java.util.Locale locale81 = java.util.Locale.KOREAN;
        java.lang.String str82 = locale80.getDisplayCountry(locale81);
        boolean boolean83 = locale81.hasExtensions();
        int int84 = property77.getMaximumTextLength(locale81);
        java.lang.String str85 = locale68.getDisplayName(locale81);
        java.lang.String str86 = dateTimeZone28.getName((long) 462, locale81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField79", (durationField16.compareTo(durationField79) == 0) == durationField16.equals(durationField79));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfEra();
        long long3 = property2.remainder();
        int int4 = property2.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime5 = property2.withMaximumValue();
        boolean boolean6 = property2.isLeap();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.setCopy("902");
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        int int13 = property12.getMinimumValue();
        java.lang.String str14 = property12.getAsText();
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = property12.getAsText(locale15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology18 = null;
        boolean boolean19 = dateTimeFieldType17.isSupported(chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks(0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType17.getField(chronology24);
        java.lang.String str26 = dateTimeField25.getName();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks(0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        java.util.Locale locale33 = java.util.Locale.JAPANESE;
        java.lang.String str34 = locale33.getDisplayLanguage();
        java.lang.String str35 = locale33.getISO3Country();
        java.lang.String str36 = dateTimeField25.getAsShortText((org.joda.time.ReadablePartial) localDateTime30, 2, locale33);
        org.joda.time.LocalDateTime.Property property37 = localDateTime30.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        int int42 = localDateTime39.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime39.toDateTime(readableInstant43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.yearOfEra();
        int int48 = property47.getMinimumValue();
        boolean boolean49 = dateTime44.equals((java.lang.Object) int48);
        long long50 = property37.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime44);
        int int51 = property12.getDifference((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology52 = dateTime44.getChronology();
        java.lang.String str53 = dateTime44.toString();
        org.joda.time.DateTime dateTime54 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology55 = dateTime44.getChronology();
        org.joda.time.Instant instant56 = dateTime44.toInstant();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusWeeks(0);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(dateTimeZone61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.minusWeeks(0);
        org.joda.time.Chronology chronology65 = localDateTime64.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.days();
        org.joda.time.DurationField durationField67 = chronology65.minutes();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str72 = dateTimeZone70.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology73 = org.joda.time.chrono.ZonedChronology.getInstance(chronology65, dateTimeZone70);
        org.joda.time.DateTimeField dateTimeField74 = zonedChronology73.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean78 = dateTimeZone76.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology79 = zonedChronology73.withZone(dateTimeZone76);
        org.joda.time.DateTimeField dateTimeField80 = zonedChronology73.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField81 = zonedChronology73.weekOfWeekyear();
        org.joda.time.Chronology chronology82 = zonedChronology73.withUTC();
        org.joda.time.DurationField durationField83 = zonedChronology73.seconds();
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime60, (org.joda.time.Chronology) zonedChronology73);
        int int85 = localDateTime60.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property86 = localDateTime60.hourOfDay();
        org.joda.time.LocalDateTime localDateTime87 = property86.roundCeilingCopy();
        boolean boolean88 = instant56.equals((java.lang.Object) property86);
        org.joda.time.LocalDateTime localDateTime89 = property86.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant56", (dateTime44.compareTo(instant56) == 0) == dateTime44.equals(instant56));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField23 = zonedChronology12.days();
        org.joda.time.DurationField durationField24 = zonedChronology12.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField23", (durationField5.compareTo(durationField23) == 0) == durationField5.equals(durationField23));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfYear();
        org.joda.time.DurationField durationField21 = zonedChronology12.years();
        long long25 = zonedChronology12.add(27424246L, (long) 2911280, 3019929);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str37 = dateTimeZone35.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology30, dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology38.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean43 = dateTimeZone41.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology44 = zonedChronology38.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology38.year();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology38.year();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology38.millisOfDay();
        org.joda.time.Chronology chronology49 = zonedChronology38.withUTC();
        org.joda.time.DurationField durationField50 = chronology49.years();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        int int55 = localDateTime52.compareTo((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime();
        boolean boolean57 = localDateTime52.isEqual((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.minusWeeks(0);
        int int62 = localDateTime56.compareTo((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.LocalDateTime.Property property63 = localDateTime59.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int65 = localDateTime59.indexOf(dateTimeFieldType64);
        org.joda.time.Chronology chronology66 = localDateTime59.getChronology();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime59.withMillisOfSecond(721);
        int[] intArray70 = chronology49.get((org.joda.time.ReadablePartial) localDateTime59, 33L);
        org.joda.time.LocalDateTime.Property property71 = localDateTime59.dayOfWeek();
        org.joda.time.Chronology chronology72 = localDateTime59.getChronology();
        long long74 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime59, (-124062789600000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField50", (durationField21.compareTo(durationField50) == 0) == durationField21.equals(durationField50));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = zonedChronology12.weekyears();
        org.joda.time.DurationField durationField18 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField5, and durationField6", !(durationField18.compareTo(durationField5) == 0) || (Math.signum(durationField18.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField22 = zonedChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.dayOfYear();
        org.joda.time.DurationField durationField24 = zonedChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str37 = dateTimeZone35.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology30, dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology38.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean43 = dateTimeZone41.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology44 = zonedChronology38.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology38.dayOfYear();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology38.dayOfMonth();
        org.joda.time.Chronology chronology48 = zonedChronology38.withUTC();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minusWeeks(0);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.days();
        org.joda.time.DurationField durationField55 = chronology53.minutes();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str60 = dateTimeZone58.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology61 = org.joda.time.chrono.ZonedChronology.getInstance(chronology53, dateTimeZone58);
        boolean boolean63 = zonedChronology61.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField64 = zonedChronology61.centuries();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology61.dayOfYear();
        java.util.Locale locale66 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet67 = locale66.getExtensionKeys();
        java.lang.Object[] objArray68 = charSet67.toArray();
        java.util.Locale locale69 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet70 = locale69.getExtensionKeys();
        boolean boolean71 = charSet67.retainAll((java.util.Collection<java.lang.Character>) charSet70);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(dateTimeZone72);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(dateTimeZone74);
        int int76 = localDateTime73.compareTo((org.joda.time.ReadablePartial) localDateTime75);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.DateTime dateTime78 = localDateTime73.toDateTime(readableInstant77);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime73.minusWeeks((int) (short) 1);
        boolean boolean81 = charSet67.remove((java.lang.Object) localDateTime80);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime80.plusMillis(2795574);
        java.util.Locale locale84 = java.util.Locale.CANADA;
        java.util.Locale locale85 = java.util.Locale.KOREAN;
        java.lang.String str86 = locale84.getDisplayCountry(locale85);
        java.lang.String str87 = dateTimeField65.getAsText((org.joda.time.ReadablePartial) localDateTime80, locale84);
        int[] intArray89 = zonedChronology38.get((org.joda.time.ReadablePartial) localDateTime80, (long) 2811632);
        int[] intArray91 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime80, 0L);
        org.joda.time.DateTimeField dateTimeField92 = zonedChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField93 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField93, durationField5, and durationField6", !(durationField93.compareTo(durationField5) == 0) || (Math.signum(durationField93.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.Chronology chronology20 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField21 = zonedChronology12.seconds();
        org.joda.time.DurationField durationField22 = zonedChronology12.months();
        org.joda.time.Chronology chronology23 = zonedChronology12.withUTC();
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet25 = locale24.getExtensionKeys();
        java.lang.Object[] objArray26 = charSet25.toArray();
        java.util.Locale locale27 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        boolean boolean29 = charSet25.retainAll((java.util.Collection<java.lang.Character>) charSet28);
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        boolean boolean33 = locale30.hasExtensions();
        boolean boolean34 = charSet28.remove((java.lang.Object) boolean33);
        boolean boolean35 = charSet28.isEmpty();
        boolean boolean37 = charSet28.contains((java.lang.Object) "2");
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks(0);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.days();
        org.joda.time.DurationField durationField44 = chronology42.minutes();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str49 = dateTimeZone47.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology50 = org.joda.time.chrono.ZonedChronology.getInstance(chronology42, dateTimeZone47);
        org.joda.time.DurationField durationField51 = zonedChronology50.weeks();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology50.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology50.dayOfWeek();
        org.joda.time.DurationField durationField54 = zonedChronology50.years();
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology50.clockhourOfHalfday();
        boolean boolean56 = charSet28.contains((java.lang.Object) zonedChronology50);
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology50.hourOfDay();
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology50.millisOfSecond();
        org.joda.time.DurationField durationField59 = zonedChronology50.seconds();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology50.era();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(dateTimeZone62);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.minusWeeks(0);
        org.joda.time.Chronology chronology66 = localDateTime65.getChronology();
        org.joda.time.DurationField durationField67 = chronology66.days();
        org.joda.time.DurationField durationField68 = chronology66.minutes();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str73 = dateTimeZone71.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology74 = org.joda.time.chrono.ZonedChronology.getInstance(chronology66, dateTimeZone71);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(36000012L, dateTimeZone71);
        long long77 = dateTimeZone71.previousTransition(2834567L);
        org.joda.time.Chronology chronology78 = zonedChronology50.withZone(dateTimeZone71);
        org.joda.time.Chronology chronology79 = chronology23.withZone(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField59", (durationField21.compareTo(durationField59) == 0) == durationField21.equals(durationField59));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.DurationField durationField16 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.minuteOfHour();
        org.joda.time.DurationField durationField18 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfWeek();
        org.joda.time.DurationField durationField21 = zonedChronology12.hours();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks(0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str33 = dateTimeZone31.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology34 = org.joda.time.chrono.ZonedChronology.getInstance(chronology26, dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology34.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean39 = dateTimeZone37.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology40 = zonedChronology34.withZone(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology34.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology34.year();
        java.lang.String str43 = zonedChronology34.toString();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology34.dayOfMonth();
        org.joda.time.DurationField durationField45 = zonedChronology34.weekyears();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology34.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology34.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusWeeks(0);
        org.joda.time.Chronology chronology52 = localDateTime51.getChronology();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str61 = dateTimeZone59.getShortName((long) 10);
        org.joda.time.DateTime dateTime62 = localDateTime56.toDateTime(dateTimeZone59);
        org.joda.time.chrono.ZonedChronology zonedChronology63 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology34, dateTimeZone59);
        org.joda.time.Chronology chronology64 = zonedChronology12.withZone(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField45", (durationField16.compareTo(durationField45) == 0) == durationField16.equals(durationField45));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology13.year();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology13.year();
        org.joda.time.DurationField durationField23 = zonedChronology13.weekyears();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 8, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology13.minuteOfHour();
        long long30 = zonedChronology13.add((long) 2987572, 4495824801L, 50);
        org.joda.time.DurationField durationField31 = zonedChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField6, and durationField7", !(durationField31.compareTo(durationField6) == 0) || (Math.signum(durationField31.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField22 = zonedChronology12.months();
        org.joda.time.DurationField durationField23 = zonedChronology12.weekyears();
        org.joda.time.DurationField durationField24 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        int int32 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localDateTime29.toDateTime(readableInstant33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.yearOfEra();
        int int38 = property37.getMinimumValue();
        boolean boolean39 = dateTime34.equals((java.lang.Object) int38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int41 = dateTime34.get(dateTimeFieldType40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusWeeks(0);
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.days();
        org.joda.time.DurationField durationField48 = chronology46.minutes();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str53 = dateTimeZone51.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology54 = org.joda.time.chrono.ZonedChronology.getInstance(chronology46, dateTimeZone51);
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology54.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean59 = dateTimeZone57.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology60 = zonedChronology54.withZone(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology54.minuteOfHour();
        org.joda.time.DurationField durationField62 = zonedChronology54.seconds();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology54.millisOfDay();
        boolean boolean64 = dateTimeFieldType40.isSupported((org.joda.time.Chronology) zonedChronology54);
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology54.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime66 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology54);
        long long68 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime66, 4495715066L);
        org.joda.time.DateTimeField dateTimeField69 = zonedChronology12.dayOfWeek();
        org.joda.time.DurationField durationField70 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology12.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField70", (durationField23.compareTo(durationField70) == 0) == durationField23.equals(durationField70));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.minuteOfHour();
        org.joda.time.DurationField durationField21 = zonedChronology13.seconds();
        org.joda.time.DurationField durationField22 = zonedChronology13.seconds();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType0.getField((org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology13.weekyear();
        org.joda.time.DurationField durationField25 = zonedChronology13.days();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology13.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField25", (durationField6.compareTo(durationField25) == 0) == durationField6.equals(durationField25));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str23 = dateTimeZone21.getShortName((long) 10);
        java.lang.String str24 = dateTimeZone21.getID();
        org.joda.time.Chronology chronology25 = zonedChronology12.withZone(dateTimeZone21);
        long long29 = zonedChronology12.add((long) (byte) -1, (-35998661L), 100);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minusWeeks(0);
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.days();
        org.joda.time.DurationField durationField36 = chronology34.minutes();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str41 = dateTimeZone39.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology42 = org.joda.time.chrono.ZonedChronology.getInstance(chronology34, dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean47 = dateTimeZone45.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology48 = zonedChronology42.withZone(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str53 = dateTimeZone51.getShortName((long) 10);
        java.lang.String str54 = dateTimeZone51.getID();
        org.joda.time.Chronology chronology55 = zonedChronology42.withZone(dateTimeZone51);
        org.joda.time.chrono.ZonedChronology zonedChronology56 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone51);
        org.joda.time.Chronology chronology57 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField58 = zonedChronology12.years();
        org.joda.time.DurationField durationField59 = zonedChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology12.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField58 and durationField59", (durationField58.compareTo(durationField59) == 0) == durationField58.equals(durationField59));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property1.addToCopy((long) (short) 0);
        int int4 = property1.get();
        org.joda.time.LocalDateTime localDateTime5 = property1.roundHalfCeilingCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = localDateTime5.toString(dateTimeFormatter6);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDateTime5.getFieldType(3);
        java.lang.String str10 = dateTimeFieldType9.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusWeeks(0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.days();
        org.joda.time.DurationField durationField17 = chronology15.minutes();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str22 = dateTimeZone20.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology15, dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology23.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean28 = dateTimeZone26.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology29 = zonedChronology23.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology23.dayOfMonth();
        org.joda.time.Chronology chronology31 = zonedChronology23.withUTC();
        org.joda.time.DurationField durationField32 = zonedChronology23.seconds();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology23);
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology23.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology23.millisOfDay();
        boolean boolean37 = dateTimeFieldType9.isSupported((org.joda.time.Chronology) zonedChronology23);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks(0);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.days();
        org.joda.time.DurationField durationField44 = chronology42.minutes();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str49 = dateTimeZone47.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology50 = org.joda.time.chrono.ZonedChronology.getInstance(chronology42, dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology50.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean55 = dateTimeZone53.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology56 = zonedChronology50.withZone(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology50.dayOfMonth();
        org.joda.time.DurationField durationField58 = zonedChronology50.seconds();
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology50.hourOfDay();
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType9.getField((org.joda.time.Chronology) zonedChronology50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField32 and durationField58", (durationField32.compareTo(durationField58) == 0) == durationField32.equals(durationField58));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.year();
        java.lang.String str24 = zonedChronology12.toString();
        org.joda.time.DurationField durationField25 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField5, and durationField6", !(durationField25.compareTo(durationField5) == 0) || (Math.signum(durationField25.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField15 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField15", (durationField5.compareTo(durationField15) == 0) == durationField5.equals(durationField15));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property1.addToCopy((long) (short) 0);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.centuries();
        boolean boolean5 = property1.equals((java.lang.Object) durationFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusWeeks(0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DurationField durationField12 = chronology10.minutes();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str17 = dateTimeZone15.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology18 = org.joda.time.chrono.ZonedChronology.getInstance(chronology10, dateTimeZone15);
        boolean boolean20 = zonedChronology18.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField21 = zonedChronology18.centuries();
        org.joda.time.DurationField durationField22 = zonedChronology18.months();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        int int27 = localDateTime24.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime24.toDateTime(readableInstant28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        int int34 = localDateTime31.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        boolean boolean36 = localDateTime31.isEqual((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusWeeks(0);
        int int41 = localDateTime35.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime24.withFields((org.joda.time.ReadablePartial) localDateTime35);
        int[] intArray44 = zonedChronology18.get((org.joda.time.ReadablePartial) localDateTime42, 70001L);
        int int45 = localDateTime42.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property46 = localDateTime42.yearOfEra();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.minusSeconds(0);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minusWeeks(0);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        int int54 = localDateTime52.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.dayOfYear();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime52.plusMillis(2801202);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime48.withFields((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.LocalDateTime.Property property59 = localDateTime52.dayOfWeek();
        org.joda.time.LocalDateTime.Property property60 = localDateTime52.dayOfWeek();
        org.joda.time.DateTime dateTime61 = localDateTime52.toDateTime();
        long long62 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Instant instant63 = dateTime61.toInstant();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(dateTimeZone64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.minusWeeks(0);
        org.joda.time.Chronology chronology68 = localDateTime67.getChronology();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime67.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime67.withYear(22);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.minusMinutes((-292275047));
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime(dateTimeZone77);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(dateTimeZone79);
        int int81 = localDateTime78.compareTo((org.joda.time.ReadablePartial) localDateTime80);
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime();
        boolean boolean83 = localDateTime78.isEqual((org.joda.time.ReadablePartial) localDateTime82);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.LocalDateTime localDateTime85 = new org.joda.time.LocalDateTime(dateTimeZone84);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.minusWeeks(0);
        int int88 = localDateTime82.compareTo((org.joda.time.ReadablePartial) localDateTime85);
        org.joda.time.LocalDateTime.Property property89 = localDateTime85.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType90 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int91 = localDateTime85.indexOf(dateTimeFieldType90);
        java.lang.String str92 = dateTimeFieldType90.toString();
        int int93 = localDateTime76.indexOf(dateTimeFieldType90);
        org.joda.time.DurationFieldType durationFieldType94 = dateTimeFieldType90.getRangeDurationType();
        int int95 = dateTime61.get(dateTimeFieldType90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant63", (dateTime29.compareTo(instant63) == 0) == dateTime29.equals(instant63));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField22 = zonedChronology12.seconds();
        org.joda.time.DateTimeZone dateTimeZone23 = zonedChronology12.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.yearOfEra();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.monthOfYear();
        long long29 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime25, (long) 2022);
        org.joda.time.LocalDateTime.Property property30 = localDateTime25.weekOfWeekyear();
        org.joda.time.DateTime dateTime31 = localDateTime25.toDateTime();
        long long32 = dateTime31.getMillis();
        org.joda.time.Chronology chronology33 = dateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.weekyearOfCentury();
        org.joda.time.DurationField durationField35 = chronology33.centuries();
        org.joda.time.DurationField durationField36 = chronology33.days();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField36", (durationField5.compareTo(durationField36) == 0) == durationField5.equals(durationField36));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.minuteOfDay();
        org.joda.time.Chronology chronology26 = zonedChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField28 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField29 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField28", (durationField6.compareTo(durationField28) == 0) == durationField6.equals(durationField28));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        boolean boolean2 = dateTimeFieldType0.isSupported(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType0.getField(chronology7);
        java.lang.String str9 = dateTimeField8.getName();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks(0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale16.getISO3Country();
        java.lang.String str19 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDateTime13, 2, locale16);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.minusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMinuteOfHour((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType24.getDurationType();
        boolean boolean26 = localDateTime23.isSupported(dateTimeFieldType24);
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType24.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusWeeks(0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.days();
        org.joda.time.DurationField durationField34 = chronology32.minutes();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str39 = dateTimeZone37.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology40 = org.joda.time.chrono.ZonedChronology.getInstance(chronology32, dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology40.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean45 = dateTimeZone43.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology46 = zonedChronology40.withZone(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology40.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology40.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology40.halfdayOfDay();
        org.joda.time.DurationField durationField51 = zonedChronology40.halfdays();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology40.year();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology40.minuteOfHour();
        org.joda.time.Chronology chronology54 = zonedChronology40.withUTC();
        boolean boolean55 = durationFieldType27.isSupported((org.joda.time.Chronology) zonedChronology40);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minusWeeks(0);
        org.joda.time.Chronology chronology60 = localDateTime59.getChronology();
        org.joda.time.DurationField durationField61 = chronology60.days();
        org.joda.time.DurationField durationField62 = chronology60.minutes();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str67 = dateTimeZone65.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology68 = org.joda.time.chrono.ZonedChronology.getInstance(chronology60, dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField69 = zonedChronology68.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean73 = dateTimeZone71.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology74 = zonedChronology68.withZone(dateTimeZone71);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str79 = dateTimeZone77.getShortName((long) 10);
        java.lang.String str80 = dateTimeZone77.getID();
        org.joda.time.Chronology chronology81 = zonedChronology68.withZone(dateTimeZone77);
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int85 = dateTimeZone83.getOffsetFromLocal((long) 100);
        org.joda.time.Chronology chronology86 = zonedChronology68.withZone(dateTimeZone83);
        org.joda.time.DateTimeField dateTimeField87 = zonedChronology68.minuteOfHour();
        org.joda.time.DurationField durationField88 = zonedChronology68.halfdays();
        org.joda.time.DurationField durationField89 = zonedChronology68.weeks();
        org.joda.time.DurationField durationField90 = zonedChronology68.minutes();
        org.joda.time.DurationField durationField91 = durationFieldType27.getField((org.joda.time.Chronology) zonedChronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField34 and durationField90", (durationField34.compareTo(durationField90) == 0) == durationField34.equals(durationField90));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfMonth();
        org.joda.time.DurationField durationField21 = zonedChronology12.years();
        org.joda.time.DurationField durationField22 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.era();
        org.joda.time.DurationField durationField24 = zonedChronology12.hours();
        org.joda.time.DurationField durationField25 = zonedChronology12.seconds();
        org.joda.time.DurationField durationField26 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField26", (durationField5.compareTo(durationField26) == 0) == durationField5.equals(durationField26));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        boolean boolean6 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(0);
        int int11 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int14 = localDateTime8.indexOf(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDateTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks(0);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.days();
        org.joda.time.DurationField durationField22 = chronology20.minutes();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str27 = dateTimeZone25.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology20, dateTimeZone25);
        boolean boolean30 = zonedChronology28.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField31 = zonedChronology28.centuries();
        org.joda.time.DurationField durationField32 = zonedChronology28.months();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        int int37 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localDateTime34.toDateTime(readableInstant38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        int int44 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime();
        boolean boolean46 = localDateTime41.isEqual((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusWeeks(0);
        int int51 = localDateTime45.compareTo((org.joda.time.ReadablePartial) localDateTime48);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime34.withFields((org.joda.time.ReadablePartial) localDateTime45);
        int[] intArray54 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime52, 70001L);
        int int55 = localDateTime52.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.yearOfEra();
        int int57 = localDateTime52.getCenturyOfEra();
        org.joda.time.DateTime dateTime58 = localDateTime52.toDateTime();
        org.joda.time.DateTime dateTime59 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean61 = dateTime59.isSupported(dateTimeFieldType60);
        org.joda.time.Instant instant62 = dateTime59.toInstant();
        org.joda.time.Instant instant63 = dateTime59.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant62", (dateTime39.compareTo(instant62) == 0) == dateTime39.equals(instant62));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str25 = dateTimeZone23.getShortName((long) 10);
        java.lang.String str26 = dateTimeZone23.getID();
        long long29 = dateTimeZone23.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.Chronology chronology30 = zonedChronology12.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField31 = chronology30.minutes();
        org.joda.time.DurationField durationField32 = chronology30.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField31", (durationField6.compareTo(durationField31) == 0) == durationField6.equals(durationField31));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.withYear(22);
        org.joda.time.LocalDateTime.Property property11 = localDateTime3.dayOfYear();
        int int12 = localDateTime3.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.eras();
        java.lang.String str14 = durationFieldType13.toString();
        java.lang.String str15 = durationFieldType13.toString();
        boolean boolean16 = localDateTime3.isSupported(durationFieldType13);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks(0);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.days();
        org.joda.time.DurationField durationField23 = chronology21.minutes();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str28 = dateTimeZone26.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology29 = org.joda.time.chrono.ZonedChronology.getInstance(chronology21, dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology29.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean34 = dateTimeZone32.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology35 = zonedChronology29.withZone(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology29.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology29.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        long long41 = zonedChronology29.add(readablePeriod38, (long) (byte) 10, (int) (short) -1);
        org.joda.time.DurationField durationField42 = zonedChronology29.centuries();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology29.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology29.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology29.year();
        org.joda.time.DurationField durationField48 = zonedChronology29.halfdays();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology29.monthOfYear();
        org.joda.time.DurationField durationField50 = zonedChronology29.centuries();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology29.centuryOfEra();
        org.joda.time.DurationField durationField52 = durationFieldType13.getField((org.joda.time.Chronology) zonedChronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField52, durationField22, and durationField23", !(durationField52.compareTo(durationField22) == 0) || (Math.signum(durationField52.compareTo(durationField23)) == Math.signum(durationField22.compareTo(durationField23))));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.Chronology chronology23 = zonedChronology12.withUTC();
        java.lang.String str24 = zonedChronology12.toString();
        org.joda.time.DurationField durationField25 = zonedChronology12.days();
        org.joda.time.DateTimeZone dateTimeZone26 = zonedChronology12.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField25", (durationField5.compareTo(durationField25) == 0) == durationField5.equals(durationField25));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.year();
        org.joda.time.DurationField durationField24 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField24", (durationField5.compareTo(durationField24) == 0) == durationField5.equals(durationField24));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.Chronology chronology17 = zonedChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology20 = null;
        boolean boolean21 = dateTimeFieldType19.isSupported(chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks(0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType19.getField(chronology26);
        java.lang.String str28 = dateTimeField27.getName();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusWeeks(0);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        java.util.Locale locale35 = java.util.Locale.JAPANESE;
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.lang.String str37 = locale35.getISO3Country();
        java.lang.String str38 = dateTimeField27.getAsShortText((org.joda.time.ReadablePartial) localDateTime32, 2, locale35);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime32.minusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.plusWeeks((-359999));
        org.joda.time.LocalDateTime.Property property47 = localDateTime42.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minusWeeks(0);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.days();
        org.joda.time.DurationField durationField55 = chronology53.minutes();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str60 = dateTimeZone58.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology61 = org.joda.time.chrono.ZonedChronology.getInstance(chronology53, dateTimeZone58);
        boolean boolean63 = zonedChronology61.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField64 = zonedChronology61.centuries();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology61.clockhourOfDay();
        org.joda.time.DurationField durationField66 = zonedChronology61.centuries();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(1645454828186L, (org.joda.time.Chronology) zonedChronology61);
        org.joda.time.DateTimeField dateTimeField68 = zonedChronology61.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = dateTimeField68.getType();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(dateTimeZone70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.minusWeeks(0);
        org.joda.time.Chronology chronology74 = localDateTime73.getChronology();
        org.joda.time.DurationField durationField75 = chronology74.days();
        org.joda.time.DurationField durationField76 = chronology74.minutes();
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str81 = dateTimeZone79.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology82 = org.joda.time.chrono.ZonedChronology.getInstance(chronology74, dateTimeZone79);
        org.joda.time.DateTimeField dateTimeField83 = zonedChronology82.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean87 = dateTimeZone85.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology88 = zonedChronology82.withZone(dateTimeZone85);
        org.joda.time.DateTimeField dateTimeField89 = zonedChronology82.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField90 = zonedChronology82.dayOfYear();
        org.joda.time.DurationField durationField91 = zonedChronology82.weeks();
        org.joda.time.DateTimeField dateTimeField92 = zonedChronology82.monthOfYear();
        org.joda.time.DateTimeField dateTimeField93 = zonedChronology82.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField94 = zonedChronology82.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField95 = zonedChronology82.weekyear();
        boolean boolean96 = dateTimeFieldType69.isSupported((org.joda.time.Chronology) zonedChronology82);
        boolean boolean97 = localDateTime42.isSupported(dateTimeFieldType69);
        int int98 = dateTimeField18.getMaximumValue((org.joda.time.ReadablePartial) localDateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField91", (durationField13.compareTo(durationField91) == 0) == durationField13.equals(durationField91));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.weekyearOfCentury();
        org.joda.time.Chronology chronology24 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField25 = zonedChronology12.minutes();
        java.lang.String str26 = zonedChronology12.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField25", (durationField6.compareTo(durationField25) == 0) == durationField6.equals(durationField25));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.year();
        org.joda.time.DurationField durationField22 = zonedChronology12.hours();
        org.joda.time.DurationField durationField23 = zonedChronology12.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.yearOfEra();
        org.joda.time.LocalDateTime.Property property34 = localDateTime32.monthOfYear();
        int int35 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        long long37 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime27, (long) (byte) 10);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology12.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.Chronology chronology40 = zonedChronology12.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology12.centuryOfEra();
        org.joda.time.DurationField durationField42 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField5, and durationField6", !(durationField42.compareTo(durationField5) == 0) || (Math.signum(durationField42.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField22 = zonedChronology12.months();
        org.joda.time.DurationField durationField23 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.minuteOfHour();
        org.joda.time.DurationField durationField25 = zonedChronology12.centuries();
        org.joda.time.DurationFieldType durationFieldType26 = durationField25.getType();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks(0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        org.joda.time.DurationField durationField33 = chronology31.minutes();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str38 = dateTimeZone36.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology39 = org.joda.time.chrono.ZonedChronology.getInstance(chronology31, dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology39.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean44 = dateTimeZone42.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology45 = zonedChronology39.withZone(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str50 = dateTimeZone48.getShortName((long) 10);
        java.lang.String str51 = dateTimeZone48.getID();
        org.joda.time.Chronology chronology52 = zonedChronology39.withZone(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int56 = dateTimeZone54.getOffsetFromLocal((long) 100);
        org.joda.time.Chronology chronology57 = zonedChronology39.withZone(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology39.minuteOfHour();
        org.joda.time.DurationField durationField59 = zonedChronology39.halfdays();
        org.joda.time.DurationField durationField60 = durationFieldType26.getField((org.joda.time.Chronology) zonedChronology39);
        long long64 = zonedChronology39.add(1645454832545L, 31592952000L, 3190627);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField60", (durationField23.compareTo(durationField60) == 0) == durationField23.equals(durationField60));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime(readableInstant5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        int int10 = property9.getMinimumValue();
        boolean boolean11 = dateTime6.equals((java.lang.Object) int10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int13 = dateTime6.get(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks(0);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DurationField durationField20 = chronology18.minutes();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str25 = dateTimeZone23.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology26 = org.joda.time.chrono.ZonedChronology.getInstance(chronology18, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology26.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean31 = dateTimeZone29.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology32 = zonedChronology26.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology26.minuteOfHour();
        org.joda.time.DurationField durationField34 = zonedChronology26.seconds();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology26.millisOfDay();
        boolean boolean36 = dateTimeFieldType12.isSupported((org.joda.time.Chronology) zonedChronology26);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology26.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology26.weekyear();
        java.lang.Object obj39 = null;
        boolean boolean40 = zonedChronology26.equals(obj39);
        org.joda.time.Chronology chronology41 = zonedChronology26.withUTC();
        org.joda.time.DurationField durationField42 = zonedChronology26.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField19, and durationField20", !(durationField42.compareTo(durationField19) == 0) || (Math.signum(durationField42.compareTo(durationField20)) == Math.signum(durationField19.compareTo(durationField20))));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField15 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField16 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.era();
        java.lang.String str18 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField22 = zonedChronology12.hours();
        org.joda.time.DurationField durationField23 = zonedChronology12.days();
        org.joda.time.DurationField durationField24 = zonedChronology12.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField24", (durationField5.compareTo(durationField24) == 0) == durationField5.equals(durationField24));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.secondOfDay();
        org.joda.time.DurationField durationField27 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology12.millisOfDay();
        org.joda.time.DurationField durationField29 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField29", (durationField5.compareTo(durationField29) == 0) == durationField5.equals(durationField29));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField15 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks(0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.days();
        org.joda.time.DurationField durationField26 = chronology24.minutes();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str31 = dateTimeZone29.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology24, dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology32.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean37 = dateTimeZone35.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology38 = zonedChronology32.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology32.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology32.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusWeeks(0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.days();
        org.joda.time.DurationField durationField47 = chronology45.minutes();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str52 = dateTimeZone50.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology53 = org.joda.time.chrono.ZonedChronology.getInstance(chronology45, dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology53.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean58 = dateTimeZone56.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology59 = zonedChronology53.withZone(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology53.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology53.year();
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology53.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology64 = null;
        boolean boolean65 = dateTimeFieldType63.isSupported(chronology64);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(dateTimeZone66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.minusWeeks(0);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType63.getField(chronology70);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str76 = dateTimeZone74.getShortName((long) 10);
        java.lang.String str77 = dateTimeZone74.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone74);
        org.joda.time.chrono.ZonedChronology zonedChronology79 = org.joda.time.chrono.ZonedChronology.getInstance(chronology70, dateTimeZone74);
        java.lang.String str81 = dateTimeZone74.getShortName(4459589293L);
        org.joda.time.Chronology chronology82 = zonedChronology53.withZone(dateTimeZone74);
        org.joda.time.Chronology chronology83 = zonedChronology32.withZone(dateTimeZone74);
        int int85 = dateTimeZone74.getOffset(1645454801625L);
        org.joda.time.LocalDateTime localDateTime86 = new org.joda.time.LocalDateTime((long) 121734782, dateTimeZone74);
        org.joda.time.chrono.ZonedChronology zonedChronology87 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone74);
        org.joda.time.DateTimeField dateTimeField88 = zonedChronology87.minuteOfDay();
        org.joda.time.DurationField durationField89 = zonedChronology87.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField89, durationField5, and durationField6", !(durationField89.compareTo(durationField5) == 0) || (Math.signum(durationField89.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        boolean boolean2 = dateTimeFieldType0.isSupported(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType0.getField(chronology7);
        java.lang.String str9 = dateTimeField8.getName();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks(0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale16.getISO3Country();
        java.lang.String str19 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDateTime13, 2, locale16);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks(0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str33 = dateTimeZone31.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology34 = org.joda.time.chrono.ZonedChronology.getInstance(chronology26, dateTimeZone31);
        org.joda.time.DurationField durationField35 = zonedChronology34.weeks();
        org.joda.time.DurationField durationField36 = zonedChronology34.months();
        org.joda.time.DateTimeZone dateTimeZone37 = zonedChronology34.getZone();
        boolean boolean38 = localDateTime13.equals((java.lang.Object) zonedChronology34);
        long long42 = zonedChronology34.add((long) 54, 1645454852997L, 80);
        org.joda.time.DurationField durationField43 = zonedChronology34.weekyears();
        org.joda.time.DurationField durationField44 = zonedChronology34.years();
        org.joda.time.DurationField durationField45 = zonedChronology34.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField45", (durationField43.compareTo(durationField45) == 0) == durationField43.equals(durationField45));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        boolean boolean24 = zonedChronology12.equals((java.lang.Object) "2022-02-22T00:46:43.291+10:00");
        org.joda.time.DateTimeZone dateTimeZone25 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology12.secondOfMinute();
        org.joda.time.DurationField durationField29 = zonedChronology12.days();
        org.joda.time.DurationField durationField30 = zonedChronology12.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField29", (durationField5.compareTo(durationField29) == 0) == durationField5.equals(durationField29));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.yearOfEra();
        org.joda.time.DurationField durationField24 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField24", (durationField5.compareTo(durationField24) == 0) == durationField5.equals(durationField24));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField14 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField16 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField17 = zonedChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.hourOfHalfday();
        org.joda.time.DurationField durationField20 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField20", (durationField6.compareTo(durationField20) == 0) == durationField6.equals(durationField20));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.DurationField durationField16 = zonedChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone17 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField18 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField5, and durationField6", !(durationField18.compareTo(durationField5) == 0) || (Math.signum(durationField18.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime(readableInstant5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        int int10 = property9.getMinimumValue();
        boolean boolean11 = dateTime6.equals((java.lang.Object) int10);
        org.joda.time.Chronology chronology12 = dateTime6.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.era();
        int int14 = dateTime6.get(dateTimeFieldType13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusWeeks(0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.days();
        org.joda.time.DurationField durationField21 = chronology19.minutes();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str26 = dateTimeZone24.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology27 = org.joda.time.chrono.ZonedChronology.getInstance(chronology19, dateTimeZone24);
        boolean boolean29 = zonedChronology27.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology27.hourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology27.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology27.era();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology27.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology27.yearOfEra();
        boolean boolean35 = dateTimeFieldType13.isSupported((org.joda.time.Chronology) zonedChronology27);
        org.joda.time.DurationField durationField36 = zonedChronology27.months();
        org.joda.time.DurationField durationField37 = zonedChronology27.minutes();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology27.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField37", (durationField21.compareTo(durationField37) == 0) == durationField21.equals(durationField37));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str23 = dateTimeZone21.getShortName((long) 10);
        java.lang.String str24 = dateTimeZone21.getID();
        org.joda.time.Chronology chronology25 = zonedChronology12.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.yearOfCentury();
        org.joda.time.DurationField durationField31 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField32 = zonedChronology12.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField32", (durationField6.compareTo(durationField32) == 0) == durationField6.equals(durationField32));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.Chronology chronology27 = zonedChronology12.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField29 = zonedChronology12.months();
        long long30 = durationField29.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType31 = durationField29.getType();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusWeeks(0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.days();
        org.joda.time.DurationField durationField38 = chronology36.minutes();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str43 = dateTimeZone41.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology44 = org.joda.time.chrono.ZonedChronology.getInstance(chronology36, dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology44.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean49 = dateTimeZone47.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology50 = zonedChronology44.withZone(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology44.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology44.year();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology44.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology44);
        boolean boolean56 = zonedChronology44.equals((java.lang.Object) "2022-02-22T00:46:43.291+10:00");
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology44.secondOfDay();
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology44.hourOfHalfday();
        java.lang.String str59 = zonedChronology44.toString();
        org.joda.time.DurationField durationField60 = durationFieldType31.getField((org.joda.time.Chronology) zonedChronology44);
        java.lang.String str61 = durationFieldType31.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField60", (durationField29.compareTo(durationField60) == 0) == durationField29.equals(durationField60));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.Chronology chronology21 = zonedChronology13.withUTC();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.Chronology chronology25 = zonedChronology13.withZone(dateTimeZone24);
        boolean boolean26 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks(0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        org.joda.time.DurationField durationField33 = chronology31.minutes();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str38 = dateTimeZone36.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology39 = org.joda.time.chrono.ZonedChronology.getInstance(chronology31, dateTimeZone36);
        org.joda.time.DurationField durationField40 = zonedChronology39.weeks();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology39.secondOfMinute();
        org.joda.time.DurationField durationField42 = zonedChronology39.months();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology39.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType0.getField((org.joda.time.Chronology) zonedChronology39);
        org.joda.time.DurationField durationField45 = zonedChronology39.minutes();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology39.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField45", (durationField7.compareTo(durationField45) == 0) == durationField7.equals(durationField45));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        java.lang.String str21 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.dayOfYear();
        org.joda.time.DurationField durationField25 = zonedChronology12.weekyears();
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str27 = durationFieldType26.toString();
        boolean boolean28 = zonedChronology12.equals((java.lang.Object) durationFieldType26);
        org.joda.time.DurationField durationField29 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField30 = zonedChronology12.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField29", (durationField6.compareTo(durationField29) == 0) == durationField6.equals(durationField29));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = zonedChronology12.weekyears();
        org.joda.time.DurationField durationField18 = zonedChronology12.years();
        org.joda.time.DurationField durationField19 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField18", (durationField17.compareTo(durationField18) == 0) == durationField17.equals(durationField18));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = zonedChronology12.getZone();
        java.lang.String str23 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology25 = zonedChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusWeeks(0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.days();
        org.joda.time.DurationField durationField34 = chronology32.minutes();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str39 = dateTimeZone37.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology40 = org.joda.time.chrono.ZonedChronology.getInstance(chronology32, dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology40.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean45 = dateTimeZone43.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology46 = zonedChronology40.withZone(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology40.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology40.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.yearOfEra();
        org.joda.time.LocalDateTime.Property property53 = localDateTime51.monthOfYear();
        java.util.Locale locale54 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleKeys();
        java.util.Locale locale56 = locale54.stripExtensions();
        java.lang.String str57 = dateTimeField49.getAsText((org.joda.time.ReadablePartial) localDateTime51, locale56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime51.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.withDayOfYear(93);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray62 = localDateTime61.getFieldTypes();
        int[] intArray64 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime61, 4495793240L);
        org.joda.time.DurationField durationField65 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology12.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField65", (durationField6.compareTo(durationField65) == 0) == durationField6.equals(durationField65));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        boolean boolean6 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(0);
        int int11 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int14 = localDateTime8.indexOf(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDateTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks(0);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.days();
        org.joda.time.DurationField durationField22 = chronology20.minutes();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str27 = dateTimeZone25.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology20, dateTimeZone25);
        boolean boolean30 = zonedChronology28.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField31 = zonedChronology28.centuries();
        org.joda.time.DurationField durationField32 = zonedChronology28.months();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        int int37 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localDateTime34.toDateTime(readableInstant38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        int int44 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime();
        boolean boolean46 = localDateTime41.isEqual((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusWeeks(0);
        int int51 = localDateTime45.compareTo((org.joda.time.ReadablePartial) localDateTime48);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime34.withFields((org.joda.time.ReadablePartial) localDateTime45);
        int[] intArray54 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime52, 70001L);
        int int55 = localDateTime52.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.yearOfEra();
        int int57 = localDateTime52.getCenturyOfEra();
        org.joda.time.DateTime dateTime58 = localDateTime52.toDateTime();
        org.joda.time.DateTime dateTime59 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Chronology chronology60 = dateTime58.getChronology();
        org.joda.time.Instant instant61 = dateTime58.toInstant();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime65 = property63.addToCopy((long) (short) 0);
        int int66 = property63.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime67 = property63.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime68 = localDateTime67.toDateTime();
        org.joda.time.Chronology chronology69 = dateTime68.getChronology();
        boolean boolean70 = dateTime58.isEqual((org.joda.time.ReadableInstant) dateTime68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant61", (dateTime39.compareTo(instant61) == 0) == dateTime39.equals(instant61));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField18 = zonedChronology12.centuries();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks(0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.days();
        org.joda.time.DurationField durationField26 = chronology24.minutes();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str31 = dateTimeZone29.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology24, dateTimeZone29);
        org.joda.time.DurationField durationField33 = zonedChronology32.weeks();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology32.year();
        org.joda.time.DurationField durationField35 = zonedChronology32.weeks();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology32.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology32.weekyear();
        org.joda.time.Chronology chronology38 = zonedChronology32.withUTC();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(4495702101L, chronology38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology42 = null;
        boolean boolean43 = dateTimeFieldType41.isSupported(chronology42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minusWeeks(0);
        org.joda.time.Chronology chronology48 = localDateTime47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType41.getField(chronology48);
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType41.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusWeeks(0);
        org.joda.time.Chronology chronology55 = localDateTime54.getChronology();
        org.joda.time.DurationField durationField56 = chronology55.days();
        org.joda.time.DurationField durationField57 = chronology55.minutes();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str62 = dateTimeZone60.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology63 = org.joda.time.chrono.ZonedChronology.getInstance(chronology55, dateTimeZone60);
        org.joda.time.DurationField durationField64 = durationFieldType50.getField((org.joda.time.Chronology) zonedChronology63);
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology63.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(dateTimeZone66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.yearOfEra();
        int int69 = property68.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime70 = property68.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.minus(readablePeriod71);
        int[] intArray74 = zonedChronology63.get((org.joda.time.ReadablePartial) localDateTime70, 1645368563145L);
        zonedChronology12.validate((org.joda.time.ReadablePartial) localDateTime39, intArray74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField33", (durationField13.compareTo(durationField33) == 0) == durationField13.equals(durationField33));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfEra();
        int int3 = property2.getMinimumValue();
        java.lang.String str4 = property2.getAsText();
        org.joda.time.LocalDateTime localDateTime5 = property2.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(0);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.days();
        org.joda.time.DurationField durationField13 = chronology11.minutes();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str18 = dateTimeZone16.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology19 = org.joda.time.chrono.ZonedChronology.getInstance(chronology11, dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology19.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean24 = dateTimeZone22.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology25 = zonedChronology19.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology19.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology19.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology19.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology19.monthOfYear();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology19.year();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType6.getField((org.joda.time.Chronology) zonedChronology19);
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology19.secondOfMinute();
        org.joda.time.DurationField durationField33 = zonedChronology19.weeks();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology19.weekyear();
        org.joda.time.DurationField durationField36 = zonedChronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField12, and durationField13", !(durationField36.compareTo(durationField12) == 0) || (Math.signum(durationField36.compareTo(durationField13)) == Math.signum(durationField12.compareTo(durationField13))));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        java.lang.String str21 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str29 = dateTimeZone27.getShortName((long) 10);
        java.lang.String str30 = dateTimeZone27.getID();
        java.lang.String str31 = dateTimeZone27.getID();
        java.lang.String str33 = dateTimeZone27.getName((long) 2);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean38 = dateTimeZone36.isStandardOffset(1781190354L);
        int int40 = dateTimeZone36.getOffsetFromLocal((-292278993L));
        long long43 = dateTimeZone36.convertLocalToUTC((long) 121734782, true);
        long long45 = dateTimeZone27.getMillisKeepLocal(dateTimeZone36, (long) 75);
        org.joda.time.Chronology chronology46 = zonedChronology12.withZone(dateTimeZone27);
        org.joda.time.Chronology chronology47 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField48 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField48, durationField5, and durationField6", !(durationField48.compareTo(durationField5) == 0) || (Math.signum(durationField48.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfYear();
        org.joda.time.DurationField durationField20 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField21 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField22 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField22", (durationField6.compareTo(durationField22) == 0) == durationField6.equals(durationField22));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfEra();
        long long3 = property2.remainder();
        int int4 = property2.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime5 = property2.withMaximumValue();
        boolean boolean6 = property2.isLeap();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.setCopy("902");
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        int int13 = property12.getMinimumValue();
        java.lang.String str14 = property12.getAsText();
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = property12.getAsText(locale15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology18 = null;
        boolean boolean19 = dateTimeFieldType17.isSupported(chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks(0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType17.getField(chronology24);
        java.lang.String str26 = dateTimeField25.getName();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks(0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        java.util.Locale locale33 = java.util.Locale.JAPANESE;
        java.lang.String str34 = locale33.getDisplayLanguage();
        java.lang.String str35 = locale33.getISO3Country();
        java.lang.String str36 = dateTimeField25.getAsShortText((org.joda.time.ReadablePartial) localDateTime30, 2, locale33);
        org.joda.time.LocalDateTime.Property property37 = localDateTime30.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        int int42 = localDateTime39.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime39.toDateTime(readableInstant43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.yearOfEra();
        int int48 = property47.getMinimumValue();
        boolean boolean49 = dateTime44.equals((java.lang.Object) int48);
        long long50 = property37.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime44);
        int int51 = property12.getDifference((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology52 = dateTime44.getChronology();
        java.lang.String str53 = dateTime44.toString();
        org.joda.time.DateTime dateTime54 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology55 = dateTime44.getChronology();
        org.joda.time.Instant instant56 = dateTime44.toInstant();
        org.joda.time.Instant instant57 = instant56.toInstant();
        org.joda.time.Instant instant58 = instant56.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant58", (dateTime44.compareTo(instant58) == 0) == dateTime44.equals(instant58));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.Chronology chronology23 = zonedChronology12.withUTC();
        java.lang.String str24 = zonedChronology12.toString();
        org.joda.time.DurationField durationField25 = zonedChronology12.days();
        org.joda.time.DurationField durationField26 = zonedChronology12.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField25", (durationField5.compareTo(durationField25) == 0) == durationField5.equals(durationField25));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField15 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField16 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        int int21 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        int int28 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        boolean boolean30 = localDateTime25.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        int int35 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime29);
        int[] intArray38 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime36, 70001L);
        java.lang.String str39 = zonedChronology12.toString();
        org.joda.time.DurationField durationField40 = zonedChronology12.months();
        org.joda.time.DurationField durationField41 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField42 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField44 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology12.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField44", (durationField5.compareTo(durationField44) == 0) == durationField5.equals(durationField44));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        boolean boolean2 = dateTimeFieldType0.isSupported(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks(0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.days();
        org.joda.time.DurationField durationField16 = chronology14.minutes();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str21 = dateTimeZone19.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology22 = org.joda.time.chrono.ZonedChronology.getInstance(chronology14, dateTimeZone19);
        org.joda.time.DurationField durationField23 = durationFieldType9.getField((org.joda.time.Chronology) zonedChronology22);
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology22.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology22.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology22.clockhourOfDay();
        org.joda.time.DurationField durationField28 = zonedChronology22.minutes();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology22.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField28", (durationField16.compareTo(durationField28) == 0) == durationField16.equals(durationField28));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        java.lang.String str1 = durationFieldType0.toString();
        java.lang.String str2 = durationFieldType0.toString();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.days();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str14 = dateTimeZone12.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology15 = org.joda.time.chrono.ZonedChronology.getInstance(chronology7, dateTimeZone12);
        org.joda.time.DurationField durationField16 = zonedChronology15.weeks();
        boolean boolean17 = durationFieldType0.isSupported((org.joda.time.Chronology) zonedChronology15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusWeeks(0);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.days();
        org.joda.time.DurationField durationField25 = chronology23.minutes();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str30 = dateTimeZone28.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology31 = org.joda.time.chrono.ZonedChronology.getInstance(chronology23, dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology31.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean36 = dateTimeZone34.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology37 = zonedChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology31.dayOfMonth();
        org.joda.time.Chronology chronology39 = zonedChronology31.withUTC();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.Chronology chronology43 = zonedChronology31.withZone(dateTimeZone42);
        boolean boolean44 = dateTimeFieldType18.isSupported((org.joda.time.Chronology) zonedChronology31);
        boolean boolean45 = durationFieldType0.isSupported((org.joda.time.Chronology) zonedChronology31);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusWeeks(0);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.days();
        org.joda.time.DurationField durationField52 = chronology50.minutes();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str57 = dateTimeZone55.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology58 = org.joda.time.chrono.ZonedChronology.getInstance(chronology50, dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology58.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean63 = dateTimeZone61.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology64 = zonedChronology58.withZone(dateTimeZone61);
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology58.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology58.dayOfYear();
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology58.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField68 = zonedChronology58.halfdayOfDay();
        org.joda.time.DurationField durationField69 = zonedChronology58.halfdays();
        org.joda.time.DateTimeField dateTimeField70 = zonedChronology58.year();
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology58.hourOfDay();
        org.joda.time.DateTimeField dateTimeField72 = zonedChronology58.yearOfEra();
        org.joda.time.DurationField durationField73 = zonedChronology58.weeks();
        org.joda.time.DurationField durationField74 = durationFieldType0.getField((org.joda.time.Chronology) zonedChronology58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField73", (durationField16.compareTo(durationField73) == 0) == durationField16.equals(durationField73));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.Chronology chronology23 = zonedChronology12.withUTC();
        java.lang.String str24 = zonedChronology12.toString();
        org.joda.time.DurationField durationField25 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField25", (durationField5.compareTo(durationField25) == 0) == durationField5.equals(durationField25));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str25 = dateTimeZone23.getShortName((long) 10);
        java.lang.String str26 = dateTimeZone23.getID();
        long long29 = dateTimeZone23.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.Chronology chronology30 = zonedChronology12.withZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.days();
        org.joda.time.DurationField durationField37 = chronology35.minutes();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str42 = dateTimeZone40.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology43 = org.joda.time.chrono.ZonedChronology.getInstance(chronology35, dateTimeZone40);
        boolean boolean45 = zonedChronology43.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField46 = zonedChronology43.centuries();
        org.joda.time.DurationField durationField47 = zonedChronology43.months();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology43.era();
        java.lang.String str49 = zonedChronology43.toString();
        boolean boolean50 = dateTimeZone23.equals((java.lang.Object) str49);
        long long53 = dateTimeZone23.convertLocalToUTC((long) (byte) -1, true);
        boolean boolean55 = dateTimeZone23.equals((java.lang.Object) 4495627957L);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.era();
        java.lang.String str58 = property57.getAsText();
        org.joda.time.DateTimeField dateTimeField59 = property57.getField();
        org.joda.time.DurationField durationField60 = property57.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField60, durationField5, and durationField6", !(durationField60.compareTo(durationField5) == 0) || (Math.signum(durationField60.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        boolean boolean2 = dateTimeFieldType0.isSupported(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType0.getField(chronology7);
        java.lang.String str9 = dateTimeField8.getName();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks(0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale16.getISO3Country();
        java.lang.String str19 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDateTime13, 2, locale16);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks(0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str33 = dateTimeZone31.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology34 = org.joda.time.chrono.ZonedChronology.getInstance(chronology26, dateTimeZone31);
        org.joda.time.DurationField durationField35 = zonedChronology34.weeks();
        org.joda.time.DurationField durationField36 = zonedChronology34.months();
        org.joda.time.DateTimeZone dateTimeZone37 = zonedChronology34.getZone();
        boolean boolean38 = localDateTime13.equals((java.lang.Object) zonedChronology34);
        long long42 = zonedChronology34.add((long) 54, 1645454852997L, 80);
        org.joda.time.DurationField durationField43 = zonedChronology34.weekyears();
        org.joda.time.DurationField durationField44 = zonedChronology34.years();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology34.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField44", (durationField43.compareTo(durationField44) == 0) == durationField43.equals(durationField44));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Iterator<java.lang.Character> charItor2 = charSet1.iterator();
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.Object[] objArray5 = charSet4.toArray();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        boolean boolean8 = charSet4.retainAll((java.util.Collection<java.lang.Character>) charSet7);
        boolean boolean9 = charSet1.containsAll((java.util.Collection<java.lang.Character>) charSet4);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology11 = null;
        boolean boolean12 = dateTimeFieldType10.isSupported(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusWeeks(0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType10.getField(chronology17);
        java.lang.String str19 = dateTimeField18.getName();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks(0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        java.util.Locale locale26 = java.util.Locale.JAPANESE;
        java.lang.String str27 = locale26.getDisplayLanguage();
        java.lang.String str28 = locale26.getISO3Country();
        java.lang.String str29 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localDateTime23, 2, locale26);
        org.joda.time.LocalDateTime.Property property30 = localDateTime23.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        int int35 = localDateTime32.compareTo((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.DateTime dateTime37 = localDateTime32.toDateTime(readableInstant36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.yearOfEra();
        int int41 = property40.getMinimumValue();
        boolean boolean42 = dateTime37.equals((java.lang.Object) int41);
        long long43 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Instant instant44 = dateTime37.toInstant();
        boolean boolean45 = charSet4.remove((java.lang.Object) instant44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusWeeks(0);
        org.joda.time.Chronology chronology51 = localDateTime50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.days();
        org.joda.time.DurationField durationField53 = chronology51.minutes();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str58 = dateTimeZone56.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology59 = org.joda.time.chrono.ZonedChronology.getInstance(chronology51, dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology59.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean64 = dateTimeZone62.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology65 = zonedChronology59.withZone(dateTimeZone62);
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology59.minuteOfHour();
        org.joda.time.DurationField durationField67 = zonedChronology59.seconds();
        org.joda.time.DurationField durationField68 = zonedChronology59.seconds();
        org.joda.time.DateTimeField dateTimeField69 = dateTimeFieldType46.getField((org.joda.time.Chronology) zonedChronology59);
        org.joda.time.DurationField durationField70 = zonedChronology59.weeks();
        org.joda.time.DurationField durationField71 = zonedChronology59.millis();
        org.joda.time.DateTimeField dateTimeField72 = zonedChronology59.millisOfDay();
        boolean boolean73 = charSet4.contains((java.lang.Object) dateTimeField72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and instant44", (dateTime37.compareTo(instant44) == 0) == dateTime37.equals(instant44));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.days();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str14 = dateTimeZone12.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology15 = org.joda.time.chrono.ZonedChronology.getInstance(chronology7, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology15.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean20 = dateTimeZone18.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology21 = zonedChronology15.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology15.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology15.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology15.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology15.weekOfWeekyear();
        org.joda.time.DurationField durationField26 = zonedChronology15.millis();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology15.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology15.yearOfCentury();
        boolean boolean29 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology15);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology15.halfdayOfDay();
        org.joda.time.DurationField durationField31 = zonedChronology15.days();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology15.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField31", (durationField8.compareTo(durationField31) == 0) == durationField8.equals(durationField31));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfMonth();
        org.joda.time.Chronology chronology22 = zonedChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.dayOfWeek();
        org.joda.time.DurationField durationField24 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField5, and durationField6", !(durationField24.compareTo(durationField5) == 0) || (Math.signum(durationField24.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        java.lang.String str1 = durationFieldType0.toString();
        java.lang.String str2 = durationFieldType0.toString();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.days();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str14 = dateTimeZone12.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology15 = org.joda.time.chrono.ZonedChronology.getInstance(chronology7, dateTimeZone12);
        org.joda.time.DurationField durationField16 = zonedChronology15.weeks();
        boolean boolean17 = durationFieldType0.isSupported((org.joda.time.Chronology) zonedChronology15);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology15);
        org.joda.time.DurationField durationField19 = zonedChronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField8, and durationField9", !(durationField19.compareTo(durationField8) == 0) || (Math.signum(durationField19.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.Chronology chronology21 = zonedChronology12.withUTC();
        org.joda.time.DurationField durationField22 = zonedChronology12.months();
        org.joda.time.DurationField durationField23 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.minuteOfHour();
        org.joda.time.DurationField durationField25 = zonedChronology12.centuries();
        org.joda.time.DurationFieldType durationFieldType26 = durationField25.getType();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks(0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        org.joda.time.DurationField durationField33 = chronology31.minutes();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str38 = dateTimeZone36.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology39 = org.joda.time.chrono.ZonedChronology.getInstance(chronology31, dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology39.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean44 = dateTimeZone42.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology45 = zonedChronology39.withZone(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str50 = dateTimeZone48.getShortName((long) 10);
        java.lang.String str51 = dateTimeZone48.getID();
        org.joda.time.Chronology chronology52 = zonedChronology39.withZone(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int56 = dateTimeZone54.getOffsetFromLocal((long) 100);
        org.joda.time.Chronology chronology57 = zonedChronology39.withZone(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology39.minuteOfHour();
        org.joda.time.DurationField durationField59 = zonedChronology39.halfdays();
        org.joda.time.DurationField durationField60 = durationFieldType26.getField((org.joda.time.Chronology) zonedChronology39);
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology39.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField60", (durationField23.compareTo(durationField60) == 0) == durationField23.equals(durationField60));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfEra();
        int int3 = property2.getMinimumValue();
        java.lang.String str4 = property2.getAsText();
        org.joda.time.LocalDateTime localDateTime5 = property2.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(0);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.days();
        org.joda.time.DurationField durationField13 = chronology11.minutes();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str18 = dateTimeZone16.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology19 = org.joda.time.chrono.ZonedChronology.getInstance(chronology11, dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology19.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean24 = dateTimeZone22.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology25 = zonedChronology19.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology19.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology19.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology19.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology19.monthOfYear();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology19.year();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType6.getField((org.joda.time.Chronology) zonedChronology19);
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology19.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology19.millisOfDay();
        org.joda.time.DurationField durationField35 = zonedChronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField12, and durationField13", !(durationField35.compareTo(durationField12) == 0) || (Math.signum(durationField35.compareTo(durationField13)) == Math.signum(durationField12.compareTo(durationField13))));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str23 = dateTimeZone21.getShortName((long) 10);
        java.lang.String str24 = dateTimeZone21.getID();
        org.joda.time.Chronology chronology25 = zonedChronology12.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.secondOfDay();
        org.joda.time.Chronology chronology28 = zonedChronology12.withUTC();
        java.lang.String str29 = zonedChronology12.toString();
        org.joda.time.DurationField durationField30 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology12.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField30", (durationField6.compareTo(durationField30) == 0) == durationField6.equals(durationField30));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DurationField durationField14 = zonedChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology13.dayOfWeek();
        org.joda.time.DurationField durationField17 = zonedChronology13.years();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology13.secondOfDay();
        org.joda.time.Chronology chronology19 = zonedChronology13.withUTC();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(1641600008L, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = zonedChronology13.months();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology13.minuteOfDay();
        org.joda.time.DurationField durationField24 = zonedChronology13.days();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology13.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField24", (durationField6.compareTo(durationField24) == 0) == durationField6.equals(durationField24));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.weekOfWeekyear();
        org.joda.time.Chronology chronology3 = localDateTime0.getChronology();
        int int4 = localDateTime0.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology7 = null;
        boolean boolean8 = dateTimeFieldType6.isSupported(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusWeeks(0);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType6.getField(chronology13);
        java.lang.String str15 = dateTimeField14.getName();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks(0);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        java.util.Locale locale22 = java.util.Locale.JAPANESE;
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.lang.String str24 = locale22.getISO3Country();
        java.lang.String str25 = dateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDateTime19, 2, locale22);
        int int27 = dateTimeField14.getMaximumValue(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology29 = null;
        boolean boolean30 = dateTimeFieldType28.isSupported(chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType28.getField(chronology35);
        java.lang.String str37 = dateTimeField36.getName();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks(0);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        java.util.Locale locale44 = java.util.Locale.JAPANESE;
        java.lang.String str45 = locale44.getDisplayLanguage();
        java.lang.String str46 = locale44.getISO3Country();
        java.lang.String str47 = dateTimeField36.getAsShortText((org.joda.time.ReadablePartial) localDateTime41, 2, locale44);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime41.minusDays((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plus(readableDuration50);
        int[] intArray56 = new int[] { 0, 292278993, 10, 'a' };
        int int57 = dateTimeField14.getMinimumValue((org.joda.time.ReadablePartial) localDateTime51, intArray56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(dateTimeZone60);
        int int62 = localDateTime59.compareTo((org.joda.time.ReadablePartial) localDateTime61);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.DateTime dateTime64 = localDateTime59.toDateTime(readableInstant63);
        boolean boolean66 = dateTime64.equals((java.lang.Object) 'a');
        org.joda.time.DateTime dateTime67 = localDateTime51.toDateTime((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.LocalDateTime.Property property68 = localDateTime51.dayOfMonth();
        org.joda.time.LocalDateTime.Property property69 = localDateTime51.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(dateTimeZone70);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(dateTimeZone72);
        int int74 = localDateTime71.compareTo((org.joda.time.ReadablePartial) localDateTime73);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.DateTime dateTime76 = localDateTime71.toDateTime(readableInstant75);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime(dateTimeZone77);
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.yearOfEra();
        int int80 = property79.getMinimumValue();
        boolean boolean81 = dateTime76.equals((java.lang.Object) int80);
        org.joda.time.DurationFieldType durationFieldType82 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology84 = null;
        boolean boolean85 = dateTimeFieldType83.isSupported(chronology84);
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.LocalDateTime localDateTime87 = new org.joda.time.LocalDateTime(dateTimeZone86);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime87.minusWeeks(0);
        org.joda.time.Chronology chronology90 = localDateTime89.getChronology();
        org.joda.time.DateTimeField dateTimeField91 = dateTimeFieldType83.getField(chronology90);
        org.joda.time.DurationField durationField92 = durationFieldType82.getField(chronology90);
        boolean boolean93 = dateTime76.equals((java.lang.Object) chronology90);
        org.joda.time.DateTimeZone dateTimeZone94 = dateTime76.getZone();
        org.joda.time.DateTime dateTime95 = localDateTime51.toDateTime((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.DateTime dateTime96 = localDateTime0.toDateTime((org.joda.time.ReadableInstant) dateTime76);
        long long97 = dateTime96.getMillis();
        org.joda.time.Instant instant98 = dateTime96.toInstant();
        long long99 = dateTime96.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime64 and instant98", (dateTime64.compareTo(instant98) == 0) == dateTime64.equals(instant98));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.DateTimeZone dateTimeZone23 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField24 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField5, and durationField6", !(durationField24.compareTo(durationField5) == 0) || (Math.signum(durationField24.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology23 = null;
        boolean boolean24 = dateTimeFieldType22.isSupported(chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks(0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType22.getField(chronology29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        java.lang.String str36 = dateTimeZone33.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology29, dateTimeZone33);
        java.lang.String str40 = dateTimeZone33.getShortName(4459589293L);
        org.joda.time.Chronology chronology41 = zonedChronology12.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField42 = zonedChronology12.millis();
        org.joda.time.DurationField durationField43 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField44 = zonedChronology12.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField43", (durationField6.compareTo(durationField43) == 0) == durationField6.equals(durationField43));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = zonedChronology12.weekyears();
        org.joda.time.DurationField durationField18 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField18", (durationField17.compareTo(durationField18) == 0) == durationField17.equals(durationField18));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.weekOfWeekyear();
        org.joda.time.Chronology chronology19 = localDateTime16.getChronology();
        int int20 = localDateTime16.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property21 = localDateTime16.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int23 = localDateTime16.indexOf(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone33);
        boolean boolean38 = zonedChronology36.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField39 = zonedChronology36.centuries();
        org.joda.time.DurationField durationField40 = zonedChronology36.months();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        int int45 = localDateTime42.compareTo((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.DateTime dateTime47 = localDateTime42.toDateTime(readableInstant46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        int int52 = localDateTime49.compareTo((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime();
        boolean boolean54 = localDateTime49.isEqual((org.joda.time.ReadablePartial) localDateTime53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusWeeks(0);
        int int59 = localDateTime53.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime42.withFields((org.joda.time.ReadablePartial) localDateTime53);
        int[] intArray62 = zonedChronology36.get((org.joda.time.ReadablePartial) localDateTime60, 70001L);
        zonedChronology12.validate((org.joda.time.ReadablePartial) localDateTime16, intArray62);
        org.joda.time.DurationField durationField64 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology12.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField64", (durationField5.compareTo(durationField64) == 0) == durationField5.equals(durationField64));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField15 = zonedChronology12.centuries();
        org.joda.time.DateTimeZone dateTimeZone16 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField17 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.hourOfDay();
        org.joda.time.DurationField durationField19 = zonedChronology12.millis();
        org.joda.time.DurationField durationField20 = zonedChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField20", (durationField17.compareTo(durationField20) == 0) == durationField17.equals(durationField20));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        int int8 = durationField5.getValue(1L, (long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusWeeks(0);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.days();
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        org.joda.time.DurationFieldType durationFieldType16 = durationField15.getType();
        int int17 = durationField5.compareTo(durationField15);
        long long19 = durationField15.getMillis((long) 999);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks(0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.days();
        org.joda.time.DurationField durationField26 = chronology24.minutes();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str31 = dateTimeZone29.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology24, dateTimeZone29);
        boolean boolean34 = zonedChronology32.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField35 = zonedChronology32.centuries();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology32.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology32.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology32.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        int int43 = localDateTime40.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.DateTime dateTime45 = localDateTime40.toDateTime(readableInstant44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        int int50 = localDateTime47.compareTo((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime();
        boolean boolean52 = localDateTime47.isEqual((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minusWeeks(0);
        int int57 = localDateTime51.compareTo((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime40.withFields((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.LocalDateTime.Property property59 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime60 = property59.roundHalfCeilingCopy();
        int[] intArray62 = zonedChronology32.get((org.joda.time.ReadablePartial) localDateTime60, (long) 2814846);
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology32.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology32.secondOfDay();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology32.secondOfMinute();
        org.joda.time.DurationField durationField66 = zonedChronology32.seconds();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(dateTimeZone67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.minusWeeks(0);
        org.joda.time.Chronology chronology71 = localDateTime70.getChronology();
        org.joda.time.DurationField durationField72 = chronology71.days();
        org.joda.time.DurationField durationField73 = chronology71.minutes();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str78 = dateTimeZone76.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology79 = org.joda.time.chrono.ZonedChronology.getInstance(chronology71, dateTimeZone76);
        boolean boolean81 = zonedChronology79.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DateTimeField dateTimeField82 = zonedChronology79.hourOfDay();
        org.joda.time.DurationField durationField83 = zonedChronology79.years();
        boolean boolean84 = zonedChronology32.equals((java.lang.Object) zonedChronology79);
        org.joda.time.DurationField durationField85 = zonedChronology32.days();
        int int86 = durationField15.compareTo(durationField85);
        int int89 = durationField15.getValue(4495892858L, 33264000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField85", (durationField5.compareTo(durationField85) == 0) == durationField5.equals(durationField85));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField17 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField5, and durationField6", !(durationField17.compareTo(durationField5) == 0) || (Math.signum(durationField17.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology13.year();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology13.year();
        org.joda.time.DurationField durationField23 = zonedChronology13.weekyears();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 8, (org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology13.weekyearOfCentury();
        org.joda.time.DurationField durationField28 = zonedChronology13.years();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology13.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField28", (durationField23.compareTo(durationField28) == 0) == durationField23.equals(durationField28));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.minuteOfHour();
        org.joda.time.DurationField durationField21 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField21", (durationField6.compareTo(durationField21) == 0) == durationField6.equals(durationField21));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        int int10 = localDateTime9.getYearOfEra();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDateTime9.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        int int16 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime13.toDateTime(readableInstant17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfEra();
        int int22 = property21.getMinimumValue();
        boolean boolean23 = dateTime18.equals((java.lang.Object) int22);
        org.joda.time.Chronology chronology24 = dateTime18.getChronology();
        org.joda.time.DateTime dateTime25 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = property27.addToCopy((long) (short) 0);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.centuries();
        boolean boolean31 = property27.equals((java.lang.Object) durationFieldType30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DurationField durationField33 = durationFieldType30.getField(chronology32);
        java.lang.String str34 = durationFieldType30.toString();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime9.withFieldAdded(durationFieldType30, 20);
        boolean boolean37 = localDateTime3.isSupported(durationFieldType30);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks(0);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.days();
        org.joda.time.DurationField durationField44 = chronology42.minutes();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str49 = dateTimeZone47.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology50 = org.joda.time.chrono.ZonedChronology.getInstance(chronology42, dateTimeZone47);
        boolean boolean52 = zonedChronology50.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField53 = zonedChronology50.centuries();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology50.dayOfYear();
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology50.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology50.minuteOfHour();
        boolean boolean57 = durationFieldType30.isSupported((org.joda.time.Chronology) zonedChronology50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField33 and durationField53", (durationField33.compareTo(durationField53) == 0) == durationField33.equals(durationField53));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        boolean boolean2 = dateTimeFieldType0.isSupported(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType0.getField(chronology7);
        java.lang.String str9 = dateTimeField8.getName();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks(0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale16.getISO3Country();
        java.lang.String str19 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDateTime13, 2, locale16);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.minusDays((int) (byte) 1);
        java.lang.String str22 = localDateTime13.toString();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime13.plusHours(305);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str27 = dateTimeFieldType26.getName();
        int int28 = localDateTime24.get(dateTimeFieldType26);
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType26.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minusWeeks(0);
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.days();
        org.joda.time.DurationField durationField36 = chronology34.minutes();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str41 = dateTimeZone39.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology42 = org.joda.time.chrono.ZonedChronology.getInstance(chronology34, dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean47 = dateTimeZone45.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology48 = zonedChronology42.withZone(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology42.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology42.weekOfWeekyear();
        org.joda.time.Chronology chronology51 = zonedChronology42.withUTC();
        org.joda.time.DurationField durationField52 = zonedChronology42.halfdays();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology42.dayOfYear();
        org.joda.time.DurationField durationField54 = zonedChronology42.seconds();
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology42.secondOfDay();
        boolean boolean56 = dateTimeFieldType26.isSupported((org.joda.time.Chronology) zonedChronology42);
        org.joda.time.DurationField durationField57 = zonedChronology42.months();
        org.joda.time.DurationField durationField58 = zonedChronology42.days();
        org.joda.time.DurationField durationField59 = zonedChronology42.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField35 and durationField58", (durationField35.compareTo(durationField58) == 0) == durationField35.equals(durationField58));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        java.lang.String str21 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.yearOfCentury();
        long long28 = zonedChronology12.add((long) 2830063, 0L, 12);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusWeeks(0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.days();
        org.joda.time.DurationField durationField38 = chronology36.minutes();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str43 = dateTimeZone41.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology44 = org.joda.time.chrono.ZonedChronology.getInstance(chronology36, dateTimeZone41);
        boolean boolean46 = zonedChronology44.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology44.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology44.year();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology44.secondOfDay();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology44.weekyearOfCentury();
        org.joda.time.DurationField durationField51 = zonedChronology44.hours();
        boolean boolean52 = zonedChronology12.equals((java.lang.Object) zonedChronology44);
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField54 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField54, durationField5, and durationField6", !(durationField54.compareTo(durationField5) == 0) || (Math.signum(durationField54.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField15 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField16 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        int int21 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        int int28 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        boolean boolean30 = localDateTime25.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        int int35 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime29);
        int[] intArray38 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime36, 70001L);
        java.lang.String str39 = zonedChronology12.toString();
        org.joda.time.DurationField durationField40 = zonedChronology12.months();
        org.joda.time.DurationField durationField41 = zonedChronology12.days();
        org.joda.time.DurationField durationField42 = zonedChronology12.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField42", (durationField5.compareTo(durationField42) == 0) == durationField5.equals(durationField42));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology12);
        boolean boolean24 = zonedChronology12.equals((java.lang.Object) "2022-02-22T00:46:43.291+10:00");
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.yearOfEra();
        int int29 = property28.getMinimumValue();
        java.lang.String str30 = property28.getAsText();
        org.joda.time.LocalDateTime localDateTime31 = property28.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minusMinutes(100);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusWeeks(0);
        org.joda.time.Chronology chronology38 = localDateTime37.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.days();
        org.joda.time.DurationField durationField40 = chronology38.minutes();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str45 = dateTimeZone43.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology46 = org.joda.time.chrono.ZonedChronology.getInstance(chronology38, dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology46.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean51 = dateTimeZone49.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology52 = zonedChronology46.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology46.dayOfMonth();
        org.joda.time.Chronology chronology54 = zonedChronology46.withUTC();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.Chronology chronology58 = zonedChronology46.withZone(dateTimeZone57);
        org.joda.time.DateTime dateTime59 = localDateTime33.toDateTime(dateTimeZone57);
        org.joda.time.Chronology chronology60 = zonedChronology12.withZone(dateTimeZone57);
        org.joda.time.DurationField durationField61 = zonedChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology12.era();
        org.joda.time.DurationField durationField63 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField63, durationField5, and durationField6", !(durationField63.compareTo(durationField5) == 0) || (Math.signum(durationField63.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str23 = dateTimeZone21.getShortName((long) 10);
        java.lang.String str24 = dateTimeZone21.getID();
        org.joda.time.Chronology chronology25 = zonedChronology12.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.yearOfCentury();
        org.joda.time.DurationField durationField27 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField5, and durationField6", !(durationField27.compareTo(durationField5) == 0) || (Math.signum(durationField27.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField23 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.yearOfEra();
        int int28 = property27.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime29 = property27.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        int int34 = localDateTime31.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime31.toDateTime(readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.yearOfEra();
        int int40 = property39.getMinimumValue();
        boolean boolean41 = dateTime36.equals((java.lang.Object) int40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int43 = dateTime36.get(dateTimeFieldType42);
        long long44 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTime36.getZone();
        java.lang.String str46 = dateTimeZone45.toString();
        org.joda.time.Chronology chronology47 = zonedChronology12.withZone(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology12.weekyear();
        org.joda.time.DurationField durationField49 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology12.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField49", (durationField5.compareTo(durationField49) == 0) == durationField5.equals(durationField49));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField15 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField16 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        int int21 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        int int28 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        boolean boolean30 = localDateTime25.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        int int35 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime29);
        int[] intArray38 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime36, 70001L);
        java.lang.String str39 = zonedChronology12.toString();
        org.joda.time.DurationField durationField40 = zonedChronology12.months();
        org.joda.time.DurationField durationField41 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField42 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField44 = zonedChronology12.days();
        org.joda.time.Chronology chronology45 = zonedChronology12.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField44", (durationField5.compareTo(durationField44) == 0) == durationField5.equals(durationField44));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int4 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime(readableInstant5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        int int10 = property9.getMinimumValue();
        boolean boolean11 = dateTime6.equals((java.lang.Object) int10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology14 = null;
        boolean boolean15 = dateTimeFieldType13.isSupported(chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks(0);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType13.getField(chronology20);
        org.joda.time.DurationField durationField22 = durationFieldType12.getField(chronology20);
        boolean boolean23 = dateTime6.equals((java.lang.Object) chronology20);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks(0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.days();
        org.joda.time.DurationField durationField31 = chronology29.minutes();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str36 = dateTimeZone34.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology37 = org.joda.time.chrono.ZonedChronology.getInstance(chronology29, dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology37.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean42 = dateTimeZone40.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology43 = zonedChronology37.withZone(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology37.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology37.weekOfWeekyear();
        org.joda.time.Chronology chronology46 = zonedChronology37.withUTC();
        org.joda.time.DurationField durationField47 = zonedChronology37.seconds();
        org.joda.time.DateTimeZone dateTimeZone48 = zonedChronology37.getZone();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.yearOfEra();
        org.joda.time.LocalDateTime.Property property52 = localDateTime50.monthOfYear();
        long long54 = zonedChronology37.set((org.joda.time.ReadablePartial) localDateTime50, (long) 2022);
        org.joda.time.LocalDateTime.Property property55 = localDateTime50.weekOfWeekyear();
        org.joda.time.DateTime dateTime56 = localDateTime50.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.yearOfEra();
        int int60 = property59.getMinimumValue();
        java.lang.String str61 = property59.getAsText();
        org.joda.time.LocalDateTime localDateTime62 = property59.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.minusMinutes(100);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(dateTimeZone65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.minusWeeks(0);
        org.joda.time.Chronology chronology69 = localDateTime68.getChronology();
        org.joda.time.DurationField durationField70 = chronology69.days();
        org.joda.time.DurationField durationField71 = chronology69.minutes();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str76 = dateTimeZone74.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology77 = org.joda.time.chrono.ZonedChronology.getInstance(chronology69, dateTimeZone74);
        org.joda.time.DateTimeField dateTimeField78 = zonedChronology77.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean82 = dateTimeZone80.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology83 = zonedChronology77.withZone(dateTimeZone80);
        org.joda.time.DateTimeField dateTimeField84 = zonedChronology77.dayOfMonth();
        org.joda.time.Chronology chronology85 = zonedChronology77.withUTC();
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.Chronology chronology89 = zonedChronology77.withZone(dateTimeZone88);
        org.joda.time.DateTime dateTime90 = localDateTime64.toDateTime(dateTimeZone88);
        int int91 = dateTime56.compareTo((org.joda.time.ReadableInstant) dateTime90);
        boolean boolean92 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Instant instant93 = dateTime56.toInstant();
        org.joda.time.Instant instant94 = instant93.toInstant();
        org.joda.time.Chronology chronology95 = instant94.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant94", (dateTime6.compareTo(instant94) == 0) == dateTime6.equals(instant94));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.dayOfWeek();
        org.joda.time.DurationField durationField23 = zonedChronology12.weekyears();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology36.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology42 = zonedChronology36.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology36.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology36.year();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology36.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology36);
        boolean boolean48 = zonedChronology36.equals((java.lang.Object) "2022-02-22T00:46:43.291+10:00");
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology36.secondOfDay();
        org.joda.time.DurationField durationField50 = zonedChronology36.years();
        org.joda.time.DurationField durationField51 = zonedChronology36.weeks();
        int int52 = durationField23.compareTo(durationField51);
        long long53 = durationField51.getUnitMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField50", (durationField23.compareTo(durationField50) == 0) == durationField23.equals(durationField50));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = zonedChronology12.weekyears();
        org.joda.time.DurationField durationField18 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField18", (durationField17.compareTo(durationField18) == 0) == durationField17.equals(durationField18));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfEra();
        int int3 = property2.getMinimumValue();
        java.lang.String str4 = property2.getAsText();
        org.joda.time.LocalDateTime localDateTime5 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes(100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusWeeks(0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.days();
        org.joda.time.DurationField durationField14 = chronology12.minutes();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str19 = dateTimeZone17.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology20 = org.joda.time.chrono.ZonedChronology.getInstance(chronology12, dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology20.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean25 = dateTimeZone23.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology26 = zonedChronology20.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology20.dayOfMonth();
        org.joda.time.Chronology chronology28 = zonedChronology20.withUTC();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.Chronology chronology32 = zonedChronology20.withZone(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localDateTime7.toDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property34 = localDateTime7.year();
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("703");
        int int37 = property34.getMaximumShortTextLength(locale36);
        org.joda.time.LocalDateTime localDateTime38 = property34.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks(0);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.days();
        org.joda.time.DurationField durationField45 = chronology43.minutes();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str50 = dateTimeZone48.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology51 = org.joda.time.chrono.ZonedChronology.getInstance(chronology43, dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology51.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean56 = dateTimeZone54.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology57 = zonedChronology51.withZone(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology51.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology51.dayOfYear();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology51.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology51.weekyearOfCentury();
        org.joda.time.DurationField durationField62 = zonedChronology51.weeks();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology51.yearOfCentury();
        boolean boolean64 = property34.equals((java.lang.Object) zonedChronology51);
        org.joda.time.DurationField durationField65 = zonedChronology51.millis();
        org.joda.time.DurationField durationField66 = zonedChronology51.days();
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology51.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField66", (durationField13.compareTo(durationField66) == 0) == durationField13.equals(durationField66));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        java.lang.String str15 = zonedChronology12.toString();
        org.joda.time.DurationField durationField16 = zonedChronology12.years();
        long long19 = durationField16.add((long) 980, 5725962);
        org.joda.time.DurationFieldType durationFieldType20 = durationField16.getType();
        org.joda.time.DurationFieldType durationFieldType21 = durationField16.getType();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks(0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str33 = dateTimeZone31.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology34 = org.joda.time.chrono.ZonedChronology.getInstance(chronology26, dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology34.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean39 = dateTimeZone37.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology40 = zonedChronology34.withZone(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology34.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology34.dayOfYear();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology34.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology34.halfdayOfDay();
        org.joda.time.DurationField durationField45 = zonedChronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology34.year();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology34.minuteOfHour();
        org.joda.time.DurationField durationField48 = zonedChronology34.centuries();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology34.dayOfMonth();
        org.joda.time.DurationField durationField50 = zonedChronology34.minutes();
        org.joda.time.DurationField durationField51 = durationFieldType21.getField((org.joda.time.Chronology) zonedChronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField50", (durationField6.compareTo(durationField50) == 0) == durationField6.equals(durationField50));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = zonedChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField24 = zonedChronology12.millis();
        org.joda.time.DurationField durationField25 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField26 = zonedChronology12.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField25", (durationField6.compareTo(durationField25) == 0) == durationField6.equals(durationField25));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField15 = zonedChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        int int23 = localDateTime20.compareTo((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime20.toDateTime(readableInstant24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        int int30 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        boolean boolean32 = localDateTime27.isEqual((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusWeeks(0);
        int int37 = localDateTime31.compareTo((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime.Property property39 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundHalfCeilingCopy();
        int[] intArray42 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime40, (long) 2814846);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology12.secondOfMinute();
        org.joda.time.DurationField durationField46 = zonedChronology12.seconds();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusWeeks(0);
        org.joda.time.Chronology chronology51 = localDateTime50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.days();
        org.joda.time.DurationField durationField53 = chronology51.minutes();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str58 = dateTimeZone56.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology59 = org.joda.time.chrono.ZonedChronology.getInstance(chronology51, dateTimeZone56);
        boolean boolean61 = zonedChronology59.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology59.hourOfDay();
        org.joda.time.DurationField durationField63 = zonedChronology59.years();
        boolean boolean64 = zonedChronology12.equals((java.lang.Object) zonedChronology59);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.Locale locale68 = java.util.Locale.ITALY;
        java.util.Locale locale69 = locale68.stripExtensions();
        java.lang.String str70 = locale68.getScript();
        java.util.Locale locale71 = java.util.Locale.FRANCE;
        java.lang.String str72 = locale68.getDisplayScript(locale71);
        java.lang.String str73 = locale68.getISO3Language();
        java.lang.String str74 = locale68.getDisplayCountry();
        java.lang.String str75 = dateTimeZone66.getName((long) 42, locale68);
        org.joda.time.chrono.ZonedChronology zonedChronology76 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology59, dateTimeZone66);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHours(247);
        org.joda.time.Chronology chronology79 = zonedChronology59.withZone(dateTimeZone78);
        org.joda.time.DateTimeField dateTimeField80 = zonedChronology59.hourOfDay();
        org.joda.time.DurationField durationField81 = zonedChronology59.seconds();
        org.joda.time.DateTimeField dateTimeField82 = zonedChronology59.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField46 and durationField81", (durationField46.compareTo(durationField81) == 0) == durationField46.equals(durationField81));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField19 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusWeeks(0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.days();
        org.joda.time.DurationField durationField27 = chronology25.minutes();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str32 = dateTimeZone30.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology33 = org.joda.time.chrono.ZonedChronology.getInstance(chronology25, dateTimeZone30);
        org.joda.time.DurationField durationField34 = zonedChronology33.weeks();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology33.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology33.dayOfWeek();
        org.joda.time.DurationField durationField37 = zonedChronology33.years();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology33.secondOfDay();
        org.joda.time.Chronology chronology39 = zonedChronology33.withUTC();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology33.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusWeeks(0);
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        int int47 = localDateTime45.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property48 = localDateTime45.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        int int53 = localDateTime50.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.DateTime dateTime55 = localDateTime50.toDateTime(readableInstant54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        int int60 = localDateTime57.compareTo((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime();
        boolean boolean62 = localDateTime57.isEqual((org.joda.time.ReadablePartial) localDateTime61);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(dateTimeZone63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.minusWeeks(0);
        int int67 = localDateTime61.compareTo((org.joda.time.ReadablePartial) localDateTime64);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime50.withFields((org.joda.time.ReadablePartial) localDateTime61);
        org.joda.time.LocalDateTime.Property property69 = localDateTime50.millisOfSecond();
        java.util.Locale locale70 = java.util.Locale.CANADA;
        java.util.Locale locale71 = java.util.Locale.KOREAN;
        java.lang.String str72 = locale70.getDisplayCountry(locale71);
        java.lang.String str73 = property69.getAsText(locale70);
        boolean boolean74 = property48.equals((java.lang.Object) locale70);
        java.util.Locale locale78 = new java.util.Locale("875", "963", "566");
        java.lang.String str79 = locale70.getDisplayLanguage(locale78);
        java.util.Set<java.lang.String> strSet80 = locale78.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet81 = locale78.getUnicodeLocaleAttributes();
        java.lang.String str82 = dateTimeField40.getAsShortText(2961187L, locale78);
        java.lang.String str83 = locale78.getDisplayVariant();
        int int84 = dateTimeField20.getMaximumTextLength(locale78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField34", (durationField13.compareTo(durationField34) == 0) == durationField13.equals(durationField34));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfMonth();
        org.joda.time.DurationField durationField21 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField22 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField5, and durationField6", !(durationField22.compareTo(durationField5) == 0) || (Math.signum(durationField22.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str23 = dateTimeZone21.getShortName((long) 10);
        java.lang.String str24 = dateTimeZone21.getID();
        org.joda.time.Chronology chronology25 = zonedChronology12.withZone(dateTimeZone21);
        long long29 = zonedChronology12.add((long) (byte) -1, (-35998661L), 100);
        org.joda.time.DateTimeZone dateTimeZone30 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField31 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology12.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField31", (durationField5.compareTo(durationField31) == 0) == durationField5.equals(durationField31));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks(0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str33 = dateTimeZone31.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology34 = org.joda.time.chrono.ZonedChronology.getInstance(chronology26, dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology34.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean39 = dateTimeZone37.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology40 = zonedChronology34.withZone(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology34.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology34.year();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology34.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology34);
        boolean boolean46 = zonedChronology34.equals((java.lang.Object) "2022-02-22T00:46:43.291+10:00");
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology34.secondOfDay();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology34.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology34.millisOfDay();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology34.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusWeeks(0);
        org.joda.time.Chronology chronology55 = localDateTime54.getChronology();
        int int56 = localDateTime54.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property57 = localDateTime54.dayOfYear();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime54.plusMillis(2801202);
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.minus(readableDuration60);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(dateTimeZone63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.minusWeeks(0);
        org.joda.time.Chronology chronology67 = localDateTime66.getChronology();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime66.minusMillis(0);
        int int72 = localDateTime71.getHourOfDay();
        boolean boolean73 = dateTimeZone62.isLocalDateTimeGap(localDateTime71);
        org.joda.time.DateTime dateTime74 = localDateTime59.toDateTime(dateTimeZone62);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(dateTimeZone62);
        org.joda.time.Chronology chronology76 = zonedChronology34.withZone(dateTimeZone62);
        org.joda.time.Chronology chronology77 = zonedChronology12.withZone(dateTimeZone62);
        org.joda.time.DurationField durationField78 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField79 = zonedChronology12.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField78", (durationField6.compareTo(durationField78) == 0) == durationField6.equals(durationField78));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusDays(2795574);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusDays(2);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        java.lang.String str10 = property9.getName();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        int int15 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        boolean boolean17 = localDateTime12.isEqual((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusWeeks(0);
        int int22 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime.Property property23 = localDateTime19.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int25 = localDateTime19.indexOf(dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = localDateTime19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks(0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        org.joda.time.DurationField durationField33 = chronology31.minutes();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str38 = dateTimeZone36.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology39 = org.joda.time.chrono.ZonedChronology.getInstance(chronology31, dateTimeZone36);
        boolean boolean41 = zonedChronology39.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField42 = zonedChronology39.centuries();
        org.joda.time.DurationField durationField43 = zonedChronology39.months();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        int int48 = localDateTime45.compareTo((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.DateTime dateTime50 = localDateTime45.toDateTime(readableInstant49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        int int55 = localDateTime52.compareTo((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime();
        boolean boolean57 = localDateTime52.isEqual((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.minusWeeks(0);
        int int62 = localDateTime56.compareTo((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime45.withFields((org.joda.time.ReadablePartial) localDateTime56);
        int[] intArray65 = zonedChronology39.get((org.joda.time.ReadablePartial) localDateTime63, 70001L);
        int int66 = localDateTime63.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property67 = localDateTime63.yearOfEra();
        int int68 = localDateTime63.getCenturyOfEra();
        org.joda.time.DateTime dateTime69 = localDateTime63.toDateTime();
        org.joda.time.DateTime dateTime70 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean72 = dateTime70.isSupported(dateTimeFieldType71);
        org.joda.time.Instant instant73 = dateTime70.toInstant();
        int int74 = property9.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant73", (dateTime50.compareTo(instant73) == 0) == dateTime50.equals(instant73));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.year();
        org.joda.time.DurationField durationField22 = zonedChronology12.hours();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField28 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField5, and durationField6", !(durationField28.compareTo(durationField5) == 0) || (Math.signum(durationField28.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.year();
        org.joda.time.DurationField durationField22 = zonedChronology12.hours();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.minuteOfHour();
        org.joda.time.DurationField durationField27 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField5, and durationField6", !(durationField27.compareTo(durationField5) == 0) || (Math.signum(durationField27.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.year();
        org.joda.time.DurationField durationField22 = zonedChronology12.seconds();
        org.joda.time.DurationField durationField23 = zonedChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.secondOfDay();
        org.joda.time.DurationField durationField25 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField25", (durationField6.compareTo(durationField25) == 0) == durationField6.equals(durationField25));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField14 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField16 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField17 = zonedChronology12.hours();
        org.joda.time.DurationFieldType durationFieldType18 = durationField17.getType();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusWeeks(0);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.days();
        org.joda.time.DurationField durationField25 = chronology23.minutes();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str30 = dateTimeZone28.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology31 = org.joda.time.chrono.ZonedChronology.getInstance(chronology23, dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology31.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean36 = dateTimeZone34.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology37 = zonedChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology31.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology31.year();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology31.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology31);
        boolean boolean43 = zonedChronology31.equals((java.lang.Object) "2022-02-22T00:46:43.291+10:00");
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology31.secondOfDay();
        long long48 = zonedChronology31.add(4495618583L, 0L, 2801202);
        org.joda.time.DurationField durationField49 = zonedChronology31.seconds();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology31.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology31.dayOfMonth();
        org.joda.time.DurationField durationField52 = durationFieldType18.getField((org.joda.time.Chronology) zonedChronology31);
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology31.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField52", (durationField17.compareTo(durationField52) == 0) == durationField17.equals(durationField52));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        boolean boolean2 = dateTimeFieldType0.isSupported(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType0.getField(chronology7);
        java.lang.String str9 = dateTimeField8.getName();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks(0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale16.getISO3Country();
        java.lang.String str19 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDateTime13, 2, locale16);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.minusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusWeeks((-359999));
        org.joda.time.LocalDateTime.Property property28 = localDateTime23.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology30 = null;
        boolean boolean31 = dateTimeFieldType29.isSupported(chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusWeeks(0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType29.getField(chronology36);
        java.lang.String str38 = dateTimeField37.getName();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks(0);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        java.util.Locale locale45 = java.util.Locale.JAPANESE;
        java.lang.String str46 = locale45.getDisplayLanguage();
        java.lang.String str47 = locale45.getISO3Country();
        java.lang.String str48 = dateTimeField37.getAsShortText((org.joda.time.ReadablePartial) localDateTime42, 2, locale45);
        int int50 = dateTimeField37.getMaximumValue(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology52 = null;
        boolean boolean53 = dateTimeFieldType51.isSupported(chronology52);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.minusWeeks(0);
        org.joda.time.Chronology chronology58 = localDateTime57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = dateTimeFieldType51.getField(chronology58);
        java.lang.String str60 = dateTimeField59.getName();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(dateTimeZone61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.minusWeeks(0);
        org.joda.time.Chronology chronology65 = localDateTime64.getChronology();
        java.util.Locale locale67 = java.util.Locale.JAPANESE;
        java.lang.String str68 = locale67.getDisplayLanguage();
        java.lang.String str69 = locale67.getISO3Country();
        java.lang.String str70 = dateTimeField59.getAsShortText((org.joda.time.ReadablePartial) localDateTime64, 2, locale67);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime64.minusDays((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plus(readableDuration73);
        int[] intArray79 = new int[] { 0, 292278993, 10, 'a' };
        int int80 = dateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) localDateTime74, intArray79);
        org.joda.time.ReadableDuration readableDuration81 = null;
        org.joda.time.LocalDateTime localDateTime83 = localDateTime74.withDurationAdded(readableDuration81, (int) (short) 0);
        org.joda.time.DateTime dateTime84 = localDateTime83.toDateTime();
        org.joda.time.Instant instant85 = dateTime84.toInstant();
        long long86 = property28.getDifferenceAsLong((org.joda.time.ReadableInstant) instant85);
        org.joda.time.Chronology chronology87 = instant85.getChronology();
        java.lang.String str88 = chronology87.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime84 and instant85", (dateTime84.compareTo(instant85) == 0) == dateTime84.equals(instant85));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField15 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField16 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        int int21 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        int int28 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        boolean boolean30 = localDateTime25.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        int int35 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime29);
        int[] intArray38 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime36, 70001L);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology12.yearOfCentury();
        org.joda.time.DurationField durationField40 = zonedChronology12.millis();
        java.lang.String str41 = zonedChronology12.toString();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology12.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology44 = null;
        boolean boolean45 = dateTimeFieldType43.isSupported(chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusWeeks(0);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType43.getField(chronology50);
        java.lang.String str52 = dateTimeField51.getName();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minusWeeks(0);
        org.joda.time.Chronology chronology57 = localDateTime56.getChronology();
        java.util.Locale locale59 = java.util.Locale.JAPANESE;
        java.lang.String str60 = locale59.getDisplayLanguage();
        java.lang.String str61 = locale59.getISO3Country();
        java.lang.String str62 = dateTimeField51.getAsShortText((org.joda.time.ReadablePartial) localDateTime56, 2, locale59);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime56.minusDays((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology66 = null;
        boolean boolean67 = dateTimeFieldType65.isSupported(chronology66);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(dateTimeZone68);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.minusWeeks(0);
        org.joda.time.Chronology chronology72 = localDateTime71.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = dateTimeFieldType65.getField(chronology72);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str78 = dateTimeZone76.getShortName((long) 10);
        java.lang.String str79 = dateTimeZone76.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone76);
        org.joda.time.chrono.ZonedChronology zonedChronology81 = org.joda.time.chrono.ZonedChronology.getInstance(chronology72, dateTimeZone76);
        java.lang.String str83 = dateTimeZone76.getShortName(4459589293L);
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime56, dateTimeZone76);
        org.joda.time.LocalDateTime.Property property85 = localDateTime84.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime87 = localDateTime84.plusDays(2799082);
        int int88 = localDateTime87.getWeekOfWeekyear();
        int[] intArray90 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime87, (long) 99);
        org.joda.time.DurationField durationField91 = zonedChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone92 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField93 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField94 = zonedChronology12.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField93", (durationField6.compareTo(durationField93) == 0) == durationField6.equals(durationField93));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfEra();
        int int3 = property2.getMinimumValue();
        java.lang.String str4 = property2.getAsText();
        org.joda.time.LocalDateTime localDateTime5 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes(100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusMonths((int) 'x');
        org.joda.time.DateTimeField[] dateTimeFieldArray10 = localDateTime9.getFields();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusWeeks(0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfEra();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.monthOfYear();
        int int22 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusWeeks(0);
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.days();
        org.joda.time.DurationField durationField29 = chronology27.minutes();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str34 = dateTimeZone32.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology35 = org.joda.time.chrono.ZonedChronology.getInstance(chronology27, dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField36 = chronology27.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = dateTimeField36.getType();
        boolean boolean38 = localDateTime19.isSupported(dateTimeFieldType37);
        int int39 = localDateTime9.get(dateTimeFieldType37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusWeeks(0);
        org.joda.time.Chronology chronology44 = localDateTime43.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.days();
        org.joda.time.DurationField durationField46 = chronology44.minutes();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str51 = dateTimeZone49.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology52 = org.joda.time.chrono.ZonedChronology.getInstance(chronology44, dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology52.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean57 = dateTimeZone55.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology58 = zonedChronology52.withZone(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology52.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology52.year();
        java.lang.String str61 = zonedChronology52.toString();
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology52.year();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology52.monthOfYear();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology52.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology52.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType37.getField((org.joda.time.Chronology) zonedChronology52);
        org.joda.time.DurationField durationField67 = zonedChronology52.days();
        org.joda.time.DateTimeField dateTimeField68 = zonedChronology52.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField28 and durationField67", (durationField28.compareTo(durationField67) == 0) == durationField28.equals(durationField67));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str12 = dateTimeZone10.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology19 = zonedChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology13.dayOfMonth();
        org.joda.time.DurationField durationField21 = zonedChronology13.seconds();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(4459590955L, (org.joda.time.Chronology) zonedChronology13);
        long long26 = zonedChronology13.add((-21772799963999883L), 14515200000L, 100);
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField28 = zonedChronology13.seconds();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology13.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DurationField durationField32 = zonedChronology13.days();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology13.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField32", (durationField6.compareTo(durationField32) == 0) == durationField6.equals(durationField32));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.minuteOfHour();
        org.joda.time.DurationField durationField21 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField21", (durationField6.compareTo(durationField21) == 0) == durationField6.equals(durationField21));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = zonedChronology12.add(readablePeriod21, (long) (byte) 10, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.yearOfEra();
        org.joda.time.DurationField durationField26 = zonedChronology12.years();
        java.lang.String str27 = zonedChronology12.toString();
        org.joda.time.DurationField durationField28 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField29 = zonedChronology12.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField29", (durationField6.compareTo(durationField29) == 0) == durationField6.equals(durationField29));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DurationField durationField15 = zonedChronology12.centuries();
        org.joda.time.DurationField durationField16 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.hourOfDay();
        org.joda.time.DurationField durationField18 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField5, and durationField6", !(durationField18.compareTo(durationField5) == 0) || (Math.signum(durationField18.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.dayOfWeek();
        org.joda.time.DurationField durationField16 = zonedChronology12.years();
        org.joda.time.Chronology chronology17 = zonedChronology12.withUTC();
        org.joda.time.DateTimeZone dateTimeZone18 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField19 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField20 = zonedChronology12.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField19", (durationField6.compareTo(durationField19) == 0) == durationField6.equals(durationField19));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.Chronology chronology27 = zonedChronology12.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology12.monthOfYear();
        org.joda.time.DurationField durationField29 = zonedChronology12.months();
        long long30 = durationField29.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType31 = durationField29.getType();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusWeeks(0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.days();
        org.joda.time.DurationField durationField38 = chronology36.minutes();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str43 = dateTimeZone41.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology44 = org.joda.time.chrono.ZonedChronology.getInstance(chronology36, dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology44.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean49 = dateTimeZone47.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology50 = zonedChronology44.withZone(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology44.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology44.year();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology44.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology44);
        boolean boolean56 = zonedChronology44.equals((java.lang.Object) "2022-02-22T00:46:43.291+10:00");
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology44.secondOfDay();
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology44.hourOfHalfday();
        java.lang.String str59 = zonedChronology44.toString();
        org.joda.time.DurationField durationField60 = durationFieldType31.getField((org.joda.time.Chronology) zonedChronology44);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(dateTimeZone61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.minusWeeks(0);
        org.joda.time.Chronology chronology65 = localDateTime64.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.days();
        org.joda.time.DurationField durationField67 = chronology65.minutes();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str72 = dateTimeZone70.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology73 = org.joda.time.chrono.ZonedChronology.getInstance(chronology65, dateTimeZone70);
        org.joda.time.DurationField durationField74 = zonedChronology73.weeks();
        org.joda.time.DateTimeField dateTimeField75 = zonedChronology73.year();
        org.joda.time.DurationField durationField76 = zonedChronology73.weeks();
        org.joda.time.DateTimeField dateTimeField77 = zonedChronology73.millisOfSecond();
        org.joda.time.Chronology chronology78 = zonedChronology73.withUTC();
        org.joda.time.DateTimeField dateTimeField79 = zonedChronology73.weekOfWeekyear();
        org.joda.time.Chronology chronology80 = zonedChronology73.withUTC();
        org.joda.time.DateTimeField dateTimeField81 = zonedChronology73.dayOfMonth();
        org.joda.time.DurationField durationField82 = durationFieldType31.getField((org.joda.time.Chronology) zonedChronology73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField60", (durationField29.compareTo(durationField60) == 0) == durationField29.equals(durationField60));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.year();
        org.joda.time.DurationField durationField22 = zonedChronology12.hours();
        org.joda.time.DurationField durationField23 = zonedChronology12.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.yearOfEra();
        org.joda.time.LocalDateTime.Property property34 = localDateTime32.monthOfYear();
        int int35 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        long long37 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime27, (long) (byte) 10);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (byte) -1);
        int int42 = localDateTime41.getEra();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.plusDays((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plus(readablePeriod45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusWeeks(0);
        org.joda.time.Chronology chronology51 = localDateTime50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.days();
        org.joda.time.DurationField durationField53 = chronology51.minutes();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str58 = dateTimeZone56.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology59 = org.joda.time.chrono.ZonedChronology.getInstance(chronology51, dateTimeZone56);
        org.joda.time.DurationField durationField60 = zonedChronology59.centuries();
        org.joda.time.DurationFieldType durationFieldType61 = durationField60.getType();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime46.withFieldAdded(durationFieldType61, 54);
        int[] intArray65 = zonedChronology12.get((org.joda.time.ReadablePartial) localDateTime63, 3146991L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField60", (durationField23.compareTo(durationField60) == 0) == durationField23.equals(durationField60));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DurationField durationField13 = zonedChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology12.year();
        org.joda.time.DurationField durationField15 = zonedChronology12.years();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField17 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField5, and durationField6", !(durationField17.compareTo(durationField5) == 0) || (Math.signum(durationField17.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfYear();
        org.joda.time.DurationField durationField21 = zonedChronology12.weeks();
        org.joda.time.DurationField durationField22 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField22", (durationField5.compareTo(durationField22) == 0) == durationField5.equals(durationField22));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str25 = dateTimeZone23.getShortName((long) 10);
        java.lang.String str26 = dateTimeZone23.getID();
        long long29 = dateTimeZone23.convertLocalToUTC((long) (short) 1, false);
        org.joda.time.Chronology chronology30 = zonedChronology12.withZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone31 = zonedChronology12.getZone();
        org.joda.time.DurationField durationField32 = zonedChronology12.months();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField38 = zonedChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField5, and durationField6", !(durationField38.compareTo(durationField5) == 0) || (Math.signum(durationField38.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        boolean boolean14 = zonedChronology12.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology12.era();
        org.joda.time.DateTimeField dateTimeField18 = zonedChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField22 = zonedChronology12.years();
        org.joda.time.DurationField durationField23 = zonedChronology12.halfdays();
        org.joda.time.DurationField durationField24 = zonedChronology12.minutes();
        org.joda.time.DurationField durationField25 = zonedChronology12.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField24", (durationField6.compareTo(durationField24) == 0) == durationField6.equals(durationField24));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = zonedChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology12.millisOfSecond();
        org.joda.time.DurationField durationField24 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology12.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField24", (durationField6.compareTo(durationField24) == 0) == durationField6.equals(durationField24));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField23 = zonedChronology12.centuries();
        org.joda.time.DurationFieldType durationFieldType24 = durationField23.getType();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks(0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.days();
        org.joda.time.DurationField durationField31 = chronology29.minutes();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str36 = dateTimeZone34.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology37 = org.joda.time.chrono.ZonedChronology.getInstance(chronology29, dateTimeZone34);
        boolean boolean39 = zonedChronology37.equals((java.lang.Object) "292278993-02-21T14:46:29.866");
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology37.hourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology37.dayOfYear();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology37.secondOfDay();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology37.year();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology37.dayOfMonth();
        org.joda.time.DurationField durationField45 = zonedChronology37.months();
        org.joda.time.DurationField durationField46 = durationFieldType24.getField((org.joda.time.Chronology) zonedChronology37);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology37.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField46", (durationField23.compareTo(durationField46) == 0) == durationField23.equals(durationField46));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.secondOfDay();
        org.joda.time.DurationField durationField22 = zonedChronology12.minutes();
        java.lang.String str23 = zonedChronology12.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField22", (durationField6.compareTo(durationField22) == 0) == durationField6.equals(durationField22));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.yearOfEra();
        long long25 = property24.remainder();
        int int26 = property24.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime27 = property24.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology29 = null;
        boolean boolean30 = dateTimeFieldType28.isSupported(chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType28.getField(chronology35);
        java.lang.String str37 = dateTimeField36.getName();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks(0);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        java.util.Locale locale44 = java.util.Locale.JAPANESE;
        java.lang.String str45 = locale44.getDisplayLanguage();
        java.lang.String str46 = locale44.getISO3Country();
        java.lang.String str47 = dateTimeField36.getAsShortText((org.joda.time.ReadablePartial) localDateTime41, 2, locale44);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime41.minusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withMinuteOfHour((int) '#');
        java.util.Date date52 = localDateTime49.toDate();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.plusMillis(305);
        boolean boolean55 = localDateTime27.isBefore((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime27.minusYears(2);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(dateTimeZone61);
        int int63 = localDateTime60.compareTo((org.joda.time.ReadablePartial) localDateTime62);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.DateTime dateTime65 = localDateTime60.toDateTime(readableInstant64);
        org.joda.time.DateTime dateTime66 = localDateTime57.toDateTime(readableInstant64);
        org.joda.time.DateTimeZone dateTimeZone67 = dateTime66.getZone();
        org.joda.time.chrono.ZonedChronology zonedChronology68 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology12, dateTimeZone67);
        org.joda.time.DateTimeField dateTimeField69 = zonedChronology68.clockhourOfHalfday();
        org.joda.time.DurationField durationField70 = zonedChronology68.days();
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology68.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField70", (durationField5.compareTo(durationField70) == 0) == durationField5.equals(durationField70));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.year();
        org.joda.time.DurationField durationField22 = zonedChronology12.hours();
        org.joda.time.DurationField durationField23 = zonedChronology12.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.yearOfEra();
        org.joda.time.LocalDateTime.Property property34 = localDateTime32.monthOfYear();
        int int35 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        long long37 = zonedChronology12.set((org.joda.time.ReadablePartial) localDateTime27, (long) (byte) 10);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology12.minuteOfDay();
        org.joda.time.DurationField durationField41 = zonedChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology12.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField41", (durationField6.compareTo(durationField41) == 0) == durationField6.equals(durationField41));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getShortName((long) 10);
        org.joda.time.chrono.ZonedChronology zonedChronology12 = org.joda.time.chrono.ZonedChronology.getInstance(chronology4, dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.Chronology chronology18 = zonedChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField23 = zonedChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology12.year();
        org.joda.time.DurationField durationField25 = zonedChronology12.days();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology12.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField25", (durationField5.compareTo(durationField25) == 0) == durationField5.equals(durationField25));
    }
}

