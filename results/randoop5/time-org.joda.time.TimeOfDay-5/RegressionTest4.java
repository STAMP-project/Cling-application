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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        org.joda.time.TimeOfDay timeOfDay21 = property19.addWrapFieldToCopy(999);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.minus(readablePeriod22);
        org.joda.time.TimeOfDay.Property property24 = timeOfDay23.secondOfMinute();
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
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay5.millisOfSecond();
        java.lang.String str7 = property6.getAsString();
        org.joda.time.TimeOfDay timeOfDay9 = property6.addNoWrapToCopy(0);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withMinuteOfHour(26);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay12.hourOfDay();
        int int15 = timeOfDay12.getValue((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology22);
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(chronology22);
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay12.withChronologyRetainFields(chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(17, 32, (int) (byte) -1, 323, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(timeOfDay25);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        org.joda.time.DateTime dateTime37 = timeOfDay1.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay1.minusMinutes(23);
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
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(timeOfDay39);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        org.joda.time.DurationField durationField13 = property6.getRangeDurationField();
        java.lang.String str14 = property6.getName();
        org.joda.time.DurationField durationField15 = property6.getRangeDurationField();
        org.joda.time.TimeOfDay timeOfDay17 = property6.addNoWrapToCopy((int) '4');
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "millisOfSecond" + "'", str14, "millisOfSecond");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(timeOfDay17);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = timeOfDay16.getFieldTypes();
        org.joda.time.TimeOfDay.Property property19 = timeOfDay16.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay16.minusHours(999);
        org.joda.time.TimeOfDay.Property property22 = timeOfDay21.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        java.lang.String str24 = property22.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology28 = timeOfDay27.getChronology();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay27.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property31 = timeOfDay27.millisOfSecond();
        java.lang.Object obj32 = null;
        boolean boolean33 = property31.equals(obj32);
        java.lang.String str34 = property31.getName();
        int int35 = property31.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay37 = property31.addToCopy(0);
        java.lang.String str38 = property31.toString();
        org.joda.time.DateTimeField dateTimeField39 = property31.getField();
        boolean boolean40 = property22.equals((java.lang.Object) dateTimeField39);
        org.joda.time.TimeOfDay timeOfDay48 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay48.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology51 = timeOfDay50.getChronology();
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology51);
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology51);
        org.joda.time.TimeOfDay timeOfDay54 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay54.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology57 = timeOfDay56.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray58 = timeOfDay56.getFieldTypes();
        org.joda.time.TimeOfDay.Property property59 = timeOfDay56.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay56.minusHours(999);
        org.joda.time.TimeOfDay.Property property62 = timeOfDay61.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property62.getFieldType();
        int int64 = timeOfDay53.get(dateTimeFieldType63);
        org.joda.time.TimeOfDay timeOfDay66 = timeOfDay53.plusMinutes((int) '4');
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = timeOfDay66.toDateTimeToday(dateTimeZone67);
        int int69 = property22.compareTo((org.joda.time.ReadableInstant) dateTime68);
        int int70 = property4.compareTo((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.TimeOfDay timeOfDay71 = property4.getTimeOfDay();
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
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "millisOfSecond" + "'", str34, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 999 + "'", int35 == 999);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Property[millisOfSecond]" + "'", str38, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(timeOfDay71);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology10);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay17 = property15.addNoWrapToCopy(20);
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
        org.joda.time.TimeOfDay.Property property37 = timeOfDay35.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay39 = property37.setCopy((int) ' ');
        int int40 = property37.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property37.getFieldType();
        int int42 = timeOfDay17.indexOf(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(timeOfDay17);
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
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        java.lang.String str17 = property7.toString();
        int int18 = property7.getMaximumValueOverall();
        java.util.Locale locale19 = null;
        int int20 = property7.getMaximumTextLength(locale19);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Property[secondOfMinute]" + "'", str17, "Property[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.lang.String str9 = property6.getName();
        org.joda.time.DurationField durationField10 = property6.getDurationField();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property6.getAsShortText(locale11);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 4);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusHours((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.minusMinutes(13);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getAsString();
        org.joda.time.TimeOfDay timeOfDay12 = property6.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.plusHours(100);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay12.withMinuteOfHour(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = timeOfDay12.toString("T01:36:56.474");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology9 = timeOfDay8.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay((int) (byte) 1, (int) (byte) 10, chronology9);
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, 33, (int) (byte) 1, 56, chronology9);
        java.lang.String str12 = timeOfDay11.toString();
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "T00:33:01.056" + "'", str12, "T00:33:01.056");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusHours(23);
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology9 = timeOfDay8.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay8.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay8.millisOfSecond();
        java.lang.Object obj13 = null;
        boolean boolean14 = property12.equals(obj13);
        java.util.Locale locale15 = null;
        int int16 = property12.getMaximumShortTextLength(locale15);
        org.joda.time.TimeOfDay timeOfDay17 = property12.withMaximumValue();
        java.lang.String str19 = timeOfDay17.toString("0");
        int int20 = timeOfDay17.size();
        int int21 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
        java.util.Locale locale23 = null;
        java.lang.String str24 = timeOfDay17.toString("10", locale23);
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology28 = timeOfDay27.getChronology();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay27.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property31 = timeOfDay27.millisOfSecond();
        java.lang.Object obj32 = null;
        boolean boolean33 = property31.equals(obj32);
        java.util.Locale locale34 = null;
        int int35 = property31.getMaximumShortTextLength(locale34);
        java.lang.String str36 = property31.getAsString();
        org.joda.time.TimeOfDay timeOfDay37 = property31.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.plusHours(100);
        org.joda.time.TimeOfDay timeOfDay43 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology46 = timeOfDay45.getChronology();
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(chronology46);
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay((long) (short) 0, chronology46);
        org.joda.time.TimeOfDay timeOfDay49 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology46);
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay((long) (-1), chronology46);
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay39.withChronologyRetainFields(chronology46);
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay17, chronology46);
        int int53 = timeOfDay52.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay54 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay54.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology57 = timeOfDay56.getChronology();
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay56.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property60 = timeOfDay56.millisOfSecond();
        int int61 = property60.getMaximumValueOverall();
        java.util.Locale locale62 = null;
        int int63 = property60.getMaximumTextLength(locale62);
        org.joda.time.DateTimeField dateTimeField64 = property60.getField();
        org.joda.time.TimeOfDay timeOfDay66 = property60.addNoWrapToCopy((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay67 = property60.withMaximumValue();
        boolean boolean68 = timeOfDay52.isAfter((org.joda.time.ReadablePartial) timeOfDay67);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10" + "'", str24, "10");
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1" + "'", str36, "1");
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 999 + "'", int61 == 999);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 13);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plus(readablePeriod2);
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology7 = timeOfDay6.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay6.minusMinutes(0);
        org.joda.time.DateTime dateTime10 = timeOfDay9.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property11 = timeOfDay9.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay12 = property11.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMinutes((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.minusMinutes(0);
        org.joda.time.DateTime dateTime21 = timeOfDay20.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property22 = timeOfDay20.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay23 = property22.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusMinutes((int) (byte) 10);
        boolean boolean26 = timeOfDay12.isEqual((org.joda.time.ReadablePartial) timeOfDay23);
        boolean boolean27 = timeOfDay3.isBefore((org.joda.time.ReadablePartial) timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay2.withSecondOfMinute(0);
        org.joda.time.LocalTime localTime7 = timeOfDay6.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(chronology12);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay((long) (short) 0, chronology12);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minus(readablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray22 = timeOfDay20.getFieldTypes();
        org.joda.time.TimeOfDay.Property property23 = timeOfDay20.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay20.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology32 = timeOfDay31.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology32);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(chronology32);
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay20.withChronologyRetainFields(chronology32);
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, chronology32);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay16, chronology32);
        int int38 = localTime7.compareTo((org.joda.time.ReadablePartial) timeOfDay16);
        int[] intArray39 = timeOfDay16.getValues();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = timeOfDay16.getFieldTypes();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray40);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology6);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.TimeOfDay.Property property9 = timeOfDay8.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusHours((int) '#');
        int int14 = timeOfDay11.getHourOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay11.getFieldTypes();
        int int16 = property9.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(chronology23);
        org.joda.time.Chronology chronology25 = timeOfDay24.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay19.withChronologyRetainFields(chronology25);
        int int27 = timeOfDay19.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay19.plusMinutes((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay19);
        int int31 = property9.compareTo((org.joda.time.ReadablePartial) timeOfDay19);
        org.joda.time.TimeOfDay timeOfDay33 = property9.setCopy(10);
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.plusHours(33);
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay((java.lang.Object) timeOfDay35);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.plusMinutes(36);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay38);
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
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property6.getFieldType();
        org.joda.time.TimeOfDay timeOfDay11 = property6.addToCopy(999);
        org.joda.time.DateTimeField dateTimeField12 = property6.getField();
        int int13 = property6.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay14 = property6.withMinimumValue();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 999 + "'", int13 == 999);
        org.junit.Assert.assertNotNull(timeOfDay14);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 36);
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology8);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(chronology8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay1.withChronologyRetainFields(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        org.joda.time.TimeOfDay timeOfDay13 = property6.addWrapFieldToCopy((int) (short) 1);
        java.lang.String str14 = property6.getAsShortText();
        int int15 = property6.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property6.getFieldType();
        org.joda.time.TimeOfDay timeOfDay18 = property6.addWrapFieldToCopy(37);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(timeOfDay18);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay6.plusMillis((int) (short) 10);
        org.joda.time.LocalTime localTime20 = timeOfDay6.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology31);
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(1, 0, (int) (byte) 0, 10, chronology31);
        int int34 = timeOfDay33.size();
        org.joda.time.TimeOfDay.Property property35 = timeOfDay33.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology39 = timeOfDay38.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = timeOfDay38.getFieldTypes();
        org.joda.time.TimeOfDay.Property property41 = timeOfDay38.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay38.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay47 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay47.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology50 = timeOfDay49.getChronology();
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology50);
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay(chronology50);
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay38.withChronologyRetainFields(chronology50);
        org.joda.time.TimeOfDay timeOfDay54 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay54.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology57 = timeOfDay56.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray58 = timeOfDay56.getFieldTypes();
        org.joda.time.TimeOfDay.Property property59 = timeOfDay56.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay56.minusHours(999);
        org.joda.time.TimeOfDay.Property property62 = timeOfDay61.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property62.getFieldType();
        boolean boolean64 = timeOfDay38.isSupported(dateTimeFieldType63);
        boolean boolean65 = timeOfDay33.isSupported(dateTimeFieldType63);
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay33.minusHours((int) (byte) 100);
        boolean boolean68 = timeOfDay6.isEqual((org.joda.time.ReadablePartial) timeOfDay67);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField70 = timeOfDay6.getField(389);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 389");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay2.withSecondOfMinute(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = timeOfDay2.getFieldType((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay11.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay11.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology23);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(chronology23);
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay11.withChronologyRetainFields(chronology23);
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray31 = timeOfDay29.getFieldTypes();
        org.joda.time.TimeOfDay.Property property32 = timeOfDay29.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay29.minusHours(999);
        org.joda.time.TimeOfDay.Property property35 = timeOfDay34.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        boolean boolean37 = timeOfDay11.isSupported(dateTimeFieldType36);
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay41 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology44 = timeOfDay43.getChronology();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(chronology44);
        org.joda.time.Chronology chronology46 = timeOfDay45.getChronology();
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay40.withChronologyRetainFields(chronology46);
        int int48 = timeOfDay40.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay40.plusMinutes((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay51 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay51.minusHours((int) '#');
        int int54 = timeOfDay51.getHourOfDay();
        boolean boolean55 = timeOfDay50.isBefore((org.joda.time.ReadablePartial) timeOfDay51);
        boolean boolean56 = timeOfDay11.isEqual((org.joda.time.ReadablePartial) timeOfDay51);
        boolean boolean57 = timeOfDay2.isEqual((org.joda.time.ReadablePartial) timeOfDay51);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1);
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
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = timeOfDay23.toDateTimeToday(dateTimeZone36);
        int int38 = timeOfDay23.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay23.withSecondOfMinute(13);
        org.joda.time.TimeOfDay timeOfDay42 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay43 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology46 = timeOfDay45.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = timeOfDay45.getFieldTypes();
        org.joda.time.TimeOfDay.Property property48 = timeOfDay45.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay45.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay54 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay54.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology57 = timeOfDay56.getChronology();
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology57);
        org.joda.time.TimeOfDay timeOfDay59 = new org.joda.time.TimeOfDay(chronology57);
        org.joda.time.TimeOfDay timeOfDay60 = timeOfDay45.withChronologyRetainFields(chronology57);
        org.joda.time.TimeOfDay timeOfDay61 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay61.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology64 = timeOfDay63.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray65 = timeOfDay63.getFieldTypes();
        org.joda.time.TimeOfDay.Property property66 = timeOfDay63.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay68 = timeOfDay63.minusHours(999);
        org.joda.time.TimeOfDay.Property property69 = timeOfDay68.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = property69.getFieldType();
        boolean boolean71 = timeOfDay45.isSupported(dateTimeFieldType70);
        boolean boolean72 = timeOfDay42.isSupported(dateTimeFieldType70);
        int int73 = timeOfDay40.get(dateTimeFieldType70);
        int int74 = timeOfDay1.get(dateTimeFieldType70);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.TimeOfDay timeOfDay77 = timeOfDay1.withPeriodAdded(readablePeriod75, (int) (short) 100);
        org.junit.Assert.assertNotNull(timeOfDay1);
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
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 13 + "'", int73 == 13);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(timeOfDay77);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay3 = property1.addWrapFieldToCopy(999);
        java.lang.String str5 = timeOfDay3.toString("0");
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay12.getFieldTypes();
        org.joda.time.TimeOfDay.Property property15 = timeOfDay12.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology24 = timeOfDay23.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology24);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(chronology24);
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay12.withChronologyRetainFields(chronology24);
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, chronology24);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay((int) (short) 0, 59, (int) '#', chronology24);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay3.withChronologyRetainFields(chronology24);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay3.plusSeconds((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay35.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property39 = timeOfDay35.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay35.plusMillis((int) '#');
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.withMillisOfSecond(100);
        org.joda.time.TimeOfDay timeOfDay44 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay44.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology47 = timeOfDay46.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray48 = timeOfDay46.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay46.withSecondOfMinute(0);
        org.joda.time.LocalTime localTime51 = timeOfDay50.toLocalTime();
        boolean boolean52 = timeOfDay43.isEqual((org.joda.time.ReadablePartial) localTime51);
        org.joda.time.TimeOfDay timeOfDay53 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay53.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology56 = timeOfDay55.getChronology();
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay55.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property59 = timeOfDay55.millisOfSecond();
        java.lang.Object obj60 = null;
        boolean boolean61 = property59.equals(obj60);
        java.lang.String str62 = property59.getName();
        org.joda.time.TimeOfDay timeOfDay63 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay63.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology66 = timeOfDay65.getChronology();
        org.joda.time.TimeOfDay timeOfDay68 = timeOfDay65.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay70 = timeOfDay65.plusHours((int) (short) -1);
        int int71 = property59.compareTo((org.joda.time.ReadablePartial) timeOfDay70);
        org.joda.time.TimeOfDay timeOfDay72 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay74 = timeOfDay72.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology75 = timeOfDay74.getChronology();
        org.joda.time.TimeOfDay timeOfDay77 = timeOfDay74.minusMinutes(0);
        boolean boolean78 = property59.equals((java.lang.Object) timeOfDay74);
        org.joda.time.TimeOfDay timeOfDay80 = property59.addNoWrapToCopy((int) (short) 10);
        java.lang.String str81 = property59.getAsText();
        org.joda.time.TimeOfDay timeOfDay82 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay84 = timeOfDay82.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology85 = timeOfDay84.getChronology();
        org.joda.time.TimeOfDay timeOfDay87 = timeOfDay84.minusMinutes(0);
        org.joda.time.LocalTime localTime88 = timeOfDay84.toLocalTime();
        org.joda.time.TimeOfDay.Property property89 = timeOfDay84.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone90 = null;
        org.joda.time.DateTime dateTime91 = timeOfDay84.toDateTimeToday(dateTimeZone90);
        int int92 = property59.compareTo((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.DateTime dateTime93 = localTime51.toDateTime((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.DateTime dateTime94 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) dateTime91);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "millisOfSecond" + "'", str62, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertNotNull(timeOfDay70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertNotNull(timeOfDay74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(timeOfDay77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(timeOfDay80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "1" + "'", str81, "1");
        org.junit.Assert.assertNotNull(timeOfDay82);
        org.junit.Assert.assertNotNull(timeOfDay84);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertNotNull(timeOfDay87);
        org.junit.Assert.assertNotNull(localTime88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(dateTime93);
        org.junit.Assert.assertNotNull(dateTime94);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 'a');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology7 = timeOfDay6.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay6.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property10 = timeOfDay6.millisOfSecond();
        java.lang.Object obj11 = null;
        boolean boolean12 = property10.equals(obj11);
        java.lang.String str13 = property10.getName();
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay16.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay16.plusHours((int) (short) -1);
        int int22 = property10.compareTo((org.joda.time.ReadablePartial) timeOfDay21);
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay25.minusMinutes(0);
        boolean boolean29 = property10.equals((java.lang.Object) timeOfDay25);
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay32.minusMinutes(0);
        org.joda.time.DateTime dateTime36 = timeOfDay35.toDateTimeToday();
        org.joda.time.DateTime dateTime37 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = timeOfDay25.toDateTimeToday(dateTimeZone38);
        int int40 = timeOfDay25.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay25.withSecondOfMinute(13);
        org.joda.time.TimeOfDay timeOfDay44 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay45 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay45.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology48 = timeOfDay47.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray49 = timeOfDay47.getFieldTypes();
        org.joda.time.TimeOfDay.Property property50 = timeOfDay47.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay47.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay56 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay56.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology59 = timeOfDay58.getChronology();
        org.joda.time.TimeOfDay timeOfDay60 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology59);
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay(chronology59);
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay47.withChronologyRetainFields(chronology59);
        org.joda.time.TimeOfDay timeOfDay63 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay63.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology66 = timeOfDay65.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray67 = timeOfDay65.getFieldTypes();
        org.joda.time.TimeOfDay.Property property68 = timeOfDay65.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay70 = timeOfDay65.minusHours(999);
        org.joda.time.TimeOfDay.Property property71 = timeOfDay70.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property71.getFieldType();
        boolean boolean73 = timeOfDay47.isSupported(dateTimeFieldType72);
        boolean boolean74 = timeOfDay44.isSupported(dateTimeFieldType72);
        int int75 = timeOfDay42.get(dateTimeFieldType72);
        int int76 = timeOfDay3.get(dateTimeFieldType72);
        int int77 = timeOfDay1.indexOf(dateTimeFieldType72);
        int int79 = timeOfDay1.getValue((int) (short) 1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "millisOfSecond" + "'", str13, "millisOfSecond");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(timeOfDay70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 13 + "'", int75 == 13);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.hourOfDay();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay5 = property3.withMinimumValue();
        java.lang.String str6 = property3.getAsText();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "13" + "'", str4, "13");
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "13" + "'", str6, "13");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getAsString();
        org.joda.time.TimeOfDay timeOfDay12 = property6.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.plusHours(100);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology21);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay((long) (short) 0, chronology21);
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology21);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((long) (-1), chronology21);
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay14.withChronologyRetainFields(chronology21);
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property33 = timeOfDay29.millisOfSecond();
        java.lang.Object obj34 = null;
        boolean boolean35 = property33.equals(obj34);
        java.lang.String str36 = property33.getName();
        int int37 = property33.getMaximumValueOverall();
        java.util.Locale locale38 = null;
        java.lang.String str39 = property33.getAsShortText(locale38);
        org.joda.time.TimeOfDay timeOfDay40 = property33.withMinimumValue();
        boolean boolean41 = timeOfDay26.equals((java.lang.Object) timeOfDay40);
        org.joda.time.TimeOfDay timeOfDay42 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay42.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology45 = timeOfDay44.getChronology();
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay44.minusMinutes(0);
        org.joda.time.LocalTime localTime48 = timeOfDay44.toLocalTime();
        org.joda.time.TimeOfDay.Property property49 = timeOfDay44.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay44.plus(readablePeriod50);
        org.joda.time.TimeOfDay timeOfDay52 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay52.minusMillis((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay55 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay55.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology58 = timeOfDay57.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray59 = timeOfDay57.getFieldTypes();
        org.joda.time.TimeOfDay.Property property60 = timeOfDay57.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay57.minusHours(999);
        org.joda.time.TimeOfDay.Property property63 = timeOfDay62.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property63.getFieldType();
        boolean boolean65 = timeOfDay52.isSupported(dateTimeFieldType64);
        org.joda.time.TimeOfDay.Property property66 = timeOfDay51.property(dateTimeFieldType64);
        org.joda.time.TimeOfDay.Property property67 = timeOfDay51.minuteOfHour();
        int int68 = property67.get();
        org.joda.time.TimeOfDay timeOfDay69 = property67.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = property67.getFieldType();
        int int71 = timeOfDay26.indexOf(dateTimeFieldType70);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "millisOfSecond" + "'", str36, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 999 + "'", int37 == 999);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1" + "'", str39, "1");
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay5.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property9 = timeOfDay5.millisOfSecond();
        int int10 = timeOfDay5.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay5.minusMillis((int) (byte) 1);
        int int13 = timeOfDay5.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusMillis((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology20 = timeOfDay19.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = timeOfDay19.getFieldTypes();
        org.joda.time.TimeOfDay.Property property22 = timeOfDay19.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay23 = property22.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        int int25 = timeOfDay16.indexOf(dateTimeFieldType24);
        boolean boolean26 = timeOfDay5.isSupported(dateTimeFieldType24);
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay0.withField(dateTimeFieldType24, (int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology32 = timeOfDay31.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay31.minusMinutes(0);
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay31.plusHours((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology40 = timeOfDay39.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray41 = timeOfDay39.getFieldTypes();
        org.joda.time.TimeOfDay.Property property42 = timeOfDay39.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay39.minusHours(999);
        org.joda.time.TimeOfDay.Property property45 = timeOfDay44.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property45.getFieldType();
        java.lang.String str47 = property45.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property45.getFieldType();
        int int49 = timeOfDay36.get(dateTimeFieldType48);
        boolean boolean50 = timeOfDay0.equals((java.lang.Object) timeOfDay36);
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay0.plusHours(59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType54 = timeOfDay52.getFieldType(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0" + "'", str47, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(timeOfDay52);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology6 = timeOfDay5.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology6);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.TimeOfDay.Property property9 = timeOfDay8.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay12.getFieldTypes();
        org.joda.time.TimeOfDay.Property property15 = timeOfDay12.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.minusHours(999);
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology24 = timeOfDay23.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology24);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(chronology24);
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay12.withChronologyRetainFields(chronology24);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay27.withPeriodAdded(readablePeriod28, 4);
        boolean boolean31 = property9.equals((java.lang.Object) readablePeriod28);
        org.joda.time.TimeOfDay timeOfDay32 = property9.getTimeOfDay();
        org.joda.time.DurationField durationField33 = property9.getRangeDurationField();
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(4, (int) (short) 1, (int) ' ');
        org.joda.time.TimeOfDay.Property property4 = timeOfDay3.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay6 = property4.setCopy("23");
        org.joda.time.LocalTime localTime7 = timeOfDay6.toLocalTime();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(771, 323, chronology2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 771 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((int) (byte) 0, (int) (short) 0);
        int int3 = timeOfDay2.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.plusHours((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay2.toDateTimeToday(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getAsString();
        org.joda.time.TimeOfDay timeOfDay12 = property6.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.plusHours(100);
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = timeOfDay14.getFields();
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology19 = timeOfDay18.getChronology();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay18.minusMinutes(0);
        org.joda.time.DateTime dateTime22 = timeOfDay21.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property23 = timeOfDay21.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay21.withHourOfDay(1);
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay21.minusSeconds((int) '#');
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay30.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property34 = timeOfDay30.millisOfSecond();
        java.lang.Object obj35 = null;
        boolean boolean36 = property34.equals(obj35);
        java.util.Locale locale37 = null;
        int int38 = property34.getMaximumShortTextLength(locale37);
        java.lang.String str39 = property34.getAsString();
        org.joda.time.TimeOfDay timeOfDay40 = property34.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay41 = property34.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay43 = property34.setCopy(13);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.minus(readablePeriod44);
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay45.withMinuteOfHour(0);
        org.joda.time.TimeOfDay timeOfDay48 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay48.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology51 = timeOfDay50.getChronology();
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay50.minusMinutes(0);
        org.joda.time.LocalTime localTime54 = timeOfDay50.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay50.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay56.minusHours(59);
        org.joda.time.TimeOfDay timeOfDay59 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay59.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology62 = timeOfDay61.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray63 = timeOfDay61.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay61.withSecondOfMinute(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = timeOfDay61.getFieldType((int) (short) 1);
        org.joda.time.TimeOfDay.Property property68 = timeOfDay56.property(dateTimeFieldType67);
        int int69 = timeOfDay47.get(dateTimeFieldType67);
        int int70 = timeOfDay21.indexOf(dateTimeFieldType67);
        int int71 = timeOfDay14.get(dateTimeFieldType67);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1" + "'", str39, "1");
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray63);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getAsText();
        int int12 = property6.getMinimumValue();
        int int13 = property6.getMinimumValueOverall();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property6.getAsText(locale14);
        org.joda.time.TimeOfDay timeOfDay17 = property6.addWrapFieldToCopy(36);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(timeOfDay17);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        int int11 = property6.getMinimumValueOverall();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property6.getAsText(locale12);
        java.lang.String str14 = property6.getAsString();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property6.getAsText(locale15);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay2.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = property7.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = timeOfDay13.toDateTimeToday(dateTimeZone14);
        int int16 = property7.compareTo((org.joda.time.ReadableInstant) dateTime15);
        int int17 = property7.getMaximumValue();
        int int18 = property7.get();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        java.lang.String str15 = property6.getAsText();
        org.joda.time.TimeOfDay timeOfDay17 = property6.addWrapFieldToCopy((-1));
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis(43);
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
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
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
        org.joda.time.TimeOfDay.Property property19 = timeOfDay17.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay21 = property19.setCopy((int) ' ');
        java.util.Locale locale22 = null;
        int int23 = property19.getMaximumTextLength(locale22);
        org.joda.time.DurationField durationField24 = property19.getRangeDurationField();
        org.joda.time.TimeOfDay timeOfDay25 = property19.getTimeOfDay();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(timeOfDay25);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.LocalTime localTime6 = timeOfDay2.toLocalTime();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay2.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = property7.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = timeOfDay13.toDateTimeToday(dateTimeZone14);
        int int16 = property7.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.TimeOfDay timeOfDay17 = property7.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusHours((int) '#');
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology24 = timeOfDay23.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay23.minusMinutes(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = timeOfDay23.toString(dateTimeFormatter27);
        boolean boolean29 = timeOfDay20.isEqual((org.joda.time.ReadablePartial) timeOfDay23);
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology40 = timeOfDay39.getChronology();
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology40);
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(3, 1, (int) (short) 0, (int) (byte) 10, chronology40);
        org.joda.time.TimeOfDay timeOfDay43 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology46 = timeOfDay45.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = timeOfDay45.getFieldTypes();
        org.joda.time.TimeOfDay.Property property48 = timeOfDay45.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay45.minusHours(999);
        org.joda.time.TimeOfDay.Property property51 = timeOfDay50.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property51.getFieldType();
        int int53 = timeOfDay42.get(dateTimeFieldType52);
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay23.withField(dateTimeFieldType52, (int) '#');
        org.joda.time.TimeOfDay timeOfDay63 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay63.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology66 = timeOfDay65.getChronology();
        org.joda.time.TimeOfDay timeOfDay67 = new org.joda.time.TimeOfDay(0, 0, (int) ' ', chronology66);
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(1, 0, (int) (byte) 0, 10, chronology66);
        org.joda.time.TimeOfDay timeOfDay69 = timeOfDay23.withChronologyRetainFields(chronology66);
        int int70 = property7.compareTo((org.joda.time.ReadablePartial) timeOfDay69);
        org.joda.time.DateTimeField dateTimeField71 = property7.getField();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "T00:00:00.001" + "'", str28, "T00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(dateTimeField71);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay9.minusMinutes(0);
        org.joda.time.LocalTime localTime13 = timeOfDay9.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay9.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology19 = timeOfDay18.getChronology();
        int int20 = timeOfDay15.compareTo((org.joda.time.ReadablePartial) timeOfDay18);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay15.plusMillis(3);
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = timeOfDay25.getFieldTypes();
        org.joda.time.TimeOfDay.Property property28 = timeOfDay25.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay25.minusHours(999);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(chronology31);
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay15.withChronologyRetainFields(chronology31);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(13, 37, 47, chronology31);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(13, 23, 4, 3, chronology31);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.minusMinutes(38);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = timeOfDay37.toDateTimeToday(dateTimeZone38);
        org.joda.time.TimeOfDay.Property property40 = timeOfDay37.hourOfDay();
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        org.joda.time.TimeOfDay timeOfDay11 = property6.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withHourOfDay(771);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 771 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(timeOfDay11);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology3 = timeOfDay2.getChronology();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(0);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay2.millisOfSecond();
        java.lang.Object obj7 = null;
        boolean boolean8 = property6.equals(obj7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getAsString();
        org.joda.time.TimeOfDay timeOfDay12 = property6.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.plusHours(100);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.hourOfDay();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property15.getAsText(locale16);
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        org.joda.time.Chronology chronology36 = timeOfDay21.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay21.plusHours(100);
        org.joda.time.TimeOfDay.Property property39 = timeOfDay21.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property39.getFieldType();
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
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
    }
}

