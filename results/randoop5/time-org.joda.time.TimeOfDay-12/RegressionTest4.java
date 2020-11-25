import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 3);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(991);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addNoWrapToCopy(0);
        org.joda.time.TimeOfDay timeOfDay8 = property4.addWrapFieldToCopy((-1));
        org.joda.time.DurationField durationField9 = property4.getRangeDurationField();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology5 = timeOfDay4.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusMinutes(0);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        int int9 = timeOfDay7.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.LocalTime localTime16 = timeOfDay12.toLocalTime();
        org.joda.time.TimeOfDay.Property property17 = timeOfDay12.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay12.plus(readablePeriod18);
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay22.minusMinutes(0);
        org.joda.time.DateTime dateTime26 = timeOfDay25.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property27 = timeOfDay25.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay25.withHourOfDay(1);
        boolean boolean30 = timeOfDay19.equals((java.lang.Object) timeOfDay25);
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology41 = timeOfDay40.getChronology();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology41);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology41);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay19, chronology41);
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay7.withChronologyRetainFields(chronology41);
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay((int) (byte) 10, (int) (short) 1, chronology41);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(timeOfDay45);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        int int10 = property6.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay12 = property6.addToCopy(0);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay16.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property20 = timeOfDay16.millisOfSecond();
        java.lang.Object obj21 = null;
        boolean boolean22 = property20.equals(obj21);
        java.lang.String str23 = property20.getName();
        int int24 = property20.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay26 = property20.addToCopy(0);
        int int27 = timeOfDay26.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay26.minusMinutes(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = timeOfDay26.getFieldType((int) (short) 1);
        org.joda.time.TimeOfDay.Property property32 = timeOfDay12.property(dateTimeFieldType31);
        java.lang.String str33 = property32.getAsString();
        java.lang.String str34 = property32.getName();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 999 + "'", int10 == 999);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "millisOfSecond" + "'", str23, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 999 + "'", int24 == 999);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "minuteOfHour" + "'", str34, "minuteOfHour");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay2.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusHours(59);
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay.Property property16 = timeOfDay13.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay13.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = timeOfDay24.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology25);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(chronology25);
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay13.withChronologyRetainFields(chronology25);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.withPeriodAdded(readablePeriod29, 4);
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay31.plusMinutes((int) (short) 100);
        boolean boolean34 = timeOfDay10.isAfter((org.joda.time.ReadablePartial) timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }
}

