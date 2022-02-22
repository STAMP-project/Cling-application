import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.Interval interval9 = interval8.toInterval();
        long long10 = interval8.toDurationMillis();
        long long11 = interval8.getEndMillis();
        org.joda.time.Interval interval12 = interval8.toInterval();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localTime15.toDateTime(readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int23 = dateTimeZone21.getOffset((long) (byte) 1);
        long long25 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 3);
        org.joda.time.DateTime dateTime26 = dateTime17.withZone(dateTimeZone19);
        org.joda.time.DateTime dateTime28 = dateTime17.minus((long) '#');
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localTime31.toDateTime(readableInstant32);
        org.joda.time.Chronology chronology34 = localTime31.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.weekyears();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localTime39.toDateTime(readableInstant40);
        org.joda.time.Chronology chronology42 = localTime39.getChronology();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (byte) 1, chronology42);
        int[] intArray45 = chronology34.get((org.joda.time.ReadablePartial) localTime43, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField46 = chronology34.dayOfYear();
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.DateTime dateTime51 = localTime49.toDateTime(readableInstant50);
        org.joda.time.LocalTime localTime52 = dateTime51.toLocalTime();
        org.joda.time.DateTime.Property property53 = dateTime51.minuteOfHour();
        int int54 = property53.get();
        org.joda.time.Interval interval55 = property53.toInterval();
        org.joda.time.DateTime dateTime56 = interval55.getEnd();
        org.joda.time.Period period57 = interval55.toPeriod();
        int[] intArray59 = chronology34.get((org.joda.time.ReadablePeriod) period57, (long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.DateTime dateTime65 = localTime63.toDateTime(readableInstant64);
        org.joda.time.Chronology chronology66 = localTime63.getChronology();
        org.joda.time.DurationField durationField67 = chronology66.weekyears();
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.DateTime dateTime73 = localTime71.toDateTime(readableInstant72);
        org.joda.time.Chronology chronology74 = localTime71.getChronology();
        org.joda.time.LocalTime localTime75 = new org.joda.time.LocalTime((long) (byte) 1, chronology74);
        int[] intArray77 = chronology66.get((org.joda.time.ReadablePartial) localTime75, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField78 = chronology66.dayOfYear();
        org.joda.time.DurationField durationField79 = durationFieldType60.getField(chronology66);
        int int80 = period57.get(durationFieldType60);
        org.joda.time.DateTime dateTime81 = dateTime17.minus((org.joda.time.ReadablePeriod) period57);
        int int82 = period57.size();
        org.joda.time.Interval interval83 = interval12.withPeriodAfterStart((org.joda.time.ReadablePeriod) period57);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.Interval interval85 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period57, readableInstant84);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60000L + "'", long10 == 60000L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1645402259990L + "'", long11 == 1645402259990L);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3L + "'", long25 == 3L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 8 + "'", int82 == 8);
        org.junit.Assert.assertNotNull(interval83);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) "18");
        int int2 = localTime1.getMinuteOfHour();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        long long2 = calendar0.getTimeInMillis();
        calendar0.set((-100800), 600, 8);
        int int7 = calendar0.getMinimalDaysInFirstWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTime(readableInstant14);
        org.joda.time.Chronology chronology16 = localTime13.getChronology();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (byte) 1, chronology16);
        boolean boolean18 = dateTimeFieldType9.isSupported(chronology16);
        org.joda.time.DateTimeField dateTimeField19 = chronology16.centuryOfEra();
        java.lang.String str20 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType8.getField(chronology16);
        boolean boolean22 = calendar0.after((java.lang.Object) chronology16);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localTime27.toDateTime(readableInstant28);
        org.joda.time.Chronology chronology30 = localTime27.getChronology();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (byte) 1, chronology30);
        boolean boolean32 = dateTimeFieldType23.isSupported(chronology30);
        org.joda.time.DateTimeField dateTimeField33 = chronology30.centuryOfEra();
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.now(chronology30);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(chronology30);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localTime39.toDateTime(readableInstant40);
        org.joda.time.Chronology chronology42 = localTime39.getChronology();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (byte) 1, chronology42);
        org.joda.time.DateTime dateTime44 = localTime43.toDateTimeToday();
        org.joda.time.LocalTime localTime46 = localTime43.minusMinutes(1);
        org.joda.time.LocalTime.Property property47 = localTime43.millisOfDay();
        org.joda.time.LocalTime localTime48 = localTime35.withFields((org.joda.time.ReadablePartial) localTime43);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) 1);
        int[] intArray51 = localTime50.getValues();
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.DateTime dateTime56 = localTime54.toDateTime(readableInstant55);
        org.joda.time.LocalTime localTime57 = dateTime56.toLocalTime();
        org.joda.time.DateTime.Property property58 = dateTime56.minuteOfHour();
        int int59 = property58.getMinimumValue();
        org.joda.time.DateTime dateTime60 = property58.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime63 = null;
        boolean boolean64 = dateTimeZone62.isLocalDateTimeGap(localDateTime63);
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime(dateTimeZone62);
        org.joda.time.DateTime dateTime66 = dateTime60.withZoneRetainFields(dateTimeZone62);
        int int67 = dateTime66.getDayOfWeek();
        org.joda.time.DateTime dateTime68 = localTime50.toDateTime((org.joda.time.ReadableInstant) dateTime66);
        boolean boolean69 = localTime48.isAfter((org.joda.time.ReadablePartial) localTime50);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType71 = dateTimeFieldType70.getDurationType();
        java.lang.String str72 = durationFieldType71.toString();
        org.joda.time.LocalTime localTime75 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.DateTime dateTime77 = localTime75.toDateTime(readableInstant76);
        org.joda.time.Chronology chronology78 = localTime75.getChronology();
        org.joda.time.DurationField durationField79 = chronology78.weekyears();
        org.joda.time.LocalTime localTime83 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.DateTime dateTime85 = localTime83.toDateTime(readableInstant84);
        org.joda.time.Chronology chronology86 = localTime83.getChronology();
        org.joda.time.LocalTime localTime87 = new org.joda.time.LocalTime((long) (byte) 1, chronology86);
        int[] intArray89 = chronology78.get((org.joda.time.ReadablePartial) localTime87, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField90 = chronology78.yearOfCentury();
        org.joda.time.DurationField durationField91 = durationFieldType71.getField(chronology78);
        org.joda.time.LocalTime localTime93 = localTime50.withFieldAdded(durationFieldType71, 1439);
        boolean boolean94 = calendar0.after((java.lang.Object) 1439);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=-100800,MONTH=600,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=8,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=28,MILLISECOND=374,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645455448374L + "'", long2 == 1645455448374L);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ISOChronology[UTC]" + "'", str20, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(intArray51);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 0, 0, 11]");
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "halfdays" + "'", str72, "halfdays");
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField90);
        org.junit.Assert.assertNotNull(durationField91);
        org.junit.Assert.assertNotNull(localTime93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 1, chronology14);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localTime15, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField18 = chronology6.dayOfYear();
        org.joda.time.DurationField durationField19 = durationFieldType0.getField(chronology6);
        org.joda.time.DurationFieldType durationFieldType20 = durationField19.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getRangeDurationType();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.DateTime dateTime27 = localTime25.toDateTime(readableInstant26);
        org.joda.time.Chronology chronology28 = localTime25.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.weekyears();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localTime33.toDateTime(readableInstant34);
        org.joda.time.Chronology chronology36 = localTime33.getChronology();
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((long) (byte) 1, chronology36);
        int[] intArray39 = chronology28.get((org.joda.time.ReadablePartial) localTime37, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField40 = chronology28.dayOfYear();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.DateTime dateTime45 = localTime43.toDateTime(readableInstant44);
        org.joda.time.LocalTime localTime46 = dateTime45.toLocalTime();
        org.joda.time.DateTime.Property property47 = dateTime45.minuteOfHour();
        int int48 = property47.get();
        org.joda.time.Interval interval49 = property47.toInterval();
        org.joda.time.DateTime dateTime50 = interval49.getEnd();
        org.joda.time.Period period51 = interval49.toPeriod();
        int[] intArray53 = chronology28.get((org.joda.time.ReadablePeriod) period51, (long) (byte) 100);
        org.joda.time.DateTimeField dateTimeField54 = chronology28.weekOfWeekyear();
        boolean boolean55 = dateTimeFieldType21.isSupported(chronology28);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localTime58.toDateTime(readableInstant59);
        org.joda.time.Chronology chronology61 = localTime58.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.weekyears();
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType21.getField(chronology61);
        org.joda.time.LocalTime localTime64 = org.joda.time.LocalTime.now(chronology61);
        java.lang.String str65 = chronology61.toString();
        org.joda.time.DateTimeField dateTimeField66 = chronology61.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField67 = chronology61.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField68 = chronology61.millisOfSecond();
        org.joda.time.DurationField durationField69 = durationFieldType20.getField(chronology61);
        java.lang.String str70 = durationFieldType20.getName();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ISOChronology[UTC]" + "'", str65, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hours" + "'", str70, "hours");
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekOfWeekyear(5);
        org.joda.time.DateTime dateTime10 = dateTime4.plusMinutes(53283606);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTime(readableInstant14);
        org.joda.time.LocalTime localTime16 = dateTime15.toLocalTime();
        org.joda.time.DateTime.Property property17 = dateTime15.minuteOfHour();
        int int18 = property17.get();
        org.joda.time.Interval interval19 = property17.toInterval();
        org.joda.time.Interval interval20 = interval19.toInterval();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localTime23.toDateTime(readableInstant24);
        org.joda.time.LocalTime localTime26 = dateTime25.toLocalTime();
        org.joda.time.DateTime.Property property27 = dateTime25.minuteOfHour();
        int int28 = property27.getMinimumValue();
        org.joda.time.DateTime dateTime29 = property27.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = dateTimeZone31.isLocalDateTimeGap(localDateTime32);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime29.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) dateTime35);
        org.joda.time.Interval interval37 = null; // flaky: interval20.withEnd((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Period period38 = null; // flaky: interval37.toPeriod();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Interval interval40 = null; // flaky: interval37.withDurationAfterStart(readableDuration39);
        org.joda.time.Duration duration41 = null; // flaky: interval40.toDuration();
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localTime44.toDateTime(readableInstant45);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int52 = dateTimeZone50.getOffset((long) (byte) 1);
        long long54 = dateTimeZone48.getMillisKeepLocal(dateTimeZone50, (long) 3);
        org.joda.time.DateTime dateTime55 = dateTime46.withZone(dateTimeZone48);
        org.joda.time.DateTime dateTime57 = dateTime46.minus((long) '#');
        org.joda.time.DateTime.Property property58 = dateTime46.weekyear();
        org.joda.time.DateTime dateTime60 = dateTime46.minusWeeks((int) (byte) -1);
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.DateTime dateTime65 = localTime63.toDateTime(readableInstant64);
        org.joda.time.LocalTime localTime66 = dateTime65.toLocalTime();
        org.joda.time.DateTime.Property property67 = dateTime65.minuteOfHour();
        int int68 = property67.get();
        org.joda.time.Interval interval69 = property67.toInterval();
        org.joda.time.Interval interval70 = interval69.toInterval();
        org.joda.time.LocalTime localTime73 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.DateTime dateTime75 = localTime73.toDateTime(readableInstant74);
        org.joda.time.LocalTime localTime76 = dateTime75.toLocalTime();
        org.joda.time.DateTime.Property property77 = dateTime75.minuteOfHour();
        int int78 = property77.getMinimumValue();
        org.joda.time.DateTime dateTime79 = property77.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime82 = null;
        boolean boolean83 = dateTimeZone81.isLocalDateTimeGap(localDateTime82);
        org.joda.time.LocalTime localTime84 = new org.joda.time.LocalTime(dateTimeZone81);
        org.joda.time.DateTime dateTime85 = dateTime79.withZoneRetainFields(dateTimeZone81);
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((java.lang.Object) dateTime85);
        org.joda.time.Interval interval87 = null; // flaky: interval70.withEnd((org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.Duration duration88 = interval70.toDuration();
        org.joda.time.Interval interval89 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableDuration) duration88);
        boolean boolean90 = false; // flaky: duration41.isLongerThan((org.joda.time.ReadableDuration) duration88);
        org.joda.time.Period period91 = duration88.toPeriod();
        org.joda.time.Interval interval92 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration88);
        long long93 = duration88.getMillis();
        org.joda.time.Duration duration94 = duration88.toDuration();
        org.joda.time.Period period95 = duration88.toPeriod();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertNotNull(interval37);
