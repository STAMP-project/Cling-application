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
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str1 = copticChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) -1, (-1));
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.dayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology8);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.dayOfYear();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology12);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusYears((int) (short) -1);
        int[] intArray20 = localDateTime19.getValues();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusDays(4);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.dayOfYear();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology23);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.hourOfDay();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.plusYears((int) (short) -1);
        int[] intArray31 = localDateTime30.getValues();
        copticChronology8.validate((org.joda.time.ReadablePartial) localDateTime22, intArray31);
        int int33 = localDateTime22.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime22.minus(readablePeriod34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.hourOfDay();
        int[] intArray38 = chronology7.get((org.joda.time.ReadablePartial) localDateTime35, (long) (short) 0);
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology39.dayOfYear();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology39);
        org.joda.time.DateTimeField dateTimeField42 = copticChronology39.yearOfEra();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology39.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology39.hourOfDay();
        long long48 = copticChronology39.add(1644572624553L, (long) 443, 812);
        org.joda.time.Chronology chronology49 = copticChronology39.withUTC();
        boolean boolean50 = localDateTime35.equals((java.lang.Object) copticChronology39);
        org.joda.time.DurationField durationField51 = copticChronology39.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField51, and durationField6", !(durationField6.compareTo(durationField51) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField51.compareTo(durationField6))));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusYears((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.dayOfYear();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology11);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusDays(1738);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.dayOfYear();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.millisOfSecond();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.dayOfYear();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology26);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.hourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.plusYears((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime(readableInstant34);
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology36.dayOfYear();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology36);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property41 = localDateTime38.hourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.plusYears((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.DateTime dateTime45 = localDateTime43.toDateTime(readableInstant44);
        boolean boolean46 = dateTime35.isEqual((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.chrono.CopticChronology copticChronology47 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology47.dayOfYear();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology47);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property52 = localDateTime49.hourOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.plusYears((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime54.toDateTime(readableInstant55);
        org.joda.time.chrono.CopticChronology copticChronology57 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology57.dayOfYear();
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology57);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property62 = localDateTime59.hourOfDay();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime59.plusYears((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localDateTime64.toDateTime(readableInstant65);
        boolean boolean67 = dateTime56.isEqual((org.joda.time.ReadableInstant) dateTime66);
        int int68 = dateTime35.compareTo((org.joda.time.ReadableInstant) dateTime56);
        int int69 = property25.compareTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = property25.getFieldType();
        boolean boolean71 = localDateTime17.isSupported(dateTimeFieldType70);
        boolean boolean72 = instant10.isSupported(dateTimeFieldType70);
        long long73 = instant10.getMillis();
        org.joda.time.chrono.CopticChronology copticChronology74 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField75 = copticChronology74.dayOfYear();
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology74);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property79 = localDateTime76.hourOfDay();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime76.plusYears((int) (short) -1);
        org.joda.time.chrono.CopticChronology copticChronology82 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField83 = copticChronology82.dayOfYear();
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology82);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime84.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime76.withFields((org.joda.time.ReadablePartial) localDateTime86);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime86.withMillisOfDay((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime91 = localDateTime86.plusYears((int) 'x');
        org.joda.time.ReadablePeriod readablePeriod92 = null;
        org.joda.time.LocalDateTime localDateTime93 = localDateTime86.plus(readablePeriod92);
        org.joda.time.LocalDateTime.Property property94 = localDateTime86.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType95 = property94.getFieldType();
        int int96 = instant10.get(dateTimeFieldType95);
        org.joda.time.Chronology chronology97 = instant10.getChronology();
        org.joda.time.DateTimeField dateTimeField98 = chronology97.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant10", (dateTime9.compareTo(instant10) == 0) == dateTime9.equals(instant10));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withHourOfDay(9);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.secondOfMinute();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str12 = copticChronology11.toString();
        long long17 = copticChronology11.getDateTimeMillis((int) 'a', 3, (int) (byte) 1, 0);
        long long23 = copticChronology11.getDateTimeMillis((long) 575, 6, (int) (short) 10, (int) (short) 0, 100);
        org.joda.time.DurationField durationField24 = copticChronology11.days();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology11.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        long long29 = copticChronology11.set((org.joda.time.ReadablePartial) localDateTime27, (long) 34927720);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.minusMonths(2);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime31);
        int int33 = localDateTime9.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime31 and localDateTime32", (localDateTime31.compareTo(localDateTime32) == 0) == localDateTime31.equals(localDateTime32));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusYears((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str11 = copticChronology10.toString();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology10.add(readablePeriod12, (long) (byte) -1, (-1));
        org.joda.time.DurationField durationField16 = copticChronology10.eras();
        boolean boolean17 = localDateTime7.equals((java.lang.Object) copticChronology10);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology10.halfdayOfDay();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.dayOfYear();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology19);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.plusYears((int) (short) -1);
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.dayOfYear();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology27);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime21.withFields((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime31.era();
        org.joda.time.LocalDateTime localDateTime34 = property33.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusMillis((-1));
        long long38 = copticChronology10.set((org.joda.time.ReadablePartial) localDateTime34, (long) 207);
        java.lang.Object obj39 = null;
        boolean boolean40 = copticChronology10.equals(obj39);
        org.joda.time.DateTimeField dateTimeField41 = copticChronology10.year();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology10.dayOfWeek();
        org.joda.time.DurationField durationField43 = copticChronology10.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField43, and durationField16", !(durationField16.compareTo(durationField43) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField43.compareTo(durationField16))));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str1 = copticChronology0.toString();
        org.joda.time.DurationField durationField2 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology3);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) (byte) 0);
        long long9 = copticChronology0.set((org.joda.time.ReadablePartial) localDateTime5, (long) 100);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        java.lang.String str14 = copticChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField13", Math.signum(durationField2.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField2)));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str1 = copticChronology0.toString();
        org.joda.time.DurationField durationField2 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology3);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) (byte) 0);
        long long9 = copticChronology0.set((org.joda.time.ReadablePartial) localDateTime5, (long) 100);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology0);
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.dayOfYear();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology13);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = property18.getAsText(locale19);
        long long21 = property18.remainder();
        org.joda.time.LocalDateTime localDateTime22 = property18.roundHalfFloorCopy();
        int int23 = property18.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime24 = property18.withMaximumValue();
        int int25 = property18.get();
        org.joda.time.LocalDateTime localDateTime27 = property18.addToCopy(0);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(1644572654084L);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withMillisOfDay(43);
        boolean boolean32 = localDateTime27.isEqual((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minus(readablePeriod33);
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str36 = copticChronology35.toString();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        long long40 = copticChronology35.add(readablePeriod37, (long) (byte) -1, (-1));
        org.joda.time.DurationField durationField41 = copticChronology35.eras();
        org.joda.time.Chronology chronology42 = copticChronology35.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology43.dayOfYear();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology43);
        org.joda.time.DateTimeField dateTimeField46 = copticChronology43.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology47 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology47.dayOfYear();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology47);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property52 = localDateTime49.hourOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.plusYears((int) (short) -1);
        int[] intArray55 = localDateTime54.getValues();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.minusDays(4);
        org.joda.time.chrono.CopticChronology copticChronology58 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField59 = copticChronology58.dayOfYear();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology58);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property63 = localDateTime60.hourOfDay();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime60.plusYears((int) (short) -1);
        int[] intArray66 = localDateTime65.getValues();
        copticChronology43.validate((org.joda.time.ReadablePartial) localDateTime57, intArray66);
        int int68 = localDateTime57.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime57.minus(readablePeriod69);
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.hourOfDay();
        int[] intArray73 = chronology42.get((org.joda.time.ReadablePartial) localDateTime70, (long) (short) 0);
        org.joda.time.LocalDateTime localDateTime75 = org.joda.time.LocalDateTime.parse("46");
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.year();
        int int77 = property76.getMinimumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property76.getFieldType();
        boolean boolean79 = localDateTime70.isSupported(dateTimeFieldType78);
        boolean boolean80 = localDateTime31.isSupported(dateTimeFieldType78);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime12.withField(dateTimeFieldType78, 35427774);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField41", Math.signum(durationField2.compareTo(durationField41)) == -Math.signum(durationField41.compareTo(durationField2)));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str1 = copticChronology0.toString();
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology2);
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str6 = copticChronology5.toString();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology5.weekyearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.dayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology8);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withSecondOfMinute(43);
        int[] intArray16 = copticChronology5.get((org.joda.time.ReadablePartial) localDateTime14, (long) 43);
        copticChronology0.validate((org.joda.time.ReadablePartial) localDateTime4, intArray16);
        java.lang.String str18 = copticChronology0.toString();
        org.joda.time.DurationField durationField19 = copticChronology0.minutes();
        org.joda.time.DurationField durationField20 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField20", Math.signum(durationField19.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField19)));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime2.withTime(23, 4, 9, 0);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("106");
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str19 = dateTimeZone18.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        java.util.TimeZone timeZone21 = dateTimeZone18.toTimeZone();
        long long23 = dateTimeZone15.getMillisKeepLocal(dateTimeZone18, 5431484632041L);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str25 = copticChronology24.toString();
        org.joda.time.DurationField durationField26 = copticChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology24.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = copticChronology24.getZone();
        int int30 = dateTimeZone28.getStandardOffset((long) 946);
        long long32 = dateTimeZone18.getMillisKeepLocal(dateTimeZone28, 1644572622671L);
        java.util.Locale locale34 = java.util.Locale.CANADA;
        java.util.Locale locale35 = java.util.Locale.CANADA;
        java.lang.String str36 = locale34.getDisplayName(locale35);
        java.lang.String str37 = locale34.getDisplayVariant();
        java.util.Locale locale39 = new java.util.Locale("Greenwich Mean Time");
        java.lang.String str40 = locale34.getDisplayVariant(locale39);
        java.lang.String str41 = dateTimeZone18.getShortName((long) 535, locale34);
        org.joda.time.DateTime dateTime42 = localDateTime2.toDateTime(dateTimeZone18);
        java.lang.String str44 = dateTimeZone18.getNameKey(1644572613740L);
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str46 = copticChronology45.toString();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        long long50 = copticChronology45.add(readablePeriod47, (long) (byte) -1, (-1));
        org.joda.time.DurationField durationField51 = copticChronology45.halfdays();
        org.joda.time.DurationField durationField52 = copticChronology45.millis();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        long long56 = copticChronology45.add(readablePeriod53, (long) '#', 43);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) 'x');
        org.joda.time.Chronology chronology59 = copticChronology45.withZone(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology45.year();
        org.joda.time.DateTimeField dateTimeField61 = copticChronology45.clockhourOfHalfday();
        org.joda.time.DurationField durationField62 = copticChronology45.hours();
        org.joda.time.DurationField durationField63 = copticChronology45.years();
        org.joda.time.Chronology chronology64 = copticChronology45.withUTC();
        boolean boolean65 = dateTimeZone18.equals((java.lang.Object) chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField26 and durationField63", (durationField26.compareTo(durationField63) == 0) == durationField26.equals(durationField63));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str1 = copticChronology0.toString();
        org.joda.time.DurationField durationField2 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology3);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) (byte) 0);
        long long9 = copticChronology0.set((org.joda.time.ReadablePartial) localDateTime5, (long) 100);
        org.joda.time.DurationField durationField10 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        boolean boolean14 = copticChronology0.equals((java.lang.Object) locale13);
        org.joda.time.DurationField durationField15 = copticChronology0.days();
        org.joda.time.DurationField durationField16 = copticChronology0.years();
        org.joda.time.DurationField durationField17 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str1 = copticChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) -1, (-1));
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.dayOfYear();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology7);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusDays((int) (byte) 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDateTime11.getFields();
        int int13 = localDateTime11.getYearOfCentury();
        int int14 = localDateTime11.size();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.dayOfYear();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology15);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.hourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plusYears((int) (short) -1);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.dayOfYear();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology23);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime17.withFields((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withMillisOfDay((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusMonths(103981);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withPeriodAdded(readablePeriod33, 10);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withYearOfEra(7);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withMillisOfDay(154);
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.secondOfMinute();
        int[] intArray41 = localDateTime37.getValues();
        copticChronology0.validate((org.joda.time.ReadablePartial) localDateTime11, intArray41);
        org.joda.time.DurationField durationField43 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField43, and durationField6", !(durationField6.compareTo(durationField43) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField43.compareTo(durationField6))));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str1 = copticChronology0.toString();
        org.joda.time.DurationField durationField2 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology3);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) (byte) 0);
        long long9 = copticChronology0.set((org.joda.time.ReadablePartial) localDateTime5, (long) 100);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.dayOfYear();
        org.joda.time.DurationField durationField16 = copticChronology14.weeks();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.dayOfYear();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology17);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusSeconds(100);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plus(readablePeriod22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.minuteOfHour();
        int int25 = localDateTime21.getYearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.dayOfYear();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology26);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.millisOfSecond();
        org.joda.time.LocalDateTime.Property property32 = localDateTime28.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.weekyear();
        org.joda.time.LocalDateTime localDateTime35 = property34.withMaximumValue();
        int int36 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.plusMillis(691);
        int[] intArray40 = copticChronology14.get((org.joda.time.ReadablePartial) localDateTime38, 1644572716891L);
        int int41 = localDateTime38.getYearOfEra();
        int[] intArray43 = copticChronology0.get((org.joda.time.ReadablePartial) localDateTime38, 1644573511062L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField13", Math.signum(durationField2.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField2)));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusYears((int) (short) -1);
        int[] intArray8 = localDateTime7.getValues();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusDays(4);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusMinutes(36000000);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str15 = dateTimeZone14.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        java.lang.String str18 = dateTimeZone14.getShortName((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime20 = localDateTime12.toDateTime(dateTimeZone14);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.dayOfYear();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology21);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withWeekyear(700);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.minusMillis(593);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMillisOfSecond(564);
        boolean boolean33 = dateTime20.equals((java.lang.Object) localDateTime32);
        org.joda.time.Instant instant34 = dateTime20.toInstant();
        org.joda.time.Instant instant35 = instant34.toInstant();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (byte) 10);
        int int38 = localDateTime37.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusDays(687);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.plusMonths(997);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.parse("976");
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology46.dayOfYear();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology46);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property51 = localDateTime48.millisOfSecond();
        java.util.Locale locale52 = java.util.Locale.ENGLISH;
        java.lang.String str53 = property51.getAsText(locale52);
        long long54 = property51.remainder();
        org.joda.time.LocalDateTime localDateTime55 = property51.roundHalfFloorCopy();
        java.lang.String str56 = property51.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property51.getFieldType();
        org.joda.time.LocalDateTime.Property property58 = localDateTime45.property(dateTimeFieldType57);
        int int59 = localDateTime43.get(dateTimeFieldType57);
        boolean boolean60 = instant34.isSupported(dateTimeFieldType57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant34", (dateTime20.compareTo(instant34) == 0) == dateTime20.equals(instant34));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str1 = copticChronology0.toString();
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology2);
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str6 = copticChronology5.toString();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology5.weekyearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.dayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology8);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withSecondOfMinute(43);
        int[] intArray16 = copticChronology5.get((org.joda.time.ReadablePartial) localDateTime14, (long) 43);
        copticChronology0.validate((org.joda.time.ReadablePartial) localDateTime4, intArray16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology0.getZone();
        org.joda.time.DurationField durationField21 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField23 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField23, and durationField21", !(durationField21.compareTo(durationField23) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField23.compareTo(durationField21))));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.getID();
        boolean boolean4 = dateTimeZone1.isStandardOffset(10L);
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone1);
        java.lang.String str9 = dateTimeZone1.getNameKey((long) 113);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.dayOfYear();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology11);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plusYears((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime18.toDateTime(readableInstant19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.yearOfCentury();
        int int22 = localDateTime18.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.plusYears(700);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.plusMillis(51);
        org.joda.time.LocalDateTime.Property property29 = localDateTime24.dayOfMonth();
        java.util.Date date30 = localDateTime24.toDate();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.fromDateFields(date30);
        boolean boolean32 = timeZone10.inDaylightTime(date30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime24 and localDateTime31", (localDateTime24.compareTo(localDateTime31) == 0) == localDateTime24.equals(localDateTime31));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str1 = copticChronology0.toString();
        org.joda.time.DurationField durationField2 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology3);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) (byte) 0);
        long long9 = copticChronology0.set((org.joda.time.ReadablePartial) localDateTime5, (long) 100);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = copticChronology0.hours();
        org.joda.time.DurationField durationField13 = copticChronology0.minutes();
        org.joda.time.Chronology chronology14 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField19 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField20 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField2, and durationField12", !(durationField20.compareTo(durationField2) == 0) || (Math.signum(durationField20.compareTo(durationField12)) == Math.signum(durationField2.compareTo(durationField12))));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("496");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str4 = dateTimeZone3.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.util.TimeZone timeZone6 = dateTimeZone3.toTimeZone();
        boolean boolean7 = timeZone1.hasSameRules(timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        int int10 = timeZone6.getOffset(5431484692575L);
        int int11 = timeZone6.getRawOffset();
        java.lang.String str12 = timeZone6.getID();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.dayOfYear();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology13);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = property18.getAsText(locale19);
        org.joda.time.Interval interval21 = property18.toInterval();
        org.joda.time.LocalDateTime localDateTime22 = property18.roundFloorCopy();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str24 = copticChronology23.toString();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = copticChronology23.add(readablePeriod25, (long) (byte) -1, (-1));
        org.joda.time.DateTimeField dateTimeField29 = copticChronology23.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology23.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology23.secondOfDay();
        boolean boolean32 = localDateTime22.equals((java.lang.Object) dateTimeField31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime22.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundHalfCeilingCopy();
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology35.dayOfYear();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology35);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.millisOfSecond();
        java.util.Locale locale41 = java.util.Locale.ENGLISH;
        java.lang.String str42 = property40.getAsText(locale41);
        long long43 = property40.remainder();
        org.joda.time.LocalDateTime localDateTime44 = property40.roundHalfFloorCopy();
        int int45 = property40.getMinimumValue();
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology46.dayOfYear();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology46);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property51 = localDateTime48.millisOfSecond();
        java.util.Locale locale52 = java.util.Locale.ENGLISH;
        java.lang.String str53 = property51.getAsText(locale52);
        long long54 = property51.remainder();
        org.joda.time.LocalDateTime localDateTime55 = property51.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.withDayOfYear((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.minus(readableDuration58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.year();
        int int61 = property40.compareTo((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime34.withFields((org.joda.time.ReadablePartial) localDateTime59);
        int int63 = localDateTime34.getMonthOfYear();
        java.util.Date date64 = localDateTime34.toDate();
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.fromDateFields(date64);
        boolean boolean66 = timeZone6.inDaylightTime(date64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime34 and localDateTime65", (localDateTime34.compareTo(localDateTime65) == 0) == localDateTime34.equals(localDateTime65));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str1 = copticChronology0.toString();
        org.joda.time.DurationField durationField2 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology3);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) (byte) 0);
        long long9 = copticChronology0.set((org.joda.time.ReadablePartial) localDateTime5, (long) 100);
        org.joda.time.DurationField durationField10 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.dayOfYear();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology12);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusYears((int) (short) -1);
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.dayOfYear();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withMillisOfDay((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.plusYears((int) 'x');
        long long31 = copticChronology0.set((org.joda.time.ReadablePartial) localDateTime29, (long) 1);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology0.halfdayOfDay();
        long long36 = copticChronology0.add(1644572635634L, (long) 467, 625);
        org.joda.time.DurationField durationField37 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField37", (durationField2.compareTo(durationField37) == 0) == durationField2.equals(durationField37));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str1 = copticChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) -1, (-1));
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DurationField durationField10 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField12 = copticChronology0.hours();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField6, and durationField7", !(durationField13.compareTo(durationField6) == 0) || (Math.signum(durationField13.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str1 = copticChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) -1, (-1));
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField10 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.year();
        org.joda.time.DurationField durationField15 = copticChronology0.years();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField15", (durationField12.compareTo(durationField15) == 0) == durationField12.equals(durationField15));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusYears((int) (short) -1);
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.dayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology8);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime2.withDayOfYear(100);
        org.joda.time.LocalDateTime.Property property16 = localDateTime2.dayOfMonth();
        int int17 = property16.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime18 = property16.withMinimumValue();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.dayOfYear();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology19);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.plusYears((int) (short) -1);
        int[] intArray27 = localDateTime26.getValues();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusDays(4);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusMinutes(36000000);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str34 = dateTimeZone33.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        java.lang.String str37 = dateTimeZone33.getShortName((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime39 = localDateTime31.toDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime39.getZone();
        org.joda.time.chrono.CopticChronology copticChronology41 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology41.dayOfYear();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology41);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property46 = localDateTime43.hourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.plusYears((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.DateTime dateTime50 = localDateTime48.toDateTime(readableInstant49);
        org.joda.time.chrono.CopticChronology copticChronology51 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology51.dayOfYear();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology51);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minusDays((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property56 = localDateTime53.hourOfDay();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.plusYears((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime58.toDateTime(readableInstant59);
        boolean boolean61 = dateTime50.isEqual((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Instant instant62 = dateTime60.toInstant();
        java.lang.String str63 = instant62.toString();
        java.lang.String str64 = instant62.toString();
        boolean boolean65 = dateTime39.isAfter((org.joda.time.ReadableInstant) instant62);
        int int66 = property16.getDifference((org.joda.time.ReadableInstant) dateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant62", (dateTime50.compareTo(instant62) == 0) == dateTime50.equals(instant62));
    }
}

