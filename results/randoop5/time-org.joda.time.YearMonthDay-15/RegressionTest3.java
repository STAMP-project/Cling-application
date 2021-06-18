import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        int int3 = yearMonthDay1.indexOf(dateTimeFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusYears((int) 'a');
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.monthOfYear();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumTextLength(locale8);
        java.util.Locale locale10 = null;
        java.lang.String str11 = property7.getAsShortText(locale10);
        java.util.Locale locale12 = null;
        int int13 = property7.getMaximumTextLength(locale12);
        int int14 = property7.getMaximumValueOverall();
        java.lang.String str15 = property7.getAsText();
        org.joda.time.YearMonthDay yearMonthDay16 = property7.withMaximumValue();
        int int17 = yearMonthDay16.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Jan" + "'", str11, "Jan");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "January" + "'", str15, "January");
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = yearMonthDay1.toString("1970-01-01", locale3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.dayOfMonth();
        int int6 = property5.getMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay7 = property5.withMinimumValue();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property5.getAsShortText(locale8);
        java.util.Locale locale10 = null;
        int int11 = property5.getMaximumShortTextLength(locale10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay3 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.YearMonthDay yearMonthDay7 = property2.withMinimumValue();
        int int8 = property2.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property2.getFieldType();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay11.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay13 = property12.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField14 = property12.getField();
        org.joda.time.YearMonthDay yearMonthDay15 = property12.getYearMonthDay();
        int int16 = property12.get();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        int int20 = yearMonthDay18.indexOf(dateTimeFieldType19);
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay18.minusYears((int) 'a');
        org.joda.time.DateTime dateTime23 = yearMonthDay18.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay18.withPeriodAdded(readablePeriod24, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay26.withDayOfMonth(1);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay26.minus(readablePeriod29);
        int int31 = yearMonthDay30.getMonthOfYear();
        int[] intArray32 = yearMonthDay30.getValues();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay30.toDateTimeAtCurrentTime(dateTimeZone33);
        int int35 = property12.compareTo((org.joda.time.ReadableInstant) dateTime34);
        int int36 = property2.compareTo((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property39 = yearMonthDay38.dayOfMonth();
        java.util.Locale locale40 = null;
        int int41 = property39.getMaximumTextLength(locale40);
        org.joda.time.DurationField durationField42 = property39.getDurationField();
        java.util.Locale locale43 = null;
        java.lang.String str44 = property39.getAsShortText(locale43);
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        int int48 = yearMonthDay46.indexOf(dateTimeFieldType47);
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay46.minusYears((int) 'a');
        org.joda.time.Chronology chronology51 = yearMonthDay50.getChronology();
        boolean boolean52 = property39.equals((java.lang.Object) yearMonthDay50);
        org.joda.time.YearMonthDay yearMonthDay53 = property39.withMaximumValue();
        java.lang.String str54 = yearMonthDay53.toString();
        org.joda.time.TimeOfDay timeOfDay55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = yearMonthDay53.toDateTime(timeOfDay55, dateTimeZone56);
        int int58 = property2.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1" + "'", str44, "1");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(yearMonthDay53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1970-01-31" + "'", str54, "1970-01-31");
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        int int4 = yearMonthDay2.indexOf(dateTimeFieldType3);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay2.minusYears((int) 'a');
        org.joda.time.DateTime dateTime7 = yearMonthDay2.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay2.withPeriodAdded(readablePeriod8, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay10.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = yearMonthDay14.toInterval(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay14.withMonthOfYear(10);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        int int22 = yearMonthDay20.indexOf(dateTimeFieldType21);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay20.minusYears((int) 'a');
        org.joda.time.DateMidnight dateMidnight25 = yearMonthDay20.toDateMidnight();
        java.lang.String str26 = yearMonthDay20.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = yearMonthDay20.getFields();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay20.minus(readablePeriod28);
        org.joda.time.LocalDate localDate30 = yearMonthDay20.toLocalDate();
        boolean boolean31 = yearMonthDay14.isBefore((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.DateTime dateTime32 = yearMonthDay14.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime33 = yearMonthDay14.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) 100);
        java.util.Locale locale38 = null;
        java.lang.String str39 = yearMonthDay36.toString("1970-01-01", locale38);
        java.lang.String str40 = yearMonthDay36.toString();
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay36.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate43 = yearMonthDay36.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        int int48 = yearMonthDay46.indexOf(dateTimeFieldType47);
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay46.minusYears((int) 'a');
        org.joda.time.DateTime dateTime51 = yearMonthDay46.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.YearMonthDay yearMonthDay54 = yearMonthDay46.withPeriodAdded(readablePeriod52, (int) 'a');
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay54.withDayOfMonth(1);
        org.joda.time.YearMonthDay yearMonthDay58 = yearMonthDay56.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology59 = yearMonthDay58.getChronology();
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay((long) (short) -1, chronology59);
        org.joda.time.YearMonthDay yearMonthDay61 = yearMonthDay36.withChronologyRetainFields(chronology59);
        org.joda.time.YearMonthDay yearMonthDay62 = new org.joda.time.YearMonthDay((long) 10, chronology59);
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay((java.lang.Object) yearMonthDay14, chronology59);
        org.joda.time.YearMonthDay yearMonthDay64 = new org.joda.time.YearMonthDay((long) (short) 1, chronology59);
        org.joda.time.YearMonthDay yearMonthDay66 = yearMonthDay64.minusDays((int) '#');
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.YearMonthDay yearMonthDay69 = yearMonthDay64.withPeriodAdded(readablePeriod67, (int) 'a');
        org.joda.time.Interval interval70 = yearMonthDay69.toInterval();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldArray27);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01" + "'", str39, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01" + "'", str40, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(yearMonthDay54);
        org.junit.Assert.assertNotNull(yearMonthDay56);
        org.junit.Assert.assertNotNull(yearMonthDay58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(yearMonthDay61);
        org.junit.Assert.assertNotNull(yearMonthDay66);
        org.junit.Assert.assertNotNull(yearMonthDay69);
        org.junit.Assert.assertNotNull(interval70);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) 100);
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.dayOfMonth();
        java.lang.String str3 = property2.toString();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property2.getAsShortText(locale4);
        int int6 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[dayOfMonth]" + "'", str3, "Property[dayOfMonth]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }
}

