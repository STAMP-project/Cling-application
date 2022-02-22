import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        int int8 = localDateTime7.getMillisOfSecond();
        int int9 = localDateTime7.getMillisOfSecond();
        org.joda.time.Chronology chronology10 = localDateTime7.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 337 + "'", int8 == 337);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 337 + "'", int9 == 337);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DurationField durationField7 = copticChronology1.weeks();
        org.joda.time.DurationField durationField8 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.clockhourOfHalfday();
        java.lang.String str11 = copticChronology1.toString();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CopticChronology[UTC]" + "'", str11, "CopticChronology[UTC]");
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology10);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology10.millisOfDay();
        org.joda.time.DurationField durationField17 = copticChronology10.days();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology10.millisOfDay();
        org.joda.time.DurationField durationField21 = copticChronology10.months();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology10.dayOfWeek();
        boolean boolean24 = localDateTime1.equals((java.lang.Object) copticChronology10);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology10.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology28.hourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology28.centuryOfEra();
        org.joda.time.DurationField durationField31 = copticChronology28.millis();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology28.weekOfWeekyear();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withMillisOfSecond((int) (byte) 1);
        int int47 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.LocalDateTime.Property property48 = localDateTime42.weekyear();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime42.minusMillis(2022);
        int[] intArray52 = copticChronology28.get((org.joda.time.ReadablePartial) localDateTime42, (long) '#');
        org.joda.time.LocalDateTime.Property property53 = localDateTime42.millisOfDay();
        int int54 = property53.get();
        org.joda.time.LocalDateTime localDateTime55 = property53.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = localDateTime55.toDateTime(dateTimeZone56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.minusYears(53860228);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.withYearOfEra(504);
        int[] intArray63 = copticChronology10.get((org.joda.time.ReadablePartial) localDateTime59, 951145188769L);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(copticChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1686, 4, 23, 35]");
        org.junit.Assert.assertNotNull(property53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 54211360 + "'", int54 == 54211360);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1716, 6, 13, 53988769]");
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = property8.setCopy((-292275054));
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withCenturyOfEra(341);
        int int16 = localDateTime12.getYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.plusMillis(671);
        int int19 = localDateTime12.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 292275055 + "'", int13 == 292275055);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-292275054) + "'", int16 == (-292275054));
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2922750 + "'", int19 == 2922750);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        java.util.Locale locale7 = null;
        java.lang.String str8 = localDateTime5.toString("0", locale7);
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(chronology9);
        int int11 = localDateTime10.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusWeeks(51015001);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology1.hours();
        org.joda.time.DurationField durationField10 = copticChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.secondOfDay();
        org.joda.time.DurationField durationField12 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField13 = copticChronology1.weeks();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField8 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.minuteOfHour();
        org.joda.time.DurationField durationField10 = copticChronology1.minutes();
        org.joda.time.DurationField durationField11 = copticChronology1.months();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        long long3 = dateTimeZone1.previousTransition(4287246751L);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology5.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.dayOfWeek();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDateTime10.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology18.secondOfDay();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology18);
        int int23 = localDateTime22.getDayOfYear();
        boolean boolean24 = localDateTime15.isEqual((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.hourOfDay();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology26.centuryOfEra();
        org.joda.time.DurationField durationField29 = copticChronology26.millis();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology26.weekOfWeekyear();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.withMillisOfSecond((int) (byte) 1);
        int int45 = localDateTime32.compareTo((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime.Property property46 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime40.minusMillis(2022);
        int[] intArray50 = copticChronology26.get((org.joda.time.ReadablePartial) localDateTime40, (long) '#');
        int int51 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localDateTime22, intArray50);
        int int52 = localDateTime22.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime22.withWeekyear((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusMinutes(31);
        org.joda.time.LocalDateTime.Property property57 = localDateTime54.secondOfMinute();
        boolean boolean58 = dateTimeZone1.equals((java.lang.Object) localDateTime54);
        org.joda.time.LocalDateTime.Property property59 = localDateTime54.era();
        org.joda.time.DateTimeField dateTimeField61 = localDateTime54.getField(0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4287246751L + "'", long3 == 4287246751L);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(copticChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 113 + "'", int23 == 113);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(copticChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1686, 4, 23, 35]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTimeField61);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.yearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology1.halfdays();
        org.joda.time.Chronology chronology8 = copticChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.weekOfWeekyear();
        boolean boolean10 = dateTimeField9.isLenient();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.clockhourOfDay();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str11 = dateTimeField8.getAsText((long) 'a', locale10);
        java.lang.String str12 = dateTimeField4.getAsText((int) 'a', locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.clockhourOfDay();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = dateTimeField20.getAsText((long) 'a', locale22);
        int int24 = dateTimeField17.getMaximumTextLength(locale22);
        java.lang.String str25 = locale10.getDisplayCountry(locale22);
        java.util.Locale.Builder builder26 = builder0.setLocale(locale22);
        java.util.Locale.Builder builder28 = builder0.setRegion("");
        java.util.Locale.Builder builder30 = builder0.removeUnicodeLocaleAttribute("lun");
        java.util.Locale.Builder builder31 = builder30.clearExtensions();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology33.dayOfMonth();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.plusWeeks((int) (byte) 10);
        java.util.Locale locale43 = java.util.Locale.PRC;
        java.lang.String str44 = dateTimeField34.getAsText((org.joda.time.ReadablePartial) localDateTime42, locale43);
        java.util.Set<java.lang.String> strSet45 = locale43.getUnicodeLocaleKeys();
        java.lang.String str46 = locale43.getScript();
        java.util.Locale.Builder builder47 = builder30.setLocale(locale43);
        java.util.Locale.Builder builder48 = builder47.clear();
        java.util.Locale.Builder builder49 = builder47.clear();
        java.util.Locale.Builder builder50 = builder49.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder52 = builder50.setVariant("2022-02-14T14:57:34.767");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 2022-02-14T14:57:34.767 [at index 5]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "24" + "'", str11, "24");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97" + "'", str12, "97");
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "24" + "'", str23, "24");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(copticChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2" + "'", str44, "2");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology1.halfdays();
        org.joda.time.DurationField durationField8 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        long long15 = dateTimeField13.roundCeiling(4287570162L);
        long long17 = dateTimeField13.roundHalfFloor(4287800080L);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4287600000L + "'", long15 == 4287600000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4287600000L + "'", long17 == 4287600000L);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology1.halfdays();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = dateTimeField8.getLeapDurationField();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNull(durationField9);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DurationField durationField5 = copticChronology1.months();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        java.lang.String str8 = dateTimeZone6.getName((long) 53);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusWeeks((int) (byte) 10);
        int int17 = localDateTime16.getMillisOfSecond();
        int int18 = localDateTime16.getMillisOfSecond();
        java.lang.String str20 = localDateTime16.toString("+100:00");
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withWeekyear(792);
        int int23 = localDateTime16.getMonthOfYear();
        int int24 = localDateTime16.getDayOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        int int39 = localDateTime26.compareTo((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime.Property property40 = localDateTime34.weekyear();
        org.joda.time.LocalDateTime.Property property41 = localDateTime34.millisOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime34.minusYears(999);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.minusMinutes(51046001);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = copticChronology49.hourOfDay();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology49.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.Chronology chronology53 = copticChronology49.withZone(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField54 = copticChronology49.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField55 = copticChronology49.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = dateTimeField55.getType();
        org.joda.time.LocalDateTime.Property property57 = localDateTime43.property(dateTimeFieldType56);
        int int58 = localDateTime16.get(dateTimeFieldType56);
        boolean boolean59 = dateTimeZone6.isLocalDateTimeGap(localDateTime16);
        boolean boolean61 = dateTimeZone6.isStandardOffset(0L);
        java.util.TimeZone timeZone62 = dateTimeZone6.toTimeZone();
        java.time.ZoneId zoneId63 = timeZone62.toZoneId();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 543 + "'", int17 == 543);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 543 + "'", int18 == 543);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+100:00" + "'", str20, "+100:00");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 122 + "'", int24 == 122);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(copticChronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(property57);
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(timeZone62);
// flaky:         org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId63);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = copticChronology1.hours();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology2.weekyears();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(4287399979L, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology2.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.minusDays(0);
        int int12 = localDateTime11.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYear(53666438);
        java.util.Date date15 = localDateTime14.toDate();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromDateFields(date15);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromDateFields(date15);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.fromDateFields(date15);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.fromDateFields(date15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withMillisOfSecond((int) (byte) 1);
        int int34 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime.Property property35 = localDateTime29.weekyear();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime29.minusMillis(2022);
        int int38 = localDateTime37.getMillisOfSecond();
        int int39 = localDateTime37.getMonthOfYear();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(chronology40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.weekyear();
        org.joda.time.LocalDateTime localDateTime50 = property48.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime51 = property48.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusSeconds(522);
        boolean boolean54 = localDateTime37.equals((java.lang.Object) localDateTime53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.plusMillis(53625125);
        org.joda.time.LocalDateTime.Property property57 = localDateTime53.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.chrono.CopticChronology copticChronology59 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology59.clockhourOfDay();
        org.joda.time.DurationField durationField61 = copticChronology59.weekyears();
        long long64 = durationField61.subtract((long) (byte) 1, 1);
        java.lang.String str65 = durationField61.toString();
        long long66 = durationField61.getUnitMillis();
        int int69 = durationField61.getValue((long) 22, (long) 479);
        org.joda.time.DurationFieldType durationFieldType70 = durationField61.getType();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime53.withFieldAdded(durationFieldType70, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime19.withFieldAdded(durationFieldType70, 494);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Sun Feb 21 15:03:31 GMT 53666438");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 575 + "'", int38 == 575);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(copticChronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-31449599999L) + "'", long64 == (-31449599999L));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "DurationField[weekyears]" + "'", str65, "DurationField[weekyears]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 31557600000L + "'", long66 == 31557600000L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(localDateTime74);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone10);
        org.joda.time.Chronology chronology12 = copticChronology1.withZone(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone10);
        java.lang.String str14 = localDateTime13.toString();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = property15.withMinimumValue();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology12);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-02-25T19:03:31.681" + "'", str14, "2022-02-25T19:03:31.681");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField10 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField6 = copticChronology2.hours();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology2.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(49L, dateTimeZone7);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        int int11 = localDateTime9.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusYears((-292269338));
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = property14.addWrapFieldToCopy(53738468);
        org.joda.time.LocalDateTime localDateTime17 = property14.withMaximumValue();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.year();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.DateTime dateTime28 = localDateTime26.toDateTime(readableInstant27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusMonths(999);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localDateTime39.toDateTime(readableInstant40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.plusWeeks((int) (byte) 10);
        int int50 = localDateTime49.getMillisOfSecond();
        int int51 = localDateTime49.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType54 = null;
        boolean boolean55 = localDateTime49.isSupported(durationFieldType54);
        org.joda.time.DateTime dateTime56 = localDateTime49.toDateTime();
        boolean boolean57 = dateTime41.isAfter((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime56.getZone();
        org.joda.time.DateTime dateTime59 = localDateTime26.toDateTime((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Instant instant60 = dateTime56.toInstant();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.chrono.CopticChronology copticChronology62 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone61);
        org.joda.time.DateTimeField dateTimeField63 = copticChronology62.clockhourOfDay();
        org.joda.time.DurationField durationField64 = copticChronology62.weekyears();
        org.joda.time.DateTimeField dateTimeField65 = copticChronology62.clockhourOfDay();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(chronology66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusWeeks((int) (byte) -1);
        java.util.Locale locale71 = java.util.Locale.GERMANY;
        java.lang.String str72 = locale71.getScript();
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.chrono.CopticChronology copticChronology74 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField75 = copticChronology74.clockhourOfDay();
        java.util.Locale locale77 = java.util.Locale.ITALIAN;
        java.lang.String str78 = dateTimeField75.getAsText((long) 'a', locale77);
        java.lang.String str79 = locale71.getDisplayName(locale77);
        java.lang.String str80 = dateTimeField65.getAsShortText((org.joda.time.ReadablePartial) localDateTime69, (int) ' ', locale77);
        org.joda.time.LocalDateTime.Property property81 = localDateTime69.year();
        java.lang.String str82 = property81.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = property81.getFieldType();
        boolean boolean84 = dateTime56.isSupported(dateTimeFieldType83);
        org.joda.time.Instant instant85 = dateTime56.toInstant();
        org.joda.time.Instant instant86 = dateTime56.toInstant();
        int int87 = property18.compareTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.LocalDateTime localDateTime88 = property18.withMinimumValue();
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 702 + "'", int50 == 702);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 702 + "'", int51 == 702);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(instant60);
        org.junit.Assert.assertNotNull(copticChronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(copticChronology74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "it");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "24" + "'", str78, "24");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "tedesco (Germania)" + "'", str79, "tedesco (Germania)");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "32" + "'", str80, "32");
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "year" + "'", str82, "year");
        org.junit.Assert.assertNotNull(dateTimeFieldType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(instant85);
        org.junit.Assert.assertNotNull(instant86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(localDateTime88);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) 1);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField6 = copticChronology5.months();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology1.getZone();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusWeeks((int) (byte) 10);
        int int18 = localDateTime17.getMillisOfSecond();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = localDateTime17.isSupported(durationFieldType22);
        int[] intArray25 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime17, (long) 761);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone27 = copticChronology1.getZone();
        java.lang.String str28 = dateTimeZone27.toString();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 767 + "'", int18 == 767);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 767 + "'", int19 == 767);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1686, 4, 23, 761]");
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField6 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology10);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology10.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology10.getZone();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        boolean boolean22 = copticChronology1.equals((java.lang.Object) localDateTime21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYear(342);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        long long11 = property8.remainder();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime(readableInstant20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.millisOfDay();
        int int23 = property8.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        boolean boolean25 = property8.equals((java.lang.Object) 126L);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.clockhourOfDay();
        org.joda.time.DurationField durationField29 = copticChronology27.weekyears();
        org.joda.time.DurationField durationField30 = copticChronology27.hours();
        boolean boolean31 = property8.equals((java.lang.Object) copticChronology27);
        org.joda.time.DurationField durationField32 = copticChronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology27.clockhourOfDay();
        org.joda.time.DurationField durationField34 = copticChronology27.minutes();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology27.clockhourOfHalfday();
        long long37 = dateTimeField35.roundHalfEven(618451199367L);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4287811800L + "'", long11 == 4287811800L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(copticChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 618451200000L + "'", long37 == 618451200000L);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology1.minutes();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = copticChronology1.get(readablePeriod14, 10598050564599L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField11 = property8.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime12 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withSecondOfMinute((int) (byte) 1);
        int int15 = localDateTime14.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.secondOfDay();
        java.lang.String str9 = copticChronology1.toString();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.dayOfMonth();
        int int15 = dateTimeField12.getDifference(10596841189368L, (long) 225);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CopticChronology[UTC]" + "'", str9, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122648 + "'", int15 == 122648);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.time.ZoneId zoneId2 = timeZone0.toZoneId();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GMT" + "'", str1, "GMT");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 0);
        int int2 = localDateTime1.getCenturyOfEra();
        int int3 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds(2922728);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekyear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.minusDays(0);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.weekyear();
        org.joda.time.LocalDateTime localDateTime34 = property32.setCopy((int) (byte) 1);
        long long35 = property32.remainder();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.DateTime dateTime45 = localDateTime43.toDateTime(readableInstant44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime43.millisOfDay();
        int int47 = property32.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        boolean boolean49 = property32.equals((java.lang.Object) 126L);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property32.getFieldType();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime23.withField(dateTimeFieldType50, 649);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime23.withDayOfMonth(7);
        long long56 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime54, 4287227101L);
        org.joda.time.DateTimeField dateTimeField57 = copticChronology1.millisOfDay();
        org.joda.time.DurationField durationField58 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField59 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField60 = copticChronology1.seconds();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 4287811897L + "'", long35 == 4287811897L);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
// flaky:         org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10596841411001L + "'", long56 == 10596841411001L);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(durationField60);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.dayOfMonth();
        org.joda.time.Chronology chronology4 = copticChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology1.getZone();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology1.seconds();
        org.joda.time.DurationField durationField4 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = copticChronology1.months();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.era();
        int int10 = dateTimeField9.getMinimumValue();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusWeeks((int) (byte) 10);
        int int18 = localDateTime17.getMillisOfSecond();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = localDateTime17.isSupported(durationFieldType22);
        org.joda.time.DateTime dateTime24 = localDateTime17.toDateTime();
        boolean boolean25 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime24);
        long long26 = dateTime9.getMillis();
        java.lang.String str27 = dateTime9.toString();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        int int42 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime.Property property43 = localDateTime37.weekyear();
        org.joda.time.LocalDateTime.Property property44 = localDateTime37.millisOfDay();
        org.joda.time.LocalDateTime localDateTime45 = property44.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime46 = property44.roundHalfFloorCopy();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plus(readableDuration47);
        int int49 = localDateTime46.getYear();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.chrono.CopticChronology copticChronology51 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField52 = copticChronology51.hourOfDay();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology51.secondOfDay();
        org.joda.time.DurationField durationField54 = copticChronology51.weekyears();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) 26, dateTimeZone56);
        long long59 = dateTimeZone56.convertUTCToLocal(4287269054L);
        org.joda.time.Chronology chronology60 = copticChronology51.withZone(dateTimeZone56);
        org.joda.time.DateTime dateTime61 = localDateTime46.toDateTime(dateTimeZone56);
        boolean boolean62 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime61);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 965 + "'", int18 == 965);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 965 + "'", int19 == 965);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 951145411965L + "'", long26 == 951145411965L);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2000-02-21T15:03:31.965Z" + "'", str27, "2000-02-21T15:03:31.965Z");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2022 + "'", int49 == 2022);
        org.junit.Assert.assertNotNull(copticChronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 4287269054L + "'", long59 == 4287269054L);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.centuryOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime(readableInstant14);
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        boolean boolean17 = locale16.hasExtensions();
        boolean boolean18 = dateTime15.equals((java.lang.Object) locale16);
        int int19 = property5.getDifference((org.joda.time.ReadableInstant) dateTime15);
        long long20 = property5.remainder();
        org.joda.time.LocalDateTime localDateTime21 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withWeekOfWeekyear(52);
        int int24 = localDateTime21.getMillisOfDay();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1510908987997L) + "'", long20 == (-1510908987997L));
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = copticChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology2.days();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(4287241809L, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology2.clockhourOfDay();
        java.lang.Object obj13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.clockhourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology15.weekyears();
        org.joda.time.DurationField durationField18 = copticChronology15.centuries();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology15.weekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology15.getZone();
        java.lang.String str22 = dateTimeZone20.getName((long) 53);
        java.lang.String str24 = dateTimeZone20.getShortName((-3600001L));
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(obj13, dateTimeZone20);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20);
        org.joda.time.Chronology chronology27 = copticChronology2.withZone(dateTimeZone20);
        java.util.TimeZone timeZone28 = dateTimeZone20.toTimeZone();
        java.util.TimeZone timeZone30 = java.util.TimeZone.getTimeZone("DurationField[weekyears]");
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        boolean boolean32 = timeZone28.hasSameRules(timeZone30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.weekyear();
        org.joda.time.LocalDateTime localDateTime44 = property42.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime45 = property42.roundFloorCopy();
        org.joda.time.Interval interval46 = property42.toInterval();
        org.joda.time.LocalDateTime localDateTime47 = property42.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusHours(807);
        boolean boolean50 = dateTimeZone33.isLocalDateTimeGap(localDateTime49);
        long long53 = dateTimeZone33.convertLocalToUTC((long) 663598013, true);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(copticChronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 663598013L + "'", long53 == 663598013L);
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        java.lang.String str4 = copticChronology1.toString();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekyear();
        org.joda.time.LocalDateTime localDateTime15 = property13.setCopy((int) (byte) 1);
        long long16 = property13.remainder();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime(readableInstant25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.millisOfDay();
        int int28 = property13.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        boolean boolean30 = property13.equals((java.lang.Object) 126L);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property13.getFieldType();
        org.joda.time.LocalDateTime localDateTime33 = property13.addToCopy((-292275054));
        int int34 = property13.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime36 = property13.setCopy(0);
        org.joda.time.LocalDateTime localDateTime37 = property13.roundHalfCeilingCopy();
        long long39 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime37, (long) 585724);
        org.joda.time.DateTimeField dateTimeField40 = copticChronology1.era();
        java.lang.String str42 = dateTimeField40.getAsText(644L);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = dateTimeField40.roundHalfEven((long) 849);
            org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException; message: The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[UTC]" + "'", str4, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 4287812042L + "'", long16 == 4287812042L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-292275054) + "'", int34 == (-292275054));
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 9899625600000L + "'", long39 == 9899625600000L);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AM" + "'", str42, "AM");
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekyear();
        int int6 = dateTimeField5.getMinimumValue();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        int int21 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property22 = localDateTime16.weekyear();
        org.joda.time.LocalDateTime.Property property23 = localDateTime16.millisOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        boolean boolean35 = locale34.hasExtensions();
        boolean boolean36 = dateTime33.equals((java.lang.Object) locale34);
        java.lang.String str37 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDateTime16, locale34);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime16.minus(readableDuration38);
        int int40 = localDateTime16.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime16.plus(readablePeriod41);
        int int43 = localDateTime42.getHourOfDay();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-292269338) + "'", int6 == (-292269338));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2022" + "'", str37, "2022");
        org.junit.Assert.assertNotNull(localDateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 15 + "'", int43 == 15);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology1.minutes();
        int int11 = durationField8.getDifference(951145122566L, (-4275855021975L));
        long long14 = durationField8.getValueAsLong(4287699120L, 951145003106L);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 87116669 + "'", int11 == 87116669);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 71461L + "'", long14 == 71461L);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.monthOfYear();
        java.lang.String str11 = copticChronology1.toString();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = copticChronology1.getDateTimeMillis(4287574895L, 0, 235, 956, 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 235 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CopticChronology[UTC]" + "'", str11, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField3 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology1.add(readablePeriod9, 1L, 16);
        org.joda.time.DurationField durationField13 = copticChronology1.days();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("86");
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMillis(44222);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.year();
        org.joda.time.DurationField durationField9 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = dateTimeField12.getType();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology4.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology4.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology9.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.weekOfWeekyear();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekOfWeekyear();
        int int18 = localDateTime16.getYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.dayOfMonth();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plusWeeks((int) (byte) 10);
        java.util.Locale locale30 = java.util.Locale.PRC;
        java.lang.String str31 = dateTimeField21.getAsText((org.joda.time.ReadablePartial) localDateTime29, locale30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale39 = java.util.Locale.JAPAN;
        java.lang.String str40 = dateTimeField21.getAsText((org.joda.time.ReadablePartial) localDateTime33, 2022, locale39);
        java.lang.String str41 = dateTimeField12.getAsShortText((org.joda.time.ReadablePartial) localDateTime16, locale39);
        int int42 = dateTimeField7.getMaximumTextLength(locale39);
        java.lang.String str43 = locale39.getLanguage();
        java.util.Locale locale44 = locale39.stripExtensions();
        java.util.Locale.setDefault(category0, locale39);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(copticChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2" + "'", str31, "2");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2022" + "'", str40, "2022");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "7" + "'", str41, "7");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ja" + "'", str43, "ja");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ja_JP");
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMinuteOfHour(10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plusYears((int) (short) 1);
        int int21 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime9.minusHours(51004001);
        org.joda.time.LocalDateTime.Property property24 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime9.minusMinutes(407);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime9.withDurationAdded(readableDuration27, 292269339);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(567L);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField4 = copticChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.era();
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology3.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology3.getZone();
        org.joda.time.DurationField durationField8 = copticChronology3.centuries();
        org.joda.time.DurationField durationField9 = copticChronology3.weeks();
        java.lang.String str10 = copticChronology3.toString();
        org.joda.time.DurationField durationField11 = copticChronology3.days();
        org.joda.time.DurationField durationField12 = copticChronology3.centuries();
        org.joda.time.DurationField durationField13 = copticChronology3.hours();
        org.joda.time.DurationField durationField14 = copticChronology3.weekyears();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 473, (org.joda.time.Chronology) copticChronology3);
        org.joda.time.DurationField durationField16 = copticChronology3.centuries();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(4287710296L, (org.joda.time.Chronology) copticChronology3);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[UTC]" + "'", str10, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 999, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusWeeks((int) (byte) 10);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime10, locale11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plus(readablePeriod13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withCenturyOfEra(522);
        org.joda.time.LocalDateTime.Property property17 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = property17.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        org.joda.time.LocalDateTime localDateTime20 = property19.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime21 = property19.roundCeilingCopy();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minus(readableDuration22);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2" + "'", str12, "2");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusWeeks((int) (byte) 10);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime10, locale11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plus(readablePeriod13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withCenturyOfEra(522);
        org.joda.time.LocalDateTime.Property property17 = localDateTime10.dayOfWeek();
        int int18 = property17.getMinimumValue();
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.lang.String str20 = property17.getAsText(locale19);
        org.joda.time.LocalDateTime localDateTime21 = property17.withMaximumValue();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2" + "'", str12, "2");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Montag" + "'", str20, "Montag");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfMonth();
        int int6 = dateTimeField5.getMinimumValue();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.clockhourOfDay();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str11 = dateTimeField8.getAsText((long) 'a', locale10);
        java.lang.String str12 = dateTimeField4.getAsText((int) 'a', locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.clockhourOfDay();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = dateTimeField20.getAsText((long) 'a', locale22);
        int int24 = dateTimeField17.getMaximumTextLength(locale22);
        java.lang.String str25 = locale10.getDisplayCountry(locale22);
        java.util.Locale.Builder builder26 = builder0.setLocale(locale22);
        java.util.Locale.Builder builder27 = builder0.clearExtensions();
        java.util.Locale.Builder builder28 = builder0.clearExtensions();
        java.util.Locale.Builder builder30 = builder0.setLanguageTag("weeks");
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "24" + "'", str11, "24");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97" + "'", str12, "97");
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "24" + "'", str23, "24");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(4287227101L, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long10 = dateTimeZone8.convertUTCToLocal((long) (short) 1);
        long long12 = dateTimeZone3.getMillisKeepLocal(dateTimeZone8, (-292269338L));
        java.lang.String str14 = dateTimeZone3.getShortName(0L);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.clockhourOfDay();
        org.joda.time.DurationField durationField19 = copticChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology17.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology17.getZone();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology17.year();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology17.yearOfEra();
        org.joda.time.DurationField durationField25 = dateTimeField24.getLeapDurationField();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.plusSeconds(26);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField35 = copticChronology34.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology34.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Chronology chronology38 = copticChronology34.withZone(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = copticChronology34.millisOfSecond();
        org.joda.time.DurationField durationField40 = copticChronology34.hours();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology34.dayOfMonth();
        org.joda.time.DurationField durationField42 = copticChronology34.weeks();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology34.monthOfYear();
        java.util.Locale locale45 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str46 = dateTimeField43.getAsShortText(479, locale45);
        java.lang.String str47 = locale45.getISO3Language();
        java.util.Locale.setDefault(locale45);
        java.lang.String str49 = dateTimeField24.getAsShortText((org.joda.time.ReadablePartial) localDateTime29, locale45);
        java.lang.String str50 = dateTimeZone3.getName(951144899079L, locale45);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(4287402444L, dateTimeZone3);
        java.util.Locale locale55 = new java.util.Locale("2022-02-21T14:54:10.514", "2022-02-14T14:54:48.518");
        java.lang.String str56 = dateTimeZone3.getName((-1510909505636L), locale55);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-292269348L) + "'", long12 == (-292269348L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNull(durationField25);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(copticChronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "479" + "'", str46, "479");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "fra" + "'", str47, "fra");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2022" + "'", str49, "2022");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
        org.junit.Assert.assertEquals(locale55.toString(), "2022-02-21t14:54:10.514_2022-02-14T14:54:48.518");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getScript();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.clockhourOfDay();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = dateTimeField4.getAsText((long) 'a', locale6);
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.lang.String str9 = locale6.getISO3Language();
        boolean boolean10 = locale6.hasExtensions();
        java.util.Locale locale11 = locale6.stripExtensions();
        java.lang.String str12 = locale11.getVariant();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime(readableInstant21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = dateTime22.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = dateTime22.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.clockhourOfDay();
        org.joda.time.DurationField durationField33 = copticChronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology31.halfdayOfDay();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.weekyear();
        org.joda.time.LocalDateTime localDateTime46 = property44.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime47 = property44.roundFloorCopy();
        org.joda.time.Interval interval48 = property44.toInterval();
        long long49 = property44.remainder();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.chrono.CopticChronology copticChronology51 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField52 = copticChronology51.clockhourOfDay();
        org.joda.time.DurationField durationField53 = copticChronology51.weekyears();
        org.joda.time.DateTimeField dateTimeField54 = copticChronology51.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.chrono.CopticChronology copticChronology56 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField57 = copticChronology56.clockhourOfDay();
        java.util.Locale locale59 = java.util.Locale.ITALIAN;
        java.lang.String str60 = dateTimeField57.getAsText((long) 'a', locale59);
        int int61 = dateTimeField54.getMaximumTextLength(locale59);
        int int63 = dateTimeField54.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property69 = localDateTime67.centuryOfEra();
        java.lang.String str70 = localDateTime67.toString();
        java.util.Locale locale72 = java.util.Locale.ENGLISH;
        java.lang.String str73 = dateTimeField54.getAsShortText((org.joda.time.ReadablePartial) localDateTime67, (-292275054), locale72);
        int int74 = property44.getMaximumShortTextLength(locale72);
        java.lang.String str75 = dateTimeField34.getAsShortText((long) 626, locale72);
        java.util.Set<java.lang.String> strSet76 = locale72.getUnicodeLocaleAttributes();
        java.lang.String str77 = dateTimeZone28.getName(10508080981L, locale72);
        java.lang.String str78 = locale72.getScript();
        java.lang.String str79 = locale11.getDisplayName(locale72);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "24" + "'", str7, "24");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tedesco (Germania)" + "'", str8, "tedesco (Germania)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ita" + "'", str9, "ita");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(copticChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(interval48);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 4287812322L + "'", long49 == 4287812322L);
        org.junit.Assert.assertNotNull(copticChronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(copticChronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "it");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "24" + "'", str60, "24");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(property69);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "2022-02-14T15:03:32.322" + "'", str70, "2022-02-14T15:03:32.322");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "-292275054" + "'", str73, "-292275054");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 9 + "'", int74 == 9);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "AM" + "'", str75, "AM");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "+00:00" + "'", str77, "+00:00");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Italian" + "'", str79, "Italian");
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.clockhourOfDay();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = dateTimeField7.getAsText((long) 'a', locale9);
        int int11 = dateTimeField4.getMaximumTextLength(locale9);
        int int13 = dateTimeField4.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.centuryOfEra();
        java.lang.String str20 = localDateTime17.toString();
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localDateTime17, (-292275054), locale22);
        java.lang.String str24 = localDateTime17.toString();
        int int25 = localDateTime17.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime17.minusWeeks(360000000);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusHours(53693);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = localDateTime29.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusYears(503);
        int int33 = localDateTime29.getYearOfCentury();
        java.lang.Object obj34 = null;
        boolean boolean35 = localDateTime29.equals(obj34);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "24" + "'", str10, "24");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022-02-14T15:03:32.357" + "'", str20, "2022-02-14T15:03:32.357");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-292275054" + "'", str23, "-292275054");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022-02-14T15:03:32.357" + "'", str24, "2022-02-14T15:03:32.357");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone10);
        org.joda.time.Chronology chronology12 = copticChronology1.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField13 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField18 = copticChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology1.era();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.clockhourOfDay();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = dateTimeField20.getAsText((long) 'a', locale22);
        int int24 = dateTimeField17.getMaximumTextLength(locale22);
        int int26 = dateTimeField17.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.centuryOfEra();
        java.lang.String str33 = localDateTime30.toString();
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.lang.String str36 = dateTimeField17.getAsShortText((org.joda.time.ReadablePartial) localDateTime30, (-292275054), locale35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime30.withDurationAdded(readableDuration37, 22);
        java.util.Date date40 = localDateTime30.toDate();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime30.withFields((org.joda.time.ReadablePartial) localDateTime48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusMinutes(329);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.minusWeeks(210);
        int[] intArray55 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime53, 0L);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        long long59 = copticChronology1.add(readablePeriod56, (long) 1999, 88236);
        org.joda.time.DurationField durationField60 = copticChronology1.months();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "24" + "'", str23, "24");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2022-02-14T15:03:32.399" + "'", str33, "2022-02-14T15:03:32.399");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-292275054" + "'", str36, "-292275054");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Mon Feb 14 15:03:33 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1686, 4, 23, 0]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1999L + "'", long59 == 1999L);
        org.junit.Assert.assertNotNull(durationField60);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology1.weeks();
        org.joda.time.DurationField durationField8 = copticChronology1.hours();
        org.joda.time.DurationField durationField9 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField11 = copticChronology1.weekyears();
        long long13 = durationField11.getMillis(51058001);
        java.lang.String str14 = durationField11.toString();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1611267972357600000L + "'", long13 == 1611267972357600000L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DurationField[weekyears]" + "'", str14, "DurationField[weekyears]");
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        int int8 = localDateTime7.getMillisOfSecond();
        int int9 = localDateTime7.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusHours((int) (short) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime7.yearOfEra();
        int int13 = localDateTime7.size();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        int int20 = localDateTime19.getYearOfEra();
        org.joda.time.Chronology chronology21 = localDateTime19.getChronology();
        java.util.Date date22 = localDateTime19.toDate();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withDayOfYear(22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime7.withFields((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(2022);
        int int29 = dateTimeZone27.getOffset((long) (short) -1);
        boolean boolean30 = dateTimeZone27.isFixed();
        org.joda.time.DateTime dateTime31 = localDateTime24.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.weekyear();
        org.joda.time.Interval interval41 = property40.toInterval();
        boolean boolean42 = property40.isLeap();
        int int43 = property40.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime44 = property40.roundHalfFloorCopy();
        java.util.Locale locale45 = java.util.Locale.UK;
        int int46 = property40.getMaximumTextLength(locale45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime54.toDateTime(readableInstant55);
        org.joda.time.LocalDateTime.Property property57 = localDateTime54.millisOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime54.plusMonths(999);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(chronology60);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime61.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.DateTime dateTime69 = localDateTime67.toDateTime(readableInstant68);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(chronology70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime71.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime71.plusWeeks((int) (byte) 10);
        int int78 = localDateTime77.getMillisOfSecond();
        int int79 = localDateTime77.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime77.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType82 = null;
        boolean boolean83 = localDateTime77.isSupported(durationFieldType82);
        org.joda.time.DateTime dateTime84 = localDateTime77.toDateTime();
        boolean boolean85 = dateTime69.isAfter((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.DateTimeZone dateTimeZone86 = dateTime84.getZone();
        org.joda.time.DateTime dateTime87 = localDateTime54.toDateTime((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.Instant instant88 = dateTime84.toInstant();
        int int89 = property40.getDifference((org.joda.time.ReadableInstant) dateTime84);
        long long90 = dateTime84.getMillis();
        boolean boolean91 = dateTime31.isAfter((org.joda.time.ReadableInstant) dateTime84);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 453 + "'", int8 == 453);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 453 + "'", int9 == 453);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Mon Feb 21 15:03:32 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 292278993 + "'", int43 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime77);
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 454 + "'", int78 == 454);
// flaky:         org.junit.Assert.assertTrue("'" + int79 + "' != '" + 454 + "'", int79 == 454);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(dateTimeZone86);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(instant88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-22) + "'", int89 == (-22));
// flaky:         org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1651503812454L + "'", long90 == 1651503812454L);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusWeeks((int) (byte) 10);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime10, locale11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plus(readablePeriod13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withCenturyOfEra(522);
        org.joda.time.LocalDateTime.Property property17 = localDateTime10.dayOfWeek();
        int int18 = property17.getMinimumValue();
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.lang.String str20 = property17.getAsText(locale19);
        java.util.Set<java.lang.String> strSet21 = locale19.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream22 = strSet21.parallelStream();
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet25 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet25.clear();
        java.lang.Object[] objArray27 = strSet25.toArray();
        java.util.stream.Stream<java.lang.String> strStream28 = strSet25.parallelStream();
        java.lang.Object[] objArray29 = strSet25.toArray();
        boolean boolean30 = strSet24.retainAll((java.util.Collection<java.lang.String>) strSet25);
        java.util.Set<java.lang.String> strSet31 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet31.clear();
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.DateTimeZone[] dateTimeZoneArray43 = new org.joda.time.DateTimeZone[] { dateTimeZone34, dateTimeZone36, dateTimeZone38, dateTimeZone40, dateTimeZone42 };
        org.joda.time.DateTimeZone[] dateTimeZoneArray44 = strSet31.toArray(dateTimeZoneArray43);
        java.util.Spliterator<java.lang.String> strSpliterator45 = strSet31.spliterator();
        boolean boolean46 = strSet31.isEmpty();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.chrono.CopticChronology copticChronology48 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = copticChronology48.clockhourOfDay();
        org.joda.time.DurationField durationField50 = copticChronology48.weekyears();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology48.clockhourOfDay();
        boolean boolean52 = strSet31.equals((java.lang.Object) dateTimeField51);
        java.util.stream.Stream<java.lang.String> strStream53 = strSet31.parallelStream();
        strSet31.clear();
        boolean boolean55 = strSet25.addAll((java.util.Collection<java.lang.String>) strSet31);
        boolean boolean56 = strSet21.addAll((java.util.Collection<java.lang.String>) strSet31);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2" + "'", str12, "2");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Montag" + "'", str20, "Montag");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strStream22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(strStream28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTimeZoneArray43);
        org.junit.Assert.assertNotNull(dateTimeZoneArray44);
        org.junit.Assert.assertNotNull(strSpliterator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(copticChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strStream53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.centuries();
        org.joda.time.DurationField durationField5 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.dayOfMonth();
        org.joda.time.DurationField durationField10 = copticChronology8.months();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = copticChronology8.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.clockhourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology15.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology15.getZone();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology15.year();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology15.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = copticChronology15.getZone();
        org.joda.time.Chronology chronology24 = copticChronology8.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology25 = copticChronology1.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField26 = copticChronology1.seconds();
        org.joda.time.DurationField durationField27 = copticChronology1.minutes();
        java.lang.String str28 = durationField27.toString();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DurationField[minutes]" + "'", str28, "DurationField[minutes]");
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 26, dateTimeZone1);
        long long4 = dateTimeZone1.convertUTCToLocal(4287269054L);
        java.lang.String str6 = dateTimeZone1.getShortName((long) 53742323);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4287269054L + "'", long4 == 4287269054L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = copticChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone21);
        org.joda.time.Chronology chronology23 = copticChronology12.withZone(dateTimeZone21);
        boolean boolean24 = copticChronology1.equals((java.lang.Object) copticChronology12);
        org.joda.time.DurationField durationField25 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField27 = copticChronology1.millis();
        boolean boolean28 = durationField27.isPrecise();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2000-02-21T15:02:28.721", (double) 4287477197L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=4.287477197E9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getCountry();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        boolean boolean12 = property8.equals((java.lang.Object) locale9);
        org.joda.time.Interval interval13 = property8.toInterval();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CA" + "'", str10, "CA");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval13);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks((int) (byte) -1);
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = locale10.getScript();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.clockhourOfDay();
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = dateTimeField14.getAsText((long) 'a', locale16);
        java.lang.String str18 = locale10.getDisplayName(locale16);
        java.lang.String str19 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localDateTime8, (int) ' ', locale16);
        org.joda.time.LocalDateTime.Property property20 = localDateTime8.year();
        java.lang.String str21 = property20.getName();
        org.joda.time.LocalDateTime localDateTime22 = property20.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime23 = property20.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime24 = property20.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusMonths(0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = localDateTime26.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusMinutes(53732792);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "24" + "'", str17, "24");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "tedesco (Germania)" + "'", str18, "tedesco (Germania)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32" + "'", str19, "32");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "year" + "'", str21, "year");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        java.util.Locale locale1 = new java.util.Locale("53623080");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "53623080");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "53623080" + "'", str2, "53623080");
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField11 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.era();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        java.lang.String[] strArray6 = new java.lang.String[] { "14", "UTC", "86", "2022-02-14T14:53:44.313", "2022-02-14T14:53:43.333", "32" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.util.Set<java.lang.String> strSet9 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet9.clear();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone[] dateTimeZoneArray21 = new org.joda.time.DateTimeZone[] { dateTimeZone12, dateTimeZone14, dateTimeZone16, dateTimeZone18, dateTimeZone20 };
        org.joda.time.DateTimeZone[] dateTimeZoneArray22 = strSet9.toArray(dateTimeZoneArray21);
        java.util.Spliterator<java.lang.String> strSpliterator23 = strSet9.spliterator();
        boolean boolean24 = strSet7.removeAll((java.util.Collection<java.lang.String>) strSet9);
        int int25 = strSet7.size();
        java.lang.String[] strArray29 = new java.lang.String[] { "2022-02-14T14:53:58.569", "2022-02-14T14:53:58.629", "2022-02-14T14:53:50.202" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        boolean boolean33 = strSet30.add("\u4e2d\u56fd");
        boolean boolean34 = strSet7.addAll((java.util.Collection<java.lang.String>) strSet30);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology36.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.Chronology chronology40 = copticChronology36.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField41 = copticChronology36.millisOfSecond();
        org.joda.time.DurationField durationField42 = copticChronology36.hours();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology36.dayOfMonth();
        org.joda.time.DurationField durationField44 = copticChronology36.weeks();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology36.dayOfYear();
        boolean boolean46 = strSet30.equals((java.lang.Object) copticChronology36);
        org.joda.time.DateTimeField dateTimeField47 = copticChronology36.era();
        org.joda.time.DurationField durationField48 = copticChronology36.seconds();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology36.secondOfMinute();
        org.joda.time.DurationField durationField50 = copticChronology36.weeks();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneArray21);
        org.junit.Assert.assertNotNull(dateTimeZoneArray22);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(copticChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withPeriodAdded(readablePeriod5, 8);
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.yearOfCentury();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = property9.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(503);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.centuries();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime6.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) 10);
        long long13 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime9, 3490L);
        org.joda.time.DurationField durationField14 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10597996800000L + "'", long13 == 10597996800000L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.secondOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField8 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:19.101");
        java.util.TimeZone.setDefault(timeZone1);
        int int4 = timeZone1.getOffset(314L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str7 = dateTimeZone5.getShortName((long) 53880906);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 999, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField7 = copticChronology2.weeks();
        org.joda.time.DurationField durationField8 = copticChronology2.seconds();
        org.joda.time.DurationField durationField9 = copticChronology2.minutes();
        int int12 = durationField9.getValue((long) 810, 10604185164134L);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusWeeks((int) (byte) 10);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime10, locale11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plus(readablePeriod13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withCenturyOfEra(522);
        org.joda.time.LocalDateTime.Property property17 = localDateTime10.dayOfWeek();
        int int18 = property17.getMinimumValue();
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.lang.String str20 = property17.getAsText(locale19);
        org.joda.time.LocalDateTime localDateTime21 = property17.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMonths(129);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.weekyear();
        org.joda.time.DurationField durationField25 = property24.getRangeDurationField();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2" + "'", str12, "2");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Montag" + "'", str20, "Montag");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNull(durationField25);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DurationField durationField8 = copticChronology1.weeks();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDateTime10.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusMinutes(1);
        int[] intArray15 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime13, 0L);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology1.seconds();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology1.getZone();
        org.joda.time.DurationField durationField19 = copticChronology1.minutes();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1686, 4, 23, 0]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology1.hours();
        org.joda.time.DurationField durationField10 = copticChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeField12.set((long) 9, "2022-02-14T14:56:31.726");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-14T14:56:31.726\" for weekyearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfDay();
        org.joda.time.DurationField durationField6 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.millisOfSecond();
        int int8 = dateTimeField7.getMaximumValue();
        long long10 = dateTimeField7.roundCeiling(0L);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 999 + "'", int8 == 999);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("86");
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusMinutes(710);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekyear();
        org.joda.time.LocalDateTime localDateTime15 = property13.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField16 = property13.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime17 = property13.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekOfWeekyear();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime17.toDateTime(readableInstant19);
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.weekyear();
        org.joda.time.LocalDateTime localDateTime32 = property30.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField33 = property30.getLeapDurationField();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localDateTime41.toDateTime(readableInstant42);
        java.util.Locale locale44 = java.util.Locale.GERMANY;
        boolean boolean45 = locale44.hasExtensions();
        boolean boolean46 = dateTime43.equals((java.lang.Object) locale44);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Collection<java.lang.String> strCollection50 = null;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strCollection50);
        java.util.Collection<java.lang.String> strCollection52 = null;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strCollection52);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Collection<java.lang.String> strCollection57 = null;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, strCollection57);
        java.util.Collection<java.lang.String> strCollection59 = null;
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, strCollection59);
        java.util.Locale.FilteringMode filteringMode61 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strCollection59, filteringMode61);
        boolean boolean63 = dateTime43.equals((java.lang.Object) languageRangeList48);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property69 = localDateTime67.centuryOfEra();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(chronology70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime71.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime71.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.DateTime dateTime79 = localDateTime77.toDateTime(readableInstant78);
        java.util.Locale locale80 = java.util.Locale.GERMANY;
        boolean boolean81 = locale80.hasExtensions();
        boolean boolean82 = dateTime79.equals((java.lang.Object) locale80);
        int int83 = property69.getDifference((org.joda.time.ReadableInstant) dateTime79);
        int int84 = dateTime43.compareTo((org.joda.time.ReadableInstant) dateTime79);
        long long85 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.Instant instant86 = dateTime79.toInstant();
        boolean boolean87 = instant21.isEqual((org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.DateTime dateTime88 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) instant21);
        java.lang.Object obj89 = null;
        boolean boolean90 = dateTime88.equals(obj89);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + filteringMode61 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode61.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertNotNull(instant86);
// flaky:         org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        long long6 = copticChronology1.add((long) '#', (long) 'a', (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.secondOfMinute();
        long long11 = dateTimeField9.roundFloor(951144861708L);
        boolean boolean13 = dateTimeField9.isLeap((long) 50);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3430L + "'", long6 == 3430L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 951144861000L + "'", long11 == 951144861000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        int int14 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime.Property property17 = localDateTime9.yearOfCentury();
        int int18 = localDateTime9.size();
        org.joda.time.LocalDateTime.Property property19 = localDateTime9.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime9.minus(readablePeriod20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plus(readableDuration22);
        java.lang.String str24 = localDateTime21.toString();
        int int25 = localDateTime21.getYearOfEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022-02-21T15:03:32.924" + "'", str24, "2022-02-21T15:03:32.924");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        long long11 = property8.remainder();
        org.joda.time.LocalDateTime localDateTime12 = property8.withMinimumValue();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plus(readableDuration13);
        java.util.Date date15 = localDateTime14.toDate();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromDateFields(date15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekyear();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleAttributes();
        java.lang.String str20 = property17.getAsText(locale18);
        java.lang.String str21 = property17.getAsString();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4287812938L + "'", long11 == 4287812938L);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Sun Sep 22 05:29:24 GMT 292272993");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "292272993" + "'", str20, "292272993");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "292272993" + "'", str21, "292272993");
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = dateTimeField2.getLeapDurationField();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNull(durationField3);
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = dateTimeField12.getType();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay((int) (byte) 0);
        int int5 = localDateTime4.getYear();
        int int6 = localDateTime4.getEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.weekyear();
        int int8 = localDateTime4.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withMinuteOfHour(753);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 753 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        int int8 = localDateTime7.getMillisOfSecond();
        int int9 = localDateTime7.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusHours((int) (short) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime7.yearOfEra();
        int int13 = localDateTime7.size();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.clockhourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology15.weekyears();
        org.joda.time.DurationField durationField18 = copticChronology15.hours();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology15.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.weekyearOfCentury();
        long long24 = copticChronology15.add((long) (byte) 100, (long) 30, 113);
        org.joda.time.DurationField durationField25 = copticChronology15.weekyears();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.weekyear();
        org.joda.time.LocalDateTime localDateTime36 = property34.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField37 = property34.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime38 = property34.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.CopticChronology copticChronology41 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = copticChronology41.hourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology41.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.Chronology chronology45 = copticChronology41.withZone(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = copticChronology41.millisOfSecond();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.weekyear();
        org.joda.time.LocalDateTime localDateTime57 = property55.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField58 = property55.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime59 = property55.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.weekOfWeekyear();
        int int61 = dateTimeField46.getMaximumValue((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = dateTimeField46.getType();
        int int63 = localDateTime38.indexOf(dateTimeFieldType62);
        int[] intArray65 = copticChronology15.get((org.joda.time.ReadablePartial) localDateTime38, 10598050427926L);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(chronology66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime67.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.weekyear();
        org.joda.time.Interval interval75 = property74.toInterval();
        boolean boolean76 = property74.isLeap();
        int int77 = property74.getMinimumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property74.getFieldType();
        int int79 = localDateTime38.get(dateTimeFieldType78);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime38.minusDays(895);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime38.minusYears(213);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime7.withFields((org.joda.time.ReadablePartial) localDateTime83);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 13 + "'", int8 == 13);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3490L + "'", long24 == 3490L);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(copticChronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 999 + "'", int61 == 999);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[2022, 2, 21, 53627926]");
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-292275054) + "'", int77 == (-292275054));
        org.junit.Assert.assertNotNull(dateTimeFieldType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2000 + "'", int79 == 2000);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(localDateTime84);
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DurationField durationField8 = copticChronology1.weeks();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDateTime10.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusMinutes(1);
        int[] intArray15 = copticChronology1.get((org.joda.time.ReadablePartial) localDateTime13, 0L);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1686, 4, 23, 0]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet0.clear();
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone[] dateTimeZoneArray12 = new org.joda.time.DateTimeZone[] { dateTimeZone3, dateTimeZone5, dateTimeZone7, dateTimeZone9, dateTimeZone11 };
        org.joda.time.DateTimeZone[] dateTimeZoneArray13 = strSet0.toArray(dateTimeZoneArray12);
        java.util.Spliterator<java.lang.String> strSpliterator14 = strSet0.spliterator();
        boolean boolean15 = strSet0.isEmpty();
        boolean boolean17 = strSet0.add("2022-02-14T14:53:58.771");
        java.lang.String[] strArray23 = new java.lang.String[] { "10", "UTC", "10", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.Iterator<java.lang.String> strItor26 = strSet24.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator27 = strSet24.spliterator();
        boolean boolean28 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.Iterator<java.lang.String> strItor29 = strSet0.iterator();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.weekyear();
        org.joda.time.LocalDateTime localDateTime40 = property38.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField41 = property38.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime42 = property38.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.weekyear();
        boolean boolean44 = strSet0.equals((java.lang.Object) property43);
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneArray12);
        org.junit.Assert.assertNotNull(dateTimeZoneArray13);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(strSpliterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.minuteOfHour();
        org.joda.time.DurationField durationField8 = copticChronology1.centuries();
        org.joda.time.DurationField durationField9 = copticChronology1.halfdays();
        org.joda.time.DurationField durationField10 = copticChronology1.millis();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        java.util.Locale locale2 = new java.util.Locale("54196", "140");
        org.junit.Assert.assertEquals(locale2.toString(), "54196_140");
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.minuteOfDay();
        java.lang.String str10 = dateTimeField9.getName();
        java.util.Locale locale13 = new java.util.Locale("2022-02-14T14:54:22.311");
        java.lang.String str14 = dateTimeField9.getAsText(0L, locale13);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "minuteOfDay" + "'", str10, "minuteOfDay");
        org.junit.Assert.assertEquals(locale13.toString(), "2022-02-14t14:54:22.311");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        long long11 = property8.remainder();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime(readableInstant20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.millisOfDay();
        int int23 = property8.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        boolean boolean25 = property8.equals((java.lang.Object) 126L);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property8.getFieldType();
        org.joda.time.LocalDateTime localDateTime28 = property8.addToCopy((-292275054));
        int int29 = property8.getMinimumValue();
        java.lang.String str30 = property8.getAsString();
        java.lang.String str31 = property8.getAsShortText();
        org.joda.time.LocalDateTime localDateTime33 = property8.addToCopy((long) 279);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology36.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.Chronology chronology40 = copticChronology36.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField41 = copticChronology36.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology36.clockhourOfHalfday();
        org.joda.time.DurationField durationField43 = copticChronology36.days();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology36.clockhourOfDay();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(chronology46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property50 = localDateTime47.weekOfWeekyear();
        java.lang.String str51 = property50.getName();
        java.util.Locale locale52 = java.util.Locale.ITALY;
        int int53 = property50.getMaximumShortTextLength(locale52);
        java.lang.String str54 = property50.getName();
        org.joda.time.LocalDateTime localDateTime55 = property50.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime56 = property50.roundCeilingCopy();
        java.util.Locale locale57 = java.util.Locale.GERMANY;
        java.lang.String str58 = locale57.getScript();
        java.lang.String str59 = locale57.getDisplayVariant();
        boolean boolean60 = locale57.hasExtensions();
        java.lang.String str61 = property50.getAsShortText(locale57);
        java.lang.String str62 = dateTimeField44.getAsShortText(4287276369L, locale57);
        int int63 = property34.getMaximumShortTextLength(locale57);
        int int64 = property34.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4287813161L + "'", long11 == 4287813161L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-292275054) + "'", int29 == (-292275054));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2000" + "'", str30, "2000");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2000" + "'", str31, "2000");
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(copticChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "weekOfWeekyear" + "'", str51, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "weekOfWeekyear" + "'", str54, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "8" + "'", str61, "8");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "14" + "'", str62, "14");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 99 + "'", int64 == 99);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.secondOfMinute();
        long long10 = copticChronology1.add(4287299367L, (long) 17, 51042001);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5155013384L + "'", long10 == 5155013384L);
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekyear();
        long long14 = dateTimeField11.add((long) 51004001, 11);
        boolean boolean15 = dateTimeField11.isSupported();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        int int30 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime.Property property31 = localDateTime25.weekyear();
        org.joda.time.LocalDateTime.Property property32 = localDateTime25.millisOfDay();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withCenturyOfEra((int) '#');
        java.util.Locale locale36 = java.util.Locale.GERMANY;
        java.lang.String str37 = locale36.getScript();
        java.lang.String str38 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) localDateTime33, locale36);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime33.plus(readablePeriod39);
        org.joda.time.Chronology chronology41 = localDateTime40.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = copticChronology43.clockhourOfDay();
        org.joda.time.DurationField durationField45 = copticChronology43.weekyears();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology43.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = copticChronology43.getZone();
        org.joda.time.DurationField durationField48 = copticChronology43.centuries();
        org.joda.time.DurationField durationField49 = copticChronology43.seconds();
        org.joda.time.DurationField durationField50 = copticChronology43.millis();
        boolean boolean51 = localDateTime40.equals((java.lang.Object) copticChronology43);
        org.joda.time.LocalDateTime.Property property52 = localDateTime40.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 347206204001L + "'", long14 == 347206204001L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2022" + "'", str38, "2022");
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(copticChronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(property52);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = copticChronology1.weekyears();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(2022);
        org.joda.time.Chronology chronology9 = copticChronology1.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.monthOfYear();
        long long13 = dateTimeField10.getDifferenceAsLong((long) 156, 0L);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.centuryOfEra();
        org.joda.time.DurationField durationField15 = copticChronology12.millis();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology12);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfEra();
        boolean boolean20 = copticChronology1.equals((java.lang.Object) localDateTime18);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField23 = copticChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(54064446);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.minusDays(100);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.joda.time.DurationField durationField13 = property12.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str16 = property12.getAsShortText(locale15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property12.getFieldType();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "3" + "'", str16, "3");
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology1.getZone();
        org.joda.time.DurationField durationField8 = copticChronology1.millis();
        org.joda.time.DurationField durationField9 = copticChronology1.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = copticChronology1.getDateTimeMillis(4287741165L, 744, 285, 2, 30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 744 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        java.util.Locale locale3 = new java.util.Locale("32", "German (Germany)", "2022-02-14T14:54:16.687");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet7 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet7.clear();
        java.lang.Object[] objArray9 = strSet7.toArray();
        java.util.stream.Stream<java.lang.String> strStream10 = strSet7.parallelStream();
        java.lang.Object[] objArray11 = strSet7.toArray();
        boolean boolean12 = strSet6.retainAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.Iterator<java.lang.String> strItor13 = strSet7.iterator();
        boolean boolean14 = strSet4.contains((java.lang.Object) strSet7);
        boolean boolean16 = strSet7.add("2001-02-21T14:56:43.001");
        java.util.stream.Stream<java.lang.String> strStream17 = strSet7.parallelStream();
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology22.secondOfDay();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology22);
        int int27 = localDateTime26.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.plusDays(46);
        org.joda.time.ReadablePartial[] readablePartialArray30 = new org.joda.time.ReadablePartial[] { localDateTime29 };
        org.joda.time.ReadablePartial[] readablePartialArray31 = strSet19.toArray(readablePartialArray30);
        boolean boolean32 = strSet19.isEmpty();
        boolean boolean33 = strSet7.addAll((java.util.Collection<java.lang.String>) strSet19);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.centuryOfEra();
        java.lang.String str40 = localDateTime37.toString();
        org.joda.time.LocalDateTime.Property property41 = localDateTime37.dayOfMonth();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.DateTime dateTime51 = localDateTime49.toDateTime(readableInstant50);
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        boolean boolean53 = locale52.hasExtensions();
        boolean boolean54 = dateTime51.equals((java.lang.Object) locale52);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Collection<java.lang.String> strCollection58 = null;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, strCollection58);
        java.util.Collection<java.lang.String> strCollection60 = null;
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, strCollection60);
        java.util.Locale.LanguageRange[] languageRangeArray62 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList63 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList63, languageRangeArray62);
        java.util.Collection<java.lang.String> strCollection65 = null;
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, strCollection65);
        java.util.Collection<java.lang.String> strCollection67 = null;
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, strCollection67);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, strCollection67, filteringMode69);
        boolean boolean71 = dateTime51.equals((java.lang.Object) languageRangeList56);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(chronology72);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property77 = localDateTime75.centuryOfEra();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(chronology78);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime79.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime79.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.DateTime dateTime87 = localDateTime85.toDateTime(readableInstant86);
        java.util.Locale locale88 = java.util.Locale.GERMANY;
        boolean boolean89 = locale88.hasExtensions();
        boolean boolean90 = dateTime87.equals((java.lang.Object) locale88);
        int int91 = property77.getDifference((org.joda.time.ReadableInstant) dateTime87);
        int int92 = dateTime51.compareTo((org.joda.time.ReadableInstant) dateTime87);
        int int93 = property41.getDifference((org.joda.time.ReadableInstant) dateTime87);
        java.util.Locale locale94 = java.util.Locale.CANADA_FRENCH;
        int int95 = property41.getMaximumTextLength(locale94);
        java.util.Set<java.lang.String> strSet96 = locale94.getUnicodeLocaleAttributes();
        java.util.stream.Stream<java.lang.String> strStream97 = strSet96.stream();
        boolean boolean98 = strSet19.retainAll((java.util.Collection<java.lang.String>) strSet96);
        org.junit.Assert.assertEquals(locale3.toString(), "32_GERMAN (GERMANY)_2022-02-14T14:54:16.687");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(copticChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 113 + "'", int27 == 113);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(readablePartialArray30);
        org.junit.Assert.assertNotNull(readablePartialArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2022-02-14T15:03:33.296" + "'", str40, "2022-02-14T15:03:33.296");
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(languageRangeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode69.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(localDateTime85);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int93 + "' != '" + 8029 + "'", int93 == 8029);
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 2 + "'", int95 == 2);
        org.junit.Assert.assertNotNull(strSet96);
        org.junit.Assert.assertNotNull(strStream97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = copticChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.millisOfSecond();
        org.joda.time.DurationField durationField8 = copticChronology2.hours();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology2.yearOfCentury();
        org.joda.time.DurationField durationField12 = copticChronology2.hours();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(360000000L, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology2.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy(112);
        org.joda.time.LocalDateTime localDateTime11 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("53671009");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology3.getZone();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        timeZone11.setID("2022-02-14T14:53:53.014");
        boolean boolean14 = timeZone1.hasSameRules(timeZone11);
        java.util.TimeZone.setDefault(timeZone11);
        timeZone11.setRawOffset(36);
        java.util.TimeZone.setDefault(timeZone11);
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone("2022-02-14T14:53:53.014");
        java.lang.String str21 = timeZone20.getID();
        int int22 = timeZone20.getRawOffset();
        timeZone20.setID("2022-02-14T14:55:56.827");
        timeZone20.setID("2022-02-14T14:56:26.238");
        boolean boolean27 = timeZone11.hasSameRules(timeZone20);
        int int29 = timeZone11.getOffset(10596841136368L);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GMT" + "'", str21, "GMT");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 36 + "'", int29 == 36);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField11 = property8.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime12 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withSecondOfMinute((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minusDays(204);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localDateTime16.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfEra(19);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField23 = copticChronology21.weekyears();
        org.joda.time.DurationField durationField24 = copticChronology21.centuries();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology21.weekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology21.getZone();
        java.lang.String str28 = dateTimeZone26.getName((long) 53);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.plusWeeks((int) (byte) 10);
        int int37 = localDateTime36.getMillisOfSecond();
        int int38 = localDateTime36.getMillisOfSecond();
        java.lang.String str40 = localDateTime36.toString("+100:00");
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.withWeekyear(792);
        int int43 = localDateTime36.getMonthOfYear();
        int int44 = localDateTime36.getDayOfYear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(chronology45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.withMillisOfSecond((int) (byte) 1);
        int int59 = localDateTime46.compareTo((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.LocalDateTime.Property property60 = localDateTime54.weekyear();
        org.joda.time.LocalDateTime.Property property61 = localDateTime54.millisOfDay();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime54.minusYears(999);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.plusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.minusMinutes(51046001);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.chrono.CopticChronology copticChronology69 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone68);
        org.joda.time.DateTimeField dateTimeField70 = copticChronology69.hourOfDay();
        org.joda.time.DateTimeField dateTimeField71 = copticChronology69.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.Chronology chronology73 = copticChronology69.withZone(dateTimeZone72);
        org.joda.time.DateTimeField dateTimeField74 = copticChronology69.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField75 = copticChronology69.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = dateTimeField75.getType();
        org.joda.time.LocalDateTime.Property property77 = localDateTime63.property(dateTimeFieldType76);
        int int78 = localDateTime36.get(dateTimeFieldType76);
        boolean boolean79 = dateTimeZone26.isLocalDateTimeGap(localDateTime36);
        boolean boolean81 = dateTimeZone26.isStandardOffset(0L);
        org.joda.time.DateTime dateTime82 = localDateTime19.toDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime19.plusHours(755);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 389 + "'", int37 == 389);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 389 + "'", int38 == 389);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+100:00" + "'", str40, "+100:00");
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 122 + "'", int44 == 122);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(copticChronology69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertNotNull(property77);
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 3 + "'", int78 == 3);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(localDateTime84);
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField6 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField12 = copticChronology1.years();
        org.joda.time.DurationField durationField13 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology1.dayOfMonth();
        long long17 = dateTimeField15.roundHalfCeiling(10596841153368L);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10596873600000L + "'", long17 == 10596873600000L);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.Chronology chronology7 = copticChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime8 = property6.addToCopy((-292269337));
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withPeriodAdded(readablePeriod10, 331);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.minusHours(123);
        java.lang.String str15 = localDateTime8.toString();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-292267315-02-21T15:03:33.477" + "'", str15, "-292267315-02-21T15:03:33.477");
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyearOfCentury();
        long long10 = copticChronology1.add((long) (byte) 100, (long) 30, 113);
        org.joda.time.DurationField durationField11 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField12 = copticChronology1.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology15.halfdayOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = localDateTime19.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology27.secondOfDay();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology27);
        int int32 = localDateTime31.getDayOfYear();
        boolean boolean33 = localDateTime24.isEqual((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withMillisOfSecond((int) (byte) 1);
        boolean boolean40 = localDateTime24.isAfter((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property46 = localDateTime44.centuryOfEra();
        boolean boolean47 = localDateTime35.equals((java.lang.Object) property46);
        java.util.Locale locale49 = java.util.Locale.KOREA;
        java.lang.String str50 = dateTimeField17.getAsText((org.joda.time.ReadablePartial) localDateTime35, 26, locale49);
        int int51 = dateTimeField13.getMaximumTextLength(locale49);
        java.util.Locale locale53 = java.util.Locale.forLanguageTag("2022-02-14T14:54:15.220");
        java.lang.String str54 = locale49.getDisplayVariant(locale53);
        java.lang.Object obj55 = locale53.clone();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3490L + "'", long10 == 3490L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(copticChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 113 + "'", int32 == 113);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "26" + "'", str50, "26");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "");
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.minuteOfHour();
        long long13 = copticChronology1.add((long) 357, 4287366630L, 105);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.clockhourOfHalfday();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.centuryOfEra();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        java.util.Locale locale31 = java.util.Locale.GERMANY;
        boolean boolean32 = locale31.hasExtensions();
        boolean boolean33 = dateTime30.equals((java.lang.Object) locale31);
        int int34 = property20.getDifference((org.joda.time.ReadableInstant) dateTime30);
        long long35 = property20.remainder();
        org.joda.time.LocalDateTime localDateTime36 = property20.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withWeekOfWeekyear(52);
        int int39 = dateTimeField14.getMinimumValue((org.joda.time.ReadablePartial) localDateTime36);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 450173496507L + "'", long13 == 450173496507L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1510908986489L) + "'", long35 == (-1510908986489L));
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekyear();
        org.joda.time.DurationField durationField9 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2022-02-14T14:55:39.693", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ko-KR", strMap1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("JP");
        java.util.Set<java.lang.String> strSet5 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.dayOfMonth();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusWeeks((int) (byte) 10);
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.lang.String str18 = dateTimeField8.getAsText((org.joda.time.ReadablePartial) localDateTime16, locale17);
        java.util.Set<java.lang.String> strSet19 = locale17.getUnicodeLocaleKeys();
        java.lang.Object[] objArray20 = strSet19.toArray();
        boolean boolean21 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet19);
        java.lang.String str22 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strSet19);
        java.util.Set<java.lang.String> strSet23 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet23.clear();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.DateTimeZone[] dateTimeZoneArray35 = new org.joda.time.DateTimeZone[] { dateTimeZone26, dateTimeZone28, dateTimeZone30, dateTimeZone32, dateTimeZone34 };
        org.joda.time.DateTimeZone[] dateTimeZoneArray36 = strSet23.toArray(dateTimeZoneArray35);
        java.util.Spliterator<java.lang.String> strSpliterator37 = strSet23.spliterator();
        boolean boolean38 = strSet23.isEmpty();
        boolean boolean39 = strSet19.containsAll((java.util.Collection<java.lang.String>) strSet23);
        boolean boolean41 = strSet23.add("2022-02-21T14:56:08.850");
        java.lang.String str42 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap43);
        java.util.Collection<java.util.Locale> localeCollection45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale46 = java.util.Locale.lookup(languageRangeList44, localeCollection45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2" + "'", str18, "2");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneArray35);
        org.junit.Assert.assertNotNull(dateTimeZoneArray36);
        org.junit.Assert.assertNotNull(strSpliterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(languageRangeList44);
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology1.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.dayOfMonth();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekyear();
        org.joda.time.LocalDateTime localDateTime19 = property17.setCopy((int) (byte) 1);
        long long20 = property17.remainder();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime(readableInstant29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.millisOfDay();
        int int32 = property17.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        int int33 = dateTimeField8.getMaximumValue((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime28.plusMonths((int) (byte) 10);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusSeconds((int) (short) -1);
        int[] intArray40 = localDateTime39.getValues();
        copticChronology1.validate((org.joda.time.ReadablePartial) localDateTime35, intArray40);
        org.joda.time.DurationField durationField42 = copticChronology1.weeks();
        org.joda.time.DurationField durationField43 = copticChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology1.secondOfMinute();
        org.joda.time.DurationField durationField45 = copticChronology1.millis();
        org.joda.time.DurationField durationField46 = copticChronology1.halfdays();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 4287813577L + "'", long20 == 4287813577L);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 30 + "'", int33 == 30);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(intArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[2022, 2, 21, 54214577]");
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(durationField46);
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.yearOfCentury();
        int int7 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 113, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology2.year();
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        long long11 = property8.remainder();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime(readableInstant20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.millisOfDay();
        int int23 = property8.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        boolean boolean25 = property8.equals((java.lang.Object) 126L);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.clockhourOfDay();
        org.joda.time.DurationField durationField29 = copticChronology27.weekyears();
        org.joda.time.DurationField durationField30 = copticChronology27.hours();
        boolean boolean31 = property8.equals((java.lang.Object) copticChronology27);
        org.joda.time.DurationField durationField32 = copticChronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology27.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology27.centuryOfEra();
        boolean boolean35 = dateTimeField34.isSupported();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = copticChronology38.clockhourOfDay();
        org.joda.time.DurationField durationField40 = copticChronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology38.clockhourOfDay();
        org.joda.time.DurationField durationField42 = copticChronology38.hours();
        org.joda.time.DateTimeZone dateTimeZone43 = copticChronology38.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(82800001L, dateTimeZone43);
        int int46 = dateTimeField34.getMinimumValue((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = localDateTime45.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.minusMinutes(843);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusSeconds(633);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = localDateTime49.getFieldType(0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4287813645L + "'", long11 == 4287813645L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(copticChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(copticChronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.centuryOfEra();
        org.joda.time.DurationField durationField5 = copticChronology2.millis();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(2022);
        org.joda.time.Chronology chronology10 = copticChronology2.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology2.dayOfYear();
        java.lang.String str13 = copticChronology2.toString();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withMillisOfSecond((int) (byte) 1);
        int int28 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime.Property property29 = localDateTime23.weekyear();
        org.joda.time.LocalDateTime.Property property30 = localDateTime23.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime23.minusYears(999);
        int int33 = localDateTime23.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime23.withMillisOfDay(53672621);
        int int36 = localDateTime35.getYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = copticChronology38.hourOfDay();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology38.centuryOfEra();
        org.joda.time.DurationField durationField41 = copticChronology38.millis();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology38.weekOfWeekyear();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime44.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime44.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.withMillisOfSecond((int) (byte) 1);
        int int57 = localDateTime44.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.LocalDateTime.Property property58 = localDateTime52.weekyear();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime52.minusMillis(2022);
        int[] intArray62 = copticChronology38.get((org.joda.time.ReadablePartial) localDateTime52, (long) '#');
        copticChronology2.validate((org.joda.time.ReadablePartial) localDateTime35, intArray62);
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(4320159066L, (org.joda.time.Chronology) copticChronology2);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[UTC]" + "'", str13, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertNotNull(copticChronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1686, 4, 23, 35]");
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekyear();
        org.joda.time.DurationField durationField7 = copticChronology1.months();
        org.joda.time.DurationField durationField8 = copticChronology1.years();
        org.joda.time.DurationField durationField9 = copticChronology1.centuries();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.weekyearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        long long3 = dateTimeZone1.previousTransition(4287246751L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology6.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology6.centuries();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology6.weekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology6.getZone();
        java.lang.String str13 = dateTimeZone11.getName((long) 53);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plusWeeks((int) (byte) 10);
        int int22 = localDateTime21.getMillisOfSecond();
        int int23 = localDateTime21.getMillisOfSecond();
        java.lang.String str25 = localDateTime21.toString("+100:00");
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withWeekyear(792);
        int int28 = localDateTime21.getMonthOfYear();
        int int29 = localDateTime21.getDayOfYear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.withMillisOfSecond((int) (byte) 1);
        int int44 = localDateTime31.compareTo((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime.Property property45 = localDateTime39.weekyear();
        org.joda.time.LocalDateTime.Property property46 = localDateTime39.millisOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime39.minusYears(999);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.minusMinutes(51046001);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.chrono.CopticChronology copticChronology54 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = copticChronology54.hourOfDay();
        org.joda.time.DateTimeField dateTimeField56 = copticChronology54.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.Chronology chronology58 = copticChronology54.withZone(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField59 = copticChronology54.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField60 = copticChronology54.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = dateTimeField60.getType();
        org.joda.time.LocalDateTime.Property property62 = localDateTime48.property(dateTimeFieldType61);
        int int63 = localDateTime21.get(dateTimeFieldType61);
        boolean boolean64 = dateTimeZone11.isLocalDateTimeGap(localDateTime21);
        boolean boolean66 = dateTimeZone11.isStandardOffset(0L);
        java.util.TimeZone timeZone67 = dateTimeZone11.toTimeZone();
        boolean boolean68 = timeZone4.hasSameRules(timeZone67);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4287246751L + "'", long3 == 4287246751L);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 724 + "'", int22 == 724);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 724 + "'", int23 == 724);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+100:00" + "'", str25, "+100:00");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 122 + "'", int29 == 122);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(copticChronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(property62);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(timeZone67);
        org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology2.getZone();
        org.joda.time.DurationField durationField7 = copticChronology2.centuries();
        org.joda.time.DurationField durationField8 = copticChronology2.weeks();
        java.lang.String str9 = copticChronology2.toString();
        org.joda.time.DurationField durationField10 = copticChronology2.days();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(obj0, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology2.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CopticChronology[UTC]" + "'", str9, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = copticChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 53, dateTimeZone21);
        org.joda.time.Chronology chronology23 = copticChronology12.withZone(dateTimeZone21);
        boolean boolean24 = copticChronology1.equals((java.lang.Object) copticChronology12);
        org.joda.time.DurationField durationField25 = copticChronology12.months();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DurationField durationField5 = copticChronology2.hours();
        int int6 = copticChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.monthOfYear();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj0, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology2.getZone();
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DurationField durationField5 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology1.weeks();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = copticChronology1.get(readablePeriod9, 4287441335L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        boolean boolean6 = copticChronology1.equals((java.lang.Object) (byte) 100);
        org.joda.time.DurationField durationField7 = copticChronology1.weeks();
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        long long11 = durationField8.getValueAsLong(4287610752L, 4287805773L);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.secondOfMinute();
        java.lang.String str8 = property7.getAsShortText();
        boolean boolean9 = property7.isLeap();
        org.joda.time.LocalDateTime localDateTime10 = property7.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfCentury(124);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 124 for yearOfCentury must be in the range [1,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "33" + "'", str8, "33");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DurationField durationField5 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.hourOfDay();
        org.joda.time.Chronology chronology9 = copticChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.minuteOfHour();
        org.joda.time.DurationField durationField15 = copticChronology1.hours();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology1.add(readablePeriod16, 951144980453L, 53740549);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 951144980453L + "'", long19 == 951144980453L);
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(951144880562L, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusSeconds(862);
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.yearOfEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.DurationField durationField6 = copticChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.minuteOfDay();
        org.joda.time.Chronology chronology10 = copticChronology1.withUTC();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.millisOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.minusDays(0);
        int int12 = localDateTime11.getMinuteOfHour();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minus(readableDuration13);
        java.util.Date date15 = localDateTime14.toDate();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Feb 21 15:03:33 GMT+00:00 2022");
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.centuries();
        org.joda.time.DurationField durationField5 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField9 = copticChronology1.millis();
        org.joda.time.DurationField durationField10 = copticChronology1.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField12 = copticChronology1.halfdays();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        int int14 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.weekyear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMinuteOfHour(10);
        boolean boolean26 = localDateTime9.isEqual((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.DateTime dateTime28 = localDateTime25.toDateTime(readableInstant27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.weekyear();
        org.joda.time.LocalDateTime localDateTime39 = property37.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField40 = property37.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime41 = property37.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.year();
        org.joda.time.LocalDateTime localDateTime45 = property43.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.monthOfYear();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.withMillisOfSecond((int) (byte) 1);
        int int61 = localDateTime48.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.LocalDateTime.Property property62 = localDateTime56.weekyear();
        org.joda.time.LocalDateTime.Property property63 = localDateTime56.millisOfDay();
        org.joda.time.LocalDateTime localDateTime64 = property63.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime65 = property63.roundCeilingCopy();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(chronology66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime67.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.weekyear();
        org.joda.time.LocalDateTime localDateTime76 = property74.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField77 = property74.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime78 = property74.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.plusWeeks(522);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.chrono.CopticChronology copticChronology82 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone81);
        org.joda.time.DateTimeField dateTimeField83 = copticChronology82.clockhourOfDay();
        org.joda.time.DurationField durationField84 = copticChronology82.weekyears();
        org.joda.time.DateTimeField dateTimeField85 = copticChronology82.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone86 = copticChronology82.getZone();
        org.joda.time.LocalDateTime localDateTime87 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology82);
        org.joda.time.DurationField durationField88 = copticChronology82.weekyears();
        org.joda.time.DateTimeField dateTimeField89 = copticChronology82.hourOfHalfday();
        org.joda.time.DurationField durationField90 = copticChronology82.hours();
        org.joda.time.DurationFieldType durationFieldType91 = durationField90.getType();
        org.joda.time.LocalDateTime localDateTime93 = localDateTime78.withFieldAdded(durationFieldType91, 0);
        boolean boolean94 = localDateTime65.isSupported(durationFieldType91);
        org.joda.time.LocalDateTime localDateTime96 = localDateTime45.withFieldAdded(durationFieldType91, 45);
        int int97 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime.Property property98 = localDateTime25.yearOfEra();
        org.joda.time.DurationField durationField99 = property98.getDurationField();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(durationField77);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(copticChronology82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertNotNull(durationField84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(dateTimeZone86);
        org.junit.Assert.assertNotNull(localDateTime87);
        org.junit.Assert.assertNotNull(durationField88);
        org.junit.Assert.assertNotNull(dateTimeField89);
        org.junit.Assert.assertNotNull(durationField90);
        org.junit.Assert.assertNotNull(durationFieldType91);
        org.junit.Assert.assertNotNull(localDateTime93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(localDateTime96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1 + "'", int97 == 1);
        org.junit.Assert.assertNotNull(property98);
        org.junit.Assert.assertNotNull(durationField99);
    }

    @Test
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = copticChronology2.weekyears();
        org.joda.time.DurationField durationField5 = copticChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((-9676800000L), (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DurationField durationField9 = copticChronology2.hours();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology2.hours();
        org.joda.time.DurationField durationField12 = copticChronology2.days();
        org.joda.time.DurationField durationField13 = copticChronology2.seconds();
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u56fd", "35", "2022-02-14T14:54:30.779");
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = locale4.getScript();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.clockhourOfDay();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str11 = dateTimeField8.getAsText((long) 'a', locale10);
        java.lang.String str12 = locale4.getDisplayName(locale10);
        java.lang.String str13 = locale10.getDisplayName();
        java.lang.String str14 = locale10.getDisplayVariant();
        java.lang.String str15 = locale10.getDisplayVariant();
        java.lang.String str16 = locale10.getISO3Country();
        java.lang.String str17 = locale10.getVariant();
        java.lang.String str18 = locale3.getDisplayCountry(locale10);
        java.lang.String str19 = locale10.getCountry();
        boolean boolean20 = locale10.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd_35_2022-02-14T14:54:30.779");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "24" + "'", str11, "24");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tedesco (Germania)" + "'", str12, "tedesco (Germania)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "italien" + "'", str13, "italien");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35" + "'", str18, "35");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.centuries();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime6.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) 10);
        long long13 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime9, 3490L);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.yearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology1.halfdays();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10597996800000L + "'", long13 == 10597996800000L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekyear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.minusDays(0);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.weekyear();
        org.joda.time.LocalDateTime localDateTime34 = property32.setCopy((int) (byte) 1);
        long long35 = property32.remainder();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.DateTime dateTime45 = localDateTime43.toDateTime(readableInstant44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime43.millisOfDay();
        int int47 = property32.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        boolean boolean49 = property32.equals((java.lang.Object) 126L);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property32.getFieldType();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime23.withField(dateTimeFieldType50, 649);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime23.withDayOfMonth(7);
        long long56 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime54, 4287227101L);
        org.joda.time.DurationField durationField57 = copticChronology1.years();
        org.joda.time.DurationField durationField58 = copticChronology1.millis();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 4287814023L + "'", long35 == 4287814023L);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
// flaky:         org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10596841414001L + "'", long56 == 10596841414001L);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(durationField58);
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology1.halfdays();
        org.joda.time.DurationField durationField10 = copticChronology1.hours();
        boolean boolean11 = durationField10.isPrecise();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.dayOfMonth();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plusWeeks((int) (byte) 10);
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localDateTime13, locale14);
        java.util.Set<java.lang.String> strSet16 = locale14.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet17 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet17.clear();
        java.lang.Object[] objArray19 = strSet17.toArray();
        boolean boolean20 = strSet16.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream21 = strSet16.stream();
        java.lang.String str22 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet16);
        strSet16.clear();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2" + "'", str15, "2");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology1.hours();
        int int5 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology1.seconds();
        org.joda.time.DurationField durationField8 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = copticChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology12.hours();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology12.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(49L, dateTimeZone17);
        org.joda.time.Chronology chronology20 = copticChronology1.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfCentury();
        int int24 = dateTimeField22.getLeapAmount(4287540319L);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = dateTimeField22.getType();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.weekyear();
        org.joda.time.LocalDateTime localDateTime37 = property35.setCopy((int) (byte) 1);
        long long38 = property35.remainder();
        java.lang.String str39 = property35.getName();
        java.lang.String str40 = property35.toString();
        java.util.Locale locale42 = new java.util.Locale("53623080");
        int int43 = property35.getMaximumShortTextLength(locale42);
        java.lang.String str44 = dateTimeField22.getAsShortText(752, locale42);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 4287814078L + "'", long38 == 4287814078L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "weekyear" + "'", str39, "weekyear");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Property[weekyear]" + "'", str40, "Property[weekyear]");
        org.junit.Assert.assertEquals(locale42.toString(), "53623080");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "752" + "'", str44, "752");
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.era();
        org.joda.time.DurationField durationField2 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology1.days();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.monthOfYear();
        org.joda.time.DurationField durationField10 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.dayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusWeeks((int) (byte) 10);
        java.util.Locale locale23 = java.util.Locale.PRC;
        java.lang.String str24 = dateTimeField14.getAsText((org.joda.time.ReadablePartial) localDateTime22, locale23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withDayOfMonth(26);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plusWeeks(86399999);
        java.util.Locale locale32 = new java.util.Locale("52", "2022-02-14T14:55:01.026");
        java.lang.String str33 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) localDateTime22, 615, locale32);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2" + "'", str24, "2");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertEquals(locale32.toString(), "52_2022-02-14T14:55:01.026");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "615" + "'", str33, "615");
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        int int14 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        java.lang.String str15 = localDateTime9.toString();
        org.joda.time.Chronology chronology16 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime.Property property17 = localDateTime9.minuteOfHour();
        int int18 = localDateTime9.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022-02-21T15:03:34.117" + "'", str15, "2022-02-21T15:03:34.117");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test16650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16650");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test16651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16651");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology1.weeks();
        org.joda.time.DurationField durationField8 = copticChronology1.hours();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.dayOfWeek();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = localDateTime15.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology23.secondOfDay();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) copticChronology23);
        int int28 = localDateTime27.getDayOfYear();
        boolean boolean29 = localDateTime20.isEqual((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology31.centuryOfEra();
        org.joda.time.DurationField durationField34 = copticChronology31.millis();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology31.weekOfWeekyear();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withMillisOfSecond((int) (byte) 1);
        int int50 = localDateTime37.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime.Property property51 = localDateTime45.weekyear();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime45.minusMillis(2022);
        int[] intArray55 = copticChronology31.get((org.joda.time.ReadablePartial) localDateTime45, (long) '#');
        int int56 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localDateTime27, intArray55);
        org.joda.time.LocalDateTime.Property property57 = localDateTime27.monthOfYear();
        java.lang.String str58 = localDateTime27.toString();
        org.joda.time.LocalDateTime.Property property59 = localDateTime27.era();
        long long61 = copticChronology1.set((org.joda.time.ReadablePartial) localDateTime27, 943200054L);
        org.joda.time.DateTimeField dateTimeField62 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField63 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField64 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField65 = copticChronology1.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 113 + "'", int28 == 113);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(copticChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1686, 4, 23, 35]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1686-04-23T00:00:00.010" + "'", str58, "1686-04-23T00:00:00.010");
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L + "'", long61 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
    }

    @Test
    public void test16652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16652");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField11 = property8.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Chronology chronology17 = copticChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology13.year();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology13.minuteOfDay();
        org.joda.time.DurationField durationField22 = copticChronology13.seconds();
        boolean boolean23 = property8.equals((java.lang.Object) durationField22);
        int int24 = property8.get();
        java.lang.String str25 = property8.getAsString();
        org.joda.time.LocalDateTime localDateTime27 = property8.setCopy(336);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.weekyear();
        org.joda.time.Interval interval37 = property36.toInterval();
        boolean boolean38 = property36.isLeap();
        java.lang.String str39 = property36.getAsText();
        java.lang.String str40 = property36.getAsText();
        org.joda.time.Interval interval41 = property36.toInterval();
        org.joda.time.LocalDateTime localDateTime42 = property36.withMaximumValue();
        org.joda.time.DateTime dateTime43 = localDateTime42.toDateTime();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.weekOfWeekyear();
        java.lang.String str49 = property48.getAsText();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property55 = localDateTime53.centuryOfEra();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(chronology56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime57.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.DateTime dateTime65 = localDateTime63.toDateTime(readableInstant64);
        java.util.Locale locale66 = java.util.Locale.GERMANY;
        boolean boolean67 = locale66.hasExtensions();
        boolean boolean68 = dateTime65.equals((java.lang.Object) locale66);
        int int69 = property55.getDifference((org.joda.time.ReadableInstant) dateTime65);
        int int70 = property48.compareTo((org.joda.time.ReadableInstant) dateTime65);
        boolean boolean71 = dateTime43.isAfter((org.joda.time.ReadableInstant) dateTime65);
        int int72 = property8.compareTo((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2000 + "'", int24 == 2000);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2000" + "'", str25, "2000");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2000" + "'", str39, "2000");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2000" + "'", str40, "2000");
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "7" + "'", str49, "7");
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test16653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16653");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(4287291576L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDurationAdded(readableDuration2, 342);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis((int) '#');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = dateTime16.isSupported(dateTimeFieldType17);
        long long19 = dateTime16.getMillis();
        org.joda.time.Chronology chronology20 = dateTime16.getChronology();
        org.joda.time.DateTime dateTime21 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.tz.Provider provider22 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider22);
        org.joda.time.DateTimeZone dateTimeZone25 = provider22.getZone("2022-02-14T14:53:44.313");
        org.joda.time.DateTimeZone.setProvider(provider22);
        org.joda.time.DateTimeZone.setProvider(provider22);
        java.util.Set<java.lang.String> strSet28 = provider22.getAvailableIDs();
        java.util.Set<java.lang.String> strSet29 = provider22.getAvailableIDs();
        java.util.Set<java.lang.String> strSet30 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet30.clear();
        int int32 = strSet30.size();
        java.lang.String[] strArray38 = new java.lang.String[] { "10", "UTC", "10", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        java.util.Iterator<java.lang.String> strItor41 = strSet39.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator42 = strSet39.spliterator();
        java.lang.Object[] objArray43 = strSet39.toArray();
        boolean boolean44 = strSet30.retainAll((java.util.Collection<java.lang.String>) strSet39);
        boolean boolean45 = strSet29.retainAll((java.util.Collection<java.lang.String>) strSet39);
        boolean boolean46 = dateTime16.equals((java.lang.Object) strSet39);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 951145414206L + "'", long19 == 951145414206L);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(provider22);
        org.junit.Assert.assertNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strItor41);
        org.junit.Assert.assertNotNull(strSpliterator42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, UTC, hi!, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, UTC, hi!, ]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test16654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16654");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField3 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField5 = copticChronology1.days();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.dayOfMonth();
        long long9 = dateTimeField6.getDifferenceAsLong(10597446097046L, (long) (-292269338));
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 122659L + "'", long9 == 122659L);
    }

    @Test
    public void test16655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16655");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField14 = copticChronology1.days();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test16656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16656");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test16657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16657");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = dateTimeField2.getAsText((long) 'a', locale4);
        long long8 = dateTimeField2.add((long) (short) -1, (int) (byte) -1);
        long long10 = dateTimeField2.roundHalfEven((long) (byte) 0);
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = locale12.getScript();
        java.lang.String str14 = locale12.getDisplayVariant();
        java.lang.String str15 = dateTimeField2.getAsShortText(360000000, locale12);
        long long18 = dateTimeField2.add((long) 8035, 3);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withMillisOfSecond((int) (byte) 1);
        int int33 = localDateTime20.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        java.lang.String str34 = localDateTime28.toString();
        org.joda.time.Chronology chronology35 = localDateTime28.getChronology();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = copticChronology37.dayOfMonth();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.plusWeeks((int) (byte) 10);
        java.util.Locale locale47 = java.util.Locale.PRC;
        java.lang.String str48 = dateTimeField38.getAsText((org.joda.time.ReadablePartial) localDateTime46, locale47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.plus(readablePeriod49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.withCenturyOfEra(522);
        org.joda.time.LocalDateTime.Property property53 = localDateTime46.dayOfWeek();
        int int54 = property53.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime55 = property53.roundHalfEvenCopy();
        boolean boolean56 = localDateTime28.equals((java.lang.Object) localDateTime55);
        java.util.Locale locale58 = null;
        java.lang.String str59 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime55, 444, locale58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime55.plusSeconds(49);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "24" + "'", str5, "24");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3600001L) + "'", long8 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "360000000" + "'", str15, "360000000");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10808035L + "'", long18 == 10808035L);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2022-02-21T15:03:34.256" + "'", str34, "2022-02-21T15:03:34.256");
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(copticChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2" + "'", str48, "2");
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "444" + "'", str59, "444");
        org.junit.Assert.assertNotNull(localDateTime61);
    }

    @Test
    public void test16658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16658");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = copticChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology2.days();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(4287241809L, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology2.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology2.getZone();
        org.joda.time.DurationField durationField15 = copticChronology2.weeks();
        int int17 = durationField15.getValue(189345600000L);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 313 + "'", int17 == 313);
    }
}
