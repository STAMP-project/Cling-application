import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate10 = localDate8.minusWeeks((-1));
        boolean boolean11 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate.Property property12 = localDate8.yearOfCentury();
        java.lang.String str13 = property12.getAsShortText();
        org.joda.time.LocalDate localDate15 = property12.addWrapFieldToCopy(0);
        org.joda.time.LocalDate.Property property16 = localDate15.weekOfWeekyear();
        boolean boolean17 = localDate0.isAfter((org.joda.time.ReadablePartial) localDate15);
        int int18 = localDate15.getCenturyOfEra();
        org.joda.time.LocalDate.Property property19 = localDate15.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    @Ignore
  public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate7.plusYears(1);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date18 = localDate17.toDate();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.fromDateFields(date18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate21 = localDate19.minus(readablePeriod20);
        org.joda.time.LocalDate.Property property22 = localDate21.dayOfWeek();
        org.joda.time.LocalDate localDate24 = localDate21.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate.Property property25 = localDate21.yearOfCentury();
        int int26 = localDate15.compareTo((org.joda.time.ReadablePartial) localDate21);
        java.lang.String str27 = localDate15.toString();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1971-01-01" + "'", str27, "1971-01-01");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks((-1));
        org.joda.time.LocalDate.Property property6 = localDate5.monthOfYear();
        org.joda.time.DurationField durationField7 = property6.getRangeDurationField();
        java.lang.String str8 = property6.getAsString();
        int int9 = property6.get();
        int int10 = property6.get();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate3.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.LocalDate.Property property8 = localDate3.yearOfEra();
        org.joda.time.LocalDate localDate9 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate11 = localDate9.plusYears(0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(10L, chronology6);
        java.lang.String str9 = localDate8.toString();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property12 = localDate3.weekOfWeekyear();
        long long13 = property12.remainder();
        org.joda.time.LocalDate localDate14 = property12.withMinimumValue();
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = localDate14.getFields();
        org.joda.time.LocalDate.Property property16 = localDate14.year();
        java.util.Locale locale17 = null;
        int int18 = property16.getMaximumShortTextLength(locale17);
        int int19 = property16.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 292278993 + "'", int19 == 292278993);
    }

    @Test
    @Ignore
  public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        org.joda.time.LocalDate localDate12 = property9.roundFloorCopy();
        java.lang.String str13 = property9.getAsString();
        org.joda.time.LocalDate localDate14 = property9.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate20 = localDate18.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate22 = localDate20.minusWeeks((-1));
        boolean boolean23 = localDate16.isEqual((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate.Property property24 = localDate16.year();
        org.joda.time.LocalDate localDate26 = property24.setCopy("2020");
        org.joda.time.LocalDate localDate27 = property24.roundHalfEvenCopy();
        java.lang.String str28 = property24.getAsText();
        org.joda.time.LocalDate localDate29 = property24.roundHalfEvenCopy();
        org.joda.time.LocalDate.Property property30 = localDate29.yearOfCentury();
        org.joda.time.LocalDate localDate31 = localDate14.withFields((org.joda.time.ReadablePartial) localDate29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField33 = localDate31.getField(25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 25");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020" + "'", str28, "2020");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDate31);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        boolean boolean10 = property9.isLeap();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        int int16 = localDate14.indexOf(dateTimeFieldType15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate20 = localDate18.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology21 = localDate18.getChronology();
        int int22 = localDate14.compareTo((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate.Property property23 = localDate14.weekOfWeekyear();
        int int24 = property9.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate localDate25 = property9.roundCeilingCopy();
        int int26 = localDate25.getYearOfEra();
        int int27 = localDate25.getEra();
        org.joda.time.DateMidnight dateMidnight28 = localDate25.toDateMidnight();
        org.joda.time.LocalDate localDate30 = localDate25.withYearOfEra(48);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withDayOfYear(99);
        org.joda.time.LocalDate.Property property4 = localDate1.dayOfYear();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.parse("1970-01-01");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate14 = localDate12.minusWeeks((-1));
        boolean boolean15 = localDate8.isEqual((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate.Property property16 = localDate12.yearOfCentury();
        java.lang.String str17 = property16.getAsShortText();
        org.joda.time.LocalDate localDate19 = property16.addWrapFieldToCopy(0);
        int int20 = property16.getMaximumValue();
        org.joda.time.LocalDate localDate21 = property16.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate22 = localDate6.withFields((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate localDate24 = localDate21.withCenturyOfEra(100);
        org.joda.time.LocalDate localDate25 = localDate1.withFields((org.joda.time.ReadablePartial) localDate24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = localDate24.withWeekOfWeekyear((-10024));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10024 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    @Ignore
  public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate4 = localDate1.withPeriodAdded(readablePeriod2, 0);
        org.joda.time.LocalDate localDate6 = localDate4.minusDays((int) (byte) 100);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.year();
        org.joda.time.LocalDate localDate9 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalTime localTime10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTime(localTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) localDate9, dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.withCenturyOfEra(11);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = localDate15.toDateMidnight(dateTimeZone16);
        org.joda.time.DateTimeField[] dateTimeFieldArray18 = localDate15.getFields();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate24 = localDate22.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate26 = localDate24.minusWeeks((-1));
        boolean boolean27 = localDate20.isEqual((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate.Property property28 = localDate24.yearOfCentury();
        java.lang.String str29 = property28.getAsShortText();
        org.joda.time.LocalDate localDate31 = property28.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate33 = property28.addWrapFieldToCopy((int) (short) 10);
        java.util.Locale locale34 = null;
        java.lang.String str35 = property28.getAsShortText(locale34);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) locale34);
        org.joda.time.LocalDate.Property property37 = localDate36.yearOfCentury();
        int int38 = localDate36.getWeekOfWeekyear();
        org.joda.time.LocalTime localTime39 = null;
        org.joda.time.DateTime dateTime40 = localDate36.toDateTime(localTime39);
        boolean boolean41 = localDate15.isAfter((org.joda.time.ReadablePartial) localDate36);
        org.joda.time.LocalTime localTime42 = null;
        org.joda.time.DateTime dateTime43 = localDate36.toDateTime(localTime42);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateTimeFieldArray18);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1" + "'", str29, "1");
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1" + "'", str35, "1");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 48 + "'", int38 == 48);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    @Ignore
  public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = localDate4.toInterval(dateTimeZone7);
        int[] intArray9 = localDate4.getValues();
        org.joda.time.LocalTime localTime10 = null;
        org.joda.time.DateTime dateTime11 = localDate4.toDateTime(localTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate4.plusMonths(365);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = localDate12.toInterval(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate12.plusWeeks((-1));
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, 1968);
        org.joda.time.LocalDate localDate21 = localDate19.withDayOfMonth(13);
        java.util.Locale locale23 = null;
        java.lang.String str24 = localDate19.toString("0", locale23);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        int int13 = property9.getMaximumValue();
        org.joda.time.LocalDate localDate14 = property9.roundHalfEvenCopy();
        long long15 = property9.remainder();
        org.joda.time.DurationField durationField16 = property9.getDurationField();
        org.joda.time.DateTimeField dateTimeField17 = property9.getField();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    @Ignore
  public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        int int11 = property9.get();
        long long12 = property9.remainder();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((-1));
        boolean boolean21 = localDate14.isEqual((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate28 = localDate26.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate30 = localDate28.minusWeeks((-1));
        boolean boolean31 = localDate24.isEqual((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalDate.Property property32 = localDate24.year();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate36 = localDate34.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate38 = localDate36.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localDate36.toDateTimeAtCurrentTime(dateTimeZone39);
        int int41 = property32.getDifference((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology42);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate47 = localDate45.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate49 = localDate47.minusWeeks((-1));
        boolean boolean50 = localDate43.isEqual((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtMidnight();
        int int52 = property32.getDifference((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime53 = localDate18.toDateTime((org.joda.time.ReadableInstant) dateTime51);
        long long54 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.LocalDate localDate55 = property9.roundHalfEvenCopy();
        int int56 = property9.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 28425600000L + "'", long12 == 28425600000L);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2019 + "'", int41 == 2019);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2019 + "'", int52 == 2019);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 2019L + "'", long54 == 2019L);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-292275054) + "'", int56 == (-292275054));
    }

    @Test
    @Ignore
  public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        org.joda.time.DateTimeField dateTimeField11 = property9.getField();
        int int12 = property9.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        org.joda.time.LocalDate localDate14 = property9.withMinimumValue();
        int int15 = localDate14.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate14.withPeriodAdded(readablePeriod16, 9);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292278993 + "'", int12 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2922750 + "'", int15 == 2922750);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDate1.getChronology();
        org.joda.time.LocalDate.Property property5 = localDate1.yearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.minusMonths(19);
        org.joda.time.LocalDate.Property property8 = localDate1.year();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate16 = localDate14.minusWeeks((-1));
        boolean boolean17 = localDate10.isEqual((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate.Property property18 = localDate14.yearOfCentury();
        java.lang.String str19 = property18.getAsShortText();
        org.joda.time.LocalDate localDate21 = property18.addWrapFieldToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Interval interval23 = localDate21.toInterval(dateTimeZone22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = localDate21.isSupported(dateTimeFieldType24);
        int int26 = localDate21.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate21.withPeriodAdded(readablePeriod27, 99);
        boolean boolean31 = localDate29.equals((java.lang.Object) 0.0f);
        boolean boolean32 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDate localDate34 = localDate29.plus(readablePeriod33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate40 = localDate38.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate42 = localDate40.minusWeeks((-1));
        boolean boolean43 = localDate36.isEqual((org.joda.time.ReadablePartial) localDate40);
        org.joda.time.LocalDate.Property property44 = localDate40.yearOfCentury();
        java.lang.String str45 = property44.getAsShortText();
        org.joda.time.LocalDate localDate46 = property44.withMaximumValue();
        int int47 = localDate46.getMonthOfYear();
        int int48 = localDate46.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate50 = localDate46.plusWeeks(0);
        org.joda.time.LocalDate.Property property51 = localDate46.centuryOfEra();
        org.joda.time.LocalDate localDate52 = property51.getLocalDate();
        org.joda.time.Interval interval53 = property51.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property51.getFieldType();
        org.joda.time.LocalDate localDate56 = localDate29.withField(dateTimeFieldType54, 9);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1" + "'", str45, "1");
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(localDate56);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate13 = localDate3.withCenturyOfEra((int) '4');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = localDate13.getFieldTypes();
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate13.plus(readablePeriod16);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate16 = localDate14.withMonthOfYear(10);
        int int17 = localDate14.getWeekyear();
        org.joda.time.LocalDate localDate19 = localDate14.withYear(13);
        org.joda.time.LocalDate localDate21 = localDate14.minusWeeks(2021);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = localDate21.toString(dateTimeFormatter22);
        int int24 = localDate21.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-0037-04-09" + "'", str23, "-0037-04-09");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
    }

    @Test
    @Ignore
  public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        int int11 = property9.get();
        long long12 = property9.remainder();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((-1));
        boolean boolean21 = localDate14.isEqual((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate28 = localDate26.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate30 = localDate28.minusWeeks((-1));
        boolean boolean31 = localDate24.isEqual((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalDate.Property property32 = localDate24.year();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate36 = localDate34.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate38 = localDate36.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localDate36.toDateTimeAtCurrentTime(dateTimeZone39);
        int int41 = property32.getDifference((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology42);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate47 = localDate45.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate49 = localDate47.minusWeeks((-1));
        boolean boolean50 = localDate43.isEqual((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtMidnight();
        int int52 = property32.getDifference((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime53 = localDate18.toDateTime((org.joda.time.ReadableInstant) dateTime51);
        long long54 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime53);
        java.util.Locale locale55 = null;
        java.lang.String str56 = property9.getAsText(locale55);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 28425600000L + "'", long12 == 28425600000L);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2019 + "'", int41 == 2019);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2019 + "'", int52 == 2019);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 2019L + "'", long54 == 2019L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "2020" + "'", str56, "2020");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate18 = localDate16.minusWeeks((-1));
        int int19 = property9.compareTo((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate localDate21 = localDate16.withMonthOfYear((int) (byte) 1);
        org.joda.time.LocalDate localDate23 = localDate21.plusYears(27);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.LocalDate.Property property26 = localDate23.dayOfYear();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate31 = localDate28.withPeriodAdded(readablePeriod29, 0);
        org.joda.time.LocalDate localDate33 = localDate31.withWeekyear(19);
        org.joda.time.LocalDate localDate35 = localDate31.minusDays(1970);
        int int36 = localDate35.getEra();
        org.joda.time.LocalDate localDate37 = localDate23.withFields((org.joda.time.ReadablePartial) localDate35);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(localDate37);
    }

    @Test
    @Ignore
  public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate10 = localDate8.minusWeeks((-1));
        boolean boolean11 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate.Property property12 = localDate8.yearOfCentury();
        java.lang.String str13 = property12.getAsShortText();
        org.joda.time.LocalDate localDate15 = property12.addWrapFieldToCopy(0);
        org.joda.time.LocalDate.Property property16 = localDate15.weekOfWeekyear();
        boolean boolean17 = localDate0.isAfter((org.joda.time.ReadablePartial) localDate15);
        int int18 = localDate15.getCenturyOfEra();
        org.joda.time.LocalDate localDate20 = localDate15.withWeekyear(330);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        int int22 = localDate15.indexOf(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate28 = localDate26.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate30 = localDate28.minusWeeks((-1));
        boolean boolean31 = localDate24.isEqual((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalDate.Property property32 = localDate28.yearOfCentury();
        java.lang.String str33 = property32.getAsShortText();
        org.joda.time.LocalDate localDate35 = property32.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate37 = property32.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date40 = localDate39.toDate();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate44 = localDate42.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology45 = localDate42.getChronology();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) date40, chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = localDate46.toDateMidnight(dateTimeZone47);
        org.joda.time.LocalDate.Property property49 = localDate46.weekOfWeekyear();
        org.joda.time.LocalDate localDate50 = property49.roundHalfEvenCopy();
        boolean boolean51 = localDate37.isBefore((org.joda.time.ReadablePartial) localDate50);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date54 = localDate53.toDate();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate58 = localDate56.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology59 = localDate56.getChronology();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((java.lang.Object) date54, chronology59);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = localDate60.toDateMidnight(dateTimeZone61);
        org.joda.time.LocalDate localDate63 = localDate50.withFields((org.joda.time.ReadablePartial) localDate60);
        boolean boolean64 = localDate15.equals((java.lang.Object) localDate50);
        int[] intArray65 = localDate50.getValues();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateMidnight62);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1969, 12, 29]");
    }

    @Test
    @Ignore
  public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDate10.indexOf(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        int int18 = localDate10.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate14.toDateMidnight(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate14.minusYears((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.LocalDate localDate25 = localDate4.withFields((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate.Property property26 = localDate4.era();
        org.joda.time.LocalDate localDate28 = localDate4.minusYears(31);
        org.joda.time.LocalDate.Property property29 = localDate4.year();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate33 = localDate31.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        int int35 = localDate33.indexOf(dateTimeFieldType34);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology40 = localDate37.getChronology();
        int int41 = localDate33.compareTo((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalDate.Property property42 = localDate33.weekOfWeekyear();
        org.joda.time.LocalDate localDate44 = localDate33.withYearOfEra(2);
        org.joda.time.LocalDate localDate46 = localDate33.minusYears(100);
        org.joda.time.LocalDate.Property property47 = localDate46.yearOfEra();
        org.joda.time.LocalDate localDate48 = property47.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = localDate48.toDateTimeAtStartOfDay(dateTimeZone49);
        long long51 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 2069L + "'", long51 == 2069L);
    }

    @Test
    @Ignore
  public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        boolean boolean10 = property9.isLeap();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate11 = localDate5.withYearOfCentury((int) '#');
        int int12 = localDate11.getDayOfMonth();
        org.joda.time.LocalDate.Property property13 = localDate11.yearOfEra();
        java.util.Locale locale14 = null;
        int int15 = property13.getMaximumShortTextLength(locale14);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        boolean boolean11 = property9.equals((java.lang.Object) 100L);
        java.lang.String str12 = property9.toString();
        java.lang.String str13 = property9.getAsShortText();
        int int14 = property9.getMinimumValue();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[yearOfCentury]" + "'", str12, "Property[yearOfCentury]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    @Ignore
  public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        int int18 = property9.getDifference((org.joda.time.ReadableInstant) dateTime17);
        java.lang.String str19 = property9.getAsString();
        org.joda.time.LocalDate localDate21 = property9.addWrapFieldToCopy((int) ' ');
        org.joda.time.DateTimeField dateTimeField22 = property9.getField();
        int int23 = property9.getMaximumValue();
        java.util.Locale locale24 = null;
        java.lang.String str25 = property9.getAsText(locale24);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2019 + "'", int18 == 2019);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020" + "'", str19, "2020");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 292278993 + "'", int23 == 292278993);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020" + "'", str25, "2020");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        int int8 = localDate6.indexOf(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology13 = localDate10.getChronology();
        int int14 = localDate6.compareTo((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate.Property property15 = localDate6.weekOfWeekyear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((-1));
        boolean boolean24 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate localDate26 = localDate21.withYear((int) (short) 0);
        org.joda.time.LocalDate.Property property27 = localDate21.year();
        org.joda.time.LocalDate localDate29 = property27.setCopy((int) 'a');
        org.joda.time.LocalDate localDate31 = property27.addToCopy(48);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = localDate31.getFieldType(1);
        boolean boolean34 = localDate6.isSupported(dateTimeFieldType33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate36 = localDate2.withField(dateTimeFieldType33, 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate1.withDayOfMonth((-10024));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10024 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        boolean boolean11 = property9.equals((java.lang.Object) 100L);
        java.lang.String str12 = property9.toString();
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        org.joda.time.LocalDate localDate14 = property9.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, 2020);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtStartOfDay(dateTimeZone18);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[yearOfCentury]" + "'", str12, "Property[yearOfCentury]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate7.minusYears((int) ' ');
        org.joda.time.LocalDate localDate17 = localDate7.minusYears((int) '#');
        org.joda.time.DateTime dateTime18 = localDate7.toDateTimeAtMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate7.withYearOfCentury(400);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 400 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        int int9 = localDate5.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = localDate5.toInterval(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate5.toDateTimeAtCurrentTime(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        int int2 = localDate1.getCenturyOfEra();
        org.joda.time.LocalDate.Property property3 = localDate1.centuryOfEra();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate7 = localDate5.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        int int9 = localDate7.indexOf(dateTimeFieldType8);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology14 = localDate11.getChronology();
        int int15 = localDate7.compareTo((org.joda.time.ReadablePartial) localDate11);
        int int16 = localDate11.getDayOfYear();
        java.lang.String str17 = localDate11.toString();
        java.lang.String str19 = localDate11.toString("1");
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = localDate11.toDateMidnight(dateTimeZone20);
        org.joda.time.LocalDate.Property property22 = localDate11.year();
        org.joda.time.LocalDate.Property property23 = localDate11.weekyear();
        org.joda.time.LocalDate localDate24 = property23.roundCeilingCopy();
        int int25 = property3.compareTo((org.joda.time.ReadablePartial) localDate24);
        int int26 = property3.getMinimumValueOverall();
        java.lang.String str27 = property3.getName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "centuryOfEra" + "'", str27, "centuryOfEra");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property12 = localDate3.weekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate3.withYearOfEra(2);
        org.joda.time.LocalDate localDate16 = localDate3.minusYears(100);
        org.joda.time.LocalDate.Property property17 = localDate16.yearOfEra();
        org.joda.time.LocalDate localDate18 = property17.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtStartOfDay(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate18.withWeekyear(5);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate7.minusYears((int) ' ');
        org.joda.time.LocalDate localDate17 = localDate7.minusYears(3);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) localDate7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = localDate7.toString(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
    }

    @Test
    @Ignore
  public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        int int12 = localDate3.getEra();
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = localDate3.getFields();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate17 = localDate15.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((-1));
        org.joda.time.LocalDate localDate21 = localDate17.minusMonths(25);
        org.joda.time.LocalDate localDate23 = localDate21.minusDays(1);
        int int24 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 292278993, dateTimeZone27);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) dateTimeZone27, chronology31);
        org.joda.time.DateMidnight dateMidnight33 = localDate32.toDateMidnight();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date36 = localDate35.toDate();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate40 = localDate38.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology41 = localDate38.getChronology();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((java.lang.Object) date36, chronology41);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now(chronology41);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(chronology41);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight33, chronology41);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 2, chronology41);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) localDate3, chronology41);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(localDate43);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate16 = localDate14.withMonthOfYear(10);
        int int17 = localDate14.getWeekyear();
        org.joda.time.LocalDate localDate19 = localDate14.withYear(13);
        org.joda.time.LocalDate.Property property20 = localDate14.era();
        org.joda.time.LocalDate localDate22 = property20.addWrapFieldToCopy(2020);
        org.joda.time.DurationField durationField23 = property20.getDurationField();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        boolean boolean11 = property9.equals((java.lang.Object) 100L);
        java.lang.String str12 = property9.toString();
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        org.joda.time.LocalDate localDate14 = property9.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate17 = localDate14.withPeriodAdded(readablePeriod15, 2020);
        int int18 = localDate17.getWeekyear();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[yearOfCentury]" + "'", str12, "Property[yearOfCentury]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    @Ignore
  public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDate10.indexOf(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        int int18 = localDate10.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate14.toDateMidnight(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate14.minusYears((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.LocalDate localDate25 = localDate4.withFields((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate.Property property26 = localDate4.era();
        org.joda.time.LocalDate localDate28 = localDate4.minusYears(31);
        int int29 = localDate28.getYear();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1939 + "'", int29 == 1939);
    }

    @Test
    @Ignore
  public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = localDate4.toInterval(dateTimeZone7);
        int[] intArray9 = localDate4.getValues();
        org.joda.time.LocalTime localTime10 = null;
        org.joda.time.DateTime dateTime11 = localDate4.toDateTime(localTime10);
        int int12 = localDate4.getEra();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    @Ignore
  public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        int int18 = property9.getDifference((org.joda.time.ReadableInstant) dateTime17);
        java.lang.String str19 = property9.getAsString();
        org.joda.time.LocalDate localDate21 = property9.addWrapFieldToCopy((int) ' ');
        org.joda.time.LocalDate localDate22 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate23 = property9.withMaximumValue();
        org.joda.time.LocalDate localDate25 = property9.addToCopy((int) (byte) -1);
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfEra();
        int int27 = property26.get();
        java.util.Locale locale29 = null;
        org.joda.time.LocalDate localDate30 = property26.setCopy("1", locale29);
        java.util.Date date31 = localDate30.toDate();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray32 = localDate30.getFieldTypes();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2019 + "'", int18 == 2019);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020" + "'", str19, "2020");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2019 + "'", int27 == 2019);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Fri Nov 25 00:00:00 UTC 1");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray32);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        boolean boolean11 = property9.equals((java.lang.Object) 100L);
        java.lang.String str12 = property9.toString();
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate15.withPeriodAdded(readablePeriod16, 0);
        org.joda.time.LocalDate localDate20 = localDate18.minusDays((int) (byte) 100);
        int int21 = localDate20.getMonthOfYear();
        int int22 = localDate20.getCenturyOfEra();
        int int23 = property9.compareTo((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate25 = property9.setCopy("4");
        int int26 = property9.getMinimumValue();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[yearOfCentury]" + "'", str12, "Property[yearOfCentury]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    @Ignore
  public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = localDate4.toInterval(dateTimeZone7);
        int[] intArray9 = localDate4.getValues();
        org.joda.time.LocalDate.Property property10 = localDate4.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = property10.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    @Ignore
  public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date17 = localDate16.toDate();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology22 = localDate19.getChronology();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) date17, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = localDate23.toDateMidnight(dateTimeZone24);
        org.joda.time.LocalDate.Property property26 = localDate23.weekOfWeekyear();
        org.joda.time.LocalDate localDate27 = property26.roundHalfEvenCopy();
        boolean boolean28 = localDate14.isBefore((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate30 = localDate14.minusYears((int) '4');
        int int31 = localDate14.getCenturyOfEra();
        int int32 = localDate14.getMonthOfYear();
        org.joda.time.LocalDate localDate34 = localDate14.minusYears((-10));
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDate34);
    }

    @Test
    @Ignore
  public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        int int18 = property9.getDifference((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate24 = localDate22.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate26 = localDate24.minusWeeks((-1));
        boolean boolean27 = localDate20.isEqual((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtMidnight();
        int int29 = property9.getDifference((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.LocalDate localDate30 = property9.roundHalfFloorCopy();
        java.lang.String str31 = property9.getName();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2019 + "'", int18 == 2019);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2019 + "'", int29 == 2019);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "year" + "'", str31, "year");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks((-1));
        org.joda.time.LocalDate.Property property6 = localDate5.monthOfYear();
        java.lang.String str7 = property6.toString();
        org.joda.time.LocalDate localDate8 = property6.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[monthOfYear]" + "'", str7, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    @Ignore
  public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate10 = localDate8.minusWeeks((-1));
        boolean boolean11 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate.Property property12 = localDate8.yearOfCentury();
        java.lang.String str13 = property12.getAsShortText();
        org.joda.time.LocalDate localDate14 = property12.withMaximumValue();
        java.lang.String str15 = localDate14.toString();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate14.withPeriodAdded(readablePeriod16, 11);
        org.joda.time.LocalDate localDate19 = localDate0.withFields((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate25 = localDate23.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate27 = localDate25.minusWeeks((-1));
        boolean boolean28 = localDate21.isEqual((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate30 = localDate21.plusDays((int) (short) 100);
        int[] intArray31 = localDate30.getValues();
        org.joda.time.LocalDate localDate32 = localDate14.withFields((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone33);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0099-01-01" + "'", str15, "0099-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[2021, 3, 5]");
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate14 = property9.addWrapFieldToCopy((int) (short) 10);
        java.util.Locale locale15 = null;
        java.lang.String str16 = property9.getAsShortText(locale15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) locale15);
        org.joda.time.LocalDate localDate19 = localDate17.withYear(1);
        org.joda.time.LocalDate.Property property20 = localDate17.dayOfWeek();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate25 = localDate22.withPeriodAdded(readablePeriod23, 0);
        org.joda.time.LocalDate localDate27 = localDate25.minusDays((int) (byte) 100);
        int int28 = localDate27.getMonthOfYear();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (byte) -1);
        org.joda.time.LocalTime localTime31 = null;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTime(localTime31);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        int int34 = property20.compareTo((org.joda.time.ReadableInstant) dateTime32);
        java.lang.String str35 = property20.toString();
        org.joda.time.LocalDate localDate36 = property20.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Property[dayOfWeek]" + "'", str35, "Property[dayOfWeek]");
        org.junit.Assert.assertNotNull(localDate36);
    }

    @Test
    @Ignore
  public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate10 = localDate1.plusDays((int) (short) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date13 = localDate12.toDate();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((-1));
        boolean boolean24 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate.Property property25 = localDate17.year();
        int int26 = property25.get();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate30 = localDate28.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        int int32 = localDate30.indexOf(dateTimeFieldType31);
        org.joda.time.LocalTime localTime33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate30.toDateTime(localTime33, dateTimeZone34);
        long long36 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        int int37 = property15.compareTo((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean38 = localDate10.equals((java.lang.Object) dateTime35);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate43 = localDate41.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology44 = localDate41.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 4, chronology44);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) dateTime35, chronology44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate48 = localDate46.withDayOfYear(2019);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2019 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2020 + "'", int26 == 2020);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 2019L + "'", long36 == 2019L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(chronology44);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property12 = localDate3.weekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate3.withYearOfEra(2);
        org.joda.time.LocalDate localDate16 = localDate3.minusYears(100);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(330);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate23 = localDate20.withPeriodAdded(readablePeriod21, 0);
        org.joda.time.LocalDate localDate25 = localDate23.minusDays((int) (byte) 100);
        int int26 = localDate25.getMonthOfYear();
        int int27 = localDate25.getCenturyOfEra();
        int int28 = localDate18.compareTo((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate30 = localDate25.plusMonths((int) (short) 10);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate35 = localDate33.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology36 = localDate33.getChronology();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) (short) 0, chronology36);
        boolean boolean38 = localDate30.isBefore((org.joda.time.ReadablePartial) localDate37);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19 + "'", int27 == 19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("weekOfWeekyear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"weekOfWeekyear\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        int int2 = localDate1.getCenturyOfEra();
        org.joda.time.LocalDate.Property property3 = localDate1.centuryOfEra();
        java.lang.String str4 = localDate1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
    }

    @Test
    @Ignore
  public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDate10.indexOf(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        int int18 = localDate10.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate14.toDateMidnight(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate14.minusYears((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.LocalDate localDate25 = localDate4.withFields((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate30 = localDate27.withPeriodAdded(readablePeriod28, 0);
        org.joda.time.LocalDate localDate32 = localDate30.minusDays((int) (byte) 100);
        int int33 = localDate32.getMonthOfYear();
        boolean boolean34 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate32);
        org.joda.time.LocalDate localDate36 = localDate4.withWeekyear(20);
        org.joda.time.LocalDate localDate38 = localDate36.plusDays((int) '#');
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate38);
    }

    @Test
    @Ignore
  public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone16);
        int int18 = property9.getDifference((org.joda.time.ReadableInstant) dateTime17);
        java.lang.String str19 = property9.getAsString();
        org.joda.time.LocalDate localDate21 = property9.addWrapFieldToCopy((int) ' ');
        long long22 = property9.remainder();
        org.joda.time.LocalDate localDate23 = property9.withMinimumValue();
        org.joda.time.LocalDate.Property property24 = localDate23.dayOfYear();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2019 + "'", int18 == 2019);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020" + "'", str19, "2020");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 28425600000L + "'", long22 == 28425600000L);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDate1.getChronology();
        org.joda.time.LocalDate.Property property5 = localDate1.yearOfEra();
        org.joda.time.LocalDate localDate7 = localDate1.minusMonths(19);
        org.joda.time.LocalDate.Property property8 = localDate1.year();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate16 = localDate14.minusWeeks((-1));
        boolean boolean17 = localDate10.isEqual((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate.Property property18 = localDate14.yearOfCentury();
        java.lang.String str19 = property18.getAsShortText();
        org.joda.time.LocalDate localDate21 = property18.addWrapFieldToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Interval interval23 = localDate21.toInterval(dateTimeZone22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = localDate21.isSupported(dateTimeFieldType24);
        int int26 = localDate21.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate21.withPeriodAdded(readablePeriod27, 99);
        boolean boolean31 = localDate29.equals((java.lang.Object) 0.0f);
        boolean boolean32 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate.Property property33 = localDate29.year();
        long long34 = property33.remainder();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate38 = localDate36.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology39 = localDate36.getChronology();
        org.joda.time.LocalDate.Property property40 = localDate36.yearOfEra();
        org.joda.time.LocalDate localDate42 = localDate36.minusMonths(19);
        org.joda.time.LocalDate.Property property43 = localDate36.year();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(chronology44);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate49 = localDate47.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate51 = localDate49.minusWeeks((-1));
        boolean boolean52 = localDate45.isEqual((org.joda.time.ReadablePartial) localDate49);
        org.joda.time.LocalDate.Property property53 = localDate49.yearOfCentury();
        java.lang.String str54 = property53.getAsShortText();
        org.joda.time.LocalDate localDate56 = property53.addWrapFieldToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.Interval interval58 = localDate56.toInterval(dateTimeZone57);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = null;
        boolean boolean60 = localDate56.isSupported(dateTimeFieldType59);
        int int61 = localDate56.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.LocalDate localDate64 = localDate56.withPeriodAdded(readablePeriod62, 99);
        boolean boolean66 = localDate64.equals((java.lang.Object) 0.0f);
        boolean boolean67 = localDate36.isAfter((org.joda.time.ReadablePartial) localDate64);
        int int68 = localDate64.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = localDate64.toDateTimeAtMidnight(dateTimeZone69);
        int int71 = property33.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1" + "'", str54, "1");
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    @Ignore
  public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        int int10 = property9.get();
        int int11 = property9.get();
        long long12 = property9.remainder();
        java.util.Locale locale13 = null;
        int int14 = property9.getMaximumShortTextLength(locale13);
        java.lang.String str15 = property9.toString();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, 0);
        org.joda.time.LocalDate localDate22 = localDate20.minusDays((int) (byte) 100);
        int int23 = localDate22.getMonthOfYear();
        int int24 = localDate22.getCenturyOfEra();
        org.joda.time.LocalTime localTime25 = null;
        org.joda.time.DateTime dateTime26 = localDate22.toDateTime(localTime25);
        long long27 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalDate localDate28 = property9.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 28425600000L + "'", long12 == 28425600000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[year]" + "'", str15, "Property[year]");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 51L + "'", long27 == 51L);
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    @Ignore
  public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks((-1));
        org.joda.time.LocalDate localDate7 = localDate3.minusMonths(25);
        int[] intArray8 = localDate7.getValues();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        int int14 = localDate12.indexOf(dateTimeFieldType13);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology19 = localDate16.getChronology();
        int int20 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate.Property property21 = localDate12.weekOfWeekyear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(chronology22);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate27 = localDate25.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate29 = localDate27.minusWeeks((-1));
        boolean boolean30 = localDate23.isEqual((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate32 = localDate27.withYear((int) (short) 0);
        org.joda.time.LocalDate.Property property33 = localDate27.year();
        org.joda.time.LocalDate localDate35 = property33.setCopy((int) 'a');
        org.joda.time.LocalDate localDate37 = property33.addToCopy(48);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = localDate37.getFieldType(1);
        boolean boolean40 = localDate12.isSupported(dateTimeFieldType39);
        org.joda.time.LocalDate.Property property41 = localDate7.property(dateTimeFieldType39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology42);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate47 = localDate45.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate49 = localDate47.minusWeeks((-1));
        boolean boolean50 = localDate43.isEqual((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.LocalDate.Property property51 = localDate47.yearOfCentury();
        java.lang.String str52 = property51.getAsShortText();
        org.joda.time.LocalDate localDate54 = property51.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate56 = property51.addToCopy((int) (short) 1);
        org.joda.time.LocalDate.Property property57 = localDate56.weekOfWeekyear();
        org.joda.time.LocalDate localDate58 = property57.roundFloorCopy();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate62 = localDate60.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = null;
        int int64 = localDate62.indexOf(dateTimeFieldType63);
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate68 = localDate66.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology69 = localDate66.getChronology();
        int int70 = localDate62.compareTo((org.joda.time.ReadablePartial) localDate66);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = localDate66.toDateMidnight(dateTimeZone71);
        org.joda.time.DateTime dateTime73 = localDate58.toDateTime((org.joda.time.ReadableInstant) dateMidnight72);
        long long74 = property41.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight72);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-2, 12, 1]");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1" + "'", str52, "1");
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(localDate68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-23653L) + "'", long74 == (-23653L));
    }

    @Test
    @Ignore
  public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.minus(readablePeriod4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((-1));
        boolean boolean14 = localDate7.isEqual((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((-1));
        boolean boolean24 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate.Property property25 = localDate17.year();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate29 = localDate27.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate31 = localDate29.minusWeeks((-1));
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtCurrentTime(dateTimeZone32);
        int int34 = property25.getDifference((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate40 = localDate38.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate42 = localDate40.minusWeeks((-1));
        boolean boolean43 = localDate36.isEqual((org.joda.time.ReadablePartial) localDate40);
        org.joda.time.DateTime dateTime44 = localDate40.toDateTimeAtMidnight();
        int int45 = property25.getDifference((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime47 = localDate5.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.LocalDate.Property property48 = localDate5.dayOfWeek();
        org.joda.time.LocalDate.Property property49 = localDate5.weekyear();
        org.joda.time.LocalDate localDate51 = localDate5.plusYears((int) (byte) 10);
        org.joda.time.LocalDate.Property property52 = localDate5.dayOfWeek();
        java.lang.String str53 = property52.toString();
        org.joda.time.LocalDate localDate54 = property52.getLocalDate();
        org.joda.time.DurationField durationField55 = property52.getLeapDurationField();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2019 + "'", int34 == 2019);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2019 + "'", int45 == 2019);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Property[dayOfWeek]" + "'", str53, "Property[dayOfWeek]");
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNull(durationField55);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate1.year();
        org.joda.time.LocalDate localDate11 = property9.setCopy("2020");
        org.joda.time.LocalDate localDate12 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate14 = localDate12.withDayOfYear(9);
        org.joda.time.LocalDate localDate16 = localDate12.minusMonths((int) (short) 0);
        int int17 = localDate16.getCenturyOfEra();
        org.joda.time.LocalDate.Property property18 = localDate16.weekOfWeekyear();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property18.getAsShortText(locale19);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "53" + "'", str20, "53");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate12 = property9.addWrapFieldToCopy(0);
        java.lang.String str13 = property9.getAsText();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = property9.setCopy("Property[year]", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[year]\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate7.minusYears((int) ' ');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((-1));
        boolean boolean24 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate localDate26 = localDate21.withYear((int) (short) 0);
        org.joda.time.LocalDate.Property property27 = localDate21.year();
        org.joda.time.LocalDate localDate29 = property27.setCopy((int) 'a');
        org.joda.time.LocalDate localDate31 = property27.addToCopy(48);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = localDate31.getFieldType(1);
        org.joda.time.LocalDate.Property property34 = localDate7.property(dateTimeFieldType33);
        int int35 = localDate7.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate7.toDateTimeAtMidnight(dateTimeZone36);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime37);
    }
}