// flaky:         org.junit.Assert.assertNotNull(period38);
// flaky:         org.junit.Assert.assertNotNull(interval40);
// flaky:         org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 3L + "'", long54 == 3L);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(dateTimeZone81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(dateTime85);
// flaky:         org.junit.Assert.assertNotNull(interval87);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 60000L + "'", long93 == 60000L);
        org.junit.Assert.assertNotNull(duration94);
        org.junit.Assert.assertNotNull(period95);
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(0L, 1645455158451L, chronology2);
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfMonth();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.LocalTime localTime12 = localTime10.plusHours((int) 'u');
        org.joda.time.LocalTime localTime14 = localTime10.withMillisOfSecond(1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int20 = dateTimeZone18.getOffset((long) (byte) 1);
        long long22 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 3);
        long long25 = dateTimeZone16.convertLocalToUTC((long) 9, false);
        java.lang.String str26 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime27 = localTime14.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMillis(2);
        int int30 = dateTime29.getDayOfMonth();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localTime33.toDateTime(readableInstant34);
        org.joda.time.LocalTime localTime36 = dateTime35.toLocalTime();
        int int37 = dateTime35.getMonthOfYear();
        int int38 = dateTime35.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int44 = dateTimeZone42.getOffset((long) (byte) 1);
        long long46 = dateTimeZone40.getMillisKeepLocal(dateTimeZone42, (long) 3);
        org.joda.time.DateTime dateTime47 = dateTime35.toDateTime(dateTimeZone42);
        org.joda.time.DateTime.Property property48 = dateTime35.dayOfYear();
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.DateTime dateTime54 = localTime52.toDateTime(readableInstant53);
        org.joda.time.Chronology chronology55 = localTime52.getChronology();
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime((long) (byte) 1, chronology55);
        org.joda.time.DateTime dateTime57 = localTime56.toDateTimeToday();
        org.joda.time.DateTime dateTime59 = dateTime57.minus(0L);
        int int60 = dateTime35.compareTo((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime62 = dateTime59.plus((long) 600000);
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.DateTime dateTime67 = localTime65.toDateTime(readableInstant66);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int73 = dateTimeZone71.getOffset((long) (byte) 1);
        long long75 = dateTimeZone69.getMillisKeepLocal(dateTimeZone71, (long) 3);
        org.joda.time.DateTime dateTime76 = dateTime67.withZone(dateTimeZone69);
        org.joda.time.DateTime dateTime78 = dateTime76.minusSeconds((int) 'u');
        java.util.GregorianCalendar gregorianCalendar79 = dateTime76.toGregorianCalendar();
        org.joda.time.DateTime.Property property80 = dateTime76.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int82 = dateTime76.get(dateTimeFieldType81);
        boolean boolean83 = dateTime62.isSupported(dateTimeFieldType81);
        org.joda.time.DurationFieldType durationFieldType84 = dateTimeFieldType81.getDurationType();
        boolean boolean85 = dateTime29.isSupported(dateTimeFieldType81);
        org.joda.time.Instant instant86 = dateTime29.toInstant();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.010" + "'", str26, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21 + "'", int30 == 21);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 3L + "'", long46 == 3L);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 3L + "'", long75 == 3L);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(gregorianCalendar79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 52 + "'", int82 == 52);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(durationFieldType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(instant86);
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        int int7 = dateTime4.getHourOfDay();
        org.joda.time.DateTime.Property property8 = dateTime4.dayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfWeek();
        org.joda.time.DateTime dateTime12 = property10.addToCopy(53);
        org.joda.time.DateTime dateTime14 = property10.addToCopy(86399);
        long long15 = property10.remainder();
        org.joda.time.DateTime dateTime17 = property10.addWrapFieldToCopy(934);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600000L + "'", long15 == 600000L);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.Chronology chronology13 = localTime10.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 1, chronology13);
        int[] intArray16 = chronology5.get((org.joda.time.ReadablePartial) localTime14, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = chronology5.dayOfYear();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localTime20.toDateTime(readableInstant21);
        org.joda.time.LocalTime localTime23 = dateTime22.toLocalTime();
        org.joda.time.DateTime.Property property24 = dateTime22.minuteOfHour();
        int int25 = property24.get();
        org.joda.time.Interval interval26 = property24.toInterval();
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.Period period28 = interval26.toPeriod();
        int[] intArray30 = chronology5.get((org.joda.time.ReadablePeriod) period28, (long) (byte) 100);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localTime33.toDateTime(readableInstant34);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int41 = dateTimeZone39.getOffset((long) (byte) 1);
        long long43 = dateTimeZone37.getMillisKeepLocal(dateTimeZone39, (long) 3);
        org.joda.time.DateTime dateTime44 = dateTime35.withZone(dateTimeZone37);
        org.joda.time.DateTime dateTime46 = dateTime44.minusSeconds((int) 'u');
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime44, readableDuration47);
        org.joda.time.Period period49 = interval48.toPeriod();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = interval48.toPeriod(periodType50);
        org.joda.time.Period period52 = period51.toPeriod();
        int[] intArray55 = chronology5.get((org.joda.time.ReadablePeriod) period52, 19044L, (-60000L));
        org.joda.time.DateTimeField dateTimeField56 = chronology5.centuryOfEra();
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.DateTime dateTime61 = localTime59.toDateTime(readableInstant60);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localTime64.toDateTime(readableInstant65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalTime localTime68 = localTime64.plus(readablePeriod67);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean70 = localTime68.isSupported(dateTimeFieldType69);
        org.joda.time.DateTime dateTime71 = dateTime61.withFields((org.joda.time.ReadablePartial) localTime68);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int77 = dateTimeZone75.getOffset((long) (byte) 1);
        long long79 = dateTimeZone73.getMillisKeepLocal(dateTimeZone75, (long) 3);
        long long82 = dateTimeZone73.convertLocalToUTC((long) 9, false);
        java.lang.String str83 = dateTimeZone73.toString();
        org.joda.time.DateTime dateTime84 = localTime68.toDateTimeToday(dateTimeZone73);
        org.joda.time.LocalTime localTime85 = org.joda.time.LocalTime.now(dateTimeZone73);
        org.joda.time.Chronology chronology86 = chronology5.withZone(dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField87 = chronology5.millisOfDay();
        org.joda.time.DateTimeField dateTimeField88 = chronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField89 = chronology5.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3L + "'", long43 == 3L);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 0, 0, 0, -1, -19, -44]");
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 3L + "'", long79 == 3L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-1L) + "'", long82 == (-1L));
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "+00:00:00.010" + "'", str83, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(localTime85);
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertNotNull(dateTimeField87);
        org.junit.Assert.assertNotNull(dateTimeField88);
        org.junit.Assert.assertNotNull(dateTimeField89);
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder1.build();
        java.lang.String str4 = locale3.getDisplayScript();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTime(readableInstant8);
        org.joda.time.Chronology chronology10 = localTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone13.isLocalDateTimeGap(localDateTime14);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (byte) 0, dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = localTime16.toString(dateTimeFormatter17);
        org.joda.time.Chronology chronology19 = localTime16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology19.getZone();
        long long23 = dateTimeZone20.convertLocalToUTC(0L, true);
        org.joda.time.DateTime dateTime24 = localTime7.toDateTimeToday(dateTimeZone20);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localTime27.toDateTime(readableInstant28);
        org.joda.time.LocalTime localTime30 = dateTime29.toLocalTime();
        org.joda.time.DateTime.Property property31 = dateTime29.minuteOfHour();
        java.lang.String str32 = property31.getAsString();
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = dateTimeFormatter35.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter35.withDefaultYear(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter35.withZoneUTC();
        boolean boolean40 = dateTimeFormatter39.isOffsetParsed();
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter39.withLocale(locale41);
        int int44 = property31.getMaximumTextLength(locale41);
        java.util.Calendar calendar45 = dateTime24.toCalendar(locale41);
        java.lang.String str46 = locale3.getDisplayScript(locale41);
        java.lang.String str47 = locale41.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00:00:00.010" + "'", str18, "00:00:00.010");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10" + "'", str32, "10");
        org.junit.Assert.assertNull(dateTimePrinter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(calendar45);
        org.junit.Assert.assertEquals(calendar45.toString(), "java.util.GregorianCalendar[time=1645402200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=10,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        int int7 = dateTime4.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, readablePeriod8);
        org.joda.time.DateTime dateTime11 = dateTime4.plusMinutes(5);
        org.joda.time.DateTime.Property property12 = dateTime4.yearOfCentury();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localTime16.toDateTime(readableInstant17);
        org.joda.time.LocalTime localTime19 = dateTime18.toLocalTime();
        org.joda.time.DateTime.Property property20 = dateTime18.minuteOfHour();
        int int21 = property20.getMinimumValue();
        org.joda.time.DateTime dateTime22 = property20.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfYear();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.DateTime dateTime28 = localTime26.toDateTime(readableInstant27);
        org.joda.time.LocalTime localTime29 = dateTime28.toLocalTime();
        org.joda.time.DateTime.Property property30 = dateTime28.minuteOfHour();
        java.lang.String str31 = property30.toString();
        org.joda.time.DateTime dateTime32 = property30.roundFloorCopy();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.minus(readableDuration33);
        long long35 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        int int36 = property12.getDifference((org.joda.time.ReadableInstant) dateTime34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime38 = property12.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "22" + "'", str13, "22");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Property[minuteOfHour]" + "'", str31, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.Chronology chronology13 = localTime10.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 1, chronology13);
        int[] intArray16 = chronology5.get((org.joda.time.ReadablePartial) localTime14, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = chronology5.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localTime22.toDateTime(readableInstant23);
        org.joda.time.Chronology chronology25 = localTime22.getChronology();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (byte) 1, chronology25);
        boolean boolean27 = dateTimeFieldType18.isSupported(chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localTime32.toDateTime(readableInstant33);
        org.joda.time.Chronology chronology35 = localTime32.getChronology();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (byte) 1, chronology35);
        int int37 = dateTimeField28.getMaximumValue((org.joda.time.ReadablePartial) localTime36);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) 1);
        int[] intArray40 = localTime39.getValues();
        int int41 = dateTimeField17.getMaximumValue((org.joda.time.ReadablePartial) localTime36, intArray40);
        org.joda.time.LocalTime.Property property42 = localTime36.millisOfSecond();
        org.joda.time.LocalTime localTime43 = property42.getLocalTime();
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localTime46.toDateTime(readableInstant47);
        org.joda.time.LocalTime localTime49 = dateTime48.toLocalTime();
        org.joda.time.DateTime.Property property50 = dateTime48.minuteOfHour();
        org.joda.time.DateTime dateTime52 = dateTime48.plusWeeks(0);
        int int53 = dateTime52.getYearOfEra();
        org.joda.time.DateTime.Property property54 = dateTime52.year();
        int int55 = dateTime52.getYearOfCentury();
        int int56 = property42.compareTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.LocalTime localTime57 = property42.roundCeilingCopy();
        org.joda.time.LocalTime localTime59 = property42.addCopy(1645455173710L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime61 = property42.setCopy("14:53:00.000");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"14:53:00.000\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2922789 + "'", int37 == 2922789);
        org.junit.Assert.assertNotNull(intArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 0, 11]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 366 + "'", int41 == 366);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2022 + "'", int53 == 2022);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 22 + "'", int55 == 22);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime59);
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 45, 1645454972356L);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTime(readableInstant6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int13 = dateTimeZone11.getOffset((long) (byte) 1);
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 3);
        org.joda.time.DateTime dateTime16 = dateTime7.withZone(dateTimeZone9);
        org.joda.time.DateTime dateTime18 = dateTime7.minus((long) '#');
        org.joda.time.DateTime.Property property19 = dateTime7.weekyear();
        org.joda.time.DateTime dateTime21 = dateTime7.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime7.toDateTime();
        org.joda.time.DateTime dateTime24 = dateTime7.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime26 = dateTime7.withSecondOfMinute(0);
        boolean boolean27 = interval2.isBefore((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime28 = interval2.getEnd();
        org.joda.time.Chronology chronology29 = interval2.getChronology();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localTime4.toDateTime(readableInstant5);
        org.joda.time.Chronology chronology7 = localTime4.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 1, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfMonth();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.year();
        boolean boolean13 = durationFieldType0.isSupported(chronology11);
        org.joda.time.DurationField durationField14 = chronology11.millis();
        java.lang.String str15 = durationField14.getName();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "millis" + "'", str15, "millis");
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.getMinimumValue();
        org.joda.time.DateTime dateTime8 = property6.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone10.isLocalDateTimeGap(localDateTime11);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = dateTime8.withZoneRetainFields(dateTimeZone10);
        int int15 = dateTime14.getDayOfWeek();
        java.util.GregorianCalendar gregorianCalendar16 = dateTime14.toGregorianCalendar();
        org.joda.time.DateTime.Property property17 = dateTime14.secondOfDay();
        org.joda.time.DateTime dateTime18 = property17.roundCeilingCopy();
        org.joda.time.DateTime dateTime19 = property17.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField20 = property17.getField();
        int int21 = property17.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 86399 + "'", int21 == 86399);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfMonth();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.LocalTime localTime12 = localTime10.plusHours((int) 'u');
        org.joda.time.LocalTime localTime14 = localTime10.withMillisOfSecond(1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int20 = dateTimeZone18.getOffset((long) (byte) 1);
        long long22 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 3);
        long long25 = dateTimeZone16.convertLocalToUTC((long) 9, false);
        java.lang.String str26 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime27 = localTime14.toDateTimeToday(dateTimeZone16);
        org.joda.time.LocalTime localTime29 = localTime14.minusMillis(21);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localTime32.toDateTime(readableInstant33);
        org.joda.time.Chronology chronology35 = localTime32.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.weekyears();
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localTime40.toDateTime(readableInstant41);
        org.joda.time.Chronology chronology43 = localTime40.getChronology();
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((long) (byte) 1, chronology43);
        int[] intArray46 = chronology35.get((org.joda.time.ReadablePartial) localTime44, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField47 = chronology35.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.DateTime dateTime54 = localTime52.toDateTime(readableInstant53);
        org.joda.time.Chronology chronology55 = localTime52.getChronology();
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime((long) (byte) 1, chronology55);
        boolean boolean57 = dateTimeFieldType48.isSupported(chronology55);
        org.joda.time.DateTimeField dateTimeField58 = chronology55.centuryOfEra();
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.DateTime dateTime64 = localTime62.toDateTime(readableInstant63);
        org.joda.time.Chronology chronology65 = localTime62.getChronology();
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime((long) (byte) 1, chronology65);
        int int67 = dateTimeField58.getMaximumValue((org.joda.time.ReadablePartial) localTime66);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime((long) 1);
        int[] intArray70 = localTime69.getValues();
        int int71 = dateTimeField47.getMaximumValue((org.joda.time.ReadablePartial) localTime66, intArray70);
        org.joda.time.LocalTime.Property property72 = localTime66.millisOfSecond();
        org.joda.time.LocalTime localTime73 = property72.getLocalTime();
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.DateTime dateTime78 = localTime76.toDateTime(readableInstant77);
        org.joda.time.LocalTime localTime79 = dateTime78.toLocalTime();
        org.joda.time.DateTime.Property property80 = dateTime78.minuteOfHour();
        org.joda.time.DateTime dateTime82 = dateTime78.plusWeeks(0);
        int int83 = dateTime82.getYearOfEra();
        org.joda.time.DateTime.Property property84 = dateTime82.year();
        int int85 = dateTime82.getYearOfCentury();
        int int86 = property72.compareTo((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.LocalTime localTime87 = property72.roundCeilingCopy();
        org.joda.time.LocalTime localTime89 = property72.addCopy(0);
        int int90 = localTime29.compareTo((org.joda.time.ReadablePartial) localTime89);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.010" + "'", str26, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2922789 + "'", int67 == 2922789);
        org.junit.Assert.assertNotNull(intArray70);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 0, 11]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 366 + "'", int71 == 366);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(localTime79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2022 + "'", int83 == 2022);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 22 + "'", int85 == 22);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(localTime87);
        org.junit.Assert.assertNotNull(localTime89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getISO3Language();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.DateTime dateTime8 = localTime6.toDateTime(readableInstant7);
        org.joda.time.Chronology chronology9 = localTime6.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weekyears();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTime(readableInstant15);
        org.joda.time.Chronology chronology17 = localTime14.getChronology();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 1, chronology17);
        int[] intArray20 = chronology9.get((org.joda.time.ReadablePartial) localTime18, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField21 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField22 = chronology9.weeks();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.DateTimeField dateTimeField24 = chronology9.era();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.lang.String str28 = dateTimeZone25.getShortName((long) 2922789, locale27);
        java.util.Locale locale29 = locale27.stripExtensions();
        int int30 = dateTimeField24.getMaximumShortTextLength(locale29);
        java.lang.String str31 = locale1.getDisplayScript(locale29);
        java.lang.Object obj32 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.010" + "'", str28, "+00:00:00.010");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        int int7 = dateTime4.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int13 = dateTimeZone11.getOffset((long) (byte) 1);
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 3);
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(dateTimeZone11);
        org.joda.time.DateTime.Property property17 = dateTime4.dayOfYear();
        org.joda.time.DateTime dateTime18 = property17.roundCeilingCopy();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localTime21.toDateTime(readableInstant22);
        org.joda.time.LocalTime localTime24 = dateTime23.toLocalTime();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localTime27.toDateTime(readableInstant28);
        org.joda.time.LocalTime localTime30 = dateTime29.toLocalTime();
        org.joda.time.LocalTime localTime32 = localTime30.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.era();
        int int34 = localTime30.indexOf(dateTimeFieldType33);
        boolean boolean35 = localTime24.isSupported(dateTimeFieldType33);
        org.joda.time.LocalTime localTime37 = localTime24.plusSeconds((-100800));
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localTime40.toDateTime(readableInstant41);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int48 = dateTimeZone46.getOffset((long) (byte) 1);
        long long50 = dateTimeZone44.getMillisKeepLocal(dateTimeZone46, (long) 3);
        org.joda.time.DateTime dateTime51 = dateTime42.withZone(dateTimeZone44);
        org.joda.time.DateTime dateTime53 = dateTime42.minus((long) '#');
        org.joda.time.DateTime.Property property54 = dateTime42.weekyear();
        org.joda.time.DateTime dateTime56 = dateTime42.minusWeeks((int) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.secondOfMinute();
        int int58 = dateTime56.get(dateTimeFieldType57);
        org.joda.time.LocalTime.Property property59 = localTime24.property(dateTimeFieldType57);
        int int60 = dateTime18.get(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 3L + "'", long50 == 3L);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u82f1\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 10);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.DateTime dateTime8 = localTime6.toDateTime(readableInstant7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int14 = dateTimeZone12.getOffset((long) (byte) 1);
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 3);
        org.joda.time.DateTime dateTime17 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.DateTime dateTime19 = dateTime8.minus((long) '#');
        org.joda.time.DateTime.Property property20 = dateTime8.weekyear();
        org.joda.time.DateTime dateTime22 = dateTime8.minusWeeks((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime8.getZone();
        boolean boolean25 = dateTimeZone23.isStandardOffset((long) 12);
        boolean boolean27 = dateTimeZone23.isStandardOffset((long) '4');
        long long29 = dateTimeZone3.getMillisKeepLocal(dateTimeZone23, (long) 23);
        long long32 = dateTimeZone23.adjustOffset((long) 95, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(63808214460000L, dateTimeZone23);
        org.joda.time.LocalTime localTime35 = dateTime34.toLocalTime();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 600013L + "'", long29 == 600013L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 95L + "'", long32 == 95L);
        org.junit.Assert.assertNotNull(localTime35);
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localTime4.toDateTime(readableInstant5);
        org.joda.time.Chronology chronology7 = localTime4.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 1, chronology7);
        boolean boolean9 = dateTimeFieldType0.isSupported(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.centuryOfEra();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTime(readableInstant15);
        org.joda.time.Chronology chronology17 = localTime14.getChronology();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 1, chronology17);
        int int19 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.LocalTime.Property property20 = localTime18.minuteOfHour();
        org.joda.time.Chronology chronology21 = localTime18.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.hours();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2922789 + "'", int19 == 2922789);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int2 = calendar0.getFirstDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add(125, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455448805,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=28,MILLISECOND=805,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localTime16.toDateTime(readableInstant17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime20 = localTime16.plus(readablePeriod19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean22 = localTime20.isSupported(dateTimeFieldType21);
        org.joda.time.DateTime dateTime23 = dateTime13.withFields((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int29 = dateTimeZone27.getOffset((long) (byte) 1);
        long long31 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, (long) 3);
        long long34 = dateTimeZone25.convertLocalToUTC((long) 9, false);
        java.lang.String str35 = dateTimeZone25.toString();
        org.joda.time.DateTime dateTime36 = localTime20.toDateTimeToday(dateTimeZone25);
        long long37 = dateTime36.getMillis();
        boolean boolean38 = interval8.equals((java.lang.Object) long37);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localTime41.toDateTime(readableInstant42);
        org.joda.time.LocalTime localTime44 = dateTime43.toLocalTime();
        org.joda.time.DateTime.Property property45 = dateTime43.minuteOfHour();
        java.lang.String str46 = property45.toString();
        org.joda.time.DateTime dateTime47 = property45.roundFloorCopy();
        org.joda.time.DateTime dateTime49 = property45.addToCopy((long) 366);
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.DateTime dateTime54 = localTime52.toDateTime(readableInstant53);
        org.joda.time.DateTime dateTime56 = dateTime54.plusYears(7);
        org.joda.time.DateTime dateTime58 = dateTime54.plusWeeks((int) (short) 10);
        int int59 = property45.getDifference((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.Interval interval61 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime58, readableDuration60);
        boolean boolean62 = interval8.equals((java.lang.Object) interval61);
        boolean boolean64 = interval61.contains(10740000L);
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.DateTime dateTime69 = localTime67.toDateTime(readableInstant68);
        org.joda.time.LocalTime localTime70 = dateTime69.toLocalTime();
        org.joda.time.DateTime.Property property71 = dateTime69.minuteOfHour();
        int int72 = property71.get();
        org.joda.time.Interval interval73 = property71.toInterval();
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.DateTime dateTime78 = localTime76.toDateTime(readableInstant77);
        org.joda.time.LocalTime localTime79 = dateTime78.toLocalTime();
        org.joda.time.DateTime.Property property80 = dateTime78.minuteOfHour();
        int int81 = property80.getMinimumValue();
        org.joda.time.DateTime dateTime82 = property80.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property83 = dateTime82.dayOfYear();
        boolean boolean84 = interval73.contains((org.joda.time.ReadableInstant) dateTime82);
        boolean boolean85 = interval61.abuts((org.joda.time.ReadableInterval) interval73);
        org.joda.time.Duration duration86 = interval61.toDuration();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3L + "'", long31 == 3L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.010" + "'", str35, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1645402199990L + "'", long37 == 1645402199990L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Property[minuteOfHour]" + "'", str46, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-100800) + "'", int59 == (-100800));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(localTime79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(duration86);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.getMinimumValue();
        org.joda.time.DateTime dateTime8 = property6.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone10.isLocalDateTimeGap(localDateTime11);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = dateTime8.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra(6);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfMonth();
        org.joda.time.DateTime.Property property18 = dateTime16.monthOfYear();
        org.joda.time.DateTime dateTime19 = property18.getDateTime();
        org.joda.time.DateTime dateTime21 = property18.addToCopy(60);
        org.joda.time.DateTime dateTime23 = dateTime21.plusSeconds(21);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTime(readableInstant8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime7.plus(readablePeriod10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean13 = localTime11.isSupported(dateTimeFieldType12);
        org.joda.time.DateTime dateTime14 = dateTime4.withFields((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.DateTime dateTime16 = instant15.toDateTimeISO();
        org.joda.time.Instant instant19 = instant15.withDurationAdded((long) 15, (-1645432682));
        long long20 = instant15.getMillis();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localTime23.toDateTime(readableInstant24);
        org.joda.time.Chronology chronology26 = localTime23.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.weekyears();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localTime31.toDateTime(readableInstant32);
        org.joda.time.Chronology chronology34 = localTime31.getChronology();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) (byte) 1, chronology34);
        int[] intArray37 = chronology26.get((org.joda.time.ReadablePartial) localTime35, (long) (short) -1);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localTime40.toDateTime(readableInstant41);
        org.joda.time.LocalTime localTime43 = dateTime42.toLocalTime();
        org.joda.time.DateTime.Property property44 = dateTime42.minuteOfHour();
        int int45 = property44.get();
        org.joda.time.Interval interval46 = property44.toInterval();
        org.joda.time.DateTime dateTime47 = interval46.getEnd();
        org.joda.time.Period period48 = interval46.toPeriod();
        org.joda.time.LocalTime localTime50 = localTime35.withPeriodAdded((org.joda.time.ReadablePeriod) period48, 17);
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.DateTime dateTime55 = localTime53.toDateTime(readableInstant54);
        org.joda.time.Chronology chronology56 = localTime53.getChronology();
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(chronology56);
        org.joda.time.DateTime dateTime58 = dateTime57.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean60 = dateTime58.isSupported(dateTimeFieldType59);
        int int61 = localTime50.get(dateTimeFieldType59);
        boolean boolean62 = instant15.equals((java.lang.Object) localTime50);
        org.joda.time.Instant instant64 = instant15.plus((long) 17);
        org.joda.time.MutableDateTime mutableDateTime65 = instant15.toMutableDateTimeISO();
        org.joda.time.Instant instant67 = instant15.withMillis(53724488L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(instant19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1645402199990L + "'", long20 == 1645402199990L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1020 + "'", int61 == 1020);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(instant64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(instant67);
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        org.joda.time.DateTime dateTime8 = dateTime4.plusWeeks(0);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.secondOfDay();
        int int12 = dateTimeField10.getMinimumValue(10L);
        org.joda.time.DurationField durationField13 = dateTimeField10.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(durationField13);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.Chronology chronology13 = localTime10.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 1, chronology13);
        int[] intArray16 = chronology5.get((org.joda.time.ReadablePartial) localTime14, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = chronology5.weekyear();
        org.joda.time.DurationField durationField18 = chronology5.weeks();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localTime21.toDateTime(readableInstant22);
        org.joda.time.LocalTime localTime24 = dateTime23.toLocalTime();
        int int25 = dateTime23.getMonthOfYear();
        int int26 = dateTime23.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int32 = dateTimeZone30.getOffset((long) (byte) 1);
        long long34 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 3);
        org.joda.time.DateTime dateTime35 = dateTime23.toDateTime(dateTimeZone30);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.withDurationAdded(readableDuration36, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = dateTime38.toString(dateTimeFormatter39);
        org.joda.time.DateTime dateTime42 = dateTime38.minus((long) 17);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.DateTime dateTime47 = localTime45.toDateTime(readableInstant46);
        org.joda.time.LocalTime localTime48 = dateTime47.toLocalTime();
        org.joda.time.DateTime.Property property49 = dateTime47.minuteOfHour();
        int int50 = property49.get();
        org.joda.time.Interval interval51 = property49.toInterval();
        org.joda.time.Interval interval52 = interval51.toInterval();
        long long53 = interval51.toDurationMillis();
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = interval51.toPeriod(periodType54);
        org.joda.time.MutablePeriod mutablePeriod56 = period55.toMutablePeriod();
        org.joda.time.PeriodType periodType57 = period55.getPeriodType();
        org.joda.time.Interval interval58 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadablePeriod) period55);
        org.joda.time.MutablePeriod mutablePeriod59 = period55.toMutablePeriod();
        int[] intArray61 = chronology5.get((org.joda.time.ReadablePeriod) mutablePeriod59, 1140568157L);
        java.lang.String str62 = mutablePeriod59.toString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3L + "'", long34 == 3L);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime38);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010" + "'", str40, "2022-02-21T00:10:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 60000L + "'", long53 == 60000L);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(mutablePeriod56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(mutablePeriod59);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[0, 0, 1, 6, 4, 49, 28, 157]");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "PT1M" + "'", str62, "PT1M");
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay((-457055), 0, (-100800), 2);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 1);
        int[] intArray9 = localTime8.getValues();
        java.util.Calendar.Builder builder10 = builder0.setFields(intArray9);
        java.util.Calendar.Builder builder15 = builder0.setTimeOfDay((int) (short) 10, (int) '4', 99, 35);
        java.util.Calendar.Builder builder18 = builder15.set(9, 35);
        java.util.Calendar.Builder builder21 = builder15.set(4, 2922789);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localTime24.toDateTime(readableInstant25);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int32 = dateTimeZone30.getOffset((long) (byte) 1);
        long long34 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 3);
        org.joda.time.DateTime dateTime35 = dateTime26.withZone(dateTimeZone28);
        org.joda.time.DateTime dateTime37 = dateTime26.minus((long) '#');
        org.joda.time.DateTime.Property property38 = dateTime26.weekyear();
        org.joda.time.DateTime dateTime40 = dateTime26.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime41 = dateTime26.toDateTime();
        org.joda.time.DateTime dateTime43 = dateTime26.withWeekyear(15);
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.minuteOfDay();
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localTime50.toDateTime(readableInstant51);
        org.joda.time.Chronology chronology53 = localTime50.getChronology();
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((long) (byte) 1, chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField56 = chronology53.dayOfMonth();
        org.joda.time.LocalTime localTime57 = org.joda.time.LocalTime.now(chronology53);
        org.joda.time.LocalTime localTime59 = localTime57.plusHours((int) 'u');
        org.joda.time.LocalTime localTime61 = localTime57.withMillisOfSecond(1);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localTime64.toDateTime(readableInstant65);
        org.joda.time.LocalTime localTime67 = dateTime66.toLocalTime();
        int int68 = dateTime66.getMonthOfYear();
        int int69 = dateTime66.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int75 = dateTimeZone73.getOffset((long) (byte) 1);
        long long77 = dateTimeZone71.getMillisKeepLocal(dateTimeZone73, (long) 3);
        org.joda.time.DateTime dateTime78 = dateTime66.toDateTime(dateTimeZone71);
        org.joda.time.DateTime dateTime79 = localTime61.toDateTimeToday(dateTimeZone71);
        org.joda.time.LocalTime localTime80 = new org.joda.time.LocalTime((long) 5, dateTimeZone71);
        int[] intArray82 = chronology44.get((org.joda.time.ReadablePartial) localTime80, 3779990L);
        java.util.Calendar.Builder builder83 = null; // flaky: builder21.setFields(intArray82);
        java.util.Calendar.Builder builder85 = null; // flaky: builder83.setLenient(false);
        java.util.Calendar.Builder builder89 = null; // flaky: builder83.setDate(21488, 564, (-95));
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 11]");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3L + "'", long34 == 3L);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 3L + "'", long77 == 3L);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(intArray82);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[1, 3, 0, 0]");
// flaky:         org.junit.Assert.assertNotNull(builder83);
// flaky:         org.junit.Assert.assertNotNull(builder85);
// flaky:         org.junit.Assert.assertNotNull(builder89);
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-19699), 53417, 0, (-27422807), 20579933);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27422807 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfMonth();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.LocalTime localTime12 = localTime10.plusHours((int) 'u');
        org.joda.time.LocalTime localTime14 = localTime10.withMillisOfSecond(1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int20 = dateTimeZone18.getOffset((long) (byte) 1);
        long long22 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 3);
        long long25 = dateTimeZone16.convertLocalToUTC((long) 9, false);
        java.lang.String str26 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime27 = localTime14.toDateTimeToday(dateTimeZone16);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(5, 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean32 = localTime30.isSupported(dateTimeFieldType31);
        int int33 = localTime14.get(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.010" + "'", str26, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 53848001 + "'", int33 == 53848001);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.dayOfYear();
        org.joda.time.DurationField durationField8 = chronology5.halfdays();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(1645454877853L);
        org.joda.time.LocalTime localTime12 = localTime10.plusHours(53);
        org.joda.time.LocalTime localTime14 = localTime10.plusHours((-1645401599));
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        boolean boolean16 = localTime14.isSupported(dateTimeFieldType15);
        long long18 = chronology5.set((org.joda.time.ReadablePartial) localTime14, 0L);
        java.lang.String str20 = localTime14.toString("53570388");
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 56877863L + "'", long18 == 56877863L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "53570388" + "'", str20, "53570388");
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        java.lang.String str7 = property6.toString();
        org.joda.time.DateTime dateTime8 = property6.roundFloorCopy();
        java.lang.String str9 = property6.getAsString();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localTime12.toDateTime(readableInstant13);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localTime17.toDateTime(readableInstant18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime17.plus(readablePeriod20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean23 = localTime21.isSupported(dateTimeFieldType22);
        org.joda.time.DateTime dateTime24 = dateTime14.withFields((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.DateTime dateTime26 = dateTime14.plus(95L);
        int int27 = property6.getDifference((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeField dateTimeField28 = property6.getField();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[minuteOfHour]" + "'", str7, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        java.util.Date date1 = new java.util.Date((long) (byte) 100);
        java.util.Locale locale2 = java.util.Locale.US;
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.lang.String str7 = locale2.getDisplayCountry(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale2);
        java.util.Date date9 = calendar8.getTime();
        int int10 = date9.getMonth();
        int int11 = date9.getSeconds();
        boolean boolean12 = date1.after(date9);
        java.lang.String str13 = date1.toGMTString();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "United States" + "'", str7, "United States");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645455449031,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=29,MILLISECOND=31,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Feb 21 14:57:29 UTC 2022");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str13, "1 Jan 1970 00:00:00 GMT");
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(5, 292278993, (-143999));
        java.util.Calendar calendar5 = builder4.build();
        calendar5.add(0, (int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getRangeDurationType();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTime(readableInstant14);
        org.joda.time.Chronology chronology16 = localTime13.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weekyears();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localTime21.toDateTime(readableInstant22);
        org.joda.time.Chronology chronology24 = localTime21.getChronology();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (byte) 1, chronology24);
        int[] intArray27 = chronology16.get((org.joda.time.ReadablePartial) localTime25, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField28 = chronology16.dayOfYear();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localTime31.toDateTime(readableInstant32);
        org.joda.time.LocalTime localTime34 = dateTime33.toLocalTime();
        org.joda.time.DateTime.Property property35 = dateTime33.minuteOfHour();
        int int36 = property35.get();
        org.joda.time.Interval interval37 = property35.toInterval();
        org.joda.time.DateTime dateTime38 = interval37.getEnd();
        org.joda.time.Period period39 = interval37.toPeriod();
        int[] intArray41 = chronology16.get((org.joda.time.ReadablePeriod) period39, (long) (byte) 100);
        org.joda.time.DateTimeField dateTimeField42 = chronology16.weekOfWeekyear();
        boolean boolean43 = dateTimeFieldType9.isSupported(chronology16);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localTime46.toDateTime(readableInstant47);
        org.joda.time.Chronology chronology49 = localTime46.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.weekyears();
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType9.getField(chronology49);
        org.joda.time.LocalTime localTime52 = org.joda.time.LocalTime.now(chronology49);
        org.joda.time.DateTimeField dateTimeField53 = chronology49.millisOfDay();
        org.joda.time.DurationField durationField54 = chronology49.halfdays();
        org.joda.time.DurationField durationField55 = chronology49.seconds();
        boolean boolean56 = calendar5.before((java.lang.Object) durationField55);
        calendar5.clear();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        long long10 = dateTimeField7.set(3003279000000L, 100);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTime(readableInstant15);
        org.joda.time.LocalTime localTime17 = dateTime16.toLocalTime();
        org.joda.time.DateTime.Property property18 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime16.plusWeeks(0);
        org.joda.time.Chronology chronology21 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.secondOfDay();
        long long25 = dateTimeField22.addWrapField((long) 366, 0);
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str28 = locale27.getCountry();
        java.lang.String str29 = dateTimeField22.getAsShortText(11, locale27);
        java.util.Locale.setDefault(locale27);
        java.lang.String str31 = dateTimeField7.getAsText(86399999, locale27);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale27);
        int int33 = calendar32.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-59006173800000L) + "'", long10 == (-59006173800000L));
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 366L + "'", long25 == 366L);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CN" + "'", str28, "CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "11" + "'", str29, "11");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "86399999" + "'", str31, "86399999");
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1645455449065,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=29,MILLISECOND=65,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTime(readableInstant6);
        org.joda.time.Chronology chronology8 = localTime5.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (byte) 1, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.dayOfMonth();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(17L, 1645454862530L, chronology12);
        org.joda.time.Interval interval16 = interval14.withStartMillis((long) 21);
        java.lang.String str17 = interval16.toString();
        org.joda.time.Duration duration18 = interval16.toDuration();
        org.joda.time.Interval interval19 = interval16.toInterval();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localTime23.toDateTime(readableInstant24);
        org.joda.time.Chronology chronology26 = localTime23.getChronology();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (byte) 1, chronology26);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        java.lang.String str29 = localTime27.toString();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localTime32.toDateTime(readableInstant33);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localTime37.toDateTime(readableInstant38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalTime localTime41 = localTime37.plus(readablePeriod40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean43 = localTime41.isSupported(dateTimeFieldType42);
        org.joda.time.DateTime dateTime44 = dateTime34.withFields((org.joda.time.ReadablePartial) localTime41);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int50 = dateTimeZone48.getOffset((long) (byte) 1);
        long long52 = dateTimeZone46.getMillisKeepLocal(dateTimeZone48, (long) 3);
        long long55 = dateTimeZone46.convertLocalToUTC((long) 9, false);
        java.lang.String str56 = dateTimeZone46.toString();
        org.joda.time.DateTime dateTime57 = localTime41.toDateTimeToday(dateTimeZone46);
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.now(dateTimeZone46);
        org.joda.time.DateTime dateTime59 = localTime27.toDateTimeToday(dateTimeZone46);
        org.joda.time.DateTime dateTime61 = dateTime59.withYear((-95));
        int int62 = dateTime59.getCenturyOfEra();
        org.joda.time.LocalTime localTime63 = dateTime59.toLocalTime();
        boolean boolean64 = interval16.isAfter((org.joda.time.ReadableInstant) dateTime59);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01T00:00:00.021Z/2022-02-21T14:47:42.530Z" + "'", str17, "1970-01-01T00:00:00.021Z/2022-02-21T14:47:42.530Z");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "00:00:00.001" + "'", str29, "00:00:00.001");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3L + "'", long52 == 3L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00:00.010" + "'", str56, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 20 + "'", int62 == 20);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.Chronology chronology13 = localTime10.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 1, chronology13);
        int[] intArray16 = chronology5.get((org.joda.time.ReadablePartial) localTime14, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology5.weeks();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(chronology5);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone22.isLocalDateTimeGap(localDateTime23);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (byte) 0, dateTimeZone22);
        org.joda.time.LocalTime localTime27 = localTime25.plusMinutes((int) 'u');
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localTime30.toDateTime(readableInstant31);
        org.joda.time.LocalTime localTime33 = dateTime32.toLocalTime();
        int int34 = dateTime32.getMonthOfYear();
        int int35 = dateTime32.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int41 = dateTimeZone39.getOffset((long) (byte) 1);
        long long43 = dateTimeZone37.getMillisKeepLocal(dateTimeZone39, (long) 3);
        org.joda.time.DateTime dateTime44 = dateTime32.toDateTime(dateTimeZone39);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime47 = dateTime44.withDurationAdded(readableDuration45, (int) (byte) 10);
        org.joda.time.DateTime dateTime48 = localTime27.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        int int49 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime27);
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.DateTime dateTime54 = localTime52.toDateTime(readableInstant53);
        org.joda.time.LocalTime localTime55 = dateTime54.toLocalTime();
        org.joda.time.DateTime.Property property56 = dateTime54.minuteOfHour();
        org.joda.time.DateTime dateTime58 = dateTime54.plusWeeks(0);
        org.joda.time.Chronology chronology59 = dateTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = dateTimeField60.getType();
        int int62 = localTime27.get(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3L + "'", long43 == 3L);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 7020 + "'", int62 == 7020);
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getFirstDayOfWeek();
        int int3 = calendar0.getLeastMaximum(2);
        java.lang.String str4 = calendar0.getCalendarType();
        java.time.Instant instant5 = calendar0.toInstant();
        int int6 = calendar0.getMinimalDaysInFirstWeek();
        calendar0.set(366, (-1), (-27422807), 3, 1439);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        int int14 = calendar13.getFirstDayOfWeek();
        int int16 = calendar13.getLeastMaximum(2);
        int int17 = calendar13.getFirstDayOfWeek();
        java.util.Date date18 = calendar13.getTime();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance();
        long long20 = calendar19.getTimeInMillis();
        int int21 = calendar19.getMinimalDaysInFirstWeek();
        java.util.Date date22 = calendar19.getTime();
        date22.setHours(32772);
        boolean boolean25 = date18.before(date22);
        calendar0.setTime(date22);
        int int27 = date22.getTimezoneOffset();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1763384249137,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=4,DAY_OF_MONTH=17,DAY_OF_YEAR=321,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=57,SECOND=29,MILLISECOND=137,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gregory" + "'", str4, "gregory");
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645455449137,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=29,MILLISECOND=137,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Mon Feb 21 14:57:29 UTC 2022");
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1645455449137,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=29,MILLISECOND=137,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1645455449137L + "'", long20 == 1645455449137L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Mon Nov 17 12:57:29 UTC 2025");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.LocalTime localTime14 = dateTime13.toLocalTime();
        org.joda.time.DateTime.Property property15 = dateTime13.minuteOfHour();
        int int16 = property15.getMinimumValue();
        org.joda.time.DateTime dateTime17 = property15.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfYear();
        boolean boolean19 = interval8.contains((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localTime22.toDateTime(readableInstant23);
        org.joda.time.LocalTime localTime25 = dateTime24.toLocalTime();
        org.joda.time.DateTime.Property property26 = dateTime24.minuteOfHour();
        int int27 = property26.get();
        org.joda.time.Interval interval28 = property26.toInterval();
        org.joda.time.Interval interval29 = interval28.toInterval();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localTime32.toDateTime(readableInstant33);
        org.joda.time.LocalTime localTime35 = dateTime34.toLocalTime();
        org.joda.time.DateTime.Property property36 = dateTime34.minuteOfHour();
        int int37 = property36.getMinimumValue();
        org.joda.time.DateTime dateTime38 = property36.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = dateTimeZone40.isLocalDateTimeGap(localDateTime41);
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone40);
        org.joda.time.DateTime dateTime44 = dateTime38.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((java.lang.Object) dateTime44);
        org.joda.time.Interval interval46 = null; // flaky: interval29.withEnd((org.joda.time.ReadableInstant) dateTime44);
        boolean boolean47 = interval8.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localTime50.toDateTime(readableInstant51);
        org.joda.time.LocalTime localTime53 = dateTime52.toLocalTime();
        org.joda.time.DateTime.Property property54 = dateTime52.minuteOfHour();
        int int55 = property54.get();
        org.joda.time.Interval interval56 = property54.toInterval();
        org.joda.time.DateTime dateTime57 = interval56.getEnd();
        org.joda.time.Period period58 = interval56.toPeriod();
        org.joda.time.Period period59 = interval56.toPeriod();
        boolean boolean61 = interval56.isBefore((long) 3);
        boolean boolean62 = interval8.isBefore((org.joda.time.ReadableInterval) interval56);
        org.joda.time.Interval interval64 = interval56.withStartMillis((long) 1020);
        org.joda.time.Period period65 = interval56.toPeriod();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertNotNull(interval46);
// flaky:         org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(period65);
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("01.01.1970 00:11:32");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"01.01.1970 00:11:32\" is malformed at \".01.1970 00:11:32\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localTime12.toDateTime(readableInstant13);
        org.joda.time.LocalTime localTime15 = dateTime14.toLocalTime();
        org.joda.time.DateTime.Property property16 = dateTime14.minuteOfHour();
        int int17 = property16.getMinimumValue();
        org.joda.time.DateTime dateTime18 = property16.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone20.isLocalDateTimeGap(localDateTime21);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = dateTime18.withZoneRetainFields(dateTimeZone20);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) dateTime24);
        org.joda.time.Interval interval26 = null; // flaky: interval9.withEnd((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Period period27 = null; // flaky: interval26.toPeriod();
        boolean boolean29 = false; // flaky: interval26.isBefore(1645402140000L);
        long long30 = 0L; // flaky: interval26.getStartMillis();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localTime33.toDateTime(readableInstant34);
        org.joda.time.Chronology chronology36 = localTime33.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.minutes();
        org.joda.time.DurationField durationField38 = chronology36.days();
        org.joda.time.DurationField durationField39 = chronology36.halfdays();
        org.joda.time.Interval interval40 = null; // flaky: interval26.withChronology(chronology36);
        org.joda.time.DateTimeField dateTimeField41 = chronology36.secondOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertNotNull(interval26);
// flaky:         org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1645402199990L + "'", long30 == 1645402199990L);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
// flaky:         org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(dateTimeField41);
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(35);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTime(readableInstant15);
        org.joda.time.Chronology chronology17 = localTime14.getChronology();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 1, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology17);
        org.joda.time.Interval interval20 = new org.joda.time.Interval(0L, 0L, chronology17);
        org.joda.time.DateTimeField dateTimeField21 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.year();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.dayOfWeek();
        org.joda.time.DurationField durationField24 = chronology17.millis();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withChronology(chronology17);
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withLocale(locale26);
        boolean boolean28 = dateTimeFormatter27.isOffsetParsed();
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTime(readableInstant6);
        int int8 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime11 = property9.addCopy(6);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTime(readableInstant15);
        org.joda.time.LocalTime localTime17 = dateTime16.toLocalTime();
        org.joda.time.DateTime.Property property18 = dateTime16.minuteOfHour();
        int int19 = property18.get();
        org.joda.time.Interval interval20 = property18.toInterval();
        org.joda.time.Interval interval21 = interval20.toInterval();
        long long22 = interval20.toDurationMillis();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = interval20.toPeriod(periodType23);
        org.joda.time.LocalTime localTime26 = localTime11.withPeriodAdded((org.joda.time.ReadablePeriod) period24, 8);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = localTime11.getFieldTypes();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localTime30.toDateTime(readableInstant31);
        org.joda.time.LocalTime localTime33 = dateTime32.toLocalTime();
        org.joda.time.DateTime.Property property34 = dateTime32.minuteOfHour();
        java.lang.String str35 = property34.toString();
        org.joda.time.DateTime dateTime36 = property34.roundFloorCopy();
        org.joda.time.DateTime dateTime38 = property34.addToCopy((long) 366);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localTime41.toDateTime(readableInstant42);
        org.joda.time.DateTime dateTime45 = dateTime43.plusYears(7);
        org.joda.time.DateTime dateTime47 = dateTime43.plusWeeks((int) (short) 10);
        int int48 = property34.getDifference((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Interval interval50 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime47, readableDuration49);
        org.joda.time.DateTime dateTime51 = localTime11.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime53 = dateTime51.minusDays((int) (short) 100);
        int int54 = dateTime53.getHourOfDay();
        org.joda.time.DateTime.Property property55 = dateTime53.year();
        java.util.Locale locale56 = java.util.Locale.US;
        java.util.Locale locale57 = locale56.stripExtensions();
        java.lang.String str58 = locale56.getVariant();
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(locale56);
        java.lang.String str61 = locale56.getUnicodeLocaleType("CN");
        java.lang.String str62 = locale56.getDisplayScript();
        int int63 = property55.getMaximumShortTextLength(locale56);
        int int64 = property55.get();
        org.joda.time.Interval interval65 = property55.toInterval();
        org.joda.time.DurationField durationField66 = property55.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60000L + "'", long22 == 60000L);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Property[minuteOfHour]" + "'", str35, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-100800) + "'", int48 == (-100800));
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6 + "'", int54 == 6);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(calendar59);
// flaky:         org.junit.Assert.assertEquals(calendar59.toString(), "java.util.GregorianCalendar[time=1645455449224,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=29,MILLISECOND=224,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 9 + "'", int63 == 9);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2022 + "'", int64 == 2022);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(durationField66);
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1, chronology6);
        org.joda.time.DateTime dateTime8 = localTime7.toDateTimeToday();
        org.joda.time.LocalTime localTime10 = localTime7.minusMinutes(1);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localTime17.toDateTime(readableInstant18);
        int int20 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.LocalTime.Property property21 = localTime14.hourOfDay();
        org.joda.time.LocalTime localTime23 = property21.addCopy(6);
        org.joda.time.LocalTime localTime24 = property21.roundCeilingCopy();
        java.util.Locale locale26 = java.util.Locale.US;
        java.lang.String str27 = locale26.getDisplayName();
        org.joda.time.LocalTime localTime28 = property21.setCopy("0", locale26);
        org.joda.time.LocalTime localTime29 = property21.roundFloorCopy();
        int[] intArray31 = chronology11.get((org.joda.time.ReadablePartial) localTime29, 8362592323200099L);
        org.joda.time.DateTimeField dateTimeField32 = chronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField34 = chronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField35 = chronology11.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u82f1\u6587\u7f8e\u56fd)" + "'", str27, "\u82f1\u6587\u7f8e\u56fd)");
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0, 99]");
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("20");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localTime4.toDateTime(readableInstant5);
        org.joda.time.LocalTime localTime7 = dateTime6.toLocalTime();
        int int8 = dateTime6.getMonthOfYear();
        int int9 = dateTime6.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int15 = dateTimeZone13.getOffset((long) (byte) 1);
        long long17 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) 3);
        org.joda.time.DateTime dateTime18 = dateTime6.toDateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfCentury((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime23 = dateTime18.withField(dateTimeFieldType21, (int) (byte) 1);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.DateTime dateTime28 = localTime26.toDateTime(readableInstant27);
        org.joda.time.LocalTime localTime29 = dateTime28.toLocalTime();
        org.joda.time.DateTime.Property property30 = dateTime28.minuteOfHour();
        int int31 = property30.get();
        org.joda.time.Interval interval32 = property30.toInterval();
        org.joda.time.Interval interval33 = interval32.toInterval();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localTime36.toDateTime(readableInstant37);
        org.joda.time.LocalTime localTime39 = dateTime38.toLocalTime();
        org.joda.time.DateTime.Property property40 = dateTime38.minuteOfHour();
        int int41 = property40.getMinimumValue();
        org.joda.time.DateTime dateTime42 = property40.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = dateTimeZone44.isLocalDateTimeGap(localDateTime45);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.DateTime dateTime48 = dateTime42.withZoneRetainFields(dateTimeZone44);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((java.lang.Object) dateTime48);
        org.joda.time.Interval interval50 = null; // flaky: interval33.withEnd((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Duration duration51 = interval33.toDuration();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration51);
        org.joda.time.ReadableDuration readableDuration53 = null;
        boolean boolean54 = duration51.isEqual(readableDuration53);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Interval interval56 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration51, readableInstant55);
        org.joda.time.DateTime dateTime57 = dateTime1.plus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.DateTime dateTime59 = dateTime1.withYear(99);
        int int60 = dateTime59.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTime48);
