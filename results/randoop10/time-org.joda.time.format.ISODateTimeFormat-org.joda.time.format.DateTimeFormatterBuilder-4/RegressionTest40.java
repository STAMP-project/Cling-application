import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest40 {

    public static boolean debug = false;

    @Test
    public void test20001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20001");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.timeParser();
        boolean boolean2 = localDate0.equals((java.lang.Object) dateTimeFormatter1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter1.getZone();
        boolean boolean4 = dateTimeFormatter1.isParser();
        org.joda.time.DateTime dateTime6 = dateTimeFormatter1.parseDateTime("11");
        org.joda.time.DateTime dateTime8 = dateTime6.minusHours((-292275055));
        org.joda.time.DateTime dateTime10 = dateTime8.withMillisOfDay(41897369);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfMonth();
        int int12 = dateTime10.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 353 + "'", int12 == 353);
    }

    @Test
    public void test20002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20002");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        int int4 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone6);
        mutableDateTime7.setTime((long) (short) -1);
        int int10 = mutableDateTime7.getMinuteOfHour();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = mutableDateTime7.toDateTime(chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfSecond();
        boolean boolean14 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateMidnight dateMidnight15 = dateTime12.toDateMidnight();
        int int16 = dateTime12.getMonthOfYear();
        org.joda.time.DateTime.Property property17 = dateTime12.millisOfDay();
        java.lang.String str18 = dateTime12.toString();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        boolean boolean21 = localDateTime19.equals((java.lang.Object) 100L);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withYearOfCentury((int) (short) 0);
        int int24 = localDateTime23.getDayOfWeek();
        int int25 = localDateTime23.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.minusWeeks(9);
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime29 = dateTime12.withFields((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withPeriodAdded(readablePeriod30, 41676888);
        int int33 = localDateTime32.getYear();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.plusHours(86399994);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-05T23:59:59.999+100:10" + "'", str18, "1970-01-05T23:59:59.999+100:10");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 57 + "'", int25 == 57);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1999 + "'", int33 == 1999);
        org.junit.Assert.assertNotNull(localDateTime35);
    }

    @Test
    public void test20003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20003");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        boolean boolean3 = localDateTime1.equals((java.lang.Object) 100L);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusYears(1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withYear(41668248);
        int int10 = localDateTime9.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(41668248);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDateTime9.toDateTime(dateTimeZone13);
        boolean boolean17 = dateTimeZone13.isStandardOffset((long) 41685100);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 417830, dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42264522 + "'", int10 == 42264522);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test20004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20004");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        mutableDateTime2.setTime((long) (short) -1);
        int int5 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTime(chronology6);
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime7.withMillis((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.minus(readablePeriod11);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(41799355);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.monthOfYear();
        int int20 = mutableDateTime18.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone22);
        mutableDateTime23.setTime((long) (short) -1);
        int int26 = mutableDateTime23.getMinuteOfHour();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = mutableDateTime23.toDateTime(chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.millisOfSecond();
        boolean boolean30 = mutableDateTime18.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime18.millisOfDay();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale35 = new java.util.Locale("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology33, locale35, (java.lang.Integer) (-1));
        java.util.Locale locale38 = dateTimeParserBucket37.getLocale();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap44 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendTimeZoneShortName(strMap44);
        boolean boolean46 = dateTimeZone42.equals((java.lang.Object) strMap44);
        boolean boolean48 = dateTimeZone42.isStandardOffset((long) (byte) -1);
        long long51 = dateTimeZone42.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str52 = dateTimeZone42.getID();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone42);
        org.joda.time.LocalDate.Property property54 = localDate53.dayOfWeek();
        org.joda.time.LocalDate localDate56 = property54.addWrapFieldToCopy(5);
        boolean boolean57 = dateTimeParserBucket37.restoreState((java.lang.Object) localDate56);
        org.joda.time.Chronology chronology58 = dateTimeParserBucket37.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.millisOfSecond();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap66 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder65.appendTimeZoneShortName(strMap66);
        boolean boolean68 = dateTimeZone64.equals((java.lang.Object) strMap66);
        boolean boolean70 = dateTimeZone64.isStandardOffset((long) (byte) -1);
        long long73 = dateTimeZone64.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str74 = dateTimeZone64.getID();
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone64);
        org.joda.time.LocalDate.Property property76 = localDate75.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight77 = localDate75.toDateMidnight();
        java.lang.String str78 = dateTimeFormatter60.print((org.joda.time.ReadablePartial) localDate75);
        long long80 = chronology58.set((org.joda.time.ReadablePartial) localDate75, 1L);
        org.joda.time.DateTimeZone dateTimeZone81 = chronology58.getZone();
        java.lang.String str82 = dateTimeZone81.getID();
        mutableDateTime18.setZoneRetainFields(dateTimeZone81);
        org.joda.time.DateTime dateTime84 = dateTime13.withZoneRetainFields(dateTimeZone81);
        org.joda.time.DateTime dateTime86 = dateTime84.minus((long) 41708593);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 59 + "'", int26 == 59);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-360599990L) + "'", long51 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+100:10" + "'", str52, "+100:10");
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-360599990L) + "'", long73 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "+100:10" + "'", str74, "+100:10");
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(dateMidnight77);
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str78, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 345600001L + "'", long80 == 345600001L);
        org.junit.Assert.assertNotNull(dateTimeZone81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "UTC" + "'", str82, "UTC");
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime86);
    }

    @Test
    public void test20005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20005");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder0.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendTwoDigitYear((int) (byte) -1, true);
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatterBuilder4.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder4.appendDayOfWeek(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder4.appendYearOfCentury(41676888, (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneShortName(strMap13);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatterBuilder14.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder16.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder16.appendTwoDigitYear((int) (byte) -1, true);
        org.joda.time.format.DateTimeParser dateTimeParser21 = dateTimeFormatterBuilder20.toParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder11.append(dateTimeParser21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder24.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder24.appendTwoDigitYear((int) (byte) -1, true);
        org.joda.time.format.DateTimeParser dateTimeParser29 = dateTimeFormatterBuilder24.toParser();
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale34 = new java.util.Locale("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology32, locale34, (java.lang.Integer) (-1));
        java.util.Locale locale37 = dateTimeParserBucket36.getLocale();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap43 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder42.appendTimeZoneShortName(strMap43);
        boolean boolean45 = dateTimeZone41.equals((java.lang.Object) strMap43);
        boolean boolean47 = dateTimeZone41.isStandardOffset((long) (byte) -1);
        long long50 = dateTimeZone41.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str51 = dateTimeZone41.getID();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone41);
        org.joda.time.LocalDate.Property property53 = localDate52.dayOfWeek();
        org.joda.time.LocalDate localDate55 = property53.addWrapFieldToCopy(5);
        boolean boolean56 = dateTimeParserBucket36.restoreState((java.lang.Object) localDate55);
        org.joda.time.Chronology chronology57 = dateTimeParserBucket36.getChronology();
        java.util.Locale locale59 = new java.util.Locale("hi!");
        java.util.Locale locale60 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str61 = locale59.getDisplayVariant(locale60);
        java.util.Set<java.lang.String> strSet62 = locale59.getUnicodeLocaleAttributes();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) 41667572, chronology57, locale59, (java.lang.Integer) 41669344);
        int int67 = dateTimeParser29.parseInto(dateTimeParserBucket64, "v. Chr.", 41668248);
        java.util.Locale locale68 = dateTimeParserBucket64.getLocale();
        long long70 = dateTimeParserBucket64.computeMillis(true);
        int int73 = dateTimeParser21.parseInto(dateTimeParserBucket64, "20220222T072504.636Z", 41693589);
        org.joda.time.Chronology chronology74 = dateTimeParserBucket64.getChronology();
        java.lang.Object obj75 = dateTimeParserBucket64.saveState();
        int int76 = dateTimeParserBucket64.getOffset();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimePrinter15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeParser21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeParser29);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-360599990L) + "'", long50 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+100:10" + "'", str51, "+100:10");
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-41668249) + "'", int67 == (-41668249));
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 41667572L + "'", long70 == 41667572L);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-41693590) + "'", int73 == (-41693590));
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test20006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20006");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.equals((java.lang.Object) 100L);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDayOfMonth((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusYears(1);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMillisOfSecond(2);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(0L, dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.withDayOfYear(4);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime8.plusWeeks(41716431);
        org.joda.time.LocalDateTime.Property property21 = localDateTime8.hourOfDay();
        int int22 = property21.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime23 = property21.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test20007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20007");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2023-02-01T11:39:41.878");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test20008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20008");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology2, locale4, (java.lang.Integer) (-1));
        java.util.Locale locale7 = dateTimeParserBucket6.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneShortName(strMap13);
        boolean boolean15 = dateTimeZone11.equals((java.lang.Object) strMap13);
        boolean boolean17 = dateTimeZone11.isStandardOffset((long) (byte) -1);
        long long20 = dateTimeZone11.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str21 = dateTimeZone11.getID();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone11);
        org.joda.time.LocalDate.Property property23 = localDate22.dayOfWeek();
        org.joda.time.LocalDate localDate25 = property23.addWrapFieldToCopy(5);
        boolean boolean26 = dateTimeParserBucket6.restoreState((java.lang.Object) localDate25);
        org.joda.time.Chronology chronology27 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((-124334712599990L), chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.dayOfWeek();
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.now(chronology27);
        org.joda.time.DurationField durationField31 = chronology27.minutes();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology27.add(readablePeriod32, (long) 250, 41678021);
        org.joda.time.DurationField durationField36 = chronology27.months();
        org.joda.time.DurationField durationField37 = chronology27.centuries();
        org.joda.time.DateTimeZone dateTimeZone38 = chronology27.getZone();
        org.joda.time.DateTimeField dateTimeField39 = chronology27.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long47 = chronology27.getDateTimeMillis(41762822, 41731426, 41962543, 42225319, 42251535, 41933254, 42257780);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42225319 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-360599990L) + "'", long20 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+100:10" + "'", str21, "+100:10");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 250L + "'", long35 == 250L);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeField39);
    }

    @Test
    public void test20009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20009");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        boolean boolean8 = dateTimeZone4.equals((java.lang.Object) strMap6);
        boolean boolean10 = dateTimeZone4.isStandardOffset((long) (byte) -1);
        long long13 = dateTimeZone4.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str14 = dateTimeZone4.getID();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone4);
        int int16 = localDate15.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property18 = localDate15.property(dateTimeFieldType17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType17.getField(chronology19);
        java.util.Locale locale21 = java.util.Locale.getDefault();
        int int22 = dateTimeField20.getMaximumShortTextLength(locale21);
        long long25 = dateTimeField20.addWrapField((long) (byte) 100, 4);
        java.util.Locale locale27 = new java.util.Locale("hi!");
        java.util.Locale locale28 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str29 = locale27.getDisplayVariant(locale28);
        java.util.Locale locale30 = java.util.Locale.GERMANY;
        java.lang.String str31 = locale27.getDisplayLanguage(locale30);
        int int32 = dateTimeField20.getMaximumShortTextLength(locale30);
        java.util.Locale.setDefault(category0, locale30);
        java.lang.String str34 = locale30.getDisplayName();
        java.lang.String str35 = locale30.getISO3Country();
        java.lang.Object obj36 = locale30.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-360599990L) + "'", long13 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+100:10" + "'", str14, "+100:10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "-3470680-03-05t15:44_AP. J.-C.");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertEquals(locale27.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 7 + "'", int32 == 7);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "German (Germany)" + "'", str34, "German (Germany)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "DEU" + "'", str35, "DEU");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "de_DE");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "de_DE");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "de_DE");
    }

    @Test
    public void test20010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20010");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        long long4 = mutableDateTime2.getMillis();
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        int int6 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test20011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20011");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        long long4 = mutableDateTime2.getMillis();
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime2.add(readableDuration5);
        mutableDateTime2.addDays(9);
        java.lang.String str9 = mutableDateTime2.toString();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime2.add(readablePeriod10, 41669662);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap18 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendTimeZoneShortName(strMap18);
        boolean boolean20 = dateTimeZone16.equals((java.lang.Object) strMap18);
        boolean boolean22 = dateTimeZone16.isStandardOffset((long) (byte) -1);
        long long25 = dateTimeZone16.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str26 = dateTimeZone16.getID();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone16);
        org.joda.time.LocalDate localDate29 = localDate27.minusDays(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap36 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendTimeZoneShortName(strMap36);
        boolean boolean38 = dateTimeZone34.equals((java.lang.Object) strMap36);
        boolean boolean40 = dateTimeZone34.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter31.withZone(dateTimeZone34);
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now(dateTimeZone34);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) (-41668249), dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight44 = localDate27.toDateMidnight(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime2.toMutableDateTime(dateTimeZone34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = org.joda.time.format.ISODateTimeFormat.basicDateTime();
        boolean boolean47 = dateTimeFormatter46.isParser();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 0);
        java.util.TimeZone timeZone51 = dateTimeZone50.toTimeZone();
        boolean boolean52 = timeZone51.observesDaylightTime();
        java.lang.String str53 = timeZone51.getID();
        int int55 = timeZone51.getOffset(10L);
        timeZone51.setRawOffset(41674272);
        boolean boolean58 = timeZone51.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter46.withZone(dateTimeZone59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter60.withDefaultYear(41678148);
        int int63 = dateTimeFormatter62.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone65);
        mutableDateTime66.setTime((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone70);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime71.yearOfCentury();
        mutableDateTime71.addDays((int) (short) -1);
        int int75 = mutableDateTime71.getYear();
        boolean boolean76 = mutableDateTime66.isEqual((org.joda.time.ReadableInstant) mutableDateTime71);
        org.joda.time.MutableDateTime mutableDateTime77 = mutableDateTime66.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone80);
        mutableDateTime77.setZone(dateTimeZone80);
        boolean boolean84 = dateTimeZone80.isStandardOffset(50L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter62.withZone(dateTimeZone80);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter87 = dateTimeFormatter62.withPivotYear(42041587);
        java.lang.String str88 = mutableDateTime2.toString(dateTimeFormatter87);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-14T04:10:00.001+100:10" + "'", str9, "1970-01-14T04:10:00.001+100:10");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-360599990L) + "'", long25 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+100:10" + "'", str26, "+100:10");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "UTC" + "'", str53, "UTC");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 41678148 + "'", int63 == 41678148);
        org.junit.Assert.assertNotNull(property72);
