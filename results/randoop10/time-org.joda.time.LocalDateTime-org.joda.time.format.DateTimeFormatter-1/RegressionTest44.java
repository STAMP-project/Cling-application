import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest44 {

    public static boolean debug = false;

    @Test
    public void test22001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22001");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter4.getParser();
        java.lang.Integer int6 = dateTimeFormatter4.getPivotYear();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.MIDNIGHT;
        int int10 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime9);
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withPeriodAdded(readablePeriod15, (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology19 = dateTime12.getChronology();
        java.lang.String str20 = chronology19.toString();
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withPeriodAdded(readablePeriod25, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime22.getZone();
        long long31 = dateTimeZone28.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.Chronology chronology33 = chronology19.withZone(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime35.setWeekyear(3);
        java.lang.Object obj38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(obj38);
        org.joda.time.DateTime dateTime41 = dateTime39.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime44 = dateTime39.withPeriodAdded(readablePeriod42, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTime39.getZone();
        mutableDateTime35.setZoneRetainFields(dateTimeZone45);
        java.lang.String str48 = dateTimeZone45.getNameKey(1646041808949L);
        boolean boolean49 = dateTimeZone45.isFixed();
        org.joda.time.Chronology chronology50 = chronology33.withZone(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) '4', dateTimeZone52);
        int int56 = dateTimeZone52.getOffsetFromLocal((long) 32769);
        org.joda.time.Chronology chronology57 = chronology33.withZone(dateTimeZone52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter4.withChronology(chronology57);
        java.lang.Appendable appendable59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable59, readableInstant60);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeParser5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ISOChronology[+410:00]" + "'", str20, "ISOChronology[+410:00]");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1475999989L) + "'", long31 == (-1475999989L));
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
// flaky:         org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTime53);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1476000000 + "'", int56 == 1476000000);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
    }

    @Test
    public void test22002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22002");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.year();
        int int17 = mutableDateTime1.getYear();
        org.joda.time.DateTime dateTime18 = mutableDateTime1.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime20.setWeekyear(3);
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfMonth();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        mutableDateTime20.setMillis((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime20.minuteOfHour();
        mutableDateTime20.add((long) 317);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        int int33 = mutableDateTime32.getYear();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime32.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        java.lang.String str37 = mutableDateTime36.toString();
        mutableDateTime32.setDate((org.joda.time.ReadableInstant) mutableDateTime36);
        long long39 = mutableDateTime32.getMillis();
        int int40 = mutableDateTime32.getRoundingMode();
        long long41 = mutableDateTime32.getMillis();
        java.util.Date date47 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate48 = org.joda.time.LocalDate.fromDateFields(date47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean50 = localDate48.isSupported(dateTimeFieldType49);
        org.joda.time.LocalDate localDate52 = localDate48.withEra(0);
        org.joda.time.LocalDate localDate54 = localDate48.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property55 = localDate48.yearOfCentury();
        org.joda.time.LocalDate localDate56 = property55.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property55.getFieldType();
        int int58 = mutableDateTime32.get(dateTimeFieldType57);
        int int59 = mutableDateTime20.get(dateTimeFieldType57);
        int int60 = mutableDateTime1.get(dateTimeFieldType57);
        long long61 = mutableDateTime1.getMillis();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (short) 10);
        org.joda.time.DateTime dateTime64 = dateTime63.toDateTime();
        org.joda.time.DateTime dateTime66 = dateTime64.plusMillis(35568792);
        org.joda.time.DateTime.Property property67 = dateTime66.secondOfDay();
        org.joda.time.DateTime dateTime69 = property67.addWrapFieldToCopy((-292275054));
        boolean boolean70 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime69);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2022-02-28T11:59:58.597+410:00" + "'", str37, "2022-02-28T11:59:58.597+410:00");
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1646042398597L + "'", long39 == 1646042398597L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1646042398597L + "'", long41 == 1646042398597L);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 22 + "'", int58 == 22);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 22 + "'", int59 == 22);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 22 + "'", int60 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1644573598597L + "'", long61 == 1644573598597L);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test22003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22003");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        int int13 = localDate6.getWeekyear();
        org.joda.time.LocalDate.Property property14 = localDate6.dayOfMonth();
        org.joda.time.LocalDate localDate16 = property14.setCopy(17);
        org.joda.time.LocalDate localDate17 = property14.roundHalfCeilingCopy();
        java.lang.Object obj18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj18);
        org.joda.time.DateTime dateTime21 = dateTime19.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.plus(readablePeriod22);
        org.joda.time.DateTime dateTime25 = dateTime23.withDayOfYear((int) (short) 1);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime28 = property26.addWrapFieldToCopy(2022);
        org.joda.time.DateTime dateTime30 = dateTime28.withYear(377);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime32.setWeekyear(3);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime.Property property37 = dateTime36.dayOfMonth();
        org.joda.time.DateTime dateTime38 = property37.withMaximumValue();
        mutableDateTime32.setMillis((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeField dateTimeField40 = null;
        mutableDateTime32.setRounding(dateTimeField40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        mutableDateTime32.add(readableDuration42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime32.era();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime32.millisOfDay();
        org.joda.time.Chronology chronology46 = mutableDateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone49 = chronology46.getZone();
        org.joda.time.DateTime dateTime50 = dateTime28.toDateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = localDate17.toDateTimeAtCurrentTime(dateTimeZone49);
        org.joda.time.LocalDate.Property property52 = localDate17.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDate localDate55 = localDate17.withPeriodAdded(readablePeriod53, 35656226);
        org.joda.time.LocalDate.Property property56 = localDate55.dayOfWeek();
        org.joda.time.LocalDate localDate57 = property56.withMaximumValue();
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1997 + "'", int13 == 1997);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDate57);
    }

    @Test
    public void test22004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22004");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setExtension('a', "UTC");
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        int int8 = dateTimeFormatter7.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter9.getChronolgy();
        boolean boolean11 = dateTimeFormatter9.isParser();
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, (int) (byte) 10);
        org.joda.time.DateTime dateTime20 = dateTime13.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale24 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str26 = locale24.getScript();
        java.lang.String str27 = dateTimeZone22.getName(1646041809840L, locale24);
        java.util.Calendar calendar28 = dateTime13.toCalendar(locale24);
        java.util.Locale locale29 = java.util.Locale.ROOT;
        java.lang.String str30 = locale29.getDisplayScript();
        java.util.Locale locale31 = java.util.Locale.ROOT;
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale31.getDisplayCountry(locale32);
        java.lang.String str34 = locale29.getDisplayCountry(locale31);
        java.lang.String str35 = locale24.getDisplayCountry(locale29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter9.withLocale(locale29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter36.withDefaultYear(35467);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter36.withDefaultYear(10);
        java.util.Locale locale41 = dateTimeFormatter40.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter40.withDefaultYear(813);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeFormatter43.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((java.lang.Object) builder0, dateTimeZone44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale$Builder");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2000 + "'", int8 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.232" + "'", str27, "+00:00:00.232");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1644573598655,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+410:00,offset=1476000000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=59,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=59,SECOND=58,MILLISECOND=655,ZONE_OFFSET=1476000000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Germany" + "'", str35, "Germany");
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
    }

    @Test
    public void test22005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22005");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) '4', dateTimeZone2);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.year();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfCeiling();
        org.joda.time.Chronology chronology7 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekOfWeekyear();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) 600000, chronology7);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime11.setWeekyear(3);
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfMonth();
        org.joda.time.DateTime dateTime17 = property16.withMaximumValue();
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeField dateTimeField19 = null;
        mutableDateTime11.setRounding(dateTimeField19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime11.add(readableDuration21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime11.era();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime11.millisOfDay();
        org.joda.time.Chronology chronology25 = mutableDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.hourOfHalfday();
        int int31 = dateTimeField29.getMinimumValue(0L);
        org.joda.time.DurationField durationField32 = dateTimeField29.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = dateTimeField29.getType();
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType33.getRangeDurationType();
        boolean boolean35 = localTime9.isSupported(durationFieldType34);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test22006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22006");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 23);
        java.util.Date date12 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.fromDateFields(date12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean15 = localDate13.isSupported(dateTimeFieldType14);
        org.joda.time.LocalDate localDate17 = localDate13.withEra(0);
        org.joda.time.LocalDate localDate19 = localDate13.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate22 = localDate13.withPeriodAdded(readablePeriod20, 100);
        org.joda.time.LocalDate.Property property23 = localDate22.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime25.setWeekyear(3);
        java.lang.Object obj28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj28);
        org.joda.time.DateTime dateTime31 = dateTime29.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.withPeriodAdded(readablePeriod32, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime29.getZone();
        mutableDateTime25.setZoneRetainFields(dateTimeZone35);
        java.util.TimeZone timeZone37 = dateTimeZone35.toTimeZone();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime40.setWeekyear(3);
        java.lang.Object obj43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(obj43);
        org.joda.time.DateTime.Property property45 = dateTime44.dayOfMonth();
        org.joda.time.DateTime dateTime46 = property45.withMaximumValue();
        mutableDateTime40.setMillis((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTimeField dateTimeField48 = null;
        mutableDateTime40.setRounding(dateTimeField48);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime51.setWeekyear(3);
        java.lang.Object obj54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(obj54);
        org.joda.time.DateTime dateTime57 = dateTime55.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.DateTime dateTime60 = dateTime55.withPeriodAdded(readablePeriod58, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone61 = dateTime55.getZone();
        mutableDateTime51.setZoneRetainFields(dateTimeZone61);
        mutableDateTime40.setZone(dateTimeZone61);
        java.util.Locale locale65 = java.util.Locale.JAPAN;
        java.lang.String str66 = dateTimeZone61.getShortName((long) 3, locale65);
        long long68 = dateTimeZone35.getMillisKeepLocal(dateTimeZone61, 1L);
        java.lang.Object obj69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(obj69);
        org.joda.time.DateTime dateTime72 = dateTime70.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.DateTime dateTime75 = dateTime70.withPeriodAdded(readablePeriod73, (int) (byte) 10);
        org.joda.time.DateTime dateTime77 = dateTime70.minusMillis(2022);
        int int78 = dateTimeZone35.getOffset((org.joda.time.ReadableInstant) dateTime70);
        int int80 = dateTimeZone35.getOffsetFromLocal((long) 50400000);
        boolean boolean81 = dateTimeZone35.isFixed();
        org.joda.time.DateMidnight dateMidnight82 = localDate22.toDateMidnight(dateTimeZone35);
        long long86 = dateTimeZone35.convertLocalToUTC(250L, false, 1646041912783L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter87 = dateTimeFormatter6.withZone(dateTimeZone35);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(timeZone37);
// flaky:         org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "GMT+Y0:00");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "+410:00" + "'", str66, "+410:00");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime77);
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1476000000 + "'", int78 == 1476000000);
// flaky:         org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1476000000 + "'", int80 == 1476000000);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(dateMidnight82);
// flaky:         org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-1475999750L) + "'", long86 == (-1475999750L));
        org.junit.Assert.assertNotNull(dateTimeFormatter87);
    }

    @Test
    public void test22007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22007");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withField(dateTimeFieldType3, 15);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateTime dateTime8 = dateTime5.withFieldAdded(durationFieldType6, 35408);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillis((long) 35418);
        org.joda.time.DateTime.Property property11 = dateTime10.year();
        org.joda.time.DateTime.Property property12 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime13 = property12.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test22008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22008");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        org.joda.time.DateTime.Property property8 = dateTime3.centuryOfEra();
        org.joda.time.DateTime dateTime10 = dateTime3.plusYears(0);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        org.joda.time.ReadableInstant readableInstant12 = null;
        boolean boolean13 = dateTime10.isEqual(readableInstant12);
        org.joda.time.DateTime dateTime15 = dateTime10.withDayOfYear(10);
        org.joda.time.DateTime dateTime16 = dateTime15.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test22009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22009");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        int int2 = mutableDateTime1.getYear();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime5);
        long long8 = mutableDateTime1.getMillis();
        mutableDateTime1.addMonths(55320010);
        mutableDateTime1.setDayOfMonth(8);
        org.joda.time.Instant instant13 = mutableDateTime1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime15.setWeekyear(3);
        java.lang.Object obj18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj18);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfMonth();
        org.joda.time.DateTime dateTime21 = property20.withMaximumValue();
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTimeField dateTimeField23 = null;
        mutableDateTime15.setRounding(dateTimeField23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutableDateTime15.add(readableDuration25);
        mutableDateTime15.setSecondOfMinute((int) ' ');
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime15.millisOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime15.hourOfDay();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.MIDNIGHT;
        int int35 = localTime33.compareTo((org.joda.time.ReadablePartial) localTime34);
        java.lang.Object obj36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime42 = dateTime37.withPeriodAdded(readablePeriod40, (int) (byte) 10);
        org.joda.time.DateTime dateTime43 = localTime34.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology44 = dateTime37.getChronology();
        java.lang.String str45 = chronology44.toString();
        java.lang.Object obj46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj46);
        org.joda.time.DateTime dateTime49 = dateTime47.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime47.withPeriodAdded(readablePeriod50, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime47.getZone();
        long long56 = dateTimeZone53.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.Chronology chronology58 = chronology44.withZone(dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime60.setWeekyear(3);
        java.lang.Object obj63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(obj63);
        org.joda.time.DateTime dateTime66 = dateTime64.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.DateTime dateTime69 = dateTime64.withPeriodAdded(readablePeriod67, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone70 = dateTime64.getZone();
        mutableDateTime60.setZoneRetainFields(dateTimeZone70);
        java.lang.String str73 = dateTimeZone70.getNameKey(1646041808949L);
        boolean boolean74 = dateTimeZone70.isFixed();
        org.joda.time.Chronology chronology75 = chronology58.withZone(dateTimeZone70);
        org.joda.time.DurationField durationField76 = chronology75.millis();
        org.joda.time.DurationField durationField77 = chronology75.months();
        org.joda.time.DateTimeField dateTimeField78 = chronology75.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime((long) 377, chronology75);
        org.joda.time.ReadableDuration readableDuration80 = null;
        mutableDateTime79.add(readableDuration80);
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime79.minuteOfDay();
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime79.secondOfDay();
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) mutableDateTime79);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime15.yearOfCentury();
        int int86 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022-02-28T11:59:58.742+410:00" + "'", str6, "2022-02-28T11:59:58.742+410:00");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1646042398742L + "'", long8 == 1646042398742L);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ISOChronology[+410:00]" + "'", str45, "ISOChronology[+410:00]");
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
// flaky:         org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1475999989L) + "'", long56 == (-1475999989L));
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTimeZone70);
// flaky:         org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(durationField76);
        org.junit.Assert.assertNotNull(durationField77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
    }

    @Test
    public void test22010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22010");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.months();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(11L, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.weekyear();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(chronology13);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test22011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22011");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        int int6 = date5.getYear();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromDateFields(date5);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMillis((-27409550));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMillisOfSecond(21);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.era();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundHalfFloorCopy();
        int int17 = localDateTime16.getDayOfWeek();
        int int18 = localDateTime16.getWeekyear();
        int int19 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property20 = localDateTime13.yearOfEra();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundHalfEvenCopy();
        int int22 = property20.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime24 = property20.setCopy(35693444);
        int int25 = localDateTime24.getMillisOfSecond();
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 292278993 + "'", int22 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 21 + "'", int25 == 21);
    }

    @Test
    public void test22012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22012");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property3 = localTime0.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property3.addNoWrapToCopy((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime9 = localTime6.withPeriodAdded(readablePeriod7, (int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime11.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime11.add(readableDuration14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.property(dateTimeFieldType16);
        boolean boolean18 = localTime6.isSupported(dateTimeFieldType16);
        org.joda.time.DateTime dateTime19 = localTime6.toDateTimeToday();
        org.joda.time.LocalTime localTime21 = localTime6.plusSeconds(6018575);
        org.joda.time.LocalTime localTime23 = localTime21.minusMillis(35581);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
    }

    @Test
    public void test22013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22013");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.millisOfDay();
        org.joda.time.Chronology chronology15 = mutableDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField18 = chronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.dayOfWeek();
        long long23 = chronology15.add(35414L, 97L, 366);
        org.joda.time.DateTimeField dateTimeField24 = chronology15.millisOfDay();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 70916L + "'", long23 == 70916L);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test22014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22014");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfDay();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField16 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.hourOfHalfday();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test22015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22015");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.millisOfDay();
        org.joda.time.Chronology chronology15 = mutableDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.hourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = chronology15.minuteOfHour();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime25 = localTime23.withSecondOfMinute((int) ' ');
        org.joda.time.LocalTime.Property property26 = localTime23.minuteOfHour();
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime33 = dateTime28.withPeriodAdded(readablePeriod31, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime28.getZone();
        int int35 = property26.getDifference((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.LocalTime localTime36 = property26.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime38 = localTime36.plusSeconds(35414);
        int int39 = dateTimeField21.getMaximumValue((org.joda.time.ReadablePartial) localTime38);
        org.joda.time.DurationField durationField40 = dateTimeField21.getRangeDurationField();
        java.lang.String str41 = dateTimeField21.getName();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-27409439) + "'", int35 == (-27409439));
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 59 + "'", int39 == 59);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "minuteOfHour" + "'", str41, "minuteOfHour");
    }

    @Test
    public void test22016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22016");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        boolean boolean14 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.era();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.weekyear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        org.joda.time.Chronology chronology19 = chronology13.withZone(dateTimeZone18);
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withPeriodAdded(readablePeriod24, (int) (byte) 10);
        org.joda.time.DateTime dateTime28 = dateTime21.minusMillis(2022);
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfYear();
        org.joda.time.DateTime dateTime30 = property29.withMaximumValue();
        org.joda.time.DateTime dateTime32 = dateTime30.minusSeconds((int) 'a');
        int int33 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime35 = dateTime30.plusDays(35465);
        org.joda.time.TimeOfDay timeOfDay36 = dateTime30.toTimeOfDay();
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.MIDNIGHT;
        int int38 = localTime37.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property40 = localTime37.property(dateTimeFieldType39);
        org.joda.time.LocalTime localTime41 = property40.withMinimumValue();
        org.joda.time.LocalTime localTime43 = property40.addNoWrapToCopy((int) (byte) 1);
        java.util.Locale locale45 = java.util.Locale.CHINESE;
        java.lang.String str46 = localTime43.toString("+00:00", locale45);
        org.joda.time.DateTime dateTime47 = localTime43.toDateTimeToday();
        java.util.GregorianCalendar gregorianCalendar48 = dateTime47.toGregorianCalendar();
        org.joda.time.DateTime.Property property49 = dateTime47.yearOfEra();
        org.joda.time.DateTime.Property property50 = dateTime47.minuteOfHour();
        boolean boolean51 = dateTime30.equals((java.lang.Object) dateTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(gregorianCalendar48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test22017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22017");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        long long18 = calendar15.getTimeInMillis();
        int int20 = calendar15.getLeastMaximum(0);
        boolean boolean21 = calendar15.isWeekDateSupported();
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.LocalDateTime localDateTime24 = dateTime23.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withDurationAdded(readableDuration25, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.minusMonths(0);
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.plusSeconds(2);
        int int33 = localDateTime32.getDayOfWeek();
        java.lang.String str34 = localDateTime32.toString();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.plusHours(145);
        java.lang.Object obj39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(obj39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMinutes(2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int44 = dateTime42.get(dateTimeFieldType43);
        boolean boolean45 = localDateTime32.isSupported(dateTimeFieldType43);
        boolean boolean46 = calendar15.before((java.lang.Object) dateTimeFieldType43);
        java.lang.Object obj49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(obj49);
        org.joda.time.DateTime dateTime52 = dateTime50.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.plus(readablePeriod53);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateTime dateTime56 = dateTime52.plus(readableDuration55);
        java.util.Date date62 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate63 = org.joda.time.LocalDate.fromDateFields(date62);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean65 = localDate63.isSupported(dateTimeFieldType64);
        boolean boolean66 = dateTime56.isSupported(dateTimeFieldType64);
        org.joda.time.DateTime dateTime68 = dateTime56.plusHours(11);
        org.joda.time.DateTime.Property property69 = dateTime56.yearOfEra();
        java.util.Locale locale70 = java.util.Locale.FRENCH;
        java.lang.String str71 = property69.getAsText(locale70);
        java.util.Locale locale72 = locale70.stripExtensions();
        java.lang.String str73 = locale72.getDisplayLanguage();
        java.util.Locale locale74 = java.util.Locale.ROOT;
        java.lang.String str75 = locale74.getDisplayName();
        java.lang.String str76 = locale72.getDisplayLanguage(locale74);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap77 = calendar15.getDisplayNames(35947567, 35606177, locale72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+Y0:00");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644573598895,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+410:00,offset=1476000000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=10,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=59,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=59,SECOND=58,MILLISECOND=895,ZONE_OFFSET=1476000000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644573598895L + "'", long18 == 1644573598895L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2022-02-28T12:00:00.895" + "'", str34, "2022-02-28T12:00:00.895");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "10" + "'", str71, "10");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str73, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "French" + "'", str76, "French");
    }

    @Test
    public void test22018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22018");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusHours(999);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        int int10 = dateTimeFormatter9.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter11.getParser();
        java.lang.Integer int13 = dateTimeFormatter11.getPivotYear();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        int int17 = localTime15.compareTo((org.joda.time.ReadablePartial) localTime16);
        java.lang.Object obj18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj18);
        org.joda.time.DateTime dateTime21 = dateTime19.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime19.withPeriodAdded(readablePeriod22, (int) (byte) 10);
        org.joda.time.DateTime dateTime25 = localTime16.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology26 = dateTime19.getChronology();
        java.lang.String str27 = chronology26.toString();
        java.lang.Object obj28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj28);
        org.joda.time.DateTime dateTime31 = dateTime29.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.withPeriodAdded(readablePeriod32, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime29.getZone();
        long long38 = dateTimeZone35.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.Chronology chronology40 = chronology26.withZone(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime42.setWeekyear(3);
        java.lang.Object obj45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(obj45);
        org.joda.time.DateTime dateTime48 = dateTime46.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.DateTime dateTime51 = dateTime46.withPeriodAdded(readablePeriod49, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTime46.getZone();
        mutableDateTime42.setZoneRetainFields(dateTimeZone52);
        java.lang.String str55 = dateTimeZone52.getNameKey(1646041808949L);
        boolean boolean56 = dateTimeZone52.isFixed();
        org.joda.time.Chronology chronology57 = chronology40.withZone(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone59);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) '4', dateTimeZone59);
        int int63 = dateTimeZone59.getOffsetFromLocal((long) 32769);
        org.joda.time.Chronology chronology64 = chronology40.withZone(dateTimeZone59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter11.withChronology(chronology64);
        org.joda.time.DateTimeField dateTimeField66 = chronology64.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((java.lang.Object) localDateTime6, chronology64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeParser12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ISOChronology[+410:00]" + "'", str27, "ISOChronology[+410:00]");
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1475999989L) + "'", long38 == (-1475999989L));
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
// flaky:         org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(dateTime60);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1476000000 + "'", int63 == 1476000000);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTimeField66);
    }

    @Test
    public void test22019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22019");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfDay();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology12);
        org.joda.time.DurationField durationField15 = chronology12.seconds();
        org.joda.time.DurationField durationField16 = chronology12.hours();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        int int21 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime20);
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime23.withPeriodAdded(readablePeriod26, (int) (byte) 10);
        org.joda.time.DateTime dateTime29 = localTime20.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology30 = dateTime23.getChronology();
        boolean boolean31 = dateTimeFieldType17.isSupported(chronology30);
        org.joda.time.DurationField durationField32 = chronology30.hours();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.monthOfYear();
        org.joda.time.DurationField durationField35 = chronology30.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = chronology30.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((java.lang.Object) durationField16, chronology30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test22020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22020");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.util.Calendar.Builder builder7 = builder4.setLocale(locale5);
        java.util.Calendar.Builder builder11 = builder4.setWeekDate(2000, 24, 6);
        java.util.Calendar.Builder builder13 = builder11.setLenient(false);
        java.util.Calendar.Builder builder17 = builder13.setDate(32770, 32772, 377);
        java.util.Calendar.Builder builder21 = builder17.setTimeOfDay(6018575, 4, 14);
        java.util.Calendar.Builder builder26 = builder17.setTimeOfDay(20, 625, 18, 19051);
        java.util.Calendar.Builder builder30 = builder26.setDate(75197969, 34833000, 823);
        java.util.Calendar.Builder builder34 = builder30.setTimeOfDay(35568792, (int) (byte) 0, 35530);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime36.setWeekyear(3);
        java.lang.Object obj39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(obj39);
        org.joda.time.DateTime dateTime42 = dateTime40.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime45 = dateTime40.withPeriodAdded(readablePeriod43, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime40.getZone();
        mutableDateTime36.setZoneRetainFields(dateTimeZone46);
        java.util.TimeZone timeZone48 = dateTimeZone46.toTimeZone();
        java.util.Locale locale49 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone48, locale49);
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.fromCalendarFields(calendar50);
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.fromCalendarFields(calendar50);
        java.time.Instant instant53 = calendar50.toInstant();
        calendar50.setWeekDate((int) ' ', (int) (byte) 10, 3);
        int int58 = calendar50.getMinimalDaysInFirstWeek();
        calendar50.setMinimalDaysInFirstWeek(35470);
        int int61 = calendar50.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone62 = calendar50.getTimeZone();
        java.util.Calendar.Builder builder63 = builder30.setTimeZone(timeZone62);
        java.util.Calendar.Builder builder67 = builder30.setDate(35852647, 35784322, 35524);
        java.util.Calendar.Builder builder72 = builder67.setTimeOfDay(249, 35941, 6018575, 35726);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(timeZone48);
// flaky:         org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "GMT+Y0:00");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar50);
// flaky:         org.junit.Assert.assertEquals(calendar50.toString(), "java.util.GregorianCalendar[time=-61153538401065,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+410:00,offset=1476000000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=35470,ERA=1,YEAR=32,MONTH=2,WEEK_OF_YEAR=9,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=64,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=59,SECOND=58,MILLISECOND=935,ZONE_OFFSET=1476000000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 35470 + "'", int61 == 35470);
        org.junit.Assert.assertNotNull(timeZone62);
// flaky:         org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "GMT+Y0:00");
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder72);
    }

    @Test
    public void test22021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22021");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Calendar.Builder builder6 = builder4.setLenient(false);
        java.util.Calendar.Builder builder10 = builder6.setWeekDate(0, (int) (short) 10, 53);
        java.util.Calendar.Builder builder12 = builder10.setLenient(true);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime14.setWeekyear(3);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime18.getZone();
        mutableDateTime14.setZoneRetainFields(dateTimeZone24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime14.yearOfCentury();
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime33 = dateTime28.withPeriodAdded(readablePeriod31, (int) (byte) 10);
        org.joda.time.DateTime dateTime35 = dateTime28.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale39 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        java.lang.String str41 = locale39.getScript();
        java.lang.String str42 = dateTimeZone37.getName(1646041809840L, locale39);
        java.util.Calendar calendar43 = dateTime28.toCalendar(locale39);
        java.util.Locale locale44 = java.util.Locale.ROOT;
        java.lang.String str45 = locale44.getDisplayScript();
        java.util.Locale locale46 = java.util.Locale.ROOT;
        java.util.Locale locale47 = java.util.Locale.FRENCH;
        java.lang.String str48 = locale46.getDisplayCountry(locale47);
        java.lang.String str49 = locale44.getDisplayCountry(locale46);
        java.lang.String str50 = locale39.getDisplayCountry(locale44);
        int int51 = property26.getMaximumTextLength(locale39);
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime54 = org.joda.time.LocalTime.MIDNIGHT;
        int int55 = localTime53.compareTo((org.joda.time.ReadablePartial) localTime54);
        java.lang.Object obj56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(obj56);
        org.joda.time.DateTime dateTime59 = dateTime57.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.DateTime dateTime62 = dateTime57.withPeriodAdded(readablePeriod60, (int) (byte) 10);
        org.joda.time.DateTime dateTime63 = localTime54.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Chronology chronology64 = dateTime57.getChronology();
        java.lang.String str65 = chronology64.toString();
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(chronology64);
        org.joda.time.DateTimeField dateTimeField67 = chronology64.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField68 = chronology64.yearOfCentury();
        long long71 = dateTimeField68.getDifferenceAsLong((long) 53, 10L);
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime75 = org.joda.time.LocalTime.MIDNIGHT;
        int int76 = localTime74.compareTo((org.joda.time.ReadablePartial) localTime75);
        org.joda.time.LocalTime.Property property77 = localTime74.minuteOfHour();
        org.joda.time.LocalTime localTime78 = property77.getLocalTime();
        org.joda.time.LocalTime localTime79 = property77.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime80 = property77.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime82 = property77.addCopy(15);
        java.util.Locale locale84 = java.util.Locale.GERMAN;
        java.lang.String str85 = locale84.getDisplayScript();
        org.joda.time.LocalTime localTime86 = property77.setCopy("10", locale84);
        java.lang.String str87 = dateTimeField68.getAsText(1644573016265L, locale84);
        java.lang.String str88 = locale39.getDisplayScript(locale84);
        java.util.Calendar.Builder builder89 = builder12.setLocale(locale84);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder91 = builder89.setInstant(1221091200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.232" + "'", str42, "+00:00:00.232");
        org.junit.Assert.assertNotNull(calendar43);
// flaky:         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=1644573598957,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+410:00,offset=1476000000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=59,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=59,SECOND=58,MILLISECOND=957,ZONE_OFFSET=1476000000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Germany" + "'", str50, "Germany");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(chronology64);
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ISOChronology[+410:00]" + "'", str65, "ISOChronology[+410:00]");
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(localTime79);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(localTime82);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "de");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(localTime86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "22" + "'", str87, "22");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(builder89);
    }

    @Test
    public void test22022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22022");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        int int4 = dateTime3.getHourOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.withCenturyOfEra(17);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime9.setWeekyear(3);
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundFloor();
        boolean boolean19 = dateTime7.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        mutableDateTime18.addHours(35465);
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes(2022);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime27.setWeekyear(3);
        java.lang.Object obj30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj30);
        org.joda.time.DateTime.Property property32 = dateTime31.dayOfMonth();
        org.joda.time.DateTime dateTime33 = property32.withMaximumValue();
        mutableDateTime27.setMillis((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeField dateTimeField35 = null;
        mutableDateTime27.setRounding(dateTimeField35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        mutableDateTime27.add(readableDuration37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime27.era();
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime27.add(readableDuration40);
        java.lang.String str42 = mutableDateTime27.toString();
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.MIDNIGHT;
        int int46 = localTime44.compareTo((org.joda.time.ReadablePartial) localTime45);
        java.lang.Object obj47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(obj47);
        org.joda.time.DateTime dateTime50 = dateTime48.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.DateTime dateTime53 = dateTime48.withPeriodAdded(readablePeriod51, (int) (byte) 10);
        org.joda.time.DateTime dateTime54 = localTime45.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Chronology chronology55 = dateTime48.getChronology();
        java.lang.String str56 = chronology55.toString();
        java.lang.Object obj57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(obj57);
        org.joda.time.DateTime dateTime60 = dateTime58.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.DateTime dateTime63 = dateTime58.withPeriodAdded(readablePeriod61, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime58.getZone();
        long long67 = dateTimeZone64.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(dateTimeZone64);
        org.joda.time.Chronology chronology69 = chronology55.withZone(dateTimeZone64);
        mutableDateTime27.setChronology(chronology55);
        org.joda.time.DurationField durationField71 = chronology55.years();
        org.joda.time.DateTimeField dateTimeField72 = chronology55.secondOfMinute();
        org.joda.time.DateTime dateTime73 = dateTime25.toDateTime(chronology55);
        org.joda.time.DurationField durationField74 = chronology55.minutes();
        long long79 = chronology55.getDateTimeMillis(50400000, 10, (int) (byte) 10, 7);
        org.joda.time.DateTimeField dateTimeField80 = chronology55.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField81 = chronology55.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField82 = chronology55.millisOfDay();
        mutableDateTime18.setChronology(chronology55);
        org.joda.time.ReadablePeriod readablePeriod84 = null;
        mutableDateTime18.add(readablePeriod84, 35797);
        org.junit.Assert.assertNotNull(dateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property39);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2022-02-28T11:59:58.977+410:00" + "'", str42, "2022-02-28T11:59:58.977+410:00");
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(chronology55);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ISOChronology[+410:00]" + "'", str56, "ISOChronology[+410:00]");
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTimeZone64);
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1475999989L) + "'", long67 == (-1475999989L));
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(durationField74);
// flaky:         org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1590408236556000007L + "'", long79 == 1590408236556000007L);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(dateTimeField82);
    }

    @Test
    public void test22023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22023");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int2 = localTime0.getValue(0);
        org.joda.time.LocalTime.Property property3 = localTime0.millisOfDay();
        java.lang.String str4 = property3.getName();
        org.joda.time.LocalTime localTime5 = property3.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = property3.addWrapFieldToCopy(35475);
        org.joda.time.LocalTime localTime8 = property3.roundHalfCeilingCopy();
        int int9 = property3.getMinimumValue();
        java.lang.String str10 = property3.getName();
        org.joda.time.LocalTime localTime12 = property3.addNoWrapToCopy(35853);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "millisOfDay" + "'", str4, "millisOfDay");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "millisOfDay" + "'", str10, "millisOfDay");
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test22024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22024");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.lang.String str22 = calendar15.getCalendarType();
        calendar15.clear();
        java.util.Date date29 = new java.util.Date(35436935, 19, 922, (int) '4', (-52));
        boolean boolean30 = calendar15.after((java.lang.Object) (-52));
        calendar15.setTimeInMillis((long) 68460865);
        // The following exception was thrown during execution in test generation
        try {
            calendar15.roll(35615, 786);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+Y0:00");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=68460865,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+410:00,offset=1476000000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=18,DAY_OF_YEAR=18,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=1,SECOND=0,MILLISECOND=865,ZONE_OFFSET=1476000000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "gregory" + "'", str22, "gregory");
        org.junit.Assert.assertEquals(date29.toString(), "Thu Feb 10 03:08:00 UTC 35438839");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test22025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22025");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        java.util.Date date13 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        boolean boolean17 = dateTime7.isSupported(dateTimeFieldType15);
        int int18 = dateTime7.getEra();
        int int19 = dateTime7.getMillisOfDay();
        org.joda.time.DateTime.Property property20 = dateTime7.secondOfMinute();
        org.joda.time.DateTime dateTime21 = property20.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = dateTime21.withWeekOfWeekyear(35968232);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35968232 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 43199023 + "'", int19 == 43199023);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
    }

    @Test
    public void test22026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22026");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.DateTimeField dateTimeField11 = null;
        mutableDateTime1.setRounding(dateTimeField11);
        mutableDateTime1.addWeeks((int) ' ');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime1.dayOfMonth();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.halfdays();
        mutableDateTime1.add(durationFieldType16, 35423);
        long long19 = mutableDateTime1.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfWeek((-1900));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1900 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationFieldType16);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3194200799033L + "'", long19 == 3194200799033L);
    }

    @Test
    public void test22027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22027");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime5 = dateTime2.withField(dateTimeFieldType3, (int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded(readableDuration6, (int) (byte) 10);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.MIDNIGHT;
        int int12 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime11);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withPeriodAdded(readablePeriod17, (int) (byte) 10);
        org.joda.time.DateTime dateTime20 = localTime11.toDateTime((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime.Property property21 = dateTime20.weekOfWeekyear();
        org.joda.time.DateTime dateTime23 = property21.addWrapFieldToCopy(10);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        boolean boolean25 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime.Property property26 = dateTime8.minuteOfDay();
        org.joda.time.DateTime dateTime27 = property26.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime29 = property26.addWrapFieldToCopy(10687172);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test22028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22028");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property13 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate16 = localDate14.withEra(1);
        org.joda.time.LocalDate localDate18 = localDate14.minusYears(12);
        org.joda.time.LocalDate.Property property19 = localDate18.weekyear();
        org.joda.time.LocalDate.Property property20 = localDate18.year();
        org.joda.time.LocalDate localDate22 = localDate18.withYearOfEra(35486);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate22.minus(readablePeriod23);
        org.joda.time.LocalDate.Property property25 = localDate22.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        long long30 = dateTimeZone27.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime32.setWeekyear(3);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withPeriodAdded(readablePeriod39, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime36.getZone();
        mutableDateTime32.setZoneRetainFields(dateTimeZone42);
        long long45 = dateTimeZone27.getMillisKeepLocal(dateTimeZone42, (long) 35408);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 4, dateTimeZone27);
        long long49 = dateTimeZone27.convertLocalToUTC(3600000L, true);
        long long51 = dateTimeZone27.nextTransition(1646041829007L);
        org.joda.time.DateTime dateTime52 = localDate22.toDateTimeAtMidnight(dateTimeZone27);
        java.util.TimeZone timeZone53 = dateTimeZone27.toTimeZone();
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 35408L + "'", long45 == 35408L);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1472400000L) + "'", long49 == (-1472400000L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1646041829007L + "'", long51 == 1646041829007L);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(timeZone53);
// flaky:         org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "GMT+Y0:00");
    }

    @Test
    public void test22029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22029");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        long long4 = dateTimeZone1.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime6.setWeekyear(3);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime10.getZone();
        mutableDateTime6.setZoneRetainFields(dateTimeZone16);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (long) 35408);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 4, dateTimeZone1);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) (byte) 10);
        boolean boolean25 = dateTime24.isEqualNow();
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withPeriodAdded(readablePeriod30, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime27.getZone();
        long long36 = dateTimeZone33.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime37 = dateTime24.toDateTime(dateTimeZone33);
        org.joda.time.LocalTime localTime38 = dateTime24.toLocalTime();
        org.joda.time.DateTime dateTime40 = dateTime24.plus((long) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime42.setWeekyear(3);
        java.lang.Object obj45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(obj45);
        org.joda.time.DateTime.Property property47 = dateTime46.dayOfMonth();
        org.joda.time.DateTime dateTime48 = property47.withMaximumValue();
        mutableDateTime42.setMillis((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTimeField dateTimeField50 = null;
        mutableDateTime42.setRounding(dateTimeField50);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime53.setWeekyear(3);
        java.lang.Object obj56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(obj56);
        org.joda.time.DateTime dateTime59 = dateTime57.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.DateTime dateTime62 = dateTime57.withPeriodAdded(readablePeriod60, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone63 = dateTime57.getZone();
        mutableDateTime53.setZoneRetainFields(dateTimeZone63);
        mutableDateTime42.setZone(dateTimeZone63);
        mutableDateTime42.addWeeks((int) (byte) -1);
        boolean boolean68 = dateTime40.isEqual((org.joda.time.ReadableInstant) mutableDateTime42);
        org.joda.time.DateTime dateTime70 = dateTime40.plusDays((int) (byte) 100);
        int int71 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime.Property property72 = dateTime20.weekyear();
        org.joda.time.Interval interval73 = property72.toInterval();
        int int74 = property72.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField75 = property72.getField();
        org.joda.time.DateTime dateTime77 = property72.setCopy(1120);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime79 = property72.setCopy("09:53:19.301");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:53:19.301\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35408L + "'", long19 == 35408L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1475999989L) + "'", long36 == (-1475999989L));
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-292275054) + "'", int74 == (-292275054));
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(dateTime77);
    }

    @Test
    public void test22030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22030");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone11.toTimeZone();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.plus(readablePeriod17);
        org.joda.time.LocalDate localDate20 = localDate18.minusDays(35474169);
        org.joda.time.LocalDate localDate22 = localDate18.plusMonths(35494);
        java.lang.String str23 = localDate22.toString();
        org.joda.time.LocalDate.Property property24 = localDate22.era();
        org.joda.time.LocalDate localDate25 = property24.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+Y0:00");
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+Y0:00");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4979-12-28" + "'", str23, "4979-12-28");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test22031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22031");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("09:50:19.500");
        java.lang.String str2 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22032");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) -1);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime19.setWeekyear(3);
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfMonth();
        org.joda.time.DateTime dateTime25 = property24.withMaximumValue();
        mutableDateTime19.setMillis((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeField dateTimeField27 = null;
        mutableDateTime19.setRounding(dateTimeField27);
        org.joda.time.DateTimeField dateTimeField29 = null;
        mutableDateTime19.setRounding(dateTimeField29);
        mutableDateTime19.addWeeks((int) ' ');
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime19.dayOfMonth();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.halfdays();
        mutableDateTime19.add(durationFieldType34, 35423);
        mutableDateTime17.add(durationFieldType34, 19);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.era();
        int int41 = localDateTime39.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.plusMonths(14);
        org.joda.time.LocalDateTime.Property property46 = localDateTime39.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int48 = localDateTime39.get(dateTimeFieldType47);
        org.joda.time.DurationFieldType durationFieldType49 = dateTimeFieldType47.getRangeDurationType();
        mutableDateTime17.set(dateTimeFieldType47, 51);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime53.setWeekyear(3);
        java.lang.Object obj56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(obj56);
        org.joda.time.DateTime.Property property58 = dateTime57.dayOfMonth();
        org.joda.time.DateTime dateTime59 = property58.withMaximumValue();
        mutableDateTime53.setMillis((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTimeField dateTimeField61 = null;
        mutableDateTime53.setRounding(dateTimeField61);
        org.joda.time.ReadableDuration readableDuration63 = null;
        mutableDateTime53.add(readableDuration63);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime53.era();
        java.lang.String str66 = property65.getName();
        org.joda.time.DateTimeField dateTimeField67 = property65.getField();
        int int68 = dateTimeField67.getMaximumValue();
        mutableDateTime17.setRounding(dateTimeField67);
        java.lang.String str70 = dateTimeField67.getName();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(property40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2022 + "'", int48 == 2022);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "era" + "'", str66, "era");
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "era" + "'", str70, "era");
    }

    @Test
    public void test22033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22033");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        java.lang.String str13 = chronology12.toString();
        org.joda.time.DurationField durationField14 = chronology12.months();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.weekOfWeekyear();
        long long17 = dateTimeField15.roundCeiling((long) 50400000);
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimeParser dateTimeParser19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser19);
        java.lang.Integer int21 = dateTimeFormatter20.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withOffsetParsed();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime25.setWeekyear(3);
        java.lang.Object obj28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj28);
        org.joda.time.DateTime dateTime31 = dateTime29.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.withPeriodAdded(readablePeriod32, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime29.getZone();
        mutableDateTime25.setZoneRetainFields(dateTimeZone35);
        java.lang.String str38 = dateTimeZone35.getNameKey(1646041808949L);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone35);
        java.lang.String str40 = dateTimeZone35.toString();
        boolean boolean41 = dateTimeZone35.isFixed();
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) 70, dateTimeZone35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter20.withZone(dateTimeZone35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter20.withPivotYear((java.lang.Integer) 31915440);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime47.setWeekyear(3);
        java.lang.Object obj50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(obj50);
        org.joda.time.DateTime.Property property52 = dateTime51.dayOfMonth();
        org.joda.time.DateTime dateTime53 = property52.withMaximumValue();
        mutableDateTime47.setMillis((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTimeField dateTimeField55 = null;
        mutableDateTime47.setRounding(dateTimeField55);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime58.setWeekyear(3);
        java.lang.Object obj61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(obj61);
        org.joda.time.DateTime dateTime64 = dateTime62.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.DateTime dateTime67 = dateTime62.withPeriodAdded(readablePeriod65, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime62.getZone();
        mutableDateTime58.setZoneRetainFields(dateTimeZone68);
        mutableDateTime47.setZone(dateTimeZone68);
        mutableDateTime47.addWeeks((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime47.millisOfDay();
        mutableDateTime47.setDate((long) 8);
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime47.hourOfDay();
        java.util.Locale locale80 = new java.util.Locale("09:50:02.357", "", "09:50:02.357");
        java.util.Locale locale81 = java.util.Locale.CHINA;
        java.lang.String str82 = locale81.getDisplayVariant();
        java.lang.String str83 = locale81.getCountry();
        java.lang.String str84 = locale80.getDisplayVariant(locale81);
        java.lang.String str85 = property76.getAsShortText(locale80);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter20.withLocale(locale80);
        java.lang.String str87 = locale80.getVariant();
        int int88 = dateTimeField15.getMaximumTextLength(locale80);
        java.util.Locale locale93 = new java.util.Locale("14:46:26.000", "2022-02-28T09:52:26.837Z", "2022-02-28T09:59:18.911+00:00:00.012");
        java.lang.String str94 = dateTimeField15.getAsShortText(35899374, locale93);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[+410:00]" + "'", str13, "ISOChronology[+410:00]");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 79200000L + "'", long17 == 79200000L);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
// flaky:         org.junit.Assert.assertNull(str38);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+410:00" + "'", str40, "+410:00");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertEquals(locale80.toString(), "09:50:02.357__09:50:02.357");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "CN" + "'", str83, "CN");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "09:50:02.357" + "'", str84, "09:50:02.357");
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "11" + "'", str85, "11");
        org.junit.Assert.assertNotNull(dateTimeFormatter86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "09:50:02.357" + "'", str87, "09:50:02.357");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
        org.junit.Assert.assertEquals(locale93.toString(), "14:46:26.000_2022-02-28T09:52:26.837Z_2022-02-28T09:59:18.911+00:00:00.012");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "35899374" + "'", str94, "35899374");
    }

    @Test
    public void test22034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22034");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(11);
        org.joda.time.LocalDate localDate14 = localDate10.withWeekyear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test22035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22035");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1644573294225L);
    }

    @Test
    public void test22036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22036");
        java.util.Locale locale3 = new java.util.Locale("2022-02-28T09:50:20.930Z", "2022-02-28T09:50:16.644Z", "0010-02-11T09:50:13.513Z");
        java.lang.String str4 = locale3.getScript();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale3);
        java.lang.String str7 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "2022-02-28t09:50:20.930z_2022-02-28T09:50:16.644Z_0010-02-11T09:50:13.513Z");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "2022-02-28t09:50:20.930z_2022-02-28T09:50:16.644Z_0010-02-11T09:50:13.513Z");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644573599184,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=59,SECOND=59,MILLISECOND=184,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-28t09:50:20.930z_2022-02-28T09:50:16.644Z_0010-02-11T09:50:13.513Z" + "'", str7, "2022-02-28t09:50:20.930z_2022-02-28T09:50:16.644Z_0010-02-11T09:50:13.513Z");
    }

    @Test
    public void test22037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22037");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        long long4 = dateTimeZone1.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime6.setWeekyear(3);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime10.getZone();
        mutableDateTime6.setZoneRetainFields(dateTimeZone16);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (long) 35408);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 4, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime21.addWeeks(19);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24, (int) (short) 0);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.secondOfMinute();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime21.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime21.setDayOfWeek(10295379);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10295379 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35408L + "'", long19 == 35408L);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test22038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22038");
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(0, 1, 4, 2, 5, 0, 23);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        long long11 = dateTimeZone8.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime13.setWeekyear(3);
        java.lang.Object obj16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj16);
        org.joda.time.DateTime dateTime19 = dateTime17.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.withPeriodAdded(readablePeriod20, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime17.getZone();
        mutableDateTime13.setZoneRetainFields(dateTimeZone23);
        long long26 = dateTimeZone8.getMillisKeepLocal(dateTimeZone23, (long) 35408);
        java.lang.String str28 = dateTimeZone8.getNameKey((long) 22);
        org.joda.time.DateTime dateTime29 = dateTime7.withZoneRetainFields(dateTimeZone8);
        java.lang.Object obj30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj30);
        org.joda.time.LocalDateTime localDateTime32 = dateTime31.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withDurationAdded(readableDuration33, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.minusMonths(0);
        org.joda.time.DateTime dateTime38 = localDateTime37.toDateTime();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.plusSeconds(2);
        int int41 = localDateTime40.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.plusHours((-27409550));
        boolean boolean44 = dateTimeZone8.isLocalDateTimeGap(localDateTime40);
        java.lang.String str46 = dateTimeZone8.getNameKey(1646041810475L);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone8);
        java.lang.Object obj48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(obj48);
        org.joda.time.LocalDateTime localDateTime50 = dateTime49.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withDurationAdded(readableDuration51, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime50.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime50.minusHours((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.era();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType61 = org.joda.time.DurationFieldType.eras();
        boolean boolean62 = localDateTime60.isSupported(durationFieldType61);
        boolean boolean63 = localDateTime58.isSupported(durationFieldType61);
        boolean boolean64 = localDateTime57.isSupported(durationFieldType61);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime57.withWeekyear(20);
        org.joda.time.LocalDateTime.Property property67 = localDateTime57.year();
        boolean boolean68 = dateTimeZone8.isLocalDateTimeGap(localDateTime57);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime57.plusWeeks(6066);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.minusDays(35423);
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.LocalDateTime localDateTime75 = localDateTime70.withDurationAdded(readableDuration73, 450);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime70.withMillisOfDay(35635197);
        int int78 = localDateTime77.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35408L + "'", long26 == 35408L);
// flaky:         org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky:         org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2138 + "'", int78 == 2138);
    }

    @Test
    public void test22039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22039");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        java.lang.String str15 = chronology13.toString();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 590, chronology13);
        org.joda.time.LocalTime localTime18 = localTime16.plusMillis(100);
        org.joda.time.Chronology chronology19 = localTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.era();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[+410:00]" + "'", str15, "ISOChronology[+410:00]");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test22040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22040");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        int int8 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime7);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = localTime7.toDateTime((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Chronology chronology17 = dateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.secondOfDay();
        org.joda.time.DateTime dateTime19 = dateTime4.toDateTime(chronology17);
        org.joda.time.DurationField durationField20 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.hourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology17.years();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime3.toMutableDateTime(chronology17);
        org.joda.time.DateTimeField dateTimeField24 = chronology17.centuryOfEra();
        org.joda.time.DurationField durationField25 = chronology17.days();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test22041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22041");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronology();
        java.lang.Object obj6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime dateTime9 = property8.withMaximumValue();
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withPeriodAdded(readablePeriod14, (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime11.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale22.getScript();
        java.lang.String str25 = dateTimeZone20.getName(1646041809840L, locale22);
        java.util.Calendar calendar26 = dateTime11.toCalendar(locale22);
        int int27 = property8.getMaximumTextLength(locale22);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime29.setWeekyear(3);
        java.lang.Object obj32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj32);
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfMonth();
        org.joda.time.DateTime dateTime35 = property34.withMaximumValue();
        mutableDateTime29.setMillis((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTimeField dateTimeField37 = null;
        mutableDateTime29.setRounding(dateTimeField37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        mutableDateTime29.add(readableDuration39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime29.era();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime29.millisOfDay();
        org.joda.time.Chronology chronology43 = mutableDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.millisOfSecond();
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(chronology43);
        org.joda.time.DateTimeField dateTimeField48 = chronology43.weekOfWeekyear();
        java.util.Locale locale50 = java.util.Locale.UK;
        java.lang.String str51 = dateTimeField48.getAsShortText(1646006400000L, locale50);
        java.lang.String str52 = locale22.getDisplayLanguage(locale50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter2.withLocale(locale22);
        java.util.Locale locale54 = dateTimeFormatter53.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter53.withPivotYear((java.lang.Integer) 61200000);
        org.joda.time.DateTimeZone dateTimeZone57 = dateTimeFormatter56.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser58 = dateTimeFormatter56.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter59 = dateTimeFormatter56.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter56.withDefaultYear(87);
        org.joda.time.format.DateTimeParser dateTimeParser62 = dateTimeFormatter61.getParser();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.232" + "'", str25, "+00:00:00.232");
        org.junit.Assert.assertNotNull(calendar26);
// flaky:         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=1644573599254,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+410:00,offset=1476000000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=59,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=59,SECOND=59,MILLISECOND=254,ZONE_OFFSET=1476000000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "11" + "'", str51, "11");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "German" + "'", str52, "German");
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "de_DE");
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNull(dateTimeZone57);
        org.junit.Assert.assertNull(dateTimeParser58);
        org.junit.Assert.assertNull(dateTimePrinter59);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNull(dateTimeParser62);
    }

    @Test
    public void test22042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22042");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1646041809648L);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone2);
        long long5 = dateTimeZone2.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime7.setWeekyear(3);
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withPeriodAdded(readablePeriod14, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime11.getZone();
        mutableDateTime7.setZoneRetainFields(dateTimeZone17);
        long long20 = dateTimeZone2.getMillisKeepLocal(dateTimeZone17, (long) 35408);
        java.lang.String str22 = dateTimeZone2.getNameKey((long) 22);
        org.joda.time.DateTime dateTime23 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone2);
        java.util.Date date30 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        int int31 = date30.getYear();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.fromDateFields(date30);
        int int33 = localDateTime32.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property34 = localDateTime32.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfDay();
        org.joda.time.LocalDateTime localDateTime37 = property36.getLocalDateTime();
        org.joda.time.DurationField durationField38 = property36.getRangeDurationField();
        java.lang.Object obj40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(obj40);
        org.joda.time.DateTime dateTime43 = dateTime41.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime41.withPeriodAdded(readablePeriod44, (int) (byte) 10);
        org.joda.time.DateTime dateTime48 = dateTime41.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleAttributes();
        java.lang.String str54 = locale52.getScript();
        java.lang.String str55 = dateTimeZone50.getName(1646041809840L, locale52);
        java.util.Calendar calendar56 = dateTime41.toCalendar(locale52);
        java.util.Locale locale57 = java.util.Locale.US;
        java.lang.String str58 = locale52.getDisplayLanguage(locale57);
        java.util.Locale.setDefault(locale57);
        org.joda.time.LocalDateTime localDateTime60 = property36.setCopy("1970", locale57);
        int int61 = localDateTime60.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalDateTime.Property property63 = localDateTime60.property(dateTimeFieldType62);
        boolean boolean64 = localDateTime24.isSupported(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35408L + "'", long20 == 35408L);
// flaky:         org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19 + "'", int33 == 19);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.232" + "'", str55, "+00:00:00.232");
        org.junit.Assert.assertNotNull(calendar56);
// flaky:         org.junit.Assert.assertEquals(calendar56.toString(), "java.util.GregorianCalendar[time=1644573599274,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+410:00,offset=1476000000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=59,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=59,SECOND=59,MILLISECOND=274,ZONE_OFFSET=1476000000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "German" + "'", str58, "German");
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 11 + "'", int61 == 11);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test22043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22043");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        java.util.Date date23 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        date23.setYear((int) (short) 0);
        int int27 = date23.getHours();
        int int28 = date23.getHours();
        calendar15.setTime(date23);
        calendar15.set(9, 23, 100, 0, 2);
        int int36 = calendar15.getWeekYear();
        int int37 = calendar15.getMinimalDaysInFirstWeek();
        boolean boolean38 = calendar15.isWeekDateSupported();
        java.time.Instant instant39 = calendar15.toInstant();
        java.util.Date date40 = java.util.Date.from(instant39);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+Y0:00");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-61815837480000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+410:00,offset=1476000000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=11,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=69,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=2,SECOND=0,MILLISECOND=0,ZONE_OFFSET=1476000000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 23 + "'", int28 == 23);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11 + "'", int36 == 11);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Fri Feb 20 22:02:00 UTC 11");
    }

    @Test
    public void test22044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22044");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        boolean boolean8 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime.Property property9 = dateTime3.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay10 = dateTime3.toYearMonthDay();
        org.joda.time.DateTime dateTime12 = dateTime3.minusWeeks(19);
        org.joda.time.DateTime dateTime14 = dateTime3.withMillis((long) 11);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test22045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime5 = dateTime2.withField(dateTimeFieldType3, (int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone8.nextTransition((long) 35417252);
        org.joda.time.DateTime dateTime11 = dateTime5.withZoneRetainFields(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        java.lang.String str13 = dateTimeZone8.getID();
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35417252L + "'", long10 == 35417252L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+410:00" + "'", str13, "+410:00");
    }

    @Test
    public void test22046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22046");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField13 = property11.getField();
        org.joda.time.LocalDate localDate14 = property11.withMaximumValue();
        org.joda.time.DurationField durationField15 = property11.getLeapDurationField();
        org.joda.time.LocalDate localDate16 = property11.roundFloorCopy();
        org.joda.time.LocalDate.Property property17 = localDate16.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate16.minus(readablePeriod18);
        org.joda.time.LocalDate.Property property20 = localDate16.yearOfCentury();
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test22047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22047");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime10 = dateTime7.minusYears((int) (short) 1);
        long long11 = dateTime7.getMillis();
        org.joda.time.DateTime dateTime12 = dateTime7.toDateTime();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        int int16 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime15);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTime dateTime24 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology25 = dateTime18.getChronology();
        java.lang.String str26 = chronology25.toString();
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime33 = dateTime28.withPeriodAdded(readablePeriod31, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime28.getZone();
        long long37 = dateTimeZone34.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.Chronology chronology39 = chronology25.withZone(dateTimeZone34);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((java.lang.Object) dateTime7, dateTimeZone34);
        org.joda.time.LocalTime localTime42 = localTime40.withMinuteOfHour(24);
        org.joda.time.LocalTime localTime44 = localTime40.plusSeconds(10299894);
        org.joda.time.LocalTime.Property property45 = localTime40.minuteOfHour();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1644573599348L + "'", long11 == 1644573599348L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ISOChronology[+410:00]" + "'", str26, "ISOChronology[+410:00]");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1475999989L) + "'", long37 == (-1475999989L));
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(property45);
    }

    @Test
    public void test22048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22048");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1665395537052L);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks(35904);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test22049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22049");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime2.setWeekyear(3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfMonth();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeField dateTimeField10 = null;
        mutableDateTime2.setRounding(dateTimeField10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime2.add(readableDuration12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.era();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.millisOfDay();
        org.joda.time.Chronology chronology16 = mutableDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology16.weekyears();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology16.add(readablePeriod20, (-72083542597019000L), (int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = chronology16.add(readablePeriod24, (long) '4', 50400000);
        org.joda.time.DurationField durationField28 = chronology16.centuries();
        org.joda.time.DurationField durationField29 = chronology16.weeks();
        org.joda.time.DurationField durationField30 = chronology16.millis();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(45L, chronology16);
        java.lang.Object obj32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime33.withPeriodAdded(readablePeriod36, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime33.getZone();
        long long42 = dateTimeZone39.convertLocalToUTC((long) 11, true);
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusDays(50400000);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withCenturyOfEra(317);
        int int48 = localDateTime43.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime43.plusWeeks(35423);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.monthOfYear();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusSeconds(31828525);
        int int54 = localDateTime53.size();
        int[] intArray56 = chronology16.get((org.joda.time.ReadablePartial) localDateTime53, (long) 35474);
        org.joda.time.DateTimeField dateTimeField57 = chronology16.secondOfMinute();
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-72083542597019000L) + "'", long23 == (-72083542597019000L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1475999989L) + "'", long42 == (-1475999989L));
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 59 + "'", int48 == 59);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertNotNull(intArray56);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1970, 1, 18, 7235474]");
        org.junit.Assert.assertNotNull(dateTimeField57);
    }

    @Test
    public void test22050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22050");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfDay();
        long long15 = dateTimeField13.roundFloor(0L);
        java.lang.String str17 = dateTimeField13.getAsText((long) 35815);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7235" + "'", str17, "7235");
    }

    @Test
    public void test22051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22051");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        java.lang.String str13 = chronology12.toString();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.centuryOfEra();
        java.util.Locale locale17 = java.util.Locale.ROOT;
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.lang.String str20 = dateTimeField15.getAsShortText((long) 17, locale17);
        int int22 = dateTimeField15.getMinimumValue((long) 35414);
        long long25 = dateTimeField15.add((long) 35526, 35620);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[+410:00]" + "'", str13, "ISOChronology[+410:00]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19" + "'", str20, "19");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 112405863024035526L + "'", long25 == 112405863024035526L);
    }

    @Test
    public void test22052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22052");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        java.util.Date date17 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.fromDateFields(date17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean20 = localDate18.isSupported(dateTimeFieldType19);
        org.joda.time.LocalDate localDate22 = localDate18.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int24 = localDate18.indexOf(dateTimeFieldType23);
        org.joda.time.LocalDate.Property property25 = localDate18.dayOfMonth();
        boolean boolean26 = localDate10.isEqual((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate localDate28 = localDate10.plusMonths(17);
        org.joda.time.LocalDate localDate30 = localDate28.withYearOfEra(19);
        org.joda.time.LocalDate.Property property31 = localDate28.monthOfYear();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(interval32);
    }

    @Test
    public void test22053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22053");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime1.add(readablePeriod16);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test22054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22054");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) -1);
        java.util.Date date21 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.fromDateFields(date21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        int int25 = mutableDateTime1.get(dateTimeFieldType23);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime1.add(readablePeriod26, 53);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime1.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime1.add(readableDuration30);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.MIDNIGHT;
        int int35 = localTime33.compareTo((org.joda.time.ReadablePartial) localTime34);
        java.lang.Object obj36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime42 = dateTime37.withPeriodAdded(readablePeriod40, (int) (byte) 10);
        org.joda.time.DateTime dateTime43 = localTime34.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology44 = dateTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setRounding(dateTimeField45, 10299894);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 10299894");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
    }

    @Test
    public void test22055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22055");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        java.util.Date date23 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        date23.setYear((int) (short) 0);
        int int27 = date23.getHours();
        int int28 = date23.getHours();
        calendar15.setTime(date23);
        calendar15.add(0, (-27409550));
        java.lang.String str33 = calendar15.getCalendarType();
        java.util.Date date39 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate40 = org.joda.time.LocalDate.fromDateFields(date39);
        date39.setYear((int) (short) 0);
        int int43 = date39.getHours();
        int int44 = date39.getHours();
        java.time.Instant instant45 = date39.toInstant();
        int int46 = date39.getTimezoneOffset();
        calendar15.setTime(date39);
        org.joda.time.LocalDate localDate48 = org.joda.time.LocalDate.fromDateFields(date39);
        org.joda.time.LocalDate.Property property49 = localDate48.monthOfYear();
        org.joda.time.LocalDate localDate51 = property49.addToCopy(962);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+Y0:00");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-2181603540000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+410:00,offset=1476000000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1900,MONTH=11,WEEK_OF_YEAR=48,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=335,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=1476000000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50400000 + "'", int17 == 50400000);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 23 + "'", int28 == 23);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "gregory" + "'", str33, "gregory");
        org.junit.Assert.assertEquals(date39.toString(), "Tue Nov 13 23:01:00 UTC 1900");
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 23 + "'", int43 == 23);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 23 + "'", int44 == 23);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDate51);
    }

    @Test
    public void test22056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22056");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.millisOfDay();
        org.joda.time.Chronology chronology15 = mutableDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField18 = chronology15.weekyears();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology15.add(readablePeriod19, (-72083542597019000L), (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField23 = chronology15.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField25 = chronology15.millisOfSecond();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-72083542597019000L) + "'", long22 == (-72083542597019000L));
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test22057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22057");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(11);
        org.joda.time.LocalDate localDate14 = localDate10.withWeekyear(10);
        org.joda.time.LocalDate.Property property15 = localDate10.yearOfCentury();
        java.lang.Object obj16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj16);
        org.joda.time.DateTime dateTime19 = dateTime17.withYearOfEra((int) (byte) 10);
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) (byte) 10);
        boolean boolean24 = dateTime19.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(10L, chronology26);
        org.joda.time.DateTime dateTime28 = dateTime19.withFields((org.joda.time.ReadablePartial) localDate27);
        int int29 = localDate10.compareTo((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate31 = localDate27.withWeekyear(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = localDate27.getFieldType((int) (byte) 0);
        org.joda.time.LocalDate localDate35 = localDate27.plusYears(249);
        org.joda.time.LocalDate.Property property36 = localDate35.weekyear();
        org.joda.time.LocalDate localDate38 = localDate35.minusMonths(31828525);
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfEra();
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        org.joda.time.LocalDate localDate41 = property39.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField42 = property39.getField();
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(dateTimeField42);
    }

    @Test
    public void test22058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22058");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(32284539);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test22059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22059");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime7.setWeekyear(3);
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withPeriodAdded(readablePeriod14, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime11.getZone();
        mutableDateTime7.setZoneRetainFields(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getNameKey(1646041808949L);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone17);
        java.lang.String str22 = dateTimeZone17.toString();
        boolean boolean23 = dateTimeZone17.isFixed();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 70, dateTimeZone17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 31915440);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withPivotYear(32770);
        java.lang.StringBuffer stringBuffer30 = null;
        java.lang.Object obj31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj31);
        org.joda.time.DateTime dateTime34 = dateTime32.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.plus(readablePeriod35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime34.plus(readableDuration37);
        java.util.Date date44 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate45 = org.joda.time.LocalDate.fromDateFields(date44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean47 = localDate45.isSupported(dateTimeFieldType46);
        boolean boolean48 = dateTime38.isSupported(dateTimeFieldType46);
        org.joda.time.DateTime dateTime50 = dateTime38.plusHours(11);
        org.joda.time.DateTime.Property property51 = dateTime38.yearOfEra();
        java.util.Locale locale52 = java.util.Locale.FRENCH;
        java.lang.String str53 = property51.getAsText(locale52);
        org.joda.time.DateTime dateTime54 = property51.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime56 = property51.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime58 = property51.setCopy(35423);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter27.printTo(stringBuffer30, (org.joda.time.ReadableInstant) dateTime58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+410:00" + "'", str22, "+410:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "10" + "'", str53, "10");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
    }

    @Test
    public void test22060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22060");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) '4', dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime6.setWeekyear(3);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime12 = property11.withMaximumValue();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTimeField dateTimeField14 = null;
        mutableDateTime6.setRounding(dateTimeField14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime6.add(readableDuration16);
        mutableDateTime6.setSecondOfMinute((int) ' ');
        int int20 = mutableDateTime6.getYear();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.MIDNIGHT;
        int int24 = localTime22.compareTo((org.joda.time.ReadablePartial) localTime23);
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withPeriodAdded(readablePeriod29, (int) (byte) 10);
        org.joda.time.DateTime dateTime32 = localTime23.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology33 = dateTime26.getChronology();
        java.lang.String str34 = chronology33.toString();
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withPeriodAdded(readablePeriod39, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime36.getZone();
        long long45 = dateTimeZone42.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.Chronology chronology47 = chronology33.withZone(dateTimeZone42);
        org.joda.time.DurationField durationField48 = chronology33.years();
        org.joda.time.DateTime dateTime49 = mutableDateTime6.toDateTime(chronology33);
        org.joda.time.DateTime dateTime50 = mutableDateTime4.toDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) 48, chronology33);
        mutableDateTime51.setTime((long) (short) 0);
        java.lang.Object obj54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(obj54);
        org.joda.time.DateTime dateTime57 = dateTime55.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.DateTime dateTime59 = dateTime57.plus(readablePeriod58);
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.DateTime dateTime61 = dateTime57.plus(readableDuration60);
        org.joda.time.DateTime.Property property62 = dateTime57.centuryOfEra();
        org.joda.time.DateTime dateTime64 = dateTime57.minusSeconds(1997);
        org.joda.time.LocalTime localTime65 = dateTime64.toLocalTime();
        org.joda.time.DateTime dateTime67 = dateTime64.withYearOfEra(35445476);
        mutableDateTime51.setMillis((org.joda.time.ReadableInstant) dateTime64);
        mutableDateTime51.setTime(1644573163732L);
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime51.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime73 = property71.set(35462);
        org.joda.time.LocalTime localTime75 = new org.joda.time.LocalTime(757335312000052L);
        org.joda.time.LocalTime localTime77 = localTime75.minusSeconds(99);
        org.joda.time.LocalTime localTime79 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime80 = org.joda.time.LocalTime.MIDNIGHT;
        int int81 = localTime79.compareTo((org.joda.time.ReadablePartial) localTime80);
        org.joda.time.LocalTime localTime83 = localTime80.plusHours(35447363);
        org.joda.time.LocalTime.Property property84 = localTime83.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime86 = new org.joda.time.MutableDateTime(dateTimeZone85);
        long long88 = dateTimeZone85.nextTransition(1648461008949L);
        java.lang.String str89 = dateTimeZone85.getID();
        org.joda.time.DateTime dateTime90 = localTime83.toDateTimeToday(dateTimeZone85);
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean92 = dateTime90.equals((java.lang.Object) dateTimeFieldType91);
        org.joda.time.DurationFieldType durationFieldType93 = dateTimeFieldType91.getDurationType();
        boolean boolean94 = localTime75.isSupported(dateTimeFieldType91);
        int int95 = mutableDateTime73.get(dateTimeFieldType91);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ISOChronology[+410:00]" + "'", str34, "ISOChronology[+410:00]");
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1475999989L) + "'", long45 == (-1475999989L));
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(dateTimeZone85);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 1648461008949L + "'", long88 == 1648461008949L);
// flaky:         org.junit.Assert.assertEquals("'" + str89 + "' != '" + "+410:00" + "'", str89, "+410:00");
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertNotNull(dateTimeFieldType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(durationFieldType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 9 + "'", int95 == 9);
    }

    @Test
    public void test22061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22061");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.roundHalfCeiling();
        int int17 = property13.getLeapAmount();
        long long18 = property13.remainder();
        java.util.Locale locale21 = new java.util.Locale("09:50:12.275");
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale21.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime24 = property13.set("2022-02-28T09:57:54.733Z", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-28T09:57:54.733Z\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "era" + "'", str14, "era");
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-9223309901257975809L) + "'", long18 == (-9223309901257975809L));
        org.junit.Assert.assertEquals(locale21.toString(), "09:50:12.275");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test22062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22062");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundCeiling();
        org.joda.time.Chronology chronology12 = mutableDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology12);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test22063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22063");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        long long4 = dateTimeZone1.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime6.setWeekyear(3);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime10.getZone();
        mutableDateTime6.setZoneRetainFields(dateTimeZone16);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (long) 35408);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 4, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime21.addWeeks(19);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.era();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime21.weekyear();
        int int26 = mutableDateTime21.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35408L + "'", long19 == 35408L);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
    }

    @Test
    public void test22064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22064");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime5 = localTime3.minus(readablePeriod4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.roundFloorCopy();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test22065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22065");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        mutableDateTime1.setWeekyear(19);
        org.joda.time.ReadableInstant readableInstant15 = null;
        mutableDateTime1.setMillis(readableInstant15);
        java.lang.String str17 = mutableDateTime1.toString();
        mutableDateTime1.addSeconds(46);
        org.joda.time.Chronology chronology20 = mutableDateTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime22.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutableDateTime22.add(readableDuration25);
        mutableDateTime22.setSecondOfDay(4);
        mutableDateTime22.addMinutes(1);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime34 = localTime32.withSecondOfMinute((int) ' ');
        org.joda.time.LocalTime.Property property35 = localTime32.minuteOfHour();
        java.lang.Object obj36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfEra((int) (byte) 10);
        boolean boolean40 = dateTime39.isEqualNow();
        java.lang.Object obj41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(obj41);
        org.joda.time.DateTime dateTime44 = dateTime42.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime47 = dateTime42.withPeriodAdded(readablePeriod45, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime42.getZone();
        long long51 = dateTimeZone48.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime52 = dateTime39.toDateTime(dateTimeZone48);
        org.joda.time.LocalTime localTime53 = dateTime39.toLocalTime();
        org.joda.time.DateTime dateTime55 = dateTime39.plus((long) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime59 = org.joda.time.LocalTime.MIDNIGHT;
        int int60 = localTime58.compareTo((org.joda.time.ReadablePartial) localTime59);
        java.lang.Object obj61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(obj61);
        org.joda.time.DateTime dateTime64 = dateTime62.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.DateTime dateTime67 = dateTime62.withPeriodAdded(readablePeriod65, (int) (byte) 10);
        org.joda.time.DateTime dateTime68 = localTime59.toDateTime((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Chronology chronology69 = dateTime62.getChronology();
        boolean boolean70 = dateTimeFieldType56.isSupported(chronology69);
        int int71 = dateTime55.get(dateTimeFieldType56);
        int int72 = localTime32.get(dateTimeFieldType56);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime22.property(dateTimeFieldType56);
        org.joda.time.DurationFieldType durationFieldType74 = dateTimeFieldType56.getDurationType();
        boolean boolean75 = mutableDateTime1.isSupported(dateTimeFieldType56);
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime1.yearOfCentury();
        mutableDateTime1.setMillisOfDay(607);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022-02-28T11:59:59.631+410:00" + "'", str17, "2022-02-28T11:59:59.631+410:00");
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1475999989L) + "'", long51 == (-1475999989L));
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + 719 + "'", int71 == 719);
// flaky:         org.junit.Assert.assertTrue("'" + int72 + "' != '" + 120 + "'", int72 == 120);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(property76);
    }

    @Test
    public void test22066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22066");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.millisOfDay();
        org.joda.time.Chronology chronology15 = mutableDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.millisOfSecond();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology15);
        org.joda.time.DateTimeZone dateTimeZone20 = chronology15.getZone();
        org.joda.time.DateTimeField dateTimeField21 = chronology15.minuteOfHour();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test22067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22067");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 35412, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.plus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate5.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.withPeriodAdded(readablePeriod12, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime9.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str22 = locale20.getScript();
        java.lang.String str23 = dateTimeZone18.getName(1646041809840L, locale20);
        java.util.Calendar calendar24 = dateTime9.toCalendar(locale20);
        java.util.Locale locale25 = java.util.Locale.ROOT;
        java.lang.String str26 = locale25.getDisplayScript();
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.lang.String str30 = locale25.getDisplayCountry(locale27);
        java.lang.String str31 = locale20.getDisplayCountry(locale25);
        java.lang.String str32 = localDate5.toString("09:50:10.643", locale20);
        org.joda.time.LocalDate localDate34 = localDate5.minusWeeks(145);
        org.joda.time.DateTime dateTime35 = localDate5.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.MIDNIGHT;
        int int41 = localTime39.compareTo((org.joda.time.ReadablePartial) localTime40);
        java.lang.Object obj42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(obj42);
        org.joda.time.DateTime dateTime45 = dateTime43.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime48 = dateTime43.withPeriodAdded(readablePeriod46, (int) (byte) 10);
        org.joda.time.DateTime dateTime49 = localTime40.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Chronology chronology50 = dateTime43.getChronology();
        boolean boolean51 = dateTimeFieldType37.isSupported(chronology50);
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(chronology50);
        org.joda.time.DateTimeField dateTimeField53 = chronology50.weekOfWeekyear();
        org.joda.time.Chronology chronology54 = chronology50.withUTC();
        java.lang.String str55 = chronology54.toString();
        org.joda.time.Chronology chronology56 = chronology54.withUTC();
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(chronology54);
        org.joda.time.DateTimeField dateTimeField58 = chronology54.weekyearOfCentury();
        org.joda.time.LocalTime localTime59 = org.joda.time.LocalTime.fromMillisOfDay(1644573137008L, chronology54);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = localDate5.compareTo((org.joda.time.ReadablePartial) localTime59);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.232" + "'", str23, "+00:00:00.232");
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=1644573599668,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+410:00,offset=1476000000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=59,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=59,SECOND=59,MILLISECOND=668,ZONE_OFFSET=1476000000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Germany" + "'", str31, "Germany");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "09:50:10.643" + "'", str32, "09:50:10.643");
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ISOChronology[UTC]" + "'", str55, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(localTime59);
    }

    @Test
    public void test22068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22068");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 1, chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime17 = dateTime14.withField(dateTimeFieldType15, (int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar18 = dateTime17.toGregorianCalendar();
        org.joda.time.DateTime dateTime19 = dateTime17.withEarlierOffsetAtOverlap();
        boolean boolean20 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime19);
        java.lang.String str21 = dateTime11.toString();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime11.minus(readablePeriod22);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime25.setWeekyear(3);
        java.lang.Object obj28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj28);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfMonth();
        org.joda.time.DateTime dateTime31 = property30.withMaximumValue();
        mutableDateTime25.setMillis((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTimeField dateTimeField33 = null;
        mutableDateTime25.setRounding(dateTimeField33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        mutableDateTime25.add(readableDuration35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        mutableDateTime25.add(readableDuration37, (int) (byte) -1);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime25.dayOfMonth();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime25.hourOfDay();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.MIDNIGHT;
        int int45 = localTime43.compareTo((org.joda.time.ReadablePartial) localTime44);
        java.lang.Object obj46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj46);
        org.joda.time.DateTime dateTime49 = dateTime47.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime47.withPeriodAdded(readablePeriod50, (int) (byte) 10);
        org.joda.time.DateTime dateTime53 = localTime44.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Chronology chronology54 = dateTime47.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.secondOfDay();
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime25, chronology54);
        org.joda.time.DateTimeZone dateTimeZone57 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime25.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime60 = property58.add(665);
        org.joda.time.MutableDateTime mutableDateTime61 = property58.roundHalfEven();
        boolean boolean62 = dateTime23.equals((java.lang.Object) mutableDateTime61);
        org.joda.time.LocalTime localTime63 = dateTime23.toLocalTime();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(gregorianCalendar18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022-02-28T00:00:00.000+410:00" + "'", str21, "2022-02-28T00:00:00.000+410:00");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(localTime63);
    }

    @Test
    public void test22069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22069");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfDay();
        long long15 = dateTimeField13.roundFloor(0L);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime19.setWeekyear(3);
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfMonth();
        org.joda.time.DateTime dateTime25 = property24.withMaximumValue();
        mutableDateTime19.setMillis((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeField dateTimeField27 = null;
        mutableDateTime19.setRounding(dateTimeField27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        mutableDateTime19.add(readableDuration29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime19.era();
        java.lang.String str32 = property31.getName();
        org.joda.time.DateTimeField dateTimeField33 = property31.getField();
        long long36 = dateTimeField33.addWrapField((long) 10, (int) (short) -1);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.MIDNIGHT;
        int int40 = localTime38.compareTo((org.joda.time.ReadablePartial) localTime39);
        org.joda.time.LocalTime.Property property41 = localTime38.minuteOfHour();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.LocalTime localTime43 = property41.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime44 = property41.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime46 = property41.addCopy(15);
        int[] intArray53 = new int[] { (byte) 1, 11, (short) 100, (-1), (short) 100, 4 };
        int int54 = dateTimeField33.getMinimumValue((org.joda.time.ReadablePartial) localTime46, intArray53);
        int int55 = dateTimeField13.getMaximumValue((org.joda.time.ReadablePartial) localTime17, intArray53);
        org.joda.time.DateTime dateTime56 = localTime17.toDateTimeToday();
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime58.setWeekyear(3);
        java.lang.Object obj61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(obj61);
        org.joda.time.DateTime dateTime64 = dateTime62.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.DateTime dateTime67 = dateTime62.withPeriodAdded(readablePeriod65, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime62.getZone();
        mutableDateTime58.setZoneRetainFields(dateTimeZone68);
        java.util.TimeZone timeZone70 = dateTimeZone68.toTimeZone();
        org.joda.time.DateTime dateTime71 = dateTime56.toDateTime(dateTimeZone68);
        org.joda.time.DateTime dateTime73 = dateTime56.withMillis(52L);
        org.joda.time.DateTime dateTime75 = dateTime73.withMillisOfDay(232);
        java.util.Locale locale79 = new java.util.Locale("hi!", "", "");
        java.lang.String str80 = locale79.toLanguageTag();
        java.lang.String str81 = locale79.getDisplayName();
        java.lang.String str82 = locale79.getDisplayVariant();
        boolean boolean83 = dateTime75.equals((java.lang.Object) locale79);
        org.joda.time.DateTime dateTime85 = dateTime75.plusDays(807);
        org.joda.time.DateTime.Property property86 = dateTime75.weekyear();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "era" + "'", str32, "era");
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-124334351999990L) + "'", long36 == (-124334351999990L));
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 11, 100, -1, 100, 4]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 86399 + "'", int55 == 86399);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(timeZone70);
// flaky:         org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "GMT+Y0:00");
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertEquals(locale79.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "und" + "'", str80, "und");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(property86);
    }

    @Test
    public void test22070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22070");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        date1.setYear(11);
        java.util.Date date9 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromDateFields(date9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean12 = localDate10.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = localDate10.withEra(0);
        org.joda.time.LocalDate localDate16 = localDate10.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property17 = localDate10.yearOfCentury();
        java.util.Date date18 = localDate10.toDate();
        int int19 = date18.getDate();
        boolean boolean20 = date1.after(date18);
        int int21 = date1.getMonth();
        org.junit.Assert.assertEquals(date1.toString(), "Sun Jan 01 00:00:00 UTC 1911");
        org.junit.Assert.assertEquals(date9.toString(), "Thu Nov 13 23:01:00 UTC 1997");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Nov 13 00:00:00 UTC 1997");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }
}