// flaky:         org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        int int7 = dateTime4.getHourOfDay();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int18 = dateTimeZone16.getOffset((long) (byte) 1);
        long long20 = dateTimeZone14.getMillisKeepLocal(dateTimeZone16, (long) 3);
        org.joda.time.DateTime dateTime21 = dateTime12.withZone(dateTimeZone14);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime21);
        boolean boolean24 = interval22.isBefore((long) 21);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localTime27.toDateTime(readableInstant28);
        org.joda.time.LocalTime localTime30 = dateTime29.toLocalTime();
        org.joda.time.DateTime.Property property31 = dateTime29.minuteOfHour();
        int int32 = property31.get();
        org.joda.time.Interval interval33 = property31.toInterval();
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Period period35 = interval33.toPeriod();
        org.joda.time.Period period36 = interval33.toPeriod();
        boolean boolean37 = interval22.isBefore((org.joda.time.ReadableInterval) interval33);
        org.joda.time.Period period38 = interval33.toPeriod();
        org.joda.time.Period period39 = interval33.toPeriod();
        org.joda.time.DateTime dateTime40 = interval33.getStart();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(dateTime40);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.Chronology chronology13 = localTime10.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 1, chronology13);
        int[] intArray16 = chronology5.get((org.joda.time.ReadablePartial) localTime14, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = chronology5.year();
        org.joda.time.DateTimeField dateTimeField18 = chronology5.centuryOfEra();
        long long21 = dateTimeField18.addWrapField(53339903L, 11);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = dateTimeField18.getType();
        long long24 = dateTimeField18.roundHalfEven((-3110314260051L));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 34712722139903L + "'", long21 == 34712722139903L);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-2208988800000L) + "'", long24 == (-2208988800000L));
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localTime4.toDateTime(readableInstant5);
        org.joda.time.Chronology chronology7 = localTime4.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 1, chronology7);
        boolean boolean9 = dateTimeFieldType0.isSupported(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.centuryOfEra();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField12 = chronology7.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int17 = dateTimeZone15.getOffset((long) (byte) 1);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(0L, dateTimeZone15);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.now(dateTimeZone15);
        org.joda.time.Chronology chronology20 = chronology7.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField21 = chronology7.eras();
        java.lang.String str22 = durationField21.getName();
        boolean boolean23 = durationField21.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = durationField21.getValue(1645454890052L, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "eras" + "'", str22, "eras");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.getMinimumValue();
        org.joda.time.DateTime dateTime8 = property6.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property6.getFieldType();
        int int10 = property6.get();
        org.joda.time.DateTime dateTime12 = property6.addToCopy((int) (short) -1);
        org.joda.time.DateTime dateTime13 = property6.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localTime16.toDateTime(readableInstant17);
        org.joda.time.Chronology chronology19 = localTime16.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weekyears();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localTime24.toDateTime(readableInstant25);
        org.joda.time.Chronology chronology27 = localTime24.getChronology();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) (byte) 1, chronology27);
        int[] intArray30 = chronology19.get((org.joda.time.ReadablePartial) localTime28, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField31 = chronology19.dayOfYear();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localTime34.toDateTime(readableInstant35);
        org.joda.time.LocalTime localTime37 = dateTime36.toLocalTime();
        org.joda.time.DateTime.Property property38 = dateTime36.minuteOfHour();
        int int39 = property38.get();
        org.joda.time.Interval interval40 = property38.toInterval();
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        org.joda.time.Period period42 = interval40.toPeriod();
        int[] intArray44 = chronology19.get((org.joda.time.ReadablePeriod) period42, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int50 = dateTimeZone48.getOffset((long) (byte) 1);
        long long52 = dateTimeZone46.getMillisKeepLocal(dateTimeZone48, (long) 3);
        long long55 = dateTimeZone46.convertLocalToUTC((long) 9, false);
        java.lang.String str56 = dateTimeZone46.toString();
        org.joda.time.Chronology chronology57 = chronology19.withZone(dateTimeZone46);
        java.lang.String str59 = dateTimeZone46.getNameKey((-3297171016000L));
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(dateTimeZone46);
        long long63 = dateTimeZone46.convertLocalToUTC(1645454980767L, false);
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.DateTime dateTime68 = localTime66.toDateTime(readableInstant67);
        org.joda.time.LocalTime localTime69 = dateTime68.toLocalTime();
        int int70 = dateTime68.getMonthOfYear();
        int int71 = dateTime68.getHourOfDay();
        org.joda.time.DateTime.Property property72 = dateTime68.dayOfMonth();
        org.joda.time.DateTime.Property property73 = dateTime68.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int78 = dateTimeZone76.getOffset((long) (byte) 1);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(0L, dateTimeZone76);
        org.joda.time.DateTime.Property property80 = dateTime79.secondOfMinute();
        long long81 = property73.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime79);
        long long82 = dateTime79.getMillis();
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone84);
        org.joda.time.DateTime dateTime86 = dateTime79.toDateTime(dateTimeZone84);
        long long88 = dateTimeZone46.getMillisKeepLocal(dateTimeZone84, 53357262L);
        org.joda.time.MutableDateTime mutableDateTime89 = dateTime13.toMutableDateTime(dateTimeZone84);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3L + "'", long52 == 3L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00:00.010" + "'", str56, "+00:00:00.010");
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1645454980757L + "'", long63 == 1645454980757L);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(dateTimeZone76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 19044L + "'", long81 == 19044L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone84);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 53357262L + "'", long88 == 53357262L);
        org.junit.Assert.assertNotNull(mutableDateTime89);
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        java.lang.String str3 = calendar2.getCalendarType();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        calendar2.clear();
        java.lang.String str6 = calendar2.getCalendarType();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u6587" + "'", str1, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gregory" + "'", str3, "gregory");
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gregory" + "'", str6, "gregory");
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Locale locale5 = new java.util.Locale("", "hi!", "");
        java.lang.String str6 = locale1.getDisplayCountry(locale5);
        java.util.Locale.setDefault(category0, locale5);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.DateTime.Property property14 = dateTime12.minuteOfHour();
        int int15 = property14.get();
        org.joda.time.Interval interval16 = property14.toInterval();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localTime19.toDateTime(readableInstant20);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localTime24.toDateTime(readableInstant25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime28 = localTime24.plus(readablePeriod27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean30 = localTime28.isSupported(dateTimeFieldType29);
        org.joda.time.DateTime dateTime31 = dateTime21.withFields((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int37 = dateTimeZone35.getOffset((long) (byte) 1);
        long long39 = dateTimeZone33.getMillisKeepLocal(dateTimeZone35, (long) 3);
        long long42 = dateTimeZone33.convertLocalToUTC((long) 9, false);
        java.lang.String str43 = dateTimeZone33.toString();
        org.joda.time.DateTime dateTime44 = localTime28.toDateTimeToday(dateTimeZone33);
        long long45 = dateTime44.getMillis();
        boolean boolean46 = interval16.equals((java.lang.Object) long45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localTime51.toDateTime(readableInstant52);
        org.joda.time.Chronology chronology54 = localTime51.getChronology();
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime((long) (byte) 1, chronology54);
        boolean boolean56 = dateTimeFieldType47.isSupported(chronology54);
        org.joda.time.DateTimeField dateTimeField57 = chronology54.centuryOfEra();
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.now(chronology54);
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(chronology54);
        org.joda.time.LocalTime localTime60 = org.joda.time.LocalTime.now(chronology54);
        org.joda.time.Interval interval61 = interval16.withChronology(chronology54);
        org.joda.time.DateTimeField dateTimeField62 = chronology54.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField63 = chronology54.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = dateTimeField63.getType();
        org.joda.time.DurationField durationField65 = dateTimeField63.getRangeDurationField();
        java.util.Locale locale66 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale66);
        int int68 = dateTimeField63.getMaximumTextLength(locale66);
        java.lang.String str69 = locale5.getDisplayVariant(locale66);
        java.util.Calendar calendar70 = java.util.Calendar.getInstance(locale66);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals(locale5.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "United States" + "'", str6, "United States");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3L + "'", long39 == 3L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.010" + "'", str43, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1645402199990L + "'", long45 == 1645402199990L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 8 + "'", int68 == 8);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(calendar70);
// flaky:         org.junit.Assert.assertEquals(calendar70.toString(), "java.util.GregorianCalendar[time=1645455449414,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=29,MILLISECOND=414,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 1, chronology14);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localTime15, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField18 = chronology6.weekyear();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 5, chronology6);
        org.joda.time.DurationField durationField20 = chronology6.seconds();
        org.joda.time.DurationField durationField21 = chronology6.halfdays();
        org.joda.time.DurationField durationField22 = chronology6.hours();
        org.joda.time.DurationField durationField23 = chronology6.months();
        org.joda.time.DurationFieldType durationFieldType24 = durationField23.getType();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationFieldType24);
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("DateTimeField[clockhourOfDay]");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int10 = dateTimeZone8.getOffset((long) (byte) 1);
        long long12 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 3);
        org.joda.time.DateTime dateTime13 = dateTime4.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime15 = dateTime13.minusSeconds((int) 'u');
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, readableDuration16);
        org.joda.time.Period period18 = interval17.toPeriod();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = interval17.toPeriod(periodType19);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod22 = period20.toMutablePeriod();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.DateTime dateTime27 = localTime25.toDateTime(readableInstant26);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localTime30.toDateTime(readableInstant31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalTime localTime34 = localTime30.plus(readablePeriod33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean36 = localTime34.isSupported(dateTimeFieldType35);
        org.joda.time.DateTime dateTime37 = dateTime27.withFields((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int43 = dateTimeZone41.getOffset((long) (byte) 1);
        long long45 = dateTimeZone39.getMillisKeepLocal(dateTimeZone41, (long) 3);
        long long48 = dateTimeZone39.convertLocalToUTC((long) 9, false);
        java.lang.String str49 = dateTimeZone39.toString();
        org.joda.time.DateTime dateTime50 = localTime34.toDateTimeToday(dateTimeZone39);
        long long51 = dateTime50.getMillis();
        org.joda.time.DateTime dateTime53 = dateTime50.withYearOfCentury(0);
        org.joda.time.Interval interval54 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod22, (org.joda.time.ReadableInstant) dateTime50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval56 = interval54.withEndMillis((long) (-143999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 3L + "'", long45 == 3L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.010" + "'", str49, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1645402199990L + "'", long51 == 1645402199990L);
        org.junit.Assert.assertNotNull(dateTime53);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        int int7 = dateTime4.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int13 = dateTimeZone11.getOffset((long) (byte) 1);
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 3);
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime19 = property17.addToCopy(993);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter2.getZone();
        boolean boolean6 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(15706);
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withZone(dateTimeZone11);
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.util.Locale locale17 = new java.util.Locale("", "hi!", "");
        java.lang.String str18 = locale17.getVariant();
        java.lang.String str19 = locale13.getDisplayScript(locale17);
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.String str22 = locale13.getDisplayName(locale20);
        java.lang.String str23 = locale20.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter2.withLocale(locale20);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeFormatter2.getZone();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale17.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "tedesco (Germania)" + "'", str22, "tedesco (Germania)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "italien (Italie)" + "'", str23, "italien (Italie)");
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNull(dateTimeZone25);
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        java.util.Date date1 = new java.util.Date(1645402140000L);
        date1.setMinutes((int) (byte) 10);
        long long4 = date1.getTime();
        int int5 = date1.getTimezoneOffset();
        int int6 = date1.getSeconds();
        int int7 = date1.getMinutes();
        date1.setDate(20579933);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 11 00:10:00 UTC 58368");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1645402200000L + "'", long4 == 1645402200000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.Interval interval9 = interval8.toInterval();
        long long10 = interval8.toDurationMillis();
        org.joda.time.Interval interval12 = interval8.withStartMillis(10L);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localTime16.toDateTime(readableInstant17);
        org.joda.time.Chronology chronology19 = localTime16.getChronology();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (byte) 1, chronology19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology19);
        org.joda.time.Interval interval22 = interval8.withChronology(chronology19);
        org.joda.time.DateTimeZone dateTimeZone23 = chronology19.getZone();
        org.joda.time.DateTimeField dateTimeField24 = chronology19.halfdayOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = dateTimeField24.getType();
        java.lang.String str26 = dateTimeFieldType25.getName();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance();
        boolean boolean28 = calendar27.isWeekDateSupported();
        long long29 = calendar27.getTimeInMillis();
        java.util.TimeZone timeZone30 = calendar27.getTimeZone();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localTime33.toDateTime(readableInstant34);
        org.joda.time.Chronology chronology36 = localTime33.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.weekyears();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localTime41.toDateTime(readableInstant42);
        org.joda.time.Chronology chronology44 = localTime41.getChronology();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) (byte) 1, chronology44);
        int[] intArray47 = chronology36.get((org.joda.time.ReadablePartial) localTime45, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField48 = chronology36.clockhourOfDay();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((java.lang.Object) calendar27, chronology36);
        org.joda.time.DateTimeField dateTimeField50 = chronology36.weekyearOfCentury();
        boolean boolean51 = dateTimeFieldType25.isSupported(chronology36);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60000L + "'", long10 == 60000L);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "halfdayOfDay" + "'", str26, "halfdayOfDay");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645455449542,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=29,MILLISECOND=542,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1645455449542L + "'", long29 == 1645455449542L);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 1, chronology14);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localTime15, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField18 = chronology6.dayOfYear();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localTime21.toDateTime(readableInstant22);
        org.joda.time.LocalTime localTime24 = dateTime23.toLocalTime();
        org.joda.time.DateTime.Property property25 = dateTime23.minuteOfHour();
        int int26 = property25.get();
        org.joda.time.Interval interval27 = property25.toInterval();
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Period period29 = interval27.toPeriod();
        int[] intArray31 = chronology6.get((org.joda.time.ReadablePeriod) period29, (long) (byte) 100);
        org.joda.time.DateTimeField dateTimeField32 = chronology6.dayOfYear();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(chronology6);
        org.joda.time.Interval interval34 = new org.joda.time.Interval(readablePeriod0, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = dateTime36.toString(dateTimeFormatter37);
        int int39 = dateTime36.getEra();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime36, readableDuration40);
        org.joda.time.Interval interval42 = interval34.overlap((org.joda.time.ReadableInterval) interval41);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.DateTime dateTime49 = localTime47.toDateTime(readableInstant48);
        org.joda.time.Chronology chronology50 = localTime47.getChronology();
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((long) (byte) 1, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(chronology50);
        org.joda.time.DateTimeField dateTimeField53 = chronology50.monthOfYear();
        org.joda.time.LocalTime localTime54 = org.joda.time.LocalTime.fromMillisOfDay((long) 370, chronology50);
        org.joda.time.Interval interval55 = interval41.withChronology(chronology50);
        org.joda.time.DateTimeField dateTimeField56 = chronology50.halfdayOfDay();
        java.lang.String str57 = chronology50.toString();
        org.joda.time.DurationField durationField58 = chronology50.millis();
        org.joda.time.DurationFieldType durationFieldType59 = durationField58.getType();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01T00:00:00.062+00:00:00.010" + "'", str38, "1970-01-01T00:00:00.062+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(interval42);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ISOChronology[UTC]" + "'", str57, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(durationFieldType59);
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusYears(7);
        java.util.GregorianCalendar gregorianCalendar7 = dateTime4.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int13 = dateTimeZone11.getOffset((long) (byte) 1);
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 3);
        long long17 = dateTimeZone9.previousTransition(0L);
        java.lang.String str19 = dateTimeZone9.getNameKey(720100L);
        org.joda.time.DateTime dateTime20 = dateTime4.withZoneRetainFields(dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int22 = dateTime4.get(dateTimeFieldType21);
        org.joda.time.DateTime.Property property23 = dateTime4.minuteOfHour();
        org.joda.time.DateTime dateTime24 = property23.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime26 = property23.addToCopy((long) 125);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime26.getZone();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes(623000);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1, chronology6);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology6);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTime.Property property10 = dateTime8.millisOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.DateTime dateTime13 = property10.addToCopy(14);
        org.joda.time.DateTimeField dateTimeField14 = property10.getField();
        java.lang.String str16 = dateTimeField14.getAsText(1640995200000L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone18.isLocalDateTimeGap(localDateTime19);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.now(dateTimeZone18);
        java.util.Locale locale23 = new java.util.Locale("hours");
        java.lang.String str24 = locale23.getDisplayCountry();
        java.util.Locale locale25 = locale23.stripExtensions();
        java.lang.String str26 = dateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localTime21, locale25);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay(1645454951507L);
        java.util.Calendar.Builder builder30 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder35 = builder30.setTimeOfDay(16, 53, (-100800), 3);
        java.util.Calendar calendar36 = builder30.build();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone39.isLocalDateTimeGap(localDateTime40);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (byte) 0, dateTimeZone39);
        org.joda.time.LocalTime localTime44 = localTime42.minusMinutes(3);
        int int45 = localTime44.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = dateTimeZone48.isLocalDateTimeGap(localDateTime49);
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((long) (byte) 0, dateTimeZone48);
        org.joda.time.LocalTime localTime52 = localTime44.withFields((org.joda.time.ReadablePartial) localTime51);
        int[] intArray53 = localTime51.getValues();
        java.util.Calendar.Builder builder54 = builder30.setFields(intArray53);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray56 = dateTimeField14.set((org.joda.time.ReadablePartial) localTime28, 47, intArray53, (-19044));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -19044 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53849624" + "'", str11, "53849624");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertEquals(locale23.toString(), "hours");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "hours");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "53849634" + "'", str26, "53849634");
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(calendar36);
        org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=-40019997,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=53,SECOND=0,MILLISECOND=3,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 23 + "'", int45 == 23);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusYears(7);
        java.util.GregorianCalendar gregorianCalendar7 = dateTime4.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int13 = dateTimeZone11.getOffset((long) (byte) 1);
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 3);
        long long17 = dateTimeZone9.previousTransition(0L);
        java.lang.String str19 = dateTimeZone9.getNameKey(720100L);
        org.joda.time.DateTime dateTime20 = dateTime4.withZoneRetainFields(dateTimeZone9);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.DateTime dateTime28 = localTime26.toDateTime(readableInstant27);
        int int29 = localTime23.compareTo((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.LocalTime.Property property30 = localTime23.hourOfDay();
        org.joda.time.DateTime dateTime31 = dateTime20.withFields((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localTime34.toDateTime(readableInstant35);
        org.joda.time.Chronology chronology37 = localTime34.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.yearOfEra();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.DateTime dateTime45 = localTime43.toDateTime(readableInstant44);
        org.joda.time.Chronology chronology46 = localTime43.getChronology();
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (byte) 1, chronology46);
        org.joda.time.DateTimeField dateTimeField48 = chronology46.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.dayOfMonth();
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.now(chronology46);
        org.joda.time.LocalTime localTime52 = localTime50.plusHours((int) 'u');
        long long54 = chronology37.set((org.joda.time.ReadablePartial) localTime50, 0L);
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime((java.lang.Object) localTime23, chronology37);
        org.joda.time.Chronology chronology56 = localTime23.getChronology();
        org.joda.time.LocalTime.Property property57 = localTime23.hourOfDay();
        org.joda.time.LocalTime localTime58 = property57.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime60 = property57.addCopy(42);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime52);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 53849642L + "'", long54 == 53849642L);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime60);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.getMinimumValue();
        org.joda.time.DateTime dateTime9 = property6.setCopy(1);
        org.joda.time.DateTime.Property property10 = dateTime9.weekOfWeekyear();
        org.joda.time.DateTime dateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays(2922789);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone16.isLocalDateTimeGap(localDateTime17);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (byte) 0, dateTimeZone16);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime22 = localTime19.withPeriodAdded(readablePeriod20, 17);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.DateTime dateTime27 = localTime25.toDateTime(readableInstant26);
        org.joda.time.LocalTime localTime28 = dateTime27.toLocalTime();
        int int29 = dateTime27.getMonthOfYear();
        int int30 = dateTime27.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int36 = dateTimeZone34.getOffset((long) (byte) 1);
        long long38 = dateTimeZone32.getMillisKeepLocal(dateTimeZone34, (long) 3);
        org.joda.time.DateTime dateTime39 = dateTime27.toDateTime(dateTimeZone32);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DateTime dateTime42 = dateTime27.withFieldAdded(durationFieldType40, 2022);
        org.joda.time.LocalTime localTime44 = localTime22.withFieldAdded(durationFieldType40, 122);
        org.joda.time.DateTime dateTime46 = dateTime13.withFieldAdded(durationFieldType40, (-1969));
        org.joda.time.DateTime.Property property47 = dateTime46.year();
        int int48 = property47.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 3L + "'", long38 == 3L);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 292278993 + "'", int48 == 292278993);
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.DateTime dateTime9 = interval8.getEnd();
        org.joda.time.Period period10 = interval8.toPeriod();
        java.lang.String str11 = interval8.toString();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTime(readableInstant15);
        org.joda.time.LocalTime localTime17 = dateTime16.toLocalTime();
        org.joda.time.DateTime.Property property18 = dateTime16.minuteOfHour();
        int int19 = property18.get();
        org.joda.time.Interval interval20 = property18.toInterval();
        org.joda.time.Interval interval21 = interval20.toInterval();
        long long22 = interval20.toDurationMillis();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = interval20.toPeriod(periodType23);
        org.joda.time.Interval interval25 = interval8.overlap((org.joda.time.ReadableInterval) interval20);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localTime28.toDateTime(readableInstant29);
        org.joda.time.LocalTime localTime31 = dateTime30.toLocalTime();
        int int32 = dateTime30.getMonthOfYear();
        int int33 = dateTime30.getHourOfDay();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localTime36.toDateTime(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int44 = dateTimeZone42.getOffset((long) (byte) 1);
        long long46 = dateTimeZone40.getMillisKeepLocal(dateTimeZone42, (long) 3);
        org.joda.time.DateTime dateTime47 = dateTime38.withZone(dateTimeZone40);
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = interval48.isBefore((long) 21);
        boolean boolean51 = interval25.isBefore((org.joda.time.ReadableInterval) interval48);
        long long52 = interval48.toDurationMillis();
        long long53 = interval48.getStartMillis();
        org.joda.time.DateTime dateTime54 = interval48.getStart();
        org.joda.time.DateTime.Property property55 = dateTime54.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime57 = property55.setCopy("01:10:00.000");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:10:00.000\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010/2022-02-21T00:11:00.000+00:00:00.010" + "'", str11, "2022-02-21T00:10:00.000+00:00:00.010/2022-02-21T00:11:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60000L + "'", long22 == 60000L);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 3L + "'", long46 == 3L);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1645402199990L + "'", long53 == 1645402199990L);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property55);
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int10 = dateTimeZone8.getOffset((long) (byte) 1);
        long long12 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 3);
        org.joda.time.DateTime dateTime13 = dateTime4.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime15 = dateTime4.minus((long) '#');
        org.joda.time.DateTime.Property property16 = dateTime4.weekyear();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime4.plus(readableDuration17);
        org.joda.time.DateTime dateTime20 = dateTime4.withDayOfMonth(17);
        int int21 = dateTime20.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int26 = dateTimeZone24.getOffset((long) (byte) 1);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(0L, dateTimeZone24);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localTime30.toDateTime(readableInstant31);
        org.joda.time.LocalTime localTime33 = dateTime32.toLocalTime();
        org.joda.time.DateTime.Property property34 = dateTime32.minuteOfHour();
        int int35 = property34.get();
        org.joda.time.Interval interval36 = property34.toInterval();
        org.joda.time.Interval interval37 = interval36.toInterval();
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localTime40.toDateTime(readableInstant41);
        org.joda.time.LocalTime localTime43 = dateTime42.toLocalTime();
        org.joda.time.DateTime.Property property44 = dateTime42.minuteOfHour();
        int int45 = property44.getMinimumValue();
        org.joda.time.DateTime dateTime46 = property44.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = dateTimeZone48.isLocalDateTimeGap(localDateTime49);
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone48);
        org.joda.time.DateTime dateTime52 = dateTime46.withZoneRetainFields(dateTimeZone48);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((java.lang.Object) dateTime52);
        org.joda.time.Interval interval54 = interval37.withEnd((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Period period55 = interval54.toPeriod();
        org.joda.time.DateTime dateTime57 = dateTime27.withPeriodAdded((org.joda.time.ReadablePeriod) period55, (-1645379999));
        org.joda.time.DateTime dateTime59 = dateTime20.withPeriodAdded((org.joda.time.ReadablePeriod) period55, 8);
        org.joda.time.DateTime dateTime60 = dateTime59.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar61 = dateTime59.toGregorianCalendar();
        int int62 = gregorianCalendar61.getWeekYear();
        boolean boolean63 = gregorianCalendar61.isLenient();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(gregorianCalendar61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2022 + "'", int62 == 2022);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.DurationField durationField7 = chronology5.centuries();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = dateTimeField8.getType();
        boolean boolean11 = dateTimeField8.isLeap((long) (-86399));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(1);
        boolean boolean6 = dateTimeFormatter5.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withPivotYear(0);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(0, 5);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withChronology(chronology13);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localTime18.toDateTime(readableInstant19);
        org.joda.time.LocalTime localTime21 = dateTime20.toLocalTime();
        org.joda.time.DateTime.Property property22 = dateTime20.minuteOfHour();
        int int23 = property22.getMinimumValue();
        org.joda.time.DateTime dateTime24 = property22.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = dateTime24.toDateTime(dateTimeZone26);
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) (short) 1, dateTimeZone26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter14.withZone(dateTimeZone26);
        java.lang.StringBuffer stringBuffer31 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localTime34.toDateTime(readableInstant35);
        org.joda.time.LocalTime localTime37 = dateTime36.toLocalTime();
        org.joda.time.DateTime.Property property38 = dateTime36.minuteOfHour();
        org.joda.time.DateTime dateTime40 = dateTime36.plusWeeks(0);
        int int41 = dateTime40.getYearOfEra();
        org.joda.time.DateTime.Property property42 = dateTime40.year();
        int int43 = dateTime40.getYearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime40.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property45 = dateTime40.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter30.printTo(stringBuffer31, (org.joda.time.ReadableInstant) dateTime40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2022 + "'", int41 == 2022);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 22 + "'", int43 == 22);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(property45);
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 1, chronology14);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localTime15, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField18 = chronology6.dayOfYear();
        org.joda.time.DurationField durationField19 = durationFieldType0.getField(chronology6);
        org.joda.time.DurationField durationField20 = chronology6.minutes();
        long long23 = durationField20.subtract(0L, (long) (byte) 1);
        boolean boolean24 = durationField20.isPrecise();
        long long27 = durationField20.add(1645402200000L, (-1L));
        int int30 = durationField20.getDifference(25200000L, 1970L);
        int int33 = durationField20.getDifference((long) 15, 8640000009L);
        long long35 = durationField20.getValueAsLong(53754033L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-60000L) + "'", long23 == (-60000L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1645402140000L + "'", long27 == 1645402140000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 419 + "'", int30 == 419);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-143999) + "'", int33 == (-143999));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 895L + "'", long35 == 895L);
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int12 = dateTimeZone10.getOffset((long) (byte) 1);
        long long14 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 3);
        long long17 = dateTimeZone8.convertLocalToUTC((long) 9, false);
        java.lang.String str18 = dateTimeZone8.toString();
        long long20 = dateTimeZone8.convertUTCToLocal((long) 7);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime4.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime22 = dateTime4.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645402199990L + "'", long6 == 1645402199990L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 17L + "'", long20 == 17L);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localTime4.toDateTime(readableInstant5);
        org.joda.time.Chronology chronology7 = localTime4.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime dateTime9 = localTime8.toDateTimeToday();
        org.joda.time.LocalTime localTime11 = localTime8.minusMinutes(1);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localTime18.toDateTime(readableInstant19);
        int int21 = localTime15.compareTo((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.LocalTime.Property property22 = localTime15.hourOfDay();
        org.joda.time.LocalTime localTime24 = property22.addCopy(6);
        org.joda.time.LocalTime localTime25 = property22.roundCeilingCopy();
        java.util.Locale locale27 = java.util.Locale.US;
        java.lang.String str28 = locale27.getDisplayName();
        org.joda.time.LocalTime localTime29 = property22.setCopy("0", locale27);
        org.joda.time.LocalTime localTime30 = property22.roundFloorCopy();
        int[] intArray32 = chronology12.get((org.joda.time.ReadablePartial) localTime30, 8362592323200099L);
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(chronology12);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(0L, chronology12);
        java.util.GregorianCalendar gregorianCalendar35 = dateTime34.toGregorianCalendar();
        gregorianCalendar35.setLenient(true);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "anglais (Etats-Unis)" + "'", str28, "anglais (Etats-Unis)");
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 99]");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(gregorianCalendar35);
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 1, chronology14);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localTime15, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField18 = chronology6.dayOfYear();
        org.joda.time.DurationField durationField19 = durationFieldType0.getField(chronology6);
        org.joda.time.DurationField durationField20 = chronology6.minutes();
        long long23 = durationField20.subtract(0L, (long) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localTime27.toDateTime(readableInstant28);
        org.joda.time.Chronology chronology30 = localTime27.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.weekyears();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.DateTime dateTime37 = localTime35.toDateTime(readableInstant36);
        org.joda.time.Chronology chronology38 = localTime35.getChronology();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) (byte) 1, chronology38);
        int[] intArray41 = chronology30.get((org.joda.time.ReadablePartial) localTime39, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField42 = chronology30.dayOfYear();
        org.joda.time.DurationField durationField43 = durationFieldType24.getField(chronology30);
        org.joda.time.DurationFieldType durationFieldType44 = durationField43.getType();
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localTime50.toDateTime(readableInstant51);
        org.joda.time.Chronology chronology53 = localTime50.getChronology();
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((long) (byte) 1, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(chronology53);
        org.joda.time.Interval interval56 = new org.joda.time.Interval(0L, 0L, chronology53);
        org.joda.time.DurationField durationField57 = durationFieldType44.getField(chronology53);
        int int58 = durationField20.compareTo(durationField57);
        long long61 = durationField57.add((-60000L), 3L);
        long long64 = durationField57.add(53365113L, 19353600);
        long long67 = durationField57.subtract((long) 2000, 53464);
        int int70 = durationField57.getValue(53742673L, 1645455382475L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-60000L) + "'", long23 == (-60000L));
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10740000L + "'", long61 == 10740000L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 69673013365113L + "'", long64 == 69673013365113L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-192470398000L) + "'", long67 == (-192470398000L));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 14 + "'", int70 == 14);
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.DateTime dateTime8 = property6.roundHalfEvenCopy();
        boolean boolean10 = dateTime8.isBefore((long) (byte) 10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTime(readableInstant15);
        org.joda.time.Chronology chronology17 = localTime14.getChronology();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 1, chronology17);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localTime21.toDateTime(readableInstant22);
        org.joda.time.Chronology chronology24 = localTime21.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.weekyears();
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.DateTime dateTime31 = localTime29.toDateTime(readableInstant30);
        org.joda.time.Chronology chronology32 = localTime29.getChronology();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (byte) 1, chronology32);
        int[] intArray35 = chronology24.get((org.joda.time.ReadablePartial) localTime33, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField36 = chronology24.dayOfYear();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localTime39.toDateTime(readableInstant40);
        org.joda.time.LocalTime localTime42 = dateTime41.toLocalTime();
        org.joda.time.DateTime.Property property43 = dateTime41.minuteOfHour();
        int int44 = property43.get();
        org.joda.time.Interval interval45 = property43.toInterval();
        org.joda.time.DateTime dateTime46 = interval45.getEnd();
        org.joda.time.Period period47 = interval45.toPeriod();
        int[] intArray49 = chronology24.get((org.joda.time.ReadablePeriod) period47, (long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType50 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.DateTime dateTime55 = localTime53.toDateTime(readableInstant54);
        org.joda.time.Chronology chronology56 = localTime53.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.weekyears();
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.DateTime dateTime63 = localTime61.toDateTime(readableInstant62);
        org.joda.time.Chronology chronology64 = localTime61.getChronology();
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime((long) (byte) 1, chronology64);
        int[] intArray67 = chronology56.get((org.joda.time.ReadablePartial) localTime65, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField68 = chronology56.dayOfYear();
        org.joda.time.DurationField durationField69 = durationFieldType50.getField(chronology56);
        int int70 = period47.get(durationFieldType50);
        int[] intArray73 = chronology17.get((org.joda.time.ReadablePeriod) period47, 1645454861756L, (long) 9);
        boolean boolean74 = dateTime8.equals((java.lang.Object) chronology17);
        org.joda.time.DateTimeField dateTimeField75 = chronology17.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-52, -1, -2, -6, -14, -47, -41, -747]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(dateTimeField75);
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTime(readableInstant6);
        int int8 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime11 = property9.addCopy(6);
        org.joda.time.LocalTime localTime12 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime13 = property9.roundCeilingCopy();
        org.joda.time.LocalTime localTime15 = property9.setCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime16 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime18 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localTime21.toDateTime(readableInstant22);
        org.joda.time.LocalTime localTime24 = dateTime23.toLocalTime();
        int int25 = dateTime23.getMonthOfYear();
        int int26 = dateTime23.getHourOfDay();
        org.joda.time.DateTime.Property property27 = dateTime23.dayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = dateTime23.toString(dateTimeFormatter28);
        org.joda.time.DateTime dateTime31 = dateTime23.plusMinutes(17);
        org.joda.time.DateTime dateTime33 = dateTime31.withHourOfDay((int) (short) 10);
        long long34 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime36 = dateTime31.minusHours((-1645401599));
        int int37 = dateTime31.getMinuteOfDay();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010" + "'", str29, "2022-02-21T00:10:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-457056L) + "'", long34 == (-457056L));
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 27 + "'", int37 == 27);
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.DateTime dateTime8 = localTime6.toDateTime(readableInstant7);
        org.joda.time.LocalTime localTime9 = dateTime8.toLocalTime();
        int int10 = dateTime8.getMonthOfYear();
        int int11 = dateTime8.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int17 = dateTimeZone15.getOffset((long) (byte) 1);
        long long19 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 3);
        org.joda.time.DateTime dateTime20 = dateTime8.toDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime22 = dateTime8.withMonthOfYear(3);
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfMonth();
        org.joda.time.DateTime dateTime25 = property23.addToCopy(0);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localTime28.toDateTime(readableInstant29);
        org.joda.time.LocalTime localTime31 = dateTime30.toLocalTime();
        org.joda.time.DateTime.Property property32 = dateTime30.minuteOfHour();
        org.joda.time.DateTime dateTime34 = dateTime30.plusWeeks(0);
        int int35 = dateTime34.getYearOfEra();
        org.joda.time.DateTime.Property property36 = dateTime34.year();
        java.util.Locale locale38 = new java.util.Locale("hours");
        java.lang.String str39 = locale38.getDisplayCountry();
        java.util.Locale locale40 = locale38.stripExtensions();
        int int41 = property36.getMaximumShortTextLength(locale40);
        java.lang.String str42 = property23.getAsText(locale40);
        java.util.Calendar.Builder builder43 = builder3.setLocale(locale40);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localTime46.toDateTime(readableInstant47);
        org.joda.time.LocalTime localTime49 = dateTime48.toLocalTime();
        org.joda.time.DateTime.Property property50 = dateTime48.minuteOfHour();
        int int51 = property50.getMinimumValue();
        org.joda.time.DateTime dateTime52 = property50.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone54);
        org.joda.time.DateTime dateTime56 = dateTime52.toDateTime(dateTimeZone54);
        org.joda.time.DateTime dateTime58 = dateTime56.minusYears(600000);
        java.util.GregorianCalendar gregorianCalendar59 = dateTime58.toGregorianCalendar();
        gregorianCalendar59.setTimeInMillis((long) '4');
        java.util.Calendar calendar62 = java.util.Calendar.getInstance();
        boolean boolean63 = calendar62.isWeekDateSupported();
        long long64 = calendar62.getTimeInMillis();
        java.util.TimeZone timeZone65 = calendar62.getTimeZone();
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.DateTime dateTime70 = localTime68.toDateTime(readableInstant69);
        org.joda.time.Chronology chronology71 = localTime68.getChronology();
        org.joda.time.DurationField durationField72 = chronology71.weekyears();
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.DateTime dateTime78 = localTime76.toDateTime(readableInstant77);
        org.joda.time.Chronology chronology79 = localTime76.getChronology();
        org.joda.time.LocalTime localTime80 = new org.joda.time.LocalTime((long) (byte) 1, chronology79);
        int[] intArray82 = chronology71.get((org.joda.time.ReadablePartial) localTime80, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField83 = chronology71.clockhourOfDay();
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((java.lang.Object) calendar62, chronology71);
        calendar62.set(9, 59, 1439, (-14), 15706, 18);
        java.util.TimeZone timeZone92 = calendar62.getTimeZone();
        gregorianCalendar59.setTimeZone(timeZone92);
        org.joda.time.DateTimeZone dateTimeZone94 = org.joda.time.DateTimeZone.forTimeZone(timeZone92);
        java.util.Calendar.Builder builder95 = builder43.setTimeZone(timeZone92);
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2022 + "'", int35 == 2022);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertEquals(locale38.toString(), "hours");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "hours");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "21" + "'", str42, "21");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(gregorianCalendar59);
        org.junit.Assert.assertNotNull(calendar62);