// flaky:         org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1970 + "'", int75 == 1970);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(mutableDateTime77);
        org.junit.Assert.assertNotNull(dateTimeZone80);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter85);
        org.junit.Assert.assertNotNull(dateTimeFormatter87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "19700110T000000.001Z" + "'", str88, "19700110T000000.001Z");
    }

    @Test
    public void test20012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20012");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology2);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.LocalTime.Property property5 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        org.joda.time.LocalTime localTime8 = property5.addWrapFieldToCopy((int) (byte) 1);
        java.lang.String str9 = property5.getAsShortText();
        org.joda.time.LocalTime localTime10 = property5.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property11 = localTime10.millisOfSecond();
        java.lang.String str12 = property11.toString();
        org.joda.time.LocalTime localTime13 = property11.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test20013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20013");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology2);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.LocalTime.Property property5 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalTime localTime7 = property5.roundHalfEvenCopy();
        int int8 = property5.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField9 = property5.getField();
        org.joda.time.DateTimeField dateTimeField10 = property5.getField();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder15 = builder12.clear();
        java.util.Locale.Builder builder16 = builder15.clear();
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale locale18 = builder17.build();
        java.lang.String str19 = dateTimeField10.getAsShortText(41800040, locale18);
        java.lang.String str20 = locale18.getDisplayLanguage();
        java.lang.String str21 = locale18.toLanguageTag();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 86399999 + "'", int8 == 86399999);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "41800040" + "'", str19, "41800040");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "und" + "'", str21, "und");
    }

    @Test
    public void test20014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20014");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 41810963);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTime();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test20015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20015");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        mutableDateTime2.setTime((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.yearOfCentury();
        mutableDateTime7.addDays((int) (short) -1);
        int int11 = mutableDateTime7.getYear();
        boolean boolean12 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        mutableDateTime13.setZone(dateTimeZone16);
        boolean boolean20 = dateTimeZone16.isStandardOffset(50L);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        int int22 = localDateTime21.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plusMonths((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withWeekyear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withCenturyOfEra(59);
        boolean boolean29 = dateTimeZone16.isLocalDateTimeGap(localDateTime28);
        java.lang.String str31 = dateTimeZone16.getShortName((long) (short) 0);
        long long33 = dateTimeZone16.nextTransition((long) 41799369);
        java.lang.String str34 = dateTimeZone16.getID();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = org.joda.time.format.ISODateTimeFormat.basicDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter35.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.add((int) (short) 0);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.monthOfYear();
        mutableDateTime42.setMillis((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime46.year();
        mutableDateTime46.setWeekOfWeekyear((int) (short) 1);
        mutableDateTime46.add((long) 41668248);
        mutableDateTime46.addMinutes(41668650);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now();
        boolean boolean58 = localDateTime56.equals((java.lang.Object) 100L);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.withDayOfMonth((int) (byte) 1);
        int int61 = localDateTime56.size();
        org.joda.time.LocalDateTime.Property property62 = localDateTime56.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone64);
        mutableDateTime65.setTime((long) (short) -1);
        int int68 = mutableDateTime65.getMinuteOfHour();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = mutableDateTime65.toDateTime(chronology69);
        org.joda.time.DateTime dateTime71 = dateTime70.toDateTimeISO();
        org.joda.time.DateTime dateTime73 = dateTime70.withMillis((long) (short) 10);
        org.joda.time.DateTime dateTime74 = dateTime73.toDateTime();
        java.lang.String str75 = dateTime74.toString();
        org.joda.time.DateTime dateTime77 = dateTime74.withCenturyOfEra(0);
        org.joda.time.DateTime dateTime79 = dateTime77.plusDays(1801);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.DateTime dateTime81 = dateTime79.plus(readablePeriod80);
        int int82 = dateTime81.getWeekOfWeekyear();
        int int83 = property62.getDifference((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime dateTime85 = dateTime81.minusSeconds((int) (short) 1);
        boolean boolean86 = mutableDateTime46.isBefore((org.joda.time.ReadableInstant) dateTime81);
        java.lang.String str87 = dateTimeFormatter35.print((org.joda.time.ReadableInstant) mutableDateTime46);
        int int88 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) mutableDateTime46);
        mutableDateTime46.addWeeks((-576));
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 42264731 + "'", int22 == 42264731);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+100:10" + "'", str31, "+100:10");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 41799369L + "'", long33 == 41799369L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+100:10" + "'", str34, "+100:10");
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4 + "'", int61 == 4);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 59 + "'", int68 == 59);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "1970-01-05T04:10:00.010+100:10" + "'", str75, "1970-01-05T04:10:00.010+100:10");
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 50 + "'", int82 == 50);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 101601 + "'", int83 == 101601);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "20490321T051428.249+10010" + "'", str87, "20490321T051428.249+10010");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 360600000 + "'", int88 == 360600000);
    }

    @Test
    public void test20016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20016");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone5);
        mutableDateTime6.setTime((long) (short) -1);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList17);
        boolean boolean21 = strList19.equals((java.lang.Object) (-1));
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList27);
        boolean boolean31 = strList29.equals((java.lang.Object) (-1));
        boolean boolean32 = strList19.retainAll((java.util.Collection<java.lang.String>) strList29);
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList29);
        java.util.stream.Stream<java.lang.String> strStream34 = strList29.stream();
        boolean boolean35 = mutableDateTime6.equals((java.lang.Object) strStream34);
        boolean boolean36 = property3.equals((java.lang.Object) strStream34);
        int int37 = property3.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime38 = property3.roundHalfEven();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.centuryOfEra();
        mutableDateTime38.setMillisOfDay(41674142);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter42.withDefaultYear(41668650);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.monthOfYear();
        long long49 = mutableDateTime47.getMillis();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime47.secondOfMinute();
        int int53 = dateTimeFormatter44.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime47, "\u5354\u5b9a\u4e16\u754c\u6642", 41681866);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap59 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder58.appendTimeZoneShortName(strMap59);
        boolean boolean61 = dateTimeZone57.equals((java.lang.Object) strMap59);
        boolean boolean63 = dateTimeZone57.isStandardOffset((long) (byte) -1);
        long long66 = dateTimeZone57.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str67 = dateTimeZone57.getID();
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone57);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(dateTimeZone57);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(dateTimeZone57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter44.withZone(dateTimeZone57);
        org.joda.time.Chronology chronology72 = dateTimeFormatter71.getChronology();
        org.joda.time.DateTimeZone dateTimeZone73 = dateTimeFormatter71.getZone();
        java.util.TimeZone timeZone75 = java.util.TimeZone.getTimeZone("");
        int int77 = timeZone75.getOffset((long) 41674683);
        timeZone75.setRawOffset(18);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forTimeZone(timeZone75);
        int int82 = dateTimeZone80.getOffset((long) 41695085);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter71.withZone(dateTimeZone80);
        mutableDateTime38.setZone(dateTimeZone80);
        org.joda.time.LocalDate localDate85 = org.joda.time.LocalDate.now(dateTimeZone80);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 99 + "'", int37 == 99);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-41681867) + "'", int53 == (-41681867));
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-360599990L) + "'", long66 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+100:10" + "'", str67, "+100:10");
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertNull(chronology72);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(timeZone75);
        org.junit.Assert.assertEquals(timeZone75.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter83);
        org.junit.Assert.assertNotNull(localDate85);
    }

    @Test
    public void test20017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20017");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withDefaultYear(41668650);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 42016990);
        boolean boolean6 = dateTimeFormatter2.isParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41668650 + "'", int3 == 41668650);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20018");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology2);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.LocalTime.Property property5 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime7 = localTime3.plusSeconds((int) (short) 0);
        org.joda.time.LocalTime localTime9 = localTime3.minusSeconds(10);
        org.joda.time.LocalTime localTime11 = localTime3.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds(41667572);
        org.joda.time.LocalTime localTime15 = localTime13.minusSeconds(41673863);
        org.joda.time.LocalTime localTime17 = localTime15.withMillisOfDay(41674043);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap24 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendTimeZoneShortName(strMap24);
        boolean boolean26 = dateTimeZone22.equals((java.lang.Object) strMap24);
        boolean boolean28 = dateTimeZone22.isStandardOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter19.withZone(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone31);
        mutableDateTime32.setTime((long) (short) -1);
        mutableDateTime32.setMillis((-360599999L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        java.lang.String str38 = mutableDateTime32.toString(dateTimeFormatter37);
        mutableDateTime32.addWeekyears(41669563);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.monthOfYear();
        java.util.Locale locale45 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str46 = locale45.getISO3Language();
        int int47 = property44.getMaximumShortTextLength(locale45);
        java.util.Calendar calendar48 = mutableDateTime32.toCalendar(locale45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter19.withLocale(locale45);
        java.lang.String str50 = localTime17.toString("1969-03-06", locale45);
        org.joda.time.DateTime dateTime51 = localTime17.toDateTimeToday();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19" + "'", str38, "19");
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "fra" + "'", str46, "fra");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertNotNull(calendar48);
        org.junit.Assert.assertEquals(calendar48.toString(), "java.util.GregorianCalendar[time=1314964399434600001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+100:10,offset=360600000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=41671533,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=5,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=360600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1969-03-06" + "'", str50, "1969-03-06");
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    public void test20019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20019");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.monthOfYear();
        int int5 = mutableDateTime3.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone7);
        mutableDateTime8.setTime((long) (short) -1);
        int int11 = mutableDateTime8.getMinuteOfHour();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = mutableDateTime8.toDateTime(chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfSecond();
        boolean boolean15 = mutableDateTime3.isBefore((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateMidnight dateMidnight16 = dateTime13.toDateMidnight();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.minus(readablePeriod17);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((long) ' ', (-35));
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.plus(readableDuration22);
        boolean boolean24 = strSet0.equals((java.lang.Object) readableDuration22);
        boolean boolean25 = strSet0.isEmpty();
        java.util.Locale locale27 = new java.util.Locale("hi!");
        java.util.Locale locale28 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str29 = locale27.getDisplayVariant(locale28);
        java.util.Set<java.lang.String> strSet30 = locale27.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList36);
        java.lang.String[] strArray41 = new java.lang.String[] { "fra", "" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList49);
        boolean boolean53 = strList51.equals((java.lang.Object) (-1));
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.lang.String>) strList59);
        boolean boolean63 = strList61.equals((java.lang.Object) (-1));
        boolean boolean64 = strList51.retainAll((java.util.Collection<java.lang.String>) strList61);
        boolean boolean65 = strSet42.retainAll((java.util.Collection<java.lang.String>) strList51);
        boolean boolean66 = strList36.retainAll((java.util.Collection<java.lang.String>) strSet42);
        int int67 = strList36.size();
        boolean boolean68 = strSet30.containsAll((java.util.Collection<java.lang.String>) strList36);
        java.util.Set<java.lang.String> strSet69 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean70 = strSet30.retainAll((java.util.Collection<java.lang.String>) strSet69);
        int int71 = strSet69.size();
        boolean boolean72 = strSet0.removeAll((java.util.Collection<java.lang.String>) strSet69);
        java.util.stream.Stream<java.lang.String> strStream73 = strSet69.parallelStream();
        java.lang.Object[] objArray74 = strSet69.toArray();
        boolean boolean75 = strSet69.isEmpty();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals(locale27.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 575 + "'", int71 == 575);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strStream73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test20020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20020");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusMonths((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withWeekyear((int) (short) 100);
        int int6 = localDateTime0.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.withWeekyear(41670120);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMonths(41696618);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekyear((-41687135));
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusWeeks(694);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusMinutes(91);
        int int19 = localDateTime14.getWeekyear();
        org.junit.Assert.assertNotNull(localDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42264861 + "'", int1 == 42264861);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-41687135) + "'", int19 == (-41687135));
    }

    @Test
    public void test20021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20021");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology2);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.LocalTime.Property property5 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = property5.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property5.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField9 = property5.getField();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test20022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20022");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate14.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        int int21 = dateTimeField19.getMaximumShortTextLength(locale20);
        long long24 = dateTimeField19.addWrapField((long) (byte) 100, 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = dateTimeField19.getType();
        int int26 = dateTimeField19.getMaximumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap33 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder32.appendTimeZoneShortName(strMap33);
        boolean boolean35 = dateTimeZone31.equals((java.lang.Object) strMap33);
        boolean boolean37 = dateTimeZone31.isStandardOffset((long) (byte) -1);
        long long40 = dateTimeZone31.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str41 = dateTimeZone31.getID();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone31);
        org.joda.time.LocalDate.Property property43 = localDate42.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight44 = localDate42.toDateMidnight();
        java.lang.String str45 = dateTimeFormatter27.print((org.joda.time.ReadablePartial) localDate42);
        org.joda.time.LocalDate localDate47 = localDate42.withDayOfMonth(20);
        org.joda.time.LocalDate localDate49 = localDate42.minusMonths(41677265);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDate localDate51 = localDate42.minus(readablePeriod50);
        org.joda.time.LocalDate.Property property52 = localDate51.era();
        java.util.Locale locale55 = new java.util.Locale("United States", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        boolean boolean56 = locale55.hasExtensions();
        java.lang.String str57 = dateTimeField19.getAsText((org.joda.time.ReadablePartial) localDate51, locale55);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap65 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder64.appendTimeZoneShortName(strMap65);
        boolean boolean67 = dateTimeZone63.equals((java.lang.Object) strMap65);
        boolean boolean69 = dateTimeZone63.isStandardOffset((long) (byte) -1);
        long long72 = dateTimeZone63.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str73 = dateTimeZone63.getID();
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone63);
        org.joda.time.LocalDate.Property property75 = localDate74.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight76 = localDate74.toDateMidnight();
        int int77 = dateMidnight76.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone78 = dateMidnight76.getZone();
        org.joda.time.MutableDateTime mutableDateTime79 = dateTime59.toMutableDateTime(dateTimeZone78);
        java.util.Locale locale80 = java.util.Locale.JAPAN;
        java.lang.String str81 = locale80.getDisplayVariant();
        java.util.Set<java.lang.String> strSet82 = locale80.getUnicodeLocaleAttributes();
        boolean boolean83 = dateTimeZone78.equals((java.lang.Object) locale80);
        java.lang.String str84 = locale55.getDisplayName(locale80);
        java.lang.String str85 = locale55.getDisplayLanguage();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "-3470680-03-05t15:44_AP. J.-C.");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-360599990L) + "'", long40 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+100:10" + "'", str41, "+100:10");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateMidnight44);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str45, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(property52);
