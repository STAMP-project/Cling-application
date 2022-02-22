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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withOffsetParsed();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime4.add(readableDuration5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate9 = localDate7.minusMonths((int) (short) -1);
        boolean boolean11 = localDate7.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology12 = localDate7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = chronology12.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.weekOfWeekyear();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate19 = localDate16.withField(dateTimeFieldType17, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.DateTime dateTime21 = localDate19.toDateTime(readableInstant20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths((int) '4');
        org.joda.time.DateTime dateTime25 = dateTime23.plus((-48469999L));
        org.joda.time.DateTime dateTime27 = dateTime23.plusSeconds(2);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate31 = localDate28.withField(dateTimeFieldType29, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDate31.toDateTime(readableInstant32);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate36 = localDate34.minusMonths((int) (short) -1);
        boolean boolean38 = localDate34.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology39 = localDate34.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology41 = chronology39.withZone(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = localDate31.toDateTimeAtCurrentTime(dateTimeZone40);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((java.lang.Object) dateTime23, dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) 54110102, dateTimeZone45);
        long long48 = dateTimeZone40.getMillisKeepLocal(dateTimeZone45, (long) (byte) -1);
        boolean boolean49 = dateTimeZone45.isFixed();
        org.joda.time.Chronology chronology50 = chronology12.withZone(dateTimeZone45);
        org.joda.time.DurationField durationField51 = chronology50.weekyears();
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime4.toMutableDateTime(chronology50);
        java.lang.String str53 = dateTimeFormatter3.print((org.joda.time.ReadableInstant) mutableDateTime52);
        java.lang.StringBuffer stringBuffer54 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(stringBuffer54, (long) 21887628);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "February 21, 2022" + "'", str53, "February 21, 2022");
    }

    @Test
    public void test20002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20002");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) (short) -1);
        java.lang.String str4 = dateTimeFormatter0.print(60000L);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withChronology(chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths((int) (short) -1);
        boolean boolean13 = localDate9.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology14 = localDate9.getChronology();
        org.joda.time.Chronology chronology15 = localDate9.getChronology();
        long long19 = chronology15.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.minusMonths((int) (short) -1);
        boolean boolean24 = localDate20.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology25 = localDate20.getChronology();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology27 = chronology25.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.weekOfWeekyear();
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = dateTimeField28.getAsText((long) (short) 1, locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(32L, chronology15, locale30);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate36 = localDate33.withField(dateTimeFieldType34, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDate36.toDateTime(readableInstant37);
        org.joda.time.DateTime dateTime40 = dateTime38.plusMonths((int) '4');
        org.joda.time.DateTime dateTime42 = dateTime40.plus((-48469999L));
        org.joda.time.DateTime dateTime44 = dateTime40.plusSeconds(2);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate48 = localDate45.withField(dateTimeFieldType46, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.DateTime dateTime50 = localDate48.toDateTime(readableInstant49);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate53 = localDate51.minusMonths((int) (short) -1);
        boolean boolean55 = localDate51.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology56 = localDate51.getChronology();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology58 = chronology56.withZone(dateTimeZone57);
        org.joda.time.DateTime dateTime59 = localDate48.toDateTimeAtCurrentTime(dateTimeZone57);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((java.lang.Object) dateTime40, dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((long) 54110102, dateTimeZone62);
        long long65 = dateTimeZone57.getMillisKeepLocal(dateTimeZone62, (long) (byte) -1);
        dateTimeParserBucket32.setZone(dateTimeZone62);
        java.util.Locale locale67 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter0.withLocale(locale67);
        java.util.Locale locale69 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter68.withLocale(locale69);
        org.joda.time.DateTimeZone dateTimeZone71 = dateTimeFormatter68.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter68.withPivotYear(54131);
        // The following exception was thrown during execution in test generation
        try {
            long long75 = dateTimeFormatter73.parseMillis("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12:01 AM" + "'", str4, "12:01 AM");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 200L + "'", long19 == 200L);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1" + "'", str31, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertNotNull(locale67);
// flaky:         org.junit.Assert.assertEquals(locale67.toString(), "en_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
        org.junit.Assert.assertNotNull(dateTimeFormatter70);
        org.junit.Assert.assertNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(dateTimeFormatter73);
    }

    @Test
    public void test20003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20003");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.plus((-48469999L));
        org.joda.time.DateTime dateTime11 = dateTime7.plusSeconds(2);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate15 = localDate12.withField(dateTimeFieldType13, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTime(readableInstant16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths((int) (short) -1);
        boolean boolean22 = localDate18.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology23 = localDate18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = chronology23.withZone(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localDate15.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) dateTime7, dateTimeZone24);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate31 = localDate28.withField(dateTimeFieldType29, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDate31.toDateTime(readableInstant32);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate36 = localDate34.minusMonths((int) (short) -1);
        boolean boolean38 = localDate34.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology39 = localDate34.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology41 = chronology39.withZone(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = localDate31.toDateTimeAtCurrentTime(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        long long45 = dateTimeZone40.getMillisKeepLocal(dateTimeZone43, (long) 2);
        org.joda.time.Interval interval46 = localDate27.toInterval(dateTimeZone40);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate50 = localDate47.withField(dateTimeFieldType48, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localDate50.toDateTime(readableInstant51);
        org.joda.time.Chronology chronology53 = dateTime52.getChronology();
        org.joda.time.DateTime dateTime55 = dateTime52.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property57 = dateTime55.property(dateTimeFieldType56);
        org.joda.time.DateTime dateTime58 = property57.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime59 = localDate27.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        java.util.Date date60 = dateTime59.toDate();
        org.joda.time.LocalDate localDate61 = org.joda.time.LocalDate.fromDateFields(date60);
        int int62 = localDate61.size();
        org.joda.time.LocalDate.Property property63 = localDate61.yearOfEra();
        org.joda.time.LocalDate localDate65 = property63.setCopy(7);
        org.joda.time.LocalDate localDate66 = property63.roundCeilingCopy();
        org.joda.time.LocalDate localDate67 = property63.withMinimumValue();
        org.joda.time.LocalDate localDate69 = localDate67.withCenturyOfEra(390);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 2L + "'", long45 == 2L);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Sat Jun 23 06:04:59 GMT 3");
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertNotNull(localDate69);
    }

    @Test
    public void test20004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20004");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.DateTime dateTime2 = dateTime0.minus(readablePeriod1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.withDurationAdded(readableDuration3, 54150331);
        org.joda.time.YearMonthDay yearMonthDay6 = dateTime2.toYearMonthDay();
        org.joda.time.DateTime dateTime8 = dateTime2.plusMinutes(204);
        org.joda.time.DateTime dateTime9 = dateTime2.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test20005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20005");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime1.add(readableDuration2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.minusMonths((int) (short) -1);
        boolean boolean9 = localDate5.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology10 = localDate5.getChronology();
        org.joda.time.Chronology chronology11 = localDate5.getChronology();
        long long15 = chronology11.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean16 = dateTimeFieldType4.isSupported(chronology11);
        mutableDateTime1.setChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField18 = chronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField19 = chronology11.centuryOfEra();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((-15897599827L), chronology11);
        org.joda.time.DateTimeField dateTimeField21 = chronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField23 = chronology11.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 200L + "'", long15 == 200L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test20006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20006");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology5 = localDate0.getChronology();
        org.joda.time.Chronology chronology6 = localDate0.getChronology();
        java.lang.String str7 = localDate0.toString();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-21" + "'", str7, "2022-02-21");
    }

    @Test
    public void test20007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20007");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.millisOfDay();
        java.lang.String str4 = property3.toString();
        org.joda.time.DurationField durationField5 = property3.getLeapDurationField();
        boolean boolean6 = property3.isLeap();
        org.joda.time.LocalTime localTime8 = property3.addCopy((long) 756);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths((int) (short) -1);
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtCurrentTime();
        int int13 = localDate9.getYear();
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property15 = localDate9.monthOfYear();
        org.joda.time.LocalDate localDate17 = property15.addWrapFieldToCopy(25);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = property3.compareTo((org.joda.time.ReadablePartial) localDate17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Property[millisOfDay]" + "'", str4, "Property[millisOfDay]");
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test20008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20008");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.String str1 = mutableDateTime0.toString();
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime0.add(readableDuration2);
        mutableDateTime0.setWeekyear((int) (short) 1);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime0.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundCeiling();
        mutableDateTime8.setMillis((long) 54110102);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.dayOfMonth();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate15 = localDate12.withField(dateTimeFieldType13, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTime(readableInstant16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMonths((int) '4');
        org.joda.time.DateTime dateTime21 = dateTime17.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime23 = dateTime17.withCenturyOfEra((int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay24 = dateTime17.toYearMonthDay();
        org.joda.time.DateTime dateTime26 = dateTime17.minus((long) 54117);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate31 = localDate29.minusMonths((int) (short) -1);
        boolean boolean33 = localDate29.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology34 = localDate29.getChronology();
        org.joda.time.Chronology chronology35 = localDate29.getChronology();
        long long39 = chronology35.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate42 = localDate40.minusMonths((int) (short) -1);
        boolean boolean44 = localDate40.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology45 = localDate40.getChronology();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology47 = chronology45.withZone(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = chronology45.weekOfWeekyear();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = dateTimeField48.getAsText((long) (short) 1, locale50);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket(32L, chronology35, locale50);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate56 = localDate53.withField(dateTimeFieldType54, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.DateTime dateTime58 = localDate56.toDateTime(readableInstant57);
        org.joda.time.DateTime dateTime60 = dateTime58.plusMonths((int) '4');
        org.joda.time.DateTime dateTime62 = dateTime60.plus((-48469999L));
        org.joda.time.DateTime dateTime64 = dateTime60.plusSeconds(2);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate68 = localDate65.withField(dateTimeFieldType66, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.DateTime dateTime70 = localDate68.toDateTime(readableInstant69);
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate73 = localDate71.minusMonths((int) (short) -1);
        boolean boolean75 = localDate71.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology76 = localDate71.getChronology();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology78 = chronology76.withZone(dateTimeZone77);
        org.joda.time.DateTime dateTime79 = localDate68.toDateTimeAtCurrentTime(dateTimeZone77);
        org.joda.time.LocalDate localDate80 = new org.joda.time.LocalDate((java.lang.Object) dateTime60, dateTimeZone77);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime83 = new org.joda.time.MutableDateTime((long) 54110102, dateTimeZone82);
        long long85 = dateTimeZone77.getMillisKeepLocal(dateTimeZone82, (long) (byte) -1);
        dateTimeParserBucket52.setZone(dateTimeZone82);
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime((long) (short) 0, dateTimeZone82);
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime(dateTimeZone82);
        org.joda.time.MutableDateTime mutableDateTime89 = new org.joda.time.MutableDateTime(dateTimeZone82);
        org.joda.time.MutableDateTime mutableDateTime90 = org.joda.time.MutableDateTime.now(dateTimeZone82);
        org.joda.time.DateTime dateTime91 = dateTime26.toDateTime(dateTimeZone82);
        mutableDateTime8.setZone(dateTimeZone82);
        boolean boolean94 = dateTimeZone82.isStandardOffset((long) 21999046);
        org.joda.time.DateTime dateTime95 = org.joda.time.DateTime.now(dateTimeZone82);
        java.lang.String str96 = dateTimeZone82.getID();
        java.lang.String str98 = dateTimeZone82.getNameKey(4801118419536L);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2022-02-21T15:11:45.397Z" + "'", str1, "2022-02-21T15:11:45.397Z");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 200L + "'", long39 == 200L);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1" + "'", str51, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertNotNull(localDate68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(localDate73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(dateTimeZone82);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-1L) + "'", long85 == (-1L));
        org.junit.Assert.assertNotNull(mutableDateTime90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(dateTime95);
// flaky:         org.junit.Assert.assertEquals("'" + str96 + "' != '" + "UTC" + "'", str96, "UTC");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "UTC" + "'", str98, "UTC");
    }

    @Test
    public void test20009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20009");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.Chronology chronology7 = localDate1.getChronology();
        long long11 = chronology7.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.minusMonths((int) (short) -1);
        boolean boolean16 = localDate12.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology17 = localDate12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = chronology17.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.weekOfWeekyear();
        long long23 = dateTimeField20.addWrapField((long) ' ', 0);
        boolean boolean24 = dateTimeField20.isSupported();
        long long27 = dateTimeField20.add(1L, (int) 'a');
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale29.getVariant();
        java.lang.String str31 = dateTimeField20.getAsShortText(100, locale29);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(10L, chronology7, locale29, (java.lang.Integer) 490);
        org.joda.time.DateTimeField dateTimeField34 = chronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.Chronology chronology36 = chronology7.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = chronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology7.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long41 = dateTimeField38.set((long) 208, "2022-02-21T15:02:00.514Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T15:02:00.514Z\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 200L + "'", long11 == 200L);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 58665600001L + "'", long27 == 58665600001L);
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "100" + "'", str31, "100");
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test20010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20010");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime5.plusMonths((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = dateTime5.withMillisOfSecond(0);
        org.joda.time.DateTime dateTime13 = dateTime5.plusHours((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate18 = localDate16.minusMonths((int) (short) -1);
        boolean boolean20 = localDate16.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology21 = localDate16.getChronology();
        org.joda.time.Chronology chronology22 = localDate16.getChronology();
        long long26 = chronology22.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate29 = localDate27.minusMonths((int) (short) -1);
        boolean boolean31 = localDate27.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology32 = localDate27.getChronology();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology34 = chronology32.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.weekOfWeekyear();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = dateTimeField35.getAsText((long) (short) 1, locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket(32L, chronology22, locale37);
        org.joda.time.DateTimeField dateTimeField40 = chronology22.secondOfMinute();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate44 = localDate41.withField(dateTimeFieldType42, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localDate44.toDateTime(readableInstant45);
        org.joda.time.DateTime dateTime48 = dateTime46.plusMonths((int) '4');
        org.joda.time.DateTime dateTime50 = dateTime48.plus((-48469999L));
        org.joda.time.DateTime dateTime52 = dateTime48.plusSeconds(2);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate56 = localDate53.withField(dateTimeFieldType54, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.DateTime dateTime58 = localDate56.toDateTime(readableInstant57);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate61 = localDate59.minusMonths((int) (short) -1);
        boolean boolean63 = localDate59.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology64 = localDate59.getChronology();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology66 = chronology64.withZone(dateTimeZone65);
        org.joda.time.DateTime dateTime67 = localDate56.toDateTimeAtCurrentTime(dateTimeZone65);
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((java.lang.Object) dateTime48, dateTimeZone65);
        org.joda.time.Chronology chronology69 = chronology22.withZone(dateTimeZone65);
        org.joda.time.DateTime dateTime70 = org.joda.time.DateTime.now(dateTimeZone65);
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate73 = localDate71.minusMonths((int) (short) -1);
        boolean boolean75 = localDate71.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate77 = localDate71.withYear((int) (byte) 1);
        org.joda.time.Chronology chronology78 = localDate77.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.era();
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        long long83 = chronology78.add(readablePeriod80, (long) (short) 100, 54113391);
        org.joda.time.DurationField durationField84 = chronology78.months();
        org.joda.time.DateTimeField dateTimeField85 = chronology78.year();
        boolean boolean86 = dateTimeZone65.equals((java.lang.Object) dateTimeField85);
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime13, dateTimeZone65);
        int int89 = dateTimeZone65.getOffset((long) 2021);
        long long93 = dateTimeZone65.convertLocalToUTC((long) 22078751, false, (long) 22106288);
        org.joda.time.LocalDate localDate94 = new org.joda.time.LocalDate(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 200L + "'", long26 == 200L);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(localDate73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(localDate77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 100L + "'", long83 == 100L);
        org.junit.Assert.assertNotNull(durationField84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 22078751L + "'", long93 == 22078751L);
    }

    @Test
    public void test20011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20011");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate10 = localDate7.withField(dateTimeFieldType8, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTime(readableInstant11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths((int) '4');
        org.joda.time.DateTime dateTime16 = dateTime12.plusMonths((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime17.add(readableDuration18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        mutableDateTime17.add(durationFieldType21, (-1));
        org.joda.time.DateTime dateTime25 = dateTime12.withFieldAdded(durationFieldType21, (int) (byte) 1);
        boolean boolean26 = dateTime5.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime28 = dateTime25.minusMillis((int) (short) 100);
        org.joda.time.DateTime.Property property29 = dateTime28.era();
        org.joda.time.DateTime dateTime30 = property29.roundCeilingCopy();
        org.joda.time.DateTime dateTime32 = dateTime30.minusWeeks(52);
        org.joda.time.DateTime dateTime34 = dateTime32.withYearOfEra(54138295);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime32.minus(readableDuration35);
        org.joda.time.DateTime dateTime38 = dateTime36.minusMillis(21884676);
        org.joda.time.DateTime dateTime40 = dateTime38.plusWeeks(54132302);
        org.joda.time.DateTime.Property property41 = dateTime38.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test20012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20012");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.Chronology chronology7 = localDate1.getChronology();
        long long11 = chronology7.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.minusMonths((int) (short) -1);
        boolean boolean16 = localDate12.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology17 = localDate12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = chronology17.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.weekOfWeekyear();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = dateTimeField20.getAsText((long) (short) 1, locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(32L, chronology7, locale22);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate28 = localDate25.withField(dateTimeFieldType26, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTime(readableInstant29);
        org.joda.time.DateTime dateTime32 = dateTime30.plusMonths((int) '4');
        org.joda.time.DateTime dateTime34 = dateTime32.plus((-48469999L));
        org.joda.time.DateTime dateTime36 = dateTime32.plusSeconds(2);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate40 = localDate37.withField(dateTimeFieldType38, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localDate40.toDateTime(readableInstant41);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate45 = localDate43.minusMonths((int) (short) -1);
        boolean boolean47 = localDate43.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology48 = localDate43.getChronology();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology50 = chronology48.withZone(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = localDate40.toDateTimeAtCurrentTime(dateTimeZone49);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((java.lang.Object) dateTime32, dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) 54110102, dateTimeZone54);
        long long57 = dateTimeZone49.getMillisKeepLocal(dateTimeZone54, (long) (byte) -1);
        dateTimeParserBucket24.setZone(dateTimeZone54);
        java.util.Locale locale59 = dateTimeParserBucket24.getLocale();
        java.lang.Object obj60 = dateTimeParserBucket24.saveState();
        java.lang.Integer int61 = dateTimeParserBucket24.getOffsetInteger();
        long long63 = dateTimeParserBucket24.computeMillis(false);
        java.util.Locale locale64 = dateTimeParserBucket24.getLocale();
        org.joda.time.DateTimeZone dateTimeZone65 = dateTimeParserBucket24.getZone();
        long long68 = dateTimeZone65.convertLocalToUTC((long) 21952066, false);
        boolean boolean69 = dateTimeZone65.isFixed();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 200L + "'", long11 == 200L);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertNotNull(locale59);
// flaky:         org.junit.Assert.assertEquals(locale59.toString(), "en_CA");
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNull(int61);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 32L + "'", long63 == 32L);
        org.junit.Assert.assertNotNull(locale64);
// flaky:         org.junit.Assert.assertEquals(locale64.toString(), "en_CA");
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 21952066L + "'", long68 == 21952066L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test20013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20013");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 83);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.minusMonths((int) (short) -1);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        int int6 = localDate2.getYear();
        org.joda.time.DateTime dateTime7 = localDate2.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property8 = localDate2.monthOfYear();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate12 = localDate9.withField(dateTimeFieldType10, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTime(readableInstant13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime14.plusSeconds((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime18.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime20.add(readableDuration21);
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.util.Calendar calendar24 = mutableDateTime20.toCalendar(locale23);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.fromCalendarFields(calendar24);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.fromCalendarFields(calendar24);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getDurationType();
        int int29 = localDate26.indexOf(dateTimeFieldType27);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime19.property(dateTimeFieldType27);
        int int31 = mutableDateTime19.getMillisOfSecond();
        int int32 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours(40);
        mutableDateTime19.setZoneRetainFields(dateTimeZone34);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime1.setDate((long) 1);
        mutableDateTime1.addSeconds(22133143);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=1645456305567,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=11,SECOND=45,MILLISECOND=567,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 567 + "'", int31 == 567);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone34);
    }

    @Test
    public void test20014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20014");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology8 = chronology6.withZone(dateTimeZone7);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeField dateTimeField10 = chronology6.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.millisOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj0, chronology6);
        org.joda.time.DurationField durationField13 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = chronology6.weekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test20015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20015");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((-1L), dateTimeZone3);
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.minus(readablePeriod7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getDurationType();
        org.joda.time.LocalTime localTime12 = localTime8.withField(dateTimeFieldType9, 0);
        int int13 = localTime12.size();
        org.joda.time.Chronology chronology14 = localTime12.getChronology();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 54115634, chronology14);
        org.joda.time.Chronology chronology16 = chronology14.withUTC();
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("2022-02-22T00:00:00.000+15:02:03.198");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 354, chronology14, locale18, (java.lang.Integer) 22139077, (-57908));
        java.lang.Object obj22 = dateTimeParserBucket21.saveState();
        dateTimeParserBucket21.setOffset(54607);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test20016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20016");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime5.plusMonths((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime10.add(readableDuration11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        mutableDateTime10.add(durationFieldType14, (-1));
        org.joda.time.DateTime dateTime18 = dateTime5.withFieldAdded(durationFieldType14, (int) (byte) 1);
        int int19 = dateTime5.getSecondOfDay();
        org.joda.time.DateTime dateTime21 = dateTime5.minusHours(100);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes(54123);
        boolean boolean25 = dateTime23.isAfter(4201328032L);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate28 = localDate26.minusMonths((int) (short) -1);
        boolean boolean30 = localDate26.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology31 = localDate26.getChronology();
        org.joda.time.Chronology chronology32 = localDate26.getChronology();
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.now(chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = chronology32.getZone();
        int int36 = dateTimeZone34.getOffsetFromLocal((long) 427);
        java.lang.String str37 = dateTimeZone34.getID();
        long long41 = dateTimeZone34.convertLocalToUTC(2074606503753621972L, true, (long) 95);
        org.joda.time.DateTime dateTime42 = dateTime23.withZoneRetainFields(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 54705 + "'", int19 == 54705);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 2074606503753621972L + "'", long41 == 2074606503753621972L);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    public void test20017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20017");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology8 = chronology6.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.weekOfWeekyear();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate13 = localDate10.withField(dateTimeFieldType11, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTime(readableInstant14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMonths((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.plus((-48469999L));
        org.joda.time.DateTime dateTime21 = dateTime17.plusSeconds(2);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate25 = localDate22.withField(dateTimeFieldType23, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.DateTime dateTime27 = localDate25.toDateTime(readableInstant26);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate30 = localDate28.minusMonths((int) (short) -1);
        boolean boolean32 = localDate28.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology33 = localDate28.getChronology();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology35 = chronology33.withZone(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = localDate25.toDateTimeAtCurrentTime(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((java.lang.Object) dateTime17, dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 54110102, dateTimeZone39);
        long long42 = dateTimeZone34.getMillisKeepLocal(dateTimeZone39, (long) (byte) -1);
        boolean boolean43 = dateTimeZone39.isFixed();
        org.joda.time.Chronology chronology44 = chronology6.withZone(dateTimeZone39);
        org.joda.time.DurationField durationField45 = chronology44.weekyears();
        boolean boolean46 = dateTimeFieldType0.isSupported(chronology44);
        org.joda.time.DateTimeField dateTimeField47 = chronology44.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField48 = chronology44.minuteOfHour();
        java.lang.String str50 = dateTimeField48.getAsText((long) 555);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.yearOfEra();
        int int53 = localDateTime51.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime55 = property54.withMinimumValue();
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.yearOfEra();
        org.joda.time.LocalDateTime localDateTime57 = property56.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime58 = property56.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime59 = property56.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime();
        int int62 = localDateTime61.getCenturyOfEra();
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration64 = null;
        mutableDateTime63.add(readableDuration64);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType67 = dateTimeFieldType66.getDurationType();
        mutableDateTime63.add(durationFieldType67, (-1));
        org.joda.time.LocalDateTime localDateTime71 = localDateTime61.withFieldAdded(durationFieldType67, (int) (byte) 0);
        int int72 = localDateTime61.getMillisOfSecond();
        int int73 = localDateTime61.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property74 = localDateTime61.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.LocalDateTime localDateTime76 = localDateTime61.minus(readablePeriod75);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.plusDays(54149188);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime76.withYear((-98));
        int[] intArray81 = localDateTime76.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray83 = dateTimeField48.addWrapPartial((org.joda.time.ReadablePartial) localDateTime59, (-7297546), intArray81, 21947);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -7297546");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0" + "'", str50, "0");
        org.junit.Assert.assertNotNull(property52);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 54705625 + "'", int53 == 54705625);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 20 + "'", int62 == 20);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertNotNull(localDateTime71);
// flaky:         org.junit.Assert.assertTrue("'" + int72 + "' != '" + 625 + "'", int72 == 625);
// flaky:         org.junit.Assert.assertTrue("'" + int73 + "' != '" + 45 + "'", int73 == 45);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(intArray81);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[2022, 2, 21, 54705625]");
    }

    @Test
    public void test20018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20018");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.plus((-48469999L));
        org.joda.time.DateTime dateTime11 = dateTime7.plusSeconds(2);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays((int) (short) 10);
        org.joda.time.LocalDate localDate14 = dateTime13.toLocalDate();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime15.add(readableDuration16);
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Calendar calendar19 = mutableDateTime15.toCalendar(locale18);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate23 = localDate20.withField(dateTimeFieldType21, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDate23.toDateTime(readableInstant24);
        mutableDateTime15.setMillis(readableInstant24);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate30 = localDate27.withField(dateTimeFieldType28, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTime(readableInstant31);
        org.joda.time.DateTime dateTime34 = dateTime32.plusMonths((int) '4');
        org.joda.time.DateTime dateTime36 = dateTime34.plus((-48469999L));
        org.joda.time.DateTime dateTime38 = dateTime34.plusSeconds(2);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate42 = localDate39.withField(dateTimeFieldType40, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localDate42.toDateTime(readableInstant43);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate47 = localDate45.minusMonths((int) (short) -1);
        boolean boolean49 = localDate45.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology50 = localDate45.getChronology();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology52 = chronology50.withZone(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = localDate42.toDateTimeAtCurrentTime(dateTimeZone51);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((java.lang.Object) dateTime34, dateTimeZone51);
        mutableDateTime15.setZone(dateTimeZone51);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate(dateTimeZone51);
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateMidnight dateMidnight58 = localDate14.toDateMidnight(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime59 = dateMidnight58.toMutableDateTimeISO();
        int int60 = mutableDateTime59.getHourOfDay();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate64 = localDate62.minusMonths((int) (short) -1);
        boolean boolean66 = localDate62.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology67 = localDate62.getChronology();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology69 = chronology67.withZone(dateTimeZone68);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime((-133144884L), dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(dateTimeZone68);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        mutableDateTime72.add(readablePeriod73, 54150331);
        mutableDateTime59.setDate((org.joda.time.ReadableInstant) mutableDateTime72);
        int int77 = mutableDateTime59.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1645456305642,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=11,SECOND=45,MILLISECOND=642,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
    }

    @Test
    public void test20019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20019");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getEra();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusMonths(21);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minus(readablePeriod4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withYearOfEra(21);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withYearOfEra(54118820);
        int int10 = localDateTime3.size();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.plusSeconds(563);
        int int13 = localDateTime3.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime3.plusHours(21976);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMonths(494);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test20020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20020");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate10 = localDate7.withField(dateTimeFieldType8, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTime(readableInstant11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths((int) '4');
        org.joda.time.DateTime dateTime16 = dateTime12.plusMonths((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime17.add(readableDuration18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        mutableDateTime17.add(durationFieldType21, (-1));
        org.joda.time.DateTime dateTime25 = dateTime12.withFieldAdded(durationFieldType21, (int) (byte) 1);
        boolean boolean26 = dateTime5.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime28 = dateTime25.minusMillis((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.minus(readableDuration29);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate33 = localDate31.minusMonths((int) (short) -1);
        boolean boolean35 = localDate31.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology36 = localDate31.getChronology();
        org.joda.time.Chronology chronology37 = localDate31.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.minutes();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.hourOfHalfday();
        org.joda.time.DateTime dateTime40 = dateTime30.toDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(chronology37);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTime40);
    }

    @Test
    public void test20021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20021");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology5 = localDate0.getChronology();
        long long11 = chronology5.getDateTimeMillis((long) (-1), (int) (short) 10, (int) ' ', (int) (byte) 10, 1);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField13 = chronology5.minuteOfHour();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField15 = chronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology5.millis();
        org.joda.time.DurationField durationField19 = chronology5.halfdays();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-48469999L) + "'", long11 == (-48469999L));
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test20022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20022");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.DateTime dateTime8 = dateTime5.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property10 = dateTime8.property(dateTimeFieldType9);
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.DateTime dateTime12 = property10.getDateTime();
        java.lang.String str13 = property10.getAsString();
        org.joda.time.DateTime dateTime14 = property10.withMaximumValue();
        org.joda.time.DateTime.Property property15 = dateTime14.secondOfDay();
        org.joda.time.DateTime dateTime17 = property15.addToCopy(7);
        org.joda.time.DateTimeField dateTimeField18 = property15.getField();
        org.joda.time.DateTime dateTime19 = property15.roundFloorCopy();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.minusMonths((int) (short) -1);
        boolean boolean25 = localDate21.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology26 = localDate21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology28 = chronology26.withZone(dateTimeZone27);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(chronology26);
        org.joda.time.DurationField durationField30 = chronology26.months();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        int int32 = localDate31.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = localDate31.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.Chronology chronology36 = chronology26.withZone(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(1000L, chronology36);
        org.joda.time.Instant instant38 = mutableDateTime37.toInstant();
        int int39 = mutableDateTime37.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime37.minuteOfHour();
        long long41 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(property40);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 9223371989795504L + "'", long41 == 9223371989795504L);
    }

    @Test
    public void test20023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20023");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.String str1 = mutableDateTime0.toString();
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime0.add(readableDuration2);
        mutableDateTime0.setWeekyear((int) (short) 1);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime0.year();
        mutableDateTime0.addWeekyears(3);
        int int9 = mutableDateTime0.getYearOfCentury();
        mutableDateTime0.addWeekyears((int) 'x');
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime0.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime12.setDate(22353637, 8331, 21882000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8331 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2022-02-21T15:11:45.761Z" + "'", str1, "2022-02-21T15:11:45.761Z");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test20024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20024");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate4 = localDate1.withField(dateTimeFieldType2, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(readableInstant5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime6.plusMonths((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime11.add(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        mutableDateTime11.add(durationFieldType15, (-1));
        org.joda.time.DateTime dateTime19 = dateTime6.withFieldAdded(durationFieldType15, (int) (byte) 1);
        mutableDateTime0.add(durationFieldType15, 86399999);
        org.joda.time.Instant instant22 = mutableDateTime0.toInstant();
        java.lang.String str23 = instant22.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(instant22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022-02-22T15:11:45.772Z" + "'", str23, "2022-02-22T15:11:45.772Z");
    }

    @Test
    public void test20025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20025");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-21T15:11:06.388Z", (double) 22154599);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.2154599E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20026");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withSecondOfMinute(22067788);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22067788 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test20027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20027");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusMinutes((int) (short) 10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusWeeks(2022);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusYears((-1));
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusSeconds(6);
        int int10 = localDateTime9.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withField(dateTimeFieldType11, 10);
        int int14 = localDateTime13.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusHours(556);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusYears(21896418);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusYears(22077);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfYear();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1984 + "'", int10 == 1984);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 143 + "'", int14 == 143);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test20028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20028");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.plus((-48469999L));
        org.joda.time.DateTime dateTime11 = dateTime7.plusSeconds(2);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate15 = localDate12.withField(dateTimeFieldType13, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTime(readableInstant16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths((int) (short) -1);
        boolean boolean22 = localDate18.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology23 = localDate18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = chronology23.withZone(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localDate15.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) dateTime7, dateTimeZone24);
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone24);
        boolean boolean30 = dateTime28.isEqual((long) (byte) 100);
        int int31 = dateTime28.getMinuteOfHour();
        org.joda.time.DateTime dateTime32 = dateTime28.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property33 = dateTime28.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 11 + "'", int31 == 11);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test20029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20029");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMinuteOfHour((int) (byte) 10);
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMinimumValue();
        int int7 = localTime6.size();
        org.joda.time.LocalTime localTime9 = localTime6.minusMinutes((int) (short) -1);
        org.joda.time.LocalTime localTime11 = localTime6.plusSeconds(54);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(59000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        boolean boolean16 = mutableDateTime13.isSupported(dateTimeFieldType14);
        boolean boolean17 = localTime6.isSupported(dateTimeFieldType14);
        org.joda.time.LocalTime.Property property18 = localTime6.hourOfDay();
        org.joda.time.LocalTime.Property property19 = localTime6.minuteOfHour();
        org.joda.time.LocalTime localTime21 = property19.addCopy(910);
        org.joda.time.LocalTime localTime22 = property19.withMinimumValue();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
    }

    @Test
    public void test20030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20030");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusYears((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        int int8 = localDateTime6.getEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusMinutes(21881495);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime10.getFields();
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54705840 + "'", int2 == 54705840);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
    }

    @Test
    public void test20031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20031");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        org.joda.time.DateTime dateTime3 = localDate0.toDateTimeAtCurrentTime();
        int int4 = localDate0.getYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtCurrentTime(dateTimeZone5);
        long long8 = dateTime7.getMillis();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate12 = localDate9.withField(dateTimeFieldType10, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTime(readableInstant13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.plus(readableDuration15);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfMonth();
        org.joda.time.DateTime.Property property18 = dateTime16.dayOfYear();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate22 = localDate19.withField(dateTimeFieldType20, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTime(readableInstant23);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTime dateTime27 = dateTime24.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property29 = dateTime27.property(dateTimeFieldType28);
        boolean boolean30 = dateTime16.isSupported(dateTimeFieldType28);
        org.joda.time.DateTime dateTime32 = dateTime7.withField(dateTimeFieldType28, 54128391);
        boolean boolean34 = dateTime7.isBefore((long) 44);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str36 = dateTimeFieldType35.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime38 = dateTime7.withField(dateTimeFieldType35, 21919039);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21919039 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1645456305855L + "'", long8 == 1645456305855L);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hourOfDay" + "'", str36, "hourOfDay");
    }

    @Test
    public void test20032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20032");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.DateTime dateTime8 = dateTime5.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property10 = dateTime8.property(dateTimeFieldType9);
        org.joda.time.DateTime dateTime12 = dateTime8.withMillisOfSecond(0);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 8);
        long long20 = dateTimeZone17.convertLocalToUTC(79735116L, false);
        long long24 = dateTimeZone17.convertLocalToUTC((long) (-363), false, (long) 524);
        java.lang.String str26 = dateTimeZone17.getNameKey((long) 914);
        org.joda.time.DateTime dateTime27 = dateTime12.withZone(dateTimeZone17);
        org.joda.time.LocalDate localDate28 = dateTime27.toLocalDate();
        org.joda.time.DateTime dateTime30 = dateTime27.plus((long) 22087140);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-133144884L) + "'", long20 == (-133144884L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-212880363L) + "'", long24 == (-212880363L));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test20033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20033");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.DateTime dateTime8 = dateTime5.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property10 = dateTime8.property(dateTimeFieldType9);
        org.joda.time.DateTime dateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.minusMonths((int) (short) -1);
        boolean boolean16 = localDate12.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology17 = localDate12.getChronology();
        org.joda.time.Chronology chronology18 = localDate12.getChronology();
        long long22 = chronology18.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.DateTime dateTime23 = dateTime11.toDateTime(chronology18);
        int int24 = dateTime23.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutableDateTime25.add(readableDuration26);
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.util.Calendar calendar29 = mutableDateTime25.toCalendar(locale28);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate33 = localDate30.withField(dateTimeFieldType31, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localDate33.toDateTime(readableInstant34);
        mutableDateTime25.setMillis(readableInstant34);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime25.secondOfDay();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime25.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property38.getFieldType();
        int int40 = dateTime23.get(dateTimeFieldType39);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate44 = localDate41.withField(dateTimeFieldType42, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localDate44.toDateTime(readableInstant45);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate49 = localDate47.minusMonths((int) (short) -1);
        boolean boolean51 = localDate47.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology52 = localDate47.getChronology();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology54 = chronology52.withZone(dateTimeZone53);
        org.joda.time.DateTime dateTime55 = localDate44.toDateTimeAtCurrentTime(dateTimeZone53);
        boolean boolean56 = dateTimeZone53.isFixed();
        int int58 = dateTimeZone53.getOffset((-768609154156284000L));
        org.joda.time.DateTime dateTime59 = dateTime23.withZone(dateTimeZone53);
        org.joda.time.DateTime.Property property60 = dateTime23.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 200L + "'", long22 == 200L);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1645456305882,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=11,SECOND=45,MILLISECOND=882,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
    }

    @Test
    public void test20034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20034");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.plus((-48469999L));
        org.joda.time.DateTime dateTime11 = dateTime7.plusSeconds(2);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate15 = localDate12.withField(dateTimeFieldType13, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTime(readableInstant16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths((int) (short) -1);
        boolean boolean22 = localDate18.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology23 = localDate18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = chronology23.withZone(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localDate15.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) dateTime7, dateTimeZone24);
        java.lang.String str28 = dateTimeZone24.getID();
        java.lang.String str29 = dateTimeZone24.getID();
        boolean boolean30 = dateTimeZone24.isFixed();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test20035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20035");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMinuteOfHour((int) (byte) 10);
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMinimumValue();
        int int7 = localTime6.size();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime6.minus(readablePeriod8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getRangeDurationType();
        boolean boolean12 = localTime9.isSupported(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20036");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime0.toCalendar(locale3);
        java.lang.String str5 = mutableDateTime0.toString();
        mutableDateTime0.addWeeks(901);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime0.copy();
        int int9 = mutableDateTime0.getDayOfWeek();
        mutableDateTime0.setMillisOfDay(59);
        int int12 = mutableDateTime0.getRoundingMode();
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645456305942,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=11,SECOND=45,MILLISECOND=942,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-21T15:11:45.942Z" + "'", str5, "2022-02-21T15:11:45.942Z");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test20037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20037");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate2.equals((java.lang.Object) (byte) 10);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtStartOfDay();
        int int6 = localDate2.size();
        int int7 = localDate2.getYearOfEra();
        org.joda.time.LocalDate.Property property8 = localDate2.era();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DurationField durationField10 = dateTimeField9.getRangeDurationField();
        java.util.Locale locale15 = new java.util.Locale("English (United Kingdom)", "2022-02-21T15:07:56.224+00:00:00.035", "2022-02-22T06:04:40.875+15:02:03.198");
        java.lang.String str16 = dateTimeField9.getAsShortText((long) 22111, locale15);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertEquals(locale15.toString(), "english (united kingdom)_2022-02-21T15:07:56.224+00:00:00.035_2022-02-22T06:04:40.875+15:02:03.198");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AD" + "'", str16, "AD");
    }

    @Test
    public void test20038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20038");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.minusMonths((int) (short) -1);
        boolean boolean10 = localDate6.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology11 = localDate6.getChronology();
        org.joda.time.Chronology chronology12 = localDate6.getChronology();
        long long16 = chronology12.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean17 = dateTimeFieldType5.isSupported(chronology12);
        mutableDateTime2.setChronology(chronology12);
        org.joda.time.DurationField durationField19 = chronology12.minutes();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology12.getZone();
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now(chronology12);
        long long25 = chronology12.add(4201328032L, 200L, 54130144);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter0.withChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField27 = chronology12.millisOfSecond();
        java.lang.String str29 = dateTimeField27.getAsText((long) 54120);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 200L + "'", long16 == 200L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 15027356832L + "'", long25 == 15027356832L);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "120" + "'", str29, "120");
    }

    @Test
    public void test20039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20039");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getEra();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minus(readablePeriod2);
        int int4 = localDateTime3.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusWeeks(0);
        int int7 = localDateTime6.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        int int9 = localDateTime8.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minus(readablePeriod10);
        int int12 = localDateTime6.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime6.withYearOfCentury(54128391);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54128391 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 976 + "'", int7 == 976);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test20040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20040");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.Chronology chronology7 = localDate1.getChronology();
        long long11 = chronology7.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.minusMonths((int) (short) -1);
        boolean boolean16 = localDate12.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology17 = localDate12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = chronology17.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.weekOfWeekyear();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = dateTimeField20.getAsText((long) (short) 1, locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(32L, chronology7, locale22);
        org.joda.time.DateTimeField dateTimeField25 = chronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = chronology7.year();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((-1L), chronology28);
        int int30 = localDate29.getWeekyear();
        int int31 = dateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) localDate29);
        int int32 = localDate29.getYearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration34 = null;
        mutableDateTime33.add(readableDuration34);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.util.Calendar calendar37 = mutableDateTime33.toCalendar(locale36);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate41 = localDate38.withField(dateTimeFieldType39, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localDate41.toDateTime(readableInstant42);
        mutableDateTime33.setMillis(readableInstant42);
        org.joda.time.DateTime dateTime45 = localDate29.toDateTime((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate48 = localDate46.minusMonths((int) (short) -1);
        boolean boolean50 = localDate46.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate52 = localDate46.withYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property53 = localDate46.yearOfEra();
        org.joda.time.LocalDate localDate54 = property53.roundFloorCopy();
        org.joda.time.LocalDate localDate55 = property53.roundFloorCopy();
        int int56 = localDate55.getEra();
        int int57 = localDate29.compareTo((org.joda.time.ReadablePartial) localDate55);
        org.joda.time.LocalDate.Property property58 = localDate29.centuryOfEra();
        java.lang.Object obj59 = null;
        boolean boolean60 = localDate29.equals(obj59);
        org.joda.time.LocalDate localDate62 = localDate29.withDayOfYear(262);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray63 = localDate62.getFieldTypes();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 200L + "'", long11 == 200L);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-292275054) + "'", int31 == (-292275054));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 69 + "'", int32 == 69);
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar37);
// flaky:         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=1645456305984,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=11,SECOND=45,MILLISECOND=984,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray63);
    }

    @Test
    public void test20041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20041");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getEra();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minus(readablePeriod2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.minusDays(54131261);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.minusMillis(21882503);
        int int8 = localDateTime0.getEra();
        int int9 = localDateTime0.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.minus(readablePeriod10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime11.toString("2022-02-21T15:06:29.539Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test20042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20042");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (short) 10);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusWeeks(2022);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusYears((-1));
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withDurationAdded(readableDuration9, 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withDurationAdded(readableDuration12, 10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.minusMonths((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.plusSeconds(86399999);
        java.lang.String str19 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.dayOfWeek();
        java.lang.String str21 = property20.getName();
        org.joda.time.LocalDateTime localDateTime22 = property20.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime24 = property20.addToCopy((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime25 = property20.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusMillis(21932585);
        int int28 = localDateTime27.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "17/02/87" + "'", str19, "17/02/87");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "dayOfWeek" + "'", str21, "dayOfWeek");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test20043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20043");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.minusMonths((int) (short) -1);
        boolean boolean10 = localDate6.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology11 = localDate6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology13 = chronology11.withZone(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate3.toDateTimeAtCurrentTime(dateTimeZone12);
        int int15 = dateTime14.getMinuteOfHour();
        int int16 = dateTime14.getYear();
        org.joda.time.Chronology chronology17 = dateTime14.getChronology();
        org.joda.time.DateTime.Property property18 = dateTime14.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test20044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20044");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology5 = localDate0.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = chronology5.withZone(dateTimeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField9 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = chronology5.clockhourOfDay();
        org.joda.time.Chronology chronology14 = chronology5.withUTC();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test20045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20045");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusMinutes((int) (short) 10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusWeeks(2022);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusYears((-1));
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, 0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withDurationAdded(readableDuration11, 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withDayOfYear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        org.joda.time.LocalDateTime localDateTime19 = property16.addToCopy((long) 99);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test20046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20046");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology5 = localDate0.getChronology();
        org.joda.time.Chronology chronology6 = localDate0.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.seconds();
        java.lang.String str8 = chronology6.toString();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(chronology6);
        org.joda.time.DateTimeField dateTimeField10 = chronology6.year();
        long long12 = dateTimeField10.roundCeiling((long) 54140332);
        org.joda.time.DurationField durationField13 = dateTimeField10.getRangeDurationField();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[UTC]" + "'", str8, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 31536000000L + "'", long12 == 31536000000L);
        org.junit.Assert.assertNull(durationField13);
    }

    @Test
    public void test20047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20047");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology5 = localDate0.getChronology();
        org.joda.time.Chronology chronology6 = localDate0.getChronology();
        long long10 = chronology6.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.weekyearOfCentury();
        boolean boolean12 = dateTimeField11.isLenient();
        org.joda.time.ReadablePartial readablePartial13 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(54123198);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate21 = localDate19.minusMonths((int) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtCurrentTime();
        int int23 = localDate19.getYear();
        org.joda.time.DateTime dateTime24 = localDate19.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property25 = localDate19.monthOfYear();
        org.joda.time.LocalDate localDate27 = property25.addWrapFieldToCopy(35);
        org.joda.time.tz.NameProvider nameProvider28 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.lang.String str32 = nameProvider28.getShortName(locale29, "2022-02-21T15:02:20.959Z", "2022-02-21T15:02:24.434Z");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider28);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate37 = localDate34.withField(dateTimeFieldType35, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localDate37.toDateTime(readableInstant38);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate44 = localDate41.withField(dateTimeFieldType42, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localDate44.toDateTime(readableInstant45);
        org.joda.time.DateTime dateTime48 = dateTime46.plusMonths((int) '4');
        org.joda.time.DateTime dateTime50 = dateTime46.plusMonths((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration52 = null;
        mutableDateTime51.add(readableDuration52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType55 = dateTimeFieldType54.getDurationType();
        mutableDateTime51.add(durationFieldType55, (-1));
        org.joda.time.DateTime dateTime59 = dateTime46.withFieldAdded(durationFieldType55, (int) (byte) 1);
        boolean boolean60 = dateTime39.isAfter((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate63 = localDate61.minusMonths((int) (short) -1);
        boolean boolean65 = localDate61.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology66 = localDate61.getChronology();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology68 = chronology66.withZone(dateTimeZone67);
        org.joda.time.DateTimeField dateTimeField69 = chronology66.weekOfWeekyear();
        long long72 = dateTimeField69.addWrapField((long) ' ', 0);
        boolean boolean73 = dateTimeField69.isSupported();
        long long76 = dateTimeField69.add(1L, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = dateTimeField69.getType();
        java.util.Locale locale79 = java.util.Locale.getDefault();
        java.lang.String str80 = dateTimeField69.getAsText((long) (byte) 1, locale79);
        java.lang.String str81 = locale79.getLanguage();
        java.util.Calendar calendar82 = dateTime59.toCalendar(locale79);
        java.util.Locale locale83 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str84 = locale79.getDisplayName(locale83);
        java.lang.String str87 = nameProvider28.getShortName(locale83, "2022-02-22T06:05:17.152+15:02:03.198", "2022-02-21T15:01:58.714Z");
        java.lang.String str88 = property25.getAsText(locale83);
        java.lang.String str89 = dateTimeZone16.getShortName(4147195053L, locale83);
        java.lang.String str90 = dateTimeField11.getAsText(readablePartial13, 21959021, locale83);
        java.util.Locale locale94 = java.util.Locale.forLanguageTag("2022-02-21T15:01:59.080Z");
        java.util.Set<java.lang.String> strSet95 = locale94.getUnicodeLocaleAttributes();
        java.lang.String str96 = locale94.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            long long97 = dateTimeField11.set((long) 54597, "2022-02-24T02:16:18.959+59:08", locale94);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-24T02:16:18.959+59:08\" for weekyearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 200L + "'", long10 == 200L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(nameProvider28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 32L + "'", long72 == 32L);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 58665600001L + "'", long76 == 58665600001L);
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertNotNull(locale79);
// flaky:         org.junit.Assert.assertEquals(locale79.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "1" + "'", str80, "1");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "en" + "'", str81, "en");
        org.junit.Assert.assertNotNull(calendar82);
// flaky:         org.junit.Assert.assertEquals(calendar82.toString(), "java.util.GregorianCalendar[time=-62194294093916,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=5,DAY_OF_MONTH=24,DAY_OF_YEAR=55,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=49,MILLISECOND=282,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\u82f1\u6587\u52a0\u62ff\u5927)" + "'", str84, "\u82f1\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "\u4e8c\u6708" + "'", str88, "\u4e8c\u6708");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "+15:02:03.198" + "'", str89, "+15:02:03.198");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "21959021" + "'", str90, "21959021");
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "");
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test20048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20048");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getMillisOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withPeriodAdded(readablePeriod3, 2022);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        int int8 = property7.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime9 = property7.getLocalDateTime();
        int int10 = localDateTime9.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusWeeks(2020);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22429305 + "'", int2 == 22429305);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 305 + "'", int10 == 305);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test20049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20049");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.plus((-48469999L));
        org.joda.time.DateTime dateTime11 = dateTime7.plusSeconds(2);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.plus(readablePeriod13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.plus(readablePeriod16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime17.withDate(22170522, 21892595, 626);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21892595 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test20050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20050");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusHours(47);
        org.joda.time.DateTime dateTime4 = localDateTime3.toDateTime();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.plus(readableDuration5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfWeek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test20051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20051");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.plus((-48469999L));
        org.joda.time.DateTime dateTime11 = dateTime7.plusSeconds(2);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate15 = localDate12.withField(dateTimeFieldType13, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTime(readableInstant16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths((int) (short) -1);
        boolean boolean22 = localDate18.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology23 = localDate18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = chronology23.withZone(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localDate15.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) dateTime7, dateTimeZone24);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime29.add(readableDuration30);
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.util.Calendar calendar33 = mutableDateTime29.toCalendar(locale32);
        boolean boolean34 = dateTime28.isAfter((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.DateTime.Property property35 = dateTime28.hourOfDay();
        java.util.Date date36 = dateTime28.toDate();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar33);
// flaky:         org.junit.Assert.assertEquals(calendar33.toString(), "java.util.GregorianCalendar[time=1645456306132,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=49,MILLISECOND=330,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Mon Feb 21 21:16:45 GMT 2022");
    }

    @Test
    public void test20052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20052");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMinuteOfHour((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        int int8 = localTime6.getValue((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((-1L), dateTimeZone10);
        org.joda.time.LocalTime localTime13 = localTime11.withMinuteOfHour((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime11.minus(readablePeriod14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getDurationType();
        org.joda.time.LocalTime localTime19 = localTime15.withField(dateTimeFieldType16, 0);
        int int20 = localTime6.get(dateTimeFieldType16);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime6.minus(readablePeriod21);
        org.joda.time.LocalTime.Property property23 = localTime6.millisOfSecond();
        org.joda.time.LocalTime.Property property24 = localTime6.minuteOfHour();
        org.joda.time.LocalTime localTime25 = property24.roundHalfFloorCopy();
        int int26 = localTime25.getMillisOfDay();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 197 + "'", int20 == 197);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 54120000 + "'", int26 == 54120000);
    }

    @Test
    public void test20053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20053");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        java.lang.String str8 = languageRange1.getRange();
        java.lang.String str9 = languageRange1.getRange();
        double double10 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eng" + "'", str7, "eng");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eng" + "'", str8, "eng");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "eng" + "'", str9, "eng");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test20054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20054");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.plus((-48469999L));
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfEra();
        org.joda.time.DateTime dateTime12 = dateTime7.plusHours((int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes(54153473);
        org.joda.time.DateTime dateTime16 = dateTime12.withYearOfEra(29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime12.withWeekOfWeekyear(8177);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8177 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test20055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20055");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.String str1 = mutableDateTime0.toString();
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime0.add(readableDuration2);
        mutableDateTime0.setWeekyear((int) (short) 1);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime0.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfEven();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate11 = localDate8.withField(dateTimeFieldType9, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTime(readableInstant12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime13.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property18 = dateTime16.property(dateTimeFieldType17);
        org.joda.time.DateTime dateTime19 = property18.withMinimumValue();
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfMonth();
        boolean boolean21 = mutableDateTime7.isBefore((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime.Property property22 = dateTime19.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime19.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.copy();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.centuryOfEra();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2022-02-22T06:13:49.384+15:02:03.198" + "'", str1, "2022-02-22T06:13:49.384+15:02:03.198");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test20056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20056");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate4 = localDate1.withField(dateTimeFieldType2, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(readableInstant5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate9 = localDate7.minusMonths((int) (short) -1);
        boolean boolean11 = localDate7.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology12 = localDate7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = chronology12.withZone(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone13);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate20 = localDate17.withField(dateTimeFieldType18, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTime(readableInstant21);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime22.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property27 = dateTime25.property(dateTimeFieldType26);
        org.joda.time.DateTime dateTime28 = property27.withMinimumValue();
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes(21887333);
        org.joda.time.DateTime dateTime32 = dateTime28.plus((long) 25);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime28.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime34 = dateTime28.toDateTime();
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) dateTime28);
        mutableDateTime16.setMillisOfDay(21974401);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime16.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setDate(272, 21928334, 21999836);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21928334 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test20057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20057");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3);
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.util.Calendar calendar6 = mutableDateTime2.toCalendar(locale5);
        java.lang.String str7 = mutableDateTime2.toString();
        mutableDateTime2.addWeeks(901);
        org.joda.time.Chronology chronology10 = mutableDateTime2.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate16 = localDate14.minusMonths((int) (short) -1);
        boolean boolean18 = localDate14.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology19 = localDate14.getChronology();
        org.joda.time.Chronology chronology20 = localDate14.getChronology();
        long long24 = chronology20.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean25 = dateTimeFieldType13.isSupported(chronology20);
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 8, chronology20, locale26);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate32 = localDate30.minusMonths((int) (short) -1);
        boolean boolean34 = localDate30.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology35 = localDate30.getChronology();
        org.joda.time.Chronology chronology36 = localDate30.getChronology();
        long long40 = chronology36.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean41 = dateTimeFieldType29.isSupported(chronology36);
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 8, chronology36, locale42);
        java.lang.String str44 = locale42.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 54140309, chronology20, locale42, (java.lang.Integer) 54145337);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 54145125, chronology10, locale42, (java.lang.Integer) 54152364, 21884813);
        java.util.Locale locale53 = new java.util.Locale("Sunday, February 21, -0001", "2022-02-21T15:01:56.023Z", "");
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.lang.String str55 = locale53.getDisplayLanguage(locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((-1708655106041881749L), chronology10, locale54);
        org.joda.time.DateTimeField dateTimeField57 = chronology10.dayOfWeek();
        org.joda.time.DurationField durationField58 = chronology10.halfdays();
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645456306212,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=49,MILLISECOND=410,ZONE_OFFSET=54123198,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-22T06:13:49.410+15:02:03.198" + "'", str7, "2022-02-22T06:13:49.410+15:02:03.198");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 200L + "'", long24 == 200L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 200L + "'", long40 == 200L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals(locale53.toString(), "sunday, february 21, -0001_2022-02-21T15:01:56.023Z");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "de");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "sunday, february 21, -0001" + "'", str55, "sunday, february 21, -0001");
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
    }

    @Test
    public void test20058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20058");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.year();
        org.joda.time.DurationField durationField4 = property3.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.add(21924346);
        mutableDateTime6.setWeekyear(733);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test20059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20059");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.plus((-48469999L));
        org.joda.time.DateTime dateTime11 = dateTime7.plusSeconds(2);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate15 = localDate12.withField(dateTimeFieldType13, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTime(readableInstant16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths((int) (short) -1);
        boolean boolean22 = localDate18.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology23 = localDate18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = chronology23.withZone(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localDate15.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) dateTime7, dateTimeZone24);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate31 = localDate28.withField(dateTimeFieldType29, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDate31.toDateTime(readableInstant32);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate36 = localDate34.minusMonths((int) (short) -1);
        boolean boolean38 = localDate34.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology39 = localDate34.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology41 = chronology39.withZone(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = localDate31.toDateTimeAtCurrentTime(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        long long45 = dateTimeZone40.getMillisKeepLocal(dateTimeZone43, (long) 2);
        org.joda.time.Interval interval46 = localDate27.toInterval(dateTimeZone40);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate50 = localDate47.withField(dateTimeFieldType48, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localDate50.toDateTime(readableInstant51);
        org.joda.time.Chronology chronology53 = dateTime52.getChronology();
        org.joda.time.DateTime dateTime55 = dateTime52.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property57 = dateTime55.property(dateTimeFieldType56);
        org.joda.time.DateTime dateTime58 = property57.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime59 = localDate27.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        java.util.Date date60 = dateTime59.toDate();
        org.joda.time.LocalDate localDate61 = org.joda.time.LocalDate.fromDateFields(date60);
        org.joda.time.LocalDate localDate62 = org.joda.time.LocalDate.fromDateFields(date60);
        org.joda.time.LocalDate localDate64 = localDate62.plusYears(54135101);
        org.joda.time.LocalDate.Property property65 = localDate64.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 2L + "'", long45 == 2L);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Sat Jun 23 15:02:56 GMT 3");
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertNotNull(property65);
    }

    @Test
    public void test20060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20060");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusHours(47);
        org.joda.time.DateTime dateTime4 = localDateTime3.toDateTime();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.plus(readableDuration5);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMinutes((int) (short) 10);
        int int10 = localDateTime9.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plusDays((-1));
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.dayOfYear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusHours(21886838);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plusYears(54607);
        int int22 = localDateTime6.compareTo((org.joda.time.ReadablePartial) localDateTime21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test20061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20061");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        boolean boolean5 = dateTimeFormatter3.isParser();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.minusMonths((int) (short) -1);
        boolean boolean10 = localDate6.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology11 = localDate6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology13 = chronology11.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = chronology11.weekOfWeekyear();
        long long17 = dateTimeField14.addWrapField((long) ' ', 0);
        boolean boolean18 = dateTimeField14.isSupported();
        long long21 = dateTimeField14.add(1L, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = dateTimeField14.getType();
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = dateTimeField14.getAsText((long) (byte) 1, locale24);
        java.lang.String str26 = locale24.getCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter3.withLocale(locale24);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeFormatter3.getZone();
        boolean boolean29 = dateTimeFormatter3.isParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 58665600001L + "'", long21 == 58665600001L);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CA" + "'", str26, "CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test20062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20062");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.millisOfDay();
        java.lang.String str4 = property3.toString();
        org.joda.time.DurationField durationField5 = property3.getLeapDurationField();
        org.joda.time.LocalTime localTime7 = property3.addCopy((long) 2022);
        org.joda.time.LocalTime localTime9 = property3.addCopy((long) 54149738);
        int int10 = localTime9.getMillisOfSecond();
        org.joda.time.LocalTime.Property property11 = localTime9.hourOfDay();
        org.joda.time.Chronology chronology12 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Property[millisOfDay]" + "'", str4, "Property[millisOfDay]");
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 935 + "'", int10 == 935);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20063");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.LocalDate localDate7 = localDate3.minusDays(54146835);
        org.joda.time.LocalDate localDate9 = localDate3.plusDays(21965363);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test20064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20064");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2022-02-22T00:00:54.140+15:02:03.198");
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime1.add(readableDuration2);
    }

    @Test
    public void test20065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20065");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        org.joda.time.DateTime dateTime4 = localDate1.toDateTimeAtCurrentTime();
        int int5 = localDate1.getYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDate1.toDateTimeAtCurrentTime(dateTimeZone6);
        int[] intArray9 = localDate1.getValues();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate1.withPeriodAdded(readablePeriod10, 6);
        org.joda.time.LocalDate localDate14 = localDate1.plusYears(26);
        org.joda.time.LocalDate localDate16 = localDate14.minusYears(522);
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) "2022-02-22T06:08:03.745+15:02:03.198", chronology17);
        org.joda.time.ReadablePartial readablePartial19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = chronology17.get(readablePartial19, (-3600000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test20066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20066");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMinuteOfHour((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime2, dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime6.plus(readablePeriod7);
        org.joda.time.LocalTime localTime10 = localTime6.withMillisOfDay((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property12 = localTime10.property(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test20067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20067");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getEra();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusMonths(21);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minus(readablePeriod4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withYearOfEra(21);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withYearOfEra(54118820);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.yearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusMinutes(622);
        org.joda.time.LocalDateTime.Property property14 = localDateTime9.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime16 = property14.roundFloorCopy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test20068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(22103);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test20069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20069");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("2022-02-21T15:11:01.239Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: 2022-02-21T15:11:01.239Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20070");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.millisOfDay();
        java.lang.String str4 = property3.toString();
        org.joda.time.LocalTime localTime5 = property3.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime6 = property3.withMaximumValue();
        long long7 = property3.remainder();
        org.joda.time.LocalTime localTime9 = property3.setCopy(129);
        org.joda.time.LocalTime localTime10 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime11 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime13 = property3.addWrapFieldToCopy(21933771);
        org.joda.time.LocalTime localTime15 = property3.addCopy(54137154);
        org.joda.time.LocalTime localTime16 = property3.roundFloorCopy();
        long long17 = property3.remainder();
        org.joda.time.LocalTime localTime19 = property3.addWrapFieldToCopy(22093151);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Property[millisOfDay]" + "'", str4, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test20071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20071");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime0.toCalendar(locale3);
        java.lang.String str5 = mutableDateTime0.toString();
        mutableDateTime0.addWeeks(901);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime0.copy();
        mutableDateTime0.addMonths(20);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime0.monthOfYear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime0.minuteOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime0.minuteOfHour();
        int int14 = property13.getMinimumValue();
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645456306389,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=49,MILLISECOND=587,ZONE_OFFSET=54123198,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-22T06:13:49.587+15:02:03.198" + "'", str5, "2022-02-22T06:13:49.587+15:02:03.198");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test20072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20072");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        mutableDateTime0.setMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime0.property(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfFloor();
        int int9 = mutableDateTime8.getYearOfCentury();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.minusMonths((int) (short) -1);
        boolean boolean16 = localDate12.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology17 = localDate12.getChronology();
        org.joda.time.Chronology chronology18 = localDate12.getChronology();
        long long22 = chronology18.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate25 = localDate23.minusMonths((int) (short) -1);
        boolean boolean27 = localDate23.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology28 = localDate23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology30 = chronology28.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.weekOfWeekyear();
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = dateTimeField31.getAsText((long) (short) 1, locale33);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(32L, chronology18, locale33);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate39 = localDate36.withField(dateTimeFieldType37, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localDate39.toDateTime(readableInstant40);
        org.joda.time.DateTime dateTime43 = dateTime41.plusMonths((int) '4');
        org.joda.time.DateTime dateTime45 = dateTime43.plus((-48469999L));
        org.joda.time.DateTime dateTime47 = dateTime43.plusSeconds(2);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate51 = localDate48.withField(dateTimeFieldType49, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDate51.toDateTime(readableInstant52);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate56 = localDate54.minusMonths((int) (short) -1);
        boolean boolean58 = localDate54.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology59 = localDate54.getChronology();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology61 = chronology59.withZone(dateTimeZone60);
        org.joda.time.DateTime dateTime62 = localDate51.toDateTimeAtCurrentTime(dateTimeZone60);
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((java.lang.Object) dateTime43, dateTimeZone60);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((long) 54110102, dateTimeZone65);
        long long68 = dateTimeZone60.getMillisKeepLocal(dateTimeZone65, (long) (byte) -1);
        dateTimeParserBucket35.setZone(dateTimeZone65);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) (short) 0, dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(dateTimeZone65);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime72.weekOfWeekyear();
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate76 = localDate74.minusMonths((int) (short) -1);
        boolean boolean78 = localDate74.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology79 = localDate74.getChronology();
        org.joda.time.Chronology chronology80 = localDate74.getChronology();
        long long84 = chronology80.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField85 = chronology80.weekyearOfCentury();
        long long87 = dateTimeField85.roundHalfFloor((long) 47);
        mutableDateTime72.setRounding(dateTimeField85);
        org.joda.time.MutableDateTime mutableDateTime89 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration90 = null;
        mutableDateTime89.add(readableDuration90);
        java.util.Locale locale92 = java.util.Locale.getDefault();
        java.util.Calendar calendar93 = mutableDateTime89.toCalendar(locale92);
        boolean boolean94 = mutableDateTime72.isBefore((org.joda.time.ReadableInstant) mutableDateTime89);
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) mutableDateTime72);
        int int96 = mutableDateTime8.getSecondOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 200L + "'", long22 == 200L);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1" + "'", str34, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localDate76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 200L + "'", long84 == 200L);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertNotNull(locale92);
// flaky:         org.junit.Assert.assertEquals(locale92.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar93);
// flaky:         org.junit.Assert.assertEquals(calendar93.toString(), "java.util.GregorianCalendar[time=1645456306400,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=49,MILLISECOND=598,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 54123 + "'", int96 == 54123);
    }

    @Test
    public void test20073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20073");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusMinutes((int) (short) 10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusWeeks(2022);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusYears((-1));
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, 0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withDurationAdded(readableDuration11, 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.minusMonths((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime7.plusSeconds(86399999);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        int int19 = localDateTime18.getCenturyOfEra();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime20.add(readableDuration21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        mutableDateTime20.add(durationFieldType24, (-1));
        org.joda.time.LocalDateTime localDateTime28 = localDateTime18.withFieldAdded(durationFieldType24, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withWeekyear((int) 'a');
        boolean boolean33 = localDateTime7.isAfter((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime7.dayOfWeek();
        int[] intArray35 = localDateTime7.getValues();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime7.plusMillis(32);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusMinutes((int) (short) 10);
        int int41 = localDateTime40.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.plusDays((-1));
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.millisOfDay();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.weekyear();
        boolean boolean46 = localDateTime37.equals((java.lang.Object) localDateTime43);
        int int47 = localDateTime37.getDayOfYear();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(intArray35);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1984, 5, 24, 23029647]");
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2022 + "'", int41 == 2022);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 145 + "'", int47 == 145);
    }

    @Test
    public void test20074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20074");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate4 = localDate1.withField(dateTimeFieldType2, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(readableInstant5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate9 = localDate7.minusMonths((int) (short) -1);
        boolean boolean11 = localDate7.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology12 = localDate7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = chronology12.withZone(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone13);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths((int) (short) -1);
        boolean boolean22 = localDate18.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology23 = localDate18.getChronology();
        org.joda.time.Chronology chronology24 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.hourOfDay();
        mutableDateTime16.setChronology(chronology24);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getRangeDurationType();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime16.property(dateTimeFieldType27);
        long long30 = property29.remainder();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNull(durationFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 259200010L + "'", long30 == 259200010L);
    }

    @Test
    public void test20075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20075");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate6 = localDate0.withYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate9 = property7.roundFloorCopy();
        int int10 = localDate9.getEra();
        org.joda.time.LocalDate localDate12 = localDate9.plusYears(22049188);
        org.joda.time.LocalDate localDate14 = localDate12.minusMonths((-4508245));
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate18 = localDate15.withField(dateTimeFieldType16, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTime(readableInstant19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.plus(readableDuration21);
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfMonth();
        org.joda.time.DateTime.Property property24 = dateTime22.dayOfYear();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate28 = localDate25.withField(dateTimeFieldType26, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTime(readableInstant29);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime30.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property35 = dateTime33.property(dateTimeFieldType34);
        boolean boolean36 = dateTime22.isSupported(dateTimeFieldType34);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime.Property property38 = dateTime22.property(dateTimeFieldType37);
        org.joda.time.DateTime dateTime40 = property38.addToCopy(54141456);
        org.joda.time.DateTime dateTime42 = property38.setCopy(99);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.dayOfWeek();
        java.lang.String str44 = dateTimeFieldType43.getName();
        org.joda.time.DateTime.Property property45 = dateTime42.property(dateTimeFieldType43);
        int int46 = localDate12.get(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "dayOfWeek" + "'", str44, "dayOfWeek");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
    }

    @Test
    public void test20076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20076");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getMillisOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withPeriodAdded(readablePeriod3, 2022);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        int int8 = property7.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime9 = property7.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusMillis(21976746);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withHourOfDay(0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusHours(21882000);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22429705 + "'", int2 == 22429705);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test20077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20077");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\ufffd\ufffd\ufffd\ufffd\u4e0a\u53486:04");
        int int3 = timeZone1.getOffset((long) 46);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test20078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20078");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.Chronology chronology7 = localDate1.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.seconds();
        java.lang.String str9 = chronology7.toString();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.year();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        boolean boolean12 = dateTimeFieldType0.isSupported(chronology11);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate17 = localDate15.minusMonths((int) (short) -1);
        boolean boolean19 = localDate15.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate21 = localDate15.withYear((int) (byte) 1);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.era();
        org.joda.time.DurationField durationField24 = chronology22.days();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.yearOfCentury();
        org.joda.time.Chronology chronology26 = chronology22.withUTC();
        org.joda.time.Chronology chronology27 = chronology22.withUTC();
        java.util.Locale locale28 = java.util.Locale.CANADA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 21936455, chronology27, locale28, (java.lang.Integer) 21928334, 568);
        org.joda.time.DateTimeField dateTimeField32 = chronology27.monthOfYear();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((-12L), chronology27);
        org.joda.time.DateTimeField dateTimeField34 = chronology27.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType0.getField(chronology27);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[UTC]" + "'", str9, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_CA");
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test20079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20079");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.Chronology chronology7 = localDate1.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.seconds();
        java.lang.String str9 = chronology7.toString();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.year();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology7.seconds();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 54133352, chronology7);
        org.joda.time.DurationField durationField15 = chronology7.centuries();
        java.lang.String str16 = durationField15.getName();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[UTC]" + "'", str9, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "centuries" + "'", str16, "centuries");
    }

    @Test
    public void test20080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20080");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology5 = localDate0.getChronology();
        org.joda.time.Chronology chronology6 = localDate0.getChronology();
        long long10 = chronology6.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.weekyearOfCentury();
        int int13 = dateTimeField11.getLeapAmount((long) 1970);
        long long16 = dateTimeField11.add((long) 345, (long) 21947009);
        boolean boolean17 = dateTimeField11.isSupported();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 200L + "'", long10 == 200L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 692580709584000345L + "'", long16 == 692580709584000345L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test20081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20081");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getEra();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusMonths(21);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusMillis(54127672);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = localDateTime7.isSupported(dateTimeFieldType8);
        org.joda.time.DateTime dateTime10 = localDateTime7.toDateTime();
        boolean boolean12 = dateTime10.isAfter(19L);
        org.joda.time.LocalDateTime localDateTime13 = dateTime10.toLocalDateTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test20082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20082");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate6 = localDate0.withYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate9 = property7.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField10 = property7.getField();
        org.joda.time.LocalDate localDate12 = property7.setCopy((int) (byte) 1);
        org.joda.time.LocalDate.Property property13 = localDate12.era();
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("2022-02-22T06:05:44.430+15:02:03.198");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = property13.setCopy("2022-02-22T06:05:09.477+15:02:03.198", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T06:05:09.477+15:02:03.198\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
    }

    @Test
    public void test20083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20083");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusHours(47);
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.minuteOfHour();
        int int5 = property4.get();
        org.joda.time.DurationField durationField6 = property4.getDurationField();
        org.joda.time.LocalDateTime localDateTime7 = property4.withMinimumValue();
        int int8 = localDateTime7.getYear();
        java.util.Date date9 = localDateTime7.toDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withPeriodAdded(readablePeriod10, 21941368);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 13 + "'", int5 == 13);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Feb 22 06:00:50 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test20084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20084");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMinuteOfHour((int) (byte) 10);
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMinimumValue();
        int int7 = localTime6.size();
        org.joda.time.LocalTime localTime9 = localTime6.plusSeconds(99);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime9.plus(readablePeriod10);
        org.joda.time.LocalTime localTime13 = localTime11.plusHours(490);
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.LocalTime localTime15 = property14.roundHalfFloorCopy();
        java.lang.String str16 = property14.getName();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((-1L), dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime19.withMinuteOfHour((int) (byte) 10);
        org.joda.time.LocalTime.Property property22 = localTime19.millisOfDay();
        org.joda.time.LocalTime localTime23 = property22.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        boolean boolean26 = localTime24.equals((java.lang.Object) "23:59:59.999");
        int int27 = localTime24.getMinuteOfHour();
        org.joda.time.LocalTime.Property property28 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime30 = localTime24.minusMinutes(86399);
        int int31 = localTime24.getSecondOfMinute();
        boolean boolean32 = property14.equals((java.lang.Object) int31);
        int int33 = property14.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "millisOfSecond" + "'", str16, "millisOfSecond");
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test20085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20085");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime0.toCalendar(locale3);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate8 = localDate5.withField(dateTimeFieldType6, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTime(readableInstant9);
        mutableDateTime0.setMillis(readableInstant9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime0.hourOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime0.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.weekyear();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.addWrapField(21973408);
        java.lang.String str18 = mutableDateTime17.toString();
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645456306597,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=49,MILLISECOND=795,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "21975429-12-26T00:00:00.000+15:02:03.198" + "'", str18, "21975429-12-26T00:00:00.000+15:02:03.198");
    }

    @Test
    public void test20086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20086");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        int int1 = dateTimeFormatter0.getDefaultYear();
        boolean boolean2 = dateTimeFormatter0.isPrinter();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.util.Calendar calendar7 = mutableDateTime3.toCalendar(locale6);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromCalendarFields(calendar7);
        java.lang.String str9 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter0.getParser();
        int int11 = dateTimeParser10.estimateParsedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2000 + "'", int1 == 2000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645456306610,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=49,MILLISECOND=808,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 6:13 AM" + "'", str9, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 6:13 AM");
        org.junit.Assert.assertNotNull(dateTimeParser10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
    }

    @Test
    public void test20087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20087");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime0.toCalendar(locale3);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate8 = localDate5.withField(dateTimeFieldType6, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTime(readableInstant9);
        mutableDateTime0.setMillis(readableInstant9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime0.weekOfWeekyear();
        java.lang.String str14 = property13.getName();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.addWrapField((int) (short) -1);
        org.joda.time.DateTime dateTime17 = mutableDateTime16.toDateTime();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths((int) (short) -1);
        boolean boolean22 = localDate18.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate24 = localDate18.withYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property25 = localDate18.yearOfEra();
        org.joda.time.LocalDate localDate27 = localDate18.withYear(54130144);
        org.joda.time.LocalDate.Property property28 = localDate27.yearOfCentury();
        org.joda.time.DateTime dateTime29 = dateTime17.withFields((org.joda.time.ReadablePartial) localDate27);
        int int30 = dateTime29.getMillisOfDay();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate34 = localDate32.minusMonths((int) (short) -1);
        boolean boolean36 = localDate32.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology37 = localDate32.getChronology();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology39 = chronology37.withZone(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 2, chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology39.hourOfHalfday();
        org.joda.time.DateTime dateTime42 = dateTime29.toDateTime(chronology39);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645456306623,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=49,MILLISECOND=821,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "weekOfWeekyear" + "'", str14, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 22429821 + "'", int30 == 22429821);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    public void test20088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20088");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.plus((-48469999L));
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfEra();
        org.joda.time.DateTime dateTime11 = property10.roundFloorCopy();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readableDuration12);
        java.util.GregorianCalendar gregorianCalendar14 = dateTime13.toGregorianCalendar();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar14);
        int int16 = localDate15.getDayOfYear();
        org.joda.time.LocalDate localDate18 = localDate15.withDayOfYear(9);
        org.joda.time.LocalDate localDate20 = localDate18.minusYears(21977516);
        int int21 = localDate20.getCenturyOfEra();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) 83);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate26 = localDate24.minusMonths((int) (short) -1);
        org.joda.time.DateTime dateTime27 = localDate24.toDateTimeAtCurrentTime();
        int int28 = localDate24.getYear();
        org.joda.time.DateTime dateTime29 = localDate24.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property30 = localDate24.monthOfYear();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate34 = localDate31.withField(dateTimeFieldType32, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localDate34.toDateTime(readableInstant35);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMonths((int) '4');
        org.joda.time.DateTime dateTime40 = dateTime36.plusSeconds((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime40.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration43 = null;
        mutableDateTime42.add(readableDuration43);
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.util.Calendar calendar46 = mutableDateTime42.toCalendar(locale45);
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.fromCalendarFields(calendar46);
        org.joda.time.LocalDate localDate48 = org.joda.time.LocalDate.fromCalendarFields(calendar46);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType49.getDurationType();
        int int51 = localDate48.indexOf(dateTimeFieldType49);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime41.property(dateTimeFieldType49);
        int int53 = mutableDateTime41.getMillisOfSecond();
        int int54 = property30.compareTo((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours(40);
        mutableDateTime41.setZoneRetainFields(dateTimeZone56);
        mutableDateTime23.setDate((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long64 = dateTimeZone61.adjustOffset((long) 54122, true);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) 21952903, dateTimeZone61);
        mutableDateTime41.setZone(dateTimeZone61);
        java.lang.String str68 = dateTimeZone61.getShortName((long) 22063083);
        org.joda.time.DateTime dateTime69 = localDate20.toDateTimeAtCurrentTime(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 219775 + "'", int21 == 219775);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2022 + "'", int28 == 2022);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar46);
// flaky:         org.junit.Assert.assertEquals(calendar46.toString(), "java.util.GregorianCalendar[time=1645456306648,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=49,MILLISECOND=846,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(property52);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 846 + "'", int53 == 846);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 54122L + "'", long64 == 54122L);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+00:00:00.035" + "'", str68, "+00:00:00.035");
        org.junit.Assert.assertNotNull(dateTime69);
    }

    @Test
    public void test20089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20089");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.Chronology chronology7 = localDate1.getChronology();
        long long11 = chronology7.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean12 = dateTimeFieldType0.isSupported(chronology7);
        org.joda.time.DurationField durationField13 = chronology7.months();
        long long16 = durationField13.subtract(31795200000L, (long) 22096377);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 200L + "'", long11 == 200L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-58107827347200000L) + "'", long16 == (-58107827347200000L));
    }

    @Test
    public void test20090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20090");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getMillisOfDay();
        java.lang.String str3 = localDateTime0.toString();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withPeriodAdded(readablePeriod4, 845);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks(7997519);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22429911 + "'", int2 == 22429911);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-22T06:13:49.911" + "'", str3, "2022-02-22T06:13:49.911");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test20091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20091");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate6 = localDate0.withYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.Interval interval9 = property7.toInterval();
        org.joda.time.LocalDate localDate10 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate11 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate12 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate13 = property7.getLocalDate();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test20092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20092");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology5 = localDate0.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = chronology5.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate12 = localDate9.withField(dateTimeFieldType10, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTime(readableInstant13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMonths((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime16.plus((-48469999L));
        org.joda.time.DateTime dateTime20 = dateTime16.plusSeconds(2);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate24 = localDate21.withField(dateTimeFieldType22, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTime(readableInstant25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate29 = localDate27.minusMonths((int) (short) -1);
        boolean boolean31 = localDate27.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology32 = localDate27.getChronology();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology34 = chronology32.withZone(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = localDate24.toDateTimeAtCurrentTime(dateTimeZone33);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) dateTime16, dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) 54110102, dateTimeZone38);
        long long41 = dateTimeZone33.getMillisKeepLocal(dateTimeZone38, (long) (byte) -1);
        boolean boolean42 = dateTimeZone38.isFixed();
        org.joda.time.Chronology chronology43 = chronology5.withZone(dateTimeZone38);
        org.joda.time.DurationField durationField44 = chronology43.weekyears();
        long long47 = durationField44.getValueAsLong((long) 54115634, (long) 80);
        java.lang.String str48 = durationField44.getName();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "weekyears" + "'", str48, "weekyears");
    }

    @Test
    public void test20093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20093");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusMinutes((int) (short) 10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusWeeks(2022);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusYears((-1));
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMillisOfDay((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds(21970);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.era();
        int int13 = localDateTime11.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test20094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20094");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.millisOfDay();
        java.lang.String str4 = property3.toString();
        org.joda.time.DurationField durationField5 = property3.getLeapDurationField();
        org.joda.time.LocalTime localTime7 = property3.addCopy((long) 2022);
        org.joda.time.DateTime dateTime8 = localTime7.toDateTimeToday();
        org.joda.time.DateTime dateTime10 = dateTime8.withYear(54119821);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMillis(3);
        org.joda.time.DateTime.Property property13 = dateTime12.weekOfWeekyear();
        org.joda.time.DateTime dateTime14 = property13.roundHalfEvenCopy();
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.minusHours(54640981);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Property[millisOfDay]" + "'", str4, "Property[millisOfDay]");
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test20095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20095");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime1.add(readableDuration2);
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Calendar calendar5 = mutableDateTime1.toCalendar(locale4);
        java.lang.String str6 = mutableDateTime1.toString();
        mutableDateTime1.addWeeks(901);
        org.joda.time.Chronology chronology9 = mutableDateTime1.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 153, chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime10.minus(readablePeriod11);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645456306766,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=49,MILLISECOND=964,ZONE_OFFSET=54123198,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022-02-22T06:13:49.964+15:02:03.198" + "'", str6, "2022-02-22T06:13:49.964+15:02:03.198");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test20096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20096");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusHours(47);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfDay(48);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusMillis(21907908);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localDateTime7.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withEra(54436021);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54436021 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
    }

    @Test
    public void test20097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20097");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMinuteOfHour((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        int int8 = localTime6.getValue((int) (byte) 0);
        org.joda.time.LocalTime localTime10 = localTime6.withSecondOfMinute((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        org.joda.time.LocalTime.Property property13 = localTime6.property(dateTimeFieldType11);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localTime6.getFields();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localTime6.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime18.minusSeconds(22351613);
        org.joda.time.DateTime dateTime21 = dateTime18.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test20098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20098");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) (short) -1);
        java.lang.Integer int3 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter0.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfWeek();
        java.lang.String str7 = dateTimeFieldType6.getName();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.minusMonths((int) (short) -1);
        boolean boolean12 = localDate8.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology13 = localDate8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = chronology13.withZone(dateTimeZone14);
        boolean boolean16 = dateTimeFieldType6.isSupported(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter0.withChronology(chronology15);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate21 = localDate19.minusMonths((int) (short) -1);
        boolean boolean23 = localDate19.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology24 = localDate19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology26 = chronology24.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = chronology24.weekOfWeekyear();
        long long30 = dateTimeField27.addWrapField((long) ' ', 0);
        boolean boolean31 = dateTimeField27.isSupported();
        long long34 = dateTimeField27.add(1L, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = dateTimeField27.getType();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = dateTimeField27.getAsText((long) (byte) 1, locale37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter18.withLocale(locale37);
        java.io.Writer writer40 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate46 = localDate43.withField(dateTimeFieldType44, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.DateTime dateTime48 = localDate46.toDateTime(readableInstant47);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate51 = localDate49.minusMonths((int) (short) -1);
        boolean boolean53 = localDate49.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology54 = localDate49.getChronology();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology56 = chronology54.withZone(dateTimeZone55);
        org.joda.time.DateTime dateTime57 = localDate46.toDateTimeAtCurrentTime(dateTimeZone55);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone55);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) 54140332, dateTimeZone55);
        mutableDateTime59.addWeeks(54744394);
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate65 = localDate62.withField(dateTimeFieldType63, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.DateTime dateTime67 = localDate65.toDateTime(readableInstant66);
        org.joda.time.DateTime dateTime69 = dateTime67.plusMonths((int) '4');
        org.joda.time.DateTime dateTime71 = dateTime67.plusMonths((int) (byte) 0);
        org.joda.time.DateTime dateTime73 = dateTime67.withMillisOfSecond(0);
        boolean boolean75 = dateTime73.isBefore((long) 20);
        org.joda.time.DateTime dateTime77 = dateTime73.minusMinutes(1969);
        org.joda.time.DateTime dateTime79 = dateTime73.withMillisOfDay(54133104);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.DateTime dateTime81 = dateTime73.minus(readablePeriod80);
        boolean boolean82 = mutableDateTime59.isBefore((org.joda.time.ReadableInstant) dateTime73);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter18.printTo(writer40, (org.joda.time.ReadableInstant) dateTime73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "dayOfWeek" + "'", str7, "dayOfWeek");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 58665600001L + "'", long34 == 58665600001L);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test20099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20099");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate6 = localDate4.minusMonths((int) (short) -1);
        boolean boolean8 = localDate4.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology9 = localDate4.getChronology();
        org.joda.time.Chronology chronology10 = localDate4.getChronology();
        long long14 = chronology10.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean15 = dateTimeFieldType3.isSupported(chronology10);
        mutableDateTime0.setChronology(chronology10);
        org.joda.time.DurationField durationField17 = chronology10.minutes();
        int int20 = durationField17.getDifference((long) 21, (long) (byte) 1);
        long long23 = durationField17.add((long) 54115116, 427);
        long long26 = durationField17.subtract((long) ' ', 756);
        java.lang.String str27 = durationField17.toString();
        java.lang.String str28 = durationField17.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) str28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"minutes\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 200L + "'", long14 == 200L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 79735116L + "'", long23 == 79735116L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-45359968L) + "'", long26 == (-45359968L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DurationField[minutes]" + "'", str27, "DurationField[minutes]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "minutes" + "'", str28, "minutes");
    }

    @Test
    public void test20100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20100");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withDurationAdded(readableDuration1, 6);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusHours(54678474);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test20101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20101");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusYears((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusYears(197);
        org.joda.time.LocalDateTime.Property property10 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks(8326331);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22430041 + "'", int2 == 22430041);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test20102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20102");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate2.equals((java.lang.Object) (byte) 10);
        int int5 = localDate2.getDayOfMonth();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.minusMonths((int) (short) -1);
        boolean boolean10 = localDate6.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate12 = localDate6.withYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property13 = localDate6.yearOfEra();
        org.joda.time.LocalDate localDate14 = property13.roundFloorCopy();
        org.joda.time.Interval interval15 = property13.toInterval();
        org.joda.time.LocalDate localDate16 = property13.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate17 = property13.getLocalDate();
        boolean boolean18 = localDate2.equals((java.lang.Object) property13);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate21 = localDate19.minusMonths((int) (short) -1);
        boolean boolean23 = localDate19.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology24 = localDate19.getChronology();
        long long30 = chronology24.getDateTimeMillis((long) (-1), (int) (short) 10, (int) ' ', (int) (byte) 10, 1);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) localDate2, chronology24);
        int int32 = localDate2.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration34 = null;
        mutableDateTime33.add(readableDuration34);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.util.Calendar calendar37 = mutableDateTime33.toCalendar(locale36);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate41 = localDate38.withField(dateTimeFieldType39, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localDate41.toDateTime(readableInstant42);
        mutableDateTime33.setMillis(readableInstant42);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime33.hourOfDay();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate49 = localDate46.withField(dateTimeFieldType47, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.DateTime dateTime51 = localDate49.toDateTime(readableInstant50);
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        org.joda.time.DateTime dateTime54 = dateTime51.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property56 = dateTime54.property(dateTimeFieldType55);
        mutableDateTime33.set(dateTimeFieldType55, 52);
        int int59 = localDate2.get(dateTimeFieldType55);
        org.joda.time.LocalDate.Property property60 = localDate2.year();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-48469999L) + "'", long30 == (-48469999L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar37);
// flaky:         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=1645456306852,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=50,MILLISECOND=50,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2022 + "'", int59 == 2022);
        org.junit.Assert.assertNotNull(property60);
    }

    @Test
    public void test20103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20103");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.plus((-48469999L));
        org.joda.time.DateTime dateTime11 = dateTime7.plusSeconds(2);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate15 = localDate12.withField(dateTimeFieldType13, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTime(readableInstant16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths((int) (short) -1);
        boolean boolean22 = localDate18.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology23 = localDate18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = chronology23.withZone(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localDate15.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) dateTime7, dateTimeZone24);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime29.add(readableDuration30);
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.util.Calendar calendar33 = mutableDateTime29.toCalendar(locale32);
        boolean boolean34 = dateTime28.isAfter((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime();
        java.lang.String str36 = mutableDateTime35.toString();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime37.add(readableDuration38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType40.getDurationType();
        mutableDateTime37.add(durationFieldType41, (-1));
        mutableDateTime35.add(durationFieldType41, 10);
        org.joda.time.DateTime dateTime47 = dateTime28.withFieldAdded(durationFieldType41, 5);
        java.util.Date date48 = dateTime28.toDate();
        org.joda.time.DateTime dateTime50 = dateTime28.withYearOfEra(100);
        org.joda.time.DateTime dateTime51 = dateTime28.toDateTimeISO();
        org.joda.time.DateTime.Property property52 = dateTime51.millisOfDay();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate56 = localDate53.withField(dateTimeFieldType54, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.DateTime dateTime58 = localDate56.toDateTime(readableInstant57);
        org.joda.time.Chronology chronology59 = dateTime58.getChronology();
        org.joda.time.DateTime dateTime61 = dateTime58.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property63 = dateTime61.property(dateTimeFieldType62);
        org.joda.time.DateTime dateTime64 = property63.withMinimumValue();
        org.joda.time.DateTime dateTime65 = property63.getDateTime();
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime65.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration68 = null;
        mutableDateTime67.add(readableDuration68);
        java.util.Locale locale70 = java.util.Locale.getDefault();
        java.util.Calendar calendar71 = mutableDateTime67.toCalendar(locale70);
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate75 = localDate72.withField(dateTimeFieldType73, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.DateTime dateTime77 = localDate75.toDateTime(readableInstant76);
        mutableDateTime67.setMillis(readableInstant76);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime67.weekyear();
        org.joda.time.MutableDateTime mutableDateTime80 = property79.getMutableDateTime();
        org.joda.time.ReadableDuration readableDuration81 = null;
        mutableDateTime80.add(readableDuration81, (-53));
        boolean boolean84 = dateTime65.isEqual((org.joda.time.ReadableInstant) mutableDateTime80);
        int int85 = property52.compareTo((org.joda.time.ReadableInstant) mutableDateTime80);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar33);
// flaky:         org.junit.Assert.assertEquals(calendar33.toString(), "java.util.GregorianCalendar[time=1645456306882,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=50,MILLISECOND=80,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2022-02-22T06:13:50.080+15:02:03.198" + "'", str36, "2022-02-22T06:13:50.080+15:02:03.198");
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Mon Feb 21 21:16:46 GMT 2022");
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(mutableDateTime66);
        org.junit.Assert.assertNotNull(locale70);
// flaky:         org.junit.Assert.assertEquals(locale70.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar71);
// flaky:         org.junit.Assert.assertEquals(calendar71.toString(), "java.util.GregorianCalendar[time=1645456306883,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=50,MILLISECOND=81,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertNotNull(localDate75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(mutableDateTime80);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test20104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20104");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet2 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet3 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet5 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((-1L), dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfDay();
        java.lang.String str10 = property9.toString();
        org.joda.time.DurationField durationField11 = property9.getLeapDurationField();
        org.joda.time.LocalTime localTime13 = property9.addCopy((long) 2022);
        org.joda.time.LocalTime localTime14 = property9.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime15 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime16 = property9.roundHalfFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        java.lang.String str18 = mutableDateTime17.toString();
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime17.add(readableDuration19);
        mutableDateTime17.setWeekyear((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant23 = null;
        mutableDateTime17.setTime(readableInstant23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = mutableDateTime17.toDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime17.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime17.copy();
        int int29 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        boolean boolean30 = strSet5.equals((java.lang.Object) int29);
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[millisOfDay]" + "'", str10, "Property[millisOfDay]");
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2022-02-22T06:13:50.146+15:02:03.198" + "'", str18, "2022-02-22T06:13:50.146+15:02:03.198");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test20105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20105");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMinuteOfHour((int) (byte) 10);
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMinimumValue();
        int int7 = localTime6.size();
        org.joda.time.LocalTime localTime9 = localTime6.plusSeconds(99);
        int int10 = localTime6.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localTime6.isSupported(dateTimeFieldType11);
        org.joda.time.LocalTime localTime14 = localTime6.withMillisOfSecond(345);
        int int15 = localTime6.getMillisOfDay();
        org.joda.time.LocalTime localTime17 = localTime6.minusMinutes(54614424);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test20106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20106");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.plus((-48469999L));
        org.joda.time.DateTime dateTime11 = dateTime7.plusSeconds(2);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate15 = localDate12.withField(dateTimeFieldType13, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTime(readableInstant16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths((int) (short) -1);
        boolean boolean22 = localDate18.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology23 = localDate18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = chronology23.withZone(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localDate15.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) dateTime7, dateTimeZone24);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime29.add(readableDuration30);
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.util.Calendar calendar33 = mutableDateTime29.toCalendar(locale32);
        boolean boolean34 = dateTime28.isAfter((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime();
        java.lang.String str36 = mutableDateTime35.toString();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime37.add(readableDuration38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType40.getDurationType();
        mutableDateTime37.add(durationFieldType41, (-1));
        mutableDateTime35.add(durationFieldType41, 10);
        org.joda.time.DateTime dateTime47 = dateTime28.withFieldAdded(durationFieldType41, 5);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate51 = localDate48.withField(dateTimeFieldType49, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDate51.toDateTime(readableInstant52);
        org.joda.time.DateTime dateTime55 = dateTime53.plusMonths((int) '4');
        org.joda.time.DateTime dateTime57 = dateTime53.plusSeconds((int) (byte) 1);
        int int58 = dateTime28.compareTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime60 = dateTime28.plusMinutes(54130456);
        int int61 = dateTime28.getMillisOfSecond();
        org.joda.time.DateTime dateTime63 = dateTime28.minusSeconds(1);
        org.joda.time.DateTime dateTime65 = dateTime28.withYear(0);
        org.joda.time.DateTime dateTime67 = dateTime65.plusMonths(627);
        org.joda.time.DateTime dateTime69 = dateTime65.plusMonths(143);
        java.lang.String str70 = dateTime65.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar33);
// flaky:         org.junit.Assert.assertEquals(calendar33.toString(), "java.util.GregorianCalendar[time=1645456306976,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=50,MILLISECOND=174,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2022-02-22T06:13:50.174+15:02:03.198" + "'", str36, "2022-02-22T06:13:50.174+15:02:03.198");
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(dateTime60);
// flaky:         org.junit.Assert.assertTrue("'" + int61 + "' != '" + 174 + "'", int61 == 174);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "0000-02-22T06:13:50.174+15:02:03.198" + "'", str70, "0000-02-22T06:13:50.174+15:02:03.198");
    }

    @Test
    public void test20107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20107");
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.minusMonths((int) (short) -1);
        boolean boolean6 = localDate2.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology7 = localDate2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = chronology7.withZone(dateTimeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.millisOfDay();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate16 = localDate14.minusMonths((int) (short) -1);
        boolean boolean18 = localDate14.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology19 = localDate14.getChronology();
        org.joda.time.Chronology chronology20 = localDate14.getChronology();
        long long24 = chronology20.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate27 = localDate25.minusMonths((int) (short) -1);
        boolean boolean29 = localDate25.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology30 = localDate25.getChronology();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology32 = chronology30.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = chronology30.weekOfWeekyear();
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = dateTimeField33.getAsText((long) (short) 1, locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(32L, chronology20, locale35);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate41 = localDate38.withField(dateTimeFieldType39, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localDate41.toDateTime(readableInstant42);
        org.joda.time.DateTime dateTime45 = dateTime43.plusMonths((int) '4');
        org.joda.time.DateTime dateTime47 = dateTime45.plus((-48469999L));
        org.joda.time.DateTime dateTime49 = dateTime45.plusSeconds(2);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate53 = localDate50.withField(dateTimeFieldType51, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.DateTime dateTime55 = localDate53.toDateTime(readableInstant54);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate58 = localDate56.minusMonths((int) (short) -1);
        boolean boolean60 = localDate56.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology61 = localDate56.getChronology();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology63 = chronology61.withZone(dateTimeZone62);
        org.joda.time.DateTime dateTime64 = localDate53.toDateTimeAtCurrentTime(dateTimeZone62);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((java.lang.Object) dateTime45, dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((long) 54110102, dateTimeZone67);
        long long70 = dateTimeZone62.getMillisKeepLocal(dateTimeZone67, (long) (byte) -1);
        dateTimeParserBucket37.setZone(dateTimeZone67);
        java.util.Locale locale72 = dateTimeParserBucket37.getLocale();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket37.setZone(dateTimeZone73);
        dateTimeParserBucket37.setPivotYear((java.lang.Integer) 59);
        java.util.Locale locale77 = dateTimeParserBucket37.getLocale();
        java.util.Locale locale78 = locale77.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) 54117, chronology7, locale78, (java.lang.Integer) 2039, 14);
        java.util.Locale locale85 = new java.util.Locale("monthOfYear", "23:59:59.999", "0003-06-22T15:00:00.000+15:02:03.198");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket87 = new org.joda.time.format.DateTimeParserBucket((long) 627, chronology7, locale85, (java.lang.Integer) 365);
        java.util.Set<java.lang.String> strSet88 = locale85.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = locale85.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for monthofyear");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 200L + "'", long24 == 200L);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1" + "'", str36, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertNotNull(locale72);
// flaky:         org.junit.Assert.assertEquals(locale72.toString(), "en_CA");
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(locale77);
// flaky:         org.junit.Assert.assertEquals(locale77.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale78);
// flaky:         org.junit.Assert.assertEquals(locale78.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale85.toString(), "monthofyear_23:59:59.999_0003-06-22T15:00:00.000+15:02:03.198");
        org.junit.Assert.assertNotNull(strSet88);
    }

    @Test
    public void test20108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20108");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTimeToday(dateTimeZone3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.plus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.minusMinutes(54148250);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(54123198);
        java.lang.String str12 = dateTimeZone11.getID();
        long long14 = dateTimeZone11.nextTransition(80L);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (-71), dateTimeZone11);
        boolean boolean16 = localTime8.equals((java.lang.Object) dateTimeZone11);
        org.joda.time.LocalTime localTime18 = localTime8.minusSeconds(22086);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime20 = localTime18.plus(readablePeriod19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+15:02:03.198" + "'", str12, "+15:02:03.198");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 80L + "'", long14 == 80L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test20109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20109");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusMinutes((int) (short) 10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusWeeks(2022);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusYears((-1));
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMillisOfDay((int) (short) 10);
        int int10 = localDateTime9.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.monthOfYear();
        int int13 = property12.getMinimumValue();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test20110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20110");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusMinutes((int) (short) 10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusWeeks(2022);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusYears((-1));
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, 0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withDurationAdded(readableDuration11, 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withDayOfYear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime17 = property16.withMaximumValue();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.hourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusMinutes(545);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test20111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20111");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate6 = localDate0.withYear((int) (byte) 1);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.era();
        org.joda.time.DurationField durationField9 = chronology7.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.yearOfCentury();
        int int11 = dateTimeField10.getMaximumValue();
        java.lang.String str12 = dateTimeField10.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = dateTimeField10.getType();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime14.add(readableDuration15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths((int) (short) -1);
        boolean boolean22 = localDate18.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology23 = localDate18.getChronology();
        org.joda.time.Chronology chronology24 = localDate18.getChronology();
        long long28 = chronology24.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean29 = dateTimeFieldType17.isSupported(chronology24);
        mutableDateTime14.setChronology(chronology24);
        org.joda.time.DurationField durationField31 = chronology24.minutes();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology24.getZone();
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.now(chronology24);
        org.joda.time.DurationField durationField34 = chronology24.months();
        org.joda.time.DurationField durationField35 = chronology24.millis();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType13.getField(chronology24);
        org.joda.time.DateTimeField dateTimeField37 = chronology24.dayOfWeek();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "yearOfCentury" + "'", str12, "yearOfCentury");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 200L + "'", long28 == 200L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test20112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20112");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate6 = localDate4.minusMonths((int) (short) -1);
        boolean boolean8 = localDate4.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology9 = localDate4.getChronology();
        org.joda.time.Chronology chronology10 = localDate4.getChronology();
        long long14 = chronology10.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean15 = dateTimeFieldType3.isSupported(chronology10);
        mutableDateTime0.setChronology(chronology10);
        org.joda.time.DurationField durationField17 = chronology10.minutes();
        int int20 = durationField17.getDifference((long) 21, (long) (byte) 1);
        long long23 = durationField17.add((long) 54115116, 427);
        org.joda.time.DurationFieldType durationFieldType24 = durationField17.getType();
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 200L + "'", long14 == 200L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 79735116L + "'", long23 == 79735116L);
        org.junit.Assert.assertNotNull(durationFieldType24);
    }

    @Test
    public void test20113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20113");
        java.util.Locale locale1 = new java.util.Locale("Samstag, 1. Januar 2022");
        org.junit.Assert.assertEquals(locale1.toString(), "samstag, 1. januar 2022");
    }

    @Test
    public void test20114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20114");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList7);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream10 = languageRangeList3.stream();
        boolean boolean11 = strSet0.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((-1L), dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.millisOfDay();
        java.lang.String str16 = property15.toString();
        java.lang.String str17 = property15.getAsShortText();
        org.joda.time.LocalTime localTime18 = property15.getLocalTime();
        org.joda.time.LocalTime localTime19 = property15.withMinimumValue();
        org.joda.time.LocalTime localTime20 = property15.roundHalfCeilingCopy();
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localTime20.getFields();
        org.joda.time.DateTimeField[] dateTimeFieldArray22 = strSet0.toArray(dateTimeFieldArray21);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream26 = languageRangeList24.stream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList30, strMap31);
        java.util.Collection<java.util.Locale> localeCollection33 = null;
        java.util.Locale.FilteringMode filteringMode34 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList35 = java.util.Locale.filter(languageRangeList30, localeCollection33, filteringMode34);
        boolean boolean36 = strSet0.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        java.lang.Object[] objArray37 = strSet0.toArray();
        java.util.Iterator<java.lang.String> strItor38 = strSet0.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator39 = strSet0.spliterator();
        boolean boolean41 = strSet0.equals((java.lang.Object) "minuteOfDay");
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream45 = languageRangeList43.stream();
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.lang.String str53 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList51);
        java.util.Locale.FilteringMode filteringMode54 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.lang.String>) strList51, filteringMode54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap56 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList57 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strMap56);
        java.util.Set<java.lang.String> strSet58 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Spliterator<java.lang.String> strSpliterator59 = strSet58.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream66 = languageRangeList64.stream();
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        java.lang.String str74 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.lang.String>) strList72);
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strList72, filteringMode75);
        java.util.Set<java.lang.String> strSet77 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray78 = strSet77.toArray();
        java.util.Locale.FilteringMode filteringMode79 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strSet77, filteringMode79);
        java.util.Locale.FilteringMode filteringMode81 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strList80, filteringMode81);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.lang.String>) strSet58, filteringMode81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap84 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList85 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strMap84);
        boolean boolean86 = strSet0.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList85);
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(languageRangeStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Property[millisOfDay]" + "'", str16, "Property[millisOfDay]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "54123197" + "'", str17, "54123197");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
        org.junit.Assert.assertNotNull(dateTimeFieldArray22);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeStream26);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + filteringMode34 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode34.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNotNull(strSpliterator39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeStream45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + filteringMode54 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode54.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(languageRangeList57);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertNotNull(strSpliterator59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(languageRangeStream66);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode75.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertTrue("'" + filteringMode79 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode79.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertTrue("'" + filteringMode81 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode81.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(languageRangeList85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test20115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20115");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime();
        java.lang.String str5 = mutableDateTime4.toString();
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime4.add(readableDuration6);
        mutableDateTime4.setWeekyear((int) (short) 1);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime4.year();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.roundHalfEven();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusMinutes((int) (short) 10);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusWeeks(2022);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusYears((-1));
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withDurationAdded(readableDuration22, 0);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withDurationAdded(readableDuration25, 10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withDayOfYear((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime();
        java.lang.String str31 = mutableDateTime30.toString();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutableDateTime32.add(readableDuration33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType35.getDurationType();
        mutableDateTime32.add(durationFieldType36, (-1));
        mutableDateTime30.add(durationFieldType36, 10);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration42 = null;
        mutableDateTime41.add(readableDuration42);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType45 = dateTimeFieldType44.getDurationType();
        mutableDateTime41.add(durationFieldType45, (-1));
        mutableDateTime30.add(durationFieldType45, 0);
        boolean boolean50 = localDateTime27.isSupported(durationFieldType45);
        mutableDateTime13.add(durationFieldType45, 29);
        int int55 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime13, "2022-02-22T06:07:27.655", 779);
        // The following exception was thrown during execution in test generation
        try {
            long long57 = dateTimeFormatter0.parseMillis("0052-02-22T06:07:12.714+15:02:03.198");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"0052-02-22T06:07:12.714+15:02:03.198\" is malformed at \"52-02-22T06:07:12.714+15:02:03.198\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-22T06:13:50.386+15:02:03.198" + "'", str5, "2022-02-22T06:13:50.386+15:02:03.198");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2022-02-22T06:13:50.386+15:02:03.198" + "'", str31, "2022-02-22T06:13:50.386+15:02:03.198");
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-780) + "'", int55 == (-780));
    }

    @Test
    public void test20116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20116");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime5.add(readableDuration6);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.util.Calendar calendar9 = mutableDateTime5.toCalendar(locale8);
        java.lang.String str10 = property4.getAsText(locale8);
        java.util.Locale.Builder builder11 = builder0.setLocale(locale8);
        java.util.Locale.Builder builder12 = builder0.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder16 = builder12.setExtension('a', "0001-02-22");
        java.util.Locale locale17 = builder16.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder16.setVariant("3:02:03 PM");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 3:02:03 PM [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645456307200,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=50,MILLISECOND=398,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "en_CA_#a-0001-02-22");
    }

    @Test
    public void test20117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20117");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        int int5 = localDateTime4.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusMonths(54123198);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withMillisOfDay(54128391);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.plusMinutes(21915);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfCentury();
        int int14 = property13.getMaximumValue();
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22430408 + "'", int2 == 22430408);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
    }

    @Test
    public void test20118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20118");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate6 = localDate4.minusMonths((int) (short) -1);
        boolean boolean8 = localDate4.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology9 = localDate4.getChronology();
        org.joda.time.Chronology chronology10 = localDate4.getChronology();
        long long14 = chronology10.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean15 = dateTimeFieldType3.isSupported(chronology10);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 8, chronology10, locale16);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.minusMonths((int) (short) -1);
        boolean boolean24 = localDate20.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology25 = localDate20.getChronology();
        org.joda.time.Chronology chronology26 = localDate20.getChronology();
        long long30 = chronology26.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean31 = dateTimeFieldType19.isSupported(chronology26);
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) 8, chronology26, locale32);
        java.lang.String str34 = locale32.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 54140309, chronology10, locale32, (java.lang.Integer) 54145337);
        java.util.Locale locale40 = new java.util.Locale("Sunday, February 21, -0001", "2022-02-21T15:01:56.023Z", "");
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.lang.String str42 = locale40.getDisplayLanguage(locale41);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 999, chronology10, locale40);
        java.util.Locale locale45 = new java.util.Locale("2022-02-21T15:02:20.498Z");
        java.util.Set<java.lang.String> strSet46 = locale45.getUnicodeLocaleKeys();
        java.lang.String str47 = locale40.getDisplayName(locale45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = locale40.getUnicodeLocaleType("Property[dayOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Property[dayOfYear]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 200L + "'", long14 == 200L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 200L + "'", long30 == 200L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals(locale40.toString(), "sunday, february 21, -0001_2022-02-21T15:01:56.023Z");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "sunday, february 21, -0001" + "'", str42, "sunday, february 21, -0001");
        org.junit.Assert.assertEquals(locale45.toString(), "2022-02-21t15:02:20.498z");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "sunday, february 21, -0001 (2022-02-21T15:01:56.023Z)" + "'", str47, "sunday, february 21, -0001 (2022-02-21T15:01:56.023Z)");
    }

    @Test
    public void test20119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20119");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime2 = property1.withMaximumValue();
        java.util.Date date3 = localDateTime2.toDate();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.fromDateFields(date3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusYears(54117);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusWeeks(85);
        java.lang.String str9 = localDateTime4.toString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Fri Feb 22 06:13:50 GMT 292278993");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "292278993-02-22T06:13:50.683" + "'", str9, "292278993-02-22T06:13:50.683");
    }

    @Test
    public void test20120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20120");
        java.util.Locale locale2 = new java.util.Locale("2020-05-24T02:18:49.930", "2022-02-24T02:19:31.435+59:08");
        org.junit.Assert.assertEquals(locale2.toString(), "2020-05-24t02:18:49.930_2022-02-24T02:19:31.435+59:08");
    }

    @Test
    public void test20121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20121");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.DateTime dateTime8 = dateTime5.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property10 = dateTime8.property(dateTimeFieldType9);
        org.joda.time.DateTime dateTime12 = dateTime8.withMillisOfSecond(0);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears(54138234);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.minus(readablePeriod15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks(21935647);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test20122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20122");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime0.toCalendar(locale3);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate8 = localDate5.withField(dateTimeFieldType6, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTime(readableInstant9);
        mutableDateTime0.setMillis(readableInstant9);
        int int12 = mutableDateTime0.getMinuteOfDay();
        mutableDateTime0.add((long) 20);
        mutableDateTime0.addWeeks(21);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime0.centuryOfEra();
        boolean boolean19 = mutableDateTime0.isEqual((long) 21887627);
        int int20 = mutableDateTime0.getRoundingMode();
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645456307263,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=50,MILLISECOND=461,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 373 + "'", int12 == 373);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test20123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20123");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withYear((int) (byte) 1);
        java.lang.String str8 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.weekOfWeekyear();
        org.joda.time.LocalDate localDate11 = localDate7.minusYears(54143);
        int int12 = localDate11.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str8, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 541 + "'", int12 == 541);
    }

    @Test
    public void test20124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20124");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusDays(69);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withDurationAdded(readableDuration5, 18);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfDay();
        org.joda.time.Chronology chronology11 = localDateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        int int13 = localDateTime12.getCenturyOfEra();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime14.add(readableDuration15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType17.getDurationType();
        mutableDateTime14.add(durationFieldType18, (-1));
        org.joda.time.LocalDateTime localDateTime22 = localDateTime12.withFieldAdded(durationFieldType18, (int) (byte) 0);
        int int23 = localDateTime12.getMillisOfSecond();
        int int24 = localDateTime12.getSecondOfMinute();
        org.joda.time.Chronology chronology25 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime12.withMillisOfSecond(977);
        boolean boolean28 = localDateTime7.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 482 + "'", int23 == 482);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test20125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20125");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        mutableDateTime0.setMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime0.property(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfEven();
        mutableDateTime7.setHourOfDay(2);
        int int10 = mutableDateTime7.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime7.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime12.add(readableDuration13, 21899612);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.secondOfMinute();
        mutableDateTime12.addSeconds(21919726);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test20126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20126");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getEra();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusMonths(21);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusMillis(54127672);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = localDateTime7.isSupported(dateTimeFieldType8);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMinutes((int) (short) 10);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusWeeks(2022);
        org.joda.time.DateTime dateTime16 = localDateTime12.toDateTime();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfEra();
        int int19 = localDateTime17.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusMonths((int) ' ');
        boolean boolean23 = localDateTime7.isAfter((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime7.withMillisOfDay(21921078);
        int int26 = localDateTime25.getYearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime.Property property28 = localDateTime25.property(dateTimeFieldType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 22430507 + "'", int19 == 22430507);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
    }

    @Test
    public void test20127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20127");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.millisOfDay();
        java.lang.String str4 = property3.toString();
        org.joda.time.LocalTime localTime5 = property3.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime6 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime7 = localTime6.toDateTimeToday();
        org.joda.time.DateTime.Property property8 = dateTime7.centuryOfEra();
        org.joda.time.DateTime dateTime10 = dateTime7.withWeekOfWeekyear(18);
        org.joda.time.DateTime.Property property11 = dateTime7.centuryOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Property[millisOfDay]" + "'", str4, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test20128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20128");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime1.add(readableDuration2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.minusMonths((int) (short) -1);
        boolean boolean9 = localDate5.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology10 = localDate5.getChronology();
        org.joda.time.Chronology chronology11 = localDate5.getChronology();
        long long15 = chronology11.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean16 = dateTimeFieldType4.isSupported(chronology11);
        mutableDateTime1.setChronology(chronology11);
        org.joda.time.DurationField durationField18 = chronology11.minutes();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology11.getZone();
        java.util.Locale locale23 = new java.util.Locale("German", "12:00:00 AM +00:00", "2022-02-21T15:02:35.504Z");
        java.lang.String str24 = locale23.getVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 21951, chronology11, locale23);
        org.joda.time.DurationField durationField26 = chronology11.millis();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 200L + "'", long15 == 200L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals(locale23.toString(), "german_12:00:00 AM +00:00_2022-02-21T15:02:35.504Z");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022-02-21T15:02:35.504Z" + "'", str24, "2022-02-21T15:02:35.504Z");
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test20129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20129");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readableDuration6);
        org.joda.time.DateTime dateTime8 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime10 = dateTime5.withMillisOfSecond(11);
        org.joda.time.DateTime.Property property11 = dateTime5.yearOfEra();
        org.joda.time.DateTime dateTime12 = property11.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate16 = localDate14.minusMonths((int) (short) -1);
        boolean boolean18 = localDate14.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology19 = localDate14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology21 = chronology19.withZone(dateTimeZone20);
        boolean boolean22 = dateTimeZone13.equals((java.lang.Object) dateTimeZone20);
        int int24 = dateTimeZone20.getStandardOffset((long) 54119608);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime12.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateTime.Property property26 = dateTime12.hourOfDay();
        org.joda.time.DateTime dateTime28 = dateTime12.minusMinutes(961);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dateTime28.toString("2022-02-21T15:07:56.224+00:00:00.035");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 54123198 + "'", int24 == 54123198);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test20130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20130");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate2.equals((java.lang.Object) (byte) 10);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtStartOfDay();
        int int6 = localDate2.size();
        int int7 = localDate2.getYearOfEra();
        org.joda.time.LocalDate.Property property8 = localDate2.era();
        org.joda.time.LocalDate localDate10 = localDate2.plusDays(2);
        int int11 = localDate2.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
    }

    @Test
    public void test20131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20131");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        timeZone4.setID("2022-02-21T15:02:04.418Z");
        boolean boolean7 = timeZone4.observesDaylightTime();
        boolean boolean8 = timeZone3.hasSameRules(timeZone4);
        java.util.TimeZone.setDefault(timeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54123198 + "'", int2 == 54123198);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+15:02");
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+06:04");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20132");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate6 = localDate0.withYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.minusMonths((int) (short) -1);
        boolean boolean15 = localDate11.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology16 = localDate11.getChronology();
        org.joda.time.Chronology chronology17 = localDate11.getChronology();
        long long21 = chronology17.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate24 = localDate22.minusMonths((int) (short) -1);
        boolean boolean26 = localDate22.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology27 = localDate22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology29 = chronology27.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.weekOfWeekyear();
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = dateTimeField30.getAsText((long) (short) 1, locale32);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(32L, chronology17, locale32);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate38 = localDate35.withField(dateTimeFieldType36, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDate38.toDateTime(readableInstant39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMonths((int) '4');
        org.joda.time.DateTime dateTime44 = dateTime42.plus((-48469999L));
        org.joda.time.DateTime dateTime46 = dateTime42.plusSeconds(2);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate50 = localDate47.withField(dateTimeFieldType48, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localDate50.toDateTime(readableInstant51);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate55 = localDate53.minusMonths((int) (short) -1);
        boolean boolean57 = localDate53.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology58 = localDate53.getChronology();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology60 = chronology58.withZone(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = localDate50.toDateTimeAtCurrentTime(dateTimeZone59);
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((java.lang.Object) dateTime42, dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((long) 54110102, dateTimeZone64);
        long long67 = dateTimeZone59.getMillisKeepLocal(dateTimeZone64, (long) (byte) -1);
        dateTimeParserBucket34.setZone(dateTimeZone64);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) (short) 0, dateTimeZone64);
        org.joda.time.Interval interval70 = localDate8.toInterval(dateTimeZone64);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDate localDate72 = localDate8.minus(readablePeriod71);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = org.joda.time.format.DateTimeFormat.fullTime();
        java.lang.Integer int74 = dateTimeFormatter73.getPivotYear();
        java.lang.String str75 = localDate72.toString(dateTimeFormatter73);
        org.joda.time.Interval interval76 = localDate72.toInterval();
        org.joda.time.LocalDate localDate78 = localDate72.plusDays(22059);
        org.joda.time.LocalDate localDate80 = localDate78.plusDays(0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 200L + "'", long21 == 200L);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(localDate72);
        org.junit.Assert.assertNotNull(dateTimeFormatter73);
        org.junit.Assert.assertNull(int74);
// flaky:         org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd " + "'", str75, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd ");
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(localDate78);
        org.junit.Assert.assertNotNull(localDate80);
    }

    @Test
    public void test20133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20133");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property8 = localDate1.yearOfEra();
        org.joda.time.LocalDate localDate9 = property8.roundFloorCopy();
        org.joda.time.LocalDate localDate10 = property8.roundFloorCopy();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField12 = property8.getField();
        int int13 = dateTimeField12.getMaximumValue();
        int int14 = dateTimeField12.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = dateTimeField12.getType();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate18 = localDate16.minusMonths((int) (short) -1);
        boolean boolean20 = localDate16.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology21 = localDate16.getChronology();
        org.joda.time.Chronology chronology22 = localDate16.getChronology();
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now(chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = chronology22.getZone();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType15.getField(chronology22);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((-32132463L), chronology22);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 292278993 + "'", int13 == 292278993);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test20134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20134");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMinuteOfHour((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime2, dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime2.minus(readablePeriod7);
        int int9 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime localTime11 = localTime2.withMillisOfDay(21989389);
        org.joda.time.DateTime dateTime12 = localTime11.toDateTimeToday();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test20135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20135");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(629624275201000L);
    }

    @Test
    public void test20136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20136");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        mutableDateTime0.add(durationFieldType4, (-1));
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(21);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.toMutableDateTimeISO();
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Locale locale14 = new java.util.Locale("3", "");
        java.lang.String str15 = locale11.getDisplayCountry(locale14);
        java.util.Calendar calendar16 = mutableDateTime9.toCalendar(locale14);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals(locale14.toString(), "3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1644851507445,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=50,MILLISECOND=643,ZONE_OFFSET=54123198,DST_OFFSET=0]");
    }

    @Test
    public void test20137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20137");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        org.joda.time.DateTime dateTime3 = localDate0.toDateTimeAtCurrentTime();
        int int4 = localDate0.getYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDate0.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime10 = dateTime7.plus(6000000L);
        org.joda.time.DateTime.Property property11 = dateTime7.weekyear();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test20138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20138");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 8);
        long long5 = dateTimeZone2.convertLocalToUTC(79735116L, false);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate9 = localDate6.withField(dateTimeFieldType7, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTime(readableInstant10);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.DateTime dateTime14 = dateTime11.minusSeconds(10);
        int int15 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime.Property property16 = dateTime14.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        boolean boolean19 = property16.equals((java.lang.Object) 1645510409936L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-133144884L) + "'", long5 == (-133144884L));
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 212880000 + "'", int15 == 212880000);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20139");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate2.equals((java.lang.Object) (byte) 10);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtStartOfDay();
        int int6 = localDate2.size();
        int int7 = localDate2.getYearOfEra();
        org.joda.time.LocalDate.Property property8 = localDate2.era();
        org.joda.time.LocalDate localDate10 = property8.addWrapFieldToCopy((-428));
        org.joda.time.LocalDate localDate11 = property8.roundHalfFloorCopy();
        int int12 = localDate11.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate11.withDayOfWeek(54556873);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54556873 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test20140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20140");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate6 = localDate0.withYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate9 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate10 = property7.roundCeilingCopy();
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = property7.getAsShortText(locale11);
        org.joda.time.LocalDate localDate13 = property7.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField14 = property7.getField();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test20141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20141");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDate();
        java.util.Locale locale1 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withLocale(locale1);
        java.lang.String str4 = dateTimeFormatter0.print((long) 14);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter0.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter0.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter0.withDefaultYear(0);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "January 1, 1970" + "'", str4, "January 1, 1970");
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test20142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20142");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3);
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.util.Calendar calendar6 = mutableDateTime2.toCalendar(locale5);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromCalendarFields(calendar6);
        org.joda.time.LocalDate.Property property8 = localDate7.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property8.roundCeilingCopy();
        org.joda.time.LocalDate.Property property10 = localDate9.year();
        org.joda.time.LocalDate localDate11 = property10.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        org.joda.time.LocalDate localDate13 = property10.roundFloorCopy();
        org.joda.time.LocalDate localDate15 = property10.addWrapFieldToCopy((int) '4');
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.era();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(79735116L, chronology16);
        org.joda.time.Chronology chronology19 = chronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfDay();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-102834), chronology19);
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645456307504,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=50,MILLISECOND=702,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test20143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20143");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readableDuration6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfYear();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate13 = localDate10.withField(dateTimeFieldType11, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTime(readableInstant14);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime15.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property20 = dateTime18.property(dateTimeFieldType19);
        boolean boolean21 = dateTime7.isSupported(dateTimeFieldType19);
        org.joda.time.DateTime.Property property22 = dateTime7.minuteOfDay();
        int int23 = dateTime7.getDayOfYear();
        org.joda.time.DateTime dateTime25 = dateTime7.plusDays(54587639);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 53 + "'", int23 == 53);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test20144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20144");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime5.plusMonths((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = dateTime5.withMillisOfSecond(0);
        int int12 = dateTime11.getYearOfCentury();
        int int13 = dateTime11.getMillisOfDay();
        org.joda.time.DateTime dateTime15 = dateTime11.withSecondOfMinute(17);
        org.joda.time.DateTime dateTime18 = dateTime11.withDurationAdded((long) 21971, 0);
        org.joda.time.DateTime dateTime20 = dateTime11.plusDays(54688278);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22430000 + "'", int13 == 22430000);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test20145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20145");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMinuteOfHour((int) (byte) 10);
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property5.setCopy((int) ' ');
        org.joda.time.LocalTime localTime9 = property5.withMaximumValue();
        org.joda.time.LocalTime localTime10 = property5.withMaximumValue();
        org.joda.time.LocalTime localTime12 = property5.addWrapFieldToCopy(54148380);
        org.joda.time.LocalTime.Property property13 = localTime12.minuteOfHour();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test20146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20146");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.util.Locale locale3 = java.util.Locale.UK;
        boolean boolean4 = locale3.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale3.getDisplayName(locale5);
        java.lang.String str7 = locale3.getISO3Country();
        java.lang.String str8 = locale3.getDisplayName();
        java.lang.String str9 = locale2.getDisplayScript(locale3);
        java.lang.String str10 = locale3.toLanguageTag();
        java.lang.String str11 = locale0.getDisplayCountry(locale3);
        java.lang.String str12 = locale3.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Englisch (Vereinigtes K\366nigreich)" + "'", str6, "Englisch (Vereinigtes K\366nigreich)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GBR" + "'", str7, "GBR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English (United Kingdom)" + "'", str8, "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-GB" + "'", str10, "en-GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Germany" + "'", str11, "Germany");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "United Kingdom" + "'", str12, "United Kingdom");
    }

    @Test
    public void test20147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20147");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology8 = chronology6.withZone(dateTimeZone7);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DurationField durationField10 = chronology6.months();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        int int12 = localDate11.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.Chronology chronology16 = chronology6.withZone(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.minuteOfHour();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 22070358, chronology16);
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfDay();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test20148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20148");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) -1);
        boolean boolean7 = localDate3.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology8 = localDate3.getChronology();
        org.joda.time.Chronology chronology9 = localDate3.getChronology();
        long long13 = chronology9.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean14 = dateTimeFieldType2.isSupported(chronology9);
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType1.getField(chronology9);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology9);
        org.joda.time.DateTimeField dateTimeField17 = chronology9.weekyearOfCentury();
        org.joda.time.Chronology chronology18 = chronology9.withUTC();
        org.joda.time.DurationField durationField19 = chronology18.centuries();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(631152054117L, chronology18);
        int int21 = mutableDateTime20.getDayOfMonth();
        mutableDateTime20.add((long) 54508628);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 200L + "'", long13 == 200L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test20149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20149");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMinuteOfHour((int) (byte) 10);
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.LocalTime.Property property6 = localTime2.minuteOfHour();
        org.joda.time.LocalTime.Property property7 = localTime2.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime2.withSecondOfMinute(22008);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22008 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test20150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20150");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 21884220);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks(54119821);
        int int4 = localDateTime3.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test20151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20151");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = org.joda.time.format.DateTimeFormat.fullDate();
        java.lang.String str5 = dateTimeFormatter3.print((-2208988800000L));
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate9 = localDate6.withField(dateTimeFieldType7, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTime(readableInstant10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.minusMonths((int) (short) -1);
        boolean boolean16 = localDate12.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology17 = localDate12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = chronology17.withZone(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate9.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        long long23 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, (long) 2);
        long long25 = dateTimeZone18.nextTransition((long) 54130144);
        int int27 = dateTimeZone18.getOffset(2800L);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) (-2208988800000L), dateTimeZone18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter2.withZone(dateTimeZone18);
        boolean boolean30 = dateTimeFormatter29.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withOffsetParsed();
        java.lang.Integer int32 = dateTimeFormatter29.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeFormatter29.getZone();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Monday, January 1, 1900" + "'", str5, "Monday, January 1, 1900");
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 54130144L + "'", long25 == 54130144L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 54123198 + "'", int27 == 54123198);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
    }

    @Test
    public void test20152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20152");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.Chronology chronology7 = localDate1.getChronology();
        long long11 = chronology7.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.minusMonths((int) (short) -1);
        boolean boolean16 = localDate12.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology17 = localDate12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = chronology17.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.weekOfWeekyear();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = dateTimeField20.getAsText((long) (short) 1, locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(32L, chronology7, locale22);
        dateTimeParserBucket24.setOffset(54111610);
        long long29 = dateTimeParserBucket24.computeMillis(false, "Property[millisOfDay]");
        long long31 = dateTimeParserBucket24.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeParserBucket24.getZone();
        java.util.Locale locale33 = dateTimeParserBucket24.getLocale();
        java.lang.String str34 = locale33.getISO3Language();
        java.util.Locale.setDefault(locale33);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime();
        java.lang.String str37 = mutableDateTime36.toString();
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime36.add(readableDuration38);
        mutableDateTime36.setWeekyear((int) (short) 1);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime36.year();
        org.joda.time.MutableDateTime mutableDateTime43 = property42.roundHalfEven();
        long long44 = mutableDateTime43.getMillis();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime43.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime47 = property45.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration49 = null;
        mutableDateTime48.add(readableDuration49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate54 = localDate52.minusMonths((int) (short) -1);
        boolean boolean56 = localDate52.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology57 = localDate52.getChronology();
        org.joda.time.Chronology chronology58 = localDate52.getChronology();
        long long62 = chronology58.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean63 = dateTimeFieldType51.isSupported(chronology58);
        mutableDateTime48.setChronology(chronology58);
        org.joda.time.DateTimeField dateTimeField65 = chronology58.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = dateTimeField65.getType();
        java.util.Locale locale68 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleAttributes();
        java.lang.String str70 = dateTimeField65.getAsText((long) 393, locale68);
        int int71 = property45.getMaximumTextLength(locale68);
        java.lang.String str72 = locale68.getDisplayLanguage();
        java.lang.String str73 = locale33.getDisplayVariant(locale68);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 200L + "'", long11 == 200L);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-54111578L) + "'", long29 == (-54111578L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-54111578L) + "'", long31 == (-54111578L));
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "eng" + "'", str34, "eng");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2022-02-22T06:13:50.806+15:02:03.198" + "'", str37, "2022-02-22T06:13:50.806+15:02:03.198");
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-62135650923198L) + "'", long44 == (-62135650923198L));
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 200L + "'", long62 == 200L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "0" + "'", str70, "0");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 5 + "'", int71 == 5);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "English" + "'", str72, "English");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test20153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20153");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology5 = localDate0.getChronology();
        org.joda.time.Chronology chronology6 = localDate0.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.seconds();
        java.lang.String str8 = chronology6.toString();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.year();
        org.joda.time.Chronology chronology10 = chronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = chronology6.era();
        org.joda.time.DateTimeField dateTimeField14 = chronology6.centuryOfEra();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[UTC]" + "'", str8, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test20154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20154");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getEra();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusMonths(21);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusMillis(54127672);
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfCeilingCopy();
        java.lang.String str10 = property8.getAsText();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020" + "'", str10, "2020");
    }

    @Test
    public void test20155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20155");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.String str1 = mutableDateTime0.toString();
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime0.add(readableDuration2);
        mutableDateTime0.setWeekyear((int) (short) 1);
        int int6 = mutableDateTime0.getHourOfDay();
        mutableDateTime0.setMillisOfDay(50);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.weekyear();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.addWrapField(10);
        int int12 = mutableDateTime11.getSecondOfMinute();
        org.joda.time.Instant instant13 = mutableDateTime11.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setSecondOfDay(54614635);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54614635 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2022-02-22T06:13:50.845+15:02:03.198" + "'", str1, "2022-02-22T06:13:50.845+15:02:03.198");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(instant13);
    }

    @Test
    public void test20156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20156");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology5 = localDate0.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = chronology5.withZone(dateTimeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DurationField durationField9 = chronology5.months();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        int int11 = localDate10.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.Chronology chronology15 = chronology5.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField16 = chronology15.millis();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology15.centuries();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.Chronology chronology21 = chronology15.withZone(dateTimeZone20);
        org.joda.time.DurationField durationField22 = chronology15.weeks();
        org.joda.time.DateTimeField dateTimeField23 = chronology15.minuteOfDay();
        org.joda.time.DurationField durationField24 = chronology15.years();
        int int27 = durationField24.getValue((long) 8143059, (long) 731);
        long long30 = durationField24.getMillis(78, (-3198L));
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2461449600000L + "'", long30 == 2461449600000L);
    }

    @Test
    public void test20157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20157");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate10 = localDate7.withField(dateTimeFieldType8, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTime(readableInstant11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths((int) '4');
        org.joda.time.DateTime dateTime16 = dateTime12.plusMonths((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime17.add(readableDuration18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        mutableDateTime17.add(durationFieldType21, (-1));
        org.joda.time.DateTime dateTime25 = dateTime12.withFieldAdded(durationFieldType21, (int) (byte) 1);
        boolean boolean26 = dateTime5.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime28 = dateTime25.minusMillis((int) (short) 100);
        org.joda.time.DateTime.Property property29 = dateTime28.era();
        org.joda.time.DateTime dateTime30 = property29.roundCeilingCopy();
        org.joda.time.DateTime dateTime32 = dateTime30.minusWeeks(52);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate36 = localDate34.minusMonths((int) (short) -1);
        boolean boolean38 = localDate34.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology39 = localDate34.getChronology();
        org.joda.time.Chronology chronology40 = localDate34.getChronology();
        long long44 = chronology40.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean45 = dateTimeFieldType33.isSupported(chronology40);
        java.lang.String str46 = dateTimeFieldType33.getName();
        org.joda.time.DateTime.Property property47 = dateTime30.property(dateTimeFieldType33);
        org.joda.time.DateTimeField dateTimeField48 = property47.getField();
        org.joda.time.DateTime dateTime49 = property47.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 200L + "'", long44 == 200L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "minuteOfDay" + "'", str46, "minuteOfDay");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTime49);
    }

    @Test
    public void test20158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20158");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology8 = chronology6.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.weekOfWeekyear();
        long long12 = dateTimeField9.addWrapField((long) ' ', 0);
        boolean boolean13 = dateTimeField9.isSupported();
        long long16 = dateTimeField9.add(1L, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = dateTimeField9.getType();
        long long20 = dateTimeField9.getDifferenceAsLong((long) (short) 1, 200L);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate24 = localDate22.minusMonths((int) (short) -1);
        boolean boolean26 = localDate22.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology27 = localDate22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology29 = chronology27.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.weekOfWeekyear();
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = dateTimeField30.getAsText((long) (short) 1, locale32);
        java.lang.String str34 = dateTimeField9.getAsText(54117, locale32);
        java.lang.String str35 = locale0.getDisplayCountry(locale32);
        java.util.Set<java.lang.String> strSet36 = locale32.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 58665600001L + "'", long16 == 58665600001L);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "54117" + "'", str34, "54117");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test20159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20159");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime5.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime11 = dateTime5.withCenturyOfEra((int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay12 = dateTime5.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.minus(readablePeriod13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) dateTime5, chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime5.withEra(54688278);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54688278 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test20160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20160");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getEra();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusMonths(21);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusMillis(54127672);
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusHours(21950418);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusYears(54149188);
        int int14 = localDateTime13.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.era();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test20161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20161");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate6 = localDate0.withYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.DateTime dateTime8 = localDate0.toDateTimeAtMidnight();
        boolean boolean10 = dateTime8.isEqual((long) 21);
        org.joda.time.DateTime.Property property11 = dateTime8.weekyear();
        org.joda.time.DateTime.Property property12 = dateTime8.centuryOfEra();
        int int13 = property12.getMaximumValue();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2922789 + "'", int13 == 2922789);
    }

    @Test
    public void test20162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20162");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1L), dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.millisOfDay();
        java.lang.String str4 = property3.toString();
        org.joda.time.LocalTime localTime5 = property3.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime6 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime7 = localTime6.toDateTimeToday();
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTime.Property property9 = dateTime7.secondOfDay();
        java.lang.String str10 = property9.toString();
        org.joda.time.DateTime dateTime11 = property9.roundFloorCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Property[millisOfDay]" + "'", str4, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[secondOfDay]" + "'", str10, "Property[secondOfDay]");
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test20163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20163");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1645456123576L);
    }

    @Test
    public void test20164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20164");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.DateTime.Property property7 = dateTime5.monthOfYear();
        org.joda.time.tz.NameProvider nameProvider8 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.lang.String str12 = nameProvider8.getShortName(locale9, "2022-02-21T15:02:20.959Z", "2022-02-21T15:02:24.434Z");
        boolean boolean13 = locale9.hasExtensions();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime14.add(readableDuration15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths((int) (short) -1);
        boolean boolean22 = localDate18.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology23 = localDate18.getChronology();
        org.joda.time.Chronology chronology24 = localDate18.getChronology();
        long long28 = chronology24.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean29 = dateTimeFieldType17.isSupported(chronology24);
        mutableDateTime14.setChronology(chronology24);
        org.joda.time.DateTimeField dateTimeField31 = chronology24.secondOfDay();
        long long33 = dateTimeField31.roundFloor(1707724464566400001L);
        java.util.Locale locale38 = new java.util.Locale("hi!", "Property[millisOfDay]", "");
        java.lang.String str39 = dateTimeField31.getAsText((-62194316231679L), locale38);
        java.lang.String str40 = locale9.getDisplayScript(locale38);
        java.lang.String str41 = property7.getAsShortText(locale9);
        int int42 = property7.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(nameProvider8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 200L + "'", long28 == 200L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1707724464566400000L + "'", long33 == 1707724464566400000L);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!_PROPERTY[MILLISOFDAY]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "32568" + "'", str39, "32568");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Feb" + "'", str41, "Feb");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 12 + "'", int42 == 12);
    }

    @Test
    public void test20165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20165");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.Chronology chronology7 = localDate1.getChronology();
        long long11 = chronology7.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean12 = dateTimeFieldType0.isSupported(chronology7);
        org.joda.time.DateTimeField dateTimeField13 = chronology7.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = chronology7.halfdays();
        long long17 = durationField14.getDifferenceAsLong((long) 54125, (long) '#');
        long long20 = durationField14.getMillis((long) 756, (long) 54131261);
        int int22 = durationField14.getValue((-62194294184367L));
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 200L + "'", long11 == 200L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32659200000L + "'", long20 == 32659200000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1439682) + "'", int22 == (-1439682));
    }

    @Test
    public void test20166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20166");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        int int2 = localDateTime0.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMonths(54131);
        int int7 = localDateTime4.getYearOfEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime9.getValue(902);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 902");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22430987 + "'", int2 == 22430987);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test20167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20167");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        java.lang.String str2 = dateTimeFormatter0.print((-2208988800000L));
        int int3 = dateTimeFormatter0.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withPivotYear(21984605);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMinutes((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusWeeks(2022);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusYears((-1));
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withDurationAdded(readableDuration14, 0);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withDurationAdded(readableDuration17, 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.minusMonths((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime13.plusSeconds(86399999);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        int int25 = localDateTime24.getCenturyOfEra();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutableDateTime26.add(readableDuration27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getDurationType();
        mutableDateTime26.add(durationFieldType30, (-1));
        org.joda.time.LocalDateTime localDateTime34 = localDateTime24.withFieldAdded(durationFieldType30, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withWeekyear((int) 'a');
        boolean boolean39 = localDateTime13.isAfter((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusSeconds(21888665);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusMillis(173);
        int int44 = localDateTime43.size();
        org.joda.time.DateTime dateTime45 = localDateTime43.toDateTime();
        java.lang.String str46 = dateTimeFormatter5.print((org.joda.time.ReadableInstant) dateTime45);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Monday, January 1, 1900" + "'", str2, "Monday, January 1, 1900");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Friday, June 15, 0096" + "'", str46, "Friday, June 15, 0096");
    }

    @Test
    public void test20168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20168");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        mutableDateTime0.setMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime0.property(dateTimeFieldType5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate10 = localDate7.withField(dateTimeFieldType8, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTime(readableInstant11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths((int) '4');
        org.joda.time.DateTime dateTime16 = dateTime12.plusMonths((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime17.add(readableDuration18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        mutableDateTime17.add(durationFieldType21, (-1));
        org.joda.time.DateTime dateTime25 = dateTime12.withFieldAdded(durationFieldType21, (int) (byte) 1);
        org.joda.time.DateTime dateTime27 = dateTime12.plusSeconds(0);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime29.add(readableDuration30);
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.util.Calendar calendar33 = mutableDateTime29.toCalendar(locale32);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfCeiling();
        java.util.Locale locale39 = new java.util.Locale("2022-02-22T06:08:18.156+15:02:03.198", "");
        int int40 = property35.getMaximumShortTextLength(locale39);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar33);
// flaky:         org.junit.Assert.assertEquals(calendar33.toString(), "java.util.GregorianCalendar[time=1645456307823,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=51,MILLISECOND=21,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertEquals(locale39.toString(), "2022-02-22t06:08:18.156+15:02:03.198");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
    }

    @Test
    public void test20169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20169");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(20, 22076, 862, 58517, 54468439, 21914410, 54570250);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58517 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20170");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(10);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        int int9 = localDateTime8.getEra();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusMonths(21);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withYearOfEra(21);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withYearOfEra(54118820);
        java.util.Date date18 = localDateTime11.toDate();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime11.plusMillis(54122);
        org.joda.time.LocalDateTime.Property property21 = localDateTime11.era();
        int int22 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri May 22 06:13:51 GMT+15:02 2020");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test20171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20171");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readableDuration6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfYear();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate13 = localDate10.withField(dateTimeFieldType11, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTime(readableInstant14);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime15.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property20 = dateTime18.property(dateTimeFieldType19);
        boolean boolean21 = dateTime7.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime.Property property23 = dateTime7.property(dateTimeFieldType22);
        org.joda.time.DateTime dateTime24 = property23.roundCeilingCopy();
        org.joda.time.DateTime dateTime26 = property23.setCopy(719);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test20172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20172");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology5 = localDate0.getChronology();
        org.joda.time.Chronology chronology6 = localDate0.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.seconds();
        java.lang.String str8 = chronology6.toString();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(chronology6);
        org.joda.time.DateTimeField dateTimeField10 = chronology6.year();
        org.joda.time.DurationField durationField11 = chronology6.years();
        long long14 = durationField11.getMillis((int) (byte) -1, (long) 54148250);
        org.joda.time.DurationFieldType durationFieldType15 = durationField11.getType();
        long long18 = durationField11.getMillis((long) 54141456, 10947276L);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = durationField11.add((long) 1984, 3537788695125L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3537788695125");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[UTC]" + "'", str8, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-31536000000L) + "'", long14 == (-31536000000L));
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1708539328195200000L + "'", long18 == 1708539328195200000L);
    }

    @Test
    public void test20173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20173");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime0.toCalendar(locale3);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate8 = localDate5.withField(dateTimeFieldType6, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTime(readableInstant9);
        mutableDateTime0.setMillis(readableInstant9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime0.secondOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime0.weekOfWeekyear();
        java.lang.String str14 = property13.getName();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.addWrapField((int) (short) -1);
        java.lang.String str17 = property13.getAsShortText();
        int int18 = property13.getMinimumValue();
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645456307887,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+15:02:03.198,offset=54123198,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=51,MILLISECOND=85,ZONE_OFFSET=54123198,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "weekOfWeekyear" + "'", str14, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7" + "'", str17, "7");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test20174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20174");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate4 = localDate1.withField(dateTimeFieldType2, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(readableInstant5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime6.plusMonths((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime11.add(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        mutableDateTime11.add(durationFieldType15, (-1));
        org.joda.time.DateTime dateTime19 = dateTime6.withFieldAdded(durationFieldType15, (int) (byte) 1);
        mutableDateTime0.add(durationFieldType15, 86399999);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime0.millisOfSecond();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime0.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.add((long) 212880000);
        org.joda.time.MutableDateTime mutableDateTime26 = property23.roundHalfFloor();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate29 = localDate27.minusMonths((int) (short) -1);
        boolean boolean31 = localDate27.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology32 = localDate27.getChronology();
        long long38 = chronology32.getDateTimeMillis((long) (-1), (int) (short) 10, (int) ' ', (int) (byte) 10, 1);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(chronology32);
        org.joda.time.DateTimeField dateTimeField40 = chronology32.clockhourOfDay();
        long long43 = dateTimeField40.add((long) 54131261, (long) 21979391);
        mutableDateTime26.setRounding(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-48469999L) + "'", long38 == (-48469999L));
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 79125861731261L + "'", long43 == 79125861731261L);
    }

    @Test
    public void test20175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20175");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology5 = localDate0.getChronology();
        org.joda.time.Chronology chronology6 = localDate0.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.seconds();
        java.lang.String str8 = chronology6.toString();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.year();
        org.joda.time.Chronology chronology10 = chronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = chronology6.era();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology6);
        mutableDateTime14.addDays(133);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.era();
        mutableDateTime14.add((long) 21901192);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[UTC]" + "'", str8, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test20176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20176");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate6 = localDate0.withYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.minusMonths((int) (short) -1);
        boolean boolean15 = localDate11.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology16 = localDate11.getChronology();
        org.joda.time.Chronology chronology17 = localDate11.getChronology();
        long long21 = chronology17.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate24 = localDate22.minusMonths((int) (short) -1);
        boolean boolean26 = localDate22.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology27 = localDate22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology29 = chronology27.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.weekOfWeekyear();
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = dateTimeField30.getAsText((long) (short) 1, locale32);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(32L, chronology17, locale32);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate38 = localDate35.withField(dateTimeFieldType36, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDate38.toDateTime(readableInstant39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMonths((int) '4');
        org.joda.time.DateTime dateTime44 = dateTime42.plus((-48469999L));
        org.joda.time.DateTime dateTime46 = dateTime42.plusSeconds(2);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate50 = localDate47.withField(dateTimeFieldType48, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localDate50.toDateTime(readableInstant51);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate55 = localDate53.minusMonths((int) (short) -1);
        boolean boolean57 = localDate53.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology58 = localDate53.getChronology();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology60 = chronology58.withZone(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = localDate50.toDateTimeAtCurrentTime(dateTimeZone59);
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((java.lang.Object) dateTime42, dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((long) 54110102, dateTimeZone64);
        long long67 = dateTimeZone59.getMillisKeepLocal(dateTimeZone64, (long) (byte) -1);
        dateTimeParserBucket34.setZone(dateTimeZone64);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) (short) 0, dateTimeZone64);
        org.joda.time.Interval interval70 = localDate8.toInterval(dateTimeZone64);
        org.joda.time.LocalDate localDate71 = org.joda.time.LocalDate.now(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime72 = org.joda.time.MutableDateTime.now(dateTimeZone64);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime72.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        mutableDateTime72.add(readablePeriod74);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 200L + "'", long21 == 200L);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(localDate71);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(property73);
    }

    @Test
    public void test20177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20177");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        java.util.Iterator<java.lang.String> strItor2 = strSet0.iterator();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) -1);
        boolean boolean7 = localDate3.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology8 = localDate3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology10 = chronology8.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        long long14 = dateTimeField11.addWrapField((long) ' ', 0);
        boolean boolean15 = dateTimeField11.isSupported();
        long long18 = dateTimeField11.add(1L, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = dateTimeField11.getType();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = dateTimeField11.getAsText((long) (byte) 1, locale21);
        boolean boolean23 = strSet0.equals((java.lang.Object) locale21);
        java.util.Spliterator<java.lang.String> strSpliterator24 = strSet0.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream28 = languageRangeList26.stream();
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String str36 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList34);
        java.util.Locale.FilteringMode filteringMode37 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList34, filteringMode37);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream42 = languageRangeList40.stream();
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.lang.String str50 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList48);
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList48, filteringMode51);
        java.util.Locale.FilteringMode filteringMode53 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList48, filteringMode53);
        boolean boolean55 = strSet0.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream56 = languageRangeList26.parallelStream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, strMap57);
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 58665600001L + "'", long18 == 58665600001L);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeStream28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + filteringMode37 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode37.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(languageRangeStream42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + filteringMode51 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode51.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + filteringMode53 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode53.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(languageRangeStream56);
        org.junit.Assert.assertNotNull(languageRangeList58);
    }

    @Test
    public void test20178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20178");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime5.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime11 = dateTime5.withCenturyOfEra((int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay12 = dateTime5.toYearMonthDay();
        org.joda.time.DateTime dateTime14 = dateTime5.minus((long) 54117);
        org.joda.time.DateTime.Property property15 = dateTime5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.joda.time.DateTime dateTime17 = property15.getDateTime();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test20179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20179");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate4 = localDate1.withField(dateTimeFieldType2, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(readableInstant5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime6.plusMonths((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime11.add(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        mutableDateTime11.add(durationFieldType15, (-1));
        org.joda.time.DateTime dateTime19 = dateTime6.withFieldAdded(durationFieldType15, (int) (byte) 1);
        mutableDateTime0.add(durationFieldType15, 86399999);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime0.millisOfSecond();
        int int23 = mutableDateTime0.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test20180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20180");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.String str1 = mutableDateTime0.toString();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate5 = localDate2.withField(dateTimeFieldType3, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTime(readableInstant6);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime7.withWeekyear((int) (byte) 1);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.DateTime dateTime13 = dateTime10.plusWeeks(23);
        java.lang.Object obj14 = null;
        boolean boolean15 = dateTime13.equals(obj14);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime.Property property17 = dateTime13.yearOfEra();
        int int18 = property17.getLeapAmount();
        org.joda.time.DateTime dateTime19 = property17.withMaximumValue();
        boolean boolean21 = dateTime19.isAfter(366L);
        org.joda.time.DateTime dateTime23 = dateTime19.minusMonths(54565637);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2022-02-22T06:13:51.232+15:02:03.198" + "'", str1, "2022-02-22T06:13:51.232+15:02:03.198");
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test20181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20181");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate2.equals((java.lang.Object) (byte) 10);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtStartOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longTime();
        java.lang.String str7 = dateTime5.toString(dateTimeFormatter6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZoneUTC();
        java.util.Locale locale9 = dateTimeFormatter6.getLocale();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        java.lang.String str11 = mutableDateTime10.toString();
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime10.add(readableDuration12);
        mutableDateTime10.setWeekyear((int) (short) 1);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.year();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.roundCeiling();
        int int21 = dateTimeFormatter6.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime18, "2022-02-21T15:02:32.679", 70);
        org.joda.time.Chronology chronology22 = dateTimeFormatter6.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withOffsetParsed();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutableDateTime25.add(readableDuration26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate31 = localDate29.minusMonths((int) (short) -1);
        boolean boolean33 = localDate29.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology34 = localDate29.getChronology();
        org.joda.time.Chronology chronology35 = localDate29.getChronology();
        long long39 = chronology35.add((long) (byte) 100, (long) 1, (int) (short) 100);
        boolean boolean40 = dateTimeFieldType28.isSupported(chronology35);
        mutableDateTime25.setChronology(chronology35);
        org.joda.time.DurationField durationField42 = chronology35.minutes();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology35.getZone();
        org.joda.time.LocalDate localDate44 = org.joda.time.LocalDate.now(chronology35);
        long long48 = chronology35.add(4201328032L, 200L, 54130144);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter23.withChronology(chronology35);
        org.joda.time.DateTimeField dateTimeField50 = chronology35.millisOfSecond();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter6.withChronology(chronology35);
        java.lang.StringBuffer stringBuffer53 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuffer53, (long) 54417531);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12:00:00 +15:02:03.198 AM" + "'", str7, "12:00:00 +15:02:03.198 AM");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(locale9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-02-22T06:13:51.247+15:02:03.198" + "'", str11, "2022-02-22T06:13:51.247+15:02:03.198");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-71) + "'", int21 == (-71));
        org.junit.Assert.assertNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 200L + "'", long39 == 200L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 15027356832L + "'", long48 == 15027356832L);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
    }

    @Test
    public void test20182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20182");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.DateTime dateTime8 = dateTime5.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property10 = dateTime8.property(dateTimeFieldType9);
        org.joda.time.DateTime dateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = property10.getDateTime();
        org.joda.time.DateTime dateTime13 = property10.roundHalfEvenCopy();
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.DateTime dateTime16 = dateTime13.withYearOfCentury(7);
        long long17 = dateTime13.getMillis();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0001-01-01T00:00:00.000+15:02:03.198" + "'", str14, "0001-01-01T00:00:00.000+15:02:03.198");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-62135650923198L) + "'", long17 == (-62135650923198L));
    }

    @Test
    public void test20183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20183");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.Chronology chronology7 = localDate1.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.seconds();
        java.lang.String str9 = chronology7.toString();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.DurationField durationField13 = chronology7.weekyears();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 21987, chronology7);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[UTC]" + "'", str9, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test20184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20184");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("23:59:59.999");
        java.lang.String str2 = localTime1.toString();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.lang.String str6 = localTime1.toString("54135502", locale5);
        org.joda.time.LocalTime localTime8 = localTime1.minusMillis(54153473);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((-1L), dateTimeZone10);
        org.joda.time.LocalTime localTime13 = localTime11.withMinuteOfHour((int) (byte) 10);
        org.joda.time.LocalTime.Property property14 = localTime11.millisOfDay();
        org.joda.time.LocalTime.Property property15 = localTime11.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        org.joda.time.LocalTime.Property property17 = localTime1.property(dateTimeFieldType16);
        org.joda.time.LocalTime localTime18 = property17.withMinimumValue();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23:59:59.999" + "'", str2, "23:59:59.999");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "54135502" + "'", str6, "54135502");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test20185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20185");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology5 = localDate0.getChronology();
        org.joda.time.Chronology chronology6 = localDate0.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.seconds();
        java.lang.String str8 = chronology6.toString();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(chronology6);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtCurrentTime();
        int int11 = localDate9.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localDate9.getField(22094818);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 22094818");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[UTC]" + "'", str8, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test20186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20186");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getEra();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minus(readablePeriod2);
        int int4 = localDateTime3.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYearOfEra(54126273);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusMinutes(54128391);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        int int11 = localDateTime9.getHourOfDay();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test20187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20187");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 54110102, dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        mutableDateTime2.setMillis(readableInstant3);
        mutableDateTime2.setYear(8);
        mutableDateTime2.setMillis(1L);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime2.getZone();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("2022-02-21T15:02:09.402Z");
        java.time.ZoneId zoneId13 = timeZone12.toZoneId();
        boolean boolean14 = timeZone10.hasSameRules(timeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+15:02");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20188");
        java.util.Locale locale3 = new java.util.Locale("Sunday, February 21, -0001", "2022-02-21T15:01:56.023Z", "");
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.lang.String str5 = locale3.getDisplayLanguage(locale4);
        java.util.Locale.setDefault(locale4);
        java.lang.String str7 = locale4.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "sunday, february 21, -0001_2022-02-21T15:01:56.023Z");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "sunday, february 21, -0001" + "'", str5, "sunday, february 21, -0001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Deutsch" + "'", str7, "Deutsch");
    }

    @Test
    public void test20189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20189");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) (short) -1);
        java.lang.String str4 = dateTimeFormatter0.print(60000L);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withChronology(chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths((int) (short) -1);
        boolean boolean13 = localDate9.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology14 = localDate9.getChronology();
        org.joda.time.Chronology chronology15 = localDate9.getChronology();
        long long19 = chronology15.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.minusMonths((int) (short) -1);
        boolean boolean24 = localDate20.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology25 = localDate20.getChronology();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology27 = chronology25.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.weekOfWeekyear();
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = dateTimeField28.getAsText((long) (short) 1, locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(32L, chronology15, locale30);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate36 = localDate33.withField(dateTimeFieldType34, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDate36.toDateTime(readableInstant37);
        org.joda.time.DateTime dateTime40 = dateTime38.plusMonths((int) '4');
        org.joda.time.DateTime dateTime42 = dateTime40.plus((-48469999L));
        org.joda.time.DateTime dateTime44 = dateTime40.plusSeconds(2);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate48 = localDate45.withField(dateTimeFieldType46, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.DateTime dateTime50 = localDate48.toDateTime(readableInstant49);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate53 = localDate51.minusMonths((int) (short) -1);
        boolean boolean55 = localDate51.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology56 = localDate51.getChronology();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology58 = chronology56.withZone(dateTimeZone57);
        org.joda.time.DateTime dateTime59 = localDate48.toDateTimeAtCurrentTime(dateTimeZone57);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((java.lang.Object) dateTime40, dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((long) 54110102, dateTimeZone62);
        long long65 = dateTimeZone57.getMillisKeepLocal(dateTimeZone62, (long) (byte) -1);
        dateTimeParserBucket32.setZone(dateTimeZone62);
        java.util.Locale locale67 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter0.withLocale(locale67);
        boolean boolean69 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter0.withPivotYear(522);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime73 = dateTimeFormatter0.parseLocalTime("2022-02-22T06:07:58.410+15:02:03.198");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-22T06:07:58.410+15:02:03.198\" is malformed at \"22-02-22T06:07:58.410+15:02:03.198\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00:01" + "'", str4, "00:01");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 200L + "'", long19 == 200L);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1" + "'", str31, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
    }

    @Test
    public void test20190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20190");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getEra();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minus(readablePeriod2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusDays(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime9 = property8.getLocalDateTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test20191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20191");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getDisplayName();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) (short) -1);
        boolean boolean7 = localDate3.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology8 = localDate3.getChronology();
        org.joda.time.Chronology chronology9 = localDate3.getChronology();
        long long13 = chronology9.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        long long16 = dateTimeField14.roundHalfFloor((long) 47);
        java.lang.String str17 = dateTimeField14.toString();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = dateTimeField14.getAsText(212880000, locale19);
        boolean boolean21 = locale19.hasExtensions();
        java.lang.String str22 = locale1.getDisplayName(locale19);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deutsch" + "'", str2, "Deutsch");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 200L + "'", long13 == 200L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DateTimeField[weekyearOfCentury]" + "'", str17, "DateTimeField[weekyearOfCentury]");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "212880000" + "'", str20, "212880000");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "German" + "'", str22, "German");
    }

    @Test
    public void test20192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20192");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate6 = localDate0.withYear((int) (byte) 1);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.era();
        org.joda.time.DurationField durationField9 = chronology7.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.yearOfCentury();
        int int11 = dateTimeField10.getMaximumValue();
        long long13 = dateTimeField10.roundFloor((long) 54150261);
        long long16 = dateTimeField10.add((long) 54561937, 22046255);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 695712610883361937L + "'", long16 == 695712610883361937L);
    }

    @Test
    public void test20193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20193");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays(14);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusDays(292278993);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekyear(54135478);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMinutes((int) (short) 10);
        int int11 = localDateTime10.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusDays((-1));
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.dayOfYear();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withYear((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int19 = localDateTime17.get(dateTimeFieldType18);
        int int20 = localDateTime0.get(dateTimeFieldType18);
        java.lang.String str21 = dateTimeFieldType18.getName();
        java.lang.String str22 = dateTimeFieldType18.getName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "yearOfEra" + "'", str21, "yearOfEra");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "yearOfEra" + "'", str22, "yearOfEra");
    }

    @Test
    public void test20194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20194");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate4 = localDate1.withField(dateTimeFieldType2, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(readableInstant5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime8.plus((-48469999L));
        org.joda.time.DateTime dateTime12 = dateTime8.plusSeconds(2);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate16 = localDate13.withField(dateTimeFieldType14, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTime(readableInstant17);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate21 = localDate19.minusMonths((int) (short) -1);
        boolean boolean23 = localDate19.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology24 = localDate19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology26 = chronology24.withZone(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = localDate16.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) dateTime8, dateTimeZone25);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate32 = localDate29.withField(dateTimeFieldType30, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localDate32.toDateTime(readableInstant33);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate37 = localDate35.minusMonths((int) (short) -1);
        boolean boolean39 = localDate35.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology40 = localDate35.getChronology();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology42 = chronology40.withZone(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = localDate32.toDateTimeAtCurrentTime(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        long long46 = dateTimeZone41.getMillisKeepLocal(dateTimeZone44, (long) 2);
        org.joda.time.Interval interval47 = localDate28.toInterval(dateTimeZone41);
        org.joda.time.LocalDate localDate49 = localDate28.withYearOfCentury((int) (short) 10);
        org.joda.time.LocalDate localDate51 = localDate28.plusYears(47);
        int int52 = localDate51.getYearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration54 = null;
        mutableDateTime53.add(readableDuration54);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType57 = dateTimeFieldType56.getDurationType();
        mutableDateTime53.add(durationFieldType57, (-1));
        org.joda.time.DateTimeZone dateTimeZone60 = mutableDateTime53.getZone();
        org.joda.time.DateTime dateTime61 = localDate51.toDateTimeAtCurrentTime(dateTimeZone60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) 22150843, dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 2L + "'", long46 == 2L);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 50 + "'", int52 == 50);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(durationFieldType57);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTime61);
    }

    @Test
    public void test20195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20195");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(0L);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDate1.getFields();
        org.joda.time.LocalDate.Property property3 = localDate1.yearOfEra();
        org.joda.time.LocalDate localDate5 = localDate1.minusWeeks(21952066);
        int int6 = localDate1.getCenturyOfEra();
        int int7 = localDate1.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test20196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20196");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) (short) -1);
        boolean boolean4 = localDate0.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology5 = localDate0.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = chronology5.withZone(dateTimeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField9 = chronology5.weekyearOfCentury();
        long long11 = dateTimeField9.roundHalfCeiling((long) (short) 100);
        long long13 = dateTimeField9.roundHalfCeiling((long) 21880163);
        int int15 = dateTimeField9.getMinimumValue(1645401600000L);
        java.lang.String str17 = dateTimeField9.getAsShortText((long) 22169);
        boolean boolean19 = dateTimeField9.isLeap(21886621L);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "70" + "'", str17, "70");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20197");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) (short) -1);
        java.lang.String str4 = dateTimeFormatter0.print(60000L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withPivotYear(0);
        org.joda.time.Chronology chronology7 = dateTimeFormatter0.getChronology();
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(50);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        long long13 = dateTimeZone10.nextTransition((long) 727);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj8, dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter0.withZone(dateTimeZone10);
        java.lang.String str17 = dateTimeFormatter0.print((long) 8196953);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00:01" + "'", str4, "00:01");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 727L + "'", long13 == 727L);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "02:16" + "'", str17, "02:16");
    }

    @Test
    public void test20198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20198");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getEra();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withMillisOfDay(2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withCenturyOfEra(560);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusHours(54130);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusSeconds(21938850);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMinutes(54);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusMillis(21914410);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plusWeeks(21946914);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime9.withWeekOfWeekyear(54614909);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54614909 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test20199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20199");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) (short) -1);
        boolean boolean5 = localDate1.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology6 = localDate1.getChronology();
        org.joda.time.Chronology chronology7 = localDate1.getChronology();
        long long11 = chronology7.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.minusMonths((int) (short) -1);
        boolean boolean16 = localDate12.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology17 = localDate12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = chronology17.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.weekOfWeekyear();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = dateTimeField20.getAsText((long) (short) 1, locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(32L, chronology7, locale22);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate28 = localDate25.withField(dateTimeFieldType26, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTime(readableInstant29);
        org.joda.time.DateTime dateTime32 = dateTime30.plusMonths((int) '4');
        org.joda.time.DateTime dateTime34 = dateTime32.plus((-48469999L));
        org.joda.time.DateTime dateTime36 = dateTime32.plusSeconds(2);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate40 = localDate37.withField(dateTimeFieldType38, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.DateTime dateTime42 = localDate40.toDateTime(readableInstant41);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate45 = localDate43.minusMonths((int) (short) -1);
        boolean boolean47 = localDate43.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology48 = localDate43.getChronology();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology50 = chronology48.withZone(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = localDate40.toDateTimeAtCurrentTime(dateTimeZone49);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((java.lang.Object) dateTime32, dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) 54110102, dateTimeZone54);
        long long57 = dateTimeZone49.getMillisKeepLocal(dateTimeZone54, (long) (byte) -1);
        dateTimeParserBucket24.setZone(dateTimeZone54);
        java.util.Locale locale59 = dateTimeParserBucket24.getLocale();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket24.setZone(dateTimeZone60);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        dateTimeParserBucket24.setZone(dateTimeZone62);
        org.joda.time.Chronology chronology64 = dateTimeParserBucket24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(chronology64);
        org.joda.time.DateTimeField dateTimeField66 = chronology64.secondOfDay();
        org.joda.time.DateTimeField dateTimeField67 = chronology64.minuteOfDay();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 200L + "'", long11 == 200L);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
    }

    @Test
    public void test20200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20200");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) (short) 10);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime6);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withField(dateTimeFieldType9, 0);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        int int14 = localDateTime12.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusYears((int) (byte) 100);
        int int19 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime11.plus(readableDuration20);
        int int22 = localDateTime21.getMillisOfSecond();
        int int23 = localDateTime21.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.yearOfEra();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundHalfCeilingCopy();
        int int26 = property24.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime27 = property24.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime29 = property24.setCopy(22046159);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withDurationAdded(readableDuration30, 54156423);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 54708345 + "'", int14 == 54708345);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test20201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20201");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime0.toCalendar(locale3);
        java.lang.String str5 = mutableDateTime0.toString();
        mutableDateTime0.addWeeks(901);
        org.joda.time.Chronology chronology8 = mutableDateTime0.getChronology();
        mutableDateTime0.addWeekyears(54130144);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime0.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add(54499867);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645456308369,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=11,SECOND=48,MILLISECOND=369,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-21T15:11:48.369Z" + "'", str5, "2022-02-21T15:11:48.369Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test20202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20202");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((-292275054));
        org.joda.time.LocalTime localTime4 = localTime0.plusMinutes(21971982);
        int int5 = localTime0.getMillisOfSecond();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 382 + "'", int5 == 382);
    }

    @Test
    public void test20203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20203");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTime(readableInstant4);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.DateTime dateTime8 = dateTime5.withWeekyear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property10 = dateTime8.property(dateTimeFieldType9);
        org.joda.time.DateTime dateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.minusMonths((int) (short) -1);
        boolean boolean16 = localDate12.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology17 = localDate12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = chronology17.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.weekOfWeekyear();
        long long23 = dateTimeField20.addWrapField((long) ' ', 0);
        boolean boolean24 = dateTimeField20.isSupported();
        long long27 = dateTimeField20.add(1L, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = dateTimeField20.getType();
        long long31 = dateTimeField20.getDifferenceAsLong((long) (short) 1, 200L);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate34 = localDate32.minusMonths((int) (short) -1);
        boolean boolean36 = localDate32.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDate localDate38 = localDate32.withYear((int) (byte) 1);
        org.joda.time.LocalDate.Property property39 = localDate32.yearOfEra();
        org.joda.time.LocalDate localDate40 = property39.roundFloorCopy();
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.lang.String str42 = dateTimeField20.getAsText((org.joda.time.ReadablePartial) localDate40, locale41);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate46 = localDate44.minusMonths((int) (short) -1);
        boolean boolean48 = localDate44.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology49 = localDate44.getChronology();
        org.joda.time.Chronology chronology50 = localDate44.getChronology();
        long long54 = chronology50.add((long) (byte) 100, (long) 1, (int) (short) 100);
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate57 = localDate55.minusMonths((int) (short) -1);
        boolean boolean59 = localDate55.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology60 = localDate55.getChronology();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology62 = chronology60.withZone(dateTimeZone61);
        org.joda.time.DateTimeField dateTimeField63 = chronology60.weekOfWeekyear();
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = dateTimeField63.getAsText((long) (short) 1, locale65);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket(32L, chronology50, locale65);
        java.lang.String str68 = locale41.getDisplayVariant(locale65);
        int int69 = property10.getMaximumShortTextLength(locale65);
        org.joda.time.DateTime dateTime70 = property10.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime71 = property10.roundFloorCopy();
        org.joda.time.DateTime dateTime72 = property10.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 58665600001L + "'", long27 == 58665600001L);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "52" + "'", str42, "52");
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 200L + "'", long54 == 200L);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "de");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "1" + "'", str66, "1");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 9 + "'", int69 == 9);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime72);
    }

    @Test
    public void test20204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20204");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime4.add(readableDuration5);
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.util.Calendar calendar8 = mutableDateTime4.toCalendar(locale7);
        java.lang.String str9 = property3.getAsText(locale7);
        java.lang.String str10 = locale7.toLanguageTag();
        java.lang.String str11 = locale7.getISO3Country();
        java.util.Locale locale12 = locale7.stripExtensions();
        java.lang.Class<?> wildcardClass13 = locale12.getClass();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645456308440,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=11,SECOND=48,MILLISECOND=440,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "de" + "'", str10, "de");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20205");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-21T15:02:24.490Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.centuryOfEra();
        int int3 = mutableDateTime1.getMillisOfSecond();
        mutableDateTime1.addMonths(21886838);
        mutableDateTime1.add(623222041L);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime1.toMutableDateTimeISO();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate14 = localDate11.withField(dateTimeFieldType12, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTime(readableInstant15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate19 = localDate17.minusMonths((int) (short) -1);
        boolean boolean21 = localDate17.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology22 = localDate17.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = chronology22.withZone(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 54140332, dateTimeZone23);
        mutableDateTime27.addWeeks(54744394);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime27.property(dateTimeFieldType30);
        int int32 = mutableDateTime8.get(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 490 + "'", int3 == 490);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 18 + "'", int32 == 18);
    }
}