// flaky:         org.junit.Assert.assertEquals(calendar62.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=9,MONTH=59,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=1439,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=-14,MINUTE=15706,SECOND=18,MILLISECOND=876,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1645455449876L + "'", long64 == 1645455449876L);
        org.junit.Assert.assertNotNull(timeZone65);
        org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertNotNull(timeZone92);
        org.junit.Assert.assertEquals(timeZone92.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone94);
        org.junit.Assert.assertNotNull(builder95);
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(1);
        boolean boolean6 = dateTimeFormatter5.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter5.getParser();
        org.joda.time.Chronology chronology9 = dateTimeFormatter5.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = dateTime14.toString(dateTimeFormatter15);
        int int17 = dateTime14.getEra();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime14, readableDuration18);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localTime22.toDateTime(readableInstant23);
        org.joda.time.LocalTime localTime25 = dateTime24.toLocalTime();
        org.joda.time.DateTime.Property property26 = dateTime24.minuteOfHour();
        int int27 = property26.get();
        org.joda.time.Interval interval28 = property26.toInterval();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localTime31.toDateTime(readableInstant32);
        org.joda.time.LocalTime localTime34 = dateTime33.toLocalTime();
        org.joda.time.DateTime.Property property35 = dateTime33.minuteOfHour();
        int int36 = property35.getMinimumValue();
        org.joda.time.DateTime dateTime37 = property35.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property38 = dateTime37.dayOfYear();
        boolean boolean39 = interval28.contains((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localTime42.toDateTime(readableInstant43);
        org.joda.time.LocalTime localTime45 = dateTime44.toLocalTime();
        org.joda.time.DateTime.Property property46 = dateTime44.minuteOfHour();
        java.lang.String str47 = property46.toString();
        org.joda.time.DateTime dateTime48 = property46.roundFloorCopy();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.minus(readableDuration49);
        org.joda.time.Interval interval51 = interval28.withStart((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Interval interval52 = interval28.toInterval();
        org.joda.time.Interval interval53 = interval19.overlap((org.joda.time.ReadableInterval) interval52);
        org.joda.time.Chronology chronology54 = interval19.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter12.withChronology(chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.halfdayOfDay();
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01T00:00:00.062+00:00:00.010" + "'", str16, "1970-01-01T00:00:00.062+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Property[minuteOfHour]" + "'", str47, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTimeField56);
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(1);
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) '4');
        int int9 = dateTimeFormatter8.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = dateTimeFormatter8.parseLocalDate("53681683");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale4 = new java.util.Locale("", "hi!", "");
        java.lang.String str5 = locale0.getDisplayCountry(locale4);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale0);
        calendar6.setLenient(true);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int13 = dateTimeZone11.getOffset((long) (byte) 1);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(0L, dateTimeZone11);
        java.util.TimeZone timeZone15 = dateTimeZone11.toTimeZone();
        calendar6.setTimeZone(timeZone15);
        java.util.Locale locale17 = java.util.Locale.US;
        java.util.Locale locale21 = new java.util.Locale("", "hi!", "");
        java.lang.String str22 = locale17.getDisplayCountry(locale21);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(locale17);
        java.util.TimeZone timeZone24 = calendar23.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.Locale locale26 = java.util.Locale.US;
        java.util.Locale locale30 = new java.util.Locale("", "hi!", "");
        java.lang.String str31 = locale26.getDisplayCountry(locale30);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale26);
        java.util.Locale locale33 = java.util.Locale.ITALY;
        boolean boolean34 = locale33.hasExtensions();
        java.lang.String str35 = locale26.getDisplayCountry(locale33);
        java.util.Locale locale38 = new java.util.Locale("600000", "\u82f1\u6587");
        java.lang.String str39 = locale26.getDisplayName(locale38);
        java.lang.String str40 = locale26.getLanguage();
        java.lang.String str41 = locale26.getDisplayCountry();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone24, locale26);
        calendar6.setTimeZone(timeZone24);
        java.time.Instant instant44 = calendar6.toInstant();
        java.util.Date date45 = java.util.Date.from(instant44);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals(locale4.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "United States" + "'", str5, "United States");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455449949,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=29,MILLISECOND=949,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertEquals(locale21.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "United States" + "'", str22, "United States");
        org.junit.Assert.assertNotNull(calendar23);
// flaky:         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=1645455449949,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=29,MILLISECOND=949,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertEquals(locale30.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "United States" + "'", str31, "United States");
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1645455449949,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=29,MILLISECOND=949,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Stati Uniti" + "'", str35, "Stati Uniti");
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "English (United States)" + "'", str39, "English (United States)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "en" + "'", str40, "en");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Etats-Unis" + "'", str41, "Etats-Unis");
        org.junit.Assert.assertNotNull(calendar42);