// flaky:         org.junit.Assert.assertEquals(locale55.toString(), "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "AD" + "'", str57, "AD");
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-360599990L) + "'", long72 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "+100:10" + "'", str73, "+100:10");
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(dateMidnight76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone78);
        org.junit.Assert.assertNotNull(mutableDateTime79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000)" + "'", str84, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000)");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "united states" + "'", str85, "united states");
    }

    @Test
    public void test20023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20023");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        long long4 = mutableDateTime2.getMillis();
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.year();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        int int8 = localDateTime7.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.property(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime11 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfFloorCopy();
        int int14 = dateTimeField6.getMinimumValue((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMonths(41738059);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMillisOfDay(41892702);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.monthOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 42264903 + "'", int8 == 42264903);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-292275054) + "'", int14 == (-292275054));
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test20024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20024");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        mutableDateTime2.setTime((long) (short) -1);
        int int5 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTime(chronology6);
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime7.withMillis((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.minus(readablePeriod11);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTime();
        org.joda.time.DateTime.Property property14 = dateTime12.dayOfWeek();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        boolean boolean18 = localDateTime16.equals((java.lang.Object) 100L);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withYearOfCentury((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withEra((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minusMinutes(41667572);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        boolean boolean26 = durationFieldType15.isSupported(chronology25);
        org.joda.time.DurationField durationField27 = chronology25.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.hourOfHalfday();
        org.joda.time.DurationField durationField29 = chronology25.minutes();
        org.joda.time.DateTime dateTime30 = dateTime12.toDateTime(chronology25);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test20025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20025");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        mutableDateTime2.setTime((long) (short) -1);
        int int5 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTime(chronology6);
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime7.withMillis((long) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTime();
        java.lang.String str12 = dateTime11.toString();
        int int13 = dateTime11.getMinuteOfHour();
        org.joda.time.Chronology chronology14 = dateTime11.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate17 = localDate15.minusWeeks(41762633);
        org.joda.time.DateTime dateTime18 = localDate17.toDateTimeAtStartOfDay();
        int int19 = localDate17.getMonthOfYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-05T04:10:00.010+100:10" + "'", str12, "1970-01-05T04:10:00.010+100:10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test20026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20026");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        boolean boolean2 = localDateTime0.equals((java.lang.Object) 100L);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withYearOfCentury((int) (short) 0);
        int int5 = localDateTime4.getDayOfWeek();
        int int6 = localDateTime4.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusWeeks(9);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = property11.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.weekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.plusYears(41766475);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        int int18 = localDateTime16.getEra();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 57 + "'", int6 == 57);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test20027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20027");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) (-360599990L), chronology2);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.LocalTime localTime6 = localTime3.plusMinutes(8);
        org.joda.time.LocalTime.Property property7 = localTime3.millisOfSecond();
        org.joda.time.LocalTime localTime9 = localTime3.withMillisOfDay(41751);
        org.joda.time.LocalTime.Property property10 = localTime3.hourOfDay();
        org.joda.time.LocalTime localTime11 = property10.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.add((int) (short) 0);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.monthOfYear();
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) mutableDateTime21);
        mutableDateTime21.addSeconds((int) 'u');
        boolean boolean27 = mutableDateTime21.isBefore(4L);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime21.property(dateTimeFieldType28);
        java.lang.String str30 = dateTimeFieldType28.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = localTime11.get(dateTimeFieldType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "yearOfEra" + "'", str30, "yearOfEra");
    }

    @Test
    public void test20028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20028");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.property(dateTimeFieldType2);
        int int4 = localDateTime0.getWeekyear();
        int int5 = localDateTime0.size();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.withPeriodAdded(readablePeriod6, 86399999);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMillis(2000);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays(41770776);
        org.joda.time.Chronology chronology13 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.junit.Assert.assertNotNull(localDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42264959 + "'", int1 == 42264959);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test20029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20029");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder0.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendTwoDigitYear((int) (byte) -1, true);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatterBuilder0.toFormatter();
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 41847148);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology10, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology15.getZone();
        java.lang.String str18 = dateTimeZone16.getShortName((long) 41728754);
        int int20 = dateTimeZone16.getStandardOffset((long) 41800040);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter8.withZone(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test20030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20030");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.add((int) (short) 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.monthOfYear();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime10.addSeconds((int) 'u');
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime10.copy();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale21 = new java.util.Locale("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology19, locale21, (java.lang.Integer) (-1));
        java.util.Locale locale24 = dateTimeParserBucket23.getLocale();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap30 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendTimeZoneShortName(strMap30);
        boolean boolean32 = dateTimeZone28.equals((java.lang.Object) strMap30);
        boolean boolean34 = dateTimeZone28.isStandardOffset((long) (byte) -1);
        long long37 = dateTimeZone28.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str38 = dateTimeZone28.getID();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone28);
        org.joda.time.LocalDate.Property property40 = localDate39.dayOfWeek();
        org.joda.time.LocalDate localDate42 = property40.addWrapFieldToCopy(5);
        boolean boolean43 = dateTimeParserBucket23.restoreState((java.lang.Object) localDate42);
        org.joda.time.Chronology chronology44 = dateTimeParserBucket23.getChronology();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((-124334712599990L), chronology44);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap51 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder50.appendTimeZoneShortName(strMap51);
        boolean boolean53 = dateTimeZone49.equals((java.lang.Object) strMap51);
        boolean boolean55 = dateTimeZone49.isStandardOffset((long) (byte) -1);
        long long58 = dateTimeZone49.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str59 = dateTimeZone49.getID();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone49);
        int int61 = localDate60.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property63 = localDate60.property(dateTimeFieldType62);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTimeField dateTimeField65 = dateTimeFieldType62.getField(chronology64);
        java.util.Locale locale66 = java.util.Locale.getDefault();
        int int67 = dateTimeField65.getMaximumShortTextLength(locale66);
        java.util.Locale locale68 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str69 = locale68.getISO3Language();
        int int70 = dateTimeField65.getMaximumShortTextLength(locale68);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket((long) 365, chronology44, locale68);
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate((java.lang.Object) mutableDateTime10, chronology44);
        org.joda.time.DurationField durationField73 = chronology44.centuries();
        org.joda.time.DateTimeField dateTimeField74 = chronology44.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField75 = chronology44.clockhourOfHalfday();
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) 1969, chronology44);
        org.joda.time.DateTimeField dateTimeField77 = chronology44.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((java.lang.Object) chronology44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-360599990L) + "'", long37 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+100:10" + "'", str38, "+100:10");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-360599990L) + "'", long58 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+100:10" + "'", str59, "+100:10");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1970 + "'", int61 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(locale66);
