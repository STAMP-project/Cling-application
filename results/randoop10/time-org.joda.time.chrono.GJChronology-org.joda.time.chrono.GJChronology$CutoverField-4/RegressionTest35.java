import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test17501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17501");
        java.util.Locale locale2 = new java.util.Locale("2022-02-21T12:17:54.066", "26495445");
        java.lang.String str3 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "2022-02-21t12:17:54.066_26495445");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17502");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusDays((int) (short) -1);
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.Chronology chronology7 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMillisOfDay(26160);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, readableInstant11, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.yearOfCentury();
        long long19 = dateTimeField16.add(100L, 7);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        boolean boolean22 = localDateTime20.isBefore((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        int int25 = localDateTime23.get(dateTimeFieldType24);
        boolean boolean26 = localDateTime21.isAfter((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.minusSeconds(0);
        org.joda.time.LocalDateTime.Property property31 = localDateTime23.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, readableInstant33, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone36 = gJChronology35.getZone();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology35.yearOfEra();
        org.joda.time.DurationField durationField38 = gJChronology35.halfdays();
        org.joda.time.DurationField durationField39 = gJChronology35.centuries();
        org.joda.time.DateTimeZone dateTimeZone40 = gJChronology35.getZone();
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str43 = dateTimeZone40.getName(24L, locale42);
        java.lang.String str44 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDateTime23, locale42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime.Property property46 = localDateTime23.dayOfWeek();
        int int47 = property46.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime48 = property46.getLocalDateTime();
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022-02-21T07:25:43.366" + "'", str6, "2022-02-21T07:25:43.366");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 220924800100L + "'", long19 == 220924800100L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00" + "'", str43, "+00:00");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "22" + "'", str44, "22");
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(localDateTime48);
    }

    @Test
    public void test17503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17503");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 26149);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, readableInstant7, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = mutableDateTime16.toDateTimeISO();
        org.joda.time.DateTime.Property property18 = dateTime17.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.withPeriodAdded(readablePeriod19, 0);
        int int22 = dateTime17.getSecondOfDay();
        org.joda.time.DateTime.Property property23 = dateTime17.minuteOfHour();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, (org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26, (int) (short) 1);
        java.lang.String str29 = gJChronology28.toString();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology28.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology28.era();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology28.minuteOfDay();
        org.joda.time.DurationField durationField33 = gJChronology28.seconds();
        boolean boolean34 = dateTimeZone13.equals((java.lang.Object) gJChronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter3.withChronology((org.joda.time.Chronology) gJChronology28);
        org.joda.time.Chronology chronology36 = dateTimeFormatter35.getChronolgy();
        java.util.Locale locale37 = dateTimeFormatter35.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter35.withZoneUTC();
        java.lang.StringBuffer stringBuffer39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime();
        boolean boolean42 = localDateTime40.isBefore((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.DateTime dateTime43 = localDateTime40.toDateTime();
        org.joda.time.DateTime dateTime44 = dateTime43.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime47 = dateTime44.withPeriodAdded(readablePeriod45, 267);
        org.joda.time.DateTime.Property property48 = dateTime47.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter35.printTo(stringBuffer39, (org.joda.time.ReadableInstant) dateTime47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 26743 + "'", int22 == 26743);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(gJChronology28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str29, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNull(locale37);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
    }

    @Test
    public void test17504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17504");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMonths((int) (byte) 100);
        org.joda.time.DateTime dateTime12 = dateTime8.plusHours(1);
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        int int15 = dateTime13.getCenturyOfEra();
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
    }

    @Test
    public void test17505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17505");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 26149);
        int int6 = dateTimeFormatter3.getDefaultYear();
        int int7 = dateTimeFormatter3.getDefaultYear();
        boolean boolean8 = dateTimeFormatter3.isPrinter();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        boolean boolean11 = localDateTime9.isBefore((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.minuteOfHour();
        int[] intArray13 = localDateTime9.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology18.getZone();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.yearOfEra();
        org.joda.time.DurationField durationField21 = gJChronology18.halfdays();
        boolean boolean22 = dateTimeFieldType14.isSupported((org.joda.time.Chronology) gJChronology18);
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType14.getDurationType();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime9.withFieldAdded(durationFieldType23, 525);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readablePeriod26);
        org.joda.time.Chronology chronology28 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter3.withChronology(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime();
        boolean boolean33 = localDateTime31.isBefore((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime31.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.plusDays((int) (short) -1);
        org.joda.time.LocalDateTime.Property property37 = localDateTime31.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(dateTimeZone38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.era();
        boolean boolean44 = mutableDateTime39.isEqual((org.joda.time.ReadableInstant) mutableDateTime42);
        int int45 = property37.getDifference((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.DurationField durationField46 = property37.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime47 = property37.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime48 = property37.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusMillis(26182);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusMillis(26352);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = dateTimeFormatter3.print((org.joda.time.ReadablePartial) localDateTime52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22, 26743422]");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(property43);
// flaky:         org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
    }

    @Test
    public void test17506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17506");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property3.getLocalDateTime();
        int int5 = localDateTime4.getDayOfMonth();
        int int6 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = mutableDateTime11.toDateTimeISO();
        int int13 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = mutableDateTime15.toDateTimeISO();
        org.joda.time.DateTime.Property property17 = dateTime16.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.withPeriodAdded(readablePeriod18, 0);
        int int21 = dateTime16.getSecondOfDay();
        mutableDateTime11.setDate((org.joda.time.ReadableInstant) dateTime16);
        mutableDateTime11.addDays(26147);
        java.lang.String str25 = mutableDateTime11.toString();
        int int26 = mutableDateTime11.getRoundingMode();
        org.joda.time.DateTime dateTime27 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime11.yearOfCentury();
        boolean boolean29 = property28.isLeap();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26743 + "'", int21 == 26743);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2093-09-24T07:25:43.455Z" + "'", str25, "2093-09-24T07:25:43.455Z");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test17507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17507");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        mutableDateTime3.setMillisOfDay((int) 'a');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime3.era();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = mutableDateTime21.toDateTimeISO();
        int int23 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime25.toDateTimeISO();
        org.joda.time.DateTime.Property property27 = dateTime26.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.withPeriodAdded(readablePeriod28, 0);
        int int31 = dateTime26.getSecondOfDay();
        mutableDateTime21.setDate((org.joda.time.ReadableInstant) dateTime26);
        mutableDateTime21.setMillisOfDay((int) 'a');
        boolean boolean35 = mutableDateTime3.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        mutableDateTime21.setDayOfYear((int) (short) 10);
        int int38 = mutableDateTime21.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39, readableInstant40, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField43 = gJChronology42.millisOfDay();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology42.yearOfCentury();
        org.joda.time.DurationField durationField46 = gJChronology42.days();
        org.joda.time.DurationField durationField47 = gJChronology42.months();
        org.joda.time.DurationField durationField48 = gJChronology42.weekyears();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime21, (org.joda.time.Chronology) gJChronology42);
        mutableDateTime21.addMillis(479);
        mutableDateTime21.setSecondOfDay(26161);
        int int54 = mutableDateTime21.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime21.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26743 + "'", int13 == 26743);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 26743 + "'", int31 == 26743);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 26161576 + "'", int54 == 26161576);
        org.junit.Assert.assertNotNull(property55);
    }

    @Test
    public void test17508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17508");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property3.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        boolean boolean6 = property5.isLeap();
        org.joda.time.LocalDateTime localDateTime7 = property5.getLocalDateTime();
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale8);
        java.lang.String str10 = locale8.getDisplayScript();
        java.lang.String str11 = property5.getAsShortText(locale8);
        java.lang.String str12 = property5.toString();
        org.joda.time.LocalDateTime localDateTime13 = property5.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str16 = dateTimeZone15.getID();
        boolean boolean17 = dateTimeZone15.isFixed();
        long long19 = dateTimeZone15.convertUTCToLocal((long) (byte) 0);
        int int21 = dateTimeZone15.getStandardOffset((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone15);
        int int23 = localDateTime22.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYear(26236);
        int int26 = localDateTime22.getHourOfDay();
        int int27 = property5.compareTo((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology29 = instant28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = instant28.toMutableDateTimeISO();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime();
        boolean boolean33 = localDateTime31.isBefore((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyear();
        int int36 = localDateTime34.get(dateTimeFieldType35);
        boolean boolean37 = localDateTime32.isAfter((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime32.plusSeconds(53);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = mutableDateTime41.toDateTimeISO();
        org.joda.time.DateTime.Property property43 = dateTime42.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime42.withPeriodAdded(readablePeriod44, 0);
        org.joda.time.DateTime.Property property47 = dateTime46.hourOfDay();
        org.joda.time.DateTime dateTime48 = property47.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime49 = dateTime48.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime51 = dateTime49.withMinuteOfHour(1);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now(dateTimeZone54);
        org.joda.time.DateTime dateTime56 = mutableDateTime55.toDateTimeISO();
        int int57 = mutableDateTime53.compareTo((org.joda.time.ReadableInstant) mutableDateTime55);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now(dateTimeZone58);
        org.joda.time.DateTime dateTime60 = mutableDateTime59.toDateTimeISO();
        org.joda.time.DateTime.Property property61 = dateTime60.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.DateTime dateTime64 = dateTime60.withPeriodAdded(readablePeriod62, 0);
        int int65 = dateTime60.getSecondOfDay();
        mutableDateTime55.setDate((org.joda.time.ReadableInstant) dateTime60);
        mutableDateTime55.setMillisOfDay((int) 'a');
        int int69 = dateTime49.compareTo((org.joda.time.ReadableInstant) mutableDateTime55);
        org.joda.time.DateTime.Property property70 = dateTime49.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property70.getFieldType();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime32.withField(dateTimeFieldType71, 26439244);
        mutableDateTime30.set(dateTimeFieldType71, 505);
        int int76 = localDateTime22.indexOf(dateTimeFieldType71);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7" + "'", str11, "7");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[hourOfDay]" + "'", str12, "Property[hourOfDay]");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTime64);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 26743 + "'", int65 == 26743);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test17509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17509");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withPeriodAdded(readablePeriod4, 0);
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        int int8 = property7.getMinimumValueOverall();
        org.joda.time.DateTime dateTime9 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfDay();
        org.joda.time.DateTime dateTime11 = property10.roundFloorCopy();
        int int12 = property10.getLeapAmount();
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.hourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = dateTimeField21.getType();
        java.lang.String str23 = dateTimeField21.toString();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        boolean boolean26 = localDateTime24.isBefore((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyear();
        int int29 = localDateTime27.get(dateTimeFieldType28);
        boolean boolean30 = localDateTime25.isAfter((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusMonths(100);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale40 = java.util.Locale.PRC;
        java.lang.String str41 = dateTimeZone38.getShortName((long) 2022, locale40);
        java.lang.String str42 = dateTimeField21.getAsShortText((org.joda.time.ReadablePartial) localDateTime36, 295, locale40);
        java.util.Locale.setDefault(category14, locale40);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone44, readableInstant45, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField48 = gJChronology47.millisOfDay();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology47.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology47.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone51 = gJChronology47.getZone();
        java.lang.String str52 = dateTimeZone51.getID();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(dateTimeZone53);
        org.joda.time.DateTime dateTime55 = mutableDateTime54.toDateTimeISO();
        org.joda.time.DateTime.Property property56 = dateTime55.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.DateTime dateTime59 = dateTime55.withPeriodAdded(readablePeriod57, 0);
        int int60 = dateTime55.getSecondOfDay();
        org.joda.time.DateTime.Property property61 = dateTime55.minuteOfHour();
        org.joda.time.chrono.GJChronology gJChronology62 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone51, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.chrono.GJChronology gJChronology66 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone63, readableInstant64, (int) (short) 1);
        java.lang.String str67 = gJChronology66.toString();
        org.joda.time.DateTimeField dateTimeField68 = gJChronology66.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField69 = gJChronology66.era();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology66.minuteOfDay();
        org.joda.time.DurationField durationField71 = gJChronology66.seconds();
        boolean boolean72 = dateTimeZone51.equals((java.lang.Object) gJChronology66);
        org.joda.time.DateTimeField dateTimeField73 = gJChronology66.yearOfEra();
        org.joda.time.tz.NameProvider nameProvider75 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale76 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale76);
        java.lang.String str80 = nameProvider75.getName(locale76, "secondOfMinute", "Etc/UTC");
        java.lang.String str81 = locale76.getDisplayLanguage();
        java.lang.String str82 = dateTimeField73.getAsText(4528800000L, locale76);
        boolean boolean83 = locale76.hasExtensions();
        java.lang.String str84 = locale76.getScript();
        java.util.Locale.setDefault(category14, locale76);
        java.util.Locale locale88 = new java.util.Locale("2093-09-24T07:17:56.012Z", "2022-02-21T12:17:25.911");
        java.util.Locale.setDefault(category14, locale88);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime90 = property10.setCopy("2022-02-22T00:21:04.810", locale88);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T00:21:04.810\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DateTimeField[hourOfHalfday]" + "'", str23, "DateTimeField[hourOfHalfday]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "295" + "'", str42, "295");
        org.junit.Assert.assertNotNull(gJChronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "UTC" + "'", str52, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime59);
// flaky:         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 26743 + "'", int60 == 26743);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(gJChronology62);
        org.junit.Assert.assertNotNull(gJChronology66);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str67, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(nameProvider75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "de_DE");
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Deutsch" + "'", str81, "Deutsch");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "1970" + "'", str82, "1970");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals(locale88.toString(), "2093-09-24t07:17:56.012z_2022-02-21T12:17:25.911");
    }

    @Test
    public void test17510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17510");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.yearOfCentury();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology3);
        org.joda.time.Instant instant10 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.secondOfMinute();
        long long16 = dateTimeField14.roundHalfFloor((-1L));
        long long19 = dateTimeField14.add((long) 26579, 2257);
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2283579L + "'", long19 == 2283579L);
    }

    @Test
    public void test17511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17511");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMonths((int) (byte) 100);
        org.joda.time.DateTime.Property property11 = dateTime10.year();
        org.joda.time.DateTime dateTime13 = property11.addToCopy(999);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getRangeDurationType();
        org.joda.time.DateTime dateTime17 = dateTime13.withFieldAdded(durationFieldType15, 0);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes(26175);
        org.joda.time.DateTime dateTime21 = dateTime19.minusYears(26150);
        java.lang.String str22 = dateTime19.toString();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, readableInstant25, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField28 = gJChronology27.millisOfDay();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology27.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology27.getZone();
        boolean boolean32 = dateTimeZone31.isFixed();
        java.lang.String str34 = dateTimeZone31.getNameKey(0L);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(5662872000026258L, dateTimeZone31);
        org.joda.time.DateTime dateTime36 = dateTime19.withZone(dateTimeZone31);
        java.lang.String str37 = dateTime19.toString();
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str4, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "3012-10-04T03:10:43.576Z" + "'", str22, "3012-10-04T03:10:43.576Z");
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertNotNull(dateTime36);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "3012-10-04T03:10:43.576Z" + "'", str37, "3012-10-04T03:10:43.576Z");
    }

    @Test
    public void test17512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17512");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology12.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(100L, (org.joda.time.Chronology) gJChronology12);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.millisOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology20.getZone();
        org.joda.time.Chronology chronology25 = gJChronology12.withZone(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter7.withZone(dateTimeZone24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter28.withDefaultYear((-1645514154));
        java.io.Writer writer31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        boolean boolean34 = localDateTime32.isBefore((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyear();
        int int37 = localDateTime35.get(dateTimeFieldType36);
        boolean boolean38 = localDateTime33.isAfter((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime35.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusMonths(100);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusMinutes(20);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime();
        mutableDateTime47.addWeeks(4);
        org.joda.time.DateTime dateTime50 = localDateTime44.toDateTime((org.joda.time.ReadableInstant) mutableDateTime47);
        mutableDateTime47.add((-7L));
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter30.printTo(writer31, (org.joda.time.ReadableInstant) mutableDateTime47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(dateTime50);
    }

    @Test
    public void test17513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17513");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = mutableDateTime2.toDateTimeISO();
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DateTime dateTime5 = property4.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime7 = property4.addToCopy((long) 2);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology11.getZone();
        org.joda.time.DurationField durationField14 = gJChronology11.weekyears();
        boolean boolean15 = dateTime7.equals((java.lang.Object) gJChronology11);
        org.joda.time.DurationField durationField16 = gJChronology11.days();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 26176970, (org.joda.time.Chronology) gJChronology11);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test17514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17514");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        java.lang.String str8 = dateTimeZone7.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = mutableDateTime10.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime11.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.withPeriodAdded(readablePeriod13, 0);
        int int16 = dateTime11.getSecondOfDay();
        org.joda.time.DateTime.Property property17 = dateTime11.minuteOfHour();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20, (int) (short) 1);
        java.lang.String str23 = gJChronology22.toString();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology22.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology22.era();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology22.minuteOfDay();
        org.joda.time.DurationField durationField27 = gJChronology22.seconds();
        boolean boolean28 = dateTimeZone7.equals((java.lang.Object) gJChronology22);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology22.era();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology31 = gJChronology22.withZone(dateTimeZone30);
        org.joda.time.DurationField durationField32 = gJChronology22.days();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology22.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology22.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 326, dateTimeZone36);
        int[] intArray39 = gJChronology22.get((org.joda.time.ReadablePartial) localDateTime37, 1645428053399L);
        int int40 = localDateTime37.getEra();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26743 + "'", int16 == 26743);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(gJChronology22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GJChronology[UTC,mdfw=1]" + "'", str23, "GJChronology[UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[2022, 2, 21, 26453399]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test17515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17515");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = localDateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.minusSeconds(0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime3.yearOfEra();
        java.lang.String str12 = property11.getAsShortText();
        org.joda.time.LocalDateTime localDateTime14 = property11.addToCopy((long) 26150);
        long long15 = property11.remainder();
        long long16 = property11.remainder();
        int int17 = property11.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime19 = property11.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withDurationAdded(readableDuration20, 26183);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withPeriodAdded(readablePeriod23, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4519543645L + "'", long15 == 4519543645L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 4519543645L + "'", long16 == 4519543645L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test17516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17516");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = localDateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.minusSeconds(0);
        int int11 = localDateTime3.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property12 = localDateTime3.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime3.plusHours(15);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYearOfEra(10);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withDurationAdded(readableDuration17, 144);
        int int20 = localDateTime16.getCenturyOfEra();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.centuries();
        java.lang.String str22 = durationFieldType21.getName();
        java.lang.String str23 = durationFieldType21.toString();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, readableInstant25, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField28 = gJChronology27.millisOfDay();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology27.minuteOfHour();
        org.joda.time.DurationField durationField31 = gJChronology27.years();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology27.secondOfMinute();
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, readableInstant35, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = gJChronology37.getZone();
        org.joda.time.DateTimeZone dateTimeZone39 = gJChronology37.getZone();
        java.lang.String str41 = dateTimeZone39.getName((long) 26155);
        org.joda.time.Chronology chronology42 = gJChronology33.withZone(dateTimeZone39);
        long long44 = dateTimeZone39.previousTransition((long) 26167);
        org.joda.time.Chronology chronology45 = gJChronology27.withZone(dateTimeZone39);
        org.joda.time.DurationField durationField46 = durationFieldType21.getField((org.joda.time.Chronology) gJChronology27);
        boolean boolean47 = localDateTime16.equals((java.lang.Object) durationFieldType21);
        int int48 = localDateTime16.getMillisOfDay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "centuries" + "'", str22, "centuries");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "centuries" + "'", str23, "centuries");
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 26167L + "'", long44 == 26167L);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 80743657 + "'", int48 == 80743657);
    }

    @Test
    public void test17517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17517");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        mutableDateTime3.setMillisOfDay((int) 'a');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime3.era();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = mutableDateTime21.toDateTimeISO();
        int int23 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime25.toDateTimeISO();
        org.joda.time.DateTime.Property property27 = dateTime26.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.withPeriodAdded(readablePeriod28, 0);
        int int31 = dateTime26.getSecondOfDay();
        mutableDateTime21.setDate((org.joda.time.ReadableInstant) dateTime26);
        mutableDateTime21.setMillisOfDay((int) 'a');
        boolean boolean35 = mutableDateTime3.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        mutableDateTime21.addWeeks(0);
        long long38 = mutableDateTime21.getMillis();
        int int39 = mutableDateTime21.getHourOfDay();
        mutableDateTime21.addMinutes(1140);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, readableInstant44, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone47 = gJChronology46.getZone();
        org.joda.time.DateTimeZone dateTimeZone48 = gJChronology46.getZone();
        org.joda.time.DurationField durationField49 = gJChronology46.centuries();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology46.dayOfWeek();
        long long54 = gJChronology46.add((-166150900L), (long) 26160, 4);
        org.joda.time.DateTimeField dateTimeField55 = gJChronology46.year();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology46.millisOfSecond();
        org.joda.time.Chronology chronology57 = gJChronology46.withUTC();
        org.joda.time.DateTimeZone dateTimeZone58 = chronology57.getZone();
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime21, chronology57);
        mutableDateTime59.addMinutes(842);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26743 + "'", int13 == 26743);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 26743 + "'", int31 == 26743);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1645488000097L + "'", long38 == 1645488000097L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(gJChronology46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-166046260L) + "'", long54 == (-166046260L));
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
    }

    @Test
    public void test17518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17518");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = gJChronology4.withZone(dateTimeZone6);
        org.joda.time.DurationField durationField8 = gJChronology4.minutes();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 2030, (org.joda.time.Chronology) gJChronology4);
        org.joda.time.DurationField durationField10 = gJChronology4.months();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology4.weekOfWeekyear();
        java.lang.String str12 = dateTimeField11.toString();
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateTimeField[weekOfWeekyear]" + "'", str12, "DateTimeField[weekOfWeekyear]");
    }

    @Test
    public void test17519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17519");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfDay(611);
        org.joda.time.DateTime dateTime6 = dateTime2.withMillisOfDay(26154);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime9 = dateTime6.plusMonths(329);
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test17520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17520");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        boolean boolean6 = localDateTime4.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plusDays((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = mutableDateTime15.toDateTimeISO();
        int int17 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        org.joda.time.DateTime.Property property21 = dateTime20.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime20.withPeriodAdded(readablePeriod22, 0);
        int int25 = dateTime20.getSecondOfDay();
        mutableDateTime15.setDate((org.joda.time.ReadableInstant) dateTime20);
        mutableDateTime15.setMillisOfDay((int) 'a');
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime15.era();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = mutableDateTime33.toDateTimeISO();
        int int35 = mutableDateTime31.compareTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = mutableDateTime37.toDateTimeISO();
        org.joda.time.DateTime.Property property39 = dateTime38.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.withPeriodAdded(readablePeriod40, 0);
        int int43 = dateTime38.getSecondOfDay();
        mutableDateTime33.setDate((org.joda.time.ReadableInstant) dateTime38);
        mutableDateTime33.setMillisOfDay((int) 'a');
        boolean boolean47 = mutableDateTime15.isAfter((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.DateTime dateTime48 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) mutableDateTime15);
        boolean boolean49 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.chrono.GJChronology gJChronology53 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone50, readableInstant51, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField54 = gJChronology53.millisOfDay();
        org.joda.time.DateTimeField dateTimeField55 = gJChronology53.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology53.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone57 = gJChronology53.getZone();
        java.lang.String str58 = dateTimeZone57.getID();
        long long61 = dateTimeZone57.convertLocalToUTC((long) 1, false);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.chrono.GJChronology gJChronology65 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone62, readableInstant63, (int) (short) 1);
        java.lang.String str66 = gJChronology65.toString();
        org.joda.time.DateTimeField dateTimeField67 = gJChronology65.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField68 = gJChronology65.monthOfYear();
        org.joda.time.Instant instant69 = gJChronology65.getGregorianCutover();
        int int70 = dateTimeZone57.getOffset((org.joda.time.ReadableInstant) instant69);
        long long72 = dateTimeZone57.nextTransition((long) (-1));
        boolean boolean73 = localDateTime9.equals((java.lang.Object) long72);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime9.withMillisOfDay(31);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime9.plusMonths(627);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime9.plusDays(26260);
        org.joda.time.LocalDateTime.Property property80 = localDateTime9.yearOfEra();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 26743 + "'", int25 == 26743);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 26743 + "'", int43 == 26743);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(gJChronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00:00.486" + "'", str58, "+00:00:00.486");
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-485L) + "'", long61 == (-485L));
        org.junit.Assert.assertNotNull(gJChronology65);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str66, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(instant69);
