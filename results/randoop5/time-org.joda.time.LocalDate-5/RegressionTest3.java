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
        int int33 = localDate32.getDayOfWeek();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date4 = localDate3.toDate();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology9 = localDate6.getChronology();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) date4, chronology9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(0L, chronology9);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (byte) 10, chronology9);
        org.joda.time.Interval interval13 = localDate12.toInterval();
        org.joda.time.LocalDate localDate15 = localDate12.withWeekOfWeekyear(12);
        org.joda.time.LocalDate localDate17 = localDate15.withYear(10025);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate.Property property9 = localDate5.yearOfCentury();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        int int13 = localDate11.indexOf(dateTimeFieldType12);
        org.joda.time.LocalDate.Property property14 = localDate11.dayOfWeek();
        org.joda.time.LocalDate localDate16 = localDate11.minusWeeks((int) (byte) 0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks((-1));
        boolean boolean25 = localDate18.isEqual((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.LocalDate localDate27 = localDate18.plusDays((int) (short) 100);
        org.joda.time.DateTime dateTime28 = localDate27.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate30 = localDate27.plusDays(32);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate33 = localDate27.withPeriodAdded(readablePeriod31, (int) (byte) 10);
        org.joda.time.LocalDate localDate35 = localDate27.minusDays(0);
        boolean boolean36 = localDate11.isBefore((org.joda.time.ReadablePartial) localDate35);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date17 = localDate16.toDate();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology22 = localDate19.getChronology();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) date17, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = localDate23.toDateMidnight(dateTimeZone24);
        org.joda.time.LocalDate.Property property26 = localDate23.weekOfWeekyear();
        org.joda.time.LocalDate localDate27 = localDate14.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date32 = localDate31.toDate();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate36 = localDate34.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology37 = localDate34.getChronology();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((java.lang.Object) date32, chronology37);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(0L, chronology37);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) (byte) 10, chronology37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(chronology41);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate46 = localDate44.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate48 = localDate46.minusWeeks((-1));
        boolean boolean49 = localDate42.isEqual((org.joda.time.ReadablePartial) localDate46);
        org.joda.time.LocalDate localDate51 = localDate42.plusDays((int) (short) 100);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date54 = localDate53.toDate();
        org.joda.time.LocalDate localDate55 = org.joda.time.LocalDate.fromDateFields(date54);
        org.joda.time.LocalDate.Property property56 = localDate55.yearOfCentury();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate(chronology57);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate62 = localDate60.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate64 = localDate62.minusWeeks((-1));
        boolean boolean65 = localDate58.isEqual((org.joda.time.ReadablePartial) localDate62);
        org.joda.time.LocalDate.Property property66 = localDate58.year();
        int int67 = property66.get();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate71 = localDate69.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = null;
        int int73 = localDate71.indexOf(dateTimeFieldType72);
        org.joda.time.LocalTime localTime74 = null;
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = localDate71.toDateTime(localTime74, dateTimeZone75);
        long long77 = property66.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime76);
        int int78 = property56.compareTo((org.joda.time.ReadableInstant) dateTime76);
        boolean boolean79 = localDate51.equals((java.lang.Object) dateTime76);
        org.joda.time.LocalDate localDate82 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate84 = localDate82.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology85 = localDate82.getChronology();
        org.joda.time.LocalDate localDate86 = new org.joda.time.LocalDate((long) 4, chronology85);
        org.joda.time.LocalDate localDate87 = new org.joda.time.LocalDate((java.lang.Object) dateTime76, chronology85);
        org.joda.time.LocalDate localDate88 = new org.joda.time.LocalDate((java.lang.Object) localDate40, chronology85);
        boolean boolean89 = localDate27.isAfter((org.joda.time.ReadablePartial) localDate40);
        org.joda.time.LocalDate localDate91 = localDate27.withYear(25);
        org.joda.time.DateTime dateTime92 = localDate27.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str94 = localDate27.toString("year");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2020 + "'", int67 == 2020);
        org.junit.Assert.assertNotNull(localDate71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 2019L + "'", long77 == 2019L);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(localDate84);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(localDate91);
        org.junit.Assert.assertNotNull(dateTime92);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate10 = localDate5.withYear((int) (short) 0);
        org.joda.time.DateTime dateTime11 = localDate5.toDateTimeAtStartOfDay();
        java.util.Locale locale13 = null;
        java.lang.String str14 = localDate5.toString("292278993", locale13);
        org.joda.time.LocalTime localTime15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate5.toDateTime(localTime15, dateTimeZone16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate23 = localDate21.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate25 = localDate23.minusWeeks((-1));
        boolean boolean26 = localDate19.isEqual((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate localDate28 = localDate23.withYear((int) (short) 0);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate31 = localDate29.plusMonths((int) '4');
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((-1));
        boolean boolean40 = localDate33.isEqual((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalDate.Property property41 = localDate37.yearOfCentury();
        java.lang.String str42 = property41.getAsShortText();
        org.joda.time.LocalDate localDate44 = property41.addWrapFieldToCopy(0);
        org.joda.time.LocalDate.Property property45 = localDate44.weekOfWeekyear();
        boolean boolean46 = localDate29.isAfter((org.joda.time.ReadablePartial) localDate44);
        int int47 = localDate44.getCenturyOfEra();
        org.joda.time.LocalDate.Property property48 = localDate44.dayOfMonth();
        org.joda.time.LocalDate localDate50 = localDate44.withYear((int) (short) 0);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(chronology51);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate56 = localDate54.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate58 = localDate56.minusWeeks((-1));
        boolean boolean59 = localDate52.isEqual((org.joda.time.ReadablePartial) localDate56);
        org.joda.time.LocalDate.Property property60 = localDate56.yearOfCentury();
        java.lang.String str61 = property60.getAsShortText();
        org.joda.time.LocalDate localDate62 = property60.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = null;
        int int64 = localDate62.indexOf(dateTimeFieldType63);
        org.joda.time.LocalDate.Property property65 = localDate62.dayOfWeek();
        java.lang.String str66 = property65.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property65.getFieldType();
        boolean boolean68 = localDate44.isSupported(dateTimeFieldType67);
        int int69 = localDate23.get(dateTimeFieldType67);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate71 = localDate5.withField(dateTimeFieldType67, 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "292278993" + "'", str14, "292278993");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1" + "'", str42, "1");
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1" + "'", str61, "1");
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Thursday" + "'", str66, "Thursday");
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(obj0, dateTimeZone1);
    }

    @Test
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
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths((int) (byte) 1);
        int int16 = localDate13.size();
        org.joda.time.LocalDate localDate18 = localDate13.minusDays(38);
        org.joda.time.LocalDate localDate20 = localDate13.withCenturyOfEra(0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 292278993, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((java.lang.Object) dateTimeZone1, chronology5);
        org.joda.time.DateMidnight dateMidnight7 = localDate6.toDateMidnight();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) '#');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        int int15 = localDate13.indexOf(dateTimeFieldType14);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology20 = localDate17.getChronology();
        int int21 = localDate13.compareTo((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = localDate17.toDateMidnight(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate17.minusYears((int) ' ');
        org.joda.time.LocalDate localDate27 = localDate17.minusYears((int) '#');
        org.joda.time.LocalDate localDate29 = localDate17.withDayOfYear(330);
        org.joda.time.LocalDate localDate31 = localDate29.plusYears(13);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date34 = localDate33.toDate();
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.fromDateFields(date34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDate localDate37 = localDate35.minus(readablePeriod36);
        org.joda.time.LocalDate.Property property38 = localDate37.dayOfWeek();
        org.joda.time.LocalDate localDate40 = localDate37.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) localDate40);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date44 = localDate43.toDate();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate48 = localDate46.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology49 = localDate46.getChronology();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((java.lang.Object) date44, chronology49);
        java.util.Date date51 = localDate50.toDate();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(chronology52);
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate57 = localDate55.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate59 = localDate57.minusWeeks((-1));
        boolean boolean60 = localDate53.isEqual((org.joda.time.ReadablePartial) localDate57);
        org.joda.time.LocalDate localDate62 = localDate57.withYear((int) (short) 0);
        org.joda.time.LocalDate.Property property63 = localDate57.year();
        org.joda.time.LocalDate localDate65 = property63.setCopy((int) 'a');
        org.joda.time.LocalDate localDate67 = property63.addToCopy(48);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = localDate67.getFieldType(1);
        org.joda.time.LocalDate.Property property70 = localDate50.property(dateTimeFieldType69);
        org.joda.time.LocalDate localDate72 = localDate40.withField(dateTimeFieldType69, (int) (byte) 1);
        int int73 = localDate29.indexOf(dateTimeFieldType69);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate75 = localDate9.withField(dateTimeFieldType69, 308);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 308 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(localDate72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("10", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        boolean boolean16 = localDate12.isSupported(dateTimeFieldType15);
        int int17 = localDate12.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDate12.isSupported(dateTimeFieldType18);
        org.joda.time.DateTimeField[] dateTimeFieldArray20 = localDate12.getFields();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate12.toDateTimeAtStartOfDay(dateTimeZone21);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        int int52 = localDate51.getMonthOfYear();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date55 = localDate54.toDate();
        org.joda.time.LocalDate localDate56 = org.joda.time.LocalDate.fromDateFields(date55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.LocalDate localDate58 = localDate56.minus(readablePeriod57);
        org.joda.time.LocalDate.Property property59 = localDate58.dayOfWeek();
        org.joda.time.LocalDate localDate61 = localDate58.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate.Property property62 = localDate58.yearOfCentury();
        boolean boolean63 = localDate51.isAfter((org.joda.time.ReadablePartial) localDate58);
        org.joda.time.LocalDate localDate65 = localDate51.minusDays(31);
        int int66 = localDate65.getWeekOfWeekyear();
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 48 + "'", int66 == 48);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDate1.getChronology();
        int int5 = localDate1.getYearOfCentury();
        org.joda.time.LocalDate localDate7 = localDate1.minusDays((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.withWeekyear((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate11.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.LocalDate localDate16 = localDate11.minusWeeks((int) (byte) -1);
        boolean boolean17 = localDate7.isBefore((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate localDate19 = localDate16.withDayOfYear(70);
        java.util.Date date20 = localDate19.toDate();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Mar 11 00:00:00 UTC 1970");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology7 = localDate4.getChronology();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) date2, chronology7);
        java.util.Date date9 = localDate8.toDate();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate15.minusWeeks((-1));
        boolean boolean18 = localDate11.isEqual((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate20 = localDate15.withYear((int) (short) 0);
        org.joda.time.LocalDate.Property property21 = localDate15.year();
        org.joda.time.LocalDate localDate23 = property21.setCopy((int) 'a');
        org.joda.time.LocalDate localDate25 = property21.addToCopy(48);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = localDate25.getFieldType(1);
        org.joda.time.LocalDate.Property property28 = localDate8.property(dateTimeFieldType27);
        int int29 = property28.getLeapAmount();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        int int7 = property4.getMinimumValue();
        org.joda.time.LocalDate localDate8 = property4.roundFloorCopy();
        java.lang.String str9 = property4.getAsShortText();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate15.minusWeeks((-1));
        boolean boolean18 = localDate11.isEqual((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate.Property property19 = localDate11.year();
        int int20 = property19.get();
        org.joda.time.LocalDate localDate22 = property19.addToCopy((-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        int int25 = property4.compareTo((org.joda.time.ReadablePartial) localDate22);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "70" + "'", str9, "70");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate7.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.LocalDate.Property property18 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate19 = property18.roundHalfEvenCopy();
        org.joda.time.LocalDate.Property property20 = localDate19.dayOfYear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.LocalDate localDate6 = localDate4.minusMonths(292278993);
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate3.withWeekyear(1980);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromDateFields(date2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate5.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) localDate8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(6);
        org.joda.time.LocalDate.Property property12 = localDate9.weekOfWeekyear();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate10 = localDate1.plusDays((int) (short) 100);
        org.joda.time.LocalDate localDate12 = localDate1.withYearOfEra((int) ' ');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date18 = localDate17.toDate();
        java.util.Locale locale20 = null;
        java.lang.String str21 = localDate17.toString("2020", locale20);
        org.joda.time.Chronology chronology22 = localDate17.getChronology();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(1983, 11, 4, chronology22);
        boolean boolean24 = localDate12.equals((java.lang.Object) 11);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020" + "'", str21, "2020");
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date2 = localDate1.toDate();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate1.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(99);
        int int7 = localDate4.getMonthOfYear();
        int int8 = localDate4.size();
        org.joda.time.LocalDate localDate10 = localDate4.withDayOfYear(2);
        org.joda.time.LocalTime localTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDate10.toLocalDateTime(localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        int int5 = localDate3.indexOf(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        int int11 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        int int12 = localDate7.getDayOfYear();
        java.lang.String str13 = localDate7.toString();
        java.lang.String str15 = localDate7.toString("1");
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate7.minus(readablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) localDate17, dateTimeZone18);
        java.lang.Class<?> wildcardClass20 = localDate19.getClass();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((-1));
        boolean boolean8 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate10 = localDate1.plusDays((int) (short) 100);
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate10.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate21 = localDate19.minusWeeks((-1));
        boolean boolean22 = localDate15.isEqual((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate.Property property23 = localDate19.yearOfCentury();
        java.lang.String str24 = property23.getAsShortText();
        org.joda.time.LocalDate localDate25 = property23.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        int int27 = localDate25.indexOf(dateTimeFieldType26);
        org.joda.time.LocalDate.Property property28 = localDate25.dayOfWeek();
        java.lang.String str29 = property28.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
        int int31 = localDate10.indexOf(dateTimeFieldType30);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date34 = localDate33.toDate();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate36 = localDate33.minus(readablePeriod35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDate localDate39 = localDate36.withPeriodAdded(readablePeriod37, 48);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date42 = localDate41.toDate();
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.fromDateFields(date42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDate localDate45 = localDate43.minus(readablePeriod44);
        org.joda.time.LocalDate.Property property46 = localDate45.dayOfWeek();
        org.joda.time.LocalDate localDate48 = localDate45.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((java.lang.Object) localDate48);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 0);
        java.util.Date date52 = localDate51.toDate();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate56 = localDate54.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology57 = localDate54.getChronology();
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((java.lang.Object) date52, chronology57);
        java.util.Date date59 = localDate58.toDate();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate(chronology60);
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((long) 0);
        org.joda.time.LocalDate localDate65 = localDate63.withYearOfEra((int) (byte) 1);
        org.joda.time.LocalDate localDate67 = localDate65.minusWeeks((-1));
        boolean boolean68 = localDate61.isEqual((org.joda.time.ReadablePartial) localDate65);
        org.joda.time.LocalDate localDate70 = localDate65.withYear((int) (short) 0);
        org.joda.time.LocalDate.Property property71 = localDate65.year();
        org.joda.time.LocalDate localDate73 = property71.setCopy((int) 'a');
        org.joda.time.LocalDate localDate75 = property71.addToCopy(48);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = localDate75.getFieldType(1);
        org.joda.time.LocalDate.Property property78 = localDate58.property(dateTimeFieldType77);
        org.joda.time.LocalDate localDate80 = localDate48.withField(dateTimeFieldType77, (int) (byte) 1);
        int int81 = localDate36.get(dateTimeFieldType77);
        int int82 = localDate10.indexOf(dateTimeFieldType77);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Thursday" + "'", str29, "Thursday");
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(localDate73);
        org.junit.Assert.assertNotNull(localDate75);
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
    }
}