// flaky:         org.junit.Assert.assertEquals(locale66.toString(), "-3470680-03-05t15:44_AP. J.-C.");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "fra" + "'", str69, "fra");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 9 + "'", int70 == 9);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(dateTimeField77);
    }

    @Test
    public void test20031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20031");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        int int15 = localDate14.getYearOfEra();
        int int16 = localDate14.getYear();
        org.joda.time.ReadablePartial readablePartial17 = null;
        org.joda.time.LocalDate localDate18 = localDate14.withFields(readablePartial17);
        org.joda.time.LocalDate localDate20 = localDate18.withCenturyOfEra(1);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate18.minus(readablePeriod21);
        org.joda.time.LocalDate.Property property23 = localDate18.monthOfYear();
        org.joda.time.DurationField durationField24 = property23.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField25 = property23.getField();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test20032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20032");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        boolean boolean7 = dateTimeZone3.equals((java.lang.Object) strMap5);
        boolean boolean9 = dateTimeZone3.isStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone3.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str13 = dateTimeZone3.getID();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone3);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now(dateTimeZone3);
        java.lang.String str20 = dateTimeZone3.getNameKey((long) (-1645514902));
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360599990L) + "'", long12 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:10" + "'", str13, "+100:10");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20033");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology2, locale4, (java.lang.Integer) (-1));
        java.util.Locale locale7 = dateTimeParserBucket6.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneShortName(strMap13);
        boolean boolean15 = dateTimeZone11.equals((java.lang.Object) strMap13);
        boolean boolean17 = dateTimeZone11.isStandardOffset((long) (byte) -1);
        long long20 = dateTimeZone11.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str21 = dateTimeZone11.getID();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone11);
        org.joda.time.LocalDate.Property property23 = localDate22.dayOfWeek();
        org.joda.time.LocalDate localDate25 = property23.addWrapFieldToCopy(5);
        boolean boolean26 = dateTimeParserBucket6.restoreState((java.lang.Object) localDate25);
        org.joda.time.Chronology chronology27 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.millisOfSecond();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap35 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendTimeZoneShortName(strMap35);
        boolean boolean37 = dateTimeZone33.equals((java.lang.Object) strMap35);
        boolean boolean39 = dateTimeZone33.isStandardOffset((long) (byte) -1);
        long long42 = dateTimeZone33.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str43 = dateTimeZone33.getID();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone33);
        org.joda.time.LocalDate.Property property45 = localDate44.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight46 = localDate44.toDateMidnight();
        java.lang.String str47 = dateTimeFormatter29.print((org.joda.time.ReadablePartial) localDate44);
        long long49 = chronology27.set((org.joda.time.ReadablePartial) localDate44, 1L);
        org.joda.time.DurationField durationField50 = chronology27.halfdays();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 100, chronology27);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap57 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder56.appendTimeZoneShortName(strMap57);
        boolean boolean59 = dateTimeZone55.equals((java.lang.Object) strMap57);
        boolean boolean61 = dateTimeZone55.isStandardOffset((long) (byte) -1);
        long long64 = dateTimeZone55.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str65 = dateTimeZone55.getID();
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone55);
        int int67 = localDate66.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property69 = localDate66.property(dateTimeFieldType68);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType68.getField(chronology70);
        java.util.Locale locale72 = java.util.Locale.getDefault();
        int int73 = dateTimeField71.getMaximumShortTextLength(locale72);
        long long75 = dateTimeField71.roundCeiling((long) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = dateTimeField71.getType();
        boolean boolean77 = localDate51.isSupported(dateTimeFieldType76);
        org.joda.time.LocalDate localDate79 = localDate51.withWeekyear(41685448);
        org.joda.time.LocalDate localDate81 = localDate79.withYearOfEra(41685321);
        org.joda.time.LocalDate localDate83 = localDate79.plusWeeks(42191360);
        org.joda.time.ReadablePeriod readablePeriod84 = null;
        org.joda.time.LocalDate localDate85 = localDate79.plus(readablePeriod84);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-360599990L) + "'", long20 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+100:10" + "'", str21, "+100:10");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-360599990L) + "'", long42 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+100:10" + "'", str43, "+100:10");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateMidnight46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str47, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 345600001L + "'", long49 == 345600001L);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-360599990L) + "'", long64 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+100:10" + "'", str65, "+100:10");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1970 + "'", int67 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(locale72);