// flaky:         org.junit.Assert.assertEquals(calendar42.toString(), "java.util.GregorianCalendar[time=1645455449949,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=29,MILLISECOND=949,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Mon Feb 21 14:57:29 UTC 2022");
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1, chronology6);
        org.joda.time.DateTime dateTime8 = localTime7.toDateTimeToday();
        org.joda.time.LocalTime localTime10 = localTime7.minusMinutes(1);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology11.getZone();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(53559467L, 1645455421421L, dateTimeZone2);
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime.Property property7 = dateTime4.hourOfDay();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int18 = dateTimeZone16.getOffset((long) (byte) 1);
        long long20 = dateTimeZone14.getMillisKeepLocal(dateTimeZone16, (long) 3);
        org.joda.time.DateTime dateTime21 = dateTime12.withZone(dateTimeZone14);
        org.joda.time.DateTime dateTime23 = dateTime12.minus((long) '#');
        org.joda.time.DateTime.Property property24 = dateTime12.weekyear();
        org.joda.time.DateTime dateTime26 = dateTime12.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime27 = dateTime12.toDateTime();
        org.joda.time.DateTime dateTime29 = dateTime12.withWeekyear(15);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.yearOfEra();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 10);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone36);
        int int39 = dateTimeField33.getMaximumValue((org.joda.time.ReadablePartial) localTime38);
        int int40 = localTime38.getSecondOfMinute();
        org.joda.time.LocalTime localTime42 = localTime38.plusSeconds(99);
        int int43 = property7.compareTo((org.joda.time.ReadablePartial) localTime42);
        java.lang.String str44 = property7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime46 = property7.setCopy("1970");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 999 + "'", int39 == 999);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 30 + "'", int40 == 30);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Property[hourOfDay]" + "'", str44, "Property[hourOfDay]");
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        java.util.Locale locale7 = dateTimeFormatter6.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatter10.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withDefaultYear(1);
        boolean boolean14 = dateTimeFormatter13.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser17 = dateTimeFormatter13.getParser();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int23 = dateTimeZone21.getOffset((long) (byte) 1);
        long long25 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 3);
        long long28 = dateTimeZone19.convertLocalToUTC((long) 9, false);
        java.lang.String str29 = dateTimeZone19.toString();
        java.lang.String str31 = dateTimeZone19.getShortName((long) (byte) 100);
        java.lang.String str32 = dateTimeZone19.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter13.withZone(dateTimeZone19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter6.withZone(dateTimeZone19);
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNull(dateTimePrinter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimeParser17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3L + "'", long25 == 3L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.010" + "'", str29, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.010" + "'", str31, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.010" + "'", str32, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.DateTime dateTime8 = localTime6.toDateTime(readableInstant7);
        org.joda.time.Chronology chronology9 = localTime6.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weekyears();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTime(readableInstant15);
        org.joda.time.Chronology chronology17 = localTime14.getChronology();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 1, chronology17);
        int[] intArray20 = chronology9.get((org.joda.time.ReadablePartial) localTime18, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField21 = chronology9.dayOfYear();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localTime24.toDateTime(readableInstant25);
        org.joda.time.LocalTime localTime27 = dateTime26.toLocalTime();
        org.joda.time.DateTime.Property property28 = dateTime26.minuteOfHour();
        int int29 = property28.get();
        org.joda.time.Interval interval30 = property28.toInterval();
        org.joda.time.DateTime dateTime31 = interval30.getEnd();
        org.joda.time.Period period32 = interval30.toPeriod();
        int[] intArray34 = chronology9.get((org.joda.time.ReadablePeriod) period32, (long) (byte) 100);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localTime38.toDateTime(readableInstant39);
        org.joda.time.Chronology chronology41 = localTime38.getChronology();
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (byte) 1, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.dayOfMonth();
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.now(chronology41);
        long long47 = chronology9.set((org.joda.time.ReadablePartial) localTime45, 25200000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((-1), (-251999), 2922789, 258, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(localTime45);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 53850073L + "'", long47 == 53850073L);
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTime(readableInstant6);
        int int8 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime11 = property9.addCopy(6);
        org.joda.time.LocalTime localTime12 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime13 = property9.roundCeilingCopy();
        org.joda.time.LocalTime localTime15 = property9.setCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime16 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime18 = property9.addWrapFieldToCopy(0);
        org.joda.time.DateTimeField dateTimeField19 = property9.getField();
        org.joda.time.LocalTime localTime20 = property9.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = property9.setCopy(15706);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15706 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        int int8 = durationField6.getValue(0L);
        long long10 = durationField6.getMillis((long) 15);
        org.joda.time.DurationFieldType durationFieldType11 = durationField6.getType();
        boolean boolean12 = durationField6.isSupported();
        int int15 = durationField6.getDifference(1645455247462L, 337656729600000L);
        long long18 = durationField6.subtract((long) 86399, (-100800));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 473354280000L + "'", long10 == 473354280000L);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10647) + "'", int15 == (-10647));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3180940761686399L + "'", long18 == 3180940761686399L);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        java.lang.String str7 = property6.toString();
        org.joda.time.DateTime dateTime8 = property6.roundFloorCopy();
        org.joda.time.DateTime dateTime10 = dateTime8.plusSeconds((int) '4');
        boolean boolean11 = dateTime8.isBeforeNow();
        org.joda.time.DateTime.Property property12 = dateTime8.monthOfYear();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localTime15.toDateTime(readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int23 = dateTimeZone21.getOffset((long) (byte) 1);
        long long25 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 3);
        org.joda.time.DateTime dateTime26 = dateTime17.withZone(dateTimeZone19);
        org.joda.time.DateTime dateTime28 = dateTime17.minus((long) '#');
        org.joda.time.DateTime.Property property29 = dateTime17.weekyear();
        org.joda.time.DateTime dateTime31 = dateTime17.withWeekOfWeekyear((int) (short) 10);
        boolean boolean33 = dateTime17.isEqual((long) (byte) -1);
        org.joda.time.DateTime dateTime35 = dateTime17.plusWeeks(0);
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime35.toMutableDateTimeISO();
        boolean boolean37 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime39 = dateTime8.minusHours(100);
        org.joda.time.DateTime.Property property40 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime41 = property40.withMinimumValue();
        java.lang.String str42 = property40.getAsString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[minuteOfHour]" + "'", str7, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3L + "'", long25 == 3L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "20" + "'", str42, "20");
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(1);
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) '4');
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withLocale(locale9);
        boolean boolean11 = dateTimeFormatter8.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter12.print(53576804L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.LocalTime localTime6 = dateTime5.toLocalTime();
        org.joda.time.DateTime.Property property7 = dateTime5.minuteOfHour();
        int int8 = property7.getMinimumValue();
        org.joda.time.DateTime dateTime9 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfYear();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTime(readableInstant14);
        org.joda.time.Chronology chronology16 = localTime13.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weekyears();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localTime21.toDateTime(readableInstant22);
        org.joda.time.Chronology chronology24 = localTime21.getChronology();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (byte) 1, chronology24);
        int[] intArray27 = chronology16.get((org.joda.time.ReadablePartial) localTime25, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField28 = chronology16.dayOfYear();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localTime31.toDateTime(readableInstant32);
        org.joda.time.LocalTime localTime34 = dateTime33.toLocalTime();
        org.joda.time.DateTime.Property property35 = dateTime33.minuteOfHour();
        int int36 = property35.get();
        org.joda.time.Interval interval37 = property35.toInterval();
        org.joda.time.DateTime dateTime38 = interval37.getEnd();
        org.joda.time.Period period39 = interval37.toPeriod();
        int[] intArray41 = chronology16.get((org.joda.time.ReadablePeriod) period39, (long) (byte) 100);
        org.joda.time.DateTime dateTime42 = dateTime9.minus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Interval interval43 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) period39);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localTime46.toDateTime(readableInstant47);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int54 = dateTimeZone52.getOffset((long) (byte) 1);
        long long56 = dateTimeZone50.getMillisKeepLocal(dateTimeZone52, (long) 3);
        org.joda.time.DateTime dateTime57 = dateTime48.withZone(dateTimeZone50);
        org.joda.time.DateTime dateTime59 = dateTime48.minus((long) '#');
        org.joda.time.DateTime.Property property60 = dateTime48.weekyear();
        org.joda.time.DateTime dateTime62 = dateTime48.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime63 = dateTime48.toDateTime();
        org.joda.time.Interval interval64 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period39, (org.joda.time.ReadableInstant) dateTime48);
        boolean boolean65 = interval64.isAfterNow();
        boolean boolean66 = interval64.containsNow();
        org.joda.time.Duration duration67 = interval64.toDuration();
        org.joda.time.Duration duration68 = duration67.toDuration();
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.DateTime dateTime73 = localTime71.toDateTime(readableInstant72);
        org.joda.time.LocalTime localTime74 = dateTime73.toLocalTime();
        int int75 = dateTime73.getMonthOfYear();
        int int76 = dateTime73.getHourOfDay();
        org.joda.time.DateTime.Property property77 = dateTime73.dayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = null;
        java.lang.String str79 = dateTime73.toString(dateTimeFormatter78);
        org.joda.time.DateTime dateTime81 = dateTime73.plusMinutes(17);
        org.joda.time.DateTime.Property property82 = dateTime81.yearOfEra();
        org.joda.time.DateTime dateTime83 = dateTime81.toDateTimeISO();
        org.joda.time.DateTime.Property property84 = dateTime81.weekyear();
        org.joda.time.DateTime.Property property85 = dateTime81.weekyear();
        org.joda.time.DateTime dateTime86 = property85.roundCeilingCopy();
        org.joda.time.Interval interval87 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration68, (org.joda.time.ReadableInstant) dateTime86);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 3L + "'", long56 == 3L);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010" + "'", str79, "2022-02-21T00:10:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(dateTime86);
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder3.setDate(7200000, (-100800), 53358486);
        java.util.Calendar.Builder builder11 = builder7.setWeekDate(53419115, (-27423368), 892);
        java.util.Calendar.Builder builder13 = builder7.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder16 = builder7.setWeekDefinition((-600051), 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(5, 292278993, (-143999));
        java.util.Calendar calendar5 = builder4.build();
        calendar5.add(0, (int) (short) 10);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.LocalTime localTime14 = dateTime13.toLocalTime();
        org.joda.time.DateTime.Property property15 = dateTime13.minuteOfHour();
        java.lang.String str16 = property15.toString();
        org.joda.time.DateTime dateTime17 = property15.roundFloorCopy();
        org.joda.time.DateTime dateTime19 = property15.addToCopy((long) 366);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localTime22.toDateTime(readableInstant23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusYears(7);
        org.joda.time.DateTime dateTime28 = dateTime24.plusWeeks((int) (short) 10);
        int int29 = property15.getDifference((org.joda.time.ReadableInstant) dateTime28);
        boolean boolean30 = calendar5.before((java.lang.Object) property15);
        long long31 = calendar5.getTimeInMillis();
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.LocalTime.Property property33 = localTime32.millisOfSecond();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=17536613581000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2525,MONTH=8,WEEK_OF_YEAR=38,WEEK_OF_MONTH=3,DAY_OF_MONTH=18,DAY_OF_YEAR=261,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=33,SECOND=1,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Property[minuteOfHour]" + "'", str16, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-100800) + "'", int29 == (-100800));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 17536613581000L + "'", long31 == 17536613581000L);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int10 = dateTimeZone8.getOffset((long) (byte) 1);
        long long12 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 3);
        org.joda.time.DateTime dateTime13 = dateTime4.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime15 = dateTime4.minus((long) '#');
        org.joda.time.DateTime.Property property16 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime18 = dateTime4.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime19 = dateTime4.toDateTime();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localTime23.toDateTime(readableInstant24);
        org.joda.time.Chronology chronology26 = localTime23.getChronology();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (byte) 1, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.monthOfYear();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) dateTime19, chronology26);
        int int32 = localTime31.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = localTime31.toString("Jan 1, 1970 12:01:54 AM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 59 + "'", int32 == 59);
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.Chronology chronology13 = localTime10.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 1, chronology13);
        int[] intArray16 = chronology5.get((org.joda.time.ReadablePartial) localTime14, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = chronology5.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localTime22.toDateTime(readableInstant23);
        org.joda.time.Chronology chronology25 = localTime22.getChronology();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (byte) 1, chronology25);
        boolean boolean27 = dateTimeFieldType18.isSupported(chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localTime32.toDateTime(readableInstant33);
        org.joda.time.Chronology chronology35 = localTime32.getChronology();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (byte) 1, chronology35);
        int int37 = dateTimeField28.getMaximumValue((org.joda.time.ReadablePartial) localTime36);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) 1);
        int[] intArray40 = localTime39.getValues();
        int int41 = dateTimeField17.getMaximumValue((org.joda.time.ReadablePartial) localTime36, intArray40);
        org.joda.time.LocalTime.Property property42 = localTime36.millisOfSecond();
        org.joda.time.LocalTime localTime43 = property42.withMaximumValue();
        org.joda.time.LocalTime localTime45 = property42.setCopy(0);
        org.joda.time.DateTimeField dateTimeField46 = property42.getField();
        org.joda.time.DateTimeField dateTimeField47 = property42.getField();
        long long49 = dateTimeField47.roundHalfCeiling(19353600117L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2922789 + "'", int37 == 2922789);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 0, 11]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 366 + "'", int41 == 366);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 19353600117L + "'", long49 == 19353600117L);
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        long long6 = java.util.Date.UTC(32769, 17, (-1645433246), 46, 32770, 53740);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-141133482665660000L) + "'", long6 == (-141133482665660000L));
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        int int7 = dateTime4.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int13 = dateTimeZone11.getOffset((long) (byte) 1);
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 3);
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfDay();
        java.lang.String str18 = property17.getAsText();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localTime21.toDateTime(readableInstant22);
        org.joda.time.LocalTime localTime24 = dateTime23.toLocalTime();
        org.joda.time.DateTime.Property property25 = dateTime23.minuteOfHour();
        int int26 = property25.getMinimumValue();
        org.joda.time.DateTime dateTime27 = property25.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfYear();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localTime31.toDateTime(readableInstant32);
        org.joda.time.Chronology chronology34 = localTime31.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.weekyears();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localTime39.toDateTime(readableInstant40);
        org.joda.time.Chronology chronology42 = localTime39.getChronology();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (byte) 1, chronology42);
        int[] intArray45 = chronology34.get((org.joda.time.ReadablePartial) localTime43, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField46 = chronology34.dayOfYear();
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.DateTime dateTime51 = localTime49.toDateTime(readableInstant50);
        org.joda.time.LocalTime localTime52 = dateTime51.toLocalTime();
        org.joda.time.DateTime.Property property53 = dateTime51.minuteOfHour();
        int int54 = property53.get();
        org.joda.time.Interval interval55 = property53.toInterval();
        org.joda.time.DateTime dateTime56 = interval55.getEnd();
        org.joda.time.Period period57 = interval55.toPeriod();
        int[] intArray59 = chronology34.get((org.joda.time.ReadablePeriod) period57, (long) (byte) 100);
        org.joda.time.DateTime dateTime60 = dateTime27.minus((org.joda.time.ReadablePeriod) period57);
        org.joda.time.DateTime dateTime62 = dateTime60.withWeekyear((int) (byte) 0);
        long long63 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime62);
        java.lang.String str64 = property17.getAsShortText();
        org.joda.time.DateTime dateTime66 = property17.addWrapFieldToCopy(53702416);
        org.joda.time.DateTime dateTime67 = property17.roundCeilingCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "600000" + "'", str18, "600000");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 63808214460000L + "'", long63 == 63808214460000L);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "600000" + "'", str64, "600000");
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime67);
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        java.util.Date date5 = new java.util.Date(5, (-1645379999), 3, (-95), 600000);
        date5.setSeconds(1022);
        int int8 = date5.getYear();
        org.junit.Assert.assertEquals(date5.toString(), "Sun Mar 22 17:17:02 UTC 137113095");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 137111195 + "'", int8 == 137111195);
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        int int7 = dateTime4.getHourOfDay();
        org.joda.time.DateTime.Property property8 = dateTime4.dayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = dateTime4.toString(dateTimeFormatter9);
        org.joda.time.DateTime dateTime12 = dateTime4.plusMinutes(17);
        org.joda.time.DateTime dateTime14 = dateTime12.withHourOfDay((int) (short) 10);
        int int15 = dateTime12.getSecondOfDay();
        org.joda.time.LocalTime localTime16 = dateTime12.toLocalTime();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010" + "'", str10, "2022-02-21T00:10:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1620 + "'", int15 == 1620);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.DateTime dateTime9 = interval8.getEnd();
        org.joda.time.Period period10 = interval8.toPeriod();
        java.lang.String str11 = interval8.toString();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTime(readableInstant15);
        org.joda.time.LocalTime localTime17 = dateTime16.toLocalTime();
        org.joda.time.DateTime.Property property18 = dateTime16.minuteOfHour();
        int int19 = property18.get();
        org.joda.time.Interval interval20 = property18.toInterval();
        org.joda.time.Interval interval21 = interval20.toInterval();
        long long22 = interval20.toDurationMillis();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = interval20.toPeriod(periodType23);
        org.joda.time.Interval interval25 = interval8.overlap((org.joda.time.ReadableInterval) interval20);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localTime28.toDateTime(readableInstant29);
        org.joda.time.LocalTime localTime31 = dateTime30.toLocalTime();
        int int32 = dateTime30.getMonthOfYear();
        int int33 = dateTime30.getHourOfDay();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localTime36.toDateTime(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int44 = dateTimeZone42.getOffset((long) (byte) 1);
        long long46 = dateTimeZone40.getMillisKeepLocal(dateTimeZone42, (long) 3);
        org.joda.time.DateTime dateTime47 = dateTime38.withZone(dateTimeZone40);
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = interval48.isBefore((long) 21);
        boolean boolean51 = interval25.isBefore((org.joda.time.ReadableInterval) interval48);
        org.joda.time.Duration duration52 = interval48.toDuration();
        java.lang.String str53 = interval48.toString();
        org.joda.time.Duration duration54 = interval48.toDuration();
        long long55 = duration54.getMillis();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010/2022-02-21T00:11:00.000+00:00:00.010" + "'", str11, "2022-02-21T00:10:00.000+00:00:00.010/2022-02-21T00:11:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60000L + "'", long22 == 60000L);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 3L + "'", long46 == 3L);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010/2022-02-21T00:10:00.000+00:00:00.010" + "'", str53, "2022-02-21T00:10:00.000+00:00:00.010/2022-02-21T00:10:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        java.lang.String str3 = calendar2.getCalendarType();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        calendar2.clear();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localTime8.toDateTime(readableInstant9);
        org.joda.time.LocalTime localTime11 = dateTime10.toLocalTime();
        org.joda.time.DateTime.Property property12 = dateTime10.minuteOfHour();
        int int13 = property12.get();
        org.joda.time.Interval interval14 = property12.toInterval();
        org.joda.time.Interval interval15 = interval14.toInterval();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localTime18.toDateTime(readableInstant19);
        org.joda.time.LocalTime localTime21 = dateTime20.toLocalTime();
        org.joda.time.DateTime.Property property22 = dateTime20.minuteOfHour();
        int int23 = property22.get();
        org.joda.time.Interval interval24 = property22.toInterval();
        org.joda.time.Interval interval25 = interval24.toInterval();
        boolean boolean26 = interval15.isBefore((org.joda.time.ReadableInterval) interval24);
        org.joda.time.DateTime dateTime27 = interval15.getEnd();
        org.joda.time.LocalTime localTime28 = dateTime27.toLocalTime();
        org.joda.time.DateTime dateTime30 = dateTime27.withMillisOfSecond(0);
        boolean boolean31 = calendar2.after((java.lang.Object) 0);
        int int33 = calendar2.getMinimum(15);
        calendar2.setLenient(false);
        int int36 = calendar2.getWeeksInWeekYear();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais" + "'", str1, "anglais");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gregory" + "'", str3, "gregory");
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-46800000) + "'", int33 == (-46800000));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        java.util.Date date1 = new java.util.Date((long) (byte) 100);
        date1.setMinutes(11);
        long long4 = date1.getTime();
        int int5 = date1.getMonth();
        int int6 = date1.getMonth();
        java.time.Instant instant7 = date1.toInstant();
        java.util.Date date13 = new java.util.Date(0, 3, 4, 21, 2922789);
        boolean boolean14 = date1.after(date13);
        int int15 = date1.getMonth();
        int int16 = date1.getMonth();
        date1.setSeconds(53417);
        java.time.Instant instant19 = date1.toInstant();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 15:01:17 UTC 1970");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 660100L + "'", long4 == 660100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Oct 25 14:09:00 UTC 1905");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(instant19);
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.DateTime dateTime9 = property6.setCopy((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = property6.roundHalfFloorCopy();
        int int11 = property6.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int10 = dateTimeZone8.getOffset((long) (byte) 1);
        long long12 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 3);
        org.joda.time.DateTime dateTime13 = dateTime4.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime15 = dateTime4.minus((long) '#');
        org.joda.time.DateTime.Property property16 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime18 = dateTime4.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime19 = dateTime4.toDateTime();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localTime23.toDateTime(readableInstant24);
        org.joda.time.Chronology chronology26 = localTime23.getChronology();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (byte) 1, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.monthOfYear();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) dateTime19, chronology26);
        org.joda.time.DurationField durationField32 = chronology26.weeks();
        java.lang.String str33 = chronology26.toString();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime dateTime36 = dateTime34.plusWeeks((-292275054));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ISOChronology[UTC]" + "'", str33, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 0, dateTimeZone2);
        org.joda.time.LocalTime localTime7 = localTime5.minusMinutes(3);
        int int8 = localTime7.getHourOfDay();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime11.plus(readablePeriod14);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localTime18.toDateTime(readableInstant19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int26 = dateTimeZone24.getOffset((long) (byte) 1);
        long long28 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) 3);
        org.joda.time.DateTime dateTime29 = dateTime20.withZone(dateTimeZone22);
        org.joda.time.DateTime dateTime31 = dateTime29.minusSeconds((int) 'u');
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, readableDuration32);
        org.joda.time.Period period34 = interval33.toPeriod();
        org.joda.time.LocalTime localTime35 = localTime11.plus((org.joda.time.ReadablePeriod) period34);
        int int36 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.LocalTime.Property property37 = localTime7.millisOfDay();
        org.joda.time.LocalTime localTime38 = property37.roundHalfEvenCopy();
        java.lang.String str39 = property37.toString();
        org.joda.time.LocalTime localTime40 = property37.roundHalfCeilingCopy();
        java.lang.String str41 = property37.getAsString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 23 + "'", int8 == 23);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3L + "'", long28 == 3L);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Property[millisOfDay]" + "'", str39, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "86220010" + "'", str41, "86220010");
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.LocalTime localTime6 = dateTime5.toLocalTime();
        org.joda.time.DateTime.Property property7 = dateTime5.minuteOfHour();
        int int8 = property7.get();
        org.joda.time.Interval interval9 = property7.toInterval();
        org.joda.time.Interval interval10 = interval9.toInterval();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTime(readableInstant14);
        org.joda.time.LocalTime localTime16 = dateTime15.toLocalTime();
        org.joda.time.DateTime.Property property17 = dateTime15.minuteOfHour();
        int int18 = property17.getMinimumValue();
        org.joda.time.DateTime dateTime19 = property17.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone21.isLocalDateTimeGap(localDateTime22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = dateTime19.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((java.lang.Object) dateTime25);
        org.joda.time.Interval interval27 = interval10.withEnd((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Period period28 = interval27.toPeriod();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Interval interval30 = interval27.withDurationAfterStart(readableDuration29);
        org.joda.time.Duration duration31 = interval30.toDuration();
        org.joda.time.Period period32 = duration31.toPeriod();
        org.joda.time.Interval interval33 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadableDuration) duration31);
        boolean boolean35 = interval33.isAfter(1581951290962L);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int10 = dateTimeZone8.getOffset((long) (byte) 1);
        long long12 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 3);
        org.joda.time.DateTime dateTime13 = dateTime4.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime15 = dateTime4.minus((long) '#');
        org.joda.time.DateTime.Property property16 = dateTime4.weekyear();
        org.joda.time.Instant instant17 = dateTime4.toInstant();
        java.lang.String str18 = instant17.toString();
        java.lang.Object obj19 = null;
        boolean boolean20 = instant17.equals(obj19);
        org.joda.time.Instant instant23 = instant17.withDurationAdded(53377960L, (-1645380000));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2022-02-21T00:09:59.990Z" + "'", str18, "2022-02-21T00:09:59.990Z");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant23);
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int10 = dateTimeZone8.getOffset((long) (byte) 1);
        long long12 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 3);
        org.joda.time.DateTime dateTime13 = dateTime4.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime15 = dateTime4.minus((long) '#');
        org.joda.time.DateTime.Property property16 = dateTime4.weekyear();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime4.plus(readableDuration17);
        int int19 = dateTime4.getSecondOfDay();
        java.util.GregorianCalendar gregorianCalendar20 = dateTime4.toGregorianCalendar();
        org.joda.time.DateTime.Property property21 = dateTime4.weekyear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 600 + "'", int19 == 600);
        org.junit.Assert.assertNotNull(gregorianCalendar20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusYears(7);
        org.joda.time.DateTime dateTime8 = dateTime4.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(1645454883623L);
        int int11 = dateTime10.getYear();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTime(readableInstant15);
        org.joda.time.LocalTime localTime17 = dateTime16.toLocalTime();
        org.joda.time.DateTime.Property property18 = dateTime16.minuteOfHour();
        int int19 = property18.getMinimumValue();
        org.joda.time.DateTime dateTime20 = property18.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = dateTime20.toDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = dateTime24.minusYears(600000);
        java.util.GregorianCalendar gregorianCalendar27 = dateTime26.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime26.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime28.toMutableDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime10.toDateTime(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        long long38 = dateTimeZone34.adjustOffset(111539999L, true);
        int int40 = dateTimeZone34.getOffsetFromLocal(1645454998615L);
        long long42 = dateTimeZone30.getMillisKeepLocal(dateTimeZone34, 1645454998572L);
        org.joda.time.DateTime dateTime43 = dateTime8.toDateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime45 = dateTime43.minusMillis((int) ' ');
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 111539999L + "'", long38 == 111539999L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1645454998572L + "'", long42 == 1645454998572L);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        int int7 = dateTime4.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, readablePeriod8);
        org.joda.time.DateTime dateTime11 = dateTime4.plusMinutes(5);
        org.joda.time.DateTime dateTime13 = dateTime4.minusMillis(419);
        org.joda.time.DateTime dateTime15 = dateTime4.plusMillis((int) ' ');
        org.joda.time.DateTime.Property property16 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime18 = property16.addToCopy(1645455370417L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        java.util.Locale locale1 = new java.util.Locale("ISOChronology[+00:48:42.789]");
        org.junit.Assert.assertEquals(locale1.toString(), "isochronology[+00:48:42.789]");
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.Chronology chronology13 = localTime10.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 1, chronology13);
        int[] intArray16 = chronology5.get((org.joda.time.ReadablePartial) localTime14, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = chronology5.dayOfYear();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localTime20.toDateTime(readableInstant21);
        org.joda.time.LocalTime localTime23 = dateTime22.toLocalTime();
        org.joda.time.DateTime.Property property24 = dateTime22.minuteOfHour();
        int int25 = property24.get();
        org.joda.time.Interval interval26 = property24.toInterval();
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.Period period28 = interval26.toPeriod();
        int[] intArray30 = chronology5.get((org.joda.time.ReadablePeriod) period28, (long) (byte) 100);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localTime33.toDateTime(readableInstant34);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int41 = dateTimeZone39.getOffset((long) (byte) 1);
        long long43 = dateTimeZone37.getMillisKeepLocal(dateTimeZone39, (long) 3);
        org.joda.time.DateTime dateTime44 = dateTime35.withZone(dateTimeZone37);
        org.joda.time.DateTime dateTime46 = dateTime44.minusSeconds((int) 'u');
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime44, readableDuration47);
        org.joda.time.Period period49 = interval48.toPeriod();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = interval48.toPeriod(periodType50);
        org.joda.time.Period period52 = period51.toPeriod();
        int[] intArray55 = chronology5.get((org.joda.time.ReadablePeriod) period52, 19044L, (-60000L));
        org.joda.time.DateTimeField dateTimeField56 = chronology5.centuryOfEra();
        int int58 = dateTimeField56.getLeapAmount(1140568147L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3L + "'", long43 == 3L);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 0, 0, 0, -1, -19, -44]");
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.lang.String str2 = locale1.getScript();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale1);
        java.lang.Object obj4 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTime(readableInstant8);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localTime12.toDateTime(readableInstant13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime16 = localTime12.plus(readablePeriod15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean18 = localTime16.isSupported(dateTimeFieldType17);
        org.joda.time.DateTime dateTime19 = dateTime9.withFields((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int25 = dateTimeZone23.getOffset((long) (byte) 1);
        long long27 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, (long) 3);
        long long30 = dateTimeZone21.convertLocalToUTC((long) 9, false);
        java.lang.String str31 = dateTimeZone21.toString();
        org.joda.time.DateTime dateTime32 = localTime16.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj4, dateTimeZone21);
        java.lang.String str35 = dateTimeZone21.getName(53262062L);
        boolean boolean36 = calendar3.before((java.lang.Object) str35);
        int int37 = calendar3.getWeekYear();
        java.util.Date date38 = calendar3.getTime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = calendar3.isSet((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455450536,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=30,MILLISECOND=536,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3L + "'", long27 == 3L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.010" + "'", str31, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.010" + "'", str35, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Mon Feb 21 14:57:30 UTC 2022");
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        java.util.Date date4 = calendar2.getTime();
        int int5 = date4.getSeconds();
        java.lang.String str6 = date4.toGMTString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais" + "'", str1, "anglais");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455450554,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=30,MILLISECOND=554,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:57:30 UTC 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 30 + "'", int5 == 30);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "21 Feb 2022 14:57:30 GMT" + "'", str6, "21 Feb 2022 14:57:30 GMT");
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.lang.String str3 = dateTimeZone0.getShortName((long) 2922789, locale2);
        java.util.Locale.setDefault(locale2);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTime(readableInstant8);
        org.joda.time.LocalTime localTime10 = dateTime9.toLocalTime();
        org.joda.time.DateTime.Property property11 = dateTime9.minuteOfHour();
        int int12 = property11.getMinimumValue();
        org.joda.time.DateTime dateTime13 = property11.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property11.getFieldType();
        int int15 = property11.get();
        org.joda.time.DateTime dateTime16 = property11.withMaximumValue();
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks(22200000);
        org.joda.time.DateTime.Property property19 = dateTime16.secondOfMinute();
        java.util.Locale.Category category20 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale21 = java.util.Locale.getDefault(category20);
        java.util.Locale locale22 = java.util.Locale.getDefault(category20);
        java.util.Locale locale23 = java.util.Locale.getDefault(category20);
        java.lang.String str24 = property19.getAsShortText(locale23);
        java.util.Locale locale25 = locale23.stripExtensions();
        java.lang.String str26 = locale2.getDisplayVariant(locale25);
        java.util.Set<java.lang.Character> charSet27 = locale25.getExtensionKeys();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.010" + "'", str3, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.FORMAT + "'", category20.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charSet27);
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(53417);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(35);
        boolean boolean9 = dateTimeFormatter8.isOffsetParsed();
        java.lang.Object obj10 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTime(readableInstant14);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localTime18.toDateTime(readableInstant19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime18.plus(readablePeriod21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean24 = localTime22.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = dateTime15.withFields((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int31 = dateTimeZone29.getOffset((long) (byte) 1);
        long long33 = dateTimeZone27.getMillisKeepLocal(dateTimeZone29, (long) 3);
        long long36 = dateTimeZone27.convertLocalToUTC((long) 9, false);
        java.lang.String str37 = dateTimeZone27.toString();
        org.joda.time.DateTime dateTime38 = localTime22.toDateTimeToday(dateTimeZone27);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(obj10, dateTimeZone27);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localTime42.toDateTime(readableInstant43);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int50 = dateTimeZone48.getOffset((long) (byte) 1);
        long long52 = dateTimeZone46.getMillisKeepLocal(dateTimeZone48, (long) 3);
        org.joda.time.DateTime dateTime53 = dateTime44.withZone(dateTimeZone46);
        org.joda.time.DateTime dateTime55 = dateTime53.minusSeconds((int) 'u');
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localTime58.toDateTime(readableInstant59);
        org.joda.time.LocalTime localTime61 = dateTime60.toLocalTime();
        int int62 = dateTime60.getMonthOfYear();
        int int63 = dateTime60.getHourOfDay();
        org.joda.time.DateTime.Property property64 = dateTime60.dayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = null;
        java.lang.String str66 = dateTime60.toString(dateTimeFormatter65);
        org.joda.time.DateTime dateTime68 = dateTime60.plusMinutes(17);
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.DateTime dateTime73 = localTime71.toDateTime(readableInstant72);
        org.joda.time.LocalTime localTime74 = dateTime73.toLocalTime();
        org.joda.time.DateTime.Property property75 = dateTime73.minuteOfHour();
        int int76 = property75.getMinimumValue();
        org.joda.time.DateTime dateTime77 = property75.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime80 = null;
        boolean boolean81 = dateTimeZone79.isLocalDateTimeGap(localDateTime80);
        org.joda.time.LocalTime localTime82 = new org.joda.time.LocalTime(dateTimeZone79);
        org.joda.time.DateTime dateTime83 = dateTime77.withZoneRetainFields(dateTimeZone79);
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((java.lang.Object) dateTime83);
        org.joda.time.DateTime dateTime86 = dateTime83.plusMinutes((int) '4');
        boolean boolean87 = dateTime60.isAfter((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.Interval interval88 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.DateTimeZone dateTimeZone89 = dateTime55.getZone();
        int int91 = dateTimeZone89.getStandardOffset((-45705500L));
        long long93 = dateTimeZone27.getMillisKeepLocal(dateTimeZone89, (long) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter94 = dateTimeFormatter8.withZone(dateTimeZone89);
        java.lang.StringBuffer stringBuffer95 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter94.printTo(stringBuffer95, 53601041L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 3L + "'", long33 == 3L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.010" + "'", str37, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3L + "'", long52 == 3L);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010" + "'", str66, "2022-02-21T00:10:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTimeZone79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(dateTimeZone89);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 10 + "'", int91 == 10);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
        org.junit.Assert.assertNotNull(dateTimeFormatter94);
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        java.util.Date date1 = new java.util.Date(0L);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.Chronology chronology13 = localTime10.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 1, chronology13);
        int[] intArray16 = chronology5.get((org.joda.time.ReadablePartial) localTime14, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology5.seconds();
        long long22 = chronology5.add(53299629L, 53373281L, 83400000);
        org.joda.time.DateTimeField dateTimeField23 = chronology5.clockhourOfDay();
        long long27 = chronology5.add((-3786627599883L), 1645455071223L, 53740);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 4451331688699629L + "'", long22 == 4451331688699629L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 88422968899924137L + "'", long27 == 88422968899924137L);
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        int int4 = calendar2.getActualMaximum(6);
        calendar2.roll(0, true);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.clear(308157);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 308157");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=30,MILLISECOND=631,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 365 + "'", int4 == 365);
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTime(readableInstant8);
        int int10 = localTime4.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime.Property property11 = localTime4.hourOfDay();
        org.joda.time.LocalTime localTime13 = property11.addCopy(6);
        org.joda.time.LocalTime localTime14 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime16 = property11.addCopy((int) (short) 10);
        org.joda.time.LocalTime localTime17 = property11.roundHalfEvenCopy();
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType0.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.secondOfMinute();
        org.joda.time.DurationField durationField22 = chronology18.halfdays();
        long long24 = durationField22.getMillis(53486);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2310595200000L + "'", long24 == 2310595200000L);
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localTime4.toDateTime(readableInstant5);
        org.joda.time.Chronology chronology7 = localTime4.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval12 = new org.joda.time.Interval(1645402199000L, (long) (byte) -1, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        java.lang.String str7 = property6.toString();
        org.joda.time.DateTime dateTime8 = property6.roundFloorCopy();
        org.joda.time.DateTime dateTime10 = property6.addToCopy((long) 366);
        long long11 = property6.remainder();
        org.joda.time.DateTime dateTime12 = property6.roundFloorCopy();
        org.joda.time.DurationField durationField13 = property6.getLeapDurationField();
        org.joda.time.DateTime dateTime14 = property6.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[minuteOfHour]" + "'", str7, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNull(durationField13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.DateTime dateTime8 = localTime6.toDateTime(readableInstant7);
        int int9 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime.Property property10 = localTime3.hourOfDay();
        org.joda.time.LocalTime localTime12 = property10.addCopy(6);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localTime15.toDateTime(readableInstant16);
        org.joda.time.LocalTime localTime18 = dateTime17.toLocalTime();
        org.joda.time.DateTime.Property property19 = dateTime17.minuteOfHour();
        int int20 = property19.get();
        org.joda.time.Interval interval21 = property19.toInterval();
        org.joda.time.Interval interval22 = interval21.toInterval();
        long long23 = interval21.toDurationMillis();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = interval21.toPeriod(periodType24);
        org.joda.time.LocalTime localTime27 = localTime12.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 8);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localTime30.toDateTime(readableInstant31);
        org.joda.time.LocalTime localTime33 = dateTime32.toLocalTime();
        org.joda.time.DateTime.Property property34 = dateTime32.minuteOfHour();
        int int35 = property34.get();
        org.joda.time.Interval interval36 = property34.toInterval();
        org.joda.time.DateTime dateTime38 = property34.addToCopy(9);
        org.joda.time.DateTime dateTime39 = localTime12.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        boolean boolean40 = localTime0.isAfter((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localTime44.toDateTime(readableInstant45);
        org.joda.time.Chronology chronology47 = localTime44.getChronology();
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((long) (byte) 1, chronology47);
        org.joda.time.DateTimeField dateTimeField49 = chronology47.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.dayOfMonth();
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.now(chronology47);
        org.joda.time.LocalTime localTime53 = localTime51.plusHours((int) 'u');
        org.joda.time.LocalTime localTime55 = localTime51.withMillisOfSecond(1);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int61 = dateTimeZone59.getOffset((long) (byte) 1);
        long long63 = dateTimeZone57.getMillisKeepLocal(dateTimeZone59, (long) 3);
        long long66 = dateTimeZone57.convertLocalToUTC((long) 9, false);
        java.lang.String str67 = dateTimeZone57.toString();
        org.joda.time.DateTime dateTime68 = localTime55.toDateTimeToday(dateTimeZone57);
        org.joda.time.DateTime dateTime69 = localTime12.toDateTimeToday(dateTimeZone57);
        org.joda.time.DateTime.Property property70 = dateTime69.minuteOfDay();
        int int71 = property70.get();
        int int72 = property70.getMinimumValueOverall();
        org.joda.time.DateTime dateTime73 = property70.roundHalfEvenCopy();
        org.joda.time.DurationField durationField74 = property70.getLeapDurationField();
        org.joda.time.DateTime dateTime75 = property70.roundCeilingCopy();
        java.lang.String str76 = property70.getName();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60000L + "'", long23 == 60000L);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 3L + "'", long63 == 3L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00:00.010" + "'", str67, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 370 + "'", int71 == 370);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNull(durationField74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "minuteOfDay" + "'", str76, "minuteOfDay");
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1, chronology6);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology6);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfHalfday();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTime(readableInstant14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears(7);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime17.getZone();
        org.joda.time.Chronology chronology19 = chronology9.withZone(dateTimeZone18);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.DateTimeField dateTimeField21 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        java.util.Locale locale1 = new java.util.Locale("2022-02-21T00:09:59.000+00:00:00.010");
        org.junit.Assert.assertEquals(locale1.toString(), "2022-02-21t00:09:59.000+00:00:00.010");
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.getMinimumValue();
        org.joda.time.DateTime dateTime8 = property6.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime8.toDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = dateTime8.minusMillis(6);
        boolean boolean15 = dateTime8.isEqualNow();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.DateTime dateTime8 = localTime6.toDateTime(readableInstant7);
        org.joda.time.Chronology chronology9 = localTime6.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (byte) 1, chronology9);
        boolean boolean11 = dateTimeFieldType2.isSupported(chronology9);
        boolean boolean12 = durationFieldType1.isSupported(chronology9);
        java.lang.String str13 = chronology9.toString();
        org.joda.time.DurationField durationField14 = chronology9.years();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        long long18 = durationField15.add((long) 8, (int) ' ');
        org.joda.time.DurationFieldType durationFieldType19 = durationField15.getType();
        long long22 = durationField15.getMillis(57, (long) 'x');
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[UTC]" + "'", str13, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1382400008L + "'", long18 == 1382400008L);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2462400000L + "'", long22 == 2462400000L);
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTime(readableInstant8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime7.plus(readablePeriod10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean13 = localTime11.isSupported(dateTimeFieldType12);
        org.joda.time.DateTime dateTime14 = dateTime4.withFields((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = localTime11.getFieldTypes();
        org.joda.time.LocalTime.Property property16 = localTime11.secondOfMinute();
        int int17 = property16.getMinimumValue();
        java.lang.String str18 = property16.getAsString();
        org.joda.time.LocalTime localTime19 = property16.getLocalTime();
        int int20 = property16.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int10 = dateTimeZone8.getOffset((long) (byte) 1);
        long long12 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 3);
        org.joda.time.DateTime dateTime13 = dateTime4.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime15 = dateTime4.minus((long) '#');
        org.joda.time.DateTime.Property property16 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime18 = dateTime4.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime19 = dateTime4.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime4.withWeekOfWeekyear(2);
        org.joda.time.LocalTime localTime22 = dateTime21.toLocalTime();
        org.joda.time.LocalTime localTime24 = localTime22.plusHours((-1641514199));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 1, chronology14);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localTime15, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField18 = chronology6.dayOfYear();
        org.joda.time.DurationField durationField19 = durationFieldType0.getField(chronology6);
        org.joda.time.DurationField durationField20 = chronology6.minutes();
        long long23 = durationField20.subtract(0L, (long) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localTime27.toDateTime(readableInstant28);
        org.joda.time.Chronology chronology30 = localTime27.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.weekyears();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.DateTime dateTime37 = localTime35.toDateTime(readableInstant36);
        org.joda.time.Chronology chronology38 = localTime35.getChronology();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) (byte) 1, chronology38);
        int[] intArray41 = chronology30.get((org.joda.time.ReadablePartial) localTime39, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField42 = chronology30.dayOfYear();
        org.joda.time.DurationField durationField43 = durationFieldType24.getField(chronology30);
        org.joda.time.DurationFieldType durationFieldType44 = durationField43.getType();
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localTime50.toDateTime(readableInstant51);
        org.joda.time.Chronology chronology53 = localTime50.getChronology();
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((long) (byte) 1, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(chronology53);
        org.joda.time.Interval interval56 = new org.joda.time.Interval(0L, 0L, chronology53);
        org.joda.time.DurationField durationField57 = durationFieldType44.getField(chronology53);
        int int58 = durationField20.compareTo(durationField57);
        long long61 = durationField57.add((-60000L), 3L);
        long long64 = durationField57.add(53365113L, 19353600);
        long long67 = durationField57.subtract((long) 2000, 53464);
        boolean boolean68 = durationField57.isSupported();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-60000L) + "'", long23 == (-60000L));
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10740000L + "'", long61 == 10740000L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 69673013365113L + "'", long64 == 69673013365113L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-192470398000L) + "'", long67 == (-192470398000L));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localTime4.toDateTime(readableInstant5);
        org.joda.time.Chronology chronology7 = localTime4.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 1, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfMonth();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.LocalTime localTime13 = localTime11.plusHours((int) 'u');
        org.joda.time.LocalTime localTime15 = localTime11.withMillisOfSecond(1);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localTime18.toDateTime(readableInstant19);
        org.joda.time.LocalTime localTime21 = dateTime20.toLocalTime();
        int int22 = dateTime20.getMonthOfYear();
        int int23 = dateTime20.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int29 = dateTimeZone27.getOffset((long) (byte) 1);
        long long31 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, (long) 3);
        org.joda.time.DateTime dateTime32 = dateTime20.toDateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime33 = localTime15.toDateTimeToday(dateTimeZone25);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) 5, dateTimeZone25);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localTime37.toDateTime(readableInstant38);
        org.joda.time.LocalTime localTime40 = dateTime39.toLocalTime();
        org.joda.time.DateTime.Property property41 = dateTime39.minuteOfHour();
        int int42 = property41.get();
        org.joda.time.Interval interval43 = property41.toInterval();
        org.joda.time.Interval interval44 = interval43.toInterval();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = interval44.toPeriod(periodType45);
        org.joda.time.LocalTime localTime47 = localTime34.plus((org.joda.time.ReadablePeriod) period46);
        org.joda.time.LocalTime localTime49 = localTime47.minusSeconds(10);
        org.joda.time.LocalTime.Property property50 = localTime49.millisOfSecond();
        org.joda.time.LocalTime localTime51 = property50.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3L + "'", long31 == 3L);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localTime51);
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(1);
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withZone(dateTimeZone9);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTime(readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int21 = dateTimeZone19.getOffset((long) (byte) 1);
        long long23 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 3);
        org.joda.time.DateTime dateTime24 = dateTime15.withZone(dateTimeZone17);
        org.joda.time.DateTime dateTime26 = dateTime24.minusSeconds((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DateTime.Property property28 = dateTime26.property(dateTimeFieldType27);
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType27.getDurationType();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType27.getDurationType();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localTime36.toDateTime(readableInstant37);
        int int39 = localTime33.compareTo((org.joda.time.ReadablePartial) localTime36);
        org.joda.time.LocalTime.Property property40 = localTime33.hourOfDay();
        org.joda.time.LocalTime localTime42 = property40.addCopy(6);
        int int43 = localTime42.getSecondOfMinute();
        org.joda.time.LocalTime.Property property44 = localTime42.secondOfMinute();
        org.joda.time.LocalTime localTime45 = property44.getLocalTime();
        org.joda.time.LocalTime localTime47 = property44.addCopy(52);
        org.joda.time.Chronology chronology48 = localTime47.getChronology();
        org.joda.time.DurationField durationField49 = durationFieldType30.getField(chronology48);
        org.joda.time.DateTimeField dateTimeField50 = chronology48.yearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter10.withChronology(chronology48);
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3L + "'", long23 == 3L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(20, 13);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean5 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType3.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localTime4.toDateTime(readableInstant5);
        org.joda.time.Chronology chronology7 = localTime4.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 1, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfMonth();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.LocalTime localTime13 = localTime11.plusHours((int) 'u');
        org.joda.time.LocalTime localTime15 = localTime11.withMillisOfSecond(1);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localTime18.toDateTime(readableInstant19);
        org.joda.time.LocalTime localTime21 = dateTime20.toLocalTime();
        int int22 = dateTime20.getMonthOfYear();
        int int23 = dateTime20.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int29 = dateTimeZone27.getOffset((long) (byte) 1);
        long long31 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, (long) 3);
        org.joda.time.DateTime dateTime32 = dateTime20.toDateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime33 = localTime15.toDateTimeToday(dateTimeZone25);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) 5, dateTimeZone25);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localTime37.toDateTime(readableInstant38);
        org.joda.time.LocalTime localTime40 = dateTime39.toLocalTime();
        org.joda.time.DateTime.Property property41 = dateTime39.minuteOfHour();
        int int42 = property41.get();
        org.joda.time.Interval interval43 = property41.toInterval();
        org.joda.time.Interval interval44 = interval43.toInterval();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = interval44.toPeriod(periodType45);
        org.joda.time.LocalTime localTime47 = localTime34.plus((org.joda.time.ReadablePeriod) period46);
        org.joda.time.LocalTime localTime49 = localTime47.minusSeconds(10);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int55 = dateTimeZone53.getOffset((long) (byte) 1);
        long long57 = dateTimeZone51.getMillisKeepLocal(dateTimeZone53, (long) 3);
        long long59 = dateTimeZone51.previousTransition(0L);
        java.lang.String str61 = dateTimeZone51.getNameKey(720100L);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long65 = dateTimeZone51.getMillisKeepLocal(dateTimeZone63, 7213320000L);
        org.joda.time.DateTime dateTime66 = localTime49.toDateTimeToday(dateTimeZone51);
        long long68 = dateTimeZone51.nextTransition((-342000000L));
        long long70 = dateTimeZone51.nextTransition((-3241594915449554L));
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3L + "'", long31 == 3L);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 3L + "'", long57 == 3L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 7213320010L + "'", long65 == 7213320010L);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-342000000L) + "'", long68 == (-342000000L));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-3241594915449554L) + "'", long70 == (-3241594915449554L));
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 0, dateTimeZone2);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime8 = localTime5.withPeriodAdded(readablePeriod6, 17);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.LocalTime localTime14 = dateTime13.toLocalTime();
        int int15 = dateTime13.getMonthOfYear();
        int int16 = dateTime13.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int22 = dateTimeZone20.getOffset((long) (byte) 1);
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone20, (long) 3);
        org.joda.time.DateTime dateTime25 = dateTime13.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfCentury((int) '4');
        org.joda.time.DateTime dateTime29 = dateTime25.plus(3003279000000L);
        org.joda.time.DateTime dateTime30 = localTime5.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime25.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime33 = dateTime25.withMillis(111539999L);
        org.joda.time.DateTime.Property property34 = dateTime33.millisOfDay();
        org.joda.time.DateTime dateTime36 = dateTime33.withYearOfCentury(49);
        org.joda.time.DateTime dateTime38 = dateTime33.plusMonths(366);
        org.joda.time.DateTime dateTime39 = dateTime33.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int4 = dateTimeZone2.getOffset((long) (byte) 1);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(0L, dateTimeZone2);
        int int6 = dateTime5.getWeekyear();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.DateTime.Property property14 = dateTime12.minuteOfHour();
        int int15 = property14.getMinimumValue();
        org.joda.time.DateTime dateTime16 = property14.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfYear();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localTime20.toDateTime(readableInstant21);
        org.joda.time.Chronology chronology23 = localTime20.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.weekyears();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localTime28.toDateTime(readableInstant29);
        org.joda.time.Chronology chronology31 = localTime28.getChronology();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (byte) 1, chronology31);
        int[] intArray34 = chronology23.get((org.joda.time.ReadablePartial) localTime32, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField35 = chronology23.dayOfYear();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localTime38.toDateTime(readableInstant39);
        org.joda.time.LocalTime localTime41 = dateTime40.toLocalTime();
        org.joda.time.DateTime.Property property42 = dateTime40.minuteOfHour();
        int int43 = property42.get();
        org.joda.time.Interval interval44 = property42.toInterval();
        org.joda.time.DateTime dateTime45 = interval44.getEnd();
        org.joda.time.Period period46 = interval44.toPeriod();
        int[] intArray48 = chronology23.get((org.joda.time.ReadablePeriod) period46, (long) (byte) 100);
        org.joda.time.DateTime dateTime49 = dateTime16.minus((org.joda.time.ReadablePeriod) period46);
        org.joda.time.Interval interval50 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) period46);
        org.joda.time.DateTime dateTime51 = interval50.getEnd();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.ReadablePartial readablePartial53 = null;
        org.joda.time.DateTime dateTime54 = dateTime51.withFields(readablePartial53);
        org.joda.time.DateTime dateTime56 = dateTime51.plusSeconds((int) (short) -1);
        org.joda.time.DateTime.Property property57 = dateTime56.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.DurationField durationField7 = chronology5.centuries();
        long long8 = durationField7.getUnitMillis();
        long long11 = durationField7.getDifferenceAsLong(1645454961497L, 1645455378882L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3155695200000L + "'", long8 == 3155695200000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 1, chronology14);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localTime15, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField18 = chronology6.weekyear();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 5, chronology6);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localTime22.toDateTime(readableInstant23);
        org.joda.time.LocalTime localTime25 = dateTime24.toLocalTime();
        org.joda.time.DateTime.Property property26 = dateTime24.minuteOfHour();
        int int27 = property26.get();
        org.joda.time.Interval interval28 = property26.toInterval();
        org.joda.time.Period period29 = interval28.toPeriod();
        org.joda.time.DateTime dateTime30 = dateTime19.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekyear(3);
        boolean boolean34 = dateTime30.isEqual(175367340000L);
        java.util.Date date35 = dateTime30.toDate();
        org.joda.time.DateTime dateTime38 = dateTime30.withDurationAdded((long) 27419008, 1970);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localTime41.toDateTime(readableInstant42);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int49 = dateTimeZone47.getOffset((long) (byte) 1);
        long long51 = dateTimeZone45.getMillisKeepLocal(dateTimeZone47, (long) 3);
        org.joda.time.DateTime dateTime52 = dateTime43.withZone(dateTimeZone45);
        org.joda.time.DateTime dateTime54 = dateTime43.minus((long) '#');
        org.joda.time.DateTime.Property property55 = dateTime43.weekyear();
        org.joda.time.DateTime dateTime57 = dateTime43.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime58 = dateTime43.toDateTime();
        org.joda.time.DateTime dateTime60 = dateTime43.withWeekyear(15);
        org.joda.time.Chronology chronology61 = dateTime60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField63 = chronology61.yearOfEra();
        org.joda.time.DateTimeField dateTimeField64 = chronology61.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 10);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(dateTimeZone67);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime(dateTimeZone67);
        int int70 = dateTimeField64.getMaximumValue((org.joda.time.ReadablePartial) localTime69);
        org.joda.time.LocalTime localTime73 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.DateTime dateTime78 = localTime76.toDateTime(readableInstant77);
        int int79 = localTime73.compareTo((org.joda.time.ReadablePartial) localTime76);
        org.joda.time.LocalTime.Property property80 = localTime73.hourOfDay();
        org.joda.time.LocalTime localTime82 = property80.addCopy(6);
        org.joda.time.LocalTime localTime83 = property80.roundHalfCeilingCopy();
        int int84 = property80.get();
        org.joda.time.LocalTime localTime85 = property80.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime88 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant89 = null;
        org.joda.time.DateTime dateTime90 = localTime88.toDateTime(readableInstant89);
        org.joda.time.Chronology chronology91 = localTime88.getChronology();
        org.joda.time.DurationField durationField92 = chronology91.weekyears();
        org.joda.time.DateTimeField dateTimeField93 = chronology91.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType94 = dateTimeField93.getType();
        boolean boolean95 = localTime85.isSupported(dateTimeFieldType94);
        boolean boolean96 = localTime69.isSupported(dateTimeFieldType94);
        int int97 = dateTime38.get(dateTimeFieldType94);
        org.joda.time.DateTime dateTime98 = dateTime38.toDateTime();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:01:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 3L + "'", long51 == 3L);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 999 + "'", int70 == 999);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(localTime82);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(localTime85);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertNotNull(chronology91);
        org.junit.Assert.assertNotNull(durationField92);
        org.junit.Assert.assertNotNull(dateTimeField93);
        org.junit.Assert.assertNotNull(dateTimeFieldType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 37 + "'", int97 == 37);
        org.junit.Assert.assertNotNull(dateTime98);
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localTime8.toDateTime(readableInstant9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime8.plus(readablePeriod11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean14 = localTime12.isSupported(dateTimeFieldType13);
        org.joda.time.DateTime dateTime15 = dateTime5.withFields((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int21 = dateTimeZone19.getOffset((long) (byte) 1);
        long long23 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 3);
        long long26 = dateTimeZone17.convertLocalToUTC((long) 9, false);
        java.lang.String str27 = dateTimeZone17.toString();
        org.joda.time.DateTime dateTime28 = localTime12.toDateTimeToday(dateTimeZone17);
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.now(dateTimeZone17);
        int int31 = dateTimeZone17.getOffsetFromLocal((long) 21);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 31, dateTimeZone17);
        org.joda.time.DateTime dateTime34 = dateTime32.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime.Property property35 = dateTime34.dayOfYear();
        org.joda.time.DateTime dateTime36 = property35.getDateTime();
        org.joda.time.DateTime dateTime38 = property35.addWrapFieldToCopy(49);
        org.joda.time.DateTime dateTime39 = property35.getDateTime();
        org.joda.time.DateTime dateTime41 = property35.addWrapFieldToCopy(2720);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3L + "'", long23 == 3L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.010" + "'", str27, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        long long6 = dateTime4.getMillis();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.DateTime dateTime11 = localTime9.toDateTime(readableInstant10);
        org.joda.time.LocalTime localTime12 = dateTime11.toLocalTime();
        org.joda.time.DateTime.Property property13 = dateTime11.minuteOfHour();
        int int14 = property13.get();
        org.joda.time.Interval interval15 = property13.toInterval();
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        int int17 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime16.toMutableDateTime();
        int int19 = dateTime16.getSecondOfMinute();
        int int20 = dateTime16.getDayOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.withMillisOfSecond(26);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.DateTime dateTime27 = localTime25.toDateTime(readableInstant26);
        org.joda.time.LocalTime localTime28 = dateTime27.toLocalTime();
        org.joda.time.DateTime.Property property29 = dateTime27.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField30 = property29.getField();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localTime33.toDateTime(readableInstant34);
        org.joda.time.Chronology chronology36 = localTime33.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.weekyears();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localTime41.toDateTime(readableInstant42);
        org.joda.time.Chronology chronology44 = localTime41.getChronology();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) (byte) 1, chronology44);
        int[] intArray47 = chronology36.get((org.joda.time.ReadablePartial) localTime45, (long) (short) -1);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localTime50.toDateTime(readableInstant51);
        org.joda.time.LocalTime localTime53 = dateTime52.toLocalTime();
        org.joda.time.DateTime.Property property54 = dateTime52.minuteOfHour();
        int int55 = property54.getMinimumValue();
        org.joda.time.DateTime dateTime56 = property54.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime59 = null;
        boolean boolean60 = dateTimeZone58.isLocalDateTimeGap(localDateTime59);
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone58);
        org.joda.time.DateTime dateTime62 = dateTime56.withZoneRetainFields(dateTimeZone58);
        org.joda.time.DateTime dateTime63 = localTime45.toDateTime((org.joda.time.ReadableInstant) dateTime62);
        long long64 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTime dateTime65 = property29.getDateTime();
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.DateTime dateTime70 = localTime68.toDateTime(readableInstant69);
        org.joda.time.LocalTime localTime71 = dateTime70.toLocalTime();
        int int72 = dateTime70.getMonthOfYear();
        int int73 = dateTime70.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.Interval interval75 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime70, readablePeriod74);
        org.joda.time.DateTime dateTime77 = dateTime70.plusMinutes(5);
        org.joda.time.Interval interval78 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime65, (org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime80 = dateTime65.plusSeconds(49);
        boolean boolean81 = dateTime16.isBefore((org.joda.time.ReadableInstant) dateTime65);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645402199990L + "'", long6 == 1645402199990L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 9L + "'", long64 == 9L);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(1);
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale8 = dateTimeFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = dateTimeFormatter2.parseLocalDateTime("21 Feb 2022 14:49:11 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localTime4.toDateTime(readableInstant5);
        org.joda.time.Chronology chronology7 = localTime4.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 1, chronology7);
        boolean boolean9 = dateTimeFieldType0.isSupported(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        org.joda.time.DurationField durationField11 = chronology7.seconds();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology7.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = chronology7.clockhourOfHalfday();
        int int17 = dateTimeField14.getDifference(0L, 1645455274168L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-457070) + "'", int17 == (-457070));
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1, chronology6);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.minuteOfDay();
        long long14 = dateTimeField11.getDifferenceAsLong(53314993L, 151200000L);
        java.util.Locale locale16 = java.util.Locale.UK;
        java.lang.String str17 = dateTimeField11.getAsShortText(121320000L, locale16);
        int int19 = dateTimeField11.getMinimumValue(1645455109488L);
        org.joda.time.ReadablePartial readablePartial20 = null;
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        java.time.Instant instant23 = calendar22.toInstant();
        calendar22.set(12, (int) (byte) 0, 32772, (-100800), 365);
        calendar22.setTimeInMillis((long) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType32.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType34.getRangeDurationType();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localTime38.toDateTime(readableInstant39);
        org.joda.time.Chronology chronology41 = localTime38.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.weekyears();
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localTime46.toDateTime(readableInstant47);
        org.joda.time.Chronology chronology49 = localTime46.getChronology();
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) (byte) 1, chronology49);
        int[] intArray52 = chronology41.get((org.joda.time.ReadablePartial) localTime50, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField53 = chronology41.dayOfYear();
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.DateTime dateTime58 = localTime56.toDateTime(readableInstant57);
        org.joda.time.LocalTime localTime59 = dateTime58.toLocalTime();
        org.joda.time.DateTime.Property property60 = dateTime58.minuteOfHour();
        int int61 = property60.get();
        org.joda.time.Interval interval62 = property60.toInterval();
        org.joda.time.DateTime dateTime63 = interval62.getEnd();
        org.joda.time.Period period64 = interval62.toPeriod();
        int[] intArray66 = chronology41.get((org.joda.time.ReadablePeriod) period64, (long) (byte) 100);
        org.joda.time.DateTimeField dateTimeField67 = chronology41.weekOfWeekyear();
        boolean boolean68 = dateTimeFieldType34.isSupported(chronology41);
        boolean boolean69 = dateTimeFieldType32.isSupported(chronology41);
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime75 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.DateTime dateTime77 = localTime75.toDateTime(readableInstant76);
        int int78 = localTime72.compareTo((org.joda.time.ReadablePartial) localTime75);
        org.joda.time.LocalTime.Property property79 = localTime72.hourOfDay();
        org.joda.time.LocalTime localTime81 = property79.addCopy(6);
        org.joda.time.LocalTime localTime82 = property79.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime83 = property79.roundCeilingCopy();
        int[] intArray85 = chronology41.get((org.joda.time.ReadablePartial) localTime83, (long) (byte) 1);
        boolean boolean86 = calendar22.before((java.lang.Object) intArray85);
        java.util.Locale locale88 = java.util.Locale.US;
        java.util.Locale locale89 = locale88.stripExtensions();
        java.lang.String str90 = locale88.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray91 = dateTimeField11.set(readablePartial20, 53611753, intArray85, "53763721", locale88);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53763721 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1631L) + "'", long14 == (-1631L));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "582" + "'", str17, "582");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(localTime81);
        org.junit.Assert.assertNotNull(localTime82);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.getMinimumValue();
        org.joda.time.DateTime dateTime8 = property6.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone10.isLocalDateTimeGap(localDateTime11);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = dateTime8.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra(6);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMonths(1439);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime18.toMutableDateTime();
        org.joda.time.DateTime dateTime21 = dateTime18.plusHours(86399);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = dateTime21.withYearOfCentury(53401);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53401 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int10 = dateTimeZone8.getOffset((long) (byte) 1);
        long long12 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 3);
        org.joda.time.DateTime dateTime13 = dateTime4.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime15 = dateTime4.minus((long) '#');
        org.joda.time.DateTime.Property property16 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime18 = dateTime4.minusWeeks((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime4.getZone();
        boolean boolean21 = dateTimeZone19.isStandardOffset((long) 12);
        boolean boolean23 = dateTimeZone19.isStandardOffset((long) '4');
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4');
        org.joda.time.DateTime.Property property26 = dateTime25.millisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime25.withYear(53);
        int int29 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology30 = dateTime25.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.centuries();
        org.joda.time.Chronology chronology32 = chronology30.withUTC();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.Chronology chronology13 = localTime10.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 1, chronology13);
        int[] intArray16 = chronology5.get((org.joda.time.ReadablePartial) localTime14, (long) (short) -1);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localTime19.toDateTime(readableInstant20);
        org.joda.time.LocalTime localTime22 = dateTime21.toLocalTime();
        org.joda.time.DateTime.Property property23 = dateTime21.minuteOfHour();
        int int24 = property23.getMinimumValue();
        org.joda.time.DateTime dateTime25 = property23.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone27.isLocalDateTimeGap(localDateTime28);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.DateTime dateTime31 = dateTime25.withZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = localTime14.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.DateTime dateTime37 = localTime35.toDateTime(readableInstant36);
        org.joda.time.LocalTime localTime38 = dateTime37.toLocalTime();
        org.joda.time.DateTime.Property property39 = dateTime37.minuteOfHour();
        int int40 = property39.get();
        org.joda.time.Interval interval41 = property39.toInterval();
        org.joda.time.Interval interval42 = interval41.toInterval();
        long long43 = interval41.toDurationMillis();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = interval41.toPeriod(periodType44);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadablePeriod) period45);
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.DateTime dateTime51 = localTime49.toDateTime(readableInstant50);
        org.joda.time.LocalTime localTime52 = dateTime51.toLocalTime();
        org.joda.time.DateTime.Property property53 = dateTime51.minuteOfHour();
        org.joda.time.DateTime dateTime55 = dateTime51.plusWeeks(0);
        org.joda.time.Chronology chronology56 = dateTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.millisOfDay();
        org.joda.time.DateTime dateTime58 = dateTime32.toDateTime(chronology56);
        org.joda.time.DateTimeField dateTimeField59 = chronology56.yearOfCentury();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology56);
        org.joda.time.DateTime.Property property61 = dateTime60.weekyear();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(4459732643L);
        long long64 = property61.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTimeField dateTimeField65 = property61.getField();
        int int66 = property61.get();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 60000L + "'", long43 == 60000L);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 51L + "'", long64 == 51L);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2022 + "'", int66 == 2022);
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1645429675807L);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTime(readableInstant8);
        int int10 = localTime4.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime.Property property11 = localTime4.hourOfDay();
        org.joda.time.LocalTime localTime13 = property11.addCopy(6);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localTime16.toDateTime(readableInstant17);
        org.joda.time.LocalTime localTime19 = dateTime18.toLocalTime();
        org.joda.time.DateTime.Property property20 = dateTime18.minuteOfHour();
        int int21 = property20.get();
        org.joda.time.Interval interval22 = property20.toInterval();
        org.joda.time.Interval interval23 = interval22.toInterval();
        long long24 = interval22.toDurationMillis();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = interval22.toPeriod(periodType25);
        org.joda.time.LocalTime localTime28 = localTime13.withPeriodAdded((org.joda.time.ReadablePeriod) period26, 8);
        org.joda.time.Period period29 = period26.toPeriod();
        java.lang.String[] strArray30 = java.util.Locale.getISOLanguages();
        boolean boolean31 = period29.equals((java.lang.Object) strArray30);
        org.joda.time.DurationFieldType durationFieldType32 = null;
        int int33 = period29.get(durationFieldType32);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localTime36.toDateTime(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int44 = dateTimeZone42.getOffset((long) (byte) 1);
        long long46 = dateTimeZone40.getMillisKeepLocal(dateTimeZone42, (long) 3);
        org.joda.time.DateTime dateTime47 = dateTime38.withZone(dateTimeZone40);
        org.joda.time.DateTime dateTime49 = dateTime47.minusSeconds((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DateTime.Property property51 = dateTime49.property(dateTimeFieldType50);
        org.joda.time.DurationFieldType durationFieldType52 = dateTimeFieldType50.getDurationType();
        int int53 = period29.get(durationFieldType52);
        boolean boolean54 = localTime1.isSupported(durationFieldType52);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 60000L + "'", long24 == 60000L);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 3L + "'", long46 == 3L);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTime(readableInstant6);
        int int8 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime11 = property9.addCopy(6);
        int int12 = localTime11.getSecondOfMinute();
        org.joda.time.LocalTime.Property property13 = localTime11.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.Interval interval15 = interval14.toInterval();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localTime18.toDateTime(readableInstant19);
        org.joda.time.LocalTime localTime21 = dateTime20.toLocalTime();
        int int22 = dateTime20.getMonthOfYear();
        int int23 = dateTime20.getHourOfDay();
        org.joda.time.DateTime.Property property24 = dateTime20.dayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = dateTime20.toString(dateTimeFormatter25);
        org.joda.time.DateTime dateTime28 = dateTime20.plusMinutes(17);
        org.joda.time.DateTime dateTime30 = dateTime20.withWeekyear(5);
        org.joda.time.DateTime dateTime32 = dateTime30.minusYears((int) (byte) -1);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.DateTime dateTime37 = localTime35.toDateTime(readableInstant36);
        org.joda.time.LocalTime localTime38 = dateTime37.toLocalTime();
        org.joda.time.DateTime.Property property39 = dateTime37.minuteOfHour();
        int int40 = property39.get();
        org.joda.time.Interval interval41 = property39.toInterval();
        org.joda.time.DateTime dateTime42 = interval41.getEnd();
        org.joda.time.Period period43 = interval41.toPeriod();
        java.lang.String str44 = interval41.toString();
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.DateTime dateTime49 = localTime47.toDateTime(readableInstant48);
        org.joda.time.LocalTime localTime50 = dateTime49.toLocalTime();
        org.joda.time.DateTime.Property property51 = dateTime49.minuteOfHour();
        int int52 = property51.get();
        org.joda.time.Interval interval53 = property51.toInterval();
        org.joda.time.Interval interval54 = interval53.toInterval();
        long long55 = interval53.toDurationMillis();
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = interval53.toPeriod(periodType56);
        org.joda.time.Interval interval58 = interval41.overlap((org.joda.time.ReadableInterval) interval53);
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.DateTime dateTime63 = localTime61.toDateTime(readableInstant62);
        org.joda.time.LocalTime localTime64 = dateTime63.toLocalTime();
        int int65 = dateTime63.getMonthOfYear();
        int int66 = dateTime63.getHourOfDay();
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.DateTime dateTime71 = localTime69.toDateTime(readableInstant70);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int77 = dateTimeZone75.getOffset((long) (byte) 1);
        long long79 = dateTimeZone73.getMillisKeepLocal(dateTimeZone75, (long) 3);
        org.joda.time.DateTime dateTime80 = dateTime71.withZone(dateTimeZone73);
        org.joda.time.Interval interval81 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime80);
        boolean boolean83 = interval81.isBefore((long) 21);
        boolean boolean84 = interval58.isBefore((org.joda.time.ReadableInterval) interval81);
        org.joda.time.Duration duration85 = interval81.toDuration();
        org.joda.time.DateTime dateTime86 = dateTime30.minus((org.joda.time.ReadableDuration) duration85);
        org.joda.time.Interval interval87 = interval15.withDurationAfterStart((org.joda.time.ReadableDuration) duration85);
        boolean boolean88 = interval87.isAfterNow();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010" + "'", str26, "2022-02-21T00:10:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010/2022-02-21T00:11:00.000+00:00:00.010" + "'", str44, "2022-02-21T00:10:00.000+00:00:00.010/2022-02-21T00:11:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 60000L + "'", long55 == 60000L);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 3L + "'", long79 == 3L);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(duration85);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(interval87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTime(readableInstant8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime7.plus(readablePeriod10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean13 = localTime11.isSupported(dateTimeFieldType12);
        org.joda.time.DateTime dateTime14 = dateTime4.withFields((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int20 = dateTimeZone18.getOffset((long) (byte) 1);
        long long22 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 3);
        long long25 = dateTimeZone16.convertLocalToUTC((long) 9, false);
        java.lang.String str26 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime27 = localTime11.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone30.isLocalDateTimeGap(localDateTime31);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (byte) 0, dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = localTime33.toString(dateTimeFormatter34);
        org.joda.time.LocalTime localTime36 = localTime11.withFields((org.joda.time.ReadablePartial) localTime33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime38 = localTime33.withMinuteOfHour(1020);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1020 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.010" + "'", str26, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "00:00:00.010" + "'", str35, "00:00:00.010");
        org.junit.Assert.assertNotNull(localTime36);
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 1);
        int[] intArray2 = localTime1.getValues();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTime(readableInstant6);
        org.joda.time.LocalTime localTime8 = dateTime7.toLocalTime();
        org.joda.time.DateTime.Property property9 = dateTime7.minuteOfHour();
        int int10 = property9.getMinimumValue();
        org.joda.time.DateTime dateTime11 = property9.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone13.isLocalDateTimeGap(localDateTime14);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.DateTime dateTime17 = dateTime11.withZoneRetainFields(dateTimeZone13);
        int int18 = dateTime17.getDayOfWeek();
        org.joda.time.DateTime dateTime19 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        int int20 = dateTime19.getMinuteOfDay();
        org.joda.time.DateTime dateTime22 = dateTime19.plusMonths(15706);
        org.joda.time.DateTime.Property property23 = dateTime19.dayOfMonth();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 11]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTime(readableInstant6);
        int int8 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime11 = property9.addCopy(6);
        org.joda.time.LocalTime localTime12 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime13 = property9.roundCeilingCopy();
        org.joda.time.LocalTime localTime15 = property9.setCopy((int) (byte) 10);
        int int16 = property9.get();
        org.joda.time.LocalTime localTime18 = property9.addCopy(1645454869205L);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localTime22.toDateTime(readableInstant23);
        org.joda.time.Chronology chronology25 = localTime22.getChronology();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (byte) 1, chronology25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology25);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        boolean boolean29 = dateTime27.isAfterNow();
        org.joda.time.DateTime dateTime31 = dateTime27.withMillis((-770547548000L));
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localTime34.toDateTime(readableInstant35);
        org.joda.time.Chronology chronology37 = localTime34.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.weekyears();
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localTime42.toDateTime(readableInstant43);
        org.joda.time.Chronology chronology45 = localTime42.getChronology();
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((long) (byte) 1, chronology45);
        int[] intArray48 = chronology37.get((org.joda.time.ReadablePartial) localTime46, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField49 = chronology37.dayOfYear();
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.DateTime dateTime54 = localTime52.toDateTime(readableInstant53);
        org.joda.time.LocalTime localTime55 = dateTime54.toLocalTime();
        org.joda.time.DateTime.Property property56 = dateTime54.minuteOfHour();
        int int57 = property56.get();
        org.joda.time.Interval interval58 = property56.toInterval();
        org.joda.time.DateTime dateTime59 = interval58.getEnd();
        org.joda.time.Period period60 = interval58.toPeriod();
        int[] intArray62 = chronology37.get((org.joda.time.ReadablePeriod) period60, (long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType63 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.DateTime dateTime68 = localTime66.toDateTime(readableInstant67);
        org.joda.time.Chronology chronology69 = localTime66.getChronology();
        org.joda.time.DurationField durationField70 = chronology69.weekyears();
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.DateTime dateTime76 = localTime74.toDateTime(readableInstant75);
        org.joda.time.Chronology chronology77 = localTime74.getChronology();
        org.joda.time.LocalTime localTime78 = new org.joda.time.LocalTime((long) (byte) 1, chronology77);
        int[] intArray80 = chronology69.get((org.joda.time.ReadablePartial) localTime78, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField81 = chronology69.dayOfYear();
        org.joda.time.DurationField durationField82 = durationFieldType63.getField(chronology69);
        int int83 = period60.get(durationFieldType63);
        org.joda.time.DateTime dateTime84 = dateTime31.plus((org.joda.time.ReadablePeriod) period60);
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.Interval interval86 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period60, readableInstant85);
        org.joda.time.MutablePeriod mutablePeriod87 = period60.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod88 = mutablePeriod87.toMutablePeriod();
        boolean boolean89 = localTime18.equals((java.lang.Object) mutablePeriod87);
        java.lang.String str90 = mutablePeriod87.toString();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(durationField70);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(durationField82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(mutablePeriod87);
        org.junit.Assert.assertNotNull(mutablePeriod88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "PT1M" + "'", str90, "PT1M");
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(53509260, 53419115, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53509260 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.DateTime dateTime7 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localTime12.toDateTime(readableInstant13);
        org.joda.time.Chronology chronology15 = localTime12.getChronology();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (byte) 1, chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.dayOfMonth();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.now(chronology15);
        org.joda.time.LocalTime localTime21 = localTime19.plusHours((int) 'u');
        org.joda.time.LocalTime localTime23 = localTime19.withMillisOfSecond(1);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.DateTime dateTime28 = localTime26.toDateTime(readableInstant27);
        org.joda.time.LocalTime localTime29 = dateTime28.toLocalTime();
        int int30 = dateTime28.getMonthOfYear();
        int int31 = dateTime28.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int37 = dateTimeZone35.getOffset((long) (byte) 1);
        long long39 = dateTimeZone33.getMillisKeepLocal(dateTimeZone35, (long) 3);
        org.joda.time.DateTime dateTime40 = dateTime28.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime41 = localTime23.toDateTimeToday(dateTimeZone33);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) 5, dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime7.toMutableDateTime(dateTimeZone33);
        int int44 = mutableDateTime43.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3L + "'", long39 == 3L);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.Chronology chronology13 = localTime10.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 1, chronology13);
        int[] intArray16 = chronology5.get((org.joda.time.ReadablePartial) localTime14, (long) (short) -1);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localTime22.toDateTime(readableInstant23);
        int int25 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.LocalTime.Property property26 = localTime19.hourOfDay();
        org.joda.time.LocalTime localTime28 = property26.addCopy(6);
        org.joda.time.LocalTime localTime29 = property26.roundCeilingCopy();
        java.util.Locale locale31 = java.util.Locale.US;
        java.lang.String str32 = locale31.getDisplayName();
        org.joda.time.LocalTime localTime33 = property26.setCopy("0", locale31);
        org.joda.time.LocalTime localTime34 = property26.roundFloorCopy();
        org.joda.time.LocalTime localTime36 = localTime34.minusMillis(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.secondOfMinute();
        int int38 = localTime34.get(dateTimeFieldType37);
        int int39 = localTime14.indexOf(dateTimeFieldType37);
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType37.getDurationType();
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.DateTime dateTime47 = localTime45.toDateTime(readableInstant46);
        org.joda.time.Chronology chronology48 = localTime45.getChronology();
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((long) (byte) 1, chronology48);
        org.joda.time.DateTimeField dateTimeField50 = chronology48.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.dayOfMonth();
        org.joda.time.Chronology chronology52 = chronology48.withUTC();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.year();
        boolean boolean54 = durationFieldType41.isSupported(chronology52);
        org.joda.time.DateTimeField dateTimeField55 = chronology52.dayOfYear();
        org.joda.time.DateTimeField dateTimeField56 = chronology52.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField57 = chronology52.yearOfCentury();
        boolean boolean58 = durationFieldType40.isSupported(chronology52);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "English (United States)" + "'", str32, "English (United States)");
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime.Property property7 = dateTime4.hourOfDay();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int18 = dateTimeZone16.getOffset((long) (byte) 1);
        long long20 = dateTimeZone14.getMillisKeepLocal(dateTimeZone16, (long) 3);
        org.joda.time.DateTime dateTime21 = dateTime12.withZone(dateTimeZone14);
        org.joda.time.DateTime dateTime23 = dateTime12.minus((long) '#');
        org.joda.time.DateTime.Property property24 = dateTime12.weekyear();
        org.joda.time.DateTime dateTime26 = dateTime12.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime27 = dateTime12.toDateTime();
        org.joda.time.DateTime dateTime29 = dateTime12.withWeekyear(15);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.yearOfEra();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 10);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone36);
        int int39 = dateTimeField33.getMaximumValue((org.joda.time.ReadablePartial) localTime38);
        int int40 = localTime38.getSecondOfMinute();
        org.joda.time.LocalTime localTime42 = localTime38.plusSeconds(99);
        int int43 = property7.compareTo((org.joda.time.ReadablePartial) localTime42);
        org.joda.time.DateTime dateTime45 = property7.addToCopy(1440000L);
        java.util.Locale locale47 = java.util.Locale.FRENCH;
        java.lang.String str48 = locale47.getDisplayCountry();
        java.lang.String str49 = dateTime45.toString("53399642", locale47);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 999 + "'", int39 == 999);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 31 + "'", int40 == 31);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "53399642" + "'", str49, "53399642");
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 0, dateTimeZone2);
        org.joda.time.LocalTime localTime7 = localTime5.minusMinutes(3);
        int int8 = localTime7.getHourOfDay();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime11.plus(readablePeriod14);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localTime18.toDateTime(readableInstant19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int26 = dateTimeZone24.getOffset((long) (byte) 1);
        long long28 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) 3);
        org.joda.time.DateTime dateTime29 = dateTime20.withZone(dateTimeZone22);
        org.joda.time.DateTime dateTime31 = dateTime29.minusSeconds((int) 'u');
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, readableDuration32);
        org.joda.time.Period period34 = interval33.toPeriod();
        org.joda.time.LocalTime localTime35 = localTime11.plus((org.joda.time.ReadablePeriod) period34);
        int int36 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.LocalTime.Property property37 = localTime7.millisOfDay();
        org.joda.time.LocalTime localTime39 = property37.addWrapFieldToCopy(42);
        org.joda.time.LocalTime localTime41 = property37.addCopy((-53177L));
        org.joda.time.DurationField durationField42 = property37.getDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 23 + "'", int8 == 23);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3L + "'", long28 == 3L);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(durationField42);
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfEra();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 1, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.dayOfMonth();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now(chronology14);
        org.joda.time.LocalTime localTime20 = localTime18.plusHours((int) 'u');
        long long22 = chronology5.set((org.joda.time.ReadablePartial) localTime18, 0L);
        org.joda.time.DurationField durationField23 = chronology5.centuries();
        org.joda.time.DateTimeField dateTimeField24 = chronology5.year();
        org.joda.time.DateTimeField dateTimeField25 = chronology5.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = chronology5.add(readablePeriod26, (long) 302, 1645401650);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 53851448L + "'", long22 == 53851448L);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 302L + "'", long29 == 302L);
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        java.lang.String str3 = calendar2.getCalendarType();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        calendar2.clear();
        calendar2.set(28, (int) (short) 10, 0);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTime(readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int21 = dateTimeZone19.getOffset((long) (byte) 1);
        long long23 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 3);
        org.joda.time.DateTime dateTime24 = dateTime15.withZone(dateTimeZone17);
        org.joda.time.DateTime dateTime26 = dateTime15.minus((long) '#');
        org.joda.time.DateTime.Property property27 = dateTime15.weekyear();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime15.plus(readableDuration28);
        org.joda.time.DateTime.Property property30 = dateTime29.era();
        org.joda.time.DateTime.Property property31 = dateTime29.yearOfCentury();
        boolean boolean32 = localTime10.equals((java.lang.Object) dateTime29);
        int int33 = localTime10.getHourOfDay();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localTime39.toDateTime(readableInstant40);
        int int42 = localTime36.compareTo((org.joda.time.ReadablePartial) localTime39);
        org.joda.time.LocalTime.Property property43 = localTime36.hourOfDay();
        org.joda.time.LocalTime localTime45 = property43.addCopy(6);
        org.joda.time.LocalTime localTime46 = property43.roundCeilingCopy();
        org.joda.time.LocalTime localTime48 = property43.addCopy((int) (byte) 0);
        boolean boolean49 = localTime10.isAfter((org.joda.time.ReadablePartial) localTime48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((java.lang.Object) localTime48, dateTimeZone50);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance();
        int int53 = calendar52.getFirstDayOfWeek();
        int int55 = calendar52.getLeastMaximum(2);
        java.lang.String str56 = calendar52.getCalendarType();
        java.time.Instant instant57 = calendar52.toInstant();
        int int58 = calendar52.getMinimalDaysInFirstWeek();
        java.time.Instant instant59 = calendar52.toInstant();
        java.util.TimeZone timeZone60 = calendar52.getTimeZone();
        java.util.Locale locale61 = java.util.Locale.US;
        java.util.Locale locale65 = new java.util.Locale("", "hi!", "");
        java.lang.String str66 = locale61.getDisplayCountry(locale65);
        java.lang.String str67 = locale61.getISO3Language();
        java.util.Locale locale69 = new java.util.Locale("hours");
        java.lang.String str71 = locale69.getExtension('u');
        java.lang.String str72 = locale61.getDisplayVariant(locale69);
        java.util.Calendar calendar73 = java.util.Calendar.getInstance(timeZone60, locale61);
        org.joda.time.LocalTime localTime74 = org.joda.time.LocalTime.fromCalendarFields(calendar73);
        boolean boolean75 = localTime48.isAfter((org.joda.time.ReadablePartial) localTime74);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-61257513600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=28,MONTH=9,WEEK_OF_YEAR=45,WEEK_OF_MONTH=6,DAY_OF_MONTH=31,DAY_OF_YEAR=305,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gregory" + "'", str3, "gregory");
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3L + "'", long23 == 3L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(calendar52);
// flaky:         org.junit.Assert.assertEquals(calendar52.toString(), "java.util.GregorianCalendar[time=1645455451461,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=31,MILLISECOND=461,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 11 + "'", int55 == 11);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "gregory" + "'", str56, "gregory");
        org.junit.Assert.assertNotNull(instant57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(instant59);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertEquals(locale65.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "United States" + "'", str66, "United States");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "eng" + "'", str67, "eng");
        org.junit.Assert.assertEquals(locale69.toString(), "hours");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(calendar73);
// flaky:         org.junit.Assert.assertEquals(calendar73.toString(), "java.util.GregorianCalendar[time=1645455451461,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=31,MILLISECOND=461,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale4 = new java.util.Locale("", "hi!", "");
        java.lang.String str5 = locale0.getDisplayCountry(locale4);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale0);
        calendar6.roll((int) (byte) 0, 366);
        boolean boolean10 = calendar6.isWeekDateSupported();
        java.time.Instant instant11 = calendar6.toInstant();
        java.util.Date date12 = java.util.Date.from(instant11);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals(locale4.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "United States" + "'", str5, "United States");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455451495,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=31,MILLISECOND=495,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Feb 21 14:57:31 UTC 2022");
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.DateTime dateTime9 = interval8.getEnd();
        org.joda.time.Period period10 = interval8.toPeriod();
        java.lang.String str11 = interval8.toString();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTime(readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int22 = dateTimeZone20.getOffset((long) (byte) 1);
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone20, (long) 3);
        org.joda.time.DateTime dateTime25 = dateTime16.withZone(dateTimeZone18);
        org.joda.time.DateTime dateTime27 = dateTime16.minus((long) '#');
        org.joda.time.DateTime.Property property28 = dateTime16.weekyear();
        org.joda.time.DateTime dateTime30 = dateTime16.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime31 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime33 = dateTime16.withWeekyear(15);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        boolean boolean35 = interval8.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(3600000L);
        boolean boolean38 = interval8.contains((org.joda.time.ReadableInstant) dateTime37);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010/2022-02-21T00:11:00.000+00:00:00.010" + "'", str11, "2022-02-21T00:10:00.000+00:00:00.010/2022-02-21T00:11:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(5, 292278993, (-143999));
        java.util.Calendar calendar5 = builder4.build();
        calendar5.add(0, (int) (short) 10);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.LocalTime localTime14 = dateTime13.toLocalTime();
        org.joda.time.DateTime.Property property15 = dateTime13.minuteOfHour();
        java.lang.String str16 = property15.toString();
        org.joda.time.DateTime dateTime17 = property15.roundFloorCopy();
        org.joda.time.DateTime dateTime19 = property15.addToCopy((long) 366);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localTime22.toDateTime(readableInstant23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusYears(7);
        org.joda.time.DateTime dateTime28 = dateTime24.plusWeeks((int) (short) 10);
        int int29 = property15.getDifference((org.joda.time.ReadableInstant) dateTime28);
        boolean boolean30 = calendar5.before((java.lang.Object) property15);
        long long31 = calendar5.getTimeInMillis();
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        boolean boolean33 = calendar5.isLenient();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=17536613581000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2525,MONTH=8,WEEK_OF_YEAR=38,WEEK_OF_MONTH=4,DAY_OF_MONTH=18,DAY_OF_YEAR=261,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=33,SECOND=1,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Property[minuteOfHour]" + "'", str16, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-100800) + "'", int29 == (-100800));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 17536613581000L + "'", long31 == 17536613581000L);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localTime4.toDateTime(readableInstant5);
        org.joda.time.Chronology chronology7 = localTime4.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 1, chronology7);
        boolean boolean9 = dateTimeFieldType0.isSupported(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str13 = locale12.getVariant();
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale locale18 = new java.util.Locale("", "hi!", "");
        java.lang.String str19 = locale14.getDisplayCountry(locale18);
        java.lang.String str20 = locale14.getISO3Language();
        java.lang.String str21 = locale14.getScript();
        java.lang.String str22 = locale12.getDisplayCountry(locale14);
        java.lang.String str23 = dateTimeField10.getAsShortText(1645454861756L, locale14);
        long long26 = dateTimeField10.getDifferenceAsLong((long) 15, (-259200000L));
        org.joda.time.DurationField durationField27 = dateTimeField10.getRangeDurationField();
        int int30 = durationField27.getDifference(1645455444556L, 1688707172376000L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals(locale18.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "United States" + "'", str19, "United States");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "eng" + "'", str20, "eng");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "China" + "'", str22, "China");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "52" + "'", str23, "52");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-53460) + "'", int30 == (-53460));
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int5 = dateTimeZone3.getOffset((long) (byte) 1);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 3);
        boolean boolean9 = dateTimeZone3.equals((java.lang.Object) 1);
        int int11 = dateTimeZone3.getOffset((long) 3);
        java.util.Locale locale13 = java.util.Locale.US;
        java.util.Locale locale17 = new java.util.Locale("", "hi!", "");
        java.lang.String str18 = locale13.getDisplayCountry(locale17);
        java.lang.String str19 = dateTimeZone3.getShortName((long) 28, locale13);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals(locale17.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "United States" + "'", str18, "United States");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.010" + "'", str19, "+00:00:00.010");
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        org.joda.time.DateTime dateTime8 = dateTime4.plusWeeks(0);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.secondOfDay();
        org.joda.time.DurationField durationField11 = dateTimeField10.getRangeDurationField();
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str13 = locale12.getCountry();
        int int14 = dateTimeField10.getMaximumTextLength(locale12);
        int int17 = dateTimeField10.getDifference(19353600117L, (long) 14);
        org.joda.time.DurationField durationField18 = dateTimeField10.getDurationField();
        java.util.Locale locale22 = new java.util.Locale("1969-12-29T00:00:00.000+00:00:00.010");
        // The following exception was thrown during execution in test generation
        try {
            long long23 = dateTimeField10.set((-53177L), "53697863", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53697863 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CN" + "'", str13, "CN");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19353600 + "'", int17 == 19353600);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertEquals(locale22.toString(), "1969-12-29t00:00:00.000+00:00:00.010");
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList6, strMap7);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Locale locale12 = java.util.Locale.US;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("Property[minuteOfHour]");
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("");
        java.lang.String str18 = locale17.getScript();
        java.util.Locale locale19 = java.util.Locale.US;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale19);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Locale locale26 = new java.util.Locale("", "hi!", "");
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale locale28 = java.util.Locale.US;
        java.util.Locale locale32 = new java.util.Locale("", "hi!", "");
        java.lang.String str33 = locale28.getDisplayCountry(locale32);
        java.util.Locale locale34 = java.util.Locale.US;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("Property[minuteOfHour]");
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("Property[minuteOfHour]");
        java.util.Locale locale44 = new java.util.Locale("", "hi!", "");
        java.util.Locale.setDefault(locale44);
        java.util.Locale locale46 = java.util.Locale.US;
        java.lang.String str47 = locale46.getDisplayName();
        java.util.Locale locale48 = java.util.Locale.UK;
        java.util.Locale locale50 = new java.util.Locale("hours");
        java.util.Locale locale51 = java.util.Locale.US;
        java.lang.String str52 = locale51.getDisplayLanguage();
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(locale51);
        java.util.Locale locale57 = new java.util.Locale("", "hi!", "");
        java.util.Locale.setDefault(locale57);
        java.util.Locale[] localeArray59 = new java.util.Locale[] { locale12, locale15, locale17, locale19, locale22, locale26, locale32, locale34, locale37, locale38, locale40, locale44, locale46, locale48, locale50, locale51, locale57 };
        java.util.ArrayList<java.util.Locale> localeList60 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList60, localeArray59);
        java.util.Locale.FilteringMode filteringMode62 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList60, filteringMode62);
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap66 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList67 = java.util.Locale.LanguageRange.parse("days", strMap66);
        java.lang.String[] strArray78 = new java.lang.String[] { "2022-02-21T00:10:00.000Z", "1970-01-01T00:00:00.052Z", "2022-02-21T00:10:00.000Z", "days", "days", "2022-02-21T00:10:00.000Z", "United States", "United States", "dayOfMonth", "10" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags(languageRangeList67, (java.util.Collection<java.lang.String>) strList79);
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strList81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap83 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList6, strMap83);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap85 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList86 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList6, strMap85);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1645455451577,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=31,MILLISECOND=577,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertEquals(locale26.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "und" + "'", str27, "und");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertEquals(locale32.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "United States" + "'", str33, "United States");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals(locale44.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "English (United States)" + "'", str47, "English (United States)");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_GB");
        org.junit.Assert.assertEquals(locale50.toString(), "hours");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "English" + "'", str52, "English");
        org.junit.Assert.assertNotNull(calendar53);