// flaky:         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 486 + "'", int70 == 486);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(property80);
    }

    @Test
    public void test17521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17521");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        int int5 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime16 = dateTime8.minusYears(2022);
        org.joda.time.DateTime dateTime17 = dateTime8.toDateTimeISO();
        int int18 = dateTime8.getYear();
        org.joda.time.DateTime dateTime20 = dateTime8.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime22 = dateTime20.minusSeconds(3602023);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26743 + "'", int13 == 26743);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test17522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17522");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology) gJChronology0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology) gJChronology0);
        org.joda.time.DurationField durationField4 = gJChronology0.days();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test17523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17523");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        java.lang.String str2 = durationFieldType1.getName();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        int int6 = dateTime5.getMillisOfSecond();
        org.joda.time.DateTime dateTime8 = dateTime5.plusMinutes((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, readableInstant11, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType9.getField((org.joda.time.Chronology) gJChronology13);
        boolean boolean19 = dateTime5.isSupported(dateTimeFieldType9);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, readableInstant22, (int) (short) 1);
        org.joda.time.DurationField durationField25 = durationFieldType20.getField((org.joda.time.Chronology) gJChronology24);
        boolean boolean26 = dateTimeFieldType9.isSupported((org.joda.time.Chronology) gJChronology24);
        org.joda.time.DurationField durationField27 = gJChronology24.minutes();
        boolean boolean28 = durationFieldType1.isSupported((org.joda.time.Chronology) gJChronology24);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology24.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, readableInstant31, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = gJChronology33.getZone();
        long long39 = gJChronology33.getDateTimeMillis(26151, 11, 15, (int) '#');
        org.joda.time.DateTimeField dateTimeField40 = gJChronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology33.minuteOfDay();
        org.joda.time.DurationField durationField42 = gJChronology33.halfdays();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology33.yearOfEra();
        boolean boolean44 = gJChronology24.equals((java.lang.Object) dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "years" + "'", str2, "years");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 825 + "'", int6 == 825);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 763106140799549L + "'", long39 == 763106140799549L);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test17524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17524");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        java.lang.String str8 = dateTimeZone7.getID();
        long long11 = dateTimeZone7.convertLocalToUTC((long) 1, false);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13, (int) (short) 1);
        java.lang.String str16 = gJChronology15.toString();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.monthOfYear();
        org.joda.time.Instant instant19 = gJChronology15.getGregorianCutover();
        int int20 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) instant19);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime23 = dateTime22.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime25 = dateTime22.withMillisOfSecond(643);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.486" + "'", str8, "+00:00:00.486");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-485L) + "'", long11 == (-485L));
        org.junit.Assert.assertNotNull(gJChronology15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str16, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(instant19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 486 + "'", int20 == 486);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test17525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17525");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology3.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.secondOfMinute();
        org.joda.time.DurationField durationField10 = gJChronology3.hours();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.centuryOfEra();
        boolean boolean13 = dateTimeField11.isLeap(825151190400000L);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        boolean boolean16 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = property17.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfEra(59);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMillisOfDay((int) '#');
        int int24 = dateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) localDateTime21);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2922730 + "'", int24 == 2922730);
    }

    @Test
    public void test17526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17526");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        long long8 = dateTimeField6.roundHalfCeiling(1641609929173L);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        boolean boolean11 = localDateTime9.isBefore((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusDays((int) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.era();
        boolean boolean22 = mutableDateTime17.isEqual((org.joda.time.ReadableInstant) mutableDateTime20);
        int int23 = property15.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = mutableDateTime26.toDateTimeISO();
        org.joda.time.DateTime.Property property28 = dateTime27.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.withPeriodAdded(readablePeriod29, 0);
        int int32 = dateTime27.getSecondOfDay();
        org.joda.time.DateTime.Property property33 = dateTime27.minuteOfHour();
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale34);
        java.lang.String str36 = property33.getAsText(locale34);
        java.lang.String str37 = locale34.getDisplayCountry();
        org.joda.time.LocalDateTime localDateTime38 = property15.setCopy("26", locale34);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.year();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.plusDays(26158);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusHours(36633);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusMinutes(22);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone47, readableInstant48, (int) (short) 1);
        java.lang.String str51 = gJChronology50.toString();
        org.joda.time.DateTimeField dateTimeField52 = gJChronology50.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField53 = gJChronology50.monthOfYear();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology50.yearOfEra();
        org.joda.time.DateTimeField dateTimeField55 = gJChronology50.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale58 = java.util.Locale.PRC;
        java.lang.String str59 = dateTimeZone56.getShortName((long) 2022, locale58);
        org.joda.time.LocalDateTime localDateTime60 = org.joda.time.LocalDateTime.now(dateTimeZone56);
        int[] intArray62 = gJChronology50.get((org.joda.time.ReadablePartial) localDateTime60, 7L);
        org.joda.time.DateTimeField dateTimeField63 = gJChronology50.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime();
        boolean boolean66 = localDateTime64.isBefore((org.joda.time.ReadablePartial) localDateTime65);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.weekyear();
        int int69 = localDateTime67.get(dateTimeFieldType68);
        boolean boolean70 = localDateTime65.isAfter((org.joda.time.ReadablePartial) localDateTime67);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime67.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime67.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.minusMonths(100);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.minusMinutes(20);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.minusMillis(10);
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime();
        boolean boolean83 = localDateTime81.isBefore((org.joda.time.ReadablePartial) localDateTime82);
        int int84 = localDateTime81.getCenturyOfEra();
        int int85 = localDateTime80.compareTo((org.joda.time.ReadablePartial) localDateTime81);
        org.joda.time.Chronology chronology86 = localDateTime81.getChronology();
        org.joda.time.LocalDateTime localDateTime88 = localDateTime81.minusWeeks((int) '4');
        int[] intArray90 = gJChronology50.get((org.joda.time.ReadablePartial) localDateTime81, (long) 26156);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray92 = dateTimeField6.addWrapField((org.joda.time.ReadablePartial) localDateTime45, 26437623, intArray90, 26508315);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26437623");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str4, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1640995199514L + "'", long8 == 1640995199514L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 26743 + "'", int32 == 26743);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "25" + "'", str36, "25");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Deutschland" + "'", str37, "Deutschland");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(gJChronology50);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str51, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00:00.486" + "'", str59, "+00:00:00.486");
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(intArray62);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1970, 1, 1, 493]");
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2022 + "'", int69 == 2022);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 20 + "'", int84 == 20);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(intArray90);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[1970, 1, 1, 26642]");
    }

    @Test
    public void test17527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17527");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology3.add(readablePeriod8, 1645514151595L, (int) (short) 0);
        org.joda.time.DurationField durationField12 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        boolean boolean16 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekyear();
        int int19 = localDateTime17.get(dateTimeFieldType18);
        boolean boolean20 = localDateTime15.isAfter((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.minusSeconds(0);
        int int25 = localDateTime17.getDayOfWeek();
        int int26 = localDateTime17.getHourOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = localDateTime17.getFieldTypes();
        org.joda.time.LocalDateTime.Property property28 = localDateTime17.dayOfMonth();
        int int29 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localDateTime17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = localDateTime17.toString("2022-02-21T07:24:42.285");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str4, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1645514151595L + "'", long11 == 1645514151595L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test17528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17528");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setVariant("Deutsch");
        java.util.Locale.Builder builder5 = builder1.addUnicodeLocaleAttribute("Deutsch");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("120");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.secondOfMinute();
        int int14 = dateTimeField13.getMaximumValue();
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale16);
        java.lang.String str18 = dateTimeField13.getAsShortText(20192L, locale16);
        java.util.Locale.Builder builder19 = builder5.setLocale(locale16);
        java.lang.String str20 = locale16.getDisplayName();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "20" + "'", str18, "20");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Deutsch (Deutschland)" + "'", str20, "Deutsch (Deutschland)");
    }

    @Test
    public void test17529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17529");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = localDateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withDayOfWeek(5);
        int int9 = localDateTime3.getYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime3.withHourOfDay((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withDurationAdded(readableDuration12, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMillis(26458666);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test17530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17530");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.withPeriodAdded(readablePeriod3, 26342945);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        java.lang.String str7 = mutableDateTime6.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-22T07:25:43.953Z" + "'", str7, "2022-02-22T07:25:43.953Z");
    }

    @Test
    public void test17531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17531");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withPeriodAdded(readablePeriod4, 0);
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.Chronology chronology8 = dateTime6.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime6.withMinuteOfHour(0);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.DateTime dateTime14 = dateTime10.withDurationAdded((long) 2000, 26148);
        org.joda.time.LocalDate localDate15 = dateTime10.toLocalDate();
        org.joda.time.DateTime dateTime17 = dateTime10.withYearOfEra(26196);
        int int18 = dateTime17.getDayOfYear();
        org.joda.time.DateTime dateTime21 = dateTime17.withDurationAdded(26186L, 653);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, readableInstant25, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField28 = gJChronology27.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.Chronology chronology30 = gJChronology27.withZone(dateTimeZone29);
        java.lang.String str31 = gJChronology27.toString();
        boolean boolean32 = dateTimeZone23.equals((java.lang.Object) str31);
        org.joda.time.DateTime dateTime33 = dateTime17.withZoneRetainFields(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(chronology30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str31, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test17532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17532");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.millisOfDay();
        org.joda.time.DateTime dateTime4 = property3.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((long) 2);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology10.getZone();
        org.joda.time.DurationField durationField13 = gJChronology10.weekyears();
        boolean boolean14 = dateTime6.equals((java.lang.Object) gJChronology10);
        org.joda.time.DateTime.Property property15 = dateTime6.dayOfYear();
        org.joda.time.DateTime.Property property16 = dateTime6.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = property16.setCopy("2022-02-21T12:24:54.727");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T12:24:54.727\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test17533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17533");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology4.getZone();
        long long10 = gJChronology4.getDateTimeMillis(26151, 11, 15, (int) '#');
        boolean boolean11 = durationFieldType0.isSupported((org.joda.time.Chronology) gJChronology4);
        org.joda.time.DurationField durationField12 = gJChronology4.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology4.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = gJChronology4.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology4.millisOfSecond();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 763106140799549L + "'", long10 == 763106140799549L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test17534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17534");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.millisOfDay();
        org.joda.time.DateTime dateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 26149);
        int int11 = dateTimeFormatter8.getDefaultYear();
        int int12 = dateTimeFormatter8.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter8.withDefaultYear(8);
        boolean boolean15 = dateTime4.equals((java.lang.Object) dateTimeFormatter8);
        java.util.Locale locale16 = dateTimeFormatter8.getLocale();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = mutableDateTime18.toDateTimeISO();
        org.joda.time.DateTime.Property property20 = dateTime19.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.withPeriodAdded(readablePeriod21, 0);
        org.joda.time.DateTime.Property property24 = dateTime23.hourOfDay();
        org.joda.time.Chronology chronology25 = dateTime23.getChronology();
        org.joda.time.DateTime dateTime27 = dateTime23.withMinuteOfHour(0);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = mutableDateTime30.toDateTimeISO();
        org.joda.time.DateTime.Property property32 = dateTime31.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.withPeriodAdded(readablePeriod33, 0);
        int int36 = dateTime31.getSecondOfDay();
        org.joda.time.DateTime.Property property37 = dateTime31.minuteOfHour();
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale38);
        java.lang.String str40 = property37.getAsText(locale38);
        java.lang.String str41 = locale38.getVariant();
        int int42 = property28.getMaximumTextLength(locale38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter8.withLocale(locale38);
        java.lang.String str44 = locale38.getISO3Language();
        java.util.Set<java.lang.String> strSet45 = locale38.getUnicodeLocaleKeys();
        boolean boolean46 = locale38.hasExtensions();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 26744 + "'", int36 == 26744);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "25" + "'", str40, "25");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "deu" + "'", str44, "deu");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test17535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17535");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 26257);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology6.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType2.getField((org.joda.time.Chronology) gJChronology6);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology6.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology6.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology6.secondOfMinute();
        org.joda.time.DurationField durationField18 = gJChronology6.minutes();
        org.joda.time.MutableDateTime mutableDateTime19 = instant1.toMutableDateTime((org.joda.time.Chronology) gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
    }

    @Test
    public void test17536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17536");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(100L, (org.joda.time.Chronology) gJChronology4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusSeconds(26147);
        int int11 = localDateTime8.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minusWeeks(968);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.minusMinutes(1970);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds(1439);
        int int18 = localDateTime17.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusDays(26163);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, readableInstant22, (int) (short) 1);
        java.lang.String str25 = gJChronology24.toString();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology24);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        boolean boolean29 = localDateTime27.isBefore((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekyear();
        int int32 = localDateTime30.get(dateTimeFieldType31);
        boolean boolean33 = localDateTime28.isAfter((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.withDayOfWeek(5);
        int int36 = localDateTime30.getYear();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime30.withHourOfDay((int) (byte) 1);
        org.joda.time.DateTime dateTime39 = dateTime26.withFields((org.joda.time.ReadablePartial) localDateTime38);
        int int40 = dateTime26.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType41.getRangeDurationType();
        boolean boolean43 = dateTime26.isSupported(dateTimeFieldType41);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime20.withField(dateTimeFieldType41, 386);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 70 + "'", int11 == 70);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(gJChronology24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str25, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNull(durationFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(localDateTime45);
    }

    @Test
    public void test17537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17537");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.millisOfDay();
        org.joda.time.DateTime dateTime4 = property3.roundHalfCeilingCopy();
        java.lang.String str5 = property3.getAsText();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 0);
        int int13 = dateTime8.getSecondOfDay();
        org.joda.time.DateTime.Property property14 = dateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime16 = dateTime8.minusSeconds(10);
        long long17 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        org.joda.time.DateTime.Property property21 = dateTime20.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime20.withPeriodAdded(readablePeriod22, 0);
        int int25 = dateTime20.getSecondOfDay();
        org.joda.time.DateTime.Property property26 = dateTime20.minuteOfHour();
        java.util.Locale locale27 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale27);
        java.lang.String str29 = property26.getAsText(locale27);
        java.lang.String str30 = locale27.getDisplayCountry();
        int int31 = property3.getMaximumShortTextLength(locale27);
        java.lang.String str32 = locale27.getDisplayLanguage();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "26744071" + "'", str5, "26744071");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26744 + "'", int13 == 26744);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 26744 + "'", int25 == 26744);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "25" + "'", str29, "25");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Deutschland" + "'", str30, "Deutschland");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Deutsch" + "'", str32, "Deutsch");
    }

    @Test
    public void test17538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.clockhourOfHalfday();
        java.lang.String str7 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField10 = dateTimeField9.getDurationField();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str7, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test17539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17539");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        java.lang.String str12 = gJChronology11.toString();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, (org.joda.time.Chronology) gJChronology11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str15 = dateTimeZone14.getID();
        boolean boolean16 = dateTimeZone14.isFixed();
        long long18 = dateTimeZone14.convertUTCToLocal((long) (byte) 0);
        long long20 = dateTimeZone14.convertUTCToLocal(20000L);
        long long24 = dateTimeZone14.convertLocalToUTC((long) 24, true, 1830550L);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = mutableDateTime26.toDateTimeISO();
        org.joda.time.DateTime.Property property28 = dateTime27.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime27.toMutableDateTime();
        mutableDateTime29.setHourOfDay(2);
        mutableDateTime29.addMonths(2922790);
        int int34 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str37 = dateTimeZone36.getID();
        boolean boolean38 = dateTimeZone36.isFixed();
        long long40 = dateTimeZone36.convertUTCToLocal((long) (byte) 0);
        int int42 = dateTimeZone36.getStandardOffset((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone36);
        java.util.TimeZone timeZone45 = java.util.TimeZone.getTimeZone("hi!");
        java.time.ZoneId zoneId46 = timeZone45.toZoneId();
        java.util.TimeZone timeZone47 = java.util.TimeZone.getTimeZone(zoneId46);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = localDateTime43.toDateTime(dateTimeZone48);
        long long53 = dateTimeZone14.getMillisKeepLocal(dateTimeZone48, 951236172466L);
        mutableDateTime13.setZone(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone14);
        org.joda.time.Instant instant56 = mutableDateTime55.toInstant();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(gJChronology11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str12, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 20000L + "'", long20 == 20000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 24L + "'", long24 == 24L);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(zoneId46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 951236172466L + "'", long53 == 951236172466L);
        org.junit.Assert.assertNotNull(instant56);
    }

    @Test
    public void test17540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17540");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = localDateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withDayOfWeek(5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology12.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology12.getZone();
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        org.joda.time.DateTime.Property property21 = dateTime20.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime20.withPeriodAdded(readablePeriod22, 0);
        int int25 = dateTime20.getSecondOfDay();
        org.joda.time.DateTime.Property property26 = dateTime20.minuteOfHour();
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime28 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = mutableDateTime32.toDateTimeISO();
        int int34 = mutableDateTime30.compareTo((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = mutableDateTime36.toDateTimeISO();
        org.joda.time.DateTime.Property property38 = dateTime37.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.withPeriodAdded(readablePeriod39, 0);
        int int42 = dateTime37.getSecondOfDay();
        mutableDateTime32.setDate((org.joda.time.ReadableInstant) dateTime37);
        mutableDateTime32.setMillisOfDay((int) 'a');
        mutableDateTime32.setWeekyear((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration48 = null;
        mutableDateTime32.add(readableDuration48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = mutableDateTime51.toDateTimeISO();
        int int53 = dateTime52.getYearOfEra();
        boolean boolean54 = mutableDateTime32.isBefore((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTime dateTime56 = dateTime52.plusSeconds(5);
        boolean boolean57 = dateTime52.isEqualNow();
        org.joda.time.DateTime dateTime59 = dateTime52.minusYears(26239);
        org.joda.time.DateTime dateTime60 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateTime59);
        boolean boolean62 = dateTime59.isAfter((long) 26313);
        org.joda.time.DateTime.Property property63 = dateTime59.dayOfMonth();
        org.joda.time.DateTime dateTime65 = dateTime59.minusHours(26392);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime67 = dateTime59.withMinuteOfHour(567);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 567 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.486" + "'", str17, "+00:00:00.486");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 26744 + "'", int25 == 26744);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 26744 + "'", int42 == 26744);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2022 + "'", int53 == 2022);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(dateTime65);
    }

    @Test
    public void test17541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17541");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        long long9 = gJChronology3.getDateTimeMillis(26151, 11, 15, (int) '#');
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.yearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gJChronology3);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.millisOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 763106140799549L + "'", long9 == 763106140799549L);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test17542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17542");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("2022-02-21T07:21:21.070", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-21t07:21:21.070");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17543");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.era();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.year();
        int int9 = gJChronology3.getMinimumDaysInFirstWeek();
        long long13 = gJChronology3.add(1645428052217L, 94788000000L, 59);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        boolean boolean16 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = property17.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfEra(59);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusYears(26158);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        boolean boolean27 = localDateTime25.isBefore((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.plusDays((int) (short) -1);
        java.lang.String str31 = localDateTime30.toString();
        org.joda.time.Chronology chronology32 = localDateTime30.getChronology();
        java.util.Date date33 = localDateTime30.toDate();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withPeriodAdded(readablePeriod34, (int) (byte) -1);
        java.lang.Object obj37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(obj37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property39.getFieldType();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.withField(dateTimeFieldType40, 523);
        java.lang.String str43 = dateTimeFieldType40.getName();
        boolean boolean44 = localDateTime21.isSupported(dateTimeFieldType40);
        int[] intArray46 = gJChronology3.get((org.joda.time.ReadablePartial) localDateTime21, 831025207124766L);
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str4, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 7237920052217L + "'", long13 == 7237920052217L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2022-02-21T07:25:44.703" + "'", str31, "2022-02-21T07:25:44.703");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Mon Feb 21 07:25:44 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "millisOfDay" + "'", str43, "millisOfDay");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray46);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[28304, 2, 22, 26325252]");
    }

    @Test
    public void test17544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17544");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology4.getZone();
        long long10 = gJChronology4.getDateTimeMillis(26151, 11, 15, (int) '#');
        boolean boolean11 = durationFieldType0.isSupported((org.joda.time.Chronology) gJChronology4);
        org.joda.time.DurationField durationField12 = gJChronology4.halfdays();
        org.joda.time.DurationField durationField13 = gJChronology4.hours();
        org.joda.time.Instant instant14 = gJChronology4.getGregorianCutover();
        org.joda.time.DurationField durationField15 = gJChronology4.months();
        long long18 = durationField15.getMillis((long) 2001, 1645514675047L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 763106140799549L + "'", long10 == 763106140799549L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5262105600000L + "'", long18 == 5262105600000L);
    }

    @Test
    public void test17545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17545");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("26194");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = mutableDateTime3.toDateTimeISO();
        org.joda.time.DateTime.Property property5 = dateTime4.millisOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime8 = property5.addToCopy((long) 2);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.withPeriodAdded(readablePeriod9, 295);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.secondOfMinute();
        org.joda.time.DurationField durationField18 = gJChronology15.weeks();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology15.era();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        boolean boolean22 = localDateTime20.isBefore((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withMonthOfYear(4);
        long long28 = gJChronology15.set((org.joda.time.ReadablePartial) localDateTime21, (long) '#');
        int int29 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime30 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime21);
        java.util.Date date31 = dateTime11.toDate();
        boolean boolean32 = timeZone1.inDaylightTime(date31);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1645514744254L + "'", long28 == 1645514744254L);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 44 + "'", int29 == 44);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Tue Feb 22 07:25:44 GMT 2022");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test17546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17546");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withPeriodAdded(readablePeriod4, 0);
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.Chronology chronology8 = dateTime6.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime6.withMinuteOfHour(0);
        org.joda.time.DateTime dateTime12 = dateTime6.plusMinutes(26182);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTimeISO();
        org.joda.time.DateTime.Property property14 = dateTime13.secondOfDay();
        org.joda.time.DateTime dateTime16 = dateTime13.minusSeconds(26283);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.millisOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology20.getZone();
        java.lang.String str25 = dateTimeZone24.getID();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone24);
        int int28 = dateTimeZone24.getOffsetFromLocal((long) 26203);
        java.lang.String str30 = dateTimeZone24.getNameKey((long) 525);
        boolean boolean31 = dateTime13.equals((java.lang.Object) dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, readableInstant33, (int) (short) 1);
        java.lang.String str36 = gJChronology35.toString();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology35.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology35.monthOfYear();
        org.joda.time.Instant instant39 = gJChronology35.getGregorianCutover();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = gJChronology35.add(readablePeriod40, 1645514151595L, (int) (short) 0);
        org.joda.time.Chronology chronology44 = gJChronology35.withUTC();
        long long48 = gJChronology35.add(763106140800035L, (-86399998L), (int) (byte) 10);
        org.joda.time.Chronology chronology49 = gJChronology35.withUTC();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gJChronology35);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone51, readableInstant52, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField55 = gJChronology54.millisOfDay();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology54.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology54.yearOfCentury();
        org.joda.time.DurationField durationField58 = gJChronology54.days();
        org.joda.time.DurationField durationField59 = gJChronology54.months();
        org.joda.time.DurationField durationField60 = gJChronology54.centuries();
        org.joda.time.DurationField durationField61 = gJChronology54.hours();
        org.joda.time.DurationFieldType durationFieldType62 = durationField61.getType();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime50.withFieldAdded(durationFieldType62, 26165);
        boolean boolean65 = dateTimeZone24.isLocalDateTimeGap(localDateTime64);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime67 = localDateTime64.withYearOfCentury(26642);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26642 for yearOfCentury must be in the range [1,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.486" + "'", str25, "+00:00:00.486");
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 486 + "'", int28 == 486);
// flaky:         org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(gJChronology35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str36, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1645514151595L + "'", long43 == 1645514151595L);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 763105276800055L + "'", long48 == 763105276800055L);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(gJChronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test17547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField6 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.halfdayOfDay();
        org.joda.time.DurationField durationField9 = gJChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = gJChronology3.seconds();
        org.joda.time.DurationField durationField13 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.secondOfDay();
        int int17 = dateTimeField15.getMaximumValue(1645514452217L);
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str4, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 86399 + "'", int17 == 86399);
    }

    @Test
    public void test17548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17548");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfDay(611);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays(525);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DurationField durationField12 = durationFieldType7.getField((org.joda.time.Chronology) gJChronology11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.dayOfYear();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime2, (org.joda.time.Chronology) gJChronology11);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime16 = property15.getLocalDateTime();
        org.joda.time.Interval interval17 = property15.toInterval();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        int int21 = dateTime20.getMillisOfSecond();
        org.joda.time.DateTime dateTime23 = dateTime20.plusMinutes((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology28.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone32 = gJChronology28.getZone();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType24.getField((org.joda.time.Chronology) gJChronology28);
        boolean boolean34 = dateTime20.isSupported(dateTimeFieldType24);
        org.joda.time.DateTime.Property property35 = dateTime20.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime20);
        int int37 = property15.getDifference((org.joda.time.ReadableInstant) mutableDateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 330 + "'", int21 == 330);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test17549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17549");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 26149);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, readableInstant7, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = mutableDateTime16.toDateTimeISO();
        org.joda.time.DateTime.Property property18 = dateTime17.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.withPeriodAdded(readablePeriod19, 0);
        int int22 = dateTime17.getSecondOfDay();
        org.joda.time.DateTime.Property property23 = dateTime17.minuteOfHour();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, (org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26, (int) (short) 1);
        java.lang.String str29 = gJChronology28.toString();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology28.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology28.era();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology28.minuteOfDay();
        org.joda.time.DurationField durationField33 = gJChronology28.seconds();
        boolean boolean34 = dateTimeZone13.equals((java.lang.Object) gJChronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter3.withChronology((org.joda.time.Chronology) gJChronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter35.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter35.withZoneUTC();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.486" + "'", str14, "+00:00:00.486");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 26744 + "'", int22 == 26744);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(gJChronology28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str29, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
    }

    @Test
    public void test17550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17550");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfDay(611);
        org.joda.time.DateTime dateTime5 = dateTime4.toDateTimeISO();
        org.joda.time.DateTime dateTime7 = dateTime4.plusMillis(26551009);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test17551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17551");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology3.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.era();
        org.joda.time.DurationField durationField9 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology3.getZone();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test17552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17552");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology3.getZone();
        org.joda.time.DurationField durationField6 = gJChronology3.centuries();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test17553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17553");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology8.getZone();
        java.lang.String str12 = dateTimeZone10.getName((long) 26155);
        org.joda.time.Chronology chronology13 = gJChronology4.withZone(dateTimeZone10);
        mutableDateTime3.setZone(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.era();
        org.joda.time.DateTimeField dateTimeField17 = mutableDateTime15.getRoundingField();
        java.lang.String str18 = mutableDateTime15.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.486" + "'", str12, "+00:00:00.486");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNull(dateTimeField17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2022-02-22T07:25:44.882+00:00:00.486" + "'", str18, "2022-02-22T07:25:44.882+00:00:00.486");
    }

    @Test
    public void test17554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17554");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTime dateTime7 = dateTime5.withMillisOfDay(0);
        org.joda.time.DateTime dateTime9 = dateTime7.withYear((int) '#');
        org.joda.time.DateTime dateTime11 = dateTime9.withMonthOfYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14, (int) (short) 1);
        java.lang.String str17 = gJChronology16.toString();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, (org.joda.time.Chronology) gJChronology16);
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology16.getZone();
        org.joda.time.DateTime dateTime20 = dateTime9.toDateTime((org.joda.time.Chronology) gJChronology16);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.secondOfDay();
        org.joda.time.DurationField durationField22 = gJChronology16.years();
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str4, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(gJChronology16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str17, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test17555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17555");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology3.getZone();
        org.joda.time.DurationField durationField6 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField8 = gJChronology3.weekyears();
        org.joda.time.DurationField durationField9 = gJChronology3.days();
        org.joda.time.DurationField durationField10 = gJChronology3.days();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = mutableDateTime14.toDateTimeISO();
        int int16 = mutableDateTime12.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = mutableDateTime18.toDateTimeISO();
        org.joda.time.DateTime.Property property20 = dateTime19.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.withPeriodAdded(readablePeriod21, 0);
        int int24 = dateTime19.getSecondOfDay();
        mutableDateTime14.setDate((org.joda.time.ReadableInstant) dateTime19);
        mutableDateTime14.setMillisOfDay((int) 'a');
        mutableDateTime14.addMillis(4);
        java.lang.String str30 = mutableDateTime14.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = mutableDateTime34.toDateTimeISO();
        int int36 = mutableDateTime32.compareTo((org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = mutableDateTime38.toDateTimeISO();
        org.joda.time.DateTime.Property property40 = dateTime39.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.DateTime dateTime43 = dateTime39.withPeriodAdded(readablePeriod41, 0);
        int int44 = dateTime39.getSecondOfDay();
        mutableDateTime34.setDate((org.joda.time.ReadableInstant) dateTime39);
        mutableDateTime34.setMillisOfDay((int) 'a');
        mutableDateTime34.setWeekyear((int) (short) 0);
        boolean boolean50 = mutableDateTime14.isEqual((org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime14.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime14.copy();
        mutableDateTime52.setWeekyear((-1));
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime52.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str57 = dateTimeZone56.getID();
        boolean boolean58 = dateTimeZone56.isFixed();
        long long60 = dateTimeZone56.convertUTCToLocal((long) (byte) 0);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(dateTimeZone56);
        java.lang.String str63 = dateTimeZone56.getShortName(874L);
        mutableDateTime52.setZone(dateTimeZone56);
        mutableDateTime52.addWeekyears(26287);
        boolean boolean67 = gJChronology3.equals((java.lang.Object) 26287);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26744 + "'", int24 == 26744);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2022-02-22T00:00:00.101Z" + "'", str30, "2022-02-22T00:00:00.101Z");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 26744 + "'", int44 == 26744);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "UTC" + "'", str57, "UTC");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+00:00" + "'", str63, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test17556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17556");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime();
        mutableDateTime4.setHourOfDay(2);
        mutableDateTime4.setYear(26148);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = property9.set(26250);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26250 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test17557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17557");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3, (int) (short) 1);
        java.lang.String str6 = gJChronology5.toString();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 1, (org.joda.time.Chronology) gJChronology5);
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology5.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((-1200000L), dateTimeZone8);
        int int10 = mutableDateTime9.getDayOfYear();
        org.junit.Assert.assertNotNull(gJChronology5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str6, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
    }

    @Test
    public void test17558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17558");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("26158015");
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
        mutableDateTime1.setTime((long) 26180);
        java.lang.String str5 = mutableDateTime1.toString();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.dayOfWeek();
        boolean boolean7 = mutableDateTime1.isBeforeNow();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "26158015-01-01T00:00:26.180+00:00:00.486" + "'", str5, "26158015-01-01T00:00:26.180+00:00:00.486");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test17559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17559");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) gJChronology4);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology4.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology4.clockhourOfDay();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now((org.joda.time.Chronology) gJChronology4);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfYear((int) ' ');
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        org.joda.time.DateTime dateTime18 = property16.addWrapFieldToCopy(26554);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test17560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17560");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, readableInstant7, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology9.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withZone(dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear(18002547);
        java.util.Locale locale14 = dateTimeFormatter13.getLocale();
        java.io.Writer writer15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        boolean boolean21 = mutableDateTime17.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str23 = dateTimeZone22.getID();
        boolean boolean24 = dateTimeZone22.isFixed();
        mutableDateTime19.setZone(dateTimeZone22);
        int int26 = mutableDateTime19.getHourOfDay();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime19.secondOfMinute();
        mutableDateTime19.setDate(3600001L);
        mutableDateTime19.setMinuteOfDay(113);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33, readableInstant34, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.millisOfDay();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology36.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology36.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(100L, (org.joda.time.Chronology) gJChronology36);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks(292278993);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.minusMinutes(20);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.minusMillis(26184);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.chrono.GJChronology gJChronology52 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone49, readableInstant50, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone53 = gJChronology52.getZone();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology52.yearOfEra();
        org.joda.time.DurationField durationField55 = gJChronology52.halfdays();
        org.joda.time.DurationField durationField56 = gJChronology52.centuries();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology52.dayOfMonth();
        boolean boolean58 = dateTimeFieldType48.isSupported((org.joda.time.Chronology) gJChronology52);
        org.joda.time.DurationFieldType durationFieldType59 = dateTimeFieldType48.getDurationType();
        boolean boolean60 = localDateTime44.isSupported(dateTimeFieldType48);
        org.joda.time.DateTime dateTime61 = localDateTime44.toDateTime();
        boolean boolean62 = mutableDateTime19.isEqual((org.joda.time.ReadableInstant) dateTime61);
        java.lang.String str63 = mutableDateTime19.toString();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(writer15, (org.joda.time.ReadableInstant) mutableDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(gJChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(gJChronology52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1970-01-01T01:53:44.511Z" + "'", str63, "1970-01-01T01:53:44.511Z");
    }

    @Test
    public void test17561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology3.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField9 = gJChronology3.hours();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology) gJChronology3);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.era();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundFloor();
        java.lang.String str15 = property13.toString();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[era]" + "'", str15, "Property[era]");
    }

    @Test
    public void test17562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17562");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.secondOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test17563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17563");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = localDateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusSeconds((int) '#');
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minusMinutes(26163);
        java.util.Date date17 = localDateTime16.toDate();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.fromDateFields(date17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusMinutes(26615352);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 04 03:22:45 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test17564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17564");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.yearOfCentury();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.secondOfDay();
        org.joda.time.DurationField durationField9 = gJChronology3.seconds();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTime dateTime11 = dateTime10.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test17565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17565");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        java.lang.String str8 = dateTimeZone7.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = mutableDateTime10.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime11.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.withPeriodAdded(readablePeriod13, 0);
        int int16 = dateTime11.getSecondOfDay();
        org.joda.time.DateTime.Property property17 = dateTime11.minuteOfHour();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20, (int) (short) 1);
        java.lang.String str23 = gJChronology22.toString();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology22.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology22.era();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology22.minuteOfDay();
        org.joda.time.DurationField durationField27 = gJChronology22.seconds();
        boolean boolean28 = dateTimeZone7.equals((java.lang.Object) gJChronology22);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology22.era();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology31 = gJChronology22.withZone(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale35 = java.util.Locale.PRC;
        java.lang.String str36 = dateTimeZone33.getShortName((long) 2022, locale35);
        java.lang.String str37 = locale35.getScript();
        java.lang.String str38 = dateTimeZone30.getShortName(0L, locale35);
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30);
        org.joda.time.DurationField durationField40 = gJChronology39.centuries();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology39.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology39.hourOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.486" + "'", str8, "+00:00:00.486");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26744 + "'", int16 == 26744);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(gJChronology22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str23, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.486" + "'", str36, "+00:00:00.486");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertNotNull(gJChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
    }

    @Test
    public void test17566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17566");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        java.lang.String str8 = dateTimeZone7.getID();
        long long11 = dateTimeZone7.convertLocalToUTC((long) 1, false);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13, (int) (short) 1);
        java.lang.String str16 = gJChronology15.toString();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.monthOfYear();
        org.joda.time.Instant instant19 = gJChronology15.getGregorianCutover();
        int int20 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) instant19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, readableInstant22, (int) (short) 1);
        java.lang.String str25 = gJChronology24.toString();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology24.hourOfHalfday();
        org.joda.time.DurationField durationField27 = gJChronology24.centuries();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology24.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = instant19.toMutableDateTime((org.joda.time.Chronology) gJChronology24);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime29.add(readablePeriod30, (int) (byte) 0);
        mutableDateTime29.addDays(26184);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime29.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36, readableInstant37, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField40 = gJChronology39.millisOfDay();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology39.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology39.minuteOfHour();
        org.joda.time.DurationField durationField43 = gJChronology39.years();
        int int44 = gJChronology39.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology39.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology39.era();
        org.joda.time.DateTime dateTime47 = mutableDateTime29.toDateTime((org.joda.time.Chronology) gJChronology39);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime29.secondOfMinute();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.486" + "'", str8, "+00:00:00.486");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-485L) + "'", long11 == (-485L));
        org.junit.Assert.assertNotNull(gJChronology15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str16, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(instant19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 486 + "'", int20 == 486);
        org.junit.Assert.assertNotNull(gJChronology24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str25, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(gJChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
    }

    @Test
    public void test17567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17567");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMonths((int) (byte) 100);
        org.joda.time.DateTime.Property property11 = dateTime10.year();
        org.joda.time.DateTime dateTime13 = dateTime10.plusMonths(292278993);
        org.joda.time.DateTime dateTime15 = dateTime10.minusMillis(26285);
        org.joda.time.DateTime dateTime17 = dateTime15.minusSeconds(22);
        int int18 = dateTime17.getMinuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = dateTime17.toLocalDateTime();
        org.joda.time.DateTime dateTime21 = dateTime17.plusSeconds(26432);
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str4, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 444 + "'", int18 == 444);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test17568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17568");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.era();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfCeiling();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology16.getZone();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology16.getZone();
        java.lang.String str20 = dateTimeZone18.getName((long) 26155);
        org.joda.time.Chronology chronology21 = gJChronology12.withZone(dateTimeZone18);
        mutableDateTime11.setZone(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfCentury();
        mutableDateTime23.set(dateTimeFieldType24, 47);
        boolean boolean27 = localDateTime7.isSupported(dateTimeFieldType24);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, readableInstant30, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.millisOfDay();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(100L, (org.joda.time.Chronology) gJChronology32);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusSeconds(26147);
        int int39 = localDateTime36.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property40 = localDateTime36.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        org.joda.time.LocalDateTime localDateTime42 = property40.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime43 = property40.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime44 = property40.roundCeilingCopy();
        boolean boolean45 = localDateTime7.isAfter((org.joda.time.ReadablePartial) localDateTime44);
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str4, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.486" + "'", str20, "+00:00:00.486");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test17569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17569");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        boolean boolean6 = dateTimeZone4.isStandardOffset(10L);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone4);
        java.util.TimeZone timeZone8 = dateTimeZone4.toTimeZone();
        boolean boolean10 = dateTimeZone4.isStandardOffset((long) 26351);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime15 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime17 = property14.addToCopy((long) 2);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = gJChronology21.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology21.getZone();
        org.joda.time.DurationField durationField24 = gJChronology21.weekyears();
        boolean boolean25 = dateTime17.equals((java.lang.Object) gJChronology21);
        boolean boolean26 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime28 = dateTime17.withYearOfEra(70);
        org.joda.time.DateTime dateTime30 = dateTime17.withYearOfEra(26194);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = mutableDateTime32.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime33.getZone();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = dateTime17.toDateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime36.toDateTimeISO();
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(gJChronology38);
    }

    @Test
    public void test17570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17570");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology3.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField9 = gJChronology3.hours();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.yearOfCentury();
        org.joda.time.DurationField durationField13 = gJChronology3.millis();
        long long16 = durationField13.add(912L, 20914560000L);
        long long19 = durationField13.getValueAsLong((long) 635, 1641610007324L);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 20914560912L + "'", long16 == 20914560912L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 635L + "'", long19 == 635L);
    }

    @Test
    public void test17571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17571");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("eras", strMap1);
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale3);
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        boolean boolean6 = strSet5.isEmpty();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        boolean boolean9 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyear();
        int int12 = localDateTime10.get(dateTimeFieldType11);
        boolean boolean13 = localDateTime8.isAfter((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.minusSeconds(0);
        int int18 = localDateTime10.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property19 = localDateTime10.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime10.plusHours(15);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withYearOfEra(10);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withDurationAdded(readableDuration24, 144);
        boolean boolean27 = strSet5.contains((java.lang.Object) localDateTime23);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet5);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, strMap32);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.parse("year");
        java.util.Locale locale36 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale36);
        java.util.Set<java.lang.String> strSet38 = locale36.getUnicodeLocaleAttributes();
        boolean boolean39 = strSet38.isEmpty();
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags(languageRangeList35, (java.util.Collection<java.lang.String>) strSet38, filteringMode40);
        java.util.Locale.FilteringMode filteringMode42 = null;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList41, filteringMode42);
        java.lang.String[] strArray58 = new java.lang.String[] { "de-DE", "+00:00", "Deutsch", "0", "15", "2022-02-21T07:15:50.993", "Heure de Greenwich", "7", "DateTimeField[hourOfHalfday]", "2022-02-22T00:00:00.101Z", "", "DateTimeField[hourOfHalfday]", "+00:00", "DateTimeField[hourOfHalfday]" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        int int61 = strSet59.size();
        strSet59.clear();
        java.util.Locale locale63 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale63);
        java.util.Set<java.lang.String> strSet65 = locale63.getUnicodeLocaleAttributes();
        boolean boolean66 = strSet59.addAll((java.util.Collection<java.lang.String>) strSet65);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.parse("year");
        java.util.Locale locale69 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale69);
        java.util.Set<java.lang.String> strSet71 = locale69.getUnicodeLocaleAttributes();
        boolean boolean72 = strSet71.isEmpty();
        java.util.Locale.FilteringMode filteringMode73 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags(languageRangeList68, (java.util.Collection<java.lang.String>) strSet71, filteringMode73);
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strSet59, filteringMode73);
        boolean boolean77 = strSet59.add("UTC");
        strSet59.clear();
        java.util.Locale locale81 = new java.util.Locale("26", "halfdays");
        java.util.Set<java.lang.String> strSet82 = locale81.getUnicodeLocaleKeys();
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime84 = org.joda.time.MutableDateTime.now(dateTimeZone83);
        org.joda.time.DateTime dateTime85 = mutableDateTime84.toDateTimeISO();
        org.joda.time.DateTime.Property property86 = dateTime85.centuryOfEra();
        org.joda.time.DurationField durationField87 = property86.getLeapDurationField();
        org.joda.time.DateTime dateTime88 = property86.roundCeilingCopy();
        org.joda.time.DateTime dateTime90 = property86.setCopy(26168);
        boolean boolean91 = strSet82.contains((java.lang.Object) property86);
        int int92 = strSet82.size();
        boolean boolean93 = strSet59.retainAll((java.util.Collection<java.lang.String>) strSet82);
        boolean boolean94 = strSet5.addAll((java.util.Collection<java.lang.String>) strSet82);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode40.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 11 + "'", int61 == 11);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + filteringMode73 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode73.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals(locale81.toString(), "26_HALFDAYS");
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertNotNull(dateTimeZone83);
        org.junit.Assert.assertNotNull(mutableDateTime84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNull(durationField87);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test17572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17572");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(26163);
        org.joda.time.DateTime dateTime9 = dateTime5.plusMillis(26170);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMillis(26195);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.minus(readablePeriod12);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone("hi!");
        java.time.ZoneId zoneId16 = timeZone15.toZoneId();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone(zoneId16);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone(zoneId16);
        java.util.TimeZone.setDefault(timeZone18);
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        java.lang.String str21 = timeZone20.getID();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        boolean boolean23 = timeZone18.hasSameRules(timeZone20);
        boolean boolean24 = timeZone18.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime9.toMutableDateTime(dateTimeZone25);
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str4, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GMT" + "'", str21, "GMT");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
    }

    @Test
    public void test17573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17573");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        int int3 = dateTime2.getMillisOfSecond();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMinutes((int) (short) 0);
        org.joda.time.DateTime.Property property6 = dateTime2.millisOfDay();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.secondOfDay();
        int int9 = dateTime7.getYear();
        org.joda.time.DateTime.Property property10 = dateTime7.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 759 + "'", int3 == 759);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test17574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17574");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = gJChronology5.halfdays();
        org.joda.time.DurationField durationField9 = gJChronology5.centuries();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology5.dayOfMonth();
        boolean boolean11 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gJChronology5);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology5.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        boolean boolean15 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.weekyear();
        int int18 = localDateTime16.get(dateTimeFieldType17);
        boolean boolean19 = localDateTime14.isAfter((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusMonths(100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusSeconds((int) '#');
        int int28 = localDateTime27.getMonthOfYear();
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        java.lang.String str31 = dateTimeField12.getAsShortText((org.joda.time.ReadablePartial) localDateTime27, locale29);
        java.util.Locale.setDefault(category0, locale29);
        java.util.Locale locale33 = java.util.Locale.getDefault(category0);
        java.util.Locale locale34 = java.util.Locale.getDefault(category0);
        java.util.Locale locale35 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "20" + "'", str31, "20");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
    }

    @Test
    public void test17575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17575");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfDay(611);
        org.joda.time.DateTime dateTime6 = dateTime2.withMillisOfDay(26154);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime9 = dateTime6.plusMonths(329);
        org.joda.time.DateTime dateTime11 = dateTime6.minusMonths(795);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test17576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17576");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Deutsch", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        java.lang.String str11 = gJChronology10.toString();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology10);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillisOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime12.getZone();
        org.joda.time.DateTime dateTime17 = dateTime12.withSecondOfMinute((int) '#');
        org.joda.time.DateTime.Property property18 = dateTime12.centuryOfEra();
        org.joda.time.DateTime dateTime19 = property18.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime20 = property18.roundCeilingCopy();
        org.joda.time.DateTime dateTime21 = property18.roundHalfFloorCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = null;
        org.joda.time.format.DateTimeParser dateTimeParser24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter23, dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter25.withOffsetParsed();
        java.util.Locale locale27 = dateTimeFormatter26.getLocale();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, readableInstant30, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.millisOfDay();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(100L, (org.joda.time.Chronology) gJChronology32);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, readableInstant38, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField41 = gJChronology40.millisOfDay();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology40.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology40.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone44 = gJChronology40.getZone();
        org.joda.time.Chronology chronology45 = gJChronology32.withZone(dateTimeZone44);
        long long49 = dateTimeZone44.convertLocalToUTC(4518960813L, true, 0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter26.withZone(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((-1199900L), dateTimeZone44);
        java.util.Locale.Category category53 = java.util.Locale.Category.FORMAT;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale56 = java.util.Locale.PRC;
        java.lang.String str57 = dateTimeZone54.getShortName((long) 2022, locale56);
        java.lang.String str58 = locale56.getScript();
        java.util.Locale.setDefault(category53, locale56);
        java.lang.String str60 = dateTimeZone44.getShortName((-8L), locale56);
        int int61 = property18.getMaximumTextLength(locale56);
        java.util.Locale locale62 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet63 = locale62.getUnicodeLocaleAttributes();
        boolean boolean65 = strSet63.remove((java.lang.Object) 2922790L);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime();
        boolean boolean68 = localDateTime66.isBefore((org.joda.time.ReadablePartial) localDateTime67);
        org.joda.time.LocalDateTime.Property property69 = localDateTime66.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime66.plusDays((int) (short) -1);
        org.joda.time.LocalDateTime.Property property72 = localDateTime66.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime74 = org.joda.time.MutableDateTime.now(dateTimeZone73);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime74.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime77 = org.joda.time.MutableDateTime.now(dateTimeZone76);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime77.era();
        boolean boolean79 = mutableDateTime74.isEqual((org.joda.time.ReadableInstant) mutableDateTime77);
        int int80 = property72.getDifference((org.joda.time.ReadableInstant) mutableDateTime74);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime83 = org.joda.time.MutableDateTime.now(dateTimeZone82);
        org.joda.time.DateTime dateTime84 = mutableDateTime83.toDateTimeISO();
        org.joda.time.DateTime.Property property85 = dateTime84.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod86 = null;
        org.joda.time.DateTime dateTime88 = dateTime84.withPeriodAdded(readablePeriod86, 0);
        int int89 = dateTime84.getSecondOfDay();
        org.joda.time.DateTime.Property property90 = dateTime84.minuteOfHour();
        java.util.Locale locale91 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale91);
        java.lang.String str93 = property90.getAsText(locale91);
        java.lang.String str94 = locale91.getDisplayCountry();
        org.joda.time.LocalDateTime localDateTime95 = property72.setCopy("26", locale91);
        boolean boolean96 = strSet63.remove((java.lang.Object) locale91);
        strSet63.clear();
        boolean boolean98 = property18.equals((java.lang.Object) strSet63);
        java.util.List<java.lang.String> strList99 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet63);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(gJChronology10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str11, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(gJChronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(chronology45);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 4518960327L + "'", long49 == 4518960327L);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertTrue("'" + category53 + "' != '" + java.util.Locale.Category.FORMAT + "'", category53.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00:00.486" + "'", str57, "+00:00:00.486");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00:00.486" + "'", str60, "+00:00:00.486");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 7 + "'", int61 == 7);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(dateTimeZone76);
        org.junit.Assert.assertNotNull(mutableDateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone82);
        org.junit.Assert.assertNotNull(mutableDateTime83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(dateTime88);
// flaky:         org.junit.Assert.assertTrue("'" + int89 + "' != '" + 26744 + "'", int89 == 26744);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str93 + "' != '" + "25" + "'", str93, "25");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Deutschland" + "'", str94, "Deutschland");
        org.junit.Assert.assertNotNull(localDateTime95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(strList99);
    }

    @Test
    public void test17577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17577");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(100L, (org.joda.time.Chronology) gJChronology4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(292278993);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays(8);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 0);
        int int16 = localDateTime15.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType18 = localDateTime15.getFieldType(26488336);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26488336");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test17578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17578");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(100L, (org.joda.time.Chronology) gJChronology4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusSeconds(26147);
        int int11 = localDateTime8.getYearOfCentury();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localDateTime8.getFieldTypes();
        java.lang.String str13 = localDateTime8.toString();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.plusMonths(391);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 70 + "'", int11 == 70);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.586" + "'", str13, "1970-01-01T00:00:00.586");
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test17579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17579");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTime dateTime7 = dateTime5.withMillisOfDay(0);
        org.joda.time.DateTime dateTime9 = dateTime7.withYear((int) '#');
        org.joda.time.DateTime dateTime11 = dateTime9.withMonthOfYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.add(1L);
        boolean boolean17 = dateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime11.minus(readablePeriod18);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        org.joda.time.DateTime dateTime23 = property20.addToCopy((long) 26555);
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str4, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test17580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17580");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        boolean boolean9 = instant7.isBefore((long) ' ');
        org.joda.time.Instant instant11 = instant7.withMillis((long) 26186);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.plus(readableDuration12);
        org.joda.time.MutableDateTime mutableDateTime14 = instant13.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime15 = instant13.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, readableInstant17, (int) (short) 1);
        java.lang.String str20 = gJChronology19.toString();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.monthOfYear();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology19.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        boolean boolean26 = localDateTime24.isBefore((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.plusDays((int) (short) -1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.era();
        boolean boolean37 = mutableDateTime32.isEqual((org.joda.time.ReadableInstant) mutableDateTime35);
        int int38 = property30.getDifference((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = mutableDateTime41.toDateTimeISO();
        org.joda.time.DateTime.Property property43 = dateTime42.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime42.withPeriodAdded(readablePeriod44, 0);
        int int47 = dateTime42.getSecondOfDay();
        org.joda.time.DateTime.Property property48 = dateTime42.minuteOfHour();
        java.util.Locale locale49 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale49);
        java.lang.String str51 = property48.getAsText(locale49);
        java.lang.String str52 = locale49.getDisplayCountry();
        org.joda.time.LocalDateTime localDateTime53 = property30.setCopy("26", locale49);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.year();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.plusDays(26158);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.minusMinutes(26195);
        long long60 = gJChronology19.set((org.joda.time.ReadablePartial) localDateTime58, 3907552601159L);
        org.joda.time.DateTimeZone dateTimeZone61 = gJChronology19.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone61);
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now(dateTimeZone61);
        int int64 = localDateTime63.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime66 = org.joda.time.MutableDateTime.now(dateTimeZone65);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime68 = org.joda.time.MutableDateTime.now(dateTimeZone67);
        org.joda.time.DateTime dateTime69 = mutableDateTime68.toDateTimeISO();
        int int70 = mutableDateTime66.compareTo((org.joda.time.ReadableInstant) mutableDateTime68);
        mutableDateTime68.setSecondOfDay(59);
        mutableDateTime68.addMonths(26149);
        int int75 = mutableDateTime68.getMinuteOfHour();
        int int76 = mutableDateTime68.getRoundingMode();
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.chrono.GJChronology gJChronology80 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone77, readableInstant78, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone81 = gJChronology80.getZone();
        org.joda.time.DateTimeZone dateTimeZone82 = gJChronology80.getZone();
        org.joda.time.DateTimeField dateTimeField83 = gJChronology80.hourOfDay();
        mutableDateTime68.setChronology((org.joda.time.Chronology) gJChronology80);
        org.joda.time.DurationField durationField85 = gJChronology80.weekyears();
        org.joda.time.DateTimeField dateTimeField86 = gJChronology80.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = dateTimeField86.getType();
        org.joda.time.DurationFieldType durationFieldType88 = dateTimeFieldType87.getDurationType();
        int int89 = localDateTime63.indexOf(dateTimeFieldType87);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime15.set(dateTimeFieldType87, 444);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 444 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str4, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(gJChronology19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str20, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 26744 + "'", int47 == 26744);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "25" + "'", str51, "25");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Deutschland" + "'", str52, "Deutschland");
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1641610244898L + "'", long60 == 1641610244898L);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 20 + "'", int64 == 20);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(mutableDateTime66);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(gJChronology80);
        org.junit.Assert.assertNotNull(dateTimeZone81);
        org.junit.Assert.assertNotNull(dateTimeZone82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertNotNull(durationField85);
        org.junit.Assert.assertNotNull(dateTimeField86);
        org.junit.Assert.assertNotNull(dateTimeFieldType87);
        org.junit.Assert.assertNotNull(durationFieldType88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test17581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17581");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(100L, (org.joda.time.Chronology) gJChronology4);
        org.joda.time.DurationField durationField9 = gJChronology4.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology4.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology4.era();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology4.hourOfDay();
        org.joda.time.DurationField durationField13 = gJChronology4.millis();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology4.yearOfCentury();
        org.joda.time.Instant instant15 = gJChronology4.getGregorianCutover();
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(instant15);
    }

    @Test
    public void test17582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17582");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DurationField durationField6 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.era();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        boolean boolean10 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withMonthOfYear(4);
        long long16 = gJChronology3.set((org.joda.time.ReadablePartial) localDateTime9, (long) '#');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.withWeekyear(17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime9.minusMinutes(26191);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1645514744934L + "'", long16 == 1645514744934L);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test17583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17583");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology4.getZone();
        long long10 = gJChronology4.getDateTimeMillis(26151, 11, 15, (int) '#');
        boolean boolean11 = durationFieldType0.isSupported((org.joda.time.Chronology) gJChronology4);
        org.joda.time.DurationField durationField12 = gJChronology4.halfdays();
        org.joda.time.DurationField durationField13 = gJChronology4.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology4.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology4.millisOfSecond();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 763106140799549L + "'", long10 == 763106140799549L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test17584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17584");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.roundFloor();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime4.getZone();
        mutableDateTime4.setYear(192);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        boolean boolean12 = strSet10.remove((java.lang.Object) 2922790L);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        boolean boolean15 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plusDays((int) (short) -1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.era();
        boolean boolean26 = mutableDateTime21.isEqual((org.joda.time.ReadableInstant) mutableDateTime24);
        int int27 = property19.getDifference((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = mutableDateTime30.toDateTimeISO();
        org.joda.time.DateTime.Property property32 = dateTime31.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.withPeriodAdded(readablePeriod33, 0);
        int int36 = dateTime31.getSecondOfDay();
        org.joda.time.DateTime.Property property37 = dateTime31.minuteOfHour();
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale38);
        java.lang.String str40 = property37.getAsText(locale38);
        java.lang.String str41 = locale38.getDisplayCountry();
        org.joda.time.LocalDateTime localDateTime42 = property19.setCopy("26", locale38);
        boolean boolean43 = strSet10.remove((java.lang.Object) locale38);
        boolean boolean44 = mutableDateTime4.equals((java.lang.Object) strSet10);
        mutableDateTime4.addSeconds((int) '4');
        int int47 = mutableDateTime4.getYearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType49 = dateTimeFieldType48.getRangeDurationType();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime4.property(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 26744 + "'", int36 == 26744);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "25" + "'", str40, "25");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Deutschland" + "'", str41, "Deutschland");
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 92 + "'", int47 == 92);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertNotNull(property50);
    }

    @Test
    public void test17585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17585");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(100L, (org.joda.time.Chronology) gJChronology4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusSeconds(26147);
        int int11 = localDateTime8.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withMillisOfDay(0);
        int int14 = localDateTime13.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, readableInstant17, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.millisOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(100L, (org.joda.time.Chronology) gJChronology19);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusSeconds(26147);
        int int26 = localDateTime23.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property27 = localDateTime23.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property28 = localDateTime23.dayOfYear();
        int int29 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime13.minusMinutes(26168);
        int int32 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime13.plusSeconds(26212);
        int int35 = localDateTime13.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime13.minusSeconds(282);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusSeconds(688);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
    }

    @Test
    public void test17586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17586");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology8.getZone();
        java.lang.String str12 = dateTimeZone10.getName((long) 26155);
        org.joda.time.Chronology chronology13 = gJChronology4.withZone(dateTimeZone10);
        mutableDateTime3.setZone(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 0);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime15.toMutableDateTime(dateTimeZone18);
        mutableDateTime15.addMillis(44274162);
        mutableDateTime15.addMillis(273);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime15.weekyear();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime15.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.486" + "'", str12, "+00:00:00.486");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test17587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17587");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("hi!");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        int int7 = dateTimeZone4.getOffset((long) 11);
        java.lang.String str9 = dateTimeZone4.getShortName((long) 2051);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = mutableDateTime15.toDateTimeISO();
        int int17 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        org.joda.time.DateTime.Property property21 = dateTime20.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime20.withPeriodAdded(readablePeriod22, 0);
        int int25 = dateTime20.getSecondOfDay();
        mutableDateTime15.setDate((org.joda.time.ReadableInstant) dateTime20);
        mutableDateTime15.setMillisOfDay((int) 'a');
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime15.era();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime33 = property29.addWrapField(688);
        int int34 = dateTimeZone4.getOffset((org.joda.time.ReadableInstant) mutableDateTime33);
        mutableDateTime33.addDays(26357);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime40 = property37.addWrapField(26148);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.dayOfWeek();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 26745 + "'", int25 == 26745);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test17588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17588");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTime dateTime7 = dateTime5.withMillisOfDay(0);
        org.joda.time.DateTime dateTime9 = dateTime7.withYear((int) '#');
        org.joda.time.DateTime dateTime11 = dateTime9.withMonthOfYear((int) (short) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology16.getZone();
        long long23 = dateTimeZone20.convertLocalToUTC(32L, false);
        boolean boolean24 = property12.equals((java.lang.Object) false);
        int int25 = property12.getMaximumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = property12.setCopy(44693);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44693 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str4, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-454L) + "'", long23 == (-454L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 59 + "'", int25 == 59);
    }

    @Test
    public void test17589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17589");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology10.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        boolean boolean17 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyear();
        int int20 = localDateTime18.get(dateTimeFieldType19);
        boolean boolean21 = localDateTime16.isAfter((org.joda.time.ReadablePartial) localDateTime18);
        int[] intArray23 = new int[] {};
        int[] intArray25 = dateTimeField14.add((org.joda.time.ReadablePartial) localDateTime16, (int) (byte) 100, intArray23, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, readableInstant28, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField31 = gJChronology30.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology30.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology30.hourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = dateTimeField33.getType();
        java.lang.String str35 = dateTimeField33.toString();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime();
        boolean boolean38 = localDateTime36.isBefore((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.weekyear();
        int int41 = localDateTime39.get(dateTimeFieldType40);
        boolean boolean42 = localDateTime37.isAfter((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime39.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minusMonths(100);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale52 = java.util.Locale.PRC;
        java.lang.String str53 = dateTimeZone50.getShortName((long) 2022, locale52);
        java.lang.String str54 = dateTimeField33.getAsShortText((org.joda.time.ReadablePartial) localDateTime48, 295, locale52);
        java.lang.String str55 = dateTimeField14.getAsShortText((long) 51, locale52);
        java.util.Set<java.lang.Character> charSet56 = locale52.getExtensionKeys();
        int int57 = property5.getMaximumTextLength(locale52);
        org.joda.time.LocalDateTime localDateTime58 = property5.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime60 = localDateTime58.withMinuteOfHour(44252);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44252 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "DateTimeField[hourOfHalfday]" + "'", str35, "DateTimeField[hourOfHalfday]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2022 + "'", int41 == 2022);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:00:00.486" + "'", str53, "+00:00:00.486");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "295" + "'", str54, "295");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "0" + "'", str55, "0");
        org.junit.Assert.assertNotNull(charSet56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 9 + "'", int57 == 9);
        org.junit.Assert.assertNotNull(localDateTime58);
    }

    @Test
    public void test17590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17590");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter3.getPrinter();
        int int6 = dateTimeFormatter3.getDefaultYear();
        java.lang.Integer int7 = dateTimeFormatter3.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withPivotYear(70);
        java.util.Locale locale10 = dateTimeFormatter9.getLocale();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        int int12 = dateTimeFormatter9.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16, (int) (short) 1);
        java.lang.String str19 = gJChronology18.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.hourOfHalfday();
        org.joda.time.DurationField durationField21 = gJChronology18.centuries();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology18.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.Chronology chronology24 = gJChronology18.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology25 = gJChronology18.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter14.withChronology((org.joda.time.Chronology) gJChronology18);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology18.minuteOfHour();
        org.joda.time.DurationField durationField28 = gJChronology18.days();
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(gJChronology18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str19, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test17591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17591");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        boolean boolean2 = localDateTime0.isBefore((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property3.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = property5.withMinimumValue();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, 948);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.add(3600001L);
        mutableDateTime14.setDate(220924800100L);
        org.joda.time.DateTime dateTime17 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) 2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, readableInstant22, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology24.getZone();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology24.yearOfEra();
        org.joda.time.DurationField durationField27 = gJChronology24.halfdays();
        org.joda.time.DurationField durationField28 = gJChronology24.centuries();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology24.dayOfMonth();
        boolean boolean30 = dateTimeFieldType20.isSupported((org.joda.time.Chronology) gJChronology24);
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType20.getDurationType();
        boolean boolean32 = instant19.isSupported(dateTimeFieldType20);
        mutableDateTime14.setDate((org.joda.time.ReadableInstant) instant19);
        long long34 = instant19.getMillis();
        org.joda.time.MutableDateTime mutableDateTime35 = instant19.toMutableDateTimeISO();
        mutableDateTime35.addMillis(525);
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime35.add(readableDuration38, 1439);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 2022L + "'", long34 == 2022L);
        org.junit.Assert.assertNotNull(mutableDateTime35);
    }

    @Test
    public void test17592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17592");
        java.util.Locale locale2 = new java.util.Locale("zh_cn_26161757", "2022-02-21T07:22:21.356");
        org.junit.Assert.assertEquals(locale2.toString(), "zh_cn_26161757_2022-02-21T07:22:21.356");
    }

    @Test
    public void test17593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17593");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology) gJChronology3);
        mutableDateTime5.addYears(26165);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfEven();
        mutableDateTime11.setMillis((long) 26317);
        java.lang.Object obj14 = mutableDateTime11.clone();
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime11.add(readableDuration15, 28187);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 26177);
        org.joda.time.Instant instant20 = dateTime19.toInstant();
        java.util.Date date21 = instant20.toDate();
        mutableDateTime11.setDate((org.joda.time.ReadableInstant) instant20);
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str4, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals(obj14.toString(), "1970-01-01T00:00:26.803+00:00:00.486");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1970-01-01T00:00:26.803+00:00:00.486");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1970-01-01T00:00:26.803+00:00:00.486");
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:26 GMT 1970");
    }

    @Test
    public void test17594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17594");
        java.lang.String[] strArray14 = new java.lang.String[] { "de-DE", "+00:00", "Deutsch", "0", "15", "2022-02-21T07:15:50.993", "Heure de Greenwich", "7", "DateTimeField[hourOfHalfday]", "2022-02-22T00:00:00.101Z", "", "DateTimeField[hourOfHalfday]", "+00:00", "DateTimeField[hourOfHalfday]" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        int int17 = strSet15.size();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime();
        boolean boolean20 = localDateTime18.isBefore((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        int int23 = localDateTime21.get(dateTimeFieldType22);
        boolean boolean24 = localDateTime19.isAfter((org.joda.time.ReadablePartial) localDateTime21);
        boolean boolean25 = strSet15.equals((java.lang.Object) localDateTime19);
        org.joda.time.LocalDateTime.Property property26 = localDateTime19.hourOfDay();
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        java.lang.String str28 = property26.getAsText(locale27);
        java.lang.String str29 = locale27.getCountry();
        java.util.Set<java.lang.String> strSet30 = locale27.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream31 = strSet30.stream();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = mutableDateTime33.toDateTimeISO();
        org.joda.time.DateTime.Property property35 = dateTime34.millisOfDay();
        org.joda.time.DateTime dateTime36 = property35.roundHalfEvenCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = null;
        org.joda.time.format.DateTimeParser dateTimeParser38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter37, dateTimeParser38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter39.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withPivotYear((java.lang.Integer) 26149);
        int int43 = dateTimeFormatter40.getDefaultYear();
        int int44 = dateTimeFormatter40.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter40.withDefaultYear(8);
        boolean boolean47 = dateTime36.equals((java.lang.Object) dateTimeFormatter40);
        java.util.Locale locale48 = dateTimeFormatter40.getLocale();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = mutableDateTime50.toDateTimeISO();
        org.joda.time.DateTime.Property property52 = dateTime51.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.DateTime dateTime55 = dateTime51.withPeriodAdded(readablePeriod53, 0);
        org.joda.time.DateTime.Property property56 = dateTime55.hourOfDay();
        org.joda.time.Chronology chronology57 = dateTime55.getChronology();
        org.joda.time.DateTime dateTime59 = dateTime55.withMinuteOfHour(0);
        org.joda.time.DateTime.Property property60 = dateTime59.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime62 = org.joda.time.MutableDateTime.now(dateTimeZone61);
        org.joda.time.DateTime dateTime63 = mutableDateTime62.toDateTimeISO();
        org.joda.time.DateTime.Property property64 = dateTime63.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.DateTime dateTime67 = dateTime63.withPeriodAdded(readablePeriod65, 0);
        int int68 = dateTime63.getSecondOfDay();
        org.joda.time.DateTime.Property property69 = dateTime63.minuteOfHour();
        java.util.Locale locale70 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(locale70);
        java.lang.String str72 = property69.getAsText(locale70);
        java.lang.String str73 = locale70.getVariant();
        int int74 = property60.getMaximumTextLength(locale70);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = dateTimeFormatter40.withLocale(locale70);
        java.lang.String str76 = locale70.getISO3Language();
        boolean boolean77 = strSet30.contains((java.lang.Object) str76);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "7" + "'", str28, "7");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strStream31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2000 + "'", int43 == 2000);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2000 + "'", int44 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(locale48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTime67);
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 26745 + "'", int68 == 26745);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "25" + "'", str72, "25");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 4 + "'", int74 == 4);
        org.junit.Assert.assertNotNull(dateTimeFormatter75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "deu" + "'", str76, "deu");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test17595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17595");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfDay(611);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays(525);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DurationField durationField12 = durationFieldType7.getField((org.joda.time.Chronology) gJChronology11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.dayOfYear();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime2, (org.joda.time.Chronology) gJChronology11);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy(874L);
        int int18 = property15.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test17596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17596");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        java.lang.String str4 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeZone9.getShortName((long) 2022, locale11);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        int[] intArray15 = gJChronology3.get((org.joda.time.ReadablePartial) localDateTime13, 7L);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19, (int) (short) 1);
        java.lang.String str22 = gJChronology21.toString();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology21);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        boolean boolean26 = localDateTime24.isBefore((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyear();
        int int29 = localDateTime27.get(dateTimeFieldType28);
        boolean boolean30 = localDateTime25.isAfter((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withDayOfWeek(5);
        int int33 = localDateTime27.getYear();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime27.withHourOfDay((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime23.withFields((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime();
        boolean boolean39 = localDateTime37.isBefore((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekyear();
        int int42 = localDateTime40.get(dateTimeFieldType41);
        boolean boolean43 = localDateTime38.isAfter((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.withDayOfWeek(5);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (short) 10);
        boolean boolean48 = localDateTime35.isAfter((org.joda.time.ReadablePartial) localDateTime47);
        java.util.Locale locale50 = java.util.Locale.FRENCH;
        java.util.Locale locale51 = java.util.Locale.TAIWAN;
        java.lang.String str52 = locale50.getDisplayLanguage(locale51);
        java.lang.String str53 = dateTimeField17.getAsShortText((org.joda.time.ReadablePartial) localDateTime47, 26239, locale50);
        boolean boolean54 = locale50.hasExtensions();
        java.util.Locale.setDefault(locale50);
        org.junit.Assert.assertNotNull(gJChronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str4, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.486" + "'", str12, "+00:00:00.486");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1970, 1, 1, 493]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(gJChronology21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GJChronology[+00:00:00.486,mdfw=1]" + "'", str22, "GJChronology[+00:00:00.486,mdfw=1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2022 + "'", int42 == 2022);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "fr");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u6cd5\u6587" + "'", str52, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "26239" + "'", str53, "26239");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }
}