// flaky:         org.junit.Assert.assertEquals(locale72.toString(), "-3470680-03-05t15:44_AP. J.-C.");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 9223372036494175807L + "'", long75 == 9223372036494175807L);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(localDate79);
        org.junit.Assert.assertNotNull(localDate81);
        org.junit.Assert.assertNotNull(localDate83);
        org.junit.Assert.assertNotNull(localDate85);
    }

    @Test
    public void test20034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20034");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder0.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendSecondOfMinute((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendTimeZoneShortName(strMap11);
        boolean boolean13 = dateTimeZone9.equals((java.lang.Object) strMap11);
        boolean boolean15 = dateTimeZone9.isStandardOffset((long) (byte) -1);
        long long18 = dateTimeZone9.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str19 = dateTimeZone9.getID();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone9);
        org.joda.time.LocalDate.Property property21 = localDate20.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight22 = localDate20.toDateMidnight();
        java.lang.String str23 = dateTimeFormatter5.print((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder24.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder24.appendSecondOfMinute((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder27.appendSignedDecimal(dateTimeFieldType28, (int) (byte) 10, (int) (short) 10);
        boolean boolean32 = localDate20.isSupported(dateTimeFieldType28);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder3.appendFixedSignedDecimal(dateTimeFieldType28, 6);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.add((int) (short) 0);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.monthOfYear();
        mutableDateTime40.setMillis((org.joda.time.ReadableInstant) mutableDateTime44);
        mutableDateTime44.addSeconds((int) 'u');
        boolean boolean50 = mutableDateTime44.isBefore(4L);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime44.property(dateTimeFieldType51);
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType51.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder3.appendFixedSignedDecimal(dateTimeFieldType51, 41682545);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder3.appendFractionOfDay(41718083, 41676656);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder3.appendLiteral('u');
        dateTimeFormatterBuilder60.clear();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-360599990L) + "'", long18 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+100:10" + "'", str19, "+100:10");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateMidnight22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
    }

    @Test
    public void test20035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20035");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.property(dateTimeFieldType2);
        int int4 = localDateTime0.getWeekyear();
        int int5 = localDateTime0.size();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.withPeriodAdded(readablePeriod6, 86399999);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMillis(2000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder11.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendSecondOfMinute((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendTimeZoneId();
        boolean boolean16 = localDateTime8.equals((java.lang.Object) dateTimeFormatterBuilder15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendMillisOfSecond(41777443);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder15.appendMonthOfYear(2015);
        boolean boolean21 = dateTimeFormatterBuilder20.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendSecondOfMinute(42126246);
        org.junit.Assert.assertNotNull(localDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42265056 + "'", int1 == 42265056);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test20036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20036");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes(6);
        org.joda.time.DateTime dateTime5 = dateTime1.plusYears(1969);
        org.joda.time.DateTime dateTime7 = dateTime5.minusYears(1970);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) 'x');
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        int int11 = localDateTime10.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean13 = localDateTime10.isSupported(dateTimeFieldType12);
        int int14 = dateTime9.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime16 = dateTime9.minusDays(50);
        long long17 = dateTime16.getMillis();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42265066 + "'", int11 == 42265066);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-58380193534934L) + "'", long17 == (-58380193534934L));
    }

    @Test
    public void test20037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20037");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.property(dateTimeFieldType2);
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        int int5 = property3.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.year();
        int int9 = localDateTime6.getDayOfYear();
        int int10 = localDateTime6.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusDays(41776784);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime6.plusYears(41721646);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 334000640 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42265075 + "'", int1 == 42265075);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 229 + "'", int9 == 229);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 17 + "'", int10 == 17);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test20038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20038");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        mutableDateTime2.setTime((long) (short) -1);
        int int5 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTime(chronology6);
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTimeISO();
        org.joda.time.LocalTime localTime9 = dateTime7.toLocalTime();
        org.joda.time.DateTime dateTime11 = dateTime7.withWeekyear((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.plusWeeks(9);
        org.joda.time.DateTime dateTime15 = dateTime13.plus((long) (byte) 1);
        org.joda.time.DateTime dateTime17 = dateTime15.withMillis((long) 41669662);
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.util.Calendar calendar19 = dateTime17.toCalendar(locale18);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromCalendarFields(calendar19);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromCalendarFields(calendar19);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromCalendarFields(calendar19);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime25 = localTime22.minus(readablePeriod24);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = localTime22.getValue(41933776);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 41933776");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=41669662,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+100:10,offset=360600000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=5,DAY_OF_YEAR=5,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=44,SECOND=29,MILLISECOND=662,ZONE_OFFSET=360600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test20039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20039");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((int) (short) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.monthOfYear();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime9.addSeconds((int) 'u');
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime9.copy();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale20 = new java.util.Locale("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology18, locale20, (java.lang.Integer) (-1));
        java.util.Locale locale23 = dateTimeParserBucket22.getLocale();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap29 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder28.appendTimeZoneShortName(strMap29);
        boolean boolean31 = dateTimeZone27.equals((java.lang.Object) strMap29);
        boolean boolean33 = dateTimeZone27.isStandardOffset((long) (byte) -1);
        long long36 = dateTimeZone27.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str37 = dateTimeZone27.getID();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone27);
        org.joda.time.LocalDate.Property property39 = localDate38.dayOfWeek();
        org.joda.time.LocalDate localDate41 = property39.addWrapFieldToCopy(5);
        boolean boolean42 = dateTimeParserBucket22.restoreState((java.lang.Object) localDate41);
        org.joda.time.Chronology chronology43 = dateTimeParserBucket22.getChronology();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((-124334712599990L), chronology43);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap50 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder49.appendTimeZoneShortName(strMap50);
        boolean boolean52 = dateTimeZone48.equals((java.lang.Object) strMap50);
        boolean boolean54 = dateTimeZone48.isStandardOffset((long) (byte) -1);
        long long57 = dateTimeZone48.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str58 = dateTimeZone48.getID();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone48);
        int int60 = localDate59.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property62 = localDate59.property(dateTimeFieldType61);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType61.getField(chronology63);
        java.util.Locale locale65 = java.util.Locale.getDefault();
        int int66 = dateTimeField64.getMaximumShortTextLength(locale65);
        java.util.Locale locale67 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str68 = locale67.getISO3Language();
        int int69 = dateTimeField64.getMaximumShortTextLength(locale67);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) 365, chronology43, locale67);
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate((java.lang.Object) mutableDateTime9, chronology43);
        org.joda.time.DateTime dateTime72 = org.joda.time.DateTime.now(chronology43);
        org.joda.time.DateTimeField dateTimeField73 = chronology43.dayOfMonth();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-360599990L) + "'", long36 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+100:10" + "'", str37, "+100:10");
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-360599990L) + "'", long57 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+100:10" + "'", str58, "+100:10");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1970 + "'", int60 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "-3470680-03-05t15:44_AP. J.-C.");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "fra" + "'", str68, "fra");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 9 + "'", int69 == 9);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTimeField73);
    }

    @Test
    public void test20040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20040");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.monthOfYear();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getISO3Language();
        int int7 = property4.getMaximumShortTextLength(locale5);
        java.lang.String str8 = property4.getName();
        boolean boolean9 = strSet0.equals((java.lang.Object) str8);
        int int10 = strSet0.size();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMonths((int) (short) 0);
        int int14 = localDateTime11.size();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withMillisOfDay(41669101);
        boolean boolean17 = strSet0.equals((java.lang.Object) localDateTime11);
        java.util.Locale locale19 = new java.util.Locale("hi!");
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.util.Set<java.lang.String> strSet22 = locale19.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList28);
        java.lang.String[] strArray33 = new java.lang.String[] { "fra", "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList41);
        boolean boolean45 = strList43.equals((java.lang.Object) (-1));
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList51);
        boolean boolean55 = strList53.equals((java.lang.Object) (-1));
        boolean boolean56 = strList43.retainAll((java.util.Collection<java.lang.String>) strList53);
        boolean boolean57 = strSet34.retainAll((java.util.Collection<java.lang.String>) strList43);
        boolean boolean58 = strList28.retainAll((java.util.Collection<java.lang.String>) strSet34);
        int int59 = strList28.size();
        boolean boolean60 = strSet22.containsAll((java.util.Collection<java.lang.String>) strList28);
        boolean boolean61 = strSet0.addAll((java.util.Collection<java.lang.String>) strList28);
        int int62 = strSet0.size();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra" + "'", str6, "fra");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "monthOfYear" + "'", str8, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals(locale19.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test20041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20041");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology2, locale4, (java.lang.Integer) (-1));
        java.util.Locale locale7 = dateTimeParserBucket6.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneShortName(strMap13);
        boolean boolean15 = dateTimeZone11.equals((java.lang.Object) strMap13);
        boolean boolean17 = dateTimeZone11.isStandardOffset((long) (byte) -1);
        long long20 = dateTimeZone11.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str21 = dateTimeZone11.getID();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone11);
        org.joda.time.LocalDate.Property property23 = localDate22.dayOfWeek();
        org.joda.time.LocalDate localDate25 = property23.addWrapFieldToCopy(5);
        boolean boolean26 = dateTimeParserBucket6.restoreState((java.lang.Object) localDate25);
        org.joda.time.Chronology chronology27 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.millisOfSecond();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap35 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendTimeZoneShortName(strMap35);
        boolean boolean37 = dateTimeZone33.equals((java.lang.Object) strMap35);
        boolean boolean39 = dateTimeZone33.isStandardOffset((long) (byte) -1);
        long long42 = dateTimeZone33.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str43 = dateTimeZone33.getID();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (byte) -1, dateTimeZone33);
        org.joda.time.LocalDate.Property property45 = localDate44.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight46 = localDate44.toDateMidnight();
        java.lang.String str47 = dateTimeFormatter29.print((org.joda.time.ReadablePartial) localDate44);
        long long49 = chronology27.set((org.joda.time.ReadablePartial) localDate44, 1L);
        org.joda.time.DateTimeZone dateTimeZone50 = chronology27.getZone();
        org.joda.time.DateTime dateTime51 = localDate0.toDateTimeAtMidnight(dateTimeZone50);
        int int52 = dateTime51.getSecondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.DateTime dateTime54 = dateTime51.plus(readablePeriod53);
        int int55 = dateTime51.getMillisOfSecond();
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-360599990L) + "'", long20 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+100:10" + "'", str21, "+100:10");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-360599990L) + "'", long42 == (-360599990L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+100:10" + "'", str43, "+100:10");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateMidnight46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str47, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 345600001L + "'", long49 == 345600001L);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test20042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20042");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) 1L, dateTimeZone1);
        mutableDateTime2.setTime((long) (short) -1);
        int int5 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTime(chronology6);
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime7.withMillis((long) (short) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.withMillisOfSecond(20);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime10.toDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMonths((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withFieldAdded(durationFieldType20, (int) (short) -1);
        boolean boolean23 = dateTimeZone15.isLocalDateTimeGap(localDateTime22);
        java.lang.String str24 = dateTimeZone15.toString();
        java.lang.String str26 = dateTimeZone15.getNameKey((long) 41734059);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+100:10" + "'", str24, "+100:10");
        org.junit.Assert.assertNull(str26);
    }
}