// flaky:         org.junit.Assert.assertEquals(calendar53.toString(), "java.util.GregorianCalendar[time=1645455451577,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=31,MILLISECOND=577,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(locale57.toString(), "_HI!");
        org.junit.Assert.assertNotNull(localeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + filteringMode62 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode62.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList63);
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNotNull(languageRangeList67);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(languageRangeList84);
        org.junit.Assert.assertNotNull(languageRangeList86);
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap4);
        java.util.Collection<java.util.Locale> localeCollection6 = null;
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, localeCollection6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.parse("days", strMap9);
        java.util.Set<java.lang.String> strSet11 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags(languageRangeList10, (java.util.Collection<java.lang.String>) strSet11);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList12);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleKeys();
        java.lang.String str16 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet15);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("de");
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap22);
        java.util.Collection<java.util.Locale> localeCollection24 = null;
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, localeCollection24);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList27 = java.util.Locale.filter(languageRangeList18, (java.util.Collection<java.util.Locale>) localeList25, filteringMode26);
        java.util.List<java.util.Locale> localeList28 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.parse("English", strMap30);
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.parse("de");
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, strMap44);
        java.util.Collection<java.util.Locale> localeCollection46 = null;
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, localeCollection46);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList49 = java.util.Locale.filter(languageRangeList40, (java.util.Collection<java.util.Locale>) localeList47, filteringMode48);
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter(languageRangeList38, (java.util.Collection<java.util.Locale>) localeList49, filteringMode50);
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags(languageRangeList31, (java.util.Collection<java.lang.String>) strSet33, filteringMode50);
        java.lang.String str53 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet33);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(localeList7);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode26.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList27);
        org.junit.Assert.assertNotNull(localeList28);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode48.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList49);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode50.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        java.util.Date date4 = calendar2.getTime();
        int int5 = date4.getSeconds();
        int int6 = date4.getYear();
        date4.setSeconds(2);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance();
        long long10 = calendar9.getTimeInMillis();
        int int11 = calendar9.getMinimalDaysInFirstWeek();
        java.util.Date date12 = calendar9.getTime();
        calendar9.setLenient(false);
        java.util.Date date16 = new java.util.Date((long) (byte) 100);
        date16.setMinutes(11);
        long long19 = date16.getTime();
        int int20 = date16.getMonth();
        int int21 = date16.getMonth();
        java.time.Instant instant22 = date16.toInstant();
        java.util.Date date23 = java.util.Date.from(instant22);
        calendar9.setTime(date23);
        boolean boolean25 = date4.after(date23);
        int int26 = date4.getMinutes();
        int int27 = date4.getDate();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455451632,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=31,MILLISECOND=632,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:57:02 UTC 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 122 + "'", int6 == 122);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=660100,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=11,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1645455451632L + "'", long10 == 1645455451632L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Feb 21 14:57:31 UTC 2022");
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:11:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 660100L + "'", long19 == 660100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:11:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 57 + "'", int26 == 57);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21 + "'", int27 == 21);
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.Interval interval9 = interval8.toInterval();
        long long10 = interval8.toDurationMillis();
        org.joda.time.Interval interval11 = interval8.toInterval();
        boolean boolean12 = interval11.containsNow();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localTime15.toDateTime(readableInstant16);
        org.joda.time.LocalTime localTime18 = dateTime17.toLocalTime();
        org.joda.time.DateTime.Property property19 = dateTime17.minuteOfHour();
        int int20 = property19.get();
        org.joda.time.Interval interval21 = property19.toInterval();
        org.joda.time.DateTime dateTime22 = interval21.getEnd();
        org.joda.time.Period period23 = interval21.toPeriod();
        org.joda.time.Interval interval24 = interval21.toInterval();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localTime27.toDateTime(readableInstant28);
        org.joda.time.LocalTime localTime30 = dateTime29.toLocalTime();
        org.joda.time.DateTime.Property property31 = dateTime29.minuteOfHour();
        int int32 = property31.get();
        org.joda.time.Interval interval33 = property31.toInterval();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localTime36.toDateTime(readableInstant37);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localTime41.toDateTime(readableInstant42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime45 = localTime41.plus(readablePeriod44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean47 = localTime45.isSupported(dateTimeFieldType46);
        org.joda.time.DateTime dateTime48 = dateTime38.withFields((org.joda.time.ReadablePartial) localTime45);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int54 = dateTimeZone52.getOffset((long) (byte) 1);
        long long56 = dateTimeZone50.getMillisKeepLocal(dateTimeZone52, (long) 3);
        long long59 = dateTimeZone50.convertLocalToUTC((long) 9, false);
        java.lang.String str60 = dateTimeZone50.toString();
        org.joda.time.DateTime dateTime61 = localTime45.toDateTimeToday(dateTimeZone50);
        long long62 = dateTime61.getMillis();
        boolean boolean63 = interval33.equals((java.lang.Object) long62);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.DateTime dateTime70 = localTime68.toDateTime(readableInstant69);
        org.joda.time.Chronology chronology71 = localTime68.getChronology();
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime((long) (byte) 1, chronology71);
        boolean boolean73 = dateTimeFieldType64.isSupported(chronology71);
        org.joda.time.DateTimeField dateTimeField74 = chronology71.centuryOfEra();
        org.joda.time.LocalTime localTime75 = org.joda.time.LocalTime.now(chronology71);
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime(chronology71);
        org.joda.time.LocalTime localTime77 = org.joda.time.LocalTime.now(chronology71);
        org.joda.time.Interval interval78 = interval33.withChronology(chronology71);
        boolean boolean79 = interval21.isAfter((org.joda.time.ReadableInterval) interval78);
        org.joda.time.Interval interval80 = interval11.gap((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Chronology chronology81 = interval21.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval82 = new org.joda.time.Interval((java.lang.Object) chronology81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60000L + "'", long10 == 60000L);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 3L + "'", long56 == 3L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00:00.010" + "'", str60, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1645402199990L + "'", long62 == 1645402199990L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(interval80);
        org.junit.Assert.assertNotNull(chronology81);
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusHours(1439);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.DateTime dateTime8 = localTime2.toDateTimeToday(dateTimeZone4);
        long long10 = dateTimeZone4.convertUTCToLocal(1645454944692L);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 1);
        int[] intArray13 = localTime12.getValues();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localTime16.toDateTime(readableInstant17);
        org.joda.time.LocalTime localTime19 = dateTime18.toLocalTime();
        org.joda.time.DateTime.Property property20 = dateTime18.minuteOfHour();
        int int21 = property20.getMinimumValue();
        org.joda.time.DateTime dateTime22 = property20.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone24.isLocalDateTimeGap(localDateTime25);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.DateTime dateTime28 = dateTime22.withZoneRetainFields(dateTimeZone24);
        int int29 = dateTime28.getDayOfWeek();
        org.joda.time.DateTime dateTime30 = localTime12.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        int int31 = dateTime30.getMinuteOfDay();
        org.joda.time.DateTime dateTime33 = dateTime30.plusMonths(15706);
        int int34 = dateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology35 = dateTime33.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.eras();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1645454944702L + "'", long10 == 1645454944702L);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 11]");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(durationField36);
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusYears(7);
        org.joda.time.DateTime dateTime8 = dateTime4.plusWeeks((int) (short) 10);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.LocalTime localTime14 = dateTime13.toLocalTime();
        org.joda.time.DateTime.Property property15 = dateTime13.minuteOfHour();
        org.joda.time.DateTime dateTime17 = dateTime13.plusWeeks(0);
        org.joda.time.Chronology chronology18 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.millisOfDay();
        org.joda.time.DateTime dateTime20 = dateTime4.toDateTime(chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = chronology18.getZone();
        java.lang.String str22 = chronology18.toString();
        org.joda.time.DurationField durationField23 = chronology18.years();
        org.joda.time.DateTimeField dateTimeField24 = chronology18.hourOfDay();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localTime28.toDateTime(readableInstant29);
        org.joda.time.Chronology chronology31 = localTime28.getChronology();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (byte) 1, chronology31);
        org.joda.time.DateTime dateTime33 = localTime32.toDateTimeToday();
        org.joda.time.LocalTime localTime35 = localTime32.minusMinutes(1);
        org.joda.time.LocalTime.Property property36 = localTime32.millisOfDay();
        int int37 = localTime32.getMillisOfDay();
        int[] intArray39 = chronology18.get((org.joda.time.ReadablePartial) localTime32, 1645454890032L);
        org.joda.time.DateTimeField dateTimeField40 = chronology18.era();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ISOChronology[+00:00:00.010]" + "'", str22, "ISOChronology[+00:00:00.010]");
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[14, 48, 10, 42]");
        org.junit.Assert.assertNotNull(dateTimeField40);
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        int int7 = dateTime4.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int13 = dateTimeZone11.getOffset((long) (byte) 1);
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 3);
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(dateTimeZone9);
        boolean boolean17 = dateTimeZone9.isFixed();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone9);
        int int19 = dateTime18.getYearOfCentury();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 22 + "'", int19 == 22);
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusYears(7);
        java.util.GregorianCalendar gregorianCalendar7 = dateTime4.toGregorianCalendar();
        gregorianCalendar7.set(13, 2, 19, 122, 366);
        int int14 = gregorianCalendar7.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = gregorianCalendar7.getMinimum((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(53754033L);
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(1645455062055L);
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis(1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13673");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTime(readableInstant6);
        int int8 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime11 = property9.addCopy(6);
        org.joda.time.LocalTime localTime12 = property9.roundCeilingCopy();
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = locale14.getDisplayName();
        org.joda.time.LocalTime localTime16 = property9.setCopy("0", locale14);
        org.joda.time.LocalTime localTime18 = property9.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime20 = property9.addNoWrapToCopy(7);
        org.joda.time.LocalTime localTime21 = property9.getLocalTime();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English (United States)" + "'", str15, "English (United States)");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13674");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList6, strMap7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList8, strMap9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList10, strMap11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList17, strMap18);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Locale locale23 = java.util.Locale.US;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("Property[minuteOfHour]");
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("");
        java.lang.String str29 = locale28.getScript();
        java.util.Locale locale30 = java.util.Locale.US;
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale30);
        java.util.Locale locale33 = java.util.Locale.UK;
        java.util.Locale locale37 = new java.util.Locale("", "hi!", "");
        java.lang.String str38 = locale37.toLanguageTag();
        java.util.Locale locale39 = java.util.Locale.US;
        java.util.Locale locale43 = new java.util.Locale("", "hi!", "");
        java.lang.String str44 = locale39.getDisplayCountry(locale43);
        java.util.Locale locale45 = java.util.Locale.US;
        java.util.Locale locale46 = locale45.stripExtensions();
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("Property[minuteOfHour]");
        java.util.Locale locale49 = java.util.Locale.GERMAN;
        java.util.Locale locale51 = java.util.Locale.forLanguageTag("Property[minuteOfHour]");
        java.util.Locale locale55 = new java.util.Locale("", "hi!", "");
        java.util.Locale.setDefault(locale55);
        java.util.Locale locale57 = java.util.Locale.US;
        java.lang.String str58 = locale57.getDisplayName();
        java.util.Locale locale59 = java.util.Locale.UK;
        java.util.Locale locale61 = new java.util.Locale("hours");
        java.util.Locale locale62 = java.util.Locale.US;
        java.lang.String str63 = locale62.getDisplayLanguage();
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(locale62);
        java.util.Locale locale68 = new java.util.Locale("", "hi!", "");
        java.util.Locale.setDefault(locale68);
        java.util.Locale[] localeArray70 = new java.util.Locale[] { locale23, locale26, locale28, locale30, locale33, locale37, locale43, locale45, locale48, locale49, locale51, locale55, locale57, locale59, locale61, locale62, locale68 };
        java.util.ArrayList<java.util.Locale> localeList71 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList71, localeArray70);
        java.util.Locale.FilteringMode filteringMode73 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList74 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.util.Locale>) localeList71, filteringMode73);
        java.util.Locale locale75 = java.util.Locale.lookup(languageRangeList17, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList17, strMap76);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap78 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList79 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList77, strMap78);
        java.util.Locale.LanguageRange[] languageRangeArray80 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList81 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81, languageRangeArray80);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap83 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList81, strMap83);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList86 = java.util.Locale.LanguageRange.parse("de");
        java.util.Locale.LanguageRange[] languageRangeArray87 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList88 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList88, languageRangeArray87);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap90 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList91 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList88, strMap90);
        java.util.Collection<java.util.Locale> localeCollection92 = null;
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList88, localeCollection92);
        java.util.Locale.FilteringMode filteringMode94 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter(languageRangeList86, (java.util.Collection<java.util.Locale>) localeList93, filteringMode94);
        java.util.Locale.FilteringMode filteringMode96 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList97 = java.util.Locale.filter(languageRangeList84, (java.util.Collection<java.util.Locale>) localeList95, filteringMode96);
        java.util.Locale locale98 = java.util.Locale.lookup(languageRangeList79, (java.util.Collection<java.util.Locale>) localeList97);
        java.util.List<java.util.Locale> localeList99 = java.util.Locale.filter(languageRangeList12, (java.util.Collection<java.util.Locale>) localeList97);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "English" + "'", str31, "English");
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1645455451759,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=31,MILLISECOND=759,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_GB");
        org.junit.Assert.assertEquals(locale37.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "und" + "'", str38, "und");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertEquals(locale43.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "United States" + "'", str44, "United States");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "de");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals(locale55.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "English (United States)" + "'", str58, "English (United States)");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_GB");
        org.junit.Assert.assertEquals(locale61.toString(), "hours");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "English" + "'", str63, "English");
        org.junit.Assert.assertNotNull(calendar64);
