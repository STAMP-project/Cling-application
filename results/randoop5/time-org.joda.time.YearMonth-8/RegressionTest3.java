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
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.YearMonth yearMonth5 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology4);
        org.joda.time.YearMonth yearMonth7 = yearMonth5.minusYears((int) (short) 0);
        int int8 = yearMonth5.size();
        org.joda.time.YearMonth yearMonth10 = yearMonth5.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = yearMonth5.indexOf(dateTimeFieldType11);
        org.joda.time.YearMonth yearMonth14 = yearMonth5.plusMonths((-1));
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        int int25 = yearMonth18.indexOf(dateTimeFieldType24);
        org.joda.time.Interval interval26 = yearMonth18.toInterval();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth.Property property31 = yearMonth30.monthOfYear();
        int int32 = property31.getMaximumValue();
        java.lang.String str33 = property31.getAsShortText();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property31.getAsShortText(locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property31.getFieldType();
        int int37 = yearMonth18.get(dateTimeFieldType36);
        org.joda.time.YearMonth.Property property38 = yearMonth5.property(dateTimeFieldType36);
        org.joda.time.Chronology chronology39 = yearMonth5.getChronology();
        org.joda.time.YearMonth yearMonth40 = org.joda.time.YearMonth.now(chronology39);
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth(1, 3, chronology39);
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth(chronology39);
        org.junit.Assert.assertNotNull(yearMonth7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 12 + "'", int32 == 12);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Oct" + "'", str35, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(yearMonth40);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.YearMonth yearMonth15 = property4.getYearMonth();
        java.lang.String str16 = property4.getAsText();
        org.joda.time.YearMonth yearMonth17 = property4.getYearMonth();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.YearMonth yearMonth19 = yearMonth17.minus(readablePeriod18);
        org.joda.time.Interval interval20 = yearMonth19.toInterval();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "October" + "'", str16, "October");
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(interval20);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(11, (int) (byte) 10);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.lang.String str8 = property4.getName();
        org.joda.time.YearMonth yearMonth10 = property4.addWrapFieldToCopy(12);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.YearMonth yearMonth13 = yearMonth10.withPeriodAdded(readablePeriod11, 3);
        org.joda.time.YearMonth.Property property14 = yearMonth13.monthOfYear();
        org.joda.time.YearMonth yearMonth16 = property14.addToCopy((int) (short) 100);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "monthOfYear" + "'", str8, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonth16);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        org.joda.time.YearMonth yearMonth8 = property4.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth.Property property19 = yearMonth18.monthOfYear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.YearMonth yearMonth23 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology22);
        org.joda.time.YearMonth yearMonth25 = yearMonth23.minusYears((int) (short) 0);
        int int26 = yearMonth23.size();
        org.joda.time.YearMonth yearMonth28 = yearMonth23.plusMonths((int) (byte) 10);
        int int29 = property19.compareTo((org.joda.time.ReadablePartial) yearMonth23);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.Interval interval31 = yearMonth23.toInterval(dateTimeZone30);
        org.joda.time.YearMonth yearMonth33 = yearMonth23.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.YearMonth yearMonth37 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology36);
        org.joda.time.YearMonth yearMonth39 = yearMonth37.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.YearMonth yearMonth43 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology42);
        org.joda.time.YearMonth yearMonth45 = yearMonth43.minusYears((int) (short) 0);
        int int46 = yearMonth43.size();
        boolean boolean47 = yearMonth39.isAfter((org.joda.time.ReadablePartial) yearMonth43);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.YearMonth yearMonth51 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology50);
        org.joda.time.YearMonth.Property property52 = yearMonth51.monthOfYear();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.YearMonth yearMonth56 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology55);
        org.joda.time.YearMonth yearMonth58 = yearMonth56.minusYears((int) (short) 0);
        int int59 = yearMonth56.size();
        org.joda.time.YearMonth yearMonth61 = yearMonth56.plusMonths((int) (byte) 10);
        int int62 = property52.compareTo((org.joda.time.ReadablePartial) yearMonth56);
        org.joda.time.Chronology chronology63 = yearMonth56.getChronology();
        org.joda.time.YearMonth yearMonth64 = yearMonth43.withChronologyRetainFields(chronology63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.YearMonth yearMonth67 = yearMonth64.withPeriodAdded(readablePeriod65, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = null;
        int int69 = yearMonth67.indexOf(dateTimeFieldType68);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.YearMonth yearMonth73 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology72);
        org.joda.time.YearMonth.Property property74 = yearMonth73.monthOfYear();
        int int75 = property74.getMaximumValue();
        java.lang.String str76 = property74.getAsShortText();
        java.util.Locale locale77 = null;
        java.lang.String str78 = property74.getAsShortText(locale77);
        org.joda.time.YearMonth yearMonth80 = property74.setCopy("October");
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.DateTime dateTime82 = yearMonth80.toDateTime(readableInstant81);
        org.joda.time.DateTime dateTime83 = yearMonth67.toDateTime(readableInstant81);
        org.joda.time.DateTime dateTime84 = yearMonth23.toDateTime((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.DateTime dateTime85 = yearMonth14.toDateTime((org.joda.time.ReadableInstant) dateTime84);
        boolean boolean86 = yearMonth8.isEqual((org.joda.time.ReadablePartial) yearMonth14);
        int int87 = yearMonth14.getMonthOfYear();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(yearMonth25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertNotNull(yearMonth45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(yearMonth61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(yearMonth64);
        org.junit.Assert.assertNotNull(yearMonth67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 12 + "'", int75 == 12);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Oct" + "'", str76, "Oct");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Oct" + "'", str78, "Oct");
        org.junit.Assert.assertNotNull(yearMonth80);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 10 + "'", int87 == 10);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Interval interval14 = yearMonth5.toInterval();
        org.joda.time.YearMonth.Property property15 = yearMonth5.year();
        org.joda.time.YearMonth yearMonth17 = yearMonth5.plusMonths((int) '4');
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology20);
        org.joda.time.YearMonth yearMonth23 = yearMonth21.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.YearMonth yearMonth27 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology26);
        org.joda.time.YearMonth yearMonth29 = yearMonth27.minusYears((int) (short) 0);
        int int30 = yearMonth27.size();
        boolean boolean31 = yearMonth23.isAfter((org.joda.time.ReadablePartial) yearMonth27);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.YearMonth yearMonth33 = yearMonth27.minus(readablePeriod32);
        int int34 = yearMonth27.getMonthOfYear();
        boolean boolean35 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = yearMonth5.toString(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0097-10" + "'", str37, "0097-10");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        boolean boolean21 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = yearMonth18.toString(dateTimeFormatter22);
        org.joda.time.Interval interval24 = yearMonth18.toInterval();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.YearMonth yearMonth27 = yearMonth18.withPeriodAdded(readablePeriod25, (int) (byte) -1);
        int[] intArray28 = yearMonth18.getValues();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0097-10" + "'", str23, "0097-10");
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10]");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = yearMonth3.getFieldTypes();
        org.joda.time.YearMonth yearMonth17 = yearMonth3.minusMonths(0);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.YearMonth yearMonth23 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology22);
        org.joda.time.YearMonth.Property property24 = yearMonth23.monthOfYear();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth yearMonth30 = yearMonth28.minusYears((int) (short) 0);
        int int31 = yearMonth28.size();
        org.joda.time.YearMonth yearMonth33 = yearMonth28.plusMonths((int) (byte) 10);
        int int34 = property24.compareTo((org.joda.time.ReadablePartial) yearMonth28);
        org.joda.time.Chronology chronology35 = yearMonth28.getChronology();
        org.joda.time.YearMonth yearMonth36 = org.joda.time.YearMonth.now(chronology35);
        org.joda.time.YearMonth yearMonth37 = new org.joda.time.YearMonth(100, (int) (short) 1, chronology35);
        org.joda.time.YearMonth yearMonth38 = yearMonth3.withChronologyRetainFields(chronology35);
        org.joda.time.YearMonth yearMonth39 = new org.joda.time.YearMonth((java.lang.Object) yearMonth3);
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.Interval interval43 = yearMonth41.toInterval(dateTimeZone42);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = yearMonth41.getFieldType((int) (short) 1);
        boolean boolean46 = yearMonth3.isSupported(dateTimeFieldType45);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.YearMonth yearMonth50 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology49);
        org.joda.time.YearMonth yearMonth52 = yearMonth50.minusYears((int) (short) 0);
        int int53 = yearMonth50.size();
        org.joda.time.YearMonth yearMonth55 = yearMonth50.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        int int57 = yearMonth50.indexOf(dateTimeFieldType56);
        org.joda.time.YearMonth yearMonth59 = yearMonth50.plusMonths((-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.YearMonth yearMonth63 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology62);
        org.joda.time.YearMonth yearMonth65 = yearMonth63.minusYears((int) (short) 0);
        int int66 = yearMonth63.size();
        org.joda.time.YearMonth yearMonth68 = yearMonth63.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = null;
        int int70 = yearMonth63.indexOf(dateTimeFieldType69);
        org.joda.time.Interval interval71 = yearMonth63.toInterval();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.YearMonth yearMonth75 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology74);
        org.joda.time.YearMonth.Property property76 = yearMonth75.monthOfYear();
        int int77 = property76.getMaximumValue();
        java.lang.String str78 = property76.getAsShortText();
        java.util.Locale locale79 = null;
        java.lang.String str80 = property76.getAsShortText(locale79);
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = property76.getFieldType();
        int int82 = yearMonth63.get(dateTimeFieldType81);
        org.joda.time.YearMonth.Property property83 = yearMonth50.property(dateTimeFieldType81);
        java.lang.String str84 = property83.getAsText();
        java.lang.String str85 = property83.getAsString();
        java.lang.String str86 = property83.getAsShortText();
        org.joda.time.YearMonth yearMonth88 = property83.addToCopy(0);
        org.joda.time.DurationField durationField89 = property83.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType90 = property83.getFieldType();
        boolean boolean91 = yearMonth3.isSupported(dateTimeFieldType90);
        java.lang.Class<?> wildcardClass92 = dateTimeFieldType90.getClass();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(yearMonth68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 12 + "'", int77 == 12);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Oct" + "'", str78, "Oct");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Oct" + "'", str80, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "October" + "'", str84, "October");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "10" + "'", str85, "10");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Oct" + "'", str86, "Oct");
        org.junit.Assert.assertNotNull(yearMonth88);
        org.junit.Assert.assertNotNull(durationField89);
        org.junit.Assert.assertNotNull(dateTimeFieldType90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth yearMonth6 = yearMonth4.minusYears((int) (short) 0);
        org.joda.time.Interval interval7 = yearMonth4.toInterval();
        org.joda.time.Chronology chronology8 = yearMonth4.getChronology();
        org.joda.time.YearMonth yearMonth9 = yearMonth0.withChronologyRetainFields(chronology8);
        org.joda.time.YearMonth yearMonth10 = org.joda.time.YearMonth.now(chronology8);
        org.joda.time.YearMonth.Property property11 = yearMonth10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Interval interval13 = yearMonth10.toInterval(dateTimeZone12);
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval13);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = yearMonth8.toInterval(dateTimeZone15);
        org.joda.time.YearMonth yearMonth18 = yearMonth8.minusYears((int) (short) 0);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.plusMonths(1);
        java.lang.String str21 = yearMonth20.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = yearMonth20.getValue((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0097-11" + "'", str21, "0097-11");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getAsShortText();
        int int11 = property4.get();
        org.joda.time.YearMonth yearMonth13 = property4.addToCopy(3);
        java.lang.String str14 = property4.getAsString();
        java.lang.String str15 = property4.getAsShortText();
        org.joda.time.DurationField durationField16 = property4.getDurationField();
        int int17 = property4.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((java.lang.Object) int17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Oct" + "'", str10, "Oct");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Oct" + "'", str15, "Oct");
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.Interval interval11 = yearMonth3.toInterval();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth.Property property16 = yearMonth15.monthOfYear();
        int int17 = property16.getMaximumValue();
        java.lang.String str18 = property16.getAsShortText();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property16.getAsShortText(locale19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property16.getFieldType();
        int int22 = yearMonth3.get(dateTimeFieldType21);
        org.joda.time.Interval interval23 = yearMonth3.toInterval();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = yearMonth3.toString(dateTimeFormatter24);
        int int26 = yearMonth3.getMonthOfYear();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth yearMonth32 = yearMonth30.minusYears((int) (short) 0);
        int int33 = yearMonth30.size();
        org.joda.time.YearMonth yearMonth35 = yearMonth30.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        int int37 = yearMonth30.indexOf(dateTimeFieldType36);
        org.joda.time.YearMonth yearMonth39 = yearMonth30.plusMonths((-1));
        org.joda.time.YearMonth yearMonth41 = yearMonth30.plusMonths((-1));
        org.joda.time.YearMonth.Property property42 = yearMonth41.monthOfYear();
        int int43 = property42.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property42.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property42.getFieldType();
        org.joda.time.YearMonth.Property property46 = yearMonth3.property(dateTimeFieldType45);
        org.joda.time.YearMonth yearMonth48 = yearMonth3.plusYears((-1));
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Oct" + "'", str18, "Oct");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Oct" + "'", str20, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0097-10" + "'", str25, "0097-10");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(yearMonth48);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.YearMonth.Property property14 = yearMonth9.year();
        java.lang.String str15 = property14.getAsText();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97" + "'", str15, "97");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth yearMonth6 = yearMonth4.minusYears((int) (short) 0);
        int int7 = yearMonth6.getYear();
        org.joda.time.YearMonth yearMonth9 = yearMonth6.plusMonths(2);
        org.joda.time.Chronology chronology10 = yearMonth6.getChronology();
        org.joda.time.YearMonth yearMonth11 = new org.joda.time.YearMonth((long) (short) 1, chronology10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth.Property property16 = yearMonth15.monthOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth yearMonth22 = yearMonth20.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth yearMonth28 = yearMonth26.minusYears((int) (short) 0);
        int int29 = yearMonth26.size();
        boolean boolean30 = yearMonth22.isAfter((org.joda.time.ReadablePartial) yearMonth26);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology33);
        org.joda.time.YearMonth.Property property35 = yearMonth34.monthOfYear();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.YearMonth yearMonth39 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology38);
        org.joda.time.YearMonth yearMonth41 = yearMonth39.minusYears((int) (short) 0);
        int int42 = yearMonth39.size();
        org.joda.time.YearMonth yearMonth44 = yearMonth39.plusMonths((int) (byte) 10);
        int int45 = property35.compareTo((org.joda.time.ReadablePartial) yearMonth39);
        org.joda.time.Chronology chronology46 = yearMonth39.getChronology();
        org.joda.time.YearMonth yearMonth47 = yearMonth26.withChronologyRetainFields(chronology46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.YearMonth yearMonth50 = yearMonth47.withPeriodAdded(readablePeriod48, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = null;
        int int52 = yearMonth50.indexOf(dateTimeFieldType51);
        boolean boolean53 = yearMonth15.isEqual((org.joda.time.ReadablePartial) yearMonth50);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.YearMonth yearMonth57 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology56);
        org.joda.time.YearMonth.Property property58 = yearMonth57.monthOfYear();
        int int59 = property58.getMinimumValue();
        java.util.Locale locale60 = null;
        int int61 = property58.getMaximumShortTextLength(locale60);
        org.joda.time.YearMonth yearMonth63 = property58.addToCopy((int) (short) 1);
        boolean boolean64 = yearMonth15.equals((java.lang.Object) yearMonth63);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.YearMonth yearMonth68 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology67);
        org.joda.time.YearMonth yearMonth70 = yearMonth68.minusYears((int) (short) 0);
        int int71 = yearMonth68.size();
        org.joda.time.YearMonth yearMonth73 = yearMonth68.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = null;
        int int75 = yearMonth68.indexOf(dateTimeFieldType74);
        int int76 = yearMonth68.getYear();
        boolean boolean77 = yearMonth63.isBefore((org.joda.time.ReadablePartial) yearMonth68);
        org.joda.time.Interval interval78 = yearMonth68.toInterval();
        boolean boolean79 = yearMonth11.isEqual((org.joda.time.ReadablePartial) yearMonth68);
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertNotNull(yearMonth63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(yearMonth70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(yearMonth73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 97 + "'", int76 == 97);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getName();
        org.joda.time.YearMonth yearMonth12 = property4.addToCopy((int) (short) 10);
        int[] intArray13 = yearMonth12.getValues();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.YearMonth yearMonth15 = yearMonth12.plus(readablePeriod14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = yearMonth15.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.YearMonth yearMonth18 = yearMonth15.minus(readablePeriod17);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[98, 8]");
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(yearMonth18);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth.Property property18 = yearMonth17.monthOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        int int25 = yearMonth22.size();
        org.joda.time.YearMonth yearMonth27 = yearMonth22.plusMonths((int) (byte) 10);
        int int28 = property18.compareTo((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.Chronology chronology29 = yearMonth22.getChronology();
        org.joda.time.YearMonth yearMonth30 = yearMonth9.withChronologyRetainFields(chronology29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.YearMonth yearMonth33 = yearMonth30.withPeriodAdded(readablePeriod31, (int) 'a');
        org.joda.time.YearMonth yearMonth35 = yearMonth30.plusMonths(9);
        int int36 = yearMonth30.getYear();
        org.joda.time.YearMonth yearMonth37 = new org.joda.time.YearMonth((java.lang.Object) yearMonth30);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth yearMonth6 = yearMonth4.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology9);
        org.joda.time.YearMonth yearMonth12 = yearMonth10.minusYears((int) (short) 0);
        int int13 = yearMonth10.size();
        boolean boolean14 = yearMonth6.isAfter((org.joda.time.ReadablePartial) yearMonth10);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth.Property property19 = yearMonth18.monthOfYear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.YearMonth yearMonth23 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology22);
        org.joda.time.YearMonth yearMonth25 = yearMonth23.minusYears((int) (short) 0);
        int int26 = yearMonth23.size();
        org.joda.time.YearMonth yearMonth28 = yearMonth23.plusMonths((int) (byte) 10);
        int int29 = property19.compareTo((org.joda.time.ReadablePartial) yearMonth23);
        org.joda.time.Chronology chronology30 = yearMonth23.getChronology();
        org.joda.time.YearMonth yearMonth31 = yearMonth10.withChronologyRetainFields(chronology30);
        org.joda.time.YearMonth yearMonth32 = new org.joda.time.YearMonth((long) (short) 1, chronology30);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.YearMonth yearMonth35 = yearMonth32.withPeriodAdded(readablePeriod33, 100);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.YearMonth yearMonth39 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology38);
        org.joda.time.YearMonth.Property property40 = yearMonth39.monthOfYear();
        int int41 = property40.getMaximumValue();
        java.lang.String str42 = property40.getAsShortText();
        org.joda.time.YearMonth yearMonth44 = property40.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property40.getFieldType();
        int int46 = yearMonth32.get(dateTimeFieldType45);
        java.lang.String str48 = yearMonth32.toString("100");
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(yearMonth25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 12 + "'", int41 == 12);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Oct" + "'", str42, "Oct");
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "100" + "'", str48, "100");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        org.joda.time.YearMonth yearMonth8 = property4.addWrapFieldToCopy((int) (short) -1);
        int[] intArray9 = yearMonth8.getValues();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth.Property property14 = yearMonth13.monthOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        int int24 = property14.compareTo((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.Chronology chronology25 = yearMonth18.getChronology();
        org.joda.time.YearMonth yearMonth26 = org.joda.time.YearMonth.now(chronology25);
        org.joda.time.YearMonth yearMonth27 = yearMonth8.withChronologyRetainFields(chronology25);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.YearMonth yearMonth29 = yearMonth27.plus(readablePeriod28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.YearMonth.Property property34 = yearMonth33.monthOfYear();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.YearMonth yearMonth38 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology37);
        org.joda.time.YearMonth yearMonth40 = yearMonth38.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology43);
        org.joda.time.YearMonth yearMonth46 = yearMonth44.minusYears((int) (short) 0);
        int int47 = yearMonth44.size();
        boolean boolean48 = yearMonth40.isAfter((org.joda.time.ReadablePartial) yearMonth44);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.YearMonth yearMonth52 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology51);
        org.joda.time.YearMonth.Property property53 = yearMonth52.monthOfYear();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.YearMonth yearMonth57 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology56);
        org.joda.time.YearMonth yearMonth59 = yearMonth57.minusYears((int) (short) 0);
        int int60 = yearMonth57.size();
        org.joda.time.YearMonth yearMonth62 = yearMonth57.plusMonths((int) (byte) 10);
        int int63 = property53.compareTo((org.joda.time.ReadablePartial) yearMonth57);
        org.joda.time.Chronology chronology64 = yearMonth57.getChronology();
        org.joda.time.YearMonth yearMonth65 = yearMonth44.withChronologyRetainFields(chronology64);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.YearMonth yearMonth68 = yearMonth65.withPeriodAdded(readablePeriod66, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = null;
        int int70 = yearMonth68.indexOf(dateTimeFieldType69);
        boolean boolean71 = yearMonth33.isEqual((org.joda.time.ReadablePartial) yearMonth68);
        org.joda.time.YearMonth.Property property72 = yearMonth68.year();
        int int73 = yearMonth29.compareTo((org.joda.time.ReadablePartial) yearMonth68);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.Interval interval75 = yearMonth29.toInterval(dateTimeZone74);
        org.joda.time.ReadablePeriod readablePeriod76 = null;
        org.joda.time.YearMonth yearMonth77 = yearMonth29.plus(readablePeriod76);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 9]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(yearMonth40);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertNotNull(yearMonth62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertNotNull(yearMonth68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertNotNull(yearMonth77);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth yearMonth8 = yearMonth6.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        int int15 = yearMonth12.size();
        boolean boolean16 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth.Property property21 = yearMonth20.monthOfYear();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.YearMonth yearMonth25 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology24);
        org.joda.time.YearMonth yearMonth27 = yearMonth25.minusYears((int) (short) 0);
        int int28 = yearMonth25.size();
        org.joda.time.YearMonth yearMonth30 = yearMonth25.plusMonths((int) (byte) 10);
        int int31 = property21.compareTo((org.joda.time.ReadablePartial) yearMonth25);
        org.joda.time.Chronology chronology32 = yearMonth25.getChronology();
        org.joda.time.YearMonth yearMonth33 = yearMonth12.withChronologyRetainFields(chronology32);
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth((long) (short) 1, chronology32);
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth(chronology32);
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) (byte) 100, (int) (short) 10, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = yearMonth36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.YearMonth yearMonth40 = yearMonth36.plus(readablePeriod39);
        org.joda.time.YearMonth.Property property41 = yearMonth40.year();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth.Property property46 = yearMonth45.monthOfYear();
        int int47 = property46.getMinimumValue();
        java.util.Locale locale48 = null;
        int int49 = property46.getMaximumShortTextLength(locale48);
        org.joda.time.YearMonth yearMonth51 = property46.addWrapFieldToCopy((int) (byte) 10);
        org.joda.time.YearMonth yearMonth52 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.YearMonth yearMonth56 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology55);
        org.joda.time.YearMonth yearMonth58 = yearMonth56.minusYears((int) (short) 0);
        org.joda.time.Interval interval59 = yearMonth56.toInterval();
        org.joda.time.Chronology chronology60 = yearMonth56.getChronology();
        org.joda.time.YearMonth yearMonth61 = yearMonth52.withChronologyRetainFields(chronology60);
        org.joda.time.YearMonth yearMonth62 = new org.joda.time.YearMonth(chronology60);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.YearMonth yearMonth66 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology65);
        org.joda.time.YearMonth yearMonth68 = yearMonth66.minusYears((int) (short) 0);
        int int69 = yearMonth66.size();
        org.joda.time.YearMonth yearMonth71 = yearMonth66.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = null;
        int int73 = yearMonth66.indexOf(dateTimeFieldType72);
        org.joda.time.YearMonth yearMonth75 = yearMonth66.plusMonths((-1));
        org.joda.time.YearMonth yearMonth77 = yearMonth66.plusMonths((-1));
        org.joda.time.YearMonth.Property property78 = yearMonth77.monthOfYear();
        int int79 = property78.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = property78.getFieldType();
        int int81 = yearMonth62.indexOf(dateTimeFieldType80);
        org.joda.time.YearMonth.Property property82 = yearMonth51.property(dateTimeFieldType80);
        boolean boolean83 = yearMonth40.isAfter((org.joda.time.ReadablePartial) yearMonth51);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0100-10" + "'", str38, "0100-10");
        org.junit.Assert.assertNotNull(yearMonth40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(yearMonth61);
        org.junit.Assert.assertNotNull(yearMonth68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(yearMonth71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(yearMonth75);
        org.junit.Assert.assertNotNull(yearMonth77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 9 + "'", int79 == 9);
        org.junit.Assert.assertNotNull(dateTimeFieldType80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology15 = yearMonth8.getChronology();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusYears((int) (short) 0);
        int int22 = yearMonth19.size();
        org.joda.time.YearMonth yearMonth24 = yearMonth19.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        int int26 = yearMonth19.indexOf(dateTimeFieldType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth.Property property31 = yearMonth30.monthOfYear();
        int int32 = property31.getMaximumValue();
        java.lang.String str33 = property31.getAsShortText();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property31.getAsShortText(locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property31.getFieldType();
        org.joda.time.YearMonth.Property property37 = yearMonth19.property(dateTimeFieldType36);
        org.joda.time.YearMonth.Property property38 = yearMonth8.property(dateTimeFieldType36);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology41);
        org.joda.time.YearMonth yearMonth44 = yearMonth42.minusYears((int) (short) 0);
        int int45 = yearMonth42.size();
        org.joda.time.YearMonth yearMonth47 = yearMonth42.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        int int49 = yearMonth42.indexOf(dateTimeFieldType48);
        org.joda.time.YearMonth yearMonth51 = yearMonth42.plusMonths((-1));
        boolean boolean53 = yearMonth51.equals((java.lang.Object) 1);
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth((long) 100);
        boolean boolean56 = yearMonth51.isBefore((org.joda.time.ReadablePartial) yearMonth55);
        int int57 = yearMonth8.compareTo((org.joda.time.ReadablePartial) yearMonth51);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.YearMonth yearMonth60 = yearMonth51.withPeriodAdded(readablePeriod58, (int) (byte) -1);
        int int61 = yearMonth51.size();
        org.joda.time.YearMonth yearMonth63 = yearMonth51.minusMonths((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth66 = yearMonth63.withFieldAdded(durationFieldType64, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 12 + "'", int32 == 12);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Oct" + "'", str35, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(yearMonth60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertNotNull(yearMonth63);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth.Property property18 = yearMonth17.monthOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        int int25 = yearMonth22.size();
        org.joda.time.YearMonth yearMonth27 = yearMonth22.plusMonths((int) (byte) 10);
        int int28 = property18.compareTo((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.Chronology chronology29 = yearMonth22.getChronology();
        org.joda.time.YearMonth yearMonth30 = yearMonth9.withChronologyRetainFields(chronology29);
        java.lang.String str31 = yearMonth30.toString();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0097-10" + "'", str31, "0097-10");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        int int16 = property15.get();
        java.util.Locale locale17 = null;
        int int18 = property15.getMaximumShortTextLength(locale17);
        org.joda.time.DateTimeField dateTimeField19 = property15.getField();
        java.lang.String str20 = property15.getAsShortText();
        java.lang.String str21 = property15.getAsText();
        java.lang.String str22 = property15.getAsString();
        java.lang.String str23 = property15.getAsShortText();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Sep" + "'", str20, "Sep");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "September" + "'", str21, "September");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9" + "'", str22, "9");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Sep" + "'", str23, "Sep");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        int int15 = property4.getMaximumValueOverall();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property4.getAsText(locale16);
        org.joda.time.YearMonth yearMonth18 = property4.getYearMonth();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth yearMonth30 = yearMonth28.minusYears((int) (short) 0);
        int int31 = yearMonth28.size();
        boolean boolean32 = yearMonth24.isAfter((org.joda.time.ReadablePartial) yearMonth28);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology35);
        org.joda.time.YearMonth.Property property37 = yearMonth36.monthOfYear();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology40);
        org.joda.time.YearMonth yearMonth43 = yearMonth41.minusYears((int) (short) 0);
        int int44 = yearMonth41.size();
        org.joda.time.YearMonth yearMonth46 = yearMonth41.plusMonths((int) (byte) 10);
        int int47 = property37.compareTo((org.joda.time.ReadablePartial) yearMonth41);
        org.joda.time.Chronology chronology48 = yearMonth41.getChronology();
        org.joda.time.YearMonth yearMonth49 = yearMonth28.withChronologyRetainFields(chronology48);
        boolean boolean50 = property4.equals((java.lang.Object) yearMonth28);
        java.lang.String str51 = property4.getAsString();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "October" + "'", str17, "October");
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(yearMonth49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10" + "'", str51, "10");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.lang.String str8 = property4.getAsString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth.Property property13 = yearMonth12.monthOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth yearMonth19 = yearMonth17.minusYears((int) (short) 0);
        int int20 = yearMonth17.size();
        org.joda.time.YearMonth yearMonth22 = yearMonth17.plusMonths((int) (byte) 10);
        int int23 = property13.compareTo((org.joda.time.ReadablePartial) yearMonth17);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.YearMonth yearMonth27 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology26);
        org.joda.time.YearMonth yearMonth29 = yearMonth27.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.YearMonth yearMonth35 = yearMonth33.minusYears((int) (short) 0);
        int int36 = yearMonth33.size();
        boolean boolean37 = yearMonth29.isAfter((org.joda.time.ReadablePartial) yearMonth33);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.YearMonth yearMonth39 = yearMonth33.minus(readablePeriod38);
        boolean boolean40 = property13.equals((java.lang.Object) yearMonth33);
        org.joda.time.YearMonth yearMonth41 = property13.getYearMonth();
        org.joda.time.YearMonth yearMonth43 = new org.joda.time.YearMonth((long) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = yearMonth43.toString(dateTimeFormatter44);
        boolean boolean46 = yearMonth41.isAfter((org.joda.time.ReadablePartial) yearMonth43);
        org.joda.time.YearMonth yearMonth48 = yearMonth41.withYear((-292275054));
        boolean boolean49 = property4.equals((java.lang.Object) (-292275054));
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01" + "'", str45, "1970-01");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(yearMonth48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property4.getFieldType();
        int int10 = property4.getMinimumValue();
        org.joda.time.DurationField durationField11 = property4.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth13 = property4.setCopy("0097-02");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0097-02\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth yearMonth8 = yearMonth6.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        int int15 = yearMonth12.size();
        boolean boolean16 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.Interval interval17 = yearMonth8.toInterval();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology20);
        org.joda.time.YearMonth yearMonth23 = yearMonth21.minusYears((int) (short) 0);
        int int24 = yearMonth21.size();
        org.joda.time.YearMonth yearMonth26 = yearMonth21.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        int int28 = yearMonth21.indexOf(dateTimeFieldType27);
        org.joda.time.Interval interval29 = yearMonth21.toInterval();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.YearMonth.Property property34 = yearMonth33.monthOfYear();
        int int35 = property34.getMaximumValue();
        java.lang.String str36 = property34.getAsShortText();
        java.util.Locale locale37 = null;
        java.lang.String str38 = property34.getAsShortText(locale37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property34.getFieldType();
        int int40 = yearMonth21.get(dateTimeFieldType39);
        org.joda.time.YearMonth.Property property41 = yearMonth8.property(dateTimeFieldType39);
        boolean boolean42 = yearMonth2.isSupported(dateTimeFieldType39);
        org.joda.time.YearMonth.Property property43 = yearMonth2.year();
        java.lang.String str44 = property43.toString();
        java.lang.String str45 = property43.getAsText();
        java.lang.String str46 = property43.getAsShortText();
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 12 + "'", int35 == 12);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Oct" + "'", str36, "Oct");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Oct" + "'", str38, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Property[year]" + "'", str44, "Property[year]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1" + "'", str45, "1");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1" + "'", str46, "1");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        java.lang.String str9 = property4.getAsShortText(locale8);
        java.lang.String str10 = property4.getAsShortText();
        org.joda.time.DurationField durationField11 = property4.getDurationField();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Oct" + "'", str9, "Oct");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Oct" + "'", str10, "Oct");
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.Interval interval11 = yearMonth3.toInterval();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth.Property property16 = yearMonth15.monthOfYear();
        int int17 = property16.getMaximumValue();
        java.lang.String str18 = property16.getAsShortText();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property16.getAsShortText(locale19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property16.getFieldType();
        int int22 = yearMonth3.get(dateTimeFieldType21);
        org.joda.time.Interval interval23 = yearMonth3.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray24 = yearMonth3.getFieldTypes();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Oct" + "'", str18, "Oct");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Oct" + "'", str20, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray24);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth yearMonth6 = yearMonth4.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology9);
        org.joda.time.YearMonth yearMonth12 = yearMonth10.minusYears((int) (short) 0);
        int int13 = yearMonth10.size();
        boolean boolean14 = yearMonth6.isAfter((org.joda.time.ReadablePartial) yearMonth10);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth.Property property19 = yearMonth18.monthOfYear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.YearMonth yearMonth23 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology22);
        org.joda.time.YearMonth yearMonth25 = yearMonth23.minusYears((int) (short) 0);
        int int26 = yearMonth23.size();
        org.joda.time.YearMonth yearMonth28 = yearMonth23.plusMonths((int) (byte) 10);
        int int29 = property19.compareTo((org.joda.time.ReadablePartial) yearMonth23);
        org.joda.time.Chronology chronology30 = yearMonth23.getChronology();
        org.joda.time.YearMonth yearMonth31 = yearMonth10.withChronologyRetainFields(chronology30);
        org.joda.time.YearMonth yearMonth32 = new org.joda.time.YearMonth((long) (short) 1, chronology30);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.YearMonth yearMonth35 = yearMonth32.withPeriodAdded(readablePeriod33, 100);
        org.joda.time.YearMonth yearMonth37 = yearMonth32.plusYears(10);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.YearMonth yearMonth39 = yearMonth37.plus(readablePeriod38);
        org.joda.time.YearMonth.Property property40 = yearMonth37.monthOfYear();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(yearMonth25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeField41);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology23);
        org.joda.time.YearMonth yearMonth26 = yearMonth24.minusYears((int) (short) 0);
        int int27 = yearMonth24.size();
        boolean boolean28 = yearMonth20.isAfter((org.joda.time.ReadablePartial) yearMonth24);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.YearMonth yearMonth30 = yearMonth24.minus(readablePeriod29);
        boolean boolean31 = property4.equals((java.lang.Object) yearMonth24);
        org.joda.time.YearMonth yearMonth32 = property4.getYearMonth();
        java.util.Locale locale33 = null;
        int int34 = property4.getMaximumTextLength(locale33);
        int int35 = property4.getMaximumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth37 = property4.setCopy("0129-10");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0129-10\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 12 + "'", int35 == 12);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = yearMonth8.toInterval(dateTimeZone15);
        int int18 = yearMonth8.getValue(0);
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth(1, 12);
        boolean boolean22 = yearMonth8.isEqual((org.joda.time.ReadablePartial) yearMonth21);
        org.joda.time.YearMonth.Property property23 = yearMonth8.monthOfYear();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        boolean boolean22 = yearMonth14.isAfter((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.YearMonth yearMonth24 = yearMonth18.minus(readablePeriod23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth yearMonth30 = yearMonth28.minusYears((int) (short) 0);
        int int31 = yearMonth28.size();
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.YearMonth yearMonth38 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology37);
        org.joda.time.YearMonth yearMonth40 = yearMonth38.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology43);
        org.joda.time.YearMonth yearMonth46 = yearMonth44.minusYears((int) (short) 0);
        int int47 = yearMonth44.size();
        boolean boolean48 = yearMonth40.isAfter((org.joda.time.ReadablePartial) yearMonth44);
        org.joda.time.Interval interval49 = yearMonth40.toInterval();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology52);
        org.joda.time.YearMonth yearMonth55 = yearMonth53.minusYears((int) (short) 0);
        int int56 = yearMonth53.size();
        org.joda.time.YearMonth yearMonth58 = yearMonth53.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = null;
        int int60 = yearMonth53.indexOf(dateTimeFieldType59);
        org.joda.time.Interval interval61 = yearMonth53.toInterval();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.YearMonth yearMonth65 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology64);
        org.joda.time.YearMonth.Property property66 = yearMonth65.monthOfYear();
        int int67 = property66.getMaximumValue();
        java.lang.String str68 = property66.getAsShortText();
        java.util.Locale locale69 = null;
        java.lang.String str70 = property66.getAsShortText(locale69);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property66.getFieldType();
        int int72 = yearMonth53.get(dateTimeFieldType71);
        org.joda.time.YearMonth.Property property73 = yearMonth40.property(dateTimeFieldType71);
        boolean boolean74 = yearMonth34.isSupported(dateTimeFieldType71);
        org.joda.time.YearMonth yearMonth76 = yearMonth28.withField(dateTimeFieldType71, (int) (short) 10);
        boolean boolean77 = yearMonth18.isSupported(dateTimeFieldType71);
        int int78 = yearMonth3.get(dateTimeFieldType71);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(yearMonth40);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 12 + "'", int67 == 12);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Oct" + "'", str68, "Oct");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Oct" + "'", str70, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(yearMonth76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        org.joda.time.YearMonth yearMonth8 = property4.addToCopy(1);
        java.lang.String str9 = property4.getName();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "monthOfYear" + "'", str9, "monthOfYear");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        int int9 = property4.getMaximumValue();
        int int10 = property4.getMinimumValueOverall();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property4.getAsText(locale11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.YearMonth yearMonth16 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology15);
        org.joda.time.YearMonth.Property property17 = yearMonth16.monthOfYear();
        int int18 = property17.getMaximumValue();
        java.lang.String str19 = property17.getAsShortText();
        org.joda.time.DateTimeField dateTimeField20 = property17.getField();
        org.joda.time.YearMonth yearMonth22 = property17.setCopy("Oct");
        int int23 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth22);
        java.util.Locale locale24 = null;
        java.lang.String str25 = property4.getAsText(locale24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.YearMonth yearMonth29 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology28);
        org.joda.time.YearMonth.Property property30 = yearMonth29.monthOfYear();
        int int31 = property30.getMaximumValue();
        java.lang.String str32 = property30.getAsShortText();
        org.joda.time.YearMonth yearMonth34 = property30.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.YearMonth yearMonth36 = property30.addToCopy(11);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology39);
        org.joda.time.YearMonth.Property property41 = yearMonth40.monthOfYear();
        int int42 = property41.getMaximumValue();
        java.lang.String str43 = property41.getAsString();
        java.util.Locale locale45 = null;
        org.joda.time.YearMonth yearMonth46 = property41.setCopy("Sep", locale45);
        java.lang.String str47 = property41.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property41.getFieldType();
        int int49 = yearMonth36.get(dateTimeFieldType48);
        boolean boolean50 = property4.equals((java.lang.Object) int49);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "October" + "'", str12, "October");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Oct" + "'", str19, "Oct");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "October" + "'", str25, "October");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 12 + "'", int31 == 12);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Oct" + "'", str32, "Oct");
        org.junit.Assert.assertNotNull(yearMonth34);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 12 + "'", int42 == 12);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10" + "'", str43, "10");
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "monthOfYear" + "'", str47, "monthOfYear");
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth((long) (-1));
        org.joda.time.YearMonth.Property property2 = yearMonth1.monthOfYear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth yearMonth8 = yearMonth6.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        int int15 = yearMonth12.size();
        boolean boolean16 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.YearMonth.Property property17 = yearMonth12.year();
        org.joda.time.YearMonth yearMonth19 = yearMonth12.minusMonths(97);
        int int20 = property2.compareTo((org.joda.time.ReadablePartial) yearMonth19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth yearMonth6 = yearMonth4.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology9);
        org.joda.time.YearMonth yearMonth12 = yearMonth10.minusYears((int) (short) 0);
        int int13 = yearMonth10.size();
        boolean boolean14 = yearMonth6.isAfter((org.joda.time.ReadablePartial) yearMonth10);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth.Property property19 = yearMonth18.monthOfYear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.YearMonth yearMonth23 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology22);
        org.joda.time.YearMonth yearMonth25 = yearMonth23.minusYears((int) (short) 0);
        int int26 = yearMonth23.size();
        org.joda.time.YearMonth yearMonth28 = yearMonth23.plusMonths((int) (byte) 10);
        int int29 = property19.compareTo((org.joda.time.ReadablePartial) yearMonth23);
        org.joda.time.Chronology chronology30 = yearMonth23.getChronology();
        org.joda.time.YearMonth yearMonth31 = yearMonth10.withChronologyRetainFields(chronology30);
        org.joda.time.YearMonth yearMonth32 = new org.joda.time.YearMonth((long) (short) 1, chronology30);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.YearMonth yearMonth35 = yearMonth32.withPeriodAdded(readablePeriod33, 100);
        org.joda.time.YearMonth yearMonth37 = yearMonth32.plusYears(10);
        org.joda.time.YearMonth yearMonth39 = yearMonth37.plusYears((int) '#');
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.YearMonth yearMonth41 = yearMonth37.minus(readablePeriod40);
        org.joda.time.YearMonth.Property property42 = yearMonth37.year();
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(yearMonth25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertNotNull(property42);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        org.joda.time.DateTimeField dateTimeField7 = property4.getField();
        org.joda.time.YearMonth yearMonth9 = property4.setCopy("Oct");
        org.joda.time.YearMonth yearMonth11 = property4.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.YearMonth yearMonth13 = yearMonth11.plusMonths(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Interval interval15 = yearMonth13.toInterval(dateTimeZone14);
        int int16 = yearMonth13.size();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth yearMonth22 = yearMonth20.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth.Property property27 = yearMonth26.monthOfYear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth yearMonth33 = yearMonth31.minusYears((int) (short) 0);
        int int34 = yearMonth31.size();
        org.joda.time.YearMonth yearMonth36 = yearMonth31.plusMonths((int) (byte) 10);
        int int37 = property27.compareTo((org.joda.time.ReadablePartial) yearMonth31);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.Interval interval39 = yearMonth31.toInterval(dateTimeZone38);
        org.joda.time.YearMonth yearMonth41 = yearMonth31.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth yearMonth47 = yearMonth45.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.YearMonth yearMonth51 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology50);
        org.joda.time.YearMonth yearMonth53 = yearMonth51.minusYears((int) (short) 0);
        int int54 = yearMonth51.size();
        boolean boolean55 = yearMonth47.isAfter((org.joda.time.ReadablePartial) yearMonth51);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.YearMonth yearMonth59 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology58);
        org.joda.time.YearMonth.Property property60 = yearMonth59.monthOfYear();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology63);
        org.joda.time.YearMonth yearMonth66 = yearMonth64.minusYears((int) (short) 0);
        int int67 = yearMonth64.size();
        org.joda.time.YearMonth yearMonth69 = yearMonth64.plusMonths((int) (byte) 10);
        int int70 = property60.compareTo((org.joda.time.ReadablePartial) yearMonth64);
        org.joda.time.Chronology chronology71 = yearMonth64.getChronology();
        org.joda.time.YearMonth yearMonth72 = yearMonth51.withChronologyRetainFields(chronology71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.YearMonth yearMonth75 = yearMonth72.withPeriodAdded(readablePeriod73, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = null;
        int int77 = yearMonth75.indexOf(dateTimeFieldType76);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.YearMonth yearMonth81 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology80);
        org.joda.time.YearMonth.Property property82 = yearMonth81.monthOfYear();
        int int83 = property82.getMaximumValue();
        java.lang.String str84 = property82.getAsShortText();
        java.util.Locale locale85 = null;
        java.lang.String str86 = property82.getAsShortText(locale85);
        org.joda.time.YearMonth yearMonth88 = property82.setCopy("October");
        org.joda.time.ReadableInstant readableInstant89 = null;
        org.joda.time.DateTime dateTime90 = yearMonth88.toDateTime(readableInstant89);
        org.joda.time.DateTime dateTime91 = yearMonth75.toDateTime(readableInstant89);
        org.joda.time.DateTime dateTime92 = yearMonth31.toDateTime((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.DateTime dateTime93 = yearMonth22.toDateTime((org.joda.time.ReadableInstant) dateTime92);
        org.joda.time.DateTime dateTime94 = yearMonth13.toDateTime((org.joda.time.ReadableInstant) dateTime92);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(yearMonth66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(yearMonth69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(yearMonth72);
        org.junit.Assert.assertNotNull(yearMonth75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 12 + "'", int83 == 12);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Oct" + "'", str84, "Oct");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Oct" + "'", str86, "Oct");
        org.junit.Assert.assertNotNull(yearMonth88);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertNotNull(dateTime93);
        org.junit.Assert.assertNotNull(dateTime94);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.YearMonth yearMonth3 = yearMonth1.minus(readablePeriod2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = yearMonth1.toString(dateTimeFormatter4);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth yearMonth17 = yearMonth15.minusYears((int) (short) 0);
        int int18 = yearMonth15.size();
        boolean boolean19 = yearMonth11.isAfter((org.joda.time.ReadablePartial) yearMonth15);
        org.joda.time.Interval interval20 = yearMonth11.toInterval();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology23);
        org.joda.time.YearMonth yearMonth26 = yearMonth24.minusYears((int) (short) 0);
        int int27 = yearMonth24.size();
        org.joda.time.YearMonth yearMonth29 = yearMonth24.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        int int31 = yearMonth24.indexOf(dateTimeFieldType30);
        org.joda.time.Interval interval32 = yearMonth24.toInterval();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology35);
        org.joda.time.YearMonth.Property property37 = yearMonth36.monthOfYear();
        int int38 = property37.getMaximumValue();
        java.lang.String str39 = property37.getAsShortText();
        java.util.Locale locale40 = null;
        java.lang.String str41 = property37.getAsShortText(locale40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property37.getFieldType();
        int int43 = yearMonth24.get(dateTimeFieldType42);
        org.joda.time.YearMonth.Property property44 = yearMonth11.property(dateTimeFieldType42);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.YearMonth yearMonth46 = yearMonth11.minus(readablePeriod45);
        org.joda.time.YearMonth yearMonth48 = yearMonth11.minusYears((int) (byte) 100);
        int int49 = yearMonth1.compareTo((org.joda.time.ReadablePartial) yearMonth48);
        org.joda.time.YearMonth yearMonth52 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.YearMonth yearMonth54 = yearMonth52.withYear((int) (byte) 1);
        boolean boolean55 = yearMonth1.isAfter((org.joda.time.ReadablePartial) yearMonth52);
        org.junit.Assert.assertNotNull(yearMonth3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11" + "'", str5, "2020-11");
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 12 + "'", int38 == 12);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Oct" + "'", str39, "Oct");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Oct" + "'", str41, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertNotNull(yearMonth48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(yearMonth54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(1970, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology1 = yearMonth0.getChronology();
        org.joda.time.YearMonth yearMonth3 = yearMonth0.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth0.getFieldTypes();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        int int15 = yearMonth8.indexOf(dateTimeFieldType14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth.Property property20 = yearMonth19.monthOfYear();
        int int21 = property20.getMaximumValue();
        java.lang.String str22 = property20.getAsShortText();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property20.getAsShortText(locale23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property20.getFieldType();
        org.joda.time.YearMonth.Property property26 = yearMonth8.property(dateTimeFieldType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth yearMonth32 = yearMonth30.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology35);
        org.joda.time.YearMonth yearMonth38 = yearMonth36.minusYears((int) (short) 0);
        int int39 = yearMonth36.size();
        boolean boolean40 = yearMonth32.isAfter((org.joda.time.ReadablePartial) yearMonth36);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology43);
        org.joda.time.YearMonth.Property property45 = yearMonth44.monthOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.YearMonth yearMonth49 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology48);
        org.joda.time.YearMonth yearMonth51 = yearMonth49.minusYears((int) (short) 0);
        int int52 = yearMonth49.size();
        org.joda.time.YearMonth yearMonth54 = yearMonth49.plusMonths((int) (byte) 10);
        int int55 = property45.compareTo((org.joda.time.ReadablePartial) yearMonth49);
        org.joda.time.Chronology chronology56 = yearMonth49.getChronology();
        org.joda.time.YearMonth yearMonth57 = yearMonth36.withChronologyRetainFields(chronology56);
        org.joda.time.YearMonth yearMonth58 = new org.joda.time.YearMonth((java.lang.Object) yearMonth8, chronology56);
        boolean boolean59 = yearMonth0.equals((java.lang.Object) yearMonth58);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(yearMonth3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Oct" + "'", str22, "Oct");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Oct" + "'", str24, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(yearMonth54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        int int15 = yearMonth8.indexOf(dateTimeFieldType14);
        org.joda.time.YearMonth yearMonth17 = yearMonth8.plusMonths((-1));
        int int18 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth17);
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.YearMonth yearMonth23 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology22);
        org.joda.time.YearMonth yearMonth25 = yearMonth23.minusYears((int) (short) 0);
        org.joda.time.Interval interval26 = yearMonth23.toInterval();
        org.joda.time.Chronology chronology27 = yearMonth23.getChronology();
        org.joda.time.YearMonth yearMonth28 = yearMonth19.withChronologyRetainFields(chronology27);
        org.joda.time.YearMonth yearMonth29 = new org.joda.time.YearMonth(chronology27);
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth(chronology27);
        org.joda.time.YearMonth yearMonth31 = org.joda.time.YearMonth.now(chronology27);
        org.joda.time.YearMonth yearMonth32 = org.joda.time.YearMonth.now(chronology27);
        org.joda.time.YearMonth yearMonth33 = org.joda.time.YearMonth.now(chronology27);
        org.joda.time.YearMonth yearMonth34 = yearMonth17.withChronologyRetainFields(chronology27);
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth(chronology27);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.YearMonth yearMonth39 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology38);
        org.joda.time.YearMonth.Property property40 = yearMonth39.monthOfYear();
        int int41 = property40.getMaximumValue();
        java.lang.String str42 = property40.getAsShortText();
        org.joda.time.YearMonth yearMonth44 = property40.addWrapFieldToCopy((int) (short) -1);
        int[] intArray45 = yearMonth44.getValues();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.YearMonth yearMonth49 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology48);
        org.joda.time.YearMonth.Property property50 = yearMonth49.monthOfYear();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology53);
        org.joda.time.YearMonth yearMonth56 = yearMonth54.minusYears((int) (short) 0);
        int int57 = yearMonth54.size();
        org.joda.time.YearMonth yearMonth59 = yearMonth54.plusMonths((int) (byte) 10);
        int int60 = property50.compareTo((org.joda.time.ReadablePartial) yearMonth54);
        org.joda.time.Chronology chronology61 = yearMonth54.getChronology();
        org.joda.time.YearMonth yearMonth62 = org.joda.time.YearMonth.now(chronology61);
        org.joda.time.YearMonth yearMonth63 = yearMonth44.withChronologyRetainFields(chronology61);
        java.lang.String str64 = yearMonth44.toString();
        boolean boolean65 = yearMonth35.isEqual((org.joda.time.ReadablePartial) yearMonth44);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(yearMonth25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertNotNull(yearMonth34);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 12 + "'", int41 == 12);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Oct" + "'", str42, "Oct");
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[97, 9]");
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(yearMonth62);
        org.junit.Assert.assertNotNull(yearMonth63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0097-09" + "'", str64, "0097-09");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology13);
        org.joda.time.YearMonth yearMonth16 = yearMonth14.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth yearMonth22 = yearMonth20.minusYears((int) (short) 0);
        int int23 = yearMonth20.size();
        boolean boolean24 = yearMonth16.isAfter((org.joda.time.ReadablePartial) yearMonth20);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth.Property property29 = yearMonth28.monthOfYear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.YearMonth yearMonth35 = yearMonth33.minusYears((int) (short) 0);
        int int36 = yearMonth33.size();
        org.joda.time.YearMonth yearMonth38 = yearMonth33.plusMonths((int) (byte) 10);
        int int39 = property29.compareTo((org.joda.time.ReadablePartial) yearMonth33);
        org.joda.time.Chronology chronology40 = yearMonth33.getChronology();
        org.joda.time.YearMonth yearMonth41 = yearMonth20.withChronologyRetainFields(chronology40);
        int int42 = yearMonth3.compareTo((org.joda.time.ReadablePartial) yearMonth20);
        int int43 = yearMonth20.getYear();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.Interval interval45 = yearMonth20.toInterval(dateTimeZone44);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertNotNull(interval45);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getAsShortText();
        int int11 = property4.get();
        org.joda.time.YearMonth yearMonth13 = property4.addToCopy(3);
        org.joda.time.YearMonth yearMonth15 = yearMonth13.withYear((int) (short) 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Oct" + "'", str10, "Oct");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertNotNull(yearMonth15);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = yearMonth3.getFieldTypes();
        org.joda.time.YearMonth yearMonth17 = yearMonth3.minusMonths(0);
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((long) ' ');
        org.joda.time.Chronology chronology20 = yearMonth19.getChronology();
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth(chronology20);
        int int22 = yearMonth17.compareTo((org.joda.time.ReadablePartial) yearMonth21);
        int int23 = yearMonth21.getYear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.YearMonth yearMonth27 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology26);
        org.joda.time.YearMonth yearMonth29 = yearMonth27.minusYears((int) (short) 0);
        int int30 = yearMonth27.size();
        org.joda.time.YearMonth yearMonth32 = yearMonth27.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        int int34 = yearMonth27.indexOf(dateTimeFieldType33);
        org.joda.time.YearMonth yearMonth36 = yearMonth27.plusMonths((-1));
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology39);
        org.joda.time.YearMonth yearMonth42 = yearMonth40.minusYears((int) (short) 0);
        int int43 = yearMonth40.size();
        org.joda.time.YearMonth yearMonth45 = yearMonth40.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        int int47 = yearMonth40.indexOf(dateTimeFieldType46);
        org.joda.time.Interval interval48 = yearMonth40.toInterval();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.YearMonth yearMonth52 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology51);
        org.joda.time.YearMonth.Property property53 = yearMonth52.monthOfYear();
        int int54 = property53.getMaximumValue();
        java.lang.String str55 = property53.getAsShortText();
        java.util.Locale locale56 = null;
        java.lang.String str57 = property53.getAsShortText(locale56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property53.getFieldType();
        int int59 = yearMonth40.get(dateTimeFieldType58);
        org.joda.time.YearMonth.Property property60 = yearMonth27.property(dateTimeFieldType58);
        org.joda.time.Chronology chronology61 = yearMonth27.getChronology();
        int int63 = yearMonth27.getValue(0);
        org.joda.time.Interval interval64 = yearMonth27.toInterval();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.YearMonth yearMonth68 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology67);
        org.joda.time.YearMonth yearMonth70 = yearMonth68.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.YearMonth yearMonth74 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology73);
        org.joda.time.YearMonth yearMonth76 = yearMonth74.minusYears((int) (short) 0);
        int int77 = yearMonth74.size();
        boolean boolean78 = yearMonth70.isAfter((org.joda.time.ReadablePartial) yearMonth74);
        org.joda.time.YearMonth.Property property79 = yearMonth74.year();
        org.joda.time.YearMonth.Property property80 = yearMonth74.year();
        org.joda.time.YearMonth yearMonth82 = yearMonth74.plusMonths(97);
        boolean boolean83 = yearMonth27.isAfter((org.joda.time.ReadablePartial) yearMonth82);
        org.joda.time.DateTimeField[] dateTimeFieldArray84 = yearMonth27.getFields();
        org.joda.time.Chronology chronology85 = yearMonth27.getChronology();
        org.joda.time.YearMonth yearMonth86 = new org.joda.time.YearMonth((java.lang.Object) yearMonth21, chronology85);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2020 + "'", int23 == 2020);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertNotNull(yearMonth42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(yearMonth45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 12 + "'", int54 == 12);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Oct" + "'", str55, "Oct");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Oct" + "'", str57, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(yearMonth70);
        org.junit.Assert.assertNotNull(yearMonth76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(yearMonth82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray84);
        org.junit.Assert.assertNotNull(chronology85);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth((long) 100);
        org.joda.time.YearMonth.Property property2 = yearMonth1.monthOfYear();
        org.joda.time.YearMonth yearMonth4 = property2.addWrapFieldToCopy(0);
        int int5 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        boolean boolean21 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray22 = yearMonth18.getFieldTypes();
        org.joda.time.YearMonth yearMonth24 = yearMonth18.withMonthOfYear((int) (byte) 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray22);
        org.junit.Assert.assertNotNull(yearMonth24);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        java.util.Locale locale11 = null;
        int int12 = property4.getMaximumShortTextLength(locale11);
        org.joda.time.YearMonth yearMonth14 = property4.addToCopy(100);
        org.joda.time.YearMonth yearMonth16 = yearMonth14.plusYears(12);
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((long) (-1));
        boolean boolean19 = yearMonth16.isEqual((org.joda.time.ReadablePartial) yearMonth18);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = yearMonth8.toString(dateTimeFormatter15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth.Property property21 = yearMonth20.monthOfYear();
        int int22 = property21.getMinimumValue();
        java.util.Locale locale23 = null;
        int int24 = property21.getMaximumShortTextLength(locale23);
        org.joda.time.DurationField durationField25 = property21.getDurationField();
        boolean boolean26 = yearMonth8.equals((java.lang.Object) property21);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth yearMonth32 = yearMonth30.minusYears((int) (short) 0);
        int int33 = yearMonth30.size();
        org.joda.time.YearMonth yearMonth35 = yearMonth30.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        int int37 = yearMonth30.indexOf(dateTimeFieldType36);
        org.joda.time.YearMonth yearMonth39 = yearMonth30.plusMonths((-1));
        boolean boolean41 = yearMonth39.equals((java.lang.Object) 1);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth.Property property46 = yearMonth45.monthOfYear();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.YearMonth yearMonth50 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology49);
        org.joda.time.YearMonth yearMonth52 = yearMonth50.minusYears((int) (short) 0);
        int int53 = yearMonth50.size();
        org.joda.time.YearMonth yearMonth55 = yearMonth50.plusMonths((int) (byte) 10);
        int int56 = property46.compareTo((org.joda.time.ReadablePartial) yearMonth50);
        org.joda.time.YearMonth yearMonth57 = property46.getYearMonth();
        java.lang.String str58 = property46.getAsText();
        org.joda.time.YearMonth yearMonth59 = property46.getYearMonth();
        boolean boolean60 = yearMonth39.isBefore((org.joda.time.ReadablePartial) yearMonth59);
        org.joda.time.YearMonth yearMonth62 = yearMonth39.minusYears(3);
        int int63 = yearMonth8.compareTo((org.joda.time.ReadablePartial) yearMonth39);
        org.joda.time.YearMonth yearMonth65 = yearMonth39.plusMonths(1);
        org.joda.time.YearMonth.Property property66 = yearMonth39.year();
        java.lang.String str67 = property66.toString();
        int int68 = property66.getMaximumValueOverall();
        java.lang.Class<?> wildcardClass69 = property66.getClass();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0097-10" + "'", str16, "0097-10");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "October" + "'", str58, "October");
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(yearMonth62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Property[year]" + "'", str67, "Property[year]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 292278993 + "'", int68 == 292278993);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getName();
        org.joda.time.YearMonth yearMonth12 = property4.addToCopy((int) (short) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.YearMonth yearMonth16 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth.Property property21 = yearMonth20.monthOfYear();
        int int22 = property21.getMaximumValue();
        java.util.Locale locale23 = null;
        int int24 = property21.getMaximumShortTextLength(locale23);
        java.util.Locale locale25 = null;
        int int26 = property21.getMaximumTextLength(locale25);
        org.joda.time.DurationField durationField27 = property21.getRangeDurationField();
        java.util.Locale locale28 = null;
        java.lang.String str29 = property21.getAsShortText(locale28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property21.getFieldType();
        boolean boolean31 = yearMonth16.isSupported(dateTimeFieldType30);
        boolean boolean32 = property4.equals((java.lang.Object) dateTimeFieldType30);
        org.joda.time.DateTimeField dateTimeField33 = property4.getField();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property4.getAsShortText(locale34);
        org.joda.time.DurationField durationField36 = property4.getDurationField();
        org.joda.time.YearMonth yearMonth38 = property4.addToCopy((int) '#');
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Oct" + "'", str29, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Oct" + "'", str35, "Oct");
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(yearMonth38);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        boolean boolean21 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = yearMonth18.toString(dateTimeFormatter22);
        org.joda.time.YearMonth.Property property24 = yearMonth18.year();
        org.joda.time.YearMonth yearMonth26 = property24.setCopy(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property24.getFieldType();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0097-10" + "'", str23, "0097-10");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        org.joda.time.YearMonth yearMonth8 = property4.addToCopy((int) ' ');
        java.util.Locale locale10 = null;
        java.lang.String str11 = yearMonth8.toString("2015-01", locale10);
        java.lang.String str12 = yearMonth8.toString();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2015-01" + "'", str11, "2015-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0100-06" + "'", str12, "0100-06");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.YearMonth yearMonth7 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology6);
        org.joda.time.YearMonth.Property property8 = yearMonth7.monthOfYear();
        int int9 = property8.getMaximumValue();
        java.util.Locale locale10 = null;
        int int11 = property8.getMaximumShortTextLength(locale10);
        java.util.Locale locale12 = null;
        int int13 = property8.getMaximumTextLength(locale12);
        org.joda.time.DurationField durationField14 = property8.getRangeDurationField();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property8.getAsShortText(locale15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property8.getFieldType();
        boolean boolean18 = yearMonth3.isSupported(dateTimeFieldType17);
        int[] intArray19 = yearMonth3.getValues();
        org.joda.time.YearMonth yearMonth21 = yearMonth3.withMonthOfYear(11);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.YearMonth yearMonth25 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology24);
        org.joda.time.YearMonth.Property property26 = yearMonth25.monthOfYear();
        int int27 = property26.getMaximumValue();
        java.util.Locale locale28 = null;
        int int29 = property26.getMaximumShortTextLength(locale28);
        java.util.Locale locale30 = null;
        int int31 = property26.getMaximumTextLength(locale30);
        org.joda.time.DurationField durationField32 = property26.getRangeDurationField();
        java.lang.String str33 = property26.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property26.getFieldType();
        org.joda.time.YearMonth.Property property35 = yearMonth3.property(dateTimeFieldType34);
        java.lang.String str36 = property35.getAsShortText();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Oct" + "'", str16, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10]");
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Property[monthOfYear]" + "'", str33, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Oct" + "'", str36, "Oct");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        java.lang.String str11 = property4.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property4.getFieldType();
        java.lang.String str13 = property4.toString();
        org.joda.time.YearMonth yearMonth15 = property4.setCopy("Jan");
        org.joda.time.DateTimeField dateTimeField16 = property4.getField();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[monthOfYear]" + "'", str11, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Property[monthOfYear]" + "'", str13, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        org.joda.time.YearMonth yearMonth8 = property4.addWrapFieldToCopy((int) (short) -1);
        int[] intArray9 = yearMonth8.getValues();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth.Property property14 = yearMonth13.monthOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        int int24 = property14.compareTo((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.Chronology chronology25 = yearMonth18.getChronology();
        org.joda.time.YearMonth yearMonth26 = org.joda.time.YearMonth.now(chronology25);
        org.joda.time.YearMonth yearMonth27 = yearMonth8.withChronologyRetainFields(chronology25);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth.Property property32 = yearMonth31.monthOfYear();
        int int33 = property32.getMaximumValue();
        java.util.Locale locale34 = null;
        int int35 = property32.getMaximumShortTextLength(locale34);
        java.util.Locale locale36 = null;
        int int37 = property32.getMaximumTextLength(locale36);
        java.lang.String str38 = property32.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property32.getFieldType();
        boolean boolean40 = yearMonth27.isSupported(dateTimeFieldType39);
        java.lang.String str41 = yearMonth27.toString();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth yearMonth47 = yearMonth45.minusYears((int) (short) 0);
        int int48 = yearMonth45.size();
        org.joda.time.YearMonth yearMonth50 = yearMonth45.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray51 = yearMonth45.getFieldTypes();
        int[] intArray52 = yearMonth45.getValues();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.YearMonth yearMonth56 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology55);
        org.joda.time.YearMonth.Property property57 = yearMonth56.monthOfYear();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.YearMonth yearMonth61 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology60);
        org.joda.time.YearMonth yearMonth63 = yearMonth61.minusYears((int) (short) 0);
        int int64 = yearMonth61.size();
        org.joda.time.YearMonth yearMonth66 = yearMonth61.plusMonths((int) (byte) 10);
        int int67 = property57.compareTo((org.joda.time.ReadablePartial) yearMonth61);
        org.joda.time.Chronology chronology68 = yearMonth61.getChronology();
        org.joda.time.YearMonth yearMonth69 = org.joda.time.YearMonth.now(chronology68);
        org.joda.time.YearMonth yearMonth70 = org.joda.time.YearMonth.now(chronology68);
        org.joda.time.YearMonth yearMonth71 = new org.joda.time.YearMonth((java.lang.Object) yearMonth45, chronology68);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.YearMonth yearMonth75 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology74);
        org.joda.time.YearMonth.Property property76 = yearMonth75.monthOfYear();
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.YearMonth yearMonth80 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology79);
        org.joda.time.YearMonth yearMonth82 = yearMonth80.minusYears((int) (short) 0);
        int int83 = yearMonth80.size();
        org.joda.time.YearMonth yearMonth85 = yearMonth80.plusMonths((int) (byte) 10);
        int int86 = property76.compareTo((org.joda.time.ReadablePartial) yearMonth80);
        org.joda.time.DateTimeZone dateTimeZone87 = null;
        org.joda.time.Interval interval88 = yearMonth80.toInterval(dateTimeZone87);
        org.joda.time.YearMonth yearMonth90 = yearMonth80.minusYears((int) (short) 0);
        boolean boolean91 = yearMonth71.isAfter((org.joda.time.ReadablePartial) yearMonth90);
        org.joda.time.YearMonth yearMonth93 = yearMonth90.plusYears(12);
        org.joda.time.ReadablePeriod readablePeriod94 = null;
        org.joda.time.YearMonth yearMonth96 = yearMonth90.withPeriodAdded(readablePeriod94, 11);
        int int97 = yearMonth27.compareTo((org.joda.time.ReadablePartial) yearMonth96);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 9]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Oct" + "'", str38, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0097-09" + "'", str41, "0097-09");
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray51);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[97, 10]");
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(yearMonth63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertNotNull(yearMonth66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(yearMonth69);
        org.junit.Assert.assertNotNull(yearMonth70);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(yearMonth82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
        org.junit.Assert.assertNotNull(yearMonth85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(interval88);
        org.junit.Assert.assertNotNull(yearMonth90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(yearMonth93);
        org.junit.Assert.assertNotNull(yearMonth96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getAsShortText();
        org.joda.time.DateTimeField dateTimeField11 = property4.getField();
        org.joda.time.DurationField durationField12 = property4.getDurationField();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property4.getAsShortText(locale13);
        java.lang.String str15 = property4.toString();
        java.util.Locale locale16 = null;
        int int17 = property4.getMaximumTextLength(locale16);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Oct" + "'", str10, "Oct");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Oct" + "'", str14, "Oct");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[monthOfYear]" + "'", str15, "Property[monthOfYear]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.YearMonth yearMonth5 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology4);
        org.joda.time.YearMonth yearMonth7 = yearMonth5.minusYears((int) (short) 0);
        org.joda.time.Interval interval8 = yearMonth5.toInterval();
        org.joda.time.Chronology chronology9 = yearMonth5.getChronology();
        org.joda.time.YearMonth yearMonth10 = yearMonth1.withChronologyRetainFields(chronology9);
        org.joda.time.YearMonth yearMonth11 = new org.joda.time.YearMonth((long) (byte) 0, chronology9);
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth(chronology9);
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth(chronology9);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth.Property property20 = yearMonth19.monthOfYear();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology23);
        org.joda.time.YearMonth yearMonth26 = yearMonth24.minusYears((int) (short) 0);
        int int27 = yearMonth24.size();
        org.joda.time.YearMonth yearMonth29 = yearMonth24.plusMonths((int) (byte) 10);
        int int30 = property20.compareTo((org.joda.time.ReadablePartial) yearMonth24);
        org.joda.time.Chronology chronology31 = yearMonth24.getChronology();
        org.joda.time.YearMonth yearMonth32 = new org.joda.time.YearMonth((int) (byte) 0, 11, chronology31);
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth(chronology31);
        boolean boolean34 = yearMonth13.equals((java.lang.Object) yearMonth33);
        org.junit.Assert.assertNotNull(yearMonth7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology15 = yearMonth8.getChronology();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusYears((int) (short) 0);
        int int22 = yearMonth19.size();
        org.joda.time.YearMonth yearMonth24 = yearMonth19.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        int int26 = yearMonth19.indexOf(dateTimeFieldType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth.Property property31 = yearMonth30.monthOfYear();
        int int32 = property31.getMaximumValue();
        java.lang.String str33 = property31.getAsShortText();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property31.getAsShortText(locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property31.getFieldType();
        org.joda.time.YearMonth.Property property37 = yearMonth19.property(dateTimeFieldType36);
        org.joda.time.YearMonth.Property property38 = yearMonth8.property(dateTimeFieldType36);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology41);
        org.joda.time.YearMonth yearMonth44 = yearMonth42.minusYears((int) (short) 0);
        int int45 = yearMonth42.size();
        org.joda.time.YearMonth yearMonth47 = yearMonth42.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        int int49 = yearMonth42.indexOf(dateTimeFieldType48);
        org.joda.time.YearMonth yearMonth51 = yearMonth42.plusMonths((-1));
        boolean boolean53 = yearMonth51.equals((java.lang.Object) 1);
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth((long) 100);
        boolean boolean56 = yearMonth51.isBefore((org.joda.time.ReadablePartial) yearMonth55);
        int int57 = yearMonth8.compareTo((org.joda.time.ReadablePartial) yearMonth51);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.YearMonth yearMonth60 = yearMonth51.withPeriodAdded(readablePeriod58, (int) (byte) -1);
        int int61 = yearMonth51.size();
        org.joda.time.YearMonth yearMonth63 = yearMonth51.minusMonths((int) (byte) 100);
        java.util.Locale locale65 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = yearMonth51.toString("Sep", locale65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: p");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 12 + "'", int32 == 12);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Oct" + "'", str35, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(yearMonth60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertNotNull(yearMonth63);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.YearMonth yearMonth5 = property4.getYearMonth();
        int int6 = property4.getMinimumValue();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        int int16 = property15.get();
        java.util.Locale locale17 = null;
        java.lang.String str18 = property15.getAsShortText(locale17);
        org.joda.time.DurationField durationField19 = property15.getDurationField();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Sep" + "'", str18, "Sep");
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth yearMonth6 = yearMonth4.minusYears((int) (short) 0);
        org.joda.time.Interval interval7 = yearMonth4.toInterval();
        org.joda.time.Chronology chronology8 = yearMonth4.getChronology();
        org.joda.time.YearMonth yearMonth9 = yearMonth0.withChronologyRetainFields(chronology8);
        org.joda.time.YearMonth yearMonth10 = org.joda.time.YearMonth.now(chronology8);
        org.joda.time.YearMonth.Property property11 = yearMonth10.monthOfYear();
        org.joda.time.YearMonth yearMonth13 = property11.setCopy("Oct");
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(yearMonth13);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.YearMonth yearMonth15 = property4.getYearMonth();
        java.lang.String str16 = property4.getAsText();
        org.joda.time.YearMonth yearMonth17 = property4.getYearMonth();
        org.joda.time.YearMonth yearMonth19 = property4.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField20 = property4.getField();
        int int21 = property4.getMinimumValue();
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth24 = property4.setCopy("", locale23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "October" + "'", str16, "October");
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        org.joda.time.YearMonth yearMonth9 = property4.addWrapFieldToCopy((int) (byte) 10);
        org.joda.time.YearMonth yearMonth10 = property4.getYearMonth();
        int int11 = property4.get();
        java.lang.String str12 = property4.getAsString();
        org.joda.time.DateTimeField dateTimeField13 = property4.getField();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology1 = yearMonth0.getChronology();
        org.joda.time.YearMonth yearMonth3 = yearMonth0.withMonthOfYear((int) (short) 1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.YearMonth yearMonth7 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology6);
        org.joda.time.YearMonth.Property property8 = yearMonth7.monthOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        int int15 = yearMonth12.size();
        org.joda.time.YearMonth yearMonth17 = yearMonth12.plusMonths((int) (byte) 10);
        int int18 = property8.compareTo((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        boolean boolean25 = yearMonth12.isAfter((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        int int27 = yearMonth12.indexOf(dateTimeFieldType26);
        int int28 = yearMonth12.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = yearMonth12.getFieldTypes();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology33);
        org.joda.time.YearMonth yearMonth36 = yearMonth34.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology39);
        org.joda.time.YearMonth yearMonth42 = yearMonth40.minusYears((int) (short) 0);
        int int43 = yearMonth40.size();
        boolean boolean44 = yearMonth36.isAfter((org.joda.time.ReadablePartial) yearMonth40);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.YearMonth yearMonth48 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology47);
        org.joda.time.YearMonth.Property property49 = yearMonth48.monthOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology52);
        org.joda.time.YearMonth yearMonth55 = yearMonth53.minusYears((int) (short) 0);
        int int56 = yearMonth53.size();
        org.joda.time.YearMonth yearMonth58 = yearMonth53.plusMonths((int) (byte) 10);
        int int59 = property49.compareTo((org.joda.time.ReadablePartial) yearMonth53);
        org.joda.time.Chronology chronology60 = yearMonth53.getChronology();
        org.joda.time.YearMonth yearMonth61 = yearMonth40.withChronologyRetainFields(chronology60);
        org.joda.time.YearMonth yearMonth62 = new org.joda.time.YearMonth((long) (short) 1, chronology60);
        org.joda.time.YearMonth yearMonth63 = new org.joda.time.YearMonth((java.lang.Object) yearMonth12, chronology60);
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth((java.lang.Object) yearMonth63);
        int int65 = yearMonth3.compareTo((org.joda.time.ReadablePartial) yearMonth64);
        org.joda.time.YearMonth.Property property66 = yearMonth64.monthOfYear();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(yearMonth3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertNotNull(yearMonth42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(yearMonth61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(property66);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        java.lang.String str6 = yearMonth3.toString();
        java.lang.String str7 = yearMonth3.toString();
        org.joda.time.YearMonth yearMonth9 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth yearMonth15 = yearMonth13.minusYears((int) (short) 0);
        int int16 = yearMonth13.size();
        org.joda.time.YearMonth yearMonth18 = yearMonth13.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        int int20 = yearMonth13.indexOf(dateTimeFieldType19);
        org.joda.time.YearMonth yearMonth22 = yearMonth13.plusMonths((-1));
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth yearMonth28 = yearMonth26.minusYears((int) (short) 0);
        int int29 = yearMonth26.size();
        org.joda.time.YearMonth yearMonth31 = yearMonth26.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        int int33 = yearMonth26.indexOf(dateTimeFieldType32);
        org.joda.time.Interval interval34 = yearMonth26.toInterval();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.YearMonth yearMonth38 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology37);
        org.joda.time.YearMonth.Property property39 = yearMonth38.monthOfYear();
        int int40 = property39.getMaximumValue();
        java.lang.String str41 = property39.getAsShortText();
        java.util.Locale locale42 = null;
        java.lang.String str43 = property39.getAsShortText(locale42);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property39.getFieldType();
        int int45 = yearMonth26.get(dateTimeFieldType44);
        org.joda.time.YearMonth.Property property46 = yearMonth13.property(dateTimeFieldType44);
        org.joda.time.Chronology chronology47 = yearMonth13.getChronology();
        int int49 = yearMonth13.getValue(0);
        org.joda.time.Interval interval50 = yearMonth13.toInterval();
        boolean boolean51 = yearMonth9.equals((java.lang.Object) yearMonth13);
        java.lang.String str53 = yearMonth9.toString("0097-09");
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.YearMonth yearMonth57 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology56);
        org.joda.time.YearMonth.Property property58 = yearMonth57.monthOfYear();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.YearMonth yearMonth62 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology61);
        org.joda.time.YearMonth yearMonth64 = yearMonth62.minusYears((int) (short) 0);
        int int65 = yearMonth62.size();
        org.joda.time.YearMonth yearMonth67 = yearMonth62.plusMonths((int) (byte) 10);
        int int68 = property58.compareTo((org.joda.time.ReadablePartial) yearMonth62);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.YearMonth yearMonth72 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology71);
        org.joda.time.YearMonth yearMonth74 = yearMonth72.minusYears((int) (short) 0);
        boolean boolean75 = yearMonth62.isAfter((org.joda.time.ReadablePartial) yearMonth72);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = null;
        int int77 = yearMonth62.indexOf(dateTimeFieldType76);
        int int78 = yearMonth62.size();
        org.joda.time.YearMonth yearMonth80 = yearMonth62.minusMonths((int) (short) -1);
        org.joda.time.YearMonth.Property property81 = yearMonth80.monthOfYear();
        org.joda.time.YearMonth yearMonth82 = property81.getYearMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = property81.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth85 = yearMonth9.withField(dateTimeFieldType83, 98);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 98 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0097-10" + "'", str6, "0097-10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0097-10" + "'", str7, "0097-10");
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 12 + "'", int40 == 12);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Oct" + "'", str41, "Oct");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Oct" + "'", str43, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0097-09" + "'", str53, "0097-09");
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(yearMonth64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertNotNull(yearMonth67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(yearMonth74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
        org.junit.Assert.assertNotNull(yearMonth80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(yearMonth82);
        org.junit.Assert.assertNotNull(dateTimeFieldType83);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth yearMonth6 = yearMonth4.minusYears((int) (short) 0);
        org.joda.time.Interval interval7 = yearMonth4.toInterval();
        org.joda.time.Chronology chronology8 = yearMonth4.getChronology();
        org.joda.time.YearMonth yearMonth9 = yearMonth0.withChronologyRetainFields(chronology8);
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth(chronology8);
        org.joda.time.YearMonth yearMonth11 = new org.joda.time.YearMonth(chronology8);
        org.joda.time.YearMonth yearMonth12 = org.joda.time.YearMonth.now(chronology8);
        org.joda.time.YearMonth yearMonth13 = org.joda.time.YearMonth.now(chronology8);
        int int14 = yearMonth13.getYear();
        int int15 = yearMonth13.getYear();
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2020 + "'", int14 == 2020);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2020 + "'", int15 == 2020);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth yearMonth6 = yearMonth4.minusYears((int) (short) 0);
        org.joda.time.Interval interval7 = yearMonth4.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = yearMonth4.getFieldTypes();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        boolean boolean22 = yearMonth14.isAfter((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth.Property property27 = yearMonth26.monthOfYear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth yearMonth33 = yearMonth31.minusYears((int) (short) 0);
        int int34 = yearMonth31.size();
        org.joda.time.YearMonth yearMonth36 = yearMonth31.plusMonths((int) (byte) 10);
        int int37 = property27.compareTo((org.joda.time.ReadablePartial) yearMonth31);
        org.joda.time.Chronology chronology38 = yearMonth31.getChronology();
        org.joda.time.YearMonth yearMonth39 = yearMonth18.withChronologyRetainFields(chronology38);
        org.joda.time.YearMonth yearMonth40 = yearMonth4.withChronologyRetainFields(chronology38);
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((long) (short) -1, chronology38);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.Interval interval43 = yearMonth41.toInterval(dateTimeZone42);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray44 = yearMonth41.getFieldTypes();
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertNotNull(yearMonth40);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray44);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.YearMonth yearMonth1 = org.joda.time.YearMonth.parse("9");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = null;
        java.lang.String str3 = yearMonth1.toString(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(yearMonth1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0009-01" + "'", str3, "0009-01");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        java.lang.String str6 = yearMonth3.toString();
        java.lang.String str7 = yearMonth3.toString();
        org.joda.time.YearMonth yearMonth9 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth yearMonth15 = yearMonth13.minusYears((int) (short) 0);
        int int16 = yearMonth13.size();
        org.joda.time.YearMonth yearMonth18 = yearMonth13.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        int int20 = yearMonth13.indexOf(dateTimeFieldType19);
        org.joda.time.YearMonth yearMonth22 = yearMonth13.plusMonths((-1));
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth yearMonth28 = yearMonth26.minusYears((int) (short) 0);
        int int29 = yearMonth26.size();
        org.joda.time.YearMonth yearMonth31 = yearMonth26.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        int int33 = yearMonth26.indexOf(dateTimeFieldType32);
        org.joda.time.Interval interval34 = yearMonth26.toInterval();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.YearMonth yearMonth38 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology37);
        org.joda.time.YearMonth.Property property39 = yearMonth38.monthOfYear();
        int int40 = property39.getMaximumValue();
        java.lang.String str41 = property39.getAsShortText();
        java.util.Locale locale42 = null;
        java.lang.String str43 = property39.getAsShortText(locale42);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property39.getFieldType();
        int int45 = yearMonth26.get(dateTimeFieldType44);
        org.joda.time.YearMonth.Property property46 = yearMonth13.property(dateTimeFieldType44);
        org.joda.time.Chronology chronology47 = yearMonth13.getChronology();
        int int49 = yearMonth13.getValue(0);
        org.joda.time.Interval interval50 = yearMonth13.toInterval();
        boolean boolean51 = yearMonth9.equals((java.lang.Object) yearMonth13);
        java.lang.String str53 = yearMonth9.toString("0097-09");
        int int54 = yearMonth9.getMonthOfYear();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0097-10" + "'", str6, "0097-10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0097-10" + "'", str7, "0097-10");
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 12 + "'", int40 == 12);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Oct" + "'", str41, "Oct");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Oct" + "'", str43, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0097-09" + "'", str53, "0097-09");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth.Property property18 = yearMonth17.monthOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        int int25 = yearMonth22.size();
        org.joda.time.YearMonth yearMonth27 = yearMonth22.plusMonths((int) (byte) 10);
        int int28 = property18.compareTo((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.Chronology chronology29 = yearMonth22.getChronology();
        org.joda.time.YearMonth yearMonth30 = yearMonth9.withChronologyRetainFields(chronology29);
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth(chronology29);
        org.joda.time.YearMonth yearMonth32 = new org.joda.time.YearMonth((java.lang.Object) yearMonth31);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(yearMonth30);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = yearMonth3.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.YearMonth yearMonth11 = yearMonth3.minus(readablePeriod10);
        java.lang.String str12 = yearMonth11.toString();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0097-10" + "'", str12, "0097-10");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth5.getYear();
        org.joda.time.YearMonth yearMonth8 = yearMonth5.plusMonths(2);
        org.joda.time.Chronology chronology9 = yearMonth5.getChronology();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.YearMonth yearMonth11 = yearMonth5.plus(readablePeriod10);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(yearMonth11);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.Interval interval11 = yearMonth3.toInterval();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth.Property property16 = yearMonth15.monthOfYear();
        int int17 = property16.getMaximumValue();
        java.lang.String str18 = property16.getAsShortText();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property16.getAsShortText(locale19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property16.getFieldType();
        int int22 = yearMonth3.get(dateTimeFieldType21);
        org.joda.time.Interval interval23 = yearMonth3.toInterval();
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = yearMonth3.getFields();
        org.joda.time.YearMonth yearMonth26 = yearMonth3.minusMonths((int) (byte) 10);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth.Property property31 = yearMonth30.monthOfYear();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology34);
        org.joda.time.YearMonth yearMonth37 = yearMonth35.minusYears((int) (short) 0);
        int int38 = yearMonth35.size();
        org.joda.time.YearMonth yearMonth40 = yearMonth35.plusMonths((int) (byte) 10);
        int int41 = property31.compareTo((org.joda.time.ReadablePartial) yearMonth35);
        org.joda.time.YearMonth yearMonth42 = property31.getYearMonth();
        java.lang.String str43 = property31.getAsText();
        org.joda.time.YearMonth yearMonth44 = property31.getYearMonth();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.YearMonth yearMonth47 = yearMonth44.withPeriodAdded(readablePeriod45, 98);
        boolean boolean48 = yearMonth3.isEqual((org.joda.time.ReadablePartial) yearMonth44);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray49 = yearMonth44.getFieldTypes();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Oct" + "'", str18, "Oct");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Oct" + "'", str20, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTimeFieldArray24);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(yearMonth40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(yearMonth42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "October" + "'", str43, "October");
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray49);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        org.joda.time.YearMonth yearMonth8 = property4.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth.Property property19 = yearMonth18.monthOfYear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.YearMonth yearMonth23 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology22);
        org.joda.time.YearMonth yearMonth25 = yearMonth23.minusYears((int) (short) 0);
        int int26 = yearMonth23.size();
        org.joda.time.YearMonth yearMonth28 = yearMonth23.plusMonths((int) (byte) 10);
        int int29 = property19.compareTo((org.joda.time.ReadablePartial) yearMonth23);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.Interval interval31 = yearMonth23.toInterval(dateTimeZone30);
        org.joda.time.YearMonth yearMonth33 = yearMonth23.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.YearMonth yearMonth37 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology36);
        org.joda.time.YearMonth yearMonth39 = yearMonth37.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.YearMonth yearMonth43 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology42);
        org.joda.time.YearMonth yearMonth45 = yearMonth43.minusYears((int) (short) 0);
        int int46 = yearMonth43.size();
        boolean boolean47 = yearMonth39.isAfter((org.joda.time.ReadablePartial) yearMonth43);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.YearMonth yearMonth51 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology50);
        org.joda.time.YearMonth.Property property52 = yearMonth51.monthOfYear();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.YearMonth yearMonth56 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology55);
        org.joda.time.YearMonth yearMonth58 = yearMonth56.minusYears((int) (short) 0);
        int int59 = yearMonth56.size();
        org.joda.time.YearMonth yearMonth61 = yearMonth56.plusMonths((int) (byte) 10);
        int int62 = property52.compareTo((org.joda.time.ReadablePartial) yearMonth56);
        org.joda.time.Chronology chronology63 = yearMonth56.getChronology();
        org.joda.time.YearMonth yearMonth64 = yearMonth43.withChronologyRetainFields(chronology63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.YearMonth yearMonth67 = yearMonth64.withPeriodAdded(readablePeriod65, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = null;
        int int69 = yearMonth67.indexOf(dateTimeFieldType68);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.YearMonth yearMonth73 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology72);
        org.joda.time.YearMonth.Property property74 = yearMonth73.monthOfYear();
        int int75 = property74.getMaximumValue();
        java.lang.String str76 = property74.getAsShortText();
        java.util.Locale locale77 = null;
        java.lang.String str78 = property74.getAsShortText(locale77);
        org.joda.time.YearMonth yearMonth80 = property74.setCopy("October");
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.DateTime dateTime82 = yearMonth80.toDateTime(readableInstant81);
        org.joda.time.DateTime dateTime83 = yearMonth67.toDateTime(readableInstant81);
        org.joda.time.DateTime dateTime84 = yearMonth23.toDateTime((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.DateTime dateTime85 = yearMonth14.toDateTime((org.joda.time.ReadableInstant) dateTime84);
        boolean boolean86 = yearMonth8.isEqual((org.joda.time.ReadablePartial) yearMonth14);
        org.joda.time.YearMonth.Property property87 = yearMonth8.monthOfYear();
        java.util.Locale locale88 = null;
        java.lang.String str89 = property87.getAsShortText(locale88);
        java.lang.String str90 = property87.getName();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(yearMonth25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertNotNull(yearMonth45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(yearMonth61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(yearMonth64);
        org.junit.Assert.assertNotNull(yearMonth67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 12 + "'", int75 == 12);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Oct" + "'", str76, "Oct");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Oct" + "'", str78, "Oct");
        org.junit.Assert.assertNotNull(yearMonth80);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Sep" + "'", str89, "Sep");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "monthOfYear" + "'", str90, "monthOfYear");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth2 = org.joda.time.YearMonth.parse("0129-10", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = yearMonth3.getFieldTypes();
        org.joda.time.YearMonth yearMonth17 = yearMonth3.minusMonths(0);
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((long) ' ');
        org.joda.time.Chronology chronology20 = yearMonth19.getChronology();
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth(chronology20);
        int int22 = yearMonth17.compareTo((org.joda.time.ReadablePartial) yearMonth21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth yearMonth28 = yearMonth26.minusYears((int) (short) 0);
        java.lang.String str29 = yearMonth26.toString();
        java.lang.String str30 = yearMonth26.toString();
        org.joda.time.YearMonth yearMonth32 = yearMonth26.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology35);
        org.joda.time.YearMonth yearMonth38 = yearMonth36.minusYears((int) (short) 0);
        int int39 = yearMonth36.size();
        org.joda.time.YearMonth yearMonth41 = yearMonth36.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = null;
        int int43 = yearMonth36.indexOf(dateTimeFieldType42);
        org.joda.time.YearMonth yearMonth45 = yearMonth36.plusMonths((-1));
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.YearMonth yearMonth49 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology48);
        org.joda.time.YearMonth yearMonth51 = yearMonth49.minusYears((int) (short) 0);
        int int52 = yearMonth49.size();
        org.joda.time.YearMonth yearMonth54 = yearMonth49.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = null;
        int int56 = yearMonth49.indexOf(dateTimeFieldType55);
        org.joda.time.Interval interval57 = yearMonth49.toInterval();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.YearMonth yearMonth61 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology60);
        org.joda.time.YearMonth.Property property62 = yearMonth61.monthOfYear();
        int int63 = property62.getMaximumValue();
        java.lang.String str64 = property62.getAsShortText();
        java.util.Locale locale65 = null;
        java.lang.String str66 = property62.getAsShortText(locale65);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property62.getFieldType();
        int int68 = yearMonth49.get(dateTimeFieldType67);
        org.joda.time.YearMonth.Property property69 = yearMonth36.property(dateTimeFieldType67);
        org.joda.time.Chronology chronology70 = yearMonth36.getChronology();
        int int72 = yearMonth36.getValue(0);
        org.joda.time.Interval interval73 = yearMonth36.toInterval();
        boolean boolean74 = yearMonth32.equals((java.lang.Object) yearMonth36);
        boolean boolean75 = yearMonth21.isEqual((org.joda.time.ReadablePartial) yearMonth36);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0097-10" + "'", str29, "0097-10");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0097-10" + "'", str30, "0097-10");
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(yearMonth45);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(yearMonth54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 12 + "'", int63 == 12);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Oct" + "'", str64, "Oct");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Oct" + "'", str66, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth yearMonth6 = yearMonth4.minusYears((int) (short) 0);
        org.joda.time.Interval interval7 = yearMonth4.toInterval();
        org.joda.time.Chronology chronology8 = yearMonth4.getChronology();
        org.joda.time.YearMonth yearMonth9 = yearMonth0.withChronologyRetainFields(chronology8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth.Property property14 = yearMonth13.monthOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        int int24 = property14.compareTo((org.joda.time.ReadablePartial) yearMonth18);
        int int25 = property14.getMaximumValueOverall();
        org.joda.time.DurationField durationField26 = property14.getRangeDurationField();
        boolean boolean27 = yearMonth9.equals((java.lang.Object) property14);
        java.lang.String str28 = property14.getName();
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 12 + "'", int25 == 12);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "monthOfYear" + "'", str28, "monthOfYear");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        int int15 = yearMonth8.indexOf(dateTimeFieldType14);
        org.joda.time.YearMonth yearMonth17 = yearMonth8.plusMonths((-1));
        int int18 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth17);
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((java.lang.Object) yearMonth17);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        boolean boolean21 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = yearMonth18.toString(dateTimeFormatter22);
        org.joda.time.YearMonth.Property property24 = yearMonth18.year();
        org.joda.time.YearMonth yearMonth26 = property24.setCopy(0);
        java.lang.String str27 = property24.getAsShortText();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0097-10" + "'", str23, "0097-10");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "97" + "'", str27, "97");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.YearMonth yearMonth15 = property4.getYearMonth();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property4.getAsShortText(locale16);
        org.joda.time.YearMonth yearMonth18 = property4.getYearMonth();
        java.lang.String str19 = property4.getAsString();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Oct" + "'", str17, "Oct");
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = yearMonth3.getFieldTypes();
        org.joda.time.YearMonth yearMonth11 = yearMonth3.withMonthOfYear((int) (short) 10);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(yearMonth11);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getAsShortText();
        org.joda.time.DateTimeField dateTimeField11 = property4.getField();
        org.joda.time.DurationField durationField12 = property4.getDurationField();
        int int13 = property4.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Oct" + "'", str10, "Oct");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = yearMonth3.toString(dateTimeFormatter6);
        org.joda.time.YearMonth.Property property8 = yearMonth3.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth.Property property13 = yearMonth12.monthOfYear();
        int int14 = property13.getMaximumValue();
        java.lang.String str15 = property13.getAsShortText();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property13.getAsShortText(locale16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property13.getFieldType();
        int int19 = property13.getMinimumValue();
        int int20 = property13.getMinimumValue();
        org.joda.time.YearMonth yearMonth22 = property13.addWrapFieldToCopy((int) 'a');
        boolean boolean23 = property8.equals((java.lang.Object) property13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth((java.lang.Object) property13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.YearMonth$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0097-10" + "'", str7, "0097-10");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Oct" + "'", str15, "Oct");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Oct" + "'", str17, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = yearMonth8.toInterval(dateTimeZone15);
        org.joda.time.YearMonth yearMonth18 = yearMonth8.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth yearMonth30 = yearMonth28.minusYears((int) (short) 0);
        int int31 = yearMonth28.size();
        boolean boolean32 = yearMonth24.isAfter((org.joda.time.ReadablePartial) yearMonth28);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology35);
        org.joda.time.YearMonth.Property property37 = yearMonth36.monthOfYear();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology40);
        org.joda.time.YearMonth yearMonth43 = yearMonth41.minusYears((int) (short) 0);
        int int44 = yearMonth41.size();
        org.joda.time.YearMonth yearMonth46 = yearMonth41.plusMonths((int) (byte) 10);
        int int47 = property37.compareTo((org.joda.time.ReadablePartial) yearMonth41);
        org.joda.time.Chronology chronology48 = yearMonth41.getChronology();
        org.joda.time.YearMonth yearMonth49 = yearMonth28.withChronologyRetainFields(chronology48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.YearMonth yearMonth52 = yearMonth49.withPeriodAdded(readablePeriod50, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        int int54 = yearMonth52.indexOf(dateTimeFieldType53);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.YearMonth yearMonth58 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology57);
        org.joda.time.YearMonth.Property property59 = yearMonth58.monthOfYear();
        int int60 = property59.getMaximumValue();
        java.lang.String str61 = property59.getAsShortText();
        java.util.Locale locale62 = null;
        java.lang.String str63 = property59.getAsShortText(locale62);
        org.joda.time.YearMonth yearMonth65 = property59.setCopy("October");
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.DateTime dateTime67 = yearMonth65.toDateTime(readableInstant66);
        org.joda.time.DateTime dateTime68 = yearMonth52.toDateTime(readableInstant66);
        org.joda.time.DateTime dateTime69 = yearMonth8.toDateTime((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.YearMonth yearMonth71 = yearMonth8.minusMonths((int) (short) 10);
        org.joda.time.YearMonth yearMonth73 = yearMonth8.minusYears((int) (short) 100);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(yearMonth49);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 12 + "'", int60 == 12);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Oct" + "'", str61, "Oct");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Oct" + "'", str63, "Oct");
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(yearMonth71);
        org.junit.Assert.assertNotNull(yearMonth73);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        java.util.Locale locale15 = null;
        java.lang.String str16 = property4.getAsText(locale15);
        java.util.Locale locale17 = null;
        java.lang.String str18 = property4.getAsShortText(locale17);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "October" + "'", str16, "October");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Oct" + "'", str18, "Oct");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.YearMonth yearMonth15 = property4.getYearMonth();
        java.lang.String str16 = property4.getAsText();
        org.joda.time.YearMonth yearMonth17 = property4.getYearMonth();
        org.joda.time.YearMonth yearMonth19 = property4.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusMonths((int) (short) 1);
        int[] intArray22 = yearMonth21.getValues();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "October" + "'", str16, "October");
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 8]");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth yearMonth8 = yearMonth6.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        int int15 = yearMonth12.size();
        boolean boolean16 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth.Property property21 = yearMonth20.monthOfYear();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.YearMonth yearMonth25 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology24);
        org.joda.time.YearMonth yearMonth27 = yearMonth25.minusYears((int) (short) 0);
        int int28 = yearMonth25.size();
        org.joda.time.YearMonth yearMonth30 = yearMonth25.plusMonths((int) (byte) 10);
        int int31 = property21.compareTo((org.joda.time.ReadablePartial) yearMonth25);
        org.joda.time.Chronology chronology32 = yearMonth25.getChronology();
        org.joda.time.YearMonth yearMonth33 = yearMonth12.withChronologyRetainFields(chronology32);
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth((long) (short) 1, chronology32);
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth(chronology32);
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) (byte) 100, (int) (short) 10, chronology32);
        int int38 = yearMonth36.getValue((int) (short) 1);
        int int39 = yearMonth36.getYear();
        org.joda.time.YearMonth.Property property40 = yearMonth36.year();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology43);
        org.joda.time.YearMonth.Property property45 = yearMonth44.monthOfYear();
        int int46 = property45.getMaximumValue();
        java.util.Locale locale47 = null;
        int int48 = property45.getMaximumShortTextLength(locale47);
        java.util.Locale locale49 = null;
        int int50 = property45.getMaximumTextLength(locale49);
        org.joda.time.DurationField durationField51 = property45.getRangeDurationField();
        java.lang.String str52 = property45.toString();
        boolean boolean53 = property40.equals((java.lang.Object) property45);
        int int54 = property40.getMinimumValue();
        java.util.Locale locale55 = null;
        int int56 = property40.getMaximumTextLength(locale55);
        int int57 = property40.getMaximumValue();
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 12 + "'", int46 == 12);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 9 + "'", int50 == 9);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Property[monthOfYear]" + "'", str52, "Property[monthOfYear]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-292275054) + "'", int54 == (-292275054));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 9 + "'", int56 == 9);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 292278993 + "'", int57 == 292278993);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property4.getFieldType();
        int int10 = property4.getMinimumValue();
        int int11 = property4.getMinimumValue();
        java.lang.String str12 = property4.getName();
        int int13 = property4.get();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "monthOfYear" + "'", str12, "monthOfYear");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth((long) 11);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.YearMonth yearMonth3 = yearMonth1.plus(readablePeriod2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.YearMonth yearMonth5 = yearMonth3.plus(readablePeriod4);
        int int6 = yearMonth5.size();
        org.junit.Assert.assertNotNull(yearMonth3);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology13);
        org.joda.time.YearMonth yearMonth16 = yearMonth14.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth yearMonth22 = yearMonth20.minusYears((int) (short) 0);
        int int23 = yearMonth20.size();
        boolean boolean24 = yearMonth16.isAfter((org.joda.time.ReadablePartial) yearMonth20);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth.Property property29 = yearMonth28.monthOfYear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.YearMonth yearMonth35 = yearMonth33.minusYears((int) (short) 0);
        int int36 = yearMonth33.size();
        org.joda.time.YearMonth yearMonth38 = yearMonth33.plusMonths((int) (byte) 10);
        int int39 = property29.compareTo((org.joda.time.ReadablePartial) yearMonth33);
        org.joda.time.Chronology chronology40 = yearMonth33.getChronology();
        org.joda.time.YearMonth yearMonth41 = yearMonth20.withChronologyRetainFields(chronology40);
        int int42 = yearMonth3.compareTo((org.joda.time.ReadablePartial) yearMonth20);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.YearMonth yearMonth46 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology45);
        org.joda.time.YearMonth.Property property47 = yearMonth46.monthOfYear();
        int int48 = property47.getMaximumValue();
        java.util.Locale locale49 = null;
        int int50 = property47.getMaximumShortTextLength(locale49);
        java.util.Locale locale51 = null;
        int int52 = property47.getMaximumTextLength(locale51);
        org.joda.time.DurationField durationField53 = property47.getRangeDurationField();
        java.util.Locale locale54 = null;
        java.lang.String str55 = property47.getAsShortText(locale54);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property47.getFieldType();
        org.joda.time.YearMonth yearMonth58 = yearMonth3.withField(dateTimeFieldType56, 11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray59 = yearMonth58.getFieldTypes();
        org.joda.time.YearMonth yearMonth60 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology63);
        org.joda.time.YearMonth yearMonth66 = yearMonth64.minusYears((int) (short) 0);
        org.joda.time.Interval interval67 = yearMonth64.toInterval();
        org.joda.time.Chronology chronology68 = yearMonth64.getChronology();
        org.joda.time.YearMonth yearMonth69 = yearMonth60.withChronologyRetainFields(chronology68);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.YearMonth yearMonth73 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology72);
        org.joda.time.YearMonth.Property property74 = yearMonth73.monthOfYear();
        int int75 = property74.getMaximumValue();
        java.util.Locale locale76 = null;
        int int77 = property74.getMaximumShortTextLength(locale76);
        java.util.Locale locale78 = null;
        int int79 = property74.getMaximumTextLength(locale78);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.YearMonth yearMonth83 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology82);
        org.joda.time.YearMonth.Property property84 = yearMonth83.monthOfYear();
        int int85 = property84.getMaximumValue();
        java.util.Locale locale86 = null;
        int int87 = property84.getMaximumShortTextLength(locale86);
        java.util.Locale locale88 = null;
        int int89 = property84.getMaximumTextLength(locale88);
        java.lang.String str90 = property84.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = property84.getFieldType();
        boolean boolean92 = property74.equals((java.lang.Object) property84);
        org.joda.time.DateTimeFieldType dateTimeFieldType93 = property84.getFieldType();
        int int94 = yearMonth69.get(dateTimeFieldType93);
        org.joda.time.YearMonth.Property property95 = yearMonth58.property(dateTimeFieldType93);
        int int96 = property95.getMaximumValue();
        org.joda.time.YearMonth yearMonth98 = property95.addToCopy(2020);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 12 + "'", int48 == 12);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 9 + "'", int52 == 9);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Oct" + "'", str55, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray59);
        org.junit.Assert.assertNotNull(yearMonth66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(yearMonth69);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 12 + "'", int75 == 12);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 9 + "'", int79 == 9);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 12 + "'", int85 == 12);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 3 + "'", int87 == 3);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 9 + "'", int89 == 9);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Oct" + "'", str90, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 11 + "'", int94 == 11);
        org.junit.Assert.assertNotNull(property95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 12 + "'", int96 == 12);
        org.junit.Assert.assertNotNull(yearMonth98);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        org.joda.time.YearMonth yearMonth8 = property4.addToCopy((int) (short) 0);
        int int9 = property4.getMinimumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth11 = property4.setCopy("year");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"year\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        int int15 = property4.getMaximumValueOverall();
        int int16 = property4.getMaximumValueOverall();
        java.util.Locale locale17 = null;
        java.lang.String str18 = property4.getAsShortText(locale17);
        java.lang.String str19 = property4.getName();
        int int20 = property4.getMaximumValue();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Oct" + "'", str18, "Oct");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "monthOfYear" + "'", str19, "monthOfYear");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        org.joda.time.YearMonth yearMonth8 = property4.addWrapFieldToCopy((int) (short) -1);
        int[] intArray9 = yearMonth8.getValues();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth.Property property14 = yearMonth13.monthOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        int int24 = property14.compareTo((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.Chronology chronology25 = yearMonth18.getChronology();
        org.joda.time.YearMonth yearMonth26 = org.joda.time.YearMonth.now(chronology25);
        org.joda.time.YearMonth yearMonth27 = yearMonth8.withChronologyRetainFields(chronology25);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.YearMonth yearMonth29 = yearMonth27.plus(readablePeriod28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.YearMonth yearMonth31 = yearMonth27.minus(readablePeriod30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology34);
        org.joda.time.YearMonth yearMonth37 = yearMonth35.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology40);
        org.joda.time.YearMonth yearMonth43 = yearMonth41.minusYears((int) (short) 0);
        int int44 = yearMonth41.size();
        boolean boolean45 = yearMonth37.isAfter((org.joda.time.ReadablePartial) yearMonth41);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.YearMonth yearMonth49 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology48);
        org.joda.time.YearMonth.Property property50 = yearMonth49.monthOfYear();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology53);
        org.joda.time.YearMonth yearMonth56 = yearMonth54.minusYears((int) (short) 0);
        int int57 = yearMonth54.size();
        org.joda.time.YearMonth yearMonth59 = yearMonth54.plusMonths((int) (byte) 10);
        int int60 = property50.compareTo((org.joda.time.ReadablePartial) yearMonth54);
        org.joda.time.Chronology chronology61 = yearMonth54.getChronology();
        org.joda.time.YearMonth yearMonth62 = yearMonth41.withChronologyRetainFields(chronology61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.YearMonth yearMonth65 = yearMonth62.withPeriodAdded(readablePeriod63, (int) 'a');
        org.joda.time.YearMonth yearMonth67 = yearMonth62.plusMonths(9);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.YearMonth yearMonth71 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology70);
        org.joda.time.YearMonth.Property property72 = yearMonth71.monthOfYear();
        int int73 = property72.getMaximumValue();
        java.lang.String str74 = property72.getAsShortText();
        java.util.Locale locale75 = null;
        java.lang.String str76 = property72.getAsShortText(locale75);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = property72.getFieldType();
        int int78 = yearMonth62.get(dateTimeFieldType77);
        int int79 = yearMonth27.get(dateTimeFieldType77);
        org.joda.time.Interval interval80 = yearMonth27.toInterval();
        org.joda.time.YearMonth.Property property81 = yearMonth27.monthOfYear();
        java.util.Locale locale82 = null;
        java.lang.String str83 = property81.getAsText(locale82);
        org.joda.time.YearMonth yearMonth84 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.YearMonth yearMonth88 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology87);
        org.joda.time.YearMonth yearMonth90 = yearMonth88.minusYears((int) (short) 0);
        org.joda.time.Interval interval91 = yearMonth88.toInterval();
        org.joda.time.Chronology chronology92 = yearMonth88.getChronology();
        org.joda.time.YearMonth yearMonth93 = yearMonth84.withChronologyRetainFields(chronology92);
        org.joda.time.YearMonth yearMonth94 = new org.joda.time.YearMonth(chronology92);
        org.joda.time.YearMonth yearMonth95 = new org.joda.time.YearMonth(chronology92);
        org.joda.time.YearMonth yearMonth96 = org.joda.time.YearMonth.now(chronology92);
        org.joda.time.YearMonth yearMonth97 = org.joda.time.YearMonth.now(chronology92);
        org.joda.time.YearMonth yearMonth98 = new org.joda.time.YearMonth((java.lang.Object) locale82, chronology92);
        org.joda.time.YearMonth yearMonth99 = new org.joda.time.YearMonth(chronology92);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 9]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(yearMonth62);
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertNotNull(yearMonth67);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 12 + "'", int73 == 12);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Oct" + "'", str74, "Oct");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Oct" + "'", str76, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 9 + "'", int79 == 9);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "September" + "'", str83, "September");
        org.junit.Assert.assertNotNull(yearMonth90);
        org.junit.Assert.assertNotNull(interval91);
        org.junit.Assert.assertNotNull(chronology92);
        org.junit.Assert.assertNotNull(yearMonth93);
        org.junit.Assert.assertNotNull(yearMonth96);
        org.junit.Assert.assertNotNull(yearMonth97);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        boolean boolean21 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = yearMonth18.toString(dateTimeFormatter22);
        org.joda.time.YearMonth.Property property24 = yearMonth18.year();
        java.lang.String str25 = property24.getAsShortText();
        int int26 = property24.getMinimumValue();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0097-10" + "'", str23, "0097-10");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "97" + "'", str25, "97");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-292275054) + "'", int26 == (-292275054));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.joda.time.YearMonth yearMonth1 = org.joda.time.YearMonth.parse("0009-01");
        org.junit.Assert.assertNotNull(yearMonth1);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = yearMonth8.getFields();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth yearMonth15 = yearMonth13.minusYears((int) (short) 0);
        int int16 = yearMonth13.size();
        org.joda.time.YearMonth yearMonth18 = yearMonth13.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        int int20 = yearMonth13.indexOf(dateTimeFieldType19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology23);
        org.joda.time.YearMonth.Property property25 = yearMonth24.monthOfYear();
        int int26 = property25.getMaximumValue();
        java.lang.String str27 = property25.getAsShortText();
        java.util.Locale locale28 = null;
        java.lang.String str29 = property25.getAsShortText(locale28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property25.getFieldType();
        org.joda.time.YearMonth.Property property31 = yearMonth13.property(dateTimeFieldType30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology34);
        org.joda.time.YearMonth yearMonth37 = yearMonth35.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology40);
        org.joda.time.YearMonth yearMonth43 = yearMonth41.minusYears((int) (short) 0);
        int int44 = yearMonth41.size();
        boolean boolean45 = yearMonth37.isAfter((org.joda.time.ReadablePartial) yearMonth41);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.YearMonth yearMonth49 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology48);
        org.joda.time.YearMonth.Property property50 = yearMonth49.monthOfYear();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology53);
        org.joda.time.YearMonth yearMonth56 = yearMonth54.minusYears((int) (short) 0);
        int int57 = yearMonth54.size();
        org.joda.time.YearMonth yearMonth59 = yearMonth54.plusMonths((int) (byte) 10);
        int int60 = property50.compareTo((org.joda.time.ReadablePartial) yearMonth54);
        org.joda.time.Chronology chronology61 = yearMonth54.getChronology();
        org.joda.time.YearMonth yearMonth62 = yearMonth41.withChronologyRetainFields(chronology61);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.YearMonth yearMonth66 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology65);
        org.joda.time.YearMonth yearMonth68 = yearMonth66.minusYears((int) (short) 0);
        int int69 = yearMonth66.size();
        org.joda.time.YearMonth yearMonth71 = yearMonth66.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = null;
        int int73 = yearMonth66.indexOf(dateTimeFieldType72);
        org.joda.time.Interval interval74 = yearMonth66.toInterval();
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.YearMonth yearMonth78 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology77);
        org.joda.time.YearMonth.Property property79 = yearMonth78.monthOfYear();
        int int80 = property79.getMaximumValue();
        java.lang.String str81 = property79.getAsShortText();
        java.util.Locale locale82 = null;
        java.lang.String str83 = property79.getAsShortText(locale82);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = property79.getFieldType();
        int int85 = yearMonth66.get(dateTimeFieldType84);
        boolean boolean86 = yearMonth62.isSupported(dateTimeFieldType84);
        boolean boolean87 = yearMonth13.isSupported(dateTimeFieldType84);
        boolean boolean88 = yearMonth8.isSupported(dateTimeFieldType84);
        org.joda.time.ReadablePeriod readablePeriod89 = null;
        org.joda.time.YearMonth yearMonth90 = yearMonth8.minus(readablePeriod89);
        org.joda.time.YearMonth yearMonth92 = yearMonth8.plusMonths(1970);
        org.joda.time.DateTimeZone dateTimeZone93 = null;
        org.joda.time.Interval interval94 = yearMonth92.toInterval(dateTimeZone93);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 12 + "'", int26 == 12);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Oct" + "'", str27, "Oct");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Oct" + "'", str29, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(yearMonth62);
        org.junit.Assert.assertNotNull(yearMonth68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(yearMonth71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 12 + "'", int80 == 12);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Oct" + "'", str81, "Oct");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Oct" + "'", str83, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(yearMonth90);
        org.junit.Assert.assertNotNull(yearMonth92);
        org.junit.Assert.assertNotNull(interval94);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        boolean boolean21 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = yearMonth18.toString(dateTimeFormatter22);
        org.joda.time.YearMonth.Property property24 = yearMonth18.year();
        org.joda.time.YearMonth yearMonth26 = property24.setCopy(0);
        org.joda.time.YearMonth.Property property27 = yearMonth26.monthOfYear();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0097-10" + "'", str23, "0097-10");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth yearMonth8 = yearMonth6.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        int int15 = yearMonth12.size();
        boolean boolean16 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth.Property property21 = yearMonth20.monthOfYear();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.YearMonth yearMonth25 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology24);
        org.joda.time.YearMonth yearMonth27 = yearMonth25.minusYears((int) (short) 0);
        int int28 = yearMonth25.size();
        org.joda.time.YearMonth yearMonth30 = yearMonth25.plusMonths((int) (byte) 10);
        int int31 = property21.compareTo((org.joda.time.ReadablePartial) yearMonth25);
        org.joda.time.Chronology chronology32 = yearMonth25.getChronology();
        org.joda.time.YearMonth yearMonth33 = yearMonth12.withChronologyRetainFields(chronology32);
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth((long) (short) 1, chronology32);
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth(chronology32);
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) (byte) 100, (int) (short) 10, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = yearMonth36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.YearMonth yearMonth40 = yearMonth36.plus(readablePeriod39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.YearMonth yearMonth42 = yearMonth40.minus(readablePeriod41);
        org.joda.time.YearMonth yearMonth44 = yearMonth40.minusYears((int) (short) 0);
        org.joda.time.YearMonth yearMonth46 = yearMonth44.plusYears((int) (short) 100);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0100-10" + "'", str38, "0100-10");
        org.junit.Assert.assertNotNull(yearMonth40);
        org.junit.Assert.assertNotNull(yearMonth42);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertNotNull(yearMonth46);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth yearMonth6 = yearMonth4.minusYears((int) (short) 0);
        org.joda.time.Interval interval7 = yearMonth4.toInterval();
        org.joda.time.Chronology chronology8 = yearMonth4.getChronology();
        org.joda.time.YearMonth yearMonth9 = yearMonth0.withChronologyRetainFields(chronology8);
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth(chronology8);
        org.joda.time.YearMonth yearMonth11 = new org.joda.time.YearMonth(chronology8);
        org.joda.time.YearMonth yearMonth12 = org.joda.time.YearMonth.now(chronology8);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth15 = yearMonth12.withFieldAdded(durationFieldType13, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(yearMonth12);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        int int9 = property4.getMinimumValueOverall();
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        org.joda.time.YearMonth yearMonth12 = property4.addWrapFieldToCopy((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = property4.getAsText(locale13);
        int int15 = property4.getMinimumValue();
        int int16 = property4.getMaximumValue();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "October" + "'", str14, "October");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth yearMonth8 = yearMonth6.minusYears((int) (short) 0);
        int int9 = yearMonth6.size();
        org.joda.time.YearMonth yearMonth11 = yearMonth6.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = yearMonth6.indexOf(dateTimeFieldType12);
        org.joda.time.YearMonth yearMonth15 = yearMonth6.plusMonths((-1));
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusYears((int) (short) 0);
        int int22 = yearMonth19.size();
        org.joda.time.YearMonth yearMonth24 = yearMonth19.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        int int26 = yearMonth19.indexOf(dateTimeFieldType25);
        org.joda.time.Interval interval27 = yearMonth19.toInterval();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth.Property property32 = yearMonth31.monthOfYear();
        int int33 = property32.getMaximumValue();
        java.lang.String str34 = property32.getAsShortText();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property32.getAsShortText(locale35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property32.getFieldType();
        int int38 = yearMonth19.get(dateTimeFieldType37);
        org.joda.time.YearMonth.Property property39 = yearMonth6.property(dateTimeFieldType37);
        org.joda.time.Chronology chronology40 = yearMonth6.getChronology();
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth(chronology40);
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.YearMonth yearMonth46 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology45);
        org.joda.time.YearMonth yearMonth48 = yearMonth46.minusYears((int) (short) 0);
        org.joda.time.Interval interval49 = yearMonth46.toInterval();
        org.joda.time.Chronology chronology50 = yearMonth46.getChronology();
        org.joda.time.YearMonth yearMonth51 = yearMonth42.withChronologyRetainFields(chronology50);
        org.joda.time.YearMonth yearMonth52 = new org.joda.time.YearMonth(chronology50);
        org.joda.time.YearMonth yearMonth53 = yearMonth41.withChronologyRetainFields(chronology50);
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth((long) (short) 10, chronology50);
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth(chronology50);
        org.joda.time.YearMonth yearMonth56 = new org.joda.time.YearMonth((long) 98, chronology50);
        org.joda.time.YearMonth yearMonth57 = org.joda.time.YearMonth.now(chronology50);
        org.joda.time.YearMonth yearMonth58 = new org.joda.time.YearMonth((long) 6, chronology50);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Oct" + "'", str34, "Oct");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Oct" + "'", str36, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(yearMonth48);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertNotNull(yearMonth57);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth.Property property5 = yearMonth4.monthOfYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        org.joda.time.YearMonth yearMonth14 = yearMonth9.plusMonths((int) (byte) 10);
        int int15 = property5.compareTo((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Chronology chronology16 = yearMonth9.getChronology();
        org.joda.time.YearMonth yearMonth17 = org.joda.time.YearMonth.now(chronology16);
        org.joda.time.YearMonth yearMonth18 = org.joda.time.YearMonth.now(chronology16);
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((java.lang.Object) "0097-10", chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = yearMonth19.toString(dateTimeFormatter20);
        int int22 = yearMonth19.getMonthOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth.Property property27 = yearMonth26.monthOfYear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth yearMonth33 = yearMonth31.minusYears((int) (short) 0);
        int int34 = yearMonth31.size();
        org.joda.time.YearMonth yearMonth36 = yearMonth31.plusMonths((int) (byte) 10);
        int int37 = property27.compareTo((org.joda.time.ReadablePartial) yearMonth31);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology40);
        org.joda.time.YearMonth yearMonth43 = yearMonth41.minusYears((int) (short) 0);
        boolean boolean44 = yearMonth31.isAfter((org.joda.time.ReadablePartial) yearMonth41);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        int int46 = yearMonth31.indexOf(dateTimeFieldType45);
        int int47 = yearMonth31.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray48 = yearMonth31.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.Interval interval50 = yearMonth31.toInterval(dateTimeZone49);
        int[] intArray51 = yearMonth31.getValues();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.YearMonth yearMonth53 = yearMonth31.minus(readablePeriod52);
        int int55 = yearMonth53.getValue((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.YearMonth yearMonth58 = yearMonth53.withPeriodAdded(readablePeriod56, (-292275054));
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.YearMonth yearMonth62 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology61);
        org.joda.time.YearMonth yearMonth64 = yearMonth62.minusYears((int) (short) 0);
        int int65 = yearMonth62.size();
        org.joda.time.YearMonth yearMonth67 = yearMonth62.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = null;
        int int69 = yearMonth62.indexOf(dateTimeFieldType68);
        org.joda.time.YearMonth yearMonth71 = yearMonth62.plusMonths((-1));
        org.joda.time.YearMonth yearMonth73 = yearMonth62.plusMonths((-1));
        org.joda.time.YearMonth.Property property74 = yearMonth73.monthOfYear();
        int int75 = property74.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property74.getFieldType();
        int int77 = property74.getMaximumValueOverall();
        java.util.Locale locale78 = null;
        java.lang.String str79 = property74.getAsShortText(locale78);
        int int80 = property74.getMinimumValueOverall();
        org.joda.time.YearMonth yearMonth82 = property74.addToCopy((int) (byte) 100);
        java.lang.String str83 = property74.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = property74.getFieldType();
        int int85 = yearMonth58.indexOf(dateTimeFieldType84);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth87 = yearMonth19.withField(dateTimeFieldType84, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0097-10" + "'", str21, "0097-10");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray48);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[97, 10]");
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertNotNull(yearMonth64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertNotNull(yearMonth67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(yearMonth71);
        org.junit.Assert.assertNotNull(yearMonth73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 9 + "'", int75 == 9);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 12 + "'", int77 == 12);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Sep" + "'", str79, "Sep");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(yearMonth82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "9" + "'", str83, "9");
        org.junit.Assert.assertNotNull(dateTimeFieldType84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth.Property property5 = yearMonth4.monthOfYear();
        int int6 = property5.getMaximumValue();
        java.lang.String str7 = property5.getAsShortText();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property5.getAsShortText(locale8);
        int int10 = property5.getMaximumValue();
        int int11 = property5.getMinimumValueOverall();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property5.getAsText(locale12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth.Property property18 = yearMonth17.monthOfYear();
        int int19 = property18.getMaximumValue();
        java.lang.String str20 = property18.getAsShortText();
        org.joda.time.DateTimeField dateTimeField21 = property18.getField();
        org.joda.time.YearMonth yearMonth23 = property18.setCopy("Oct");
        int int24 = property5.compareTo((org.joda.time.ReadablePartial) yearMonth23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth.Property property29 = yearMonth28.monthOfYear();
        int int30 = property29.getMaximumValue();
        java.lang.String str31 = property29.getAsShortText();
        org.joda.time.YearMonth yearMonth33 = property29.addWrapFieldToCopy((int) (short) -1);
        int[] intArray34 = yearMonth33.getValues();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.YearMonth yearMonth38 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology37);
        org.joda.time.YearMonth.Property property39 = yearMonth38.monthOfYear();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.YearMonth yearMonth43 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology42);
        org.joda.time.YearMonth yearMonth45 = yearMonth43.minusYears((int) (short) 0);
        int int46 = yearMonth43.size();
        org.joda.time.YearMonth yearMonth48 = yearMonth43.plusMonths((int) (byte) 10);
        int int49 = property39.compareTo((org.joda.time.ReadablePartial) yearMonth43);
        org.joda.time.Chronology chronology50 = yearMonth43.getChronology();
        org.joda.time.YearMonth yearMonth51 = org.joda.time.YearMonth.now(chronology50);
        org.joda.time.YearMonth yearMonth52 = yearMonth33.withChronologyRetainFields(chronology50);
        org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth(chronology50);
        org.joda.time.YearMonth yearMonth54 = yearMonth23.withChronologyRetainFields(chronology50);
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth((long) 11, chronology50);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Oct" + "'", str7, "Oct");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Oct" + "'", str9, "Oct");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "October" + "'", str13, "October");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Oct" + "'", str20, "Oct");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Oct" + "'", str31, "Oct");
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 9]");
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(yearMonth45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(yearMonth48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertNotNull(yearMonth54);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.YearMonth yearMonth16 = yearMonth8.plusYears((int) (byte) 10);
        org.joda.time.YearMonth yearMonth18 = yearMonth8.minusYears((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth20 = yearMonth18.withMonthOfYear((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(yearMonth18);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property4.getFieldType();
        org.joda.time.YearMonth yearMonth10 = property4.getYearMonth();
        org.joda.time.DurationField durationField11 = property4.getDurationField();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth yearMonth17 = yearMonth15.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology20);
        org.joda.time.YearMonth yearMonth23 = yearMonth21.minusYears((int) (short) 0);
        int int24 = yearMonth21.size();
        boolean boolean25 = yearMonth17.isAfter((org.joda.time.ReadablePartial) yearMonth21);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.YearMonth yearMonth27 = yearMonth21.minus(readablePeriod26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.YearMonth yearMonth30 = yearMonth27.withPeriodAdded(readablePeriod28, (int) (short) 0);
        org.joda.time.YearMonth yearMonth32 = yearMonth30.plusYears((int) ' ');
        int int33 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth30);
        org.joda.time.YearMonth.Property property34 = yearMonth30.monthOfYear();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        boolean boolean14 = yearMonth12.equals((java.lang.Object) 1);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth.Property property19 = yearMonth18.monthOfYear();
        int int20 = property19.getMaximumValue();
        java.util.Locale locale21 = null;
        int int22 = property19.getMaximumShortTextLength(locale21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth.Property property27 = yearMonth26.monthOfYear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth yearMonth33 = yearMonth31.minusYears((int) (short) 0);
        int int34 = yearMonth31.size();
        org.joda.time.YearMonth yearMonth36 = yearMonth31.plusMonths((int) (byte) 10);
        int int37 = property27.compareTo((org.joda.time.ReadablePartial) yearMonth31);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.Interval interval39 = yearMonth31.toInterval(dateTimeZone38);
        org.joda.time.YearMonth yearMonth41 = yearMonth31.minusYears((int) (short) 0);
        java.lang.String str42 = yearMonth31.toString();
        org.joda.time.YearMonth yearMonth44 = yearMonth31.withMonthOfYear(11);
        boolean boolean45 = property19.equals((java.lang.Object) 11);
        int int46 = property19.getMinimumValueOverall();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.YearMonth yearMonth50 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology49);
        org.joda.time.YearMonth yearMonth52 = yearMonth50.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.YearMonth yearMonth56 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology55);
        org.joda.time.YearMonth yearMonth58 = yearMonth56.minusYears((int) (short) 0);
        int int59 = yearMonth56.size();
        boolean boolean60 = yearMonth52.isAfter((org.joda.time.ReadablePartial) yearMonth56);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology63);
        org.joda.time.YearMonth.Property property65 = yearMonth64.monthOfYear();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.YearMonth yearMonth69 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology68);
        org.joda.time.YearMonth yearMonth71 = yearMonth69.minusYears((int) (short) 0);
        int int72 = yearMonth69.size();
        org.joda.time.YearMonth yearMonth74 = yearMonth69.plusMonths((int) (byte) 10);
        int int75 = property65.compareTo((org.joda.time.ReadablePartial) yearMonth69);
        org.joda.time.Chronology chronology76 = yearMonth69.getChronology();
        org.joda.time.YearMonth yearMonth77 = yearMonth56.withChronologyRetainFields(chronology76);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.YearMonth yearMonth81 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology80);
        org.joda.time.YearMonth yearMonth83 = yearMonth81.minusYears((int) (short) 0);
        int int84 = yearMonth81.size();
        org.joda.time.YearMonth yearMonth86 = yearMonth81.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = null;
        int int88 = yearMonth81.indexOf(dateTimeFieldType87);
        org.joda.time.YearMonth yearMonth90 = yearMonth81.plusMonths((-1));
        boolean boolean91 = yearMonth56.isEqual((org.joda.time.ReadablePartial) yearMonth90);
        org.joda.time.YearMonth yearMonth93 = yearMonth90.withYear((int) '4');
        int int94 = property19.compareTo((org.joda.time.ReadablePartial) yearMonth90);
        boolean boolean95 = yearMonth12.isAfter((org.joda.time.ReadablePartial) yearMonth90);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0097-10" + "'", str42, "0097-10");
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(yearMonth71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertNotNull(yearMonth74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(yearMonth77);
        org.junit.Assert.assertNotNull(yearMonth83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 2 + "'", int84 == 2);
        org.junit.Assert.assertNotNull(yearMonth86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(yearMonth90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(yearMonth93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        org.joda.time.DateTimeField dateTimeField7 = property4.getField();
        org.joda.time.YearMonth yearMonth9 = property4.setCopy("Oct");
        org.joda.time.DurationField durationField10 = property4.getDurationField();
        int int11 = property4.get();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth.Property property16 = yearMonth15.monthOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth yearMonth22 = yearMonth20.minusYears((int) (short) 0);
        int int23 = yearMonth20.size();
        org.joda.time.YearMonth yearMonth25 = yearMonth20.plusMonths((int) (byte) 10);
        int int26 = property16.compareTo((org.joda.time.ReadablePartial) yearMonth20);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth yearMonth32 = yearMonth30.minusYears((int) (short) 0);
        boolean boolean33 = yearMonth20.isAfter((org.joda.time.ReadablePartial) yearMonth30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = yearMonth30.toString(dateTimeFormatter34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.YearMonth yearMonth39 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology38);
        org.joda.time.YearMonth.Property property40 = yearMonth39.monthOfYear();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology43);
        org.joda.time.YearMonth yearMonth46 = yearMonth44.minusYears((int) (short) 0);
        int int47 = yearMonth44.size();
        org.joda.time.YearMonth yearMonth49 = yearMonth44.plusMonths((int) (byte) 10);
        int int50 = property40.compareTo((org.joda.time.ReadablePartial) yearMonth44);
        org.joda.time.Chronology chronology51 = yearMonth44.getChronology();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology54);
        org.joda.time.YearMonth yearMonth57 = yearMonth55.minusYears((int) (short) 0);
        int int58 = yearMonth55.size();
        org.joda.time.YearMonth yearMonth60 = yearMonth55.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        int int62 = yearMonth55.indexOf(dateTimeFieldType61);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.YearMonth yearMonth66 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology65);
        org.joda.time.YearMonth.Property property67 = yearMonth66.monthOfYear();
        int int68 = property67.getMaximumValue();
        java.lang.String str69 = property67.getAsShortText();
        java.util.Locale locale70 = null;
        java.lang.String str71 = property67.getAsShortText(locale70);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property67.getFieldType();
        org.joda.time.YearMonth.Property property73 = yearMonth55.property(dateTimeFieldType72);
        org.joda.time.YearMonth.Property property74 = yearMonth44.property(dateTimeFieldType72);
        boolean boolean75 = yearMonth30.equals((java.lang.Object) property74);
        java.lang.String str76 = property74.getAsText();
        org.joda.time.YearMonth yearMonth78 = property74.addToCopy(1980);
        boolean boolean79 = property4.equals((java.lang.Object) property74);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(yearMonth25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0097-10" + "'", str35, "0097-10");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(yearMonth49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(yearMonth60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 12 + "'", int68 == 12);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Oct" + "'", str69, "Oct");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Oct" + "'", str71, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "October" + "'", str76, "October");
        org.junit.Assert.assertNotNull(yearMonth78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        org.joda.time.DurationField durationField8 = property4.getDurationField();
        java.util.Locale locale9 = null;
        int int10 = property4.getMaximumShortTextLength(locale9);
        org.joda.time.YearMonth yearMonth12 = property4.setCopy(12);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(yearMonth12);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        java.lang.String str11 = property4.toString();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth yearMonth17 = yearMonth15.minusYears((int) (short) 0);
        int int18 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth17);
        java.util.Locale locale19 = null;
        int int20 = property4.getMaximumShortTextLength(locale19);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[monthOfYear]" + "'", str11, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        int int9 = property4.getMinimumValueOverall();
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        org.joda.time.YearMonth yearMonth12 = property4.addWrapFieldToCopy((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = property4.getAsText(locale13);
        org.joda.time.DurationField durationField15 = property4.getRangeDurationField();
        java.lang.String str16 = property4.getAsString();
        int int17 = property4.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "October" + "'", str14, "October");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        boolean boolean14 = yearMonth12.equals((java.lang.Object) 1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.YearMonth yearMonth16 = yearMonth12.minus(readablePeriod15);
        org.joda.time.YearMonth.Property property17 = yearMonth16.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = yearMonth16.toString(dateTimeFormatter18);
        org.joda.time.YearMonth yearMonth21 = yearMonth16.minusYears((int) (short) 1);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.YearMonth yearMonth25 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology24);
        org.joda.time.YearMonth.Property property26 = yearMonth25.monthOfYear();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth yearMonth32 = yearMonth30.minusYears((int) (short) 0);
        int int33 = yearMonth30.size();
        org.joda.time.YearMonth yearMonth35 = yearMonth30.plusMonths((int) (byte) 10);
        int int36 = property26.compareTo((org.joda.time.ReadablePartial) yearMonth30);
        org.joda.time.YearMonth yearMonth37 = property26.getYearMonth();
        java.util.Locale locale38 = null;
        java.lang.String str39 = property26.getAsShortText(locale38);
        org.joda.time.YearMonth yearMonth40 = property26.getYearMonth();
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth yearMonth47 = yearMonth45.minusYears((int) (short) 0);
        org.joda.time.Interval interval48 = yearMonth45.toInterval();
        org.joda.time.Chronology chronology49 = yearMonth45.getChronology();
        org.joda.time.YearMonth yearMonth50 = yearMonth41.withChronologyRetainFields(chronology49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology53);
        org.joda.time.YearMonth.Property property55 = yearMonth54.monthOfYear();
        int int56 = property55.getMaximumValue();
        java.util.Locale locale57 = null;
        int int58 = property55.getMaximumShortTextLength(locale57);
        java.util.Locale locale59 = null;
        int int60 = property55.getMaximumTextLength(locale59);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology63);
        org.joda.time.YearMonth.Property property65 = yearMonth64.monthOfYear();
        int int66 = property65.getMaximumValue();
        java.util.Locale locale67 = null;
        int int68 = property65.getMaximumShortTextLength(locale67);
        java.util.Locale locale69 = null;
        int int70 = property65.getMaximumTextLength(locale69);
        java.lang.String str71 = property65.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property65.getFieldType();
        boolean boolean73 = property55.equals((java.lang.Object) property65);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = property65.getFieldType();
        int int75 = yearMonth50.get(dateTimeFieldType74);
        int int76 = yearMonth40.indexOf(dateTimeFieldType74);
        org.joda.time.YearMonth.Property property77 = yearMonth16.property(dateTimeFieldType74);
        org.joda.time.DateTimeField[] dateTimeFieldArray78 = yearMonth16.getFields();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0097-09" + "'", str19, "0097-09");
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Oct" + "'", str39, "Oct");
        org.junit.Assert.assertNotNull(yearMonth40);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 12 + "'", int56 == 12);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 12 + "'", int66 == 12);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 9 + "'", int70 == 9);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Oct" + "'", str71, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 11 + "'", int75 == 11);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(dateTimeFieldArray78);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        int int11 = property4.getMinimumValueOverall();
        int int12 = property4.getMinimumValue();
        java.lang.String str13 = property4.getName();
        int int14 = property4.get();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "monthOfYear" + "'", str13, "monthOfYear");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology13);
        org.joda.time.YearMonth yearMonth16 = yearMonth14.minusYears((int) (short) 0);
        int int17 = yearMonth14.size();
        boolean boolean18 = yearMonth10.isAfter((org.joda.time.ReadablePartial) yearMonth14);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth.Property property23 = yearMonth22.monthOfYear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.YearMonth yearMonth27 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology26);
        org.joda.time.YearMonth yearMonth29 = yearMonth27.minusYears((int) (short) 0);
        int int30 = yearMonth27.size();
        org.joda.time.YearMonth yearMonth32 = yearMonth27.plusMonths((int) (byte) 10);
        int int33 = property23.compareTo((org.joda.time.ReadablePartial) yearMonth27);
        org.joda.time.Chronology chronology34 = yearMonth27.getChronology();
        org.joda.time.YearMonth yearMonth35 = yearMonth14.withChronologyRetainFields(chronology34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.YearMonth yearMonth38 = yearMonth35.withPeriodAdded(readablePeriod36, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        int int40 = yearMonth38.indexOf(dateTimeFieldType39);
        boolean boolean41 = yearMonth3.isEqual((org.joda.time.ReadablePartial) yearMonth38);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth.Property property46 = yearMonth45.monthOfYear();
        int int47 = property46.getMinimumValue();
        java.util.Locale locale48 = null;
        int int49 = property46.getMaximumShortTextLength(locale48);
        org.joda.time.YearMonth yearMonth51 = property46.addToCopy((int) (short) 1);
        boolean boolean52 = yearMonth3.equals((java.lang.Object) yearMonth51);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.YearMonth yearMonth56 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology55);
        org.joda.time.YearMonth yearMonth58 = yearMonth56.minusYears((int) (short) 0);
        int int59 = yearMonth56.size();
        org.joda.time.YearMonth yearMonth61 = yearMonth56.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = null;
        int int63 = yearMonth56.indexOf(dateTimeFieldType62);
        int int64 = yearMonth56.getYear();
        boolean boolean65 = yearMonth51.isBefore((org.joda.time.ReadablePartial) yearMonth56);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.YearMonth yearMonth67 = yearMonth56.minus(readablePeriod66);
        org.joda.time.YearMonth yearMonth70 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.YearMonth yearMonth72 = yearMonth70.withYear((int) (byte) 1);
        boolean boolean73 = yearMonth67.equals((java.lang.Object) yearMonth72);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.YearMonth yearMonth77 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology76);
        org.joda.time.YearMonth.Property property78 = yearMonth77.monthOfYear();
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.YearMonth yearMonth82 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology81);
        org.joda.time.YearMonth yearMonth84 = yearMonth82.minusYears((int) (short) 0);
        int int85 = yearMonth82.size();
        org.joda.time.YearMonth yearMonth87 = yearMonth82.plusMonths((int) (byte) 10);
        int int88 = property78.compareTo((org.joda.time.ReadablePartial) yearMonth82);
        org.joda.time.DateTimeZone dateTimeZone89 = null;
        org.joda.time.Interval interval90 = yearMonth82.toInterval(dateTimeZone89);
        org.joda.time.YearMonth yearMonth92 = yearMonth82.minusYears((int) (short) 0);
        java.lang.String str93 = yearMonth82.toString();
        org.joda.time.YearMonth yearMonth94 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology95 = yearMonth94.getChronology();
        org.joda.time.YearMonth yearMonth96 = yearMonth82.withChronologyRetainFields(chronology95);
        org.joda.time.YearMonth yearMonth97 = new org.joda.time.YearMonth((java.lang.Object) yearMonth72, chronology95);
        java.lang.String str98 = yearMonth97.toString();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(yearMonth61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(yearMonth67);
        org.junit.Assert.assertNotNull(yearMonth72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(yearMonth84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2 + "'", int85 == 2);
        org.junit.Assert.assertNotNull(yearMonth87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(interval90);
        org.junit.Assert.assertNotNull(yearMonth92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "0097-10" + "'", str93, "0097-10");
        org.junit.Assert.assertNotNull(chronology95);
        org.junit.Assert.assertNotNull(yearMonth96);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "0001-12" + "'", str98, "0001-12");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology13);
        org.joda.time.YearMonth yearMonth16 = yearMonth14.minusYears((int) (short) 0);
        int int17 = yearMonth14.size();
        boolean boolean18 = yearMonth10.isAfter((org.joda.time.ReadablePartial) yearMonth14);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth.Property property23 = yearMonth22.monthOfYear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.YearMonth yearMonth27 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology26);
        org.joda.time.YearMonth yearMonth29 = yearMonth27.minusYears((int) (short) 0);
        int int30 = yearMonth27.size();
        org.joda.time.YearMonth yearMonth32 = yearMonth27.plusMonths((int) (byte) 10);
        int int33 = property23.compareTo((org.joda.time.ReadablePartial) yearMonth27);
        org.joda.time.Chronology chronology34 = yearMonth27.getChronology();
        org.joda.time.YearMonth yearMonth35 = yearMonth14.withChronologyRetainFields(chronology34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.YearMonth yearMonth38 = yearMonth35.withPeriodAdded(readablePeriod36, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        int int40 = yearMonth38.indexOf(dateTimeFieldType39);
        boolean boolean41 = yearMonth3.isEqual((org.joda.time.ReadablePartial) yearMonth38);
        java.lang.String str42 = yearMonth38.toString();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.YearMonth yearMonth44 = yearMonth38.minus(readablePeriod43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.YearMonth yearMonth46 = yearMonth38.minus(readablePeriod45);
        org.joda.time.YearMonth yearMonth48 = yearMonth38.plusYears(11);
        org.joda.time.YearMonth yearMonth50 = yearMonth48.withYear((int) ' ');
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0097-10" + "'", str42, "0097-10");
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertNotNull(yearMonth48);
        org.junit.Assert.assertNotNull(yearMonth50);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.YearMonth.Property property14 = yearMonth9.year();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        int int25 = yearMonth18.indexOf(dateTimeFieldType24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.YearMonth yearMonth29 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology28);
        org.joda.time.YearMonth yearMonth31 = yearMonth29.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology34);
        org.joda.time.YearMonth yearMonth37 = yearMonth35.minusYears((int) (short) 0);
        int int38 = yearMonth35.size();
        boolean boolean39 = yearMonth31.isAfter((org.joda.time.ReadablePartial) yearMonth35);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.YearMonth yearMonth43 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology42);
        org.joda.time.YearMonth.Property property44 = yearMonth43.monthOfYear();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.YearMonth yearMonth48 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology47);
        org.joda.time.YearMonth yearMonth50 = yearMonth48.minusYears((int) (short) 0);
        int int51 = yearMonth48.size();
        org.joda.time.YearMonth yearMonth53 = yearMonth48.plusMonths((int) (byte) 10);
        int int54 = property44.compareTo((org.joda.time.ReadablePartial) yearMonth48);
        org.joda.time.Chronology chronology55 = yearMonth48.getChronology();
        org.joda.time.YearMonth yearMonth56 = yearMonth35.withChronologyRetainFields(chronology55);
        int int57 = yearMonth18.compareTo((org.joda.time.ReadablePartial) yearMonth35);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.YearMonth yearMonth61 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology60);
        org.joda.time.YearMonth.Property property62 = yearMonth61.monthOfYear();
        int int63 = property62.getMaximumValue();
        java.util.Locale locale64 = null;
        int int65 = property62.getMaximumShortTextLength(locale64);
        java.util.Locale locale66 = null;
        int int67 = property62.getMaximumTextLength(locale66);
        org.joda.time.DurationField durationField68 = property62.getRangeDurationField();
        java.util.Locale locale69 = null;
        java.lang.String str70 = property62.getAsShortText(locale69);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property62.getFieldType();
        org.joda.time.YearMonth yearMonth73 = yearMonth18.withField(dateTimeFieldType71, 11);
        boolean boolean74 = yearMonth9.isSupported(dateTimeFieldType71);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 12 + "'", int63 == 12);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 9 + "'", int67 == 9);
        org.junit.Assert.assertNotNull(durationField68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Oct" + "'", str70, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertNotNull(yearMonth73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = yearMonth8.toInterval(dateTimeZone15);
        org.joda.time.YearMonth yearMonth18 = yearMonth8.minusYears((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.YearMonth yearMonth20 = yearMonth8.plus(readablePeriod19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology23);
        org.joda.time.YearMonth.Property property25 = yearMonth24.monthOfYear();
        int int26 = property25.getMaximumValue();
        java.util.Locale locale27 = null;
        int int28 = property25.getMaximumShortTextLength(locale27);
        java.util.Locale locale29 = null;
        int int30 = property25.getMaximumTextLength(locale29);
        org.joda.time.DurationField durationField31 = property25.getRangeDurationField();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property25.getAsShortText(locale32);
        int int34 = property25.getMinimumValueOverall();
        java.util.Locale locale36 = null;
        org.joda.time.YearMonth yearMonth37 = property25.setCopy("9", locale36);
        org.joda.time.YearMonth.Property property38 = yearMonth37.monthOfYear();
        java.util.Locale locale39 = null;
        int int40 = property38.getMaximumTextLength(locale39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property38.getFieldType();
        org.joda.time.YearMonth yearMonth43 = yearMonth20.withField(dateTimeFieldType41, 8);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 12 + "'", int26 == 12);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(yearMonth43);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        boolean boolean21 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        int int23 = yearMonth8.indexOf(dateTimeFieldType22);
        int int24 = yearMonth8.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = yearMonth8.getFieldTypes();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth yearMonth32 = yearMonth30.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology35);
        org.joda.time.YearMonth yearMonth38 = yearMonth36.minusYears((int) (short) 0);
        int int39 = yearMonth36.size();
        boolean boolean40 = yearMonth32.isAfter((org.joda.time.ReadablePartial) yearMonth36);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology43);
        org.joda.time.YearMonth.Property property45 = yearMonth44.monthOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.YearMonth yearMonth49 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology48);
        org.joda.time.YearMonth yearMonth51 = yearMonth49.minusYears((int) (short) 0);
        int int52 = yearMonth49.size();
        org.joda.time.YearMonth yearMonth54 = yearMonth49.plusMonths((int) (byte) 10);
        int int55 = property45.compareTo((org.joda.time.ReadablePartial) yearMonth49);
        org.joda.time.Chronology chronology56 = yearMonth49.getChronology();
        org.joda.time.YearMonth yearMonth57 = yearMonth36.withChronologyRetainFields(chronology56);
        org.joda.time.YearMonth yearMonth58 = new org.joda.time.YearMonth((long) (short) 1, chronology56);
        org.joda.time.YearMonth yearMonth59 = new org.joda.time.YearMonth((java.lang.Object) yearMonth8, chronology56);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.YearMonth yearMonth63 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology62);
        org.joda.time.YearMonth yearMonth65 = yearMonth63.minusYears((int) (short) 0);
        int int66 = yearMonth63.size();
        org.joda.time.YearMonth yearMonth68 = yearMonth63.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = null;
        int int70 = yearMonth63.indexOf(dateTimeFieldType69);
        org.joda.time.YearMonth yearMonth72 = yearMonth63.plusMonths((-1));
        org.joda.time.YearMonth yearMonth74 = yearMonth72.withMonthOfYear((int) (byte) 10);
        org.joda.time.YearMonth yearMonth76 = yearMonth74.withYear((int) '4');
        org.joda.time.YearMonth yearMonth78 = yearMonth74.plusMonths(1970);
        boolean boolean79 = yearMonth8.isEqual((org.joda.time.ReadablePartial) yearMonth74);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray25);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(yearMonth54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(yearMonth68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(yearMonth72);
        org.junit.Assert.assertNotNull(yearMonth74);
        org.junit.Assert.assertNotNull(yearMonth76);
        org.junit.Assert.assertNotNull(yearMonth78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getName();
        org.joda.time.YearMonth yearMonth12 = property4.addToCopy((int) (short) 10);
        int[] intArray13 = yearMonth12.getValues();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.YearMonth yearMonth15 = yearMonth12.plus(readablePeriod14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = yearMonth15.getFieldTypes();
        int int17 = yearMonth15.getYear();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[98, 8]");
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        java.lang.String str9 = property4.getName();
        java.lang.String str10 = property4.getAsString();
        java.lang.String str11 = property4.getAsString();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "monthOfYear" + "'", str9, "monthOfYear");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(97, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property4.getAsShortText(locale11);
        java.lang.String str13 = property4.getAsText();
        java.util.Locale locale14 = null;
        int int15 = property4.getMaximumTextLength(locale14);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Oct" + "'", str12, "Oct");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "October" + "'", str13, "October");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        org.joda.time.YearMonth yearMonth17 = yearMonth14.plusMonths(1970);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth yearMonth30 = yearMonth28.minusYears((int) (short) 0);
        int int31 = yearMonth28.size();
        boolean boolean32 = yearMonth24.isAfter((org.joda.time.ReadablePartial) yearMonth28);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology35);
        org.joda.time.YearMonth.Property property37 = yearMonth36.monthOfYear();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology40);
        org.joda.time.YearMonth yearMonth43 = yearMonth41.minusYears((int) (short) 0);
        int int44 = yearMonth41.size();
        org.joda.time.YearMonth yearMonth46 = yearMonth41.plusMonths((int) (byte) 10);
        int int47 = property37.compareTo((org.joda.time.ReadablePartial) yearMonth41);
        org.joda.time.Chronology chronology48 = yearMonth41.getChronology();
        org.joda.time.YearMonth yearMonth49 = yearMonth28.withChronologyRetainFields(chronology48);
        org.joda.time.YearMonth yearMonth50 = new org.joda.time.YearMonth((long) (short) 1, chronology48);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.YearMonth yearMonth53 = yearMonth50.withPeriodAdded(readablePeriod51, 100);
        org.joda.time.YearMonth yearMonth55 = yearMonth50.plusYears(10);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.YearMonth yearMonth57 = yearMonth55.plus(readablePeriod56);
        org.joda.time.Chronology chronology58 = yearMonth57.getChronology();
        org.joda.time.YearMonth yearMonth59 = yearMonth17.withChronologyRetainFields(chronology58);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(yearMonth49);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(yearMonth59);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getName();
        org.joda.time.YearMonth yearMonth12 = property4.addWrapFieldToCopy(100);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.YearMonth yearMonth16 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology15);
        org.joda.time.YearMonth.Property property17 = yearMonth16.monthOfYear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology20);
        org.joda.time.YearMonth yearMonth23 = yearMonth21.minusYears((int) (short) 0);
        int int24 = yearMonth21.size();
        org.joda.time.YearMonth yearMonth26 = yearMonth21.plusMonths((int) (byte) 10);
        int int27 = property17.compareTo((org.joda.time.ReadablePartial) yearMonth21);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth yearMonth33 = yearMonth31.minusYears((int) (short) 0);
        boolean boolean34 = yearMonth21.isAfter((org.joda.time.ReadablePartial) yearMonth31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = yearMonth31.toString(dateTimeFormatter35);
        boolean boolean37 = property4.equals((java.lang.Object) str36);
        java.util.Locale locale38 = null;
        int int39 = property4.getMaximumTextLength(locale38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.YearMonth yearMonth43 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology42);
        org.joda.time.YearMonth.Property property44 = yearMonth43.monthOfYear();
        int int45 = property44.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField46 = property44.getField();
        java.util.Locale locale47 = null;
        int int48 = property44.getMaximumTextLength(locale47);
        org.joda.time.YearMonth yearMonth50 = property44.addToCopy(2020);
        boolean boolean51 = property4.equals((java.lang.Object) 2020);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0097-10" + "'", str36, "0097-10");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth((long) (short) 100);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(2020, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getAsShortText();
        org.joda.time.DateTimeField dateTimeField11 = property4.getField();
        int int12 = property4.getMaximumValue();
        org.joda.time.YearMonth yearMonth14 = property4.setCopy((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property4.getFieldType();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property4.getAsText(locale16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology20);
        org.joda.time.YearMonth.Property property22 = yearMonth21.monthOfYear();
        int int23 = property22.getMaximumValue();
        java.util.Locale locale24 = null;
        int int25 = property22.getMaximumShortTextLength(locale24);
        java.util.Locale locale26 = null;
        int int27 = property22.getMaximumTextLength(locale26);
        java.util.Locale locale28 = null;
        int int29 = property22.getMaximumTextLength(locale28);
        java.lang.String str30 = property22.getAsText();
        boolean boolean31 = property4.equals((java.lang.Object) property22);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology34);
        org.joda.time.YearMonth yearMonth37 = yearMonth35.minusYears((int) (short) 0);
        int int38 = yearMonth35.size();
        org.joda.time.YearMonth yearMonth40 = yearMonth35.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray41 = yearMonth35.getFieldTypes();
        int[] intArray42 = yearMonth35.getValues();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.YearMonth yearMonth46 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology45);
        org.joda.time.YearMonth.Property property47 = yearMonth46.monthOfYear();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.YearMonth yearMonth51 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology50);
        org.joda.time.YearMonth yearMonth53 = yearMonth51.minusYears((int) (short) 0);
        int int54 = yearMonth51.size();
        org.joda.time.YearMonth yearMonth56 = yearMonth51.plusMonths((int) (byte) 10);
        int int57 = property47.compareTo((org.joda.time.ReadablePartial) yearMonth51);
        org.joda.time.Chronology chronology58 = yearMonth51.getChronology();
        org.joda.time.YearMonth yearMonth59 = org.joda.time.YearMonth.now(chronology58);
        org.joda.time.YearMonth yearMonth60 = org.joda.time.YearMonth.now(chronology58);
        org.joda.time.YearMonth yearMonth61 = new org.joda.time.YearMonth((java.lang.Object) yearMonth35, chronology58);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.YearMonth yearMonth65 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology64);
        org.joda.time.YearMonth yearMonth67 = yearMonth65.minusYears((int) (short) 0);
        int int68 = yearMonth65.size();
        org.joda.time.YearMonth yearMonth70 = yearMonth65.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = null;
        int int72 = yearMonth65.indexOf(dateTimeFieldType71);
        org.joda.time.YearMonth yearMonth74 = yearMonth65.plusMonths((-1));
        boolean boolean76 = yearMonth74.equals((java.lang.Object) 1);
        org.joda.time.YearMonth yearMonth78 = new org.joda.time.YearMonth((long) 100);
        boolean boolean79 = yearMonth74.isBefore((org.joda.time.ReadablePartial) yearMonth78);
        boolean boolean80 = yearMonth35.isAfter((org.joda.time.ReadablePartial) yearMonth78);
        org.joda.time.YearMonth yearMonth82 = yearMonth78.plusYears((int) ' ');
        int int83 = property22.compareTo((org.joda.time.ReadablePartial) yearMonth82);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Oct" + "'", str10, "Oct");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "October" + "'", str17, "October");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "October" + "'", str30, "October");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(yearMonth40);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray41);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[97, 10]");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertNotNull(yearMonth60);
        org.junit.Assert.assertNotNull(yearMonth67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertNotNull(yearMonth70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(yearMonth74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(yearMonth82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.YearMonth.Property property14 = yearMonth9.year();
        int int15 = property14.getMinimumValue();
        org.joda.time.DurationField durationField16 = property14.getDurationField();
        java.lang.String str17 = property14.getAsShortText();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-292275054) + "'", int15 == (-292275054));
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97" + "'", str17, "97");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.YearMonth yearMonth5 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology4);
        org.joda.time.YearMonth yearMonth7 = yearMonth5.minusYears((int) (short) 0);
        int int8 = yearMonth5.size();
        org.joda.time.YearMonth yearMonth10 = yearMonth5.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = yearMonth5.indexOf(dateTimeFieldType11);
        org.joda.time.YearMonth yearMonth14 = yearMonth5.plusMonths((-1));
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        int int25 = yearMonth18.indexOf(dateTimeFieldType24);
        org.joda.time.Interval interval26 = yearMonth18.toInterval();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth.Property property31 = yearMonth30.monthOfYear();
        int int32 = property31.getMaximumValue();
        java.lang.String str33 = property31.getAsShortText();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property31.getAsShortText(locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property31.getFieldType();
        int int37 = yearMonth18.get(dateTimeFieldType36);
        org.joda.time.YearMonth.Property property38 = yearMonth5.property(dateTimeFieldType36);
        org.joda.time.Chronology chronology39 = yearMonth5.getChronology();
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth(chronology39);
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth yearMonth47 = yearMonth45.minusYears((int) (short) 0);
        org.joda.time.Interval interval48 = yearMonth45.toInterval();
        org.joda.time.Chronology chronology49 = yearMonth45.getChronology();
        org.joda.time.YearMonth yearMonth50 = yearMonth41.withChronologyRetainFields(chronology49);
        org.joda.time.YearMonth yearMonth51 = new org.joda.time.YearMonth(chronology49);
        org.joda.time.YearMonth yearMonth52 = yearMonth40.withChronologyRetainFields(chronology49);
        org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth((long) (short) 10, chronology49);
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth(chronology49);
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth((long) 98, chronology49);
        org.joda.time.YearMonth yearMonth56 = org.joda.time.YearMonth.now(chronology49);
        int int57 = yearMonth56.getMonthOfYear();
        org.junit.Assert.assertNotNull(yearMonth7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 12 + "'", int32 == 12);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Oct" + "'", str35, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 11 + "'", int57 == 11);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.YearMonth yearMonth18 = yearMonth14.withPeriodAdded(readablePeriod16, (int) (byte) 10);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.plusMonths((int) (short) 1);
        org.joda.time.YearMonth yearMonth22 = yearMonth18.minusMonths(98);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth yearMonth28 = yearMonth26.minusYears((int) (short) 0);
        int int29 = yearMonth26.size();
        org.joda.time.YearMonth yearMonth31 = yearMonth26.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        int int33 = yearMonth26.indexOf(dateTimeFieldType32);
        org.joda.time.YearMonth yearMonth35 = yearMonth26.plusMonths((-1));
        org.joda.time.YearMonth yearMonth37 = yearMonth26.plusMonths((-1));
        org.joda.time.YearMonth.Property property38 = yearMonth37.monthOfYear();
        int int39 = property38.get();
        org.joda.time.YearMonth yearMonth40 = property38.getYearMonth();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology43);
        org.joda.time.YearMonth yearMonth46 = yearMonth44.minusYears((int) (short) 0);
        int int47 = yearMonth44.size();
        org.joda.time.YearMonth yearMonth49 = yearMonth44.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        int int51 = yearMonth44.indexOf(dateTimeFieldType50);
        org.joda.time.YearMonth yearMonth53 = yearMonth44.plusMonths((-1));
        org.joda.time.YearMonth yearMonth55 = yearMonth44.plusMonths((-1));
        org.joda.time.YearMonth.Property property56 = yearMonth55.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.YearMonth yearMonth59 = yearMonth55.withPeriodAdded(readablePeriod57, (int) (short) -1);
        org.joda.time.YearMonth yearMonth61 = yearMonth55.plusMonths((int) (short) 10);
        boolean boolean62 = yearMonth40.isEqual((org.joda.time.ReadablePartial) yearMonth55);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.YearMonth yearMonth66 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology65);
        org.joda.time.YearMonth.Property property67 = yearMonth66.monthOfYear();
        int int68 = property67.getMaximumValue();
        java.lang.String str69 = property67.getAsShortText();
        int int70 = property67.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property67.getFieldType();
        boolean boolean72 = yearMonth55.isSupported(dateTimeFieldType71);
        int int73 = yearMonth18.indexOf(dateTimeFieldType71);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertNotNull(yearMonth40);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(yearMonth49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertNotNull(yearMonth61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 12 + "'", int68 == 12);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Oct" + "'", str69, "Oct");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        java.lang.String str11 = property4.toString();
        java.lang.String str12 = property4.getName();
        org.joda.time.YearMonth yearMonth14 = property4.addWrapFieldToCopy((int) '4');
        java.util.Locale locale15 = null;
        int int16 = property4.getMaximumShortTextLength(locale15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property4.getFieldType();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[monthOfYear]" + "'", str11, "Property[monthOfYear]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "monthOfYear" + "'", str12, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.YearMonth yearMonth15 = property4.getYearMonth();
        java.lang.String str16 = property4.getAsText();
        org.joda.time.YearMonth yearMonth17 = property4.getYearMonth();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology20);
        org.joda.time.YearMonth.Property property22 = yearMonth21.monthOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth yearMonth28 = yearMonth26.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.YearMonth yearMonth32 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology31);
        org.joda.time.YearMonth yearMonth34 = yearMonth32.minusYears((int) (short) 0);
        int int35 = yearMonth32.size();
        boolean boolean36 = yearMonth28.isAfter((org.joda.time.ReadablePartial) yearMonth32);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology39);
        org.joda.time.YearMonth.Property property41 = yearMonth40.monthOfYear();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth yearMonth47 = yearMonth45.minusYears((int) (short) 0);
        int int48 = yearMonth45.size();
        org.joda.time.YearMonth yearMonth50 = yearMonth45.plusMonths((int) (byte) 10);
        int int51 = property41.compareTo((org.joda.time.ReadablePartial) yearMonth45);
        org.joda.time.Chronology chronology52 = yearMonth45.getChronology();
        org.joda.time.YearMonth yearMonth53 = yearMonth32.withChronologyRetainFields(chronology52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.YearMonth yearMonth56 = yearMonth53.withPeriodAdded(readablePeriod54, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        int int58 = yearMonth56.indexOf(dateTimeFieldType57);
        boolean boolean59 = yearMonth21.isEqual((org.joda.time.ReadablePartial) yearMonth56);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.YearMonth yearMonth63 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology62);
        org.joda.time.YearMonth.Property property64 = yearMonth63.monthOfYear();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.YearMonth yearMonth68 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology67);
        org.joda.time.YearMonth yearMonth70 = yearMonth68.minusYears((int) (short) 0);
        int int71 = yearMonth68.size();
        org.joda.time.YearMonth yearMonth73 = yearMonth68.plusMonths((int) (byte) 10);
        int int74 = property64.compareTo((org.joda.time.ReadablePartial) yearMonth68);
        boolean boolean75 = yearMonth21.isEqual((org.joda.time.ReadablePartial) yearMonth68);
        boolean boolean76 = yearMonth17.isAfter((org.joda.time.ReadablePartial) yearMonth21);
        org.joda.time.YearMonth yearMonth78 = yearMonth17.plusMonths(2);
        int int79 = yearMonth78.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.Interval interval81 = yearMonth78.toInterval(dateTimeZone80);
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = yearMonth78.getFieldType(1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "October" + "'", str16, "October");
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertNotNull(yearMonth34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(yearMonth70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(yearMonth73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(yearMonth78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 12 + "'", int79 == 12);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(dateTimeFieldType83);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        org.joda.time.YearMonth yearMonth8 = property4.addWrapFieldToCopy((int) (short) -1);
        int[] intArray9 = yearMonth8.getValues();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth.Property property14 = yearMonth13.monthOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        int int24 = property14.compareTo((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.Chronology chronology25 = yearMonth18.getChronology();
        org.joda.time.YearMonth yearMonth26 = org.joda.time.YearMonth.now(chronology25);
        org.joda.time.YearMonth yearMonth27 = yearMonth8.withChronologyRetainFields(chronology25);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.YearMonth yearMonth29 = yearMonth27.plus(readablePeriod28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.YearMonth yearMonth31 = yearMonth27.minus(readablePeriod30);
        org.joda.time.YearMonth yearMonth33 = yearMonth27.minusMonths(2);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.YearMonth yearMonth37 = new org.joda.time.YearMonth((long) (byte) 0, chronology36);
        org.joda.time.Chronology chronology38 = yearMonth37.getChronology();
        org.joda.time.YearMonth yearMonth39 = new org.joda.time.YearMonth(0L, chronology38);
        org.joda.time.YearMonth yearMonth40 = yearMonth27.withChronologyRetainFields(chronology38);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 9]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(yearMonth40);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology15 = yearMonth8.getChronology();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusYears((int) (short) 0);
        int int22 = yearMonth19.size();
        org.joda.time.YearMonth yearMonth24 = yearMonth19.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        int int26 = yearMonth19.indexOf(dateTimeFieldType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth.Property property31 = yearMonth30.monthOfYear();
        int int32 = property31.getMaximumValue();
        java.lang.String str33 = property31.getAsShortText();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property31.getAsShortText(locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property31.getFieldType();
        org.joda.time.YearMonth.Property property37 = yearMonth19.property(dateTimeFieldType36);
        org.joda.time.YearMonth.Property property38 = yearMonth8.property(dateTimeFieldType36);
        int int39 = property38.getMaximumValue();
        org.joda.time.YearMonth yearMonth41 = property38.addWrapFieldToCopy(12);
        org.joda.time.YearMonth yearMonth43 = property38.addToCopy((int) (short) 100);
        java.util.Locale locale44 = null;
        int int45 = property38.getMaximumTextLength(locale44);
        java.util.Locale locale46 = null;
        java.lang.String str47 = property38.getAsShortText(locale46);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 12 + "'", int32 == 12);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Oct" + "'", str35, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 12 + "'", int39 == 12);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Oct" + "'", str47, "Oct");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth.Property property10 = yearMonth9.monthOfYear();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology13);
        org.joda.time.YearMonth yearMonth16 = yearMonth14.minusYears((int) (short) 0);
        int int17 = yearMonth14.size();
        org.joda.time.YearMonth yearMonth19 = yearMonth14.plusMonths((int) (byte) 10);
        int int20 = property10.compareTo((org.joda.time.ReadablePartial) yearMonth14);
        org.joda.time.Chronology chronology21 = yearMonth14.getChronology();
        org.joda.time.YearMonth yearMonth22 = org.joda.time.YearMonth.now(chronology21);
        org.joda.time.YearMonth yearMonth23 = yearMonth5.withChronologyRetainFields(chronology21);
        org.joda.time.YearMonth.Property property24 = yearMonth23.monthOfYear();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        org.joda.time.YearMonth yearMonth8 = property4.addWrapFieldToCopy((int) (short) -1);
        int[] intArray9 = yearMonth8.getValues();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth.Property property14 = yearMonth13.monthOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        int int24 = property14.compareTo((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.Chronology chronology25 = yearMonth18.getChronology();
        org.joda.time.YearMonth yearMonth26 = org.joda.time.YearMonth.now(chronology25);
        org.joda.time.YearMonth yearMonth27 = yearMonth8.withChronologyRetainFields(chronology25);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.YearMonth yearMonth29 = yearMonth27.plus(readablePeriod28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.YearMonth yearMonth31 = yearMonth27.minus(readablePeriod30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology34);
        org.joda.time.YearMonth yearMonth37 = yearMonth35.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology40);
        org.joda.time.YearMonth yearMonth43 = yearMonth41.minusYears((int) (short) 0);
        int int44 = yearMonth41.size();
        boolean boolean45 = yearMonth37.isAfter((org.joda.time.ReadablePartial) yearMonth41);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.YearMonth yearMonth49 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology48);
        org.joda.time.YearMonth.Property property50 = yearMonth49.monthOfYear();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology53);
        org.joda.time.YearMonth yearMonth56 = yearMonth54.minusYears((int) (short) 0);
        int int57 = yearMonth54.size();
        org.joda.time.YearMonth yearMonth59 = yearMonth54.plusMonths((int) (byte) 10);
        int int60 = property50.compareTo((org.joda.time.ReadablePartial) yearMonth54);
        org.joda.time.Chronology chronology61 = yearMonth54.getChronology();
        org.joda.time.YearMonth yearMonth62 = yearMonth41.withChronologyRetainFields(chronology61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.YearMonth yearMonth65 = yearMonth62.withPeriodAdded(readablePeriod63, (int) 'a');
        org.joda.time.YearMonth yearMonth67 = yearMonth62.plusMonths(9);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.YearMonth yearMonth71 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology70);
        org.joda.time.YearMonth.Property property72 = yearMonth71.monthOfYear();
        int int73 = property72.getMaximumValue();
        java.lang.String str74 = property72.getAsShortText();
        java.util.Locale locale75 = null;
        java.lang.String str76 = property72.getAsShortText(locale75);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = property72.getFieldType();
        int int78 = yearMonth62.get(dateTimeFieldType77);
        int int79 = yearMonth27.get(dateTimeFieldType77);
        org.joda.time.Interval interval80 = yearMonth27.toInterval();
        int int82 = yearMonth27.getValue(1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 9]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(yearMonth62);
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertNotNull(yearMonth67);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 12 + "'", int73 == 12);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Oct" + "'", str74, "Oct");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Oct" + "'", str76, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 9 + "'", int79 == 9);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 9 + "'", int82 == 9);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(10L);
        org.joda.time.YearMonth.Property property2 = yearMonth1.monthOfYear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth.Property property7 = yearMonth6.monthOfYear();
        int int8 = property7.getMaximumValue();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumShortTextLength(locale9);
        java.util.Locale locale11 = null;
        int int12 = property7.getMaximumTextLength(locale11);
        java.lang.String str13 = property7.getName();
        org.joda.time.YearMonth yearMonth15 = property7.addWrapFieldToCopy(100);
        boolean boolean16 = yearMonth1.isEqual((org.joda.time.ReadablePartial) yearMonth15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.YearMonth yearMonth18 = yearMonth15.minus(readablePeriod17);
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.YearMonth yearMonth25 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology24);
        org.joda.time.YearMonth yearMonth27 = yearMonth25.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth yearMonth33 = yearMonth31.minusYears((int) (short) 0);
        int int34 = yearMonth31.size();
        boolean boolean35 = yearMonth27.isAfter((org.joda.time.ReadablePartial) yearMonth31);
        org.joda.time.Interval interval36 = yearMonth27.toInterval();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology39);
        org.joda.time.YearMonth yearMonth42 = yearMonth40.minusYears((int) (short) 0);
        int int43 = yearMonth40.size();
        org.joda.time.YearMonth yearMonth45 = yearMonth40.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        int int47 = yearMonth40.indexOf(dateTimeFieldType46);
        org.joda.time.Interval interval48 = yearMonth40.toInterval();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.YearMonth yearMonth52 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology51);
        org.joda.time.YearMonth.Property property53 = yearMonth52.monthOfYear();
        int int54 = property53.getMaximumValue();
        java.lang.String str55 = property53.getAsShortText();
        java.util.Locale locale56 = null;
        java.lang.String str57 = property53.getAsShortText(locale56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property53.getFieldType();
        int int59 = yearMonth40.get(dateTimeFieldType58);
        org.joda.time.YearMonth.Property property60 = yearMonth27.property(dateTimeFieldType58);
        boolean boolean61 = yearMonth21.isSupported(dateTimeFieldType58);
        int int62 = yearMonth15.get(dateTimeFieldType58);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField64 = yearMonth15.getField(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "monthOfYear" + "'", str13, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(yearMonth42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(yearMonth45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 12 + "'", int54 == 12);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Oct" + "'", str55, "Oct");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Oct" + "'", str57, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth((long) 1970);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.YearMonth yearMonth4 = yearMonth2.withYear((int) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology9);
        org.joda.time.YearMonth yearMonth12 = yearMonth10.minusYears((int) (short) 0);
        int int13 = yearMonth10.size();
        org.joda.time.YearMonth yearMonth15 = yearMonth10.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        int int17 = yearMonth10.indexOf(dateTimeFieldType16);
        org.joda.time.YearMonth yearMonth19 = yearMonth10.plusMonths((-1));
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.YearMonth yearMonth23 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology22);
        org.joda.time.YearMonth yearMonth25 = yearMonth23.minusYears((int) (short) 0);
        int int26 = yearMonth23.size();
        org.joda.time.YearMonth yearMonth28 = yearMonth23.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        int int30 = yearMonth23.indexOf(dateTimeFieldType29);
        org.joda.time.Interval interval31 = yearMonth23.toInterval();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology34);
        org.joda.time.YearMonth.Property property36 = yearMonth35.monthOfYear();
        int int37 = property36.getMaximumValue();
        java.lang.String str38 = property36.getAsShortText();
        java.util.Locale locale39 = null;
        java.lang.String str40 = property36.getAsShortText(locale39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property36.getFieldType();
        int int42 = yearMonth23.get(dateTimeFieldType41);
        org.joda.time.YearMonth.Property property43 = yearMonth10.property(dateTimeFieldType41);
        org.joda.time.Chronology chronology44 = yearMonth10.getChronology();
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth(chronology44);
        org.joda.time.YearMonth yearMonth46 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.YearMonth yearMonth50 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology49);
        org.joda.time.YearMonth yearMonth52 = yearMonth50.minusYears((int) (short) 0);
        org.joda.time.Interval interval53 = yearMonth50.toInterval();
        org.joda.time.Chronology chronology54 = yearMonth50.getChronology();
        org.joda.time.YearMonth yearMonth55 = yearMonth46.withChronologyRetainFields(chronology54);
        org.joda.time.YearMonth yearMonth56 = new org.joda.time.YearMonth(chronology54);
        org.joda.time.YearMonth yearMonth57 = yearMonth45.withChronologyRetainFields(chronology54);
        org.joda.time.YearMonth yearMonth58 = new org.joda.time.YearMonth((long) (short) 10, chronology54);
        org.joda.time.YearMonth yearMonth59 = new org.joda.time.YearMonth(chronology54);
        org.joda.time.YearMonth yearMonth60 = new org.joda.time.YearMonth((long) 98, chronology54);
        org.joda.time.YearMonth yearMonth61 = org.joda.time.YearMonth.now(chronology54);
        org.joda.time.YearMonth yearMonth62 = new org.joda.time.YearMonth((java.lang.Object) yearMonth4, chronology54);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(yearMonth25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 12 + "'", int37 == 12);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Oct" + "'", str38, "Oct");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Oct" + "'", str40, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertNotNull(yearMonth61);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        java.lang.String str2 = yearMonth1.toString();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth yearMonth8 = yearMonth6.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        int int15 = yearMonth12.size();
        boolean boolean16 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth.Property property21 = yearMonth20.monthOfYear();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.YearMonth yearMonth25 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology24);
        org.joda.time.YearMonth yearMonth27 = yearMonth25.minusYears((int) (short) 0);
        int int28 = yearMonth25.size();
        org.joda.time.YearMonth yearMonth30 = yearMonth25.plusMonths((int) (byte) 10);
        int int31 = property21.compareTo((org.joda.time.ReadablePartial) yearMonth25);
        org.joda.time.Chronology chronology32 = yearMonth25.getChronology();
        org.joda.time.YearMonth yearMonth33 = yearMonth12.withChronologyRetainFields(chronology32);
        org.joda.time.YearMonth yearMonth35 = yearMonth12.withYear((int) (byte) 1);
        boolean boolean36 = yearMonth1.isEqual((org.joda.time.ReadablePartial) yearMonth35);
        org.joda.time.YearMonth yearMonth38 = yearMonth35.plusYears(10);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology41);
        org.joda.time.YearMonth yearMonth44 = yearMonth42.minusYears((int) (short) 0);
        int int45 = yearMonth42.size();
        org.joda.time.YearMonth yearMonth47 = yearMonth42.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        int int49 = yearMonth42.indexOf(dateTimeFieldType48);
        org.joda.time.YearMonth yearMonth51 = yearMonth42.plusMonths((-1));
        org.joda.time.YearMonth yearMonth53 = yearMonth42.plusMonths((-1));
        org.joda.time.YearMonth.Property property54 = yearMonth53.monthOfYear();
        int int55 = property54.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property54.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property54.getFieldType();
        org.joda.time.YearMonth.Property property58 = yearMonth35.property(dateTimeFieldType57);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = null;
        int int60 = yearMonth35.indexOf(dateTimeFieldType59);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01" + "'", str2, "1970-01");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 9 + "'", int55 == 9);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        org.joda.time.YearMonth yearMonth9 = property4.addToCopy((int) (short) 1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth.Property property14 = yearMonth13.monthOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        int int24 = property14.compareTo((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth yearMonth30 = yearMonth28.minusYears((int) (short) 0);
        boolean boolean31 = yearMonth18.isAfter((org.joda.time.ReadablePartial) yearMonth28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = yearMonth28.toString(dateTimeFormatter32);
        int int34 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth28);
        org.joda.time.YearMonth yearMonth35 = property4.getYearMonth();
        java.lang.String str36 = property4.getAsShortText();
        org.joda.time.YearMonth yearMonth38 = property4.addToCopy(0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0097-10" + "'", str33, "0097-10");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Oct" + "'", str36, "Oct");
        org.junit.Assert.assertNotNull(yearMonth38);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        java.lang.String str6 = yearMonth3.toString();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.minusYears(3);
        java.lang.String str9 = yearMonth8.toString();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0097-10" + "'", str6, "0097-10");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0094-10" + "'", str9, "0094-10");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth.Property property5 = yearMonth4.monthOfYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        org.joda.time.YearMonth yearMonth14 = yearMonth9.plusMonths((int) (byte) 10);
        int int15 = property5.compareTo((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.YearMonth yearMonth16 = property5.getYearMonth();
        java.lang.String str17 = property5.getAsText();
        org.joda.time.YearMonth yearMonth18 = property5.getYearMonth();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth.Property property23 = yearMonth22.monthOfYear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.YearMonth yearMonth27 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology26);
        org.joda.time.YearMonth yearMonth29 = yearMonth27.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.YearMonth yearMonth35 = yearMonth33.minusYears((int) (short) 0);
        int int36 = yearMonth33.size();
        boolean boolean37 = yearMonth29.isAfter((org.joda.time.ReadablePartial) yearMonth33);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology40);
        org.joda.time.YearMonth.Property property42 = yearMonth41.monthOfYear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.YearMonth yearMonth46 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology45);
        org.joda.time.YearMonth yearMonth48 = yearMonth46.minusYears((int) (short) 0);
        int int49 = yearMonth46.size();
        org.joda.time.YearMonth yearMonth51 = yearMonth46.plusMonths((int) (byte) 10);
        int int52 = property42.compareTo((org.joda.time.ReadablePartial) yearMonth46);
        org.joda.time.Chronology chronology53 = yearMonth46.getChronology();
        org.joda.time.YearMonth yearMonth54 = yearMonth33.withChronologyRetainFields(chronology53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.YearMonth yearMonth57 = yearMonth54.withPeriodAdded(readablePeriod55, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = null;
        int int59 = yearMonth57.indexOf(dateTimeFieldType58);
        boolean boolean60 = yearMonth22.isEqual((org.joda.time.ReadablePartial) yearMonth57);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology63);
        org.joda.time.YearMonth.Property property65 = yearMonth64.monthOfYear();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.YearMonth yearMonth69 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology68);
        org.joda.time.YearMonth yearMonth71 = yearMonth69.minusYears((int) (short) 0);
        int int72 = yearMonth69.size();
        org.joda.time.YearMonth yearMonth74 = yearMonth69.plusMonths((int) (byte) 10);
        int int75 = property65.compareTo((org.joda.time.ReadablePartial) yearMonth69);
        boolean boolean76 = yearMonth22.isEqual((org.joda.time.ReadablePartial) yearMonth69);
        boolean boolean77 = yearMonth18.isAfter((org.joda.time.ReadablePartial) yearMonth22);
        boolean boolean78 = yearMonth0.isEqual((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.YearMonth yearMonth80 = yearMonth0.plus(readablePeriod79);
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.YearMonth yearMonth82 = yearMonth0.minus(readablePeriod81);
        org.joda.time.YearMonth yearMonth84 = yearMonth0.minusYears((int) (short) -1);
        int[] intArray85 = yearMonth84.getValues();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "October" + "'", str17, "October");
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(yearMonth48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(yearMonth54);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(yearMonth71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertNotNull(yearMonth74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(yearMonth80);
        org.junit.Assert.assertNotNull(yearMonth82);
        org.junit.Assert.assertNotNull(yearMonth84);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[2021, 11]");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.YearMonth.Property property14 = yearMonth9.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property14.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property14.getFieldType();
        java.lang.String str17 = property14.getAsShortText();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property14.getAsShortText(locale18);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97" + "'", str17, "97");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97" + "'", str19, "97");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology13);
        org.joda.time.YearMonth yearMonth16 = yearMonth14.minusYears((int) (short) 0);
        int int17 = yearMonth14.size();
        boolean boolean18 = yearMonth10.isAfter((org.joda.time.ReadablePartial) yearMonth14);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth.Property property23 = yearMonth22.monthOfYear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.YearMonth yearMonth27 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology26);
        org.joda.time.YearMonth yearMonth29 = yearMonth27.minusYears((int) (short) 0);
        int int30 = yearMonth27.size();
        org.joda.time.YearMonth yearMonth32 = yearMonth27.plusMonths((int) (byte) 10);
        int int33 = property23.compareTo((org.joda.time.ReadablePartial) yearMonth27);
        org.joda.time.Chronology chronology34 = yearMonth27.getChronology();
        org.joda.time.YearMonth yearMonth35 = yearMonth14.withChronologyRetainFields(chronology34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.YearMonth yearMonth38 = yearMonth35.withPeriodAdded(readablePeriod36, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        int int40 = yearMonth38.indexOf(dateTimeFieldType39);
        boolean boolean41 = yearMonth3.isEqual((org.joda.time.ReadablePartial) yearMonth38);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth.Property property46 = yearMonth45.monthOfYear();
        int int47 = property46.getMinimumValue();
        java.util.Locale locale48 = null;
        int int49 = property46.getMaximumShortTextLength(locale48);
        org.joda.time.YearMonth yearMonth51 = property46.addToCopy((int) (short) 1);
        boolean boolean52 = yearMonth3.equals((java.lang.Object) yearMonth51);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.YearMonth yearMonth56 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology55);
        org.joda.time.YearMonth yearMonth58 = yearMonth56.minusYears((int) (short) 0);
        int int59 = yearMonth56.size();
        org.joda.time.YearMonth yearMonth61 = yearMonth56.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = null;
        int int63 = yearMonth56.indexOf(dateTimeFieldType62);
        int int64 = yearMonth56.getYear();
        boolean boolean65 = yearMonth51.isBefore((org.joda.time.ReadablePartial) yearMonth56);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.YearMonth yearMonth67 = yearMonth56.minus(readablePeriod66);
        org.joda.time.YearMonth yearMonth70 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.YearMonth yearMonth72 = yearMonth70.withYear((int) (byte) 1);
        boolean boolean73 = yearMonth67.equals((java.lang.Object) yearMonth72);
        java.util.Locale locale75 = null;
        java.lang.String str76 = yearMonth67.toString("0097-12", locale75);
        org.joda.time.YearMonth yearMonth78 = yearMonth67.plusMonths((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.YearMonth yearMonth80 = yearMonth67.plus(readablePeriod79);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType82 = yearMonth67.getFieldType(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(yearMonth61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(yearMonth67);
        org.junit.Assert.assertNotNull(yearMonth72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "0097-12" + "'", str76, "0097-12");
        org.junit.Assert.assertNotNull(yearMonth78);
        org.junit.Assert.assertNotNull(yearMonth80);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        int int11 = property4.getMinimumValueOverall();
        int int12 = property4.getMinimumValue();
        java.util.Locale locale14 = null;
        org.joda.time.YearMonth yearMonth15 = property4.setCopy("Sep", locale14);
        java.lang.String str16 = property4.getAsShortText();
        java.util.Locale locale17 = null;
        java.lang.String str18 = property4.getAsShortText(locale17);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Oct" + "'", str16, "Oct");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Oct" + "'", str18, "Oct");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.joda.time.YearMonth yearMonth1 = org.joda.time.YearMonth.parse("0000-10");
        org.junit.Assert.assertNotNull(yearMonth1);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth yearMonth14 = yearMonth3.plusMonths((-1));
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.YearMonth yearMonth18 = yearMonth14.withPeriodAdded(readablePeriod16, (int) (byte) 10);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.plusMonths((int) (short) 1);
        org.joda.time.YearMonth yearMonth22 = yearMonth18.minusMonths(98);
        int int23 = yearMonth22.getYear();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 89 + "'", int23 == 89);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.YearMonth yearMonth16 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology15);
        org.joda.time.YearMonth yearMonth18 = yearMonth16.minusYears((int) (short) 0);
        int int19 = yearMonth16.size();
        org.joda.time.YearMonth yearMonth21 = yearMonth16.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        int int23 = yearMonth16.indexOf(dateTimeFieldType22);
        org.joda.time.Interval interval24 = yearMonth16.toInterval();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth.Property property29 = yearMonth28.monthOfYear();
        int int30 = property29.getMaximumValue();
        java.lang.String str31 = property29.getAsShortText();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property29.getAsShortText(locale32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property29.getFieldType();
        int int35 = yearMonth16.get(dateTimeFieldType34);
        org.joda.time.YearMonth.Property property36 = yearMonth3.property(dateTimeFieldType34);
        java.lang.String str37 = property36.getAsText();
        java.lang.String str38 = property36.getAsString();
        java.lang.String str39 = property36.getAsShortText();
        java.lang.String str40 = property36.getAsShortText();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Oct" + "'", str31, "Oct");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "October" + "'", str37, "October");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10" + "'", str38, "10");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Oct" + "'", str39, "Oct");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Oct" + "'", str40, "Oct");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        java.lang.String str11 = property4.toString();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth yearMonth17 = yearMonth15.minusYears((int) (short) 0);
        int int18 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth17);
        java.lang.String str19 = property4.getAsString();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[monthOfYear]" + "'", str11, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getAsShortText();
        int int11 = property4.get();
        org.joda.time.YearMonth yearMonth13 = property4.addToCopy(3);
        java.lang.String str14 = property4.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property4.getFieldType();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Oct" + "'", str10, "Oct");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.YearMonth yearMonth4 = yearMonth2.withYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = yearMonth2.indexOf(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth.Property property18 = yearMonth17.monthOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        int int25 = yearMonth22.size();
        org.joda.time.YearMonth yearMonth27 = yearMonth22.plusMonths((int) (byte) 10);
        int int28 = property18.compareTo((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.Chronology chronology29 = yearMonth22.getChronology();
        org.joda.time.YearMonth yearMonth30 = yearMonth9.withChronologyRetainFields(chronology29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology33);
        org.joda.time.YearMonth yearMonth36 = yearMonth34.minusYears((int) (short) 0);
        int int37 = yearMonth34.size();
        org.joda.time.YearMonth yearMonth39 = yearMonth34.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        int int41 = yearMonth34.indexOf(dateTimeFieldType40);
        org.joda.time.YearMonth yearMonth43 = yearMonth34.plusMonths((-1));
        boolean boolean44 = yearMonth9.isEqual((org.joda.time.ReadablePartial) yearMonth43);
        org.joda.time.YearMonth yearMonth46 = yearMonth43.withYear((int) '4');
        org.joda.time.YearMonth.Property property47 = yearMonth43.year();
        int int48 = property47.get();
        int int49 = property47.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 292278993 + "'", int49 == 292278993);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth.Property property14 = yearMonth13.monthOfYear();
        int int15 = property14.getMaximumValue();
        java.util.Locale locale16 = null;
        int int17 = property14.getMaximumShortTextLength(locale16);
        java.util.Locale locale18 = null;
        int int19 = property14.getMaximumTextLength(locale18);
        java.lang.String str20 = property14.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property14.getFieldType();
        boolean boolean22 = property4.equals((java.lang.Object) property14);
        java.lang.String str23 = property4.getAsString();
        java.util.Locale locale24 = null;
        int int25 = property4.getMaximumTextLength(locale24);
        java.lang.String str26 = property4.getAsText();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Oct" + "'", str20, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10" + "'", str23, "10");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "October" + "'", str26, "October");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        boolean boolean21 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        int int23 = yearMonth8.indexOf(dateTimeFieldType22);
        int int24 = yearMonth8.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = yearMonth8.getFieldTypes();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth yearMonth32 = yearMonth30.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.YearMonth yearMonth36 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology35);
        org.joda.time.YearMonth yearMonth38 = yearMonth36.minusYears((int) (short) 0);
        int int39 = yearMonth36.size();
        boolean boolean40 = yearMonth32.isAfter((org.joda.time.ReadablePartial) yearMonth36);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology43);
        org.joda.time.YearMonth.Property property45 = yearMonth44.monthOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.YearMonth yearMonth49 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology48);
        org.joda.time.YearMonth yearMonth51 = yearMonth49.minusYears((int) (short) 0);
        int int52 = yearMonth49.size();
        org.joda.time.YearMonth yearMonth54 = yearMonth49.plusMonths((int) (byte) 10);
        int int55 = property45.compareTo((org.joda.time.ReadablePartial) yearMonth49);
        org.joda.time.Chronology chronology56 = yearMonth49.getChronology();
        org.joda.time.YearMonth yearMonth57 = yearMonth36.withChronologyRetainFields(chronology56);
        org.joda.time.YearMonth yearMonth58 = new org.joda.time.YearMonth((long) (short) 1, chronology56);
        org.joda.time.YearMonth yearMonth59 = new org.joda.time.YearMonth((java.lang.Object) yearMonth8, chronology56);
        org.joda.time.YearMonth yearMonth60 = new org.joda.time.YearMonth((java.lang.Object) yearMonth59);
        org.joda.time.YearMonth yearMonth62 = yearMonth59.plusMonths(2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray25);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(yearMonth54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertNotNull(yearMonth62);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = yearMonth8.toString(dateTimeFormatter15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth.Property property21 = yearMonth20.monthOfYear();
        int int22 = property21.getMinimumValue();
        java.util.Locale locale23 = null;
        int int24 = property21.getMaximumShortTextLength(locale23);
        org.joda.time.DurationField durationField25 = property21.getDurationField();
        boolean boolean26 = yearMonth8.equals((java.lang.Object) property21);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth yearMonth32 = yearMonth30.minusYears((int) (short) 0);
        int int33 = yearMonth30.size();
        org.joda.time.YearMonth yearMonth35 = yearMonth30.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        int int37 = yearMonth30.indexOf(dateTimeFieldType36);
        org.joda.time.YearMonth yearMonth39 = yearMonth30.plusMonths((-1));
        boolean boolean41 = yearMonth39.equals((java.lang.Object) 1);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth.Property property46 = yearMonth45.monthOfYear();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.YearMonth yearMonth50 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology49);
        org.joda.time.YearMonth yearMonth52 = yearMonth50.minusYears((int) (short) 0);
        int int53 = yearMonth50.size();
        org.joda.time.YearMonth yearMonth55 = yearMonth50.plusMonths((int) (byte) 10);
        int int56 = property46.compareTo((org.joda.time.ReadablePartial) yearMonth50);
        org.joda.time.YearMonth yearMonth57 = property46.getYearMonth();
        java.lang.String str58 = property46.getAsText();
        org.joda.time.YearMonth yearMonth59 = property46.getYearMonth();
        boolean boolean60 = yearMonth39.isBefore((org.joda.time.ReadablePartial) yearMonth59);
        org.joda.time.YearMonth yearMonth62 = yearMonth39.minusYears(3);
        int int63 = yearMonth8.compareTo((org.joda.time.ReadablePartial) yearMonth39);
        org.joda.time.YearMonth yearMonth65 = yearMonth39.minusYears(12);
        org.joda.time.YearMonth.Property property66 = yearMonth65.monthOfYear();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0097-10" + "'", str16, "0097-10");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(yearMonth57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "October" + "'", str58, "October");
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(yearMonth62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(yearMonth65);
        org.junit.Assert.assertNotNull(property66);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        java.util.Locale locale15 = null;
        java.lang.String str16 = property4.getAsText(locale15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth yearMonth22 = yearMonth20.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology25);
        org.joda.time.YearMonth.Property property27 = yearMonth26.monthOfYear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth yearMonth33 = yearMonth31.minusYears((int) (short) 0);
        int int34 = yearMonth31.size();
        org.joda.time.YearMonth yearMonth36 = yearMonth31.plusMonths((int) (byte) 10);
        int int37 = property27.compareTo((org.joda.time.ReadablePartial) yearMonth31);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.Interval interval39 = yearMonth31.toInterval(dateTimeZone38);
        org.joda.time.YearMonth yearMonth41 = yearMonth31.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth yearMonth47 = yearMonth45.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.YearMonth yearMonth51 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology50);
        org.joda.time.YearMonth yearMonth53 = yearMonth51.minusYears((int) (short) 0);
        int int54 = yearMonth51.size();
        boolean boolean55 = yearMonth47.isAfter((org.joda.time.ReadablePartial) yearMonth51);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.YearMonth yearMonth59 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology58);
        org.joda.time.YearMonth.Property property60 = yearMonth59.monthOfYear();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology63);
        org.joda.time.YearMonth yearMonth66 = yearMonth64.minusYears((int) (short) 0);
        int int67 = yearMonth64.size();
        org.joda.time.YearMonth yearMonth69 = yearMonth64.plusMonths((int) (byte) 10);
        int int70 = property60.compareTo((org.joda.time.ReadablePartial) yearMonth64);
        org.joda.time.Chronology chronology71 = yearMonth64.getChronology();
        org.joda.time.YearMonth yearMonth72 = yearMonth51.withChronologyRetainFields(chronology71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.YearMonth yearMonth75 = yearMonth72.withPeriodAdded(readablePeriod73, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = null;
        int int77 = yearMonth75.indexOf(dateTimeFieldType76);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.YearMonth yearMonth81 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology80);
        org.joda.time.YearMonth.Property property82 = yearMonth81.monthOfYear();
        int int83 = property82.getMaximumValue();
        java.lang.String str84 = property82.getAsShortText();
        java.util.Locale locale85 = null;
        java.lang.String str86 = property82.getAsShortText(locale85);
        org.joda.time.YearMonth yearMonth88 = property82.setCopy("October");
        org.joda.time.ReadableInstant readableInstant89 = null;
        org.joda.time.DateTime dateTime90 = yearMonth88.toDateTime(readableInstant89);
        org.joda.time.DateTime dateTime91 = yearMonth75.toDateTime(readableInstant89);
        org.joda.time.DateTime dateTime92 = yearMonth31.toDateTime((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.DateTime dateTime93 = yearMonth22.toDateTime((org.joda.time.ReadableInstant) dateTime92);
        int int94 = property4.compareTo((org.joda.time.ReadableInstant) dateTime93);
        java.lang.String str95 = property4.getAsString();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "October" + "'", str16, "October");
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(yearMonth66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(yearMonth69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(yearMonth72);
        org.junit.Assert.assertNotNull(yearMonth75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 12 + "'", int83 == 12);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Oct" + "'", str84, "Oct");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Oct" + "'", str86, "Oct");
        org.junit.Assert.assertNotNull(yearMonth88);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertNotNull(dateTime93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "10" + "'", str95, "10");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getName();
        org.joda.time.YearMonth yearMonth12 = property4.addWrapFieldToCopy(100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = yearMonth12.getFieldTypes();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology15 = yearMonth8.getChronology();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusYears((int) (short) 0);
        int int22 = yearMonth19.size();
        org.joda.time.YearMonth yearMonth24 = yearMonth19.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        int int26 = yearMonth19.indexOf(dateTimeFieldType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth.Property property31 = yearMonth30.monthOfYear();
        int int32 = property31.getMaximumValue();
        java.lang.String str33 = property31.getAsShortText();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property31.getAsShortText(locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property31.getFieldType();
        org.joda.time.YearMonth.Property property37 = yearMonth19.property(dateTimeFieldType36);
        org.joda.time.YearMonth.Property property38 = yearMonth8.property(dateTimeFieldType36);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology41);
        org.joda.time.YearMonth yearMonth44 = yearMonth42.minusYears((int) (short) 0);
        int int45 = yearMonth42.size();
        org.joda.time.YearMonth yearMonth47 = yearMonth42.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        int int49 = yearMonth42.indexOf(dateTimeFieldType48);
        org.joda.time.YearMonth yearMonth51 = yearMonth42.plusMonths((-1));
        boolean boolean53 = yearMonth51.equals((java.lang.Object) 1);
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth((long) 100);
        boolean boolean56 = yearMonth51.isBefore((org.joda.time.ReadablePartial) yearMonth55);
        int int57 = yearMonth8.compareTo((org.joda.time.ReadablePartial) yearMonth51);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.YearMonth yearMonth60 = yearMonth8.withPeriodAdded(readablePeriod58, 2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 12 + "'", int32 == 12);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Oct" + "'", str35, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(yearMonth60);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth yearMonth15 = yearMonth13.minusYears((int) (short) 0);
        org.joda.time.Interval interval16 = yearMonth13.toInterval();
        org.joda.time.Chronology chronology17 = yearMonth13.getChronology();
        org.joda.time.YearMonth yearMonth18 = yearMonth9.withChronologyRetainFields(chronology17);
        boolean boolean19 = property4.equals((java.lang.Object) yearMonth9);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.YearMonth yearMonth22 = yearMonth9.withPeriodAdded(readablePeriod20, (int) ' ');
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology25 = yearMonth24.getChronology();
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((long) 3, chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = yearMonth26.getFieldType((int) (short) 1);
        org.joda.time.YearMonth.Property property29 = yearMonth9.property(dateTimeFieldType28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.YearMonth yearMonth37 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology36);
        org.joda.time.YearMonth yearMonth39 = yearMonth37.minusYears((int) (short) 0);
        int int40 = yearMonth37.size();
        org.joda.time.YearMonth yearMonth43 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.YearMonth yearMonth47 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology46);
        org.joda.time.YearMonth yearMonth49 = yearMonth47.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology52);
        org.joda.time.YearMonth yearMonth55 = yearMonth53.minusYears((int) (short) 0);
        int int56 = yearMonth53.size();
        boolean boolean57 = yearMonth49.isAfter((org.joda.time.ReadablePartial) yearMonth53);
        org.joda.time.Interval interval58 = yearMonth49.toInterval();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.YearMonth yearMonth62 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology61);
        org.joda.time.YearMonth yearMonth64 = yearMonth62.minusYears((int) (short) 0);
        int int65 = yearMonth62.size();
        org.joda.time.YearMonth yearMonth67 = yearMonth62.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = null;
        int int69 = yearMonth62.indexOf(dateTimeFieldType68);
        org.joda.time.Interval interval70 = yearMonth62.toInterval();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.YearMonth yearMonth74 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology73);
        org.joda.time.YearMonth.Property property75 = yearMonth74.monthOfYear();
        int int76 = property75.getMaximumValue();
        java.lang.String str77 = property75.getAsShortText();
        java.util.Locale locale78 = null;
        java.lang.String str79 = property75.getAsShortText(locale78);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = property75.getFieldType();
        int int81 = yearMonth62.get(dateTimeFieldType80);
        org.joda.time.YearMonth.Property property82 = yearMonth49.property(dateTimeFieldType80);
        boolean boolean83 = yearMonth43.isSupported(dateTimeFieldType80);
        org.joda.time.YearMonth yearMonth85 = yearMonth37.withField(dateTimeFieldType80, (int) (short) 10);
        boolean boolean86 = yearMonth33.isBefore((org.joda.time.ReadablePartial) yearMonth37);
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = yearMonth37.getFieldType((int) (short) 1);
        org.joda.time.YearMonth.Property property89 = yearMonth9.property(dateTimeFieldType88);
        org.joda.time.YearMonth yearMonth91 = yearMonth9.withYear((-292275054));
        int[] intArray92 = yearMonth9.getValues();
        org.joda.time.DateTimeZone dateTimeZone93 = null;
        org.joda.time.Interval interval94 = yearMonth9.toInterval(dateTimeZone93);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(yearMonth49);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(yearMonth64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertNotNull(yearMonth67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 12 + "'", int76 == 12);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Oct" + "'", str77, "Oct");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Oct" + "'", str79, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 10 + "'", int81 == 10);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(yearMonth85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(yearMonth91);
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[2020, 11]");
        org.junit.Assert.assertNotNull(interval94);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.lang.String str8 = property4.getName();
        java.util.Locale locale9 = null;
        int int10 = property4.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property4.getAsText();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property4.getAsText(locale12);
        int int14 = property4.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "monthOfYear" + "'", str8, "monthOfYear");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "October" + "'", str11, "October");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "October" + "'", str13, "October");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth((long) 2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.YearMonth yearMonth5 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology4);
        org.joda.time.YearMonth yearMonth7 = yearMonth5.minusYears((int) (short) 0);
        int int8 = yearMonth5.size();
        org.joda.time.YearMonth yearMonth10 = yearMonth5.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = yearMonth5.indexOf(dateTimeFieldType11);
        org.joda.time.YearMonth yearMonth14 = yearMonth5.plusMonths((-1));
        boolean boolean16 = yearMonth14.equals((java.lang.Object) 1);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.YearMonth yearMonth18 = yearMonth14.minus(readablePeriod17);
        org.joda.time.YearMonth.Property property19 = yearMonth18.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = yearMonth18.toString(dateTimeFormatter20);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray22 = yearMonth18.getFieldTypes();
        boolean boolean23 = yearMonth1.isBefore((org.joda.time.ReadablePartial) yearMonth18);
        org.junit.Assert.assertNotNull(yearMonth7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0097-09" + "'", str21, "0097-09");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.YearMonth.Property property14 = yearMonth9.year();
        org.joda.time.YearMonth yearMonth16 = property14.addWrapFieldToCopy((int) (byte) 10);
        java.lang.String str17 = property14.getName();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "year" + "'", str17, "year");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth.Property property18 = yearMonth17.monthOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        int int25 = yearMonth22.size();
        org.joda.time.YearMonth yearMonth27 = yearMonth22.plusMonths((int) (byte) 10);
        int int28 = property18.compareTo((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.Chronology chronology29 = yearMonth22.getChronology();
        org.joda.time.YearMonth yearMonth30 = yearMonth9.withChronologyRetainFields(chronology29);
        org.joda.time.YearMonth yearMonth32 = yearMonth9.withYear((int) (byte) 1);
        int int33 = yearMonth32.getMonthOfYear();
        org.joda.time.YearMonth.Property property34 = yearMonth32.year();
        org.joda.time.YearMonth yearMonth36 = property34.setCopy("9");
        org.joda.time.YearMonth yearMonth38 = yearMonth36.minusYears(1);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertNotNull(yearMonth38);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.YearMonth yearMonth5 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology4);
        org.joda.time.YearMonth yearMonth7 = yearMonth5.minusYears((int) (short) 0);
        org.joda.time.Interval interval8 = yearMonth5.toInterval();
        org.joda.time.Chronology chronology9 = yearMonth5.getChronology();
        org.joda.time.YearMonth yearMonth10 = yearMonth1.withChronologyRetainFields(chronology9);
        org.joda.time.YearMonth yearMonth11 = new org.joda.time.YearMonth(chronology9);
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth(chronology9);
        org.joda.time.YearMonth yearMonth13 = org.joda.time.YearMonth.now(chronology9);
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((long) (byte) 100, chronology9);
        org.junit.Assert.assertNotNull(yearMonth7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(yearMonth13);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = yearMonth8.toString(dateTimeFormatter15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth.Property property21 = yearMonth20.monthOfYear();
        int int22 = property21.getMinimumValue();
        java.util.Locale locale23 = null;
        int int24 = property21.getMaximumShortTextLength(locale23);
        org.joda.time.DurationField durationField25 = property21.getDurationField();
        boolean boolean26 = yearMonth8.equals((java.lang.Object) property21);
        org.joda.time.DurationField durationField27 = property21.getRangeDurationField();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0097-10" + "'", str16, "0097-10");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        java.lang.String str9 = property4.getAsText();
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology13);
        org.joda.time.YearMonth yearMonth16 = yearMonth14.minusYears((int) (short) 0);
        org.joda.time.Interval interval17 = yearMonth14.toInterval();
        org.joda.time.Chronology chronology18 = yearMonth14.getChronology();
        org.joda.time.YearMonth yearMonth19 = yearMonth10.withChronologyRetainFields(chronology18);
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth(chronology18);
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth(chronology18);
        org.joda.time.YearMonth yearMonth22 = org.joda.time.YearMonth.now(chronology18);
        org.joda.time.YearMonth yearMonth23 = org.joda.time.YearMonth.now(chronology18);
        boolean boolean24 = property4.equals((java.lang.Object) yearMonth23);
        org.joda.time.Chronology chronology25 = yearMonth23.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = yearMonth23.toString("monthOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "October" + "'", str9, "October");
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology3);
        org.joda.time.YearMonth yearMonth6 = yearMonth4.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology9);
        org.joda.time.YearMonth yearMonth12 = yearMonth10.minusYears((int) (short) 0);
        int int13 = yearMonth10.size();
        boolean boolean14 = yearMonth6.isAfter((org.joda.time.ReadablePartial) yearMonth10);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth.Property property19 = yearMonth18.monthOfYear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.YearMonth yearMonth23 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology22);
        org.joda.time.YearMonth yearMonth25 = yearMonth23.minusYears((int) (short) 0);
        int int26 = yearMonth23.size();
        org.joda.time.YearMonth yearMonth28 = yearMonth23.plusMonths((int) (byte) 10);
        int int29 = property19.compareTo((org.joda.time.ReadablePartial) yearMonth23);
        org.joda.time.Chronology chronology30 = yearMonth23.getChronology();
        org.joda.time.YearMonth yearMonth31 = yearMonth10.withChronologyRetainFields(chronology30);
        org.joda.time.YearMonth yearMonth32 = new org.joda.time.YearMonth((long) (short) 1, chronology30);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.YearMonth yearMonth35 = yearMonth32.withPeriodAdded(readablePeriod33, 100);
        org.joda.time.YearMonth yearMonth37 = yearMonth32.plusYears(10);
        org.joda.time.YearMonth.Property property38 = yearMonth32.year();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology41);
        org.joda.time.YearMonth yearMonth44 = yearMonth42.minusYears((int) (short) 0);
        int int45 = yearMonth42.size();
        org.joda.time.YearMonth yearMonth47 = yearMonth42.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        int int49 = yearMonth42.indexOf(dateTimeFieldType48);
        org.joda.time.YearMonth yearMonth51 = yearMonth42.plusMonths((-1));
        org.joda.time.YearMonth yearMonth53 = yearMonth42.plusMonths((-1));
        org.joda.time.YearMonth.Property property54 = yearMonth53.monthOfYear();
        int int55 = property54.get();
        org.joda.time.YearMonth yearMonth56 = property54.getYearMonth();
        org.joda.time.YearMonth yearMonth58 = property54.addToCopy(0);
        int int59 = property38.compareTo((org.joda.time.ReadablePartial) yearMonth58);
        int int60 = property38.getMinimumValueOverall();
        java.lang.String str61 = property38.getAsText();
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(yearMonth25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 9 + "'", int55 == 9);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-292275054) + "'", int60 == (-292275054));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1970" + "'", str61, "1970");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        boolean boolean8 = property4.equals((java.lang.Object) false);
        org.joda.time.YearMonth yearMonth10 = property4.addWrapFieldToCopy((int) (short) 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(yearMonth10);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.YearMonth yearMonth15 = property4.getYearMonth();
        java.lang.String str16 = property4.getAsText();
        org.joda.time.YearMonth yearMonth17 = property4.getYearMonth();
        org.joda.time.YearMonth yearMonth19 = property4.setCopy("October");
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property4.getFieldType();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "October" + "'", str16, "October");
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        java.util.Locale locale11 = null;
        int int12 = property4.getMaximumShortTextLength(locale11);
        org.joda.time.YearMonth yearMonth14 = property4.addToCopy(100);
        org.joda.time.YearMonth yearMonth16 = yearMonth14.plusYears(12);
        org.joda.time.YearMonth yearMonth18 = yearMonth16.minusMonths(1970);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(yearMonth18);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        int int9 = property4.getMaximumValue();
        int int10 = property4.getMinimumValueOverall();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property4.getAsText(locale11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.YearMonth yearMonth16 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology15);
        org.joda.time.YearMonth.Property property17 = yearMonth16.monthOfYear();
        int int18 = property17.getMaximumValue();
        java.lang.String str19 = property17.getAsShortText();
        org.joda.time.DateTimeField dateTimeField20 = property17.getField();
        org.joda.time.YearMonth yearMonth22 = property17.setCopy("Oct");
        int int23 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.YearMonth yearMonth27 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology26);
        org.joda.time.YearMonth.Property property28 = yearMonth27.monthOfYear();
        int int29 = property28.getMaximumValue();
        java.lang.String str30 = property28.getAsShortText();
        org.joda.time.YearMonth yearMonth32 = property28.addWrapFieldToCopy((int) (short) -1);
        int[] intArray33 = yearMonth32.getValues();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.YearMonth yearMonth37 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology36);
        org.joda.time.YearMonth.Property property38 = yearMonth37.monthOfYear();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology41);
        org.joda.time.YearMonth yearMonth44 = yearMonth42.minusYears((int) (short) 0);
        int int45 = yearMonth42.size();
        org.joda.time.YearMonth yearMonth47 = yearMonth42.plusMonths((int) (byte) 10);
        int int48 = property38.compareTo((org.joda.time.ReadablePartial) yearMonth42);
        org.joda.time.Chronology chronology49 = yearMonth42.getChronology();
        org.joda.time.YearMonth yearMonth50 = org.joda.time.YearMonth.now(chronology49);
        org.joda.time.YearMonth yearMonth51 = yearMonth32.withChronologyRetainFields(chronology49);
        org.joda.time.YearMonth yearMonth52 = new org.joda.time.YearMonth(chronology49);
        org.joda.time.YearMonth yearMonth53 = yearMonth22.withChronologyRetainFields(chronology49);
        java.lang.String str54 = yearMonth22.toString();
        int[] intArray55 = yearMonth22.getValues();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "October" + "'", str12, "October");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Oct" + "'", str19, "Oct");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 12 + "'", int29 == 12);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Oct" + "'", str30, "Oct");
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[97, 9]");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertNotNull(yearMonth51);
        org.junit.Assert.assertNotNull(yearMonth53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0097-10" + "'", str54, "0097-10");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[97, 10]");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.YearMonth yearMonth5 = property4.getYearMonth();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth.Property property10 = yearMonth9.monthOfYear();
        int int11 = property10.getMaximumValue();
        java.lang.String str12 = property10.getAsShortText();
        org.joda.time.YearMonth yearMonth14 = property10.addWrapFieldToCopy((int) (short) -1);
        int[] intArray15 = yearMonth14.getValues();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth.Property property20 = yearMonth19.monthOfYear();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology23);
        org.joda.time.YearMonth yearMonth26 = yearMonth24.minusYears((int) (short) 0);
        int int27 = yearMonth24.size();
        org.joda.time.YearMonth yearMonth29 = yearMonth24.plusMonths((int) (byte) 10);
        int int30 = property20.compareTo((org.joda.time.ReadablePartial) yearMonth24);
        org.joda.time.Chronology chronology31 = yearMonth24.getChronology();
        org.joda.time.YearMonth yearMonth32 = org.joda.time.YearMonth.now(chronology31);
        org.joda.time.YearMonth yearMonth33 = yearMonth14.withChronologyRetainFields(chronology31);
        org.joda.time.YearMonth yearMonth34 = yearMonth5.withChronologyRetainFields(chronology31);
        org.joda.time.YearMonth yearMonth35 = org.joda.time.YearMonth.now(chronology31);
        org.joda.time.YearMonth.Property property36 = yearMonth35.monthOfYear();
        int int37 = property36.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Oct" + "'", str12, "Oct");
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 9]");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(yearMonth32);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertNotNull(yearMonth34);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = yearMonth8.getFields();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology12);
        org.joda.time.YearMonth yearMonth15 = yearMonth13.minusYears((int) (short) 0);
        int int16 = yearMonth13.size();
        org.joda.time.YearMonth yearMonth18 = yearMonth13.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        int int20 = yearMonth13.indexOf(dateTimeFieldType19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology23);
        org.joda.time.YearMonth.Property property25 = yearMonth24.monthOfYear();
        int int26 = property25.getMaximumValue();
        java.lang.String str27 = property25.getAsShortText();
        java.util.Locale locale28 = null;
        java.lang.String str29 = property25.getAsShortText(locale28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property25.getFieldType();
        org.joda.time.YearMonth.Property property31 = yearMonth13.property(dateTimeFieldType30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology34);
        org.joda.time.YearMonth yearMonth37 = yearMonth35.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology40);
        org.joda.time.YearMonth yearMonth43 = yearMonth41.minusYears((int) (short) 0);
        int int44 = yearMonth41.size();
        boolean boolean45 = yearMonth37.isAfter((org.joda.time.ReadablePartial) yearMonth41);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.YearMonth yearMonth49 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology48);
        org.joda.time.YearMonth.Property property50 = yearMonth49.monthOfYear();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology53);
        org.joda.time.YearMonth yearMonth56 = yearMonth54.minusYears((int) (short) 0);
        int int57 = yearMonth54.size();
        org.joda.time.YearMonth yearMonth59 = yearMonth54.plusMonths((int) (byte) 10);
        int int60 = property50.compareTo((org.joda.time.ReadablePartial) yearMonth54);
        org.joda.time.Chronology chronology61 = yearMonth54.getChronology();
        org.joda.time.YearMonth yearMonth62 = yearMonth41.withChronologyRetainFields(chronology61);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.YearMonth yearMonth66 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology65);
        org.joda.time.YearMonth yearMonth68 = yearMonth66.minusYears((int) (short) 0);
        int int69 = yearMonth66.size();
        org.joda.time.YearMonth yearMonth71 = yearMonth66.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = null;
        int int73 = yearMonth66.indexOf(dateTimeFieldType72);
        org.joda.time.Interval interval74 = yearMonth66.toInterval();
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.YearMonth yearMonth78 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology77);
        org.joda.time.YearMonth.Property property79 = yearMonth78.monthOfYear();
        int int80 = property79.getMaximumValue();
        java.lang.String str81 = property79.getAsShortText();
        java.util.Locale locale82 = null;
        java.lang.String str83 = property79.getAsShortText(locale82);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = property79.getFieldType();
        int int85 = yearMonth66.get(dateTimeFieldType84);
        boolean boolean86 = yearMonth62.isSupported(dateTimeFieldType84);
        boolean boolean87 = yearMonth13.isSupported(dateTimeFieldType84);
        boolean boolean88 = yearMonth8.isSupported(dateTimeFieldType84);
        int int89 = yearMonth8.getMonthOfYear();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 12 + "'", int26 == 12);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Oct" + "'", str27, "Oct");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Oct" + "'", str29, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(yearMonth56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(yearMonth62);
        org.junit.Assert.assertNotNull(yearMonth68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(yearMonth71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 12 + "'", int80 == 12);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Oct" + "'", str81, "Oct");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Oct" + "'", str83, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 8 + "'", int89 == 8);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth yearMonth8 = yearMonth6.minusYears((int) (short) 0);
        int int9 = yearMonth6.size();
        org.joda.time.YearMonth yearMonth11 = yearMonth6.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = yearMonth6.indexOf(dateTimeFieldType12);
        org.joda.time.YearMonth yearMonth15 = yearMonth6.plusMonths((-1));
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusYears((int) (short) 0);
        int int22 = yearMonth19.size();
        org.joda.time.YearMonth yearMonth24 = yearMonth19.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        int int26 = yearMonth19.indexOf(dateTimeFieldType25);
        org.joda.time.Interval interval27 = yearMonth19.toInterval();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.YearMonth yearMonth31 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology30);
        org.joda.time.YearMonth.Property property32 = yearMonth31.monthOfYear();
        int int33 = property32.getMaximumValue();
        java.lang.String str34 = property32.getAsShortText();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property32.getAsShortText(locale35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property32.getFieldType();
        int int38 = yearMonth19.get(dateTimeFieldType37);
        org.joda.time.YearMonth.Property property39 = yearMonth6.property(dateTimeFieldType37);
        org.joda.time.Chronology chronology40 = yearMonth6.getChronology();
        org.joda.time.YearMonth yearMonth41 = org.joda.time.YearMonth.now(chronology40);
        org.joda.time.YearMonth yearMonth42 = org.joda.time.YearMonth.now(chronology40);
        org.joda.time.YearMonth yearMonth43 = new org.joda.time.YearMonth((long) (-292275054), chronology40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth((int) (byte) 1, (int) '#', chronology40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(yearMonth15);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Oct" + "'", str34, "Oct");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Oct" + "'", str36, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertNotNull(yearMonth42);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property4.getFieldType();
        org.joda.time.YearMonth yearMonth10 = property4.getYearMonth();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology13);
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusYears((int) (short) 0);
        int int22 = yearMonth19.size();
        org.joda.time.YearMonth yearMonth24 = yearMonth19.plusMonths((int) (byte) 10);
        int int25 = property15.compareTo((org.joda.time.ReadablePartial) yearMonth19);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.Interval interval27 = yearMonth19.toInterval(dateTimeZone26);
        org.joda.time.YearMonth yearMonth29 = yearMonth19.minusYears((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.YearMonth yearMonth31 = yearMonth19.plus(readablePeriod30);
        org.joda.time.YearMonth yearMonth33 = yearMonth31.plusYears((int) 'a');
        int int34 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth31);
        java.util.Locale locale36 = null;
        org.joda.time.YearMonth yearMonth37 = property4.setCopy("10", locale36);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(yearMonth29);
        org.junit.Assert.assertNotNull(yearMonth31);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(yearMonth37);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = yearMonth3.getFieldTypes();
        int[] intArray10 = yearMonth3.getValues();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology13);
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusYears((int) (short) 0);
        int int22 = yearMonth19.size();
        org.joda.time.YearMonth yearMonth24 = yearMonth19.plusMonths((int) (byte) 10);
        int int25 = property15.compareTo((org.joda.time.ReadablePartial) yearMonth19);
        org.joda.time.Chronology chronology26 = yearMonth19.getChronology();
        org.joda.time.YearMonth yearMonth27 = org.joda.time.YearMonth.now(chronology26);
        org.joda.time.YearMonth yearMonth28 = org.joda.time.YearMonth.now(chronology26);
        org.joda.time.YearMonth yearMonth29 = new org.joda.time.YearMonth((java.lang.Object) yearMonth3, chronology26);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.YearMonth yearMonth35 = yearMonth33.minusYears((int) (short) 0);
        int int36 = yearMonth33.size();
        org.joda.time.YearMonth yearMonth38 = yearMonth33.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        int int40 = yearMonth33.indexOf(dateTimeFieldType39);
        org.joda.time.YearMonth yearMonth42 = yearMonth33.plusMonths((-1));
        boolean boolean44 = yearMonth42.equals((java.lang.Object) 1);
        org.joda.time.YearMonth yearMonth46 = new org.joda.time.YearMonth((long) 100);
        boolean boolean47 = yearMonth42.isBefore((org.joda.time.ReadablePartial) yearMonth46);
        boolean boolean48 = yearMonth3.isAfter((org.joda.time.ReadablePartial) yearMonth46);
        org.joda.time.YearMonth yearMonth50 = yearMonth46.plusYears((int) ' ');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray51 = yearMonth50.getFieldTypes();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10]");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth28);
        org.junit.Assert.assertNotNull(yearMonth35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(yearMonth42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray51);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        java.lang.String str9 = property4.getAsText();
        org.joda.time.YearMonth yearMonth11 = property4.setCopy(12);
        int int12 = property4.getMinimumValue();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "October" + "'", str9, "October");
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getAsShortText();
        int int11 = property4.getMaximumValue();
        org.joda.time.YearMonth yearMonth13 = property4.setCopy((int) (short) 1);
        java.lang.String str14 = property4.getAsText();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Oct" + "'", str10, "Oct");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "October" + "'", str14, "October");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth.Property property18 = yearMonth17.monthOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        int int25 = yearMonth22.size();
        org.joda.time.YearMonth yearMonth27 = yearMonth22.plusMonths((int) (byte) 10);
        int int28 = property18.compareTo((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.Chronology chronology29 = yearMonth22.getChronology();
        org.joda.time.YearMonth yearMonth30 = yearMonth9.withChronologyRetainFields(chronology29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology33);
        org.joda.time.YearMonth yearMonth36 = yearMonth34.minusYears((int) (short) 0);
        int int37 = yearMonth34.size();
        org.joda.time.YearMonth yearMonth39 = yearMonth34.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        int int41 = yearMonth34.indexOf(dateTimeFieldType40);
        org.joda.time.YearMonth yearMonth43 = yearMonth34.plusMonths((-1));
        boolean boolean44 = yearMonth9.isEqual((org.joda.time.ReadablePartial) yearMonth43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Interval interval46 = yearMonth9.toInterval(dateTimeZone45);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = yearMonth9.getFieldTypes();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(yearMonth39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray47);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology1 = yearMonth0.getChronology();
        org.joda.time.YearMonth yearMonth3 = yearMonth0.withMonthOfYear((int) (short) 1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.YearMonth yearMonth7 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology6);
        org.joda.time.YearMonth.Property property8 = yearMonth7.monthOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        int int15 = yearMonth12.size();
        org.joda.time.YearMonth yearMonth17 = yearMonth12.plusMonths((int) (byte) 10);
        int int18 = property8.compareTo((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology21);
        org.joda.time.YearMonth yearMonth24 = yearMonth22.minusYears((int) (short) 0);
        boolean boolean25 = yearMonth12.isAfter((org.joda.time.ReadablePartial) yearMonth22);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        int int27 = yearMonth12.indexOf(dateTimeFieldType26);
        int int28 = yearMonth12.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = yearMonth12.getFieldTypes();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology33);
        org.joda.time.YearMonth yearMonth36 = yearMonth34.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology39);
        org.joda.time.YearMonth yearMonth42 = yearMonth40.minusYears((int) (short) 0);
        int int43 = yearMonth40.size();
        boolean boolean44 = yearMonth36.isAfter((org.joda.time.ReadablePartial) yearMonth40);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.YearMonth yearMonth48 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology47);
        org.joda.time.YearMonth.Property property49 = yearMonth48.monthOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology52);
        org.joda.time.YearMonth yearMonth55 = yearMonth53.minusYears((int) (short) 0);
        int int56 = yearMonth53.size();
        org.joda.time.YearMonth yearMonth58 = yearMonth53.plusMonths((int) (byte) 10);
        int int59 = property49.compareTo((org.joda.time.ReadablePartial) yearMonth53);
        org.joda.time.Chronology chronology60 = yearMonth53.getChronology();
        org.joda.time.YearMonth yearMonth61 = yearMonth40.withChronologyRetainFields(chronology60);
        org.joda.time.YearMonth yearMonth62 = new org.joda.time.YearMonth((long) (short) 1, chronology60);
        org.joda.time.YearMonth yearMonth63 = new org.joda.time.YearMonth((java.lang.Object) yearMonth12, chronology60);
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth((java.lang.Object) yearMonth63);
        int int65 = yearMonth3.compareTo((org.joda.time.ReadablePartial) yearMonth64);
        int[] intArray66 = yearMonth3.getValues();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(yearMonth3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertNotNull(yearMonth42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(yearMonth61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[2020, 1]");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.YearMonth yearMonth7 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology6);
        org.joda.time.YearMonth yearMonth9 = yearMonth7.minusYears((int) (short) 0);
        int int10 = yearMonth7.size();
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology16);
        org.joda.time.YearMonth yearMonth19 = yearMonth17.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.YearMonth yearMonth23 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology22);
        org.joda.time.YearMonth yearMonth25 = yearMonth23.minusYears((int) (short) 0);
        int int26 = yearMonth23.size();
        boolean boolean27 = yearMonth19.isAfter((org.joda.time.ReadablePartial) yearMonth23);
        org.joda.time.Interval interval28 = yearMonth19.toInterval();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.YearMonth yearMonth32 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology31);
        org.joda.time.YearMonth yearMonth34 = yearMonth32.minusYears((int) (short) 0);
        int int35 = yearMonth32.size();
        org.joda.time.YearMonth yearMonth37 = yearMonth32.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        int int39 = yearMonth32.indexOf(dateTimeFieldType38);
        org.joda.time.Interval interval40 = yearMonth32.toInterval();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology43);
        org.joda.time.YearMonth.Property property45 = yearMonth44.monthOfYear();
        int int46 = property45.getMaximumValue();
        java.lang.String str47 = property45.getAsShortText();
        java.util.Locale locale48 = null;
        java.lang.String str49 = property45.getAsShortText(locale48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property45.getFieldType();
        int int51 = yearMonth32.get(dateTimeFieldType50);
        org.joda.time.YearMonth.Property property52 = yearMonth19.property(dateTimeFieldType50);
        boolean boolean53 = yearMonth13.isSupported(dateTimeFieldType50);
        org.joda.time.YearMonth yearMonth55 = yearMonth7.withField(dateTimeFieldType50, (int) (short) 10);
        boolean boolean56 = yearMonth3.isBefore((org.joda.time.ReadablePartial) yearMonth7);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.YearMonth yearMonth60 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology59);
        org.joda.time.YearMonth.Property property61 = yearMonth60.monthOfYear();
        int int62 = property61.getMaximumValue();
        java.util.Locale locale63 = null;
        int int64 = property61.getMaximumShortTextLength(locale63);
        java.util.Locale locale65 = null;
        int int66 = property61.getMaximumTextLength(locale65);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.YearMonth yearMonth70 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology69);
        org.joda.time.YearMonth.Property property71 = yearMonth70.monthOfYear();
        int int72 = property71.getMaximumValue();
        java.util.Locale locale73 = null;
        int int74 = property71.getMaximumShortTextLength(locale73);
        java.util.Locale locale75 = null;
        int int76 = property71.getMaximumTextLength(locale75);
        java.lang.String str77 = property71.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property71.getFieldType();
        boolean boolean79 = property61.equals((java.lang.Object) property71);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = property71.getFieldType();
        org.joda.time.YearMonth.Property property81 = yearMonth7.property(dateTimeFieldType80);
        java.util.Locale locale82 = null;
        java.lang.String str83 = property81.getAsText(locale82);
        int int84 = property81.get();
        java.util.Locale locale86 = null;
        org.joda.time.YearMonth yearMonth87 = property81.setCopy("9", locale86);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(yearMonth25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(yearMonth34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 12 + "'", int46 == 12);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Oct" + "'", str47, "Oct");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Oct" + "'", str49, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 12 + "'", int62 == 12);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 9 + "'", int66 == 9);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 12 + "'", int72 == 12);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 3 + "'", int74 == 3);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 9 + "'", int76 == 9);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Oct" + "'", str77, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "October" + "'", str83, "October");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10 + "'", int84 == 10);
        org.junit.Assert.assertNotNull(yearMonth87);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumTextLength(locale8);
        java.lang.String str10 = property4.getName();
        org.joda.time.YearMonth yearMonth12 = property4.addWrapFieldToCopy(100);
        int int13 = yearMonth12.getMonthOfYear();
        org.joda.time.YearMonth.Property property14 = yearMonth12.year();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property14.getAsText(locale15);
        int int17 = property14.getMinimumValueOverall();
        org.joda.time.YearMonth yearMonth19 = property14.setCopy("9");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97" + "'", str16, "97");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-292275054) + "'", int17 == (-292275054));
        org.junit.Assert.assertNotNull(yearMonth19);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        int int8 = property4.getMaximumValueOverall();
        java.lang.String str9 = property4.getAsString();
        java.lang.String str10 = property4.getName();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology8);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears((int) (short) 0);
        int int12 = yearMonth9.size();
        boolean boolean13 = yearMonth5.isAfter((org.joda.time.ReadablePartial) yearMonth9);
        org.joda.time.YearMonth.Property property14 = yearMonth9.year();
        org.joda.time.YearMonth.Property property15 = yearMonth9.year();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = yearMonth9.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        int int9 = property4.getMinimumValueOverall();
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        org.joda.time.YearMonth yearMonth12 = property4.addWrapFieldToCopy((int) ' ');
        org.joda.time.YearMonth yearMonth14 = property4.addWrapFieldToCopy(2);
        org.joda.time.Chronology chronology15 = yearMonth14.getChronology();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        int int9 = property4.getMinimumValueOverall();
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        org.joda.time.YearMonth yearMonth12 = property4.addWrapFieldToCopy((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = property4.getAsText(locale13);
        java.lang.String str15 = property4.getName();
        org.joda.time.YearMonth yearMonth16 = property4.getYearMonth();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "October" + "'", str14, "October");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "monthOfYear" + "'", str15, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth16);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        java.lang.String str2 = yearMonth0.toString(dateTimeFormatter1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth yearMonth8 = yearMonth6.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        int int15 = yearMonth12.size();
        boolean boolean16 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology19);
        org.joda.time.YearMonth.Property property21 = yearMonth20.monthOfYear();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.YearMonth yearMonth25 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology24);
        org.joda.time.YearMonth yearMonth27 = yearMonth25.minusYears((int) (short) 0);
        int int28 = yearMonth25.size();
        org.joda.time.YearMonth yearMonth30 = yearMonth25.plusMonths((int) (byte) 10);
        int int31 = property21.compareTo((org.joda.time.ReadablePartial) yearMonth25);
        org.joda.time.Chronology chronology32 = yearMonth25.getChronology();
        org.joda.time.YearMonth yearMonth33 = yearMonth12.withChronologyRetainFields(chronology32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.YearMonth yearMonth36 = yearMonth33.withPeriodAdded(readablePeriod34, (int) 'a');
        org.joda.time.YearMonth yearMonth38 = yearMonth33.plusMonths(9);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology41);
        org.joda.time.YearMonth.Property property43 = yearMonth42.monthOfYear();
        int int44 = property43.getMaximumValue();
        java.lang.String str45 = property43.getAsShortText();
        java.util.Locale locale46 = null;
        java.lang.String str47 = property43.getAsShortText(locale46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property43.getFieldType();
        int int49 = yearMonth33.get(dateTimeFieldType48);
        int int50 = yearMonth0.get(dateTimeFieldType48);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth53 = yearMonth0.withField(dateTimeFieldType51, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2020-11" + "'", str2, "2020-11");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertNotNull(yearMonth38);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 12 + "'", int44 == 12);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Oct" + "'", str45, "Oct");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Oct" + "'", str47, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 11 + "'", int50 == 11);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        boolean boolean21 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        int int23 = yearMonth8.indexOf(dateTimeFieldType22);
        int int24 = yearMonth8.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = yearMonth8.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.Interval interval27 = yearMonth8.toInterval(dateTimeZone26);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology33);
        org.joda.time.YearMonth yearMonth36 = yearMonth34.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology39);
        org.joda.time.YearMonth yearMonth42 = yearMonth40.minusYears((int) (short) 0);
        int int43 = yearMonth40.size();
        boolean boolean44 = yearMonth36.isAfter((org.joda.time.ReadablePartial) yearMonth40);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.YearMonth yearMonth48 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology47);
        org.joda.time.YearMonth.Property property49 = yearMonth48.monthOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology52);
        org.joda.time.YearMonth yearMonth55 = yearMonth53.minusYears((int) (short) 0);
        int int56 = yearMonth53.size();
        org.joda.time.YearMonth yearMonth58 = yearMonth53.plusMonths((int) (byte) 10);
        int int59 = property49.compareTo((org.joda.time.ReadablePartial) yearMonth53);
        org.joda.time.Chronology chronology60 = yearMonth53.getChronology();
        org.joda.time.YearMonth yearMonth61 = yearMonth40.withChronologyRetainFields(chronology60);
        org.joda.time.YearMonth yearMonth62 = new org.joda.time.YearMonth((long) (short) 1, chronology60);
        org.joda.time.YearMonth yearMonth63 = new org.joda.time.YearMonth(chronology60);
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth((int) (byte) 100, (int) (short) 10, chronology60);
        int int66 = yearMonth64.getValue((int) (short) 1);
        int int67 = yearMonth64.getYear();
        org.joda.time.YearMonth.Property property68 = yearMonth64.year();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.YearMonth yearMonth72 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology71);
        org.joda.time.YearMonth.Property property73 = yearMonth72.monthOfYear();
        int int74 = property73.getMaximumValue();
        java.util.Locale locale75 = null;
        int int76 = property73.getMaximumShortTextLength(locale75);
        java.util.Locale locale77 = null;
        int int78 = property73.getMaximumTextLength(locale77);
        org.joda.time.DurationField durationField79 = property73.getRangeDurationField();
        java.lang.String str80 = property73.toString();
        boolean boolean81 = property68.equals((java.lang.Object) property73);
        java.lang.String str82 = property73.getAsString();
        boolean boolean83 = yearMonth8.equals((java.lang.Object) str82);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertNotNull(yearMonth42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(yearMonth61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 12 + "'", int74 == 12);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 3 + "'", int76 == 3);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 9 + "'", int78 == 9);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Property[monthOfYear]" + "'", str80, "Property[monthOfYear]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "10" + "'", str82, "10");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMaximumValue();
        java.lang.String str6 = property4.getAsShortText();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsShortText(locale7);
        int int9 = property4.getMinimumValueOverall();
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        org.joda.time.YearMonth yearMonth12 = property4.addWrapFieldToCopy((int) ' ');
        org.joda.time.YearMonth yearMonth14 = property4.addWrapFieldToCopy(2);
        org.joda.time.YearMonth yearMonth16 = property4.setCopy(9);
        int int17 = property4.getMinimumValue();
        java.util.Locale locale18 = null;
        int int19 = property4.getMaximumShortTextLength(locale18);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oct" + "'", str6, "Oct");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Oct" + "'", str8, "Oct");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        int int5 = property4.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        org.joda.time.YearMonth yearMonth8 = property4.addToCopy((int) ' ');
        java.util.Locale locale10 = null;
        java.lang.String str11 = yearMonth8.toString("2015-01", locale10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth.Property property16 = yearMonth15.monthOfYear();
        org.joda.time.YearMonth yearMonth17 = property16.getYearMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        int int19 = yearMonth8.get(dateTimeFieldType18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField21 = yearMonth8.getField((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2015-01" + "'", str11, "2015-01");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        boolean boolean21 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = yearMonth18.toString(dateTimeFormatter22);
        org.joda.time.Interval interval24 = yearMonth18.toInterval();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.YearMonth yearMonth27 = yearMonth18.withPeriodAdded(readablePeriod25, (int) (byte) -1);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.YearMonth yearMonth34 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology33);
        org.joda.time.YearMonth yearMonth36 = yearMonth34.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology39);
        org.joda.time.YearMonth yearMonth42 = yearMonth40.minusYears((int) (short) 0);
        int int43 = yearMonth40.size();
        boolean boolean44 = yearMonth36.isAfter((org.joda.time.ReadablePartial) yearMonth40);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.YearMonth yearMonth48 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology47);
        org.joda.time.YearMonth.Property property49 = yearMonth48.monthOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology52);
        org.joda.time.YearMonth yearMonth55 = yearMonth53.minusYears((int) (short) 0);
        int int56 = yearMonth53.size();
        org.joda.time.YearMonth yearMonth58 = yearMonth53.plusMonths((int) (byte) 10);
        int int59 = property49.compareTo((org.joda.time.ReadablePartial) yearMonth53);
        org.joda.time.Chronology chronology60 = yearMonth53.getChronology();
        org.joda.time.YearMonth yearMonth61 = yearMonth40.withChronologyRetainFields(chronology60);
        org.joda.time.YearMonth yearMonth62 = new org.joda.time.YearMonth((long) (short) 1, chronology60);
        org.joda.time.YearMonth yearMonth63 = new org.joda.time.YearMonth(chronology60);
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth((int) (byte) 100, (int) (short) 10, chronology60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = null;
        java.lang.String str66 = yearMonth64.toString(dateTimeFormatter65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.YearMonth yearMonth68 = yearMonth64.plus(readablePeriod67);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.YearMonth yearMonth72 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology71);
        org.joda.time.YearMonth.Property property73 = yearMonth72.monthOfYear();
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.YearMonth yearMonth77 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology76);
        org.joda.time.YearMonth yearMonth79 = yearMonth77.minusYears((int) (short) 0);
        int int80 = yearMonth77.size();
        org.joda.time.YearMonth yearMonth82 = yearMonth77.plusMonths((int) (byte) 10);
        int int83 = property73.compareTo((org.joda.time.ReadablePartial) yearMonth77);
        org.joda.time.Chronology chronology84 = yearMonth77.getChronology();
        org.joda.time.YearMonth yearMonth85 = yearMonth64.withChronologyRetainFields(chronology84);
        org.joda.time.YearMonth yearMonth86 = new org.joda.time.YearMonth((java.lang.Object) readablePeriod25, chronology84);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0097-10" + "'", str23, "0097-10");
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(yearMonth36);
        org.junit.Assert.assertNotNull(yearMonth42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(yearMonth55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(yearMonth61);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0100-10" + "'", str66, "0100-10");
        org.junit.Assert.assertNotNull(yearMonth68);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(yearMonth79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertNotNull(yearMonth82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(chronology84);
        org.junit.Assert.assertNotNull(yearMonth85);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.YearMonth yearMonth12 = yearMonth3.plusMonths((-1));
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.YearMonth yearMonth16 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology15);
        org.joda.time.YearMonth yearMonth18 = yearMonth16.minusYears((int) (short) 0);
        int int19 = yearMonth16.size();
        org.joda.time.YearMonth yearMonth21 = yearMonth16.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        int int23 = yearMonth16.indexOf(dateTimeFieldType22);
        org.joda.time.Interval interval24 = yearMonth16.toInterval();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth.Property property29 = yearMonth28.monthOfYear();
        int int30 = property29.getMaximumValue();
        java.lang.String str31 = property29.getAsShortText();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property29.getAsShortText(locale32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property29.getFieldType();
        int int35 = yearMonth16.get(dateTimeFieldType34);
        org.joda.time.YearMonth.Property property36 = yearMonth3.property(dateTimeFieldType34);
        org.joda.time.Chronology chronology37 = yearMonth3.getChronology();
        int int39 = yearMonth3.getValue(0);
        org.joda.time.Interval interval40 = yearMonth3.toInterval();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology43);
        org.joda.time.YearMonth yearMonth46 = yearMonth44.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.YearMonth yearMonth50 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology49);
        org.joda.time.YearMonth yearMonth52 = yearMonth50.minusYears((int) (short) 0);
        int int53 = yearMonth50.size();
        boolean boolean54 = yearMonth46.isAfter((org.joda.time.ReadablePartial) yearMonth50);
        org.joda.time.YearMonth.Property property55 = yearMonth50.year();
        org.joda.time.YearMonth.Property property56 = yearMonth50.year();
        org.joda.time.YearMonth yearMonth58 = yearMonth50.plusMonths(97);
        boolean boolean59 = yearMonth3.isAfter((org.joda.time.ReadablePartial) yearMonth58);
        org.joda.time.DateTimeField[] dateTimeFieldArray60 = yearMonth3.getFields();
        org.joda.time.DurationFieldType durationFieldType61 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth63 = yearMonth3.withFieldAdded(durationFieldType61, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Oct" + "'", str31, "Oct");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(yearMonth46);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(yearMonth58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray60);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = yearMonth8.toInterval(dateTimeZone15);
        org.joda.time.YearMonth yearMonth18 = yearMonth8.minusYears((int) (short) 0);
        java.lang.String str19 = yearMonth8.toString();
        org.joda.time.YearMonth yearMonth21 = yearMonth8.withMonthOfYear(11);
        org.joda.time.Chronology chronology22 = yearMonth21.getChronology();
        org.joda.time.YearMonth yearMonth23 = org.joda.time.YearMonth.now(chronology22);
        org.joda.time.YearMonth yearMonth24 = org.joda.time.YearMonth.now(chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth26 = yearMonth24.withMonthOfYear((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0097-10" + "'", str19, "0097-10");
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertNotNull(yearMonth24);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsShortText(locale6);
        org.joda.time.YearMonth yearMonth9 = property4.addWrapFieldToCopy(100);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Oct" + "'", str7, "Oct");
        org.junit.Assert.assertNotNull(yearMonth9);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = yearMonth8.toInterval(dateTimeZone15);
        org.joda.time.YearMonth yearMonth18 = yearMonth8.minusYears((int) (short) 0);
        java.lang.String str19 = yearMonth8.toString();
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology21 = yearMonth20.getChronology();
        org.joda.time.YearMonth yearMonth22 = yearMonth8.withChronologyRetainFields(chronology21);
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology25 = yearMonth24.getChronology();
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((long) 3, chronology25);
        org.joda.time.YearMonth yearMonth27 = yearMonth22.withChronologyRetainFields(chronology25);
        org.joda.time.Interval interval28 = yearMonth22.toInterval();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0097-10" + "'", str19, "0097-10");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(interval28);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.Interval interval11 = yearMonth3.toInterval();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology14);
        org.joda.time.YearMonth.Property property16 = yearMonth15.monthOfYear();
        int int17 = property16.getMaximumValue();
        java.lang.String str18 = property16.getAsShortText();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property16.getAsShortText(locale19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property16.getFieldType();
        int int22 = yearMonth3.get(dateTimeFieldType21);
        org.joda.time.Interval interval23 = yearMonth3.toInterval();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = yearMonth3.toString(dateTimeFormatter24);
        org.joda.time.Interval interval26 = yearMonth3.toInterval();
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Oct" + "'", str18, "Oct");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Oct" + "'", str20, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0097-10" + "'", str25, "0097-10");
        org.junit.Assert.assertNotNull(interval26);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology15 = yearMonth8.getChronology();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology18);
        org.joda.time.YearMonth yearMonth21 = yearMonth19.minusYears((int) (short) 0);
        int int22 = yearMonth19.size();
        org.joda.time.YearMonth yearMonth24 = yearMonth19.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        int int26 = yearMonth19.indexOf(dateTimeFieldType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth.Property property31 = yearMonth30.monthOfYear();
        int int32 = property31.getMaximumValue();
        java.lang.String str33 = property31.getAsShortText();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property31.getAsShortText(locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property31.getFieldType();
        org.joda.time.YearMonth.Property property37 = yearMonth19.property(dateTimeFieldType36);
        org.joda.time.YearMonth.Property property38 = yearMonth8.property(dateTimeFieldType36);
        int int39 = property38.getMaximumValue();
        org.joda.time.YearMonth yearMonth41 = property38.addWrapFieldToCopy(12);
        org.joda.time.YearMonth yearMonth43 = property38.addToCopy((int) (short) 100);
        org.joda.time.YearMonth yearMonth45 = yearMonth43.plusMonths((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = yearMonth43.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(yearMonth24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 12 + "'", int32 == 12);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Oct" + "'", str35, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 12 + "'", int39 == 12);
        org.junit.Assert.assertNotNull(yearMonth41);
        org.junit.Assert.assertNotNull(yearMonth43);
        org.junit.Assert.assertNotNull(yearMonth45);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth yearMonth5 = yearMonth3.minusYears((int) (short) 0);
        int int6 = yearMonth3.size();
        org.joda.time.YearMonth yearMonth8 = yearMonth3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = yearMonth3.indexOf(dateTimeFieldType9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology13);
        org.joda.time.YearMonth.Property property15 = yearMonth14.monthOfYear();
        int int16 = property15.getMaximumValue();
        java.lang.String str17 = property15.getAsShortText();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property15.getAsShortText(locale18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property15.getFieldType();
        org.joda.time.YearMonth.Property property21 = yearMonth3.property(dateTimeFieldType20);
        int int22 = yearMonth3.getYear();
        org.joda.time.YearMonth yearMonth24 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology25 = yearMonth24.getChronology();
        org.joda.time.YearMonth yearMonth26 = new org.joda.time.YearMonth((long) 3, chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = yearMonth26.getFieldType((int) (short) 1);
        org.joda.time.YearMonth yearMonth30 = yearMonth26.plusMonths((int) '#');
        int int31 = yearMonth3.compareTo((org.joda.time.ReadablePartial) yearMonth30);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Oct" + "'", str17, "Oct");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Oct" + "'", str19, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(yearMonth30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology2);
        org.joda.time.YearMonth.Property property4 = yearMonth3.monthOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology7);
        org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears((int) (short) 0);
        int int11 = yearMonth8.size();
        org.joda.time.YearMonth yearMonth13 = yearMonth8.plusMonths((int) (byte) 10);
        int int14 = property4.compareTo((org.joda.time.ReadablePartial) yearMonth8);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        boolean boolean21 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = yearMonth18.toString(dateTimeFormatter22);
        org.joda.time.YearMonth.Property property24 = yearMonth18.year();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology27);
        org.joda.time.YearMonth.Property property29 = yearMonth28.monthOfYear();
        int int30 = property29.getMaximumValue();
        java.util.Locale locale31 = null;
        int int32 = property29.getMaximumShortTextLength(locale31);
        java.util.Locale locale33 = null;
        int int34 = property29.getMaximumTextLength(locale33);
        java.lang.String str35 = property29.getName();
        org.joda.time.YearMonth yearMonth37 = property29.addToCopy((int) (short) 10);
        int[] intArray38 = yearMonth37.getValues();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.YearMonth yearMonth42 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology41);
        org.joda.time.YearMonth yearMonth44 = yearMonth42.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.YearMonth yearMonth48 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology47);
        org.joda.time.YearMonth yearMonth50 = yearMonth48.minusYears((int) (short) 0);
        int int51 = yearMonth48.size();
        boolean boolean52 = yearMonth44.isAfter((org.joda.time.ReadablePartial) yearMonth48);
        org.joda.time.YearMonth.Property property53 = yearMonth48.year();
        boolean boolean54 = yearMonth37.equals((java.lang.Object) property53);
        int[] intArray55 = yearMonth37.getValues();
        boolean boolean56 = yearMonth18.isBefore((org.joda.time.ReadablePartial) yearMonth37);
        int int57 = yearMonth18.getMonthOfYear();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(yearMonth13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0097-10" + "'", str23, "0097-10");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "monthOfYear" + "'", str35, "monthOfYear");
        org.junit.Assert.assertNotNull(yearMonth37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[98, 8]");
        org.junit.Assert.assertNotNull(yearMonth44);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[98, 8]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(1, 12);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology5);
        org.joda.time.YearMonth yearMonth8 = yearMonth6.minusYears((int) (short) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology11);
        org.joda.time.YearMonth yearMonth14 = yearMonth12.minusYears((int) (short) 0);
        int int15 = yearMonth12.size();
        boolean boolean16 = yearMonth8.isAfter((org.joda.time.ReadablePartial) yearMonth12);
        org.joda.time.Interval interval17 = yearMonth8.toInterval();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology20);
        org.joda.time.YearMonth yearMonth23 = yearMonth21.minusYears((int) (short) 0);
        int int24 = yearMonth21.size();
        org.joda.time.YearMonth yearMonth26 = yearMonth21.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        int int28 = yearMonth21.indexOf(dateTimeFieldType27);
        org.joda.time.Interval interval29 = yearMonth21.toInterval();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology32);
        org.joda.time.YearMonth.Property property34 = yearMonth33.monthOfYear();
        int int35 = property34.getMaximumValue();
        java.lang.String str36 = property34.getAsShortText();
        java.util.Locale locale37 = null;
        java.lang.String str38 = property34.getAsShortText(locale37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property34.getFieldType();
        int int40 = yearMonth21.get(dateTimeFieldType39);
        org.joda.time.YearMonth.Property property41 = yearMonth8.property(dateTimeFieldType39);
        boolean boolean42 = yearMonth2.isSupported(dateTimeFieldType39);
        org.joda.time.YearMonth.Property property43 = yearMonth2.year();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.YearMonth yearMonth48 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology47);
        org.joda.time.YearMonth.Property property49 = yearMonth48.monthOfYear();
        org.joda.time.YearMonth yearMonth50 = property49.getYearMonth();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology53);
        org.joda.time.YearMonth.Property property55 = yearMonth54.monthOfYear();
        int int56 = property55.getMaximumValue();
        java.lang.String str57 = property55.getAsShortText();
        org.joda.time.YearMonth yearMonth59 = property55.addWrapFieldToCopy((int) (short) -1);
        int[] intArray60 = yearMonth59.getValues();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.YearMonth yearMonth64 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology63);
        org.joda.time.YearMonth.Property property65 = yearMonth64.monthOfYear();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.YearMonth yearMonth69 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology68);
        org.joda.time.YearMonth yearMonth71 = yearMonth69.minusYears((int) (short) 0);
        int int72 = yearMonth69.size();
        org.joda.time.YearMonth yearMonth74 = yearMonth69.plusMonths((int) (byte) 10);
        int int75 = property65.compareTo((org.joda.time.ReadablePartial) yearMonth69);
        org.joda.time.Chronology chronology76 = yearMonth69.getChronology();
        org.joda.time.YearMonth yearMonth77 = org.joda.time.YearMonth.now(chronology76);
        org.joda.time.YearMonth yearMonth78 = yearMonth59.withChronologyRetainFields(chronology76);
        org.joda.time.YearMonth yearMonth79 = yearMonth50.withChronologyRetainFields(chronology76);
        org.joda.time.YearMonth yearMonth80 = new org.joda.time.YearMonth(1L, chronology76);
        org.joda.time.YearMonth yearMonth81 = new org.joda.time.YearMonth(chronology76);
        boolean boolean82 = yearMonth2.isEqual((org.joda.time.ReadablePartial) yearMonth81);
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(yearMonth26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 12 + "'", int35 == 12);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Oct" + "'", str36, "Oct");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Oct" + "'", str38, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 12 + "'", int56 == 12);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Oct" + "'", str57, "Oct");
        org.junit.Assert.assertNotNull(yearMonth59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[97, 9]");
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(yearMonth71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertNotNull(yearMonth74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(yearMonth77);
        org.junit.Assert.assertNotNull(yearMonth78);
        org.junit.Assert.assertNotNull(yearMonth79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.YearMonth yearMonth5 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology4);
        org.joda.time.YearMonth yearMonth7 = yearMonth5.minusYears((int) (short) 0);
        int int8 = yearMonth5.size();
        org.joda.time.YearMonth yearMonth10 = yearMonth5.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = yearMonth5.indexOf(dateTimeFieldType11);
        org.joda.time.YearMonth yearMonth14 = yearMonth5.plusMonths((-1));
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology17);
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusYears((int) (short) 0);
        int int21 = yearMonth18.size();
        org.joda.time.YearMonth yearMonth23 = yearMonth18.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        int int25 = yearMonth18.indexOf(dateTimeFieldType24);
        org.joda.time.Interval interval26 = yearMonth18.toInterval();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology29);
        org.joda.time.YearMonth.Property property31 = yearMonth30.monthOfYear();
        int int32 = property31.getMaximumValue();
        java.lang.String str33 = property31.getAsShortText();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property31.getAsShortText(locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property31.getFieldType();
        int int37 = yearMonth18.get(dateTimeFieldType36);
        org.joda.time.YearMonth.Property property38 = yearMonth5.property(dateTimeFieldType36);
        org.joda.time.Chronology chronology39 = yearMonth5.getChronology();
        org.joda.time.YearMonth yearMonth40 = new org.joda.time.YearMonth(chronology39);
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonth yearMonth45 = new org.joda.time.YearMonth((int) 'a', (int) (byte) 10, chronology44);
        org.joda.time.YearMonth yearMonth47 = yearMonth45.minusYears((int) (short) 0);
        org.joda.time.Interval interval48 = yearMonth45.toInterval();
        org.joda.time.Chronology chronology49 = yearMonth45.getChronology();
        org.joda.time.YearMonth yearMonth50 = yearMonth41.withChronologyRetainFields(chronology49);
        org.joda.time.YearMonth yearMonth51 = new org.joda.time.YearMonth(chronology49);
        org.joda.time.YearMonth yearMonth52 = yearMonth40.withChronologyRetainFields(chronology49);
        org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth((long) (short) 10, chronology49);
        org.joda.time.YearMonth yearMonth54 = org.joda.time.YearMonth.now(chronology49);
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth((long) 1, chronology49);
        org.junit.Assert.assertNotNull(yearMonth7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 12 + "'", int32 == 12);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Oct" + "'", str33, "Oct");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Oct" + "'", str35, "Oct");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(yearMonth47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(yearMonth50);
        org.junit.Assert.assertNotNull(yearMonth52);
        org.junit.Assert.assertNotNull(yearMonth54);
    }
}

