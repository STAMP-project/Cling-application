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
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.plusHours((int) (short) -1);
        int int8 = timeOfDay7.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay((long) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property17 = timeOfDay13.millisOfSecond();
        int int18 = property17.get();
        org.joda.time.DurationField durationField19 = property17.getDurationField();
        java.lang.Class<?> wildcardClass20 = durationField19.getClass();
        boolean boolean21 = timeOfDay10.equals((java.lang.Object) durationField19);
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = timeOfDay24.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = timeOfDay24.getFieldTypes();
        org.joda.time.TimeOfDay.Property property27 = timeOfDay24.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay24.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology36);
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(chronology36);
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay24.withChronologyRetainFields(chronology36);
        org.joda.time.TimeOfDay timeOfDay40 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay40.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology43 = timeOfDay42.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray44 = timeOfDay42.getFieldTypes();
        org.joda.time.TimeOfDay.Property property45 = timeOfDay42.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay42.minusHours(999);
        org.joda.time.TimeOfDay.Property property48 = timeOfDay47.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property48.getFieldType();
        boolean boolean50 = timeOfDay24.isSupported(dateTimeFieldType49);
        int int51 = timeOfDay10.indexOf(dateTimeFieldType49);
        int int52 = timeOfDay7.get(dateTimeFieldType49);
        org.joda.time.TimeOfDay.Property property53 = timeOfDay7.minuteOfHour();
        int int54 = property53.getMaximumValue();
        int int55 = property53.get();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 59 + "'", int54 == 59);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay6.withChronologyRetainFields(chronology12);
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(880, 22, 445, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 880 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay14);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.joda.time.DurationField durationField13 = property6.getDurationField();
        org.joda.time.TimeOfDay timeOfDay14 = property6.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay15 = property6.getTimeOfDay();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 999 + "'", int10 == 999);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay15);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology12);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology12);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(chronology12);
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((int) (short) -1, 48, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay3 = property1.addNoWrapToCopy((int) (byte) 1);
        int int4 = property1.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay5 = property1.withMinimumValue();
        java.lang.String str6 = property1.getAsShortText();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "89" + "'", str6, "89");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology5 = timeOfDay4.getChronology();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(chronology5);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) (short) 0, chronology5);
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology5);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay11.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay11.minusHours(999);
        org.joda.time.TimeOfDay.Property property17 = timeOfDay16.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property17.getFieldType();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay8.withField(dateTimeFieldType18, (int) '#');
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay8.minusMillis((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay25.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property29 = timeOfDay25.millisOfSecond();
        java.lang.Object obj30 = null;
        boolean boolean31 = property29.equals(obj30);
        java.lang.String str32 = property29.getName();
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay35.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay35.plusHours((int) (short) -1);
        int int41 = property29.compareTo((org.joda.time.ReadablePartial) timeOfDay40);
        org.joda.time.TimeOfDay timeOfDay42 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay42.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology45 = timeOfDay44.getChronology();
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay44.minusMinutes(0);
        boolean boolean48 = property29.equals((java.lang.Object) timeOfDay44);
        org.joda.time.TimeOfDay timeOfDay50 = property29.addNoWrapToCopy((int) (short) 10);
        org.joda.time.TimeOfDay.Property property51 = timeOfDay50.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay50.minusMillis((int) (byte) 10);
        boolean boolean54 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay50);
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay8.plusSeconds((int) (short) 100);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "millisOfSecond" + "'", str32, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(timeOfDay56);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withChronologyRetainFields(chronology8);
        int int10 = timeOfDay2.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay2.plusMinutes((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay15.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay15.millisOfSecond();
        int int20 = timeOfDay15.getMillisOfSecond();
        boolean boolean21 = timeOfDay2.isBefore((org.joda.time.ReadablePartial) timeOfDay15);
        org.joda.time.TimeOfDay.Property property22 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay24 = property22.setCopy(177);
        org.joda.time.LocalTime localTime25 = timeOfDay24.toLocalTime();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology5 = timeOfDay4.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay4.millisOfSecond();
        java.lang.Object obj9 = null;
        boolean boolean10 = property8.equals(obj9);
        java.lang.String str11 = property8.getName();
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay14.plusHours((int) (short) -1);
        int int20 = property8.compareTo((org.joda.time.ReadablePartial) timeOfDay19);
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology24 = timeOfDay23.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay23.minusMinutes(0);
        boolean boolean27 = property8.equals((java.lang.Object) timeOfDay23);
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay30.minusMinutes(0);
        org.joda.time.DateTime dateTime34 = timeOfDay33.toDateTimeToday();
        org.joda.time.DateTime dateTime35 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime36 = timeOfDay1.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay1.plusMillis(20);
        int int39 = timeOfDay38.size();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "millisOfSecond" + "'", str11, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay9.minusMinutes(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = timeOfDay9.toString(dateTimeFormatter13);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay9.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        int int17 = timeOfDay6.get(dateTimeFieldType16);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay20.millisOfSecond();
        int int25 = property24.getMaximumValueOverall();
        java.util.Locale locale26 = null;
        int int27 = property24.getMaximumTextLength(locale26);
        org.joda.time.TimeOfDay timeOfDay29 = property24.addToCopy(677);
        int[] intArray30 = timeOfDay29.getValues();
        int int31 = timeOfDay6.compareTo((org.joda.time.ReadablePartial) timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "T00:00:00.001" + "'", str14, "T00:00:00.001");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 999 + "'", int25 == 999);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0, 678]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMillis((int) (byte) -1);
        int int8 = timeOfDay7.size();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusMillis((int) (short) 0);
        int int11 = property4.compareTo((org.joda.time.ReadablePartial) timeOfDay10);
        org.joda.time.TimeOfDay timeOfDay12 = property4.withMinimumValue();
        org.joda.time.DurationField durationField13 = property4.getRangeDurationField();
        java.lang.String str14 = property4.getAsString();
        org.joda.time.TimeOfDay timeOfDay15 = property4.getTimeOfDay();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNotNull(timeOfDay15);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay2.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.plus(readablePeriod8);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay15.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay15.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay15.minusHours(999);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay20.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property21.getFieldType();
        boolean boolean23 = timeOfDay10.isSupported(dateTimeFieldType22);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay9.property(dateTimeFieldType22);
        org.joda.time.TimeOfDay.Property property25 = timeOfDay9.minuteOfHour();
        int int26 = property25.get();
        org.joda.time.TimeOfDay timeOfDay27 = property25.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay29 = property25.addWrapFieldToCopy(3);
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.minusMinutes(12);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay31);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay3 = property1.addWrapFieldToCopy(999);
        java.util.Locale locale4 = null;
        int int5 = property1.getMaximumShortTextLength(locale4);
        org.joda.time.TimeOfDay timeOfDay6 = property1.getTimeOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property1.getFieldType();
        org.joda.time.TimeOfDay timeOfDay8 = property1.withMinimumValue();
        java.lang.String str9 = property1.getAsString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(timeOfDay8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "769" + "'", str9, "769");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology10);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay17 = property15.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis(0);
        int int20 = timeOfDay19.getMillisOfSecond();
        int int21 = timeOfDay19.size();
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 872 + "'", int20 == 872);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.String str7 = property6.getName();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumShortTextLength(locale8);
        org.joda.time.TimeOfDay timeOfDay11 = property6.addNoWrapToCopy(3);
        java.util.Locale locale12 = null;
        java.lang.String str13 = property6.getAsText(locale12);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "millisOfSecond" + "'", str7, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withChronologyRetainFields(chronology8);
        int int10 = timeOfDay2.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay2.plusMinutes((int) (byte) 0);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay2.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay15 = property13.addToCopy(177);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(timeOfDay15);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.plusHours((int) (short) -1);
        int int18 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay21.minusMinutes(0);
        boolean boolean25 = property6.equals((java.lang.Object) timeOfDay21);
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.minusMinutes(0);
        org.joda.time.DateTime dateTime32 = timeOfDay31.toDateTimeToday();
        org.joda.time.DateTime dateTime33 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay21.plus(readablePeriod34);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay21.plusSeconds(10);
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology41 = timeOfDay40.getChronology();
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay40.minusMinutes(0);
        org.joda.time.DateTime dateTime44 = timeOfDay43.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property45 = timeOfDay43.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay46 = property45.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.minusMinutes((int) (byte) 10);
        org.joda.time.TimeOfDay.Property property49 = timeOfDay46.secondOfMinute();
        boolean boolean50 = timeOfDay21.isAfter((org.joda.time.ReadablePartial) timeOfDay46);
        int int51 = timeOfDay21.getHourOfDay();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.String str7 = property6.toString();
        org.joda.time.DurationField durationField8 = property6.getDurationField();
        int int9 = property6.get();
        org.joda.time.TimeOfDay timeOfDay11 = property6.addToCopy((int) ' ');
        java.lang.String str12 = property6.getName();
        java.lang.String str13 = property6.getAsString();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay16 = property6.setCopy("T01:35:14.316", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"T01:35:14.316\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[millisOfSecond]" + "'", str7, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "millisOfSecond" + "'", str12, "millisOfSecond");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        org.joda.time.DurationField durationField13 = property6.getDurationField();
        org.joda.time.TimeOfDay timeOfDay14 = property6.withMinimumValue();
        java.lang.String str15 = property6.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusHours((int) '#');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = timeOfDay18.getFieldTypes();
        org.joda.time.DateTimeField[] dateTimeFieldArray20 = timeOfDay18.getFields();
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday();
        int int22 = property6.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 999 + "'", int10 == 999);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(dateTimeFieldArray20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology4 = timeOfDay3.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay3.getFieldTypes();
        org.joda.time.TimeOfDay.Property property6 = timeOfDay3.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay3.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology15);
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(chronology15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay3.withChronologyRetainFields(chronology15);
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, chronology15);
        org.joda.time.LocalTime localTime20 = timeOfDay19.toLocalTime();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay19.minus(readablePeriod21);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.plusMillis(15);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology5 = timeOfDay4.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay4.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay4.minusHours(999);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(16, 15, chronology10);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(105, 0, 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 105 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.minusMinutes(0);
        org.joda.time.LocalTime localTime14 = timeOfDay10.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay10.withHourOfDay((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = timeOfDay16.toDateTimeToday(dateTimeZone17);
        int int19 = property7.compareTo((org.joda.time.ReadableInstant) dateTime18);
        int int20 = property7.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField21 = property7.getField();
        org.joda.time.TimeOfDay timeOfDay22 = property7.getTimeOfDay();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property7.getAsShortText(locale23);
        java.util.Locale locale25 = null;
        int int26 = property7.getMaximumShortTextLength(locale25);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.plusHours((int) (short) -1);
        int int18 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay17.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay21 = property19.setCopy((int) ' ');
        org.joda.time.TimeOfDay timeOfDay23 = property19.addWrapFieldToCopy(13);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property19.getFieldType();
        boolean boolean26 = property19.equals((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay28 = property19.setCopy("T23:00:00.001");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"T23:00:00.001\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        java.lang.String str10 = property6.getAsShortText();
        java.lang.String str11 = property6.getAsShortText();
        int int12 = property6.get();
        java.lang.String str13 = property6.toString();
        java.lang.String str14 = property6.getName();
        org.joda.time.TimeOfDay timeOfDay16 = property6.addToCopy(872);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Property[millisOfSecond]" + "'", str13, "Property[millisOfSecond]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "millisOfSecond" + "'", str14, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay16);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(37, (int) (short) 0, 677, 592);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology4 = timeOfDay3.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(chronology4);
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) 35, chronology4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeOfDay6.getValue(16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withChronologyRetainFields(chronology8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay2.withHourOfDay((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay2.minusMillis(13);
        int[] intArray14 = timeOfDay13.getValues();
        int int15 = timeOfDay13.getHourOfDay();
        org.joda.time.Chronology chronology16 = timeOfDay13.getChronology();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[12, 59, 59, 987]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 37);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay9.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay9.millisOfSecond();
        java.lang.Object obj14 = null;
        boolean boolean15 = property13.equals(obj14);
        java.lang.String str16 = property13.getName();
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology20 = timeOfDay19.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay19.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay19.plusHours((int) (short) -1);
        int int25 = property13.compareTo((org.joda.time.ReadablePartial) timeOfDay24);
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.minusMinutes(0);
        boolean boolean32 = property13.equals((java.lang.Object) timeOfDay28);
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay35.minusMinutes(0);
        org.joda.time.DateTime dateTime39 = timeOfDay38.toDateTimeToday();
        org.joda.time.DateTime dateTime40 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay28.plus(readablePeriod41);
        int int43 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay28);
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay28.plusSeconds((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay46 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology49 = timeOfDay48.getChronology();
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay48.minusMinutes(0);
        org.joda.time.DateTime dateTime52 = timeOfDay51.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property53 = timeOfDay51.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay54 = property53.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay55 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay55.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology58 = timeOfDay57.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray59 = timeOfDay57.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay57.withSecondOfMinute(0);
        int int62 = property53.compareTo((org.joda.time.ReadablePartial) timeOfDay57);
        int[] intArray63 = timeOfDay57.getValues();
        boolean boolean64 = timeOfDay28.isAfter((org.joda.time.ReadablePartial) timeOfDay57);
        org.joda.time.TimeOfDay.Property property65 = timeOfDay57.millisOfSecond();
        int int66 = timeOfDay57.getHourOfDay();
        java.util.Locale locale68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = timeOfDay57.toString("hi!", locale68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "millisOfSecond" + "'", str16, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray59);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.withHourOfDay(22);
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusMillis((int) (byte) -1);
        int int7 = timeOfDay6.size();
        org.joda.time.TimeOfDay.Property property8 = timeOfDay6.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        int int12 = timeOfDay11.size();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusMillis((int) (short) 0);
        int int15 = property8.compareTo((org.joda.time.ReadablePartial) timeOfDay14);
        org.joda.time.TimeOfDay timeOfDay16 = property8.withMinimumValue();
        org.joda.time.DurationField durationField17 = property8.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField18 = property8.getField();
        org.joda.time.TimeOfDay timeOfDay20 = property8.setCopy(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property8.getFieldType();
        org.joda.time.TimeOfDay timeOfDay23 = property8.setCopy((int) ' ');
        int int24 = timeOfDay1.compareTo((org.joda.time.ReadablePartial) timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology4 = timeOfDay3.getChronology();
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay3.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property7 = timeOfDay3.millisOfSecond();
        java.lang.Object obj8 = null;
        boolean boolean9 = property7.equals(obj8);
        java.lang.String str10 = property7.getName();
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay13.plusHours((int) (short) -1);
        int int19 = property7.compareTo((org.joda.time.ReadablePartial) timeOfDay18);
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay22.minusMinutes(0);
        boolean boolean26 = property7.equals((java.lang.Object) timeOfDay22);
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.minusMinutes(0);
        org.joda.time.DateTime dateTime33 = timeOfDay32.toDateTimeToday();
        org.joda.time.DateTime dateTime34 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay22.plus(readablePeriod35);
        org.joda.time.Chronology chronology37 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 100, chronology37);
        org.joda.time.TimeOfDay timeOfDay39 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay39.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology42 = timeOfDay41.getChronology();
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay41.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property45 = timeOfDay41.millisOfSecond();
        int int46 = timeOfDay41.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay41.minusMillis((int) (byte) 1);
        int int49 = timeOfDay38.compareTo((org.joda.time.ReadablePartial) timeOfDay48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay38.plus(readablePeriod50);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "millisOfSecond" + "'", str10, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(timeOfDay51);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology5 = timeOfDay4.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusMinutes(0);
        org.joda.time.LocalTime localTime8 = timeOfDay4.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay4.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay4.minusSeconds(0);
        boolean boolean13 = timeOfDay1.isEqual((org.joda.time.ReadablePartial) timeOfDay12);
        int int15 = timeOfDay12.getValue(1);
        int int16 = timeOfDay12.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay((int) (byte) 1, (int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay22.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property26 = timeOfDay22.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay22.plusMillis((int) '#');
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.withMillisOfSecond(100);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay28.minusHours((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay35.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property39 = timeOfDay35.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay40 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay40.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology43 = timeOfDay42.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray44 = timeOfDay42.getFieldTypes();
        org.joda.time.TimeOfDay.Property property45 = timeOfDay42.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay42.minusHours(999);
        org.joda.time.TimeOfDay.Property property48 = timeOfDay47.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property48.getFieldType();
        java.lang.String str50 = property48.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property48.getFieldType();
        org.joda.time.TimeOfDay.Property property52 = timeOfDay35.property(dateTimeFieldType51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property52.getFieldType();
        int int54 = timeOfDay32.indexOf(dateTimeFieldType53);
        boolean boolean55 = timeOfDay19.isSupported(dateTimeFieldType53);
        int int56 = timeOfDay12.get(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0" + "'", str50, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay2.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.plus(readablePeriod8);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay15.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay15.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay15.minusHours(999);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay20.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property21.getFieldType();
        boolean boolean23 = timeOfDay10.isSupported(dateTimeFieldType22);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay9.property(dateTimeFieldType22);
        org.joda.time.TimeOfDay.Property property25 = timeOfDay9.minuteOfHour();
        int int26 = property25.get();
        org.joda.time.TimeOfDay timeOfDay27 = property25.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay29 = property25.addWrapFieldToCopy(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.withHourOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withChronologyRetainFields(chronology8);
        int int10 = timeOfDay2.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay2.plusMinutes((int) (byte) 0);
        int int13 = timeOfDay12.getHourOfDay();
        int int14 = timeOfDay12.getSecondOfMinute();
        int int15 = timeOfDay12.getSecondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay12.withPeriodAdded(readablePeriod16, (int) (byte) 100);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay12.minusMinutes((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay12.minusSeconds(3);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 13 + "'", int13 == 13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.DateTime dateTime6 = timeOfDay5.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = property7.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay11.withSecondOfMinute(0);
        int int16 = property7.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        java.util.Locale locale18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = property7.setCopy("0", locale18);
        org.joda.time.TimeOfDay timeOfDay20 = property7.withMaximumValue();
        int int21 = timeOfDay20.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.plus(readablePeriod22);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(timeOfDay23);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(12, 345, 11, 592);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 345 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        int int3 = timeOfDay2.size();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.DurationField durationField7 = property4.getRangeDurationField();
        org.joda.time.TimeOfDay timeOfDay9 = property4.setCopy(345);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(timeOfDay9);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.plusHours((int) (short) -1);
        int int18 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay21.minusMinutes(0);
        boolean boolean25 = property6.equals((java.lang.Object) timeOfDay21);
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.minusMinutes(0);
        org.joda.time.DateTime dateTime32 = timeOfDay31.toDateTimeToday();
        org.joda.time.DateTime dateTime33 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay21.plus(readablePeriod34);
        org.joda.time.TimeOfDay.Property property36 = timeOfDay35.hourOfDay();
        org.joda.time.TimeOfDay.Property property37 = timeOfDay35.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay35.plusMillis(48);
        org.joda.time.TimeOfDay.Property property40 = timeOfDay39.millisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.plusHours((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withMinuteOfHour((int) (short) 0);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay12.millisOfSecond();
        java.lang.Object obj17 = null;
        boolean boolean18 = property16.equals(obj17);
        java.lang.String str19 = property16.getName();
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay22.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay22.plusHours((int) (short) -1);
        int int28 = property16.compareTo((org.joda.time.ReadablePartial) timeOfDay27);
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology32 = timeOfDay31.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay31.minusMinutes(0);
        boolean boolean35 = property16.equals((java.lang.Object) timeOfDay31);
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology39 = timeOfDay38.getChronology();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay38.minusMinutes(0);
        org.joda.time.DateTime dateTime42 = timeOfDay41.toDateTimeToday();
        org.joda.time.DateTime dateTime43 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime44 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = timeOfDay2.toString(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "millisOfSecond" + "'", str19, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "T00:00:00.001" + "'", str46, "T00:00:00.001");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withChronologyRetainFields(chronology8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay2.withHourOfDay((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay2.minusMillis(13);
        int[] intArray14 = timeOfDay13.getValues();
        int int15 = timeOfDay13.getHourOfDay();
        org.joda.time.TimeOfDay.Property property16 = timeOfDay13.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology23);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(chronology23);
        org.joda.time.TimeOfDay.Property property26 = timeOfDay25.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusHours((int) '#');
        int int31 = timeOfDay28.getHourOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray32 = timeOfDay28.getFieldTypes();
        int int33 = property26.compareTo((org.joda.time.ReadablePartial) timeOfDay28);
        org.joda.time.TimeOfDay timeOfDay34 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay34.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology40 = timeOfDay39.getChronology();
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(chronology40);
        org.joda.time.Chronology chronology42 = timeOfDay41.getChronology();
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay36.withChronologyRetainFields(chronology42);
        int int44 = timeOfDay36.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay36.plusMinutes((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay36);
        int int48 = property26.compareTo((org.joda.time.ReadablePartial) timeOfDay36);
        org.joda.time.TimeOfDay timeOfDay50 = property26.setCopy(3);
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay50.minusMillis((int) (byte) 100);
        boolean boolean53 = timeOfDay13.isEqual((org.joda.time.ReadablePartial) timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[12, 59, 59, 987]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology6);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.TimeOfDay.Property property9 = timeOfDay8.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        org.joda.time.TimeOfDay timeOfDay12 = property9.addNoWrapToCopy(0);
        int int13 = timeOfDay12.size();
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay16.minusMinutes(0);
        org.joda.time.DateTime dateTime20 = timeOfDay19.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property21 = timeOfDay19.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay22 = property21.getTimeOfDay();
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(chronology29);
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay((long) (short) 0, chronology29);
        org.joda.time.TimeOfDay timeOfDay32 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology29);
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay22, chronology29);
        boolean boolean34 = timeOfDay12.isBefore((org.joda.time.ReadablePartial) timeOfDay22);
        int int35 = timeOfDay12.getMillisOfSecond();
        org.joda.time.Chronology chronology36 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology41 = timeOfDay40.getChronology();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(chronology41);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay((long) (short) 0, chronology41);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.minus(readablePeriod44);
        org.joda.time.TimeOfDay timeOfDay47 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay47.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology50 = timeOfDay49.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray51 = timeOfDay49.getFieldTypes();
        org.joda.time.TimeOfDay.Property property52 = timeOfDay49.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay49.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay58 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay60 = timeOfDay58.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology61 = timeOfDay60.getChronology();
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology61);
        org.joda.time.TimeOfDay timeOfDay63 = new org.joda.time.TimeOfDay(chronology61);
        org.joda.time.TimeOfDay timeOfDay64 = timeOfDay49.withChronologyRetainFields(chronology61);
        org.joda.time.TimeOfDay timeOfDay65 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, chronology61);
        org.joda.time.TimeOfDay timeOfDay66 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay45, chronology61);
        org.joda.time.TimeOfDay timeOfDay68 = timeOfDay45.withSecondOfMinute(0);
        int int69 = timeOfDay12.compareTo((org.joda.time.ReadablePartial) timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 73 + "'", int35 == 73);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(timeOfDay64);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay2.withChronologyRetainFields(chronology8);
        int int10 = timeOfDay2.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay2.plusMinutes((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay2.withSecondOfMinute((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay2.plusMinutes(59);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay2.getFieldTypes();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusHours((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeOfDay1.toString("T01:34:35.565");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology4 = timeOfDay3.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(chronology4);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.withChronologyRetainFields(chronology6);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.minusMinutes(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = timeOfDay11.toString(dateTimeFormatter15);
        java.lang.String str17 = timeOfDay11.toString();
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay20.millisOfSecond();
        java.lang.Object obj25 = null;
        boolean boolean26 = property24.equals(obj25);
        java.lang.String str27 = property24.getName();
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay30.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay30.plusHours((int) (short) -1);
        int int36 = property24.compareTo((org.joda.time.ReadablePartial) timeOfDay35);
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology40 = timeOfDay39.getChronology();
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay39.minusMinutes(0);
        boolean boolean43 = property24.equals((java.lang.Object) timeOfDay39);
        org.joda.time.TimeOfDay timeOfDay44 = property24.getTimeOfDay();
        java.lang.String str45 = timeOfDay44.toString();
        org.joda.time.TimeOfDay timeOfDay46 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology49 = timeOfDay48.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray50 = timeOfDay48.getFieldTypes();
        org.joda.time.TimeOfDay.Property property51 = timeOfDay48.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay48.minusHours(999);
        org.joda.time.TimeOfDay.Property property54 = timeOfDay53.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property54.getFieldType();
        org.joda.time.TimeOfDay.Property property56 = timeOfDay44.property(dateTimeFieldType55);
        int int57 = timeOfDay11.indexOf(dateTimeFieldType55);
        org.joda.time.TimeOfDay.Property property58 = timeOfDay7.property(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "T00:00:00.001" + "'", str16, "T00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "T00:00:00.001" + "'", str17, "T00:00:00.001");
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "millisOfSecond" + "'", str27, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "T00:00:00.001" + "'", str45, "T00:00:00.001");
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(property58);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) (byte) 100, chronology1);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.minusHours(999);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        int int10 = property8.get();
        int int11 = property8.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay13 = property8.setCopy((int) ' ');
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.minusMillis(59);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = timeOfDay15.toDateTimeToday(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.plusHours((int) (short) -1);
        int int18 = property6.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        org.joda.time.DateTimeField dateTimeField19 = property6.getField();
        java.lang.String str20 = property6.getAsText();
        int int21 = property6.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay23 = property6.setCopy((int) (short) 10);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay23.millisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
    }
}