// flaky:         org.junit.Assert.assertEquals(calendar64.toString(), "java.util.GregorianCalendar[time=1645455451759,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=31,MILLISECOND=759,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(locale68.toString(), "_HI!");
        org.junit.Assert.assertNotNull(localeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + filteringMode73 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode73.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList74);
        org.junit.Assert.assertNull(locale75);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertNotNull(languageRangeList79);
        org.junit.Assert.assertNotNull(languageRangeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(languageRangeList84);
        org.junit.Assert.assertNotNull(languageRangeList86);
        org.junit.Assert.assertNotNull(languageRangeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(languageRangeList91);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertTrue("'" + filteringMode94 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode94.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertTrue("'" + filteringMode96 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode96.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList97);
        org.junit.Assert.assertNull(locale98);
        org.junit.Assert.assertNotNull(localeList99);
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13675");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        java.lang.String str7 = property6.toString();
        org.joda.time.DateTime dateTime8 = property6.roundFloorCopy();
        org.joda.time.DateTime dateTime10 = property6.addToCopy(25200000L);
        java.lang.String str11 = property6.getAsText();
        java.lang.String str12 = property6.getAsString();
        org.joda.time.DateTime dateTime13 = property6.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[minuteOfHour]" + "'", str7, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13676");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 1, chronology14);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localTime15, (long) (short) -1);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localTime20.toDateTime(readableInstant21);
        org.joda.time.LocalTime localTime23 = dateTime22.toLocalTime();
        org.joda.time.DateTime.Property property24 = dateTime22.minuteOfHour();
        int int25 = property24.get();
        org.joda.time.Interval interval26 = property24.toInterval();
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.Period period28 = interval26.toPeriod();
        org.joda.time.LocalTime localTime30 = localTime15.withPeriodAdded((org.joda.time.ReadablePeriod) period28, 17);
        org.joda.time.Chronology chronology31 = localTime30.getChronology();
        boolean boolean32 = durationFieldType0.isSupported(chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.millisOfDay();
        long long36 = dateTimeField34.roundCeiling(1645455196626L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1645455196626L + "'", long36 == 1645455196626L);
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13677");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTime(readableInstant6);
        int int8 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime11 = property9.addCopy(6);
        org.joda.time.LocalTime localTime12 = property9.roundHalfCeilingCopy();
        int int13 = property9.get();
        org.joda.time.LocalTime localTime14 = property9.roundHalfFloorCopy();
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = property9.getAsText(locale15);
        org.joda.time.LocalTime localTime18 = property9.addWrapFieldToCopy(100);
        java.lang.String str19 = property9.getName();
        org.joda.time.LocalTime localTime20 = property9.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime21 = property9.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hourOfDay" + "'", str19, "hourOfDay");
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13678");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.DateTime dateTime9 = interval8.getEnd();
        org.joda.time.Period period10 = interval8.toPeriod();
        java.lang.String str11 = interval8.toString();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTime(readableInstant15);
        org.joda.time.LocalTime localTime17 = dateTime16.toLocalTime();
        org.joda.time.DateTime.Property property18 = dateTime16.minuteOfHour();
        int int19 = property18.get();
        org.joda.time.Interval interval20 = property18.toInterval();
        org.joda.time.Interval interval21 = interval20.toInterval();
        long long22 = interval20.toDurationMillis();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = interval20.toPeriod(periodType23);
        org.joda.time.Interval interval25 = interval8.overlap((org.joda.time.ReadableInterval) interval20);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = interval25.toPeriod(periodType26);
        org.joda.time.ReadableInterval readableInterval28 = null;
        boolean boolean29 = interval25.contains(readableInterval28);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localTime32.toDateTime(readableInstant33);
        org.joda.time.LocalTime localTime35 = dateTime34.toLocalTime();
        int int36 = dateTime34.getMonthOfYear();
        int int37 = dateTime34.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int43 = dateTimeZone41.getOffset((long) (byte) 1);
        long long45 = dateTimeZone39.getMillisKeepLocal(dateTimeZone41, (long) 3);
        org.joda.time.DateTime dateTime46 = dateTime34.toDateTime(dateTimeZone39);
        org.joda.time.Interval interval47 = interval25.withEnd((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.DateTime dateTime55 = localTime53.toDateTime(readableInstant54);
        int int56 = localTime50.compareTo((org.joda.time.ReadablePartial) localTime53);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean58 = localTime50.isSupported(dateTimeFieldType57);
        org.joda.time.DateTime.Property property59 = dateTime34.property(dateTimeFieldType57);
        org.joda.time.DateTime dateTime61 = dateTime34.withMillisOfDay(10);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localTime64.toDateTime(readableInstant65);
        org.joda.time.LocalTime localTime67 = dateTime66.toLocalTime();
        org.joda.time.DateTime.Property property68 = dateTime66.minuteOfHour();
        int int69 = property68.getMinimumValue();
        org.joda.time.DateTime dateTime70 = property68.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property71 = dateTime70.dayOfYear();
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.DateTime dateTime73 = dateTime70.minus(readableDuration72);
        org.joda.time.DateTime dateTime75 = dateTime70.withYearOfEra(3);
        org.joda.time.DateTime dateTime77 = dateTime75.minusYears(888);
        boolean boolean78 = dateTime61.isEqual((org.joda.time.ReadableInstant) dateTime77);
        int int79 = dateTime77.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010/2022-02-21T00:11:00.000+00:00:00.010" + "'", str11, "2022-02-21T00:10:00.000+00:00:00.010/2022-02-21T00:11:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60000L + "'", long22 == 60000L);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 3L + "'", long45 == 3L);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 7 + "'", int79 == 7);
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13679");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        int int7 = dateTime4.getHourOfDay();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int18 = dateTimeZone16.getOffset((long) (byte) 1);
        long long20 = dateTimeZone14.getMillisKeepLocal(dateTimeZone16, (long) 3);
        org.joda.time.DateTime dateTime21 = dateTime12.withZone(dateTimeZone14);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime21);
        boolean boolean24 = interval22.isBefore((long) 21);
        org.joda.time.Interval interval25 = interval22.toInterval();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localTime28.toDateTime(readableInstant29);
        org.joda.time.Chronology chronology31 = localTime28.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.weekyears();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localTime36.toDateTime(readableInstant37);
        org.joda.time.Chronology chronology39 = localTime36.getChronology();
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((long) (byte) 1, chronology39);
        int[] intArray42 = chronology31.get((org.joda.time.ReadablePartial) localTime40, (long) (short) -1);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.DateTime dateTime47 = localTime45.toDateTime(readableInstant46);
        org.joda.time.LocalTime localTime48 = dateTime47.toLocalTime();
        org.joda.time.DateTime.Property property49 = dateTime47.minuteOfHour();
        int int50 = property49.get();
        org.joda.time.Interval interval51 = property49.toInterval();
        org.joda.time.DateTime dateTime52 = interval51.getEnd();
        org.joda.time.Period period53 = interval51.toPeriod();
        org.joda.time.LocalTime localTime55 = localTime40.withPeriodAdded((org.joda.time.ReadablePeriod) period53, 17);
        org.joda.time.Interval interval56 = interval25.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period53);
        org.joda.time.DateTime dateTime57 = interval56.getEnd();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(dateTime57);
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13680");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfMonth();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.LocalTime localTime12 = localTime10.plusHours((int) 'u');
        org.joda.time.LocalTime localTime14 = localTime10.withMillisOfSecond(1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int20 = dateTimeZone18.getOffset((long) (byte) 1);
        long long22 = dateTimeZone16.getMillisKeepLocal(dateTimeZone18, (long) 3);
        long long25 = dateTimeZone16.convertLocalToUTC((long) 9, false);
        java.lang.String str26 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime27 = localTime14.toDateTimeToday(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.minus(readableDuration28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime27.toDateTime(dateTimeZone31);
        org.joda.time.DateTime.Property property34 = dateTime27.centuryOfEra();
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localTime37.toDateTime(readableInstant38);
        org.joda.time.LocalTime localTime40 = dateTime39.toLocalTime();
        org.joda.time.DateTime.Property property41 = dateTime39.minuteOfHour();
        java.lang.String str42 = property41.toString();
        org.joda.time.DateTime dateTime43 = property41.roundFloorCopy();
        org.joda.time.DateTime dateTime45 = property41.addToCopy(25200000L);
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.DateTime dateTime50 = localTime48.toDateTime(readableInstant49);
        org.joda.time.LocalTime localTime51 = dateTime50.toLocalTime();
        org.joda.time.DateTime.Property property52 = dateTime50.minuteOfHour();
        int int53 = property52.getMinimumValue();
        org.joda.time.DateTime dateTime54 = property52.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone56);
        org.joda.time.DateTime dateTime58 = dateTime54.toDateTime(dateTimeZone56);
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(dateTimeZone56);
        org.joda.time.DateTime dateTime60 = dateTime45.toDateTime(dateTimeZone56);
        org.joda.time.DateTime dateTime61 = dateTime27.withZoneRetainFields(dateTimeZone56);
        java.util.TimeZone timeZone62 = dateTimeZone56.toTimeZone();
        org.joda.time.LocalTime localTime63 = org.joda.time.LocalTime.now(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.010" + "'", str26, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Property[minuteOfHour]" + "'", str42, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(localTime63);
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13681");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(16, 53, (-100800), 3);
        java.util.Calendar.Builder builder9 = builder0.setTimeOfDay(5, 7, 31);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance();
        java.time.Instant instant11 = calendar10.toInstant();
        calendar10.set(12, (int) (byte) 0, 32772, (-100800), 365);
        calendar10.setTimeInMillis((long) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getRangeDurationType();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.DateTime dateTime28 = localTime26.toDateTime(readableInstant27);
        org.joda.time.Chronology chronology29 = localTime26.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.weekyears();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localTime34.toDateTime(readableInstant35);
        org.joda.time.Chronology chronology37 = localTime34.getChronology();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) (byte) 1, chronology37);
        int[] intArray40 = chronology29.get((org.joda.time.ReadablePartial) localTime38, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField41 = chronology29.dayOfYear();
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localTime44.toDateTime(readableInstant45);
        org.joda.time.LocalTime localTime47 = dateTime46.toLocalTime();
        org.joda.time.DateTime.Property property48 = dateTime46.minuteOfHour();
        int int49 = property48.get();
        org.joda.time.Interval interval50 = property48.toInterval();
        org.joda.time.DateTime dateTime51 = interval50.getEnd();
        org.joda.time.Period period52 = interval50.toPeriod();
        int[] intArray54 = chronology29.get((org.joda.time.ReadablePeriod) period52, (long) (byte) 100);
        org.joda.time.DateTimeField dateTimeField55 = chronology29.weekOfWeekyear();
        boolean boolean56 = dateTimeFieldType22.isSupported(chronology29);
        boolean boolean57 = dateTimeFieldType20.isSupported(chronology29);
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.DateTime dateTime65 = localTime63.toDateTime(readableInstant64);
        int int66 = localTime60.compareTo((org.joda.time.ReadablePartial) localTime63);
        org.joda.time.LocalTime.Property property67 = localTime60.hourOfDay();
        org.joda.time.LocalTime localTime69 = property67.addCopy(6);
        org.joda.time.LocalTime localTime70 = property67.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime71 = property67.roundCeilingCopy();
        int[] intArray73 = chronology29.get((org.joda.time.ReadablePartial) localTime71, (long) (byte) 1);
        boolean boolean74 = calendar10.before((java.lang.Object) intArray73);
        java.util.Calendar.Builder builder75 = builder0.setFields(intArray73);
        java.util.Calendar.Builder builder79 = builder75.setDate((-1645432682), 623000, 2);
        java.util.Calendar.Builder builder81 = builder75.setLenient(false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13682");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-26));
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13683");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localTime16.toDateTime(readableInstant17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime20 = localTime16.plus(readablePeriod19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean22 = localTime20.isSupported(dateTimeFieldType21);
        org.joda.time.DateTime dateTime23 = dateTime13.withFields((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int29 = dateTimeZone27.getOffset((long) (byte) 1);
        long long31 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, (long) 3);
        long long34 = dateTimeZone25.convertLocalToUTC((long) 9, false);
        java.lang.String str35 = dateTimeZone25.toString();
        org.joda.time.DateTime dateTime36 = localTime20.toDateTimeToday(dateTimeZone25);
        long long37 = dateTime36.getMillis();
        boolean boolean38 = interval8.equals((java.lang.Object) long37);
        long long39 = interval8.getStartMillis();
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localTime42.toDateTime(readableInstant43);
        org.joda.time.LocalTime localTime45 = dateTime44.toLocalTime();
        org.joda.time.DateTime.Property property46 = dateTime44.minuteOfHour();
        int int47 = property46.get();
        org.joda.time.Interval interval48 = property46.toInterval();
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localTime51.toDateTime(readableInstant52);
        org.joda.time.LocalTime localTime54 = dateTime53.toLocalTime();
        org.joda.time.DateTime.Property property55 = dateTime53.minuteOfHour();
        int int56 = property55.getMinimumValue();
        org.joda.time.DateTime dateTime57 = property55.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property58 = dateTime57.dayOfYear();
        boolean boolean59 = interval48.contains((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.DateTime dateTime64 = localTime62.toDateTime(readableInstant63);
        org.joda.time.LocalTime localTime65 = dateTime64.toLocalTime();
        org.joda.time.DateTime.Property property66 = dateTime64.minuteOfHour();
        java.lang.String str67 = property66.toString();
        org.joda.time.DateTime dateTime68 = property66.roundFloorCopy();
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.DateTime dateTime70 = dateTime68.minus(readableDuration69);
        org.joda.time.Interval interval71 = interval48.withStart((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Interval interval72 = interval48.toInterval();
        org.joda.time.Interval interval73 = interval48.toInterval();
        boolean boolean74 = interval8.overlaps((org.joda.time.ReadableInterval) interval73);
        long long75 = interval8.getStartMillis();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3L + "'", long31 == 3L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.010" + "'", str35, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1645402199990L + "'", long37 == 1645402199990L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1645402199990L + "'", long39 == 1645402199990L);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Property[minuteOfHour]" + "'", str67, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1645402199990L + "'", long75 == 1645402199990L);
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13684");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '4');
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond(0);
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfDay(122);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13685");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale4 = new java.util.Locale("", "hi!", "");
        java.lang.String str5 = locale0.getDisplayCountry(locale4);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale0);
        java.util.Date date7 = calendar6.getTime();
        java.util.Date date8 = calendar6.getTime();
        date8.setTime(35L);
        date8.setMonth(2070);
        date8.setHours(612);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals(locale4.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "United States" + "'", str5, "United States");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455452037,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=32,MILLISECOND=37,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 21 14:57:32 UTC 2022");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 26 12:00:00 UTC 2142");
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13686");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTime(readableInstant12);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 1, chronology14);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localTime15, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField18 = chronology6.dayOfYear();
        org.joda.time.DurationField durationField19 = durationFieldType0.getField(chronology6);
        org.joda.time.DurationField durationField20 = chronology6.minutes();
        org.joda.time.DateTimeField dateTimeField21 = chronology6.monthOfYear();
        long long23 = dateTimeField21.roundHalfFloor(1645402140000L);
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str25 = locale24.getVariant();
        int int26 = dateTimeField21.getMaximumShortTextLength(locale24);
        long long28 = dateTimeField21.roundHalfCeiling(53370750L);
        java.lang.String str29 = dateTimeField21.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1646092800000L + "'", long23 == 1646092800000L);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DateTimeField[monthOfYear]" + "'", str29, "DateTimeField[monthOfYear]");
    }

    @Test
    public void test13687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13687");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(1645454883425L);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.DateTime dateTime8 = localTime6.toDateTime(readableInstant7);
        org.joda.time.Chronology chronology9 = localTime6.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (byte) 1, chronology9);
        org.joda.time.DateTime dateTime11 = localTime10.toDateTimeToday();
        org.joda.time.LocalTime localTime13 = localTime10.minusMinutes(1);
        org.joda.time.LocalTime.Property property14 = localTime10.millisOfDay();
        int int15 = localTime10.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean17 = localTime10.isSupported(dateTimeFieldType16);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localTime20.toDateTime(readableInstant21);
        org.joda.time.LocalTime localTime23 = dateTime22.toLocalTime();
        int int24 = dateTime22.getMonthOfYear();
        int int25 = dateTime22.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int31 = dateTimeZone29.getOffset((long) (byte) 1);
        long long33 = dateTimeZone27.getMillisKeepLocal(dateTimeZone29, (long) 3);
        org.joda.time.DateTime dateTime34 = dateTime22.toDateTime(dateTimeZone27);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DateTime dateTime37 = dateTime22.withFieldAdded(durationFieldType35, 2022);
        org.joda.time.LocalTime localTime39 = localTime10.withFieldAdded(durationFieldType35, 1439);
        org.joda.time.DateTime dateTime41 = dateTime2.withFieldAdded(durationFieldType35, 12);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int45 = dateTimeZone43.getOffset((long) (byte) 1);
        java.lang.String str46 = dateTimeZone43.toString();
        org.joda.time.DateTime dateTime47 = dateTime41.toDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(1645454895971L, dateTimeZone43);
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.DateTime dateTime54 = localTime52.toDateTime(readableInstant53);
        org.joda.time.Chronology chronology55 = localTime52.getChronology();
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime((long) (byte) 1, chronology55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology55);
        org.joda.time.DurationField durationField58 = chronology55.minutes();
        boolean boolean59 = dateTimeZone43.equals((java.lang.Object) chronology55);
        java.util.TimeZone timeZone60 = dateTimeZone43.toTimeZone();
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone60);
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(timeZone60);
        java.util.Locale locale66 = new java.util.Locale("deu", "DateTimeField[monthOfYear]", "");
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone60, locale66);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 3L + "'", long33 == 3L);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.010" + "'", str46, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar61);
// flaky:         org.junit.Assert.assertEquals(calendar61.toString(), "java.util.GregorianCalendar[time=1645455452064,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.010,offset=10,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=32,MILLISECOND=74,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar62);
// flaky:         org.junit.Assert.assertEquals(calendar62.toString(), "java.util.GregorianCalendar[time=1645455452064,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.010,offset=10,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=32,MILLISECOND=74,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(locale66.toString(), "deu_DATETIMEFIELD[MONTHOFYEAR]");
        org.junit.Assert.assertNotNull(calendar67);
// flaky:         org.junit.Assert.assertEquals(calendar67.toString(), "java.util.GregorianCalendar[time=1645455452064,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.010,offset=10,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=32,MILLISECOND=74,ZONE_OFFSET=10,DST_OFFSET=0]");
    }

    @Test
    public void test13688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13688");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter2.getZone();
        boolean boolean6 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronology();
        java.lang.Appendable appendable8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(chronology7);
    }

    @Test
    public void test13689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13689");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHN", (double) 1645444409496L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.645444409496E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13690");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localTime12.toDateTime(readableInstant13);
        org.joda.time.LocalTime localTime15 = dateTime14.toLocalTime();
        org.joda.time.DateTime.Property property16 = dateTime14.minuteOfHour();
        int int17 = property16.get();
        org.joda.time.Interval interval18 = property16.toInterval();
        org.joda.time.Interval interval19 = interval18.toInterval();
        boolean boolean20 = interval9.isBefore((org.joda.time.ReadableInterval) interval18);
        org.joda.time.DateTime dateTime21 = interval9.getEnd();
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.DateTime dateTime27 = localTime25.toDateTime(readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int33 = dateTimeZone31.getOffset((long) (byte) 1);
        long long35 = dateTimeZone29.getMillisKeepLocal(dateTimeZone31, (long) 3);
        org.joda.time.DateTime dateTime36 = dateTime27.withZone(dateTimeZone29);
        org.joda.time.DateTime dateTime38 = dateTime27.minus((long) '#');
        org.joda.time.DateTime.Property property39 = dateTime27.weekyear();
        org.joda.time.DateTime dateTime41 = dateTime27.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime42 = dateTime27.toDateTime();
        org.joda.time.DateTime dateTime44 = dateTime27.withSecondOfMinute(0);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int49 = dateTimeZone47.getOffset((long) (byte) 1);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(0L, dateTimeZone47);
        java.util.TimeZone timeZone51 = dateTimeZone47.toTimeZone();
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str54 = locale53.getCountry();
        java.lang.String str55 = dateTimeZone47.getShortName(0L, locale53);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localTime58.toDateTime(readableInstant59);
        org.joda.time.LocalTime localTime61 = dateTime60.toLocalTime();
        org.joda.time.DateTime.Property property62 = dateTime60.minuteOfHour();
        java.lang.String str63 = property62.toString();
        org.joda.time.DateTime dateTime64 = property62.roundFloorCopy();
        org.joda.time.DateTime dateTime66 = property62.addToCopy((long) 366);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.DateTime dateTime71 = localTime69.toDateTime(readableInstant70);
        org.joda.time.DateTime dateTime73 = dateTime71.plusYears(7);
        org.joda.time.DateTime dateTime75 = dateTime71.plusWeeks((int) (short) 10);
        int int76 = property62.getDifference((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.ReadableDuration readableDuration77 = null;
        org.joda.time.Interval interval78 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime75, readableDuration77);
        int int79 = dateTimeZone47.getOffset((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.Interval interval80 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime75);
        boolean boolean81 = instant22.isBefore((org.joda.time.ReadableInstant) dateTime44);
        java.lang.String str82 = instant22.toString();
        int int83 = dateTime21.compareTo((org.joda.time.ReadableInstant) instant22);
        org.joda.time.DateTime dateTime84 = instant22.toDateTimeISO();
        org.joda.time.DateTime.Property property85 = dateTime84.dayOfWeek();
        org.joda.time.DateTime.Property property86 = dateTime84.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime88 = property86.setCopy("53704654");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53704654 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 3L + "'", long35 == 3L);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "CN" + "'", str54, "CN");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.010" + "'", str55, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Property[minuteOfHour]" + "'", str63, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-100800) + "'", int76 == (-100800));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10 + "'", int79 == 10);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "2022-02-21T14:57:32.115Z" + "'", str82, "2022-02-21T14:57:32.115Z");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(property86);
    }

    @Test
    public void test13691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13691");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(1);
        boolean boolean6 = dateTimeFormatter5.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTime(readableInstant14);
        org.joda.time.Chronology chronology16 = localTime13.getChronology();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (byte) 1, chronology16);
        boolean boolean18 = dateTimeFieldType9.isSupported(chronology16);
        org.joda.time.DateTimeField dateTimeField19 = chronology16.centuryOfEra();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(chronology16);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(chronology16);
        org.joda.time.DateTimeField dateTimeField22 = chronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter8.withChronology(chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.Chronology chronology27 = dateTimeFormatter26.getChronolgy();
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str29 = locale28.getVariant();
        java.lang.String str30 = locale28.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter26.withLocale(locale28);
        org.joda.time.format.DateTimePrinter dateTimePrinter32 = dateTimeFormatter26.getPrinter();
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNull(chronology27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "China" + "'", str30, "China");
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNull(dateTimePrinter32);
    }

    @Test
    public void test13692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13692");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.LocalTime localTime6 = dateTime5.toLocalTime();
        org.joda.time.DateTime.Property property7 = dateTime5.minuteOfHour();
        int int8 = property7.get();
        org.joda.time.Interval interval9 = property7.toInterval();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localTime12.toDateTime(readableInstant13);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localTime17.toDateTime(readableInstant18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime17.plus(readablePeriod20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean23 = localTime21.isSupported(dateTimeFieldType22);
        org.joda.time.DateTime dateTime24 = dateTime14.withFields((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int30 = dateTimeZone28.getOffset((long) (byte) 1);
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone28, (long) 3);
        long long35 = dateTimeZone26.convertLocalToUTC((long) 9, false);
        java.lang.String str36 = dateTimeZone26.toString();
        org.joda.time.DateTime dateTime37 = localTime21.toDateTimeToday(dateTimeZone26);
        long long38 = dateTime37.getMillis();
        boolean boolean39 = interval9.equals((java.lang.Object) long38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localTime44.toDateTime(readableInstant45);
        org.joda.time.Chronology chronology47 = localTime44.getChronology();
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((long) (byte) 1, chronology47);
        boolean boolean49 = dateTimeFieldType40.isSupported(chronology47);
        org.joda.time.DateTimeField dateTimeField50 = chronology47.centuryOfEra();
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.now(chronology47);
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(chronology47);
        org.joda.time.LocalTime localTime53 = org.joda.time.LocalTime.now(chronology47);
        org.joda.time.Interval interval54 = interval9.withChronology(chronology47);
        org.joda.time.DateTimeField dateTimeField55 = chronology47.secondOfMinute();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((java.lang.Object) 48698L, chronology47);
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.DateTime dateTime61 = localTime59.toDateTime(readableInstant60);
        org.joda.time.LocalTime localTime62 = dateTime61.toLocalTime();
        int int63 = dateTime61.getMonthOfYear();
        int int64 = dateTime61.getHourOfDay();
        org.joda.time.DateTime.Property property65 = dateTime61.dayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = null;
        java.lang.String str67 = dateTime61.toString(dateTimeFormatter66);
        org.joda.time.DateTime dateTime69 = dateTime61.plusMinutes(17);
        org.joda.time.DateTime dateTime71 = dateTime69.withHourOfDay((int) (short) 10);
        boolean boolean72 = dateTime56.equals((java.lang.Object) dateTime71);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime.Property property74 = dateTime71.property(dateTimeFieldType73);
        org.joda.time.DurationFieldType durationFieldType75 = dateTimeFieldType73.getRangeDurationType();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3L + "'", long32 == 3L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.010" + "'", str36, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1645402199990L + "'", long38 == 1645402199990L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010" + "'", str67, "2022-02-21T00:10:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(durationFieldType75);
    }

    @Test
    public void test13693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13693");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        int int6 = dateTime4.getMonthOfYear();
        int int7 = dateTime4.getHourOfDay();
        org.joda.time.DateTime.Property property8 = dateTime4.dayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = dateTime4.toString(dateTimeFormatter9);
        org.joda.time.DateTime dateTime12 = dateTime4.plusMinutes(17);
        org.joda.time.DateTime dateTime14 = dateTime4.plusMillis((int) 'u');
        org.joda.time.DateTime.Property property15 = dateTime4.minuteOfDay();
        org.joda.time.DateMidnight dateMidnight16 = dateTime4.toDateMidnight();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-21T00:10:00.000+00:00:00.010" + "'", str10, "2022-02-21T00:10:00.000+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
    }

    @Test
    public void test13694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13694");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.DateTime.Property property6 = dateTime4.minuteOfHour();
        int int7 = property6.get();
        org.joda.time.Interval interval8 = property6.toInterval();
        org.joda.time.Interval interval9 = interval8.toInterval();
        long long10 = interval8.toDurationMillis();
        org.joda.time.Interval interval12 = interval8.withStartMillis(10L);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localTime16.toDateTime(readableInstant17);
        org.joda.time.Chronology chronology19 = localTime16.getChronology();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (byte) 1, chronology19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology19);
        org.joda.time.Interval interval22 = interval8.withChronology(chronology19);
        boolean boolean24 = interval8.isAfter((long) 3);
        org.joda.time.Interval interval25 = interval8.toInterval();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localTime28.toDateTime(readableInstant29);
        org.joda.time.LocalTime localTime31 = dateTime30.toLocalTime();
        org.joda.time.DateTime.Property property32 = dateTime30.minuteOfHour();
        int int33 = property32.get();
        org.joda.time.Interval interval34 = property32.toInterval();
        org.joda.time.Interval interval35 = interval34.toInterval();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localTime38.toDateTime(readableInstant39);
        org.joda.time.LocalTime localTime41 = dateTime40.toLocalTime();
        org.joda.time.DateTime.Property property42 = dateTime40.minuteOfHour();
        int int43 = property42.getMinimumValue();
        org.joda.time.DateTime dateTime44 = property42.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = dateTimeZone46.isLocalDateTimeGap(localDateTime47);
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = dateTime44.withZoneRetainFields(dateTimeZone46);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((java.lang.Object) dateTime50);
        org.joda.time.Interval interval52 = interval35.withEnd((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Period period53 = interval52.toPeriod();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Interval interval55 = interval52.withDurationAfterStart(readableDuration54);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localTime58.toDateTime(readableInstant59);
        org.joda.time.LocalTime localTime61 = dateTime60.toLocalTime();
        org.joda.time.DateTime.Property property62 = dateTime60.minuteOfHour();
        int int63 = property62.get();
        org.joda.time.Interval interval64 = property62.toInterval();
        org.joda.time.Interval interval65 = interval64.toInterval();
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Period period67 = interval65.toPeriod(periodType66);
        org.joda.time.Interval interval68 = interval52.withPeriodAfterStart((org.joda.time.ReadablePeriod) period67);
        int int69 = period67.size();
        org.joda.time.MutablePeriod mutablePeriod70 = period67.toMutablePeriod();
        org.joda.time.Interval interval71 = interval8.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) mutablePeriod70);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60000L + "'", long10 == 60000L);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 8 + "'", int69 == 8);
        org.junit.Assert.assertNotNull(mutablePeriod70);
        org.junit.Assert.assertNotNull(interval71);
    }

    @Test
    public void test13695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13695");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale4 = new java.util.Locale("", "hi!", "");
        java.lang.String str5 = locale0.getDisplayCountry(locale4);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale0);
        int int8 = calendar6.getActualMinimum((int) (byte) 10);
        java.util.Locale locale9 = java.util.Locale.US;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = locale9.getVariant();
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale15 = new java.util.Locale("100", "United States");
        java.lang.String str16 = locale9.getDisplayCountry(locale15);
        boolean boolean17 = calendar6.after((java.lang.Object) locale15);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals(locale4.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "United States" + "'", str5, "United States");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455452254,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=32,MILLISECOND=254,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale15.toString(), "100_UNITED STATES");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "United States" + "'", str16, "United States");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13696");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("China");
        java.util.Locale locale4 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test13697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13697");
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTime(readableInstant6);
        org.joda.time.Chronology chronology8 = localTime5.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (byte) 1, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.dayOfMonth();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(17L, 1645454862530L, chronology12);
        org.joda.time.Interval interval16 = interval14.withStartMillis((long) 21);
        java.lang.String str17 = interval16.toString();
        org.joda.time.Period period18 = interval16.toPeriod();
        org.joda.time.Period period19 = interval16.toPeriod();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01T00:00:00.021Z/2022-02-21T14:47:42.530Z" + "'", str17, "1970-01-01T00:00:00.021Z/2022-02-21T14:47:42.530Z");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test13698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13698");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTime(readableInstant6);
        int int8 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime11 = property9.addCopy((int) (byte) 100);
        org.joda.time.LocalTime localTime13 = localTime11.plusMillis(13);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        int int15 = localTime13.getSecondOfMinute();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localTime19.toDateTime(readableInstant20);
        org.joda.time.Chronology chronology22 = localTime19.getChronology();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (byte) 1, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.clockhourOfHalfday();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((java.lang.Object) localTime13, chronology22);
        org.joda.time.DateTimeField dateTimeField27 = chronology22.monthOfYear();
        org.joda.time.DateTimeField dateTimeField28 = chronology22.yearOfCentury();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localTime31.toDateTime(readableInstant32);
        org.joda.time.Chronology chronology34 = localTime31.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.weekyears();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localTime39.toDateTime(readableInstant40);
        org.joda.time.Chronology chronology42 = localTime39.getChronology();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (byte) 1, chronology42);
        int[] intArray45 = chronology34.get((org.joda.time.ReadablePartial) localTime43, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField46 = chronology34.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localTime51.toDateTime(readableInstant52);
        org.joda.time.Chronology chronology54 = localTime51.getChronology();
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime((long) (byte) 1, chronology54);
        boolean boolean56 = dateTimeFieldType47.isSupported(chronology54);
        org.joda.time.DateTimeField dateTimeField57 = chronology54.centuryOfEra();
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.DateTime dateTime63 = localTime61.toDateTime(readableInstant62);
        org.joda.time.Chronology chronology64 = localTime61.getChronology();
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime((long) (byte) 1, chronology64);
        int int66 = dateTimeField57.getMaximumValue((org.joda.time.ReadablePartial) localTime65);
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime((long) 1);
        int[] intArray69 = localTime68.getValues();
        int int70 = dateTimeField46.getMaximumValue((org.joda.time.ReadablePartial) localTime65, intArray69);
        org.joda.time.LocalTime.Property property71 = localTime65.millisOfSecond();
        org.joda.time.LocalTime localTime72 = property71.getLocalTime();
        org.joda.time.LocalTime localTime74 = property71.addCopy((long) 86399999);
        org.joda.time.LocalTime localTime75 = property71.roundFloorCopy();
        java.util.Locale locale76 = java.util.Locale.GERMANY;
        java.util.Locale locale80 = new java.util.Locale("", "hi!", "");
        java.lang.String str81 = locale80.getVariant();
        java.lang.String str82 = locale76.getDisplayScript(locale80);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str83 = dateTimeField28.getAsShortText((org.joda.time.ReadablePartial) localTime75, locale80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2922789 + "'", int66 == 2922789);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[0, 0, 0, 11]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 366 + "'", int70 == 366);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale80.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test13699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13699");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.LocalTime localTime6 = dateTime5.toLocalTime();
        org.joda.time.DateTime.Property property7 = dateTime5.minuteOfHour();
        int int8 = property7.get();
        org.joda.time.Interval interval9 = property7.toInterval();
        org.joda.time.Interval interval10 = interval9.toInterval();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTime(readableInstant14);
        org.joda.time.LocalTime localTime16 = dateTime15.toLocalTime();
        org.joda.time.DateTime.Property property17 = dateTime15.minuteOfHour();
        int int18 = property17.getMinimumValue();
        org.joda.time.DateTime dateTime19 = property17.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone21.isLocalDateTimeGap(localDateTime22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = dateTime19.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((java.lang.Object) dateTime25);
        org.joda.time.Interval interval27 = interval10.withEnd((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Period period28 = interval27.toPeriod();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Interval interval30 = interval27.withDurationAfterStart(readableDuration29);
        org.joda.time.Duration duration31 = interval30.toDuration();
        org.joda.time.Period period32 = duration31.toPeriod();
        org.joda.time.Duration duration33 = duration31.toDuration();
        org.joda.time.Instant instant34 = instant0.minus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localTime37.toDateTime(readableInstant38);
        org.joda.time.LocalTime localTime40 = dateTime39.toLocalTime();
        org.joda.time.DateTime.Property property41 = dateTime39.minuteOfHour();
        int int42 = property41.get();
        org.joda.time.Interval interval43 = property41.toInterval();
        org.joda.time.DateTime dateTime44 = interval43.getEnd();
        org.joda.time.Period period45 = interval43.toPeriod();
        org.joda.time.Interval interval46 = interval43.toInterval();
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.DateTime dateTime51 = localTime49.toDateTime(readableInstant50);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int57 = dateTimeZone55.getOffset((long) (byte) 1);
        long long59 = dateTimeZone53.getMillisKeepLocal(dateTimeZone55, (long) 3);
        org.joda.time.DateTime dateTime60 = dateTime51.withZone(dateTimeZone53);
        org.joda.time.DateTime dateTime62 = dateTime51.minus((long) '#');
        org.joda.time.DateTime dateTime64 = dateTime51.minusMinutes(100);
        long long65 = dateTime51.getMillis();
        boolean boolean66 = interval43.isBefore((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime.Property property67 = dateTime51.yearOfCentury();
        org.joda.time.DateTime dateTime69 = dateTime51.withMillisOfSecond(12);
        org.joda.time.DateTime dateTime71 = dateTime51.minusMinutes(3720000);
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.DateTime dateTime76 = localTime74.toDateTime(readableInstant75);
        org.joda.time.LocalTime localTime77 = dateTime76.toLocalTime();
        org.joda.time.DateTime.Property property78 = dateTime76.minuteOfHour();
        int int79 = property78.get();
        org.joda.time.Interval interval80 = property78.toInterval();
        org.joda.time.LocalTime localTime83 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.DateTime dateTime85 = localTime83.toDateTime(readableInstant84);
        org.joda.time.LocalTime localTime86 = dateTime85.toLocalTime();
        org.joda.time.DateTime.Property property87 = dateTime85.minuteOfHour();
        int int88 = property87.getMinimumValue();
        org.joda.time.DateTime dateTime89 = property87.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property90 = dateTime89.dayOfYear();
        boolean boolean91 = interval80.contains((org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.Duration duration92 = interval80.toDuration();
        org.joda.time.Period period93 = duration92.toPeriod();
        org.joda.time.DateTime dateTime94 = dateTime71.minus((org.joda.time.ReadableDuration) duration92);
        org.joda.time.Instant instant96 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration92, 32769);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 3L + "'", long59 == 3L);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1645402199990L + "'", long65 == 1645402199990L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10 + "'", int79 == 10);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(localTime86);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(duration92);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNotNull(instant96);
    }

    @Test
    public void test13700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13700");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.weekyears();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTime(readableInstant11);
        org.joda.time.Chronology chronology13 = localTime10.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 1, chronology13);
        int[] intArray16 = chronology5.get((org.joda.time.ReadablePartial) localTime14, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = chronology5.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localTime22.toDateTime(readableInstant23);
        org.joda.time.Chronology chronology25 = localTime22.getChronology();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (byte) 1, chronology25);
        boolean boolean27 = dateTimeFieldType18.isSupported(chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localTime32.toDateTime(readableInstant33);
        org.joda.time.Chronology chronology35 = localTime32.getChronology();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (byte) 1, chronology35);
        int int37 = dateTimeField28.getMaximumValue((org.joda.time.ReadablePartial) localTime36);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) 1);
        int[] intArray40 = localTime39.getValues();
        int int41 = dateTimeField17.getMaximumValue((org.joda.time.ReadablePartial) localTime36, intArray40);
        org.joda.time.LocalTime.Property property42 = localTime36.millisOfSecond();
        org.joda.time.LocalTime localTime43 = property42.getLocalTime();
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localTime46.toDateTime(readableInstant47);
        org.joda.time.LocalTime localTime49 = dateTime48.toLocalTime();
        org.joda.time.DateTime.Property property50 = dateTime48.minuteOfHour();
        org.joda.time.DateTime dateTime52 = dateTime48.plusWeeks(0);
        int int53 = dateTime52.getYearOfEra();
        org.joda.time.DateTime.Property property54 = dateTime52.year();
        int int55 = dateTime52.getYearOfCentury();
        int int56 = property42.compareTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.LocalTime localTime57 = property42.withMaximumValue();
        java.lang.String str58 = property42.getAsShortText();
        org.joda.time.LocalTime localTime59 = property42.roundHalfEvenCopy();
        java.lang.String str60 = property42.toString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2922789 + "'", int37 == 2922789);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 0, 11]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 366 + "'", int41 == 366);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2022 + "'", int53 == 2022);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 22 + "'", int55 == 22);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1" + "'", str58, "1");
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Property[millisOfSecond]" + "'", str60, "Property[millisOfSecond]");
    }

    @Test
    public void test13701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13701");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localTime3.toDateTime(readableInstant4);
        org.joda.time.LocalTime localTime6 = dateTime5.toLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.minusMillis((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        boolean boolean10 = localTime6.isSupported(durationFieldType9);
        java.lang.String str11 = durationFieldType9.toString();
        java.lang.String str12 = durationFieldType9.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone15.isLocalDateTimeGap(localDateTime16);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 0, dateTimeZone15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = localTime18.toString(dateTimeFormatter19);
        org.joda.time.Chronology chronology21 = localTime18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology21.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology21.getZone();
        boolean boolean24 = durationFieldType9.isSupported(chronology21);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localTime27.toDateTime(readableInstant28);
        org.joda.time.LocalTime localTime30 = dateTime29.toLocalTime();
        org.joda.time.DateTime.Property property31 = dateTime29.minuteOfHour();
        org.joda.time.DateTime dateTime33 = dateTime29.plusWeeks(0);
        org.joda.time.Chronology chronology34 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.secondOfDay();
        int int36 = dateTimeField35.getMaximumValue();
        long long38 = dateTimeField35.roundHalfFloor((long) 23);
        int int39 = dateTimeField35.getMaximumValue();
        java.util.Date date41 = new java.util.Date((long) (byte) 100);
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.fromDateFields(date41);
        int int43 = dateTimeField35.getMinimumValue((org.joda.time.ReadablePartial) localTime42);
        int[] intArray45 = chronology21.get((org.joda.time.ReadablePartial) localTime42, 5471113658425200000L);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((long) 20, chronology21);
        org.joda.time.DateTimeField dateTimeField47 = chronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField48 = chronology21.millisOfDay();
        org.joda.time.DurationField durationField49 = chronology21.minutes();
        org.joda.time.DurationField durationField50 = chronology21.minutes();
        org.joda.time.DateTimeField dateTimeField51 = chronology21.centuryOfEra();
        org.joda.time.DurationField durationField52 = chronology21.days();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "years" + "'", str11, "years");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "years" + "'", str12, "years");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00:00:00.010" + "'", str20, "00:00:00.010");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 86399 + "'", int36 == 86399);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-10L) + "'", long38 == (-10L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 86399 + "'", int39 == 86399);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[7, 0, 0, 0]");
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
    }
}
