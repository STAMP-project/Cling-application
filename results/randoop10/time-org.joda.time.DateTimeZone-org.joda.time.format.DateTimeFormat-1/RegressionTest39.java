import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

    public static boolean debug = false;

    @Test
    public void test19501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19501");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime3.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime3.minusMillis(4);
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime3.withWeekyear(2922789);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMillis(874);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusMillis(1969);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test19502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19502");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = localDateTime8.indexOf(dateTimeFieldType9);
        int int11 = localDateTime8.getEra();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTime dateTime14 = localDateTime8.toDateTime(dateTimeZone13);
        boolean boolean15 = dateTimeZone13.isFixed();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        java.util.Date date24 = localDateTime18.toDate();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.fromDateFields(date24);
        int[] intArray26 = localDateTime25.getValues();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.weekyear();
        org.joda.time.LocalDateTime localDateTime28 = property27.withMinimumValue();
        java.lang.String str29 = property27.getAsShortText();
        org.joda.time.LocalDateTime localDateTime30 = property27.roundHalfFloorCopy();
        boolean boolean31 = dateTimeZone13.isLocalDateTimeGap(localDateTime30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.era();
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.yearOfEra();
        long long38 = property37.remainder();
        java.util.Locale locale39 = java.util.Locale.PRC;
        java.util.Locale locale40 = locale39.stripExtensions();
        int int41 = property37.getMaximumShortTextLength(locale39);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.yearOfEra();
        org.joda.time.LocalDateTime localDateTime46 = property45.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime49.toDateTime(dateTimeZone55);
        long long57 = property45.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime56);
        int int58 = property37.getDifference((org.joda.time.ReadableInstant) dateTime56);
        java.lang.String str59 = property37.getAsShortText();
        org.joda.time.LocalDateTime localDateTime60 = property37.roundHalfEvenCopy();
        int int61 = localDateTime30.compareTo((org.joda.time.ReadablePartial) localDateTime60);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime63 = localDateTime30.withMonthOfYear(7869);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7869 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(intArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1970, 1, 1, 32]");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970" + "'", str29, "1970");
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property37);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1970" + "'", str59, "1970");
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test19503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19503");
        java.lang.String[] strArray8 = new java.lang.String[] { "yearOfEra", "ita", "Property[yearOfEra]", "Property[yearOfEra]", "eng", "zho", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Iterator<java.lang.String> strItor11 = strSet9.iterator();
        java.util.Iterator<java.lang.String> strItor12 = strSet9.iterator();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minus(readableDuration16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra((int) (short) 0);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withCenturyOfEra((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withYear(1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withMinuteOfHour(7);
        boolean boolean27 = strSet9.contains((java.lang.Object) localDateTime26);
        int int28 = localDateTime26.getSecondOfMinute();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test19504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19504");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        boolean boolean6 = property3.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        long long11 = property10.remainder();
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.util.Locale locale13 = locale12.stripExtensions();
        int int14 = property10.getMaximumShortTextLength(locale12);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime22.toDateTime(dateTimeZone28);
        long long30 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        int int31 = property10.getDifference((org.joda.time.ReadableInstant) dateTime29);
        java.util.Locale locale34 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.yearOfEra();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundFloorCopy();
        boolean boolean41 = strSet35.remove((java.lang.Object) localDateTime40);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.yearOfEra();
        org.joda.time.LocalDateTime localDateTime46 = property45.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime49.toDateTime(dateTimeZone55);
        long long57 = property45.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime58 = localDateTime40.toDateTime((org.joda.time.ReadableInstant) dateTime56);
        int int59 = dateTime29.compareTo((org.joda.time.ReadableInstant) dateTime58);
        long long60 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime58);
        java.util.Locale.Builder builder61 = new java.util.Locale.Builder();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long66 = dateTimeZone63.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long70 = dateTimeZone63.getMillisKeepLocal(dateTimeZone68, (long) (short) 100);
        java.util.TimeZone timeZone71 = dateTimeZone63.toTimeZone();
        int int72 = timeZone71.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone71);
        java.util.Locale locale75 = java.util.Locale.ITALIAN;
        java.lang.String str76 = locale75.getISO3Language();
        java.lang.String str77 = dateTimeZone73.getShortName(1L, locale75);
        java.util.Locale.Builder builder78 = builder61.setLocale(locale75);
        int int79 = property3.getMaximumShortTextLength(locale75);
        org.joda.time.DurationField durationField80 = property3.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime((long) 2040);
        int[] intArray83 = localDateTime82.getValues();
        boolean boolean84 = property3.equals((java.lang.Object) localDateTime82);
        org.joda.time.ReadableDuration readableDuration85 = null;
        org.joda.time.LocalDateTime localDateTime86 = localDateTime82.plus(readableDuration85);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime86.plusMinutes((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property89 = localDateTime86.weekyear();
        org.joda.time.LocalDateTime localDateTime91 = localDateTime86.plusWeeks((-1971));
        int int92 = localDateTime86.getYearOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(dateTime58);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L + "'", long70 == 100L);
        org.junit.Assert.assertNotNull(timeZone71);
// flaky:         org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "it");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "ita" + "'", str76, "ita");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "+00:00" + "'", str77, "+00:00");
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 9 + "'", int79 == 9);
        org.junit.Assert.assertNull(durationField80);
        org.junit.Assert.assertNotNull(intArray83);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1970, 1, 1, 2072]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(localDateTime91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1970 + "'", int92 == 1970);
    }

    @Test
    public void test19505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19505");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder4.setLanguage("zh");
        java.util.Locale.Builder builder9 = builder4.removeUnicodeLocaleAttribute("Korean");
        java.util.Locale locale10 = builder4.build();
        java.util.Locale locale13 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundFloorCopy();
        boolean boolean20 = strSet14.remove((java.lang.Object) localDateTime19);
        java.util.Locale locale23 = new java.util.Locale("hi!", "");
        boolean boolean24 = strSet14.remove((java.lang.Object) locale23);
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale23.getDisplayVariant(locale25);
        java.lang.String str28 = locale25.getCountry();
        java.util.Locale locale29 = java.util.Locale.PRC;
        java.lang.String str30 = locale25.getDisplayVariant(locale29);
        java.util.Locale.Builder builder31 = builder4.setLocale(locale25);
        java.lang.String str32 = locale25.getISO3Language();
        java.lang.String str33 = locale25.getVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CN" + "'", str28, "CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zho" + "'", str32, "zho");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test19506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19506");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        int int7 = localDateTime6.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.secondOfMinute();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime15 = property12.addToCopy(41L);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test19507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19507");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        int int10 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(292278993);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readableDuration18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withYearOfEra(4);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.yearOfEra();
        long long30 = property29.remainder();
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.util.Locale locale32 = locale31.stripExtensions();
        int int33 = property29.getMaximumShortTextLength(locale31);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.yearOfEra();
        org.joda.time.LocalDateTime localDateTime38 = property37.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime41.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime41.toDateTime(dateTimeZone47);
        long long49 = property37.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        int int50 = property29.getDifference((org.joda.time.ReadableInstant) dateTime48);
        java.util.Locale locale53 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet54 = locale53.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.yearOfEra();
        org.joda.time.LocalDateTime localDateTime59 = property58.roundFloorCopy();
        boolean boolean60 = strSet54.remove((java.lang.Object) localDateTime59);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.yearOfEra();
        org.joda.time.LocalDateTime localDateTime65 = property64.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone67);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime68.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.DateTime dateTime75 = localDateTime68.toDateTime(dateTimeZone74);
        long long76 = property64.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.DateTime dateTime77 = localDateTime59.toDateTime((org.joda.time.ReadableInstant) dateTime75);
        int int78 = dateTime48.compareTo((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.DateTime dateTime79 = localDateTime21.toDateTime((org.joda.time.ReadableInstant) dateTime77);
        int int80 = property14.compareTo((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.LocalDateTime localDateTime81 = property14.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime82 = property14.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals(locale53.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(dateTime77);
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(localDateTime82);
    }

    @Test
    public void test19508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19508");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset((int) 'x');
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setRawOffset(252000000);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
    }

    @Test
    public void test19509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19509");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        long long6 = dateTimeZone2.convertLocalToUTC((long) (short) 1, true, 100L);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        java.lang.String str10 = dateTimeZone8.getNameKey(79L);
        long long12 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (-30L));
        long long16 = dateTimeZone8.convertLocalToUTC((long) 59, false, 10L);
        java.lang.String str17 = dateTimeZone8.toString();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(5940L, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-63L) + "'", long12 == (-63L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 27L + "'", long16 == 27L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.032" + "'", str17, "+00:00:00.032");
    }

    @Test
    public void test19510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19510");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        long long5 = property4.remainder();
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.util.Locale locale7 = locale6.stripExtensions();
        int int8 = property4.getMaximumShortTextLength(locale6);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime16.toDateTime(dateTimeZone22);
        long long24 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        int int25 = property4.getDifference((org.joda.time.ReadableInstant) dateTime23);
        java.lang.String str26 = dateTime23.toString();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime23.getZone();
        long long29 = dateTimeZone27.convertUTCToLocal((long) 1970);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((-124358112000000L), dateTimeZone27);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T00:00:00.032+00:00:00.032" + "'", str26, "1970-01-01T00:00:00.032+00:00:00.032");
        org.junit.Assert.assertNotNull(dateTimeZone27);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 2002L + "'", long29 == 2002L);
    }

    @Test
    public void test19511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19511");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.dayOfYear();
        int int9 = localDateTime2.getYearOfEra();
        int int10 = localDateTime2.getMinuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.joda.time.format.DateTimeFormat.longDate();
        boolean boolean12 = localDateTime2.equals((java.lang.Object) dateTimeFormatter11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter11.getZone();
        java.lang.String str15 = dateTimeFormatter11.print((long) (-52));
        org.joda.time.Chronology chronology16 = dateTimeFormatter11.getChronolgy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u5e74\u6708\u65e5" + "'", str15, "\u5e74\u6708\u65e5");
        org.junit.Assert.assertNull(chronology16);
    }

    @Test
    public void test19512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19512");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy(10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfSecond((int) 'a');
        java.lang.String str13 = localDateTime10.toString();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withCenturyOfEra(97);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusYears(975);
        int int18 = localDateTime15.getYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-11T00:00:00.032" + "'", str13, "1970-01-11T00:00:00.032");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9770 + "'", int18 == 9770);
    }

    @Test
    public void test19513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19513");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone.setDefault(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int17 = dateTimeZone15.getOffset(1L);
        long long19 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 70);
        long long23 = dateTimeZone15.convertLocalToUTC((long) 'a', true, 100L);
        java.util.TimeZone timeZone24 = dateTimeZone15.toTimeZone();
        java.time.ZoneId zoneId25 = timeZone24.toZoneId();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone(zoneId25);
        java.time.ZoneId zoneId27 = timeZone26.toZoneId();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone(zoneId27);
        java.util.TimeZone timeZone29 = java.util.TimeZone.getTimeZone(zoneId27);
        java.util.TimeZone timeZone30 = java.util.TimeZone.getTimeZone(zoneId27);
        boolean boolean31 = timeZone9.hasSameRules(timeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 79L + "'", long19 == 79L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test19514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19514");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusSeconds(10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekyear();
        long long12 = property11.remainder();
        org.joda.time.LocalDateTime localDateTime13 = property11.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusDays(209980);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusDays(0);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime20.withCenturyOfEra(3);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusHours(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.hourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = property30.addToCopy(53);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.yearOfEra();
        org.joda.time.LocalDateTime localDateTime39 = property38.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = localDateTime42.toDateTime(dateTimeZone48);
        long long50 = property38.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime49);
        int int51 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTime49.getZone();
        java.lang.String str54 = dateTimeZone52.getShortName((long) (byte) 0);
        long long57 = dateTimeZone52.adjustOffset((long) 2070, false);
        java.util.TimeZone timeZone58 = dateTimeZone52.toTimeZone();
        java.lang.String str59 = dateTimeZone52.toString();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(370L, dateTimeZone52);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime62 = property61.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.yearOfEra();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.withWeekOfWeekyear((int) (byte) 1);
        int int69 = localDateTime68.size();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.plusYears((int) (byte) 100);
        int int72 = localDateTime71.getYearOfEra();
        int int73 = localDateTime71.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property74 = localDateTime71.dayOfMonth();
        int int75 = localDateTime71.getHourOfDay();
        int int76 = localDateTime71.size();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime71.withMillisOfSecond(370);
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone80);
        org.joda.time.LocalDateTime.Property property82 = localDateTime81.yearOfEra();
        org.joda.time.LocalDateTime localDateTime83 = property82.roundFloorCopy();
        boolean boolean85 = property82.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = property82.getFieldType();
        int int87 = localDateTime71.get(dateTimeFieldType86);
        boolean boolean88 = localDateTime62.isSupported(dateTimeFieldType86);
        int int89 = localDateTime32.indexOf(dateTimeFieldType86);
        org.joda.time.LocalDateTime localDateTime91 = localDateTime17.withField(dateTimeFieldType86, (int) (short) 10);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 8812800032L + "'", long12 == 8812800032L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 32 + "'", int51 == 32);
        org.junit.Assert.assertNotNull(dateTimeZone52);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00:00.032" + "'", str54, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 2070L + "'", long57 == 2070L);
        org.junit.Assert.assertNotNull(timeZone58);
// flaky:         org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00:00.032" + "'", str59, "+00:00:00.032");
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 4 + "'", int69 == 4);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2070 + "'", int72 == 2070);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 3 + "'", int73 == 3);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 4 + "'", int76 == 4);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2070 + "'", int87 == 2070);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(localDateTime91);
    }

    @Test
    public void test19515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19515");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(21);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.yearOfEra();
        long long6 = property5.remainder();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundCeilingCopy();
        java.lang.String str8 = property5.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        int int13 = localDateTime11.getMillisOfSecond();
        int int14 = property5.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime16 = property5.addWrapFieldToCopy(1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMillisOfSecond((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        long long23 = property22.remainder();
        boolean boolean25 = property22.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property22.getFieldType();
        int int27 = localDateTime18.indexOf(dateTimeFieldType26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime18.minus(readablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime32.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plus(readablePeriod42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.yearOfEra();
        long long48 = property47.remainder();
        java.util.Locale locale49 = java.util.Locale.PRC;
        java.util.Locale locale50 = locale49.stripExtensions();
        int int51 = property47.getMaximumShortTextLength(locale49);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.yearOfEra();
        org.joda.time.LocalDateTime localDateTime56 = property55.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone58);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime59.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = localDateTime59.toDateTime(dateTimeZone65);
        long long67 = property55.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime66);
        int int68 = property47.getDifference((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = localDateTime43.toDateTime((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long74 = dateTimeZone71.adjustOffset((-1L), true);
        long long78 = dateTimeZone71.convertLocalToUTC(1L, false, (long) 0);
        org.joda.time.DateTime dateTime79 = localDateTime43.toDateTime(dateTimeZone71);
        boolean boolean80 = localDateTime29.equals((java.lang.Object) dateTime79);
        org.joda.time.LocalDateTime.Property property81 = localDateTime29.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod82 = null;
        org.joda.time.LocalDateTime localDateTime83 = localDateTime29.minus(readablePeriod82);
        boolean boolean84 = dateTimeZone1.isLocalDateTimeGap(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[yearOfEra]" + "'", str8, "Property[yearOfEra]");
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property47);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 32L + "'", long48 == 32L);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L) + "'", long74 == (-1L));
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test19516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19516");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getScript();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.yearOfEra();
        long long6 = property5.remainder();
        boolean boolean8 = property5.equals((java.lang.Object) "en");
        org.joda.time.LocalDateTime localDateTime9 = property5.roundCeilingCopy();
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale10.getISO3Language();
        java.util.Set<java.lang.String> strSet12 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str13 = property5.getAsShortText(locale10);
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale14.getISO3Language();
        java.lang.String str16 = locale10.getDisplayVariant(locale14);
        java.lang.String str17 = locale0.getDisplayVariant(locale10);
        java.util.Set<java.lang.String> strSet18 = locale10.getUnicodeLocaleKeys();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int24 = dateTimeZone22.getOffset(1L);
        long long26 = dateTimeZone20.getMillisKeepLocal(dateTimeZone22, (long) 70);
        long long30 = dateTimeZone22.convertLocalToUTC((long) 'a', true, 100L);
        java.util.TimeZone timeZone31 = dateTimeZone22.toTimeZone();
        java.time.ZoneId zoneId32 = timeZone31.toZoneId();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone(zoneId32);
        java.util.TimeZone timeZone34 = java.util.TimeZone.getTimeZone(zoneId32);
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone(zoneId32);
        boolean boolean36 = strSet18.remove((java.lang.Object) timeZone35);
        java.util.TimeZone timeZone37 = null;
        boolean boolean38 = timeZone35.hasSameRules(timeZone37);
        java.time.ZoneId zoneId39 = timeZone35.toZoneId();
        java.lang.String str40 = timeZone35.getID();
        int int42 = timeZone35.getOffset(86300009L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eng" + "'", str11, "eng");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970" + "'", str13, "1970");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ita" + "'", str15, "ita");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 79L + "'", long26 == 79L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertNotNull(timeZone33);
// flaky:         org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone34);
// flaky:         org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone35);
// flaky:         org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(zoneId39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test19517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19517");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime3.toDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.minusYears((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((java.lang.Integer) 0);
        java.lang.String str16 = localDateTime3.toString(dateTimeFormatter15);
        int int17 = dateTimeFormatter15.getDefaultYear();
        java.lang.String str19 = dateTimeFormatter15.print((long) 'a');
        org.joda.time.Chronology chronology20 = dateTimeFormatter15.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = dateTimeFormatter15.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.Chronology chronology23 = dateTimeFormatter22.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter22.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.parse("2022-02-11T09:54:05.633", dateTimeFormatter25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:54:05.633\" is malformed at \"-02-11T09:54:05.633\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e0a\u534812:00" + "'", str16, "\u4e0a\u534812:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2000 + "'", int17 == 2000);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e0a\u534812:00" + "'", str19, "\u4e0a\u534812:00");
        org.junit.Assert.assertNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimePrinter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeParser24);
    }

    @Test
    public void test19518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19518");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) 1, true, 100L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        java.lang.String str9 = dateTimeZone7.getNameKey(79L);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-30L));
        long long15 = dateTimeZone7.convertLocalToUTC((long) 59, false, 10L);
        boolean boolean17 = dateTimeZone7.isStandardOffset(240000L);
        java.util.TimeZone timeZone18 = dateTimeZone7.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.032' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-63L) + "'", long11 == (-63L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 27L + "'", long15 == 27L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test19519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19519");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        boolean boolean6 = property3.equals((java.lang.Object) "en");
        org.joda.time.LocalDateTime localDateTime7 = property3.roundCeilingCopy();
        int int8 = property3.getMinimumValueOverall();
        org.joda.time.DurationField durationField9 = property3.getLeapDurationField();
        java.util.Locale locale10 = null;
        int int11 = property3.getMaximumShortTextLength(locale10);
        java.lang.String str12 = property3.getAsText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((int) '4');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withChronology(chronology16);
        boolean boolean18 = dateTimeFormatter13.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = localDateTime22.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime22.minusMillis(4);
        boolean boolean31 = dateTimeZone19.isLocalDateTimeGap(localDateTime22);
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = dateTimeZone19.getShortName((long) 5, locale33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter13.withLocale(locale33);
        java.util.Locale locale37 = new java.util.Locale("1");
        java.lang.String str38 = locale33.getDisplayName(locale37);
        java.util.Locale locale41 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        java.lang.String str43 = locale41.getLanguage();
        java.util.Set<java.lang.String> strSet44 = locale41.getUnicodeLocaleAttributes();
        java.lang.String str45 = locale41.toLanguageTag();
        java.lang.String str46 = locale33.getDisplayCountry(locale41);
        java.lang.String str47 = locale33.getDisplayName();
        int int48 = property3.getMaximumTextLength(locale33);
        java.util.Set<java.lang.String> strSet49 = locale33.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970" + "'", str12, "1970");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.032" + "'", str34, "+00:00:00.032");
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertEquals(locale37.toString(), "1");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Chinese (China)" + "'", str38, "Chinese (China)");
        org.junit.Assert.assertEquals(locale41.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "und" + "'", str45, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str47, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertNotNull(strSet49);
    }

    @Test
    public void test19520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19520");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter1.printTo(writer2, 23L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test19521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19521");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfYear();
        int int10 = localDateTime3.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.plusDays(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMonthOfYear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withYear((int) (short) 100);
        int[] intArray17 = localDateTime16.getValues();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfEra();
        long long22 = property21.remainder();
        java.util.Locale locale23 = java.util.Locale.PRC;
        java.util.Locale locale24 = locale23.stripExtensions();
        int int25 = property21.getMaximumShortTextLength(locale23);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.yearOfEra();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime33.toDateTime(dateTimeZone39);
        long long41 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime40);
        int int42 = property21.getDifference((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime43 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 273, chronology44);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(chronology44);
        int int47 = localDateTime46.getMillisOfDay();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(intArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 2, 32]");
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35966347 + "'", int47 == 35966347);
    }

    @Test
    public void test19522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19522");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMillis((int) (short) -1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.year();
        org.joda.time.LocalDateTime localDateTime15 = property14.getLocalDateTime();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test19523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19523");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("gioved\354 1 gennaio 1970_CINESE_English (United States)", (double) 16227L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=16227.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19524");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        int int10 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(292278993);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds(86300000);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYear(99);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMillisOfSecond(116);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = localDateTime20.toString("era (-1971-03-31T13:59:50.009)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test19525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19525");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuffer8, (long) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test19526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19526");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.setLanguage("French");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        java.util.Locale locale11 = builder7.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "french__1970");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "french__1970");
    }

    @Test
    public void test19527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19527");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMinuteOfHour(19);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear(0);
        org.joda.time.DateTime dateTime13 = localDateTime10.toDateTime();
        int int14 = localDateTime10.getDayOfWeek();
        int int15 = localDateTime10.size();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withMillisOfSecond(87);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test19528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19528");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDayOfMonth(7);
        int int10 = localDateTime5.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDateTime5.isSupported(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19529");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        java.lang.String str6 = property3.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        int int11 = localDateTime9.getMillisOfSecond();
        int int12 = property3.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime14 = property3.addWrapFieldToCopy(1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMillisOfSecond((int) (short) 1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.LocalDateTime localDateTime19 = property17.addToCopy(4041L);
        int int20 = localDateTime19.size();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.weekyear();
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[yearOfEra]" + "'", str6, "Property[yearOfEra]");
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test19530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19530");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(576, 35562482, 2070, 361, (-53), 57569, 244);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 361 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19531");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        int int8 = localDateTime2.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.year();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.plus(readableDuration10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime2.withDayOfYear(31);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        long long18 = property17.remainder();
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.util.Locale locale20 = locale19.stripExtensions();
        int int21 = property17.getMaximumShortTextLength(locale19);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.yearOfEra();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime29.toDateTime(dateTimeZone35);
        long long37 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        int int38 = property17.getDifference((org.joda.time.ReadableInstant) dateTime36);
        java.lang.String str39 = property17.getAsShortText();
        int int40 = property17.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime41 = property17.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int47 = dateTimeZone45.getOffset(1L);
        long long49 = dateTimeZone43.getMillisKeepLocal(dateTimeZone45, (long) 70);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now(dateTimeZone45);
        boolean boolean52 = localDateTime41.equals((java.lang.Object) localDateTime51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime41.plusSeconds(2);
        boolean boolean55 = localDateTime2.isAfter((org.joda.time.ReadablePartial) localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970" + "'", str39, "1970");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 79L + "'", long49 == 79L);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test19532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19532");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str9 = dateTimeZone7.getName(32L);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = dateTimeZone7.getName(365L, locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter3.withLocale(locale11);
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = java.util.Locale.getDefault(category14);
        java.util.Locale locale16 = java.util.Locale.getDefault(category14);
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.util.Locale locale19 = java.util.Locale.getDefault(category17);
        java.util.Locale.setDefault(category14, locale19);
        java.util.Locale locale21 = java.util.Locale.getDefault(category14);
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Locale locale25 = new java.util.Locale("zho", "");
        java.lang.String str26 = locale25.getISO3Language();
        java.lang.String str27 = locale22.getDisplayScript(locale25);
        java.lang.String str28 = locale25.getDisplayName();
        java.util.Locale locale32 = new java.util.Locale("UTC", "Cor\351e du Sud", "yearofera");
        java.lang.String str33 = locale25.getDisplayCountry(locale32);
        java.util.Locale.setDefault(category14, locale25);
        java.util.Locale locale35 = java.util.Locale.getDefault(category14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter3.withLocale(locale35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate38 = dateTimeFormatter3.parseLocalDate("english (1970-05-11T00:00:00.000)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.FORMAT + "'", category17.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale25.toString(), "zho");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zho" + "'", str26, "zho");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zho" + "'", str28, "zho");
        org.junit.Assert.assertEquals(locale32.toString(), "utc_COR\351E DU SUD_yearofera");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zho");
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
    }

    @Test
    public void test19533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19533");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.lang.Object obj2 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test19534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19534");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = dateTimeFormatter0.parseLocalDate("11/02/22 9.55");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"11/02/22 9.55\" is malformed at \"/02/22 9.55\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test19535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19535");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.centuryOfEra();
        java.util.Date date7 = localDateTime5.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromDateFields(date7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusHours((int) '#');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withMinuteOfHour(4);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime13.minusSeconds((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        int int29 = localDateTime23.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.yearOfEra();
        long long34 = property33.remainder();
        boolean boolean36 = property33.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property33.getFieldType();
        org.joda.time.LocalDateTime.Property property38 = localDateTime23.property(dateTimeFieldType37);
        int int39 = localDateTime20.get(dateTimeFieldType37);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime20.plusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.yearOfEra();
        long long46 = property45.remainder();
        boolean boolean48 = property45.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property45.getFieldType();
        org.joda.time.LocalDateTime.Property property50 = localDateTime41.property(dateTimeFieldType49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime8.property(dateTimeFieldType49);
        int int52 = localDateTime8.getMillisOfDay();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime8.withDurationAdded(readableDuration53, 197070);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType57 = localDateTime55.getFieldType((-3992));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -3992");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Jan 01 00:00:00 UTC 1971");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(property33);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1969 + "'", int39 == 1969);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 32L + "'", long46 == 32L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(localDateTime55);
    }

    @Test
    public void test19536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19536");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property3.getFieldType();
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test19537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19537");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        int int5 = dateTimeFormatter3.getDefaultYear();
        boolean boolean6 = dateTimeFormatter3.isOffsetParsed();
        boolean boolean7 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withPivotYear((java.lang.Integer) (-1971));
        int int10 = dateTimeFormatter3.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter3.getParser();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter3.withDefaultYear(356460000);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = dateTimeFormatter16.parseMillis("\u82f1\u6587\u7f8e\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(dateTimeParser12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNull(dateTimeParser14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test19538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19538");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMonths(9);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minus(readablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundFloorCopy();
        boolean boolean24 = property21.equals((java.lang.Object) ' ');
        int int25 = property21.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property21.getFieldType();
        int int27 = localDateTime14.indexOf(dateTimeFieldType26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime8.property(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime30 = property28.roundFloorCopy();
        java.lang.String str31 = property28.getAsText();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 292278993 + "'", int25 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1972" + "'", str31, "1972");
    }

    @Test
    public void test19539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19539");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        boolean boolean9 = strSet3.remove((java.lang.Object) localDateTime8);
        java.util.Locale locale12 = new java.util.Locale("hi!", "");
        boolean boolean13 = strSet3.remove((java.lang.Object) locale12);
        java.util.Iterator<java.lang.String> strItor14 = strSet3.iterator();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.parse("CN");
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale[] localeArray20 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.Locale.FilteringMode filteringMode23 = null;
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList21, filteringMode23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap25);
        java.util.Locale locale29 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Locale[] localeArray34 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.Locale.FilteringMode filteringMode37 = null;
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList35, filteringMode37);
        boolean boolean39 = strSet30.removeAll((java.util.Collection<java.util.Locale>) localeList38);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter(languageRangeList26, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.stream.Stream<java.util.Locale> localeStream41 = localeList40.stream();
        java.util.stream.Stream<java.util.Locale> localeStream42 = localeList40.stream();
        java.util.Locale locale43 = java.util.Locale.lookup(languageRangeList16, (java.util.Collection<java.util.Locale>) localeList40);
        java.util.stream.Stream<java.util.Locale> localeStream44 = localeList40.parallelStream();
        boolean boolean45 = strSet3.containsAll((java.util.Collection<java.util.Locale>) localeList40);
        java.util.Spliterator<java.lang.String> strSpliterator46 = strSet3.spliterator();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localeList24);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(localeStream41);
        org.junit.Assert.assertNotNull(localeStream42);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNotNull(localeStream44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strSpliterator46);
    }

    @Test
    public void test19540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19540");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        java.lang.String str6 = property3.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        int int11 = localDateTime9.getMillisOfSecond();
        int int12 = property3.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime14 = property3.addWrapFieldToCopy(1);
        org.joda.time.DurationField durationField15 = property3.getDurationField();
        int int16 = property3.get();
        int int17 = property3.getMaximumValue();
        org.joda.time.Interval interval18 = property3.toInterval();
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[yearOfEra]" + "'", str6, "Property[yearOfEra]");
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 292278993 + "'", int17 == 292278993);
        org.junit.Assert.assertNotNull(interval18);
    }

    @Test
    public void test19541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19541");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        timeZone9.setRawOffset(1971);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone("French");
        timeZone15.setRawOffset(70);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long22 = dateTimeZone19.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long26 = dateTimeZone19.getMillisKeepLocal(dateTimeZone24, (long) (short) 100);
        java.util.TimeZone timeZone27 = dateTimeZone19.toTimeZone();
        int int28 = timeZone27.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long33 = dateTimeZone30.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long37 = dateTimeZone30.getMillisKeepLocal(dateTimeZone35, (long) (short) 100);
        java.util.TimeZone timeZone38 = dateTimeZone30.toTimeZone();
        int int39 = timeZone38.getRawOffset();
        java.util.TimeZone.setDefault(timeZone38);
        java.util.TimeZone.setDefault(timeZone38);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        boolean boolean43 = timeZone27.hasSameRules(timeZone38);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long48 = dateTimeZone45.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long52 = dateTimeZone45.getMillisKeepLocal(dateTimeZone50, (long) (short) 100);
        java.util.TimeZone timeZone53 = dateTimeZone45.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long58 = dateTimeZone55.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long62 = dateTimeZone55.getMillisKeepLocal(dateTimeZone60, (long) (short) 100);
        java.util.TimeZone timeZone63 = dateTimeZone55.toTimeZone();
        int int64 = timeZone63.getRawOffset();
        boolean boolean65 = timeZone53.hasSameRules(timeZone63);
        boolean boolean66 = timeZone27.hasSameRules(timeZone53);
        java.util.TimeZone.setDefault(timeZone53);
        java.lang.String str68 = timeZone53.getID();
        java.time.ZoneId zoneId69 = timeZone53.toZoneId();
        java.util.TimeZone timeZone70 = java.util.TimeZone.getTimeZone(zoneId69);
        java.util.TimeZone.setDefault(timeZone70);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forTimeZone(timeZone70);
        boolean boolean73 = timeZone15.hasSameRules(timeZone70);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forTimeZone(timeZone70);
        boolean boolean75 = timeZone9.hasSameRules(timeZone70);
        boolean boolean76 = timeZone70.observesDaylightTime();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 100L + "'", long52 == 100L);
        org.junit.Assert.assertNotNull(timeZone53);
// flaky:         org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 100L + "'", long62 == 100L);
        org.junit.Assert.assertNotNull(timeZone63);
// flaky:         org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "UTC" + "'", str68, "UTC");
        org.junit.Assert.assertNotNull(zoneId69);
        org.junit.Assert.assertNotNull(timeZone70);
// flaky:         org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test19542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19542");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusHours((int) (byte) 10);
        int int11 = localDateTime10.getMonthOfYear();
        int int12 = localDateTime10.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusSeconds(10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusHours(12);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        boolean boolean18 = localDateTime16.isSupported(durationFieldType17);
        int[] intArray19 = localDateTime16.getValues();
        int int20 = localDateTime16.getYear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withYearOfEra(482);
        int int23 = localDateTime22.getYear();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50400032 + "'", int12 == 50400032);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1971, 3, 31, 7190032]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1971) + "'", int20 == (-1971));
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-481) + "'", int23 == (-481));
    }

    @Test
    public void test19543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19543");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime2.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.minusSeconds(3);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime2.plusSeconds(100);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusHours(20);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withDurationAdded(readableDuration16, 970);
        int int19 = localDateTime18.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test19544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19544");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        boolean boolean6 = property3.equals((java.lang.Object) ' ');
        int int7 = property3.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property3.getFieldType();
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withPeriodAdded(readablePeriod10, (int) 'u');
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 292278993 + "'", int7 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test19545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19545");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("taiwan");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale[] localeArray7 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        java.util.List<java.util.Locale> localeList11 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList8, filteringMode10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap12);
        java.util.Locale locale16 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Locale[] localeArray21 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList22 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList22, localeArray21);
        java.util.Locale.FilteringMode filteringMode24 = null;
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.util.Locale>) localeList22, filteringMode24);
        boolean boolean26 = strSet17.removeAll((java.util.Collection<java.util.Locale>) localeList25);
        java.util.List<java.util.Locale> localeList27 = java.util.Locale.filter(languageRangeList13, (java.util.Collection<java.util.Locale>) localeList25);
        java.util.Locale locale30 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale[] localeArray35 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale.FilteringMode filteringMode38 = null;
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList36, filteringMode38);
        boolean boolean40 = strSet31.removeAll((java.util.Collection<java.util.Locale>) localeList39);
        java.lang.String[] strArray41 = java.util.TimeZone.getAvailableIDs();
        java.lang.Comparable<java.lang.String>[] strComparableArray42 = strSet31.toArray((java.lang.Comparable<java.lang.String>[]) strArray41);
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags(languageRangeList13, (java.util.Collection<java.lang.String>) strSet31, filteringMode43);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Locale[] localeArray48 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList49 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList49, localeArray48);
        java.util.Locale.FilteringMode filteringMode51 = null;
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.util.Locale>) localeList49, filteringMode51);
        java.util.stream.Stream<java.util.Locale> localeStream53 = localeList52.parallelStream();
        boolean boolean54 = strSet31.retainAll((java.util.Collection<java.util.Locale>) localeList52);
        java.util.stream.Stream<java.util.Locale> localeStream55 = localeList52.parallelStream();
        java.util.Locale locale56 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList52);
        java.util.stream.Stream<java.util.Locale> localeStream57 = localeList52.stream();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localeList27);
        org.junit.Assert.assertEquals(locale30.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localeList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strComparableArray42);
        org.junit.Assert.assertTrue("'" + filteringMode43 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode43.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertNotNull(localeStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(localeStream55);
        org.junit.Assert.assertNull(locale56);
        org.junit.Assert.assertNotNull(localeStream57);
    }

    @Test
    public void test19546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19546");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusSeconds(10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMinuteOfHour(12);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localDateTime10.getFieldTypes();
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.weekyear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withPeriodAdded(readablePeriod14, 934);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.minusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYearOfEra(482);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.minusDays((int) (byte) 100);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test19547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19547");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(89);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test19548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19548");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        int int10 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(292278993);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds(86300000);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusDays((int) 'a');
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.year();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusMinutes((int) 'a');
        java.lang.String str21 = localDateTime17.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minus(readableDuration25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withEra((int) (short) 0);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.era();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusDays(50400009);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime17.withFields((org.joda.time.ReadablePartial) localDateTime31);
        int int33 = localDateTime31.getDayOfYear();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1969-09-29T09:11:19.025" + "'", str21, "1969-09-29T09:11:19.025");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 198 + "'", int33 == 198);
    }

    @Test
    public void test19549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19549");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusSeconds(10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekyear();
        int int12 = property11.getMaximumValueOverall();
        java.util.Locale locale15 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str17 = locale15.getLanguage();
        java.util.Locale locale18 = locale15.stripExtensions();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale19.getISO3Language();
        java.lang.String str21 = locale18.getDisplayCountry(locale19);
        java.lang.String str22 = locale19.toLanguageTag();
        java.lang.String str23 = locale19.getCountry();
        int int24 = property11.getMaximumShortTextLength(locale19);
        org.joda.time.LocalDateTime localDateTime25 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime27 = property11.addWrapFieldToCopy((-2));
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusDays(32032);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.hourOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292278993 + "'", int12 == 292278993);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ita" + "'", str20, "ita");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "it" + "'", str22, "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test19550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19550");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime9.toDateTime(dateTimeZone15);
        int int17 = property6.getDifference((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDateTime20.toDateTime(dateTimeZone26);
        boolean boolean28 = dateTime16.isBefore((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.yearOfEra();
        long long33 = property32.remainder();
        org.joda.time.LocalDateTime localDateTime34 = property32.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDateTime38.toDateTime(dateTimeZone44);
        int int46 = property35.getDifference((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime49.toDateTime(dateTimeZone55);
        boolean boolean57 = dateTime45.isBefore((org.joda.time.ReadableInstant) dateTime56);
        int int58 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime27.getZone();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        org.joda.time.format.DateTimePrinter dateTimePrinter62 = null;
        org.joda.time.format.DateTimeParser dateTimeParser63 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter62, dateTimeParser63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter64.withOffsetParsed();
        org.joda.time.Chronology chronology66 = dateTimeFormatter64.getChronolgy();
        boolean boolean67 = dateTimeFormatter64.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter68 = dateTimeFormatter64.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int74 = dateTimeZone72.getOffset(1L);
        long long76 = dateTimeZone70.getMillisKeepLocal(dateTimeZone72, (long) 70);
        long long80 = dateTimeZone72.convertLocalToUTC((long) 'a', true, 100L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = dateTimeFormatter64.withZone(dateTimeZone72);
        boolean boolean82 = dateTimeZone61.equals((java.lang.Object) dateTimeZone72);
        long long84 = dateTimeZone59.getMillisKeepLocal(dateTimeZone61, (long) 2);
        java.lang.String str85 = dateTimeZone61.getID();
        org.joda.time.LocalDateTime localDateTime86 = org.joda.time.LocalDateTime.now(dateTimeZone61);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime86.withYear(2070);
        org.joda.time.LocalDateTime.Property property89 = localDateTime86.weekyear();
        java.lang.String str91 = localDateTime86.toString("+00:00:00.069");
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNull(chronology66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(dateTimePrinter68);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 79L + "'", long76 == 79L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 97L + "'", long80 == 97L);
        org.junit.Assert.assertNotNull(dateTimeFormatter81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long84 + "' != '" + 2L + "'", long84 == 2L);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "+00:00:00.032" + "'", str85, "+00:00:00.032");
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "+00:00:00.069" + "'", str91, "+00:00:00.069");
    }

    @Test
    public void test19551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19551");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("\u53f0\u6e7e");
        java.util.Set<java.lang.String> strSet3 = provider0.getAvailableIDs();
        strSet3.clear();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test19552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19552");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        long long4 = property3.remainder();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.util.Locale locale6 = locale5.stripExtensions();
        int int7 = property3.getMaximumShortTextLength(locale5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime15.toDateTime(dateTimeZone21);
        long long23 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime22);
        int int24 = property3.getDifference((org.joda.time.ReadableInstant) dateTime22);
        java.lang.String str25 = property3.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property3.getFieldType();
        java.lang.String str27 = property3.toString();
        boolean boolean28 = property3.isLeap();
        org.joda.time.DateTimeField dateTimeField29 = property3.getField();
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970" + "'", str25, "1970");
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Property[yearOfEra]" + "'", str27, "Property[yearOfEra]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test19553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19553");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekOfWeekyear(7);
        java.lang.String str8 = localDateTime6.toString("+00:00");
        int int9 = localDateTime6.size();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.minus(readableDuration10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.yearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test19554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19554");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("China");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale locale6 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Locale[] localeArray11 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList12 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList12, localeArray11);
        java.util.Locale.FilteringMode filteringMode14 = null;
        java.util.List<java.util.Locale> localeList15 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList12, filteringMode14);
        boolean boolean16 = strSet7.removeAll((java.util.Collection<java.util.Locale>) localeList15);
        java.lang.String[] strArray17 = java.util.TimeZone.getAvailableIDs();
        java.lang.Comparable<java.lang.String>[] strComparableArray18 = strSet7.toArray((java.lang.Comparable<java.lang.String>[]) strArray17);
        int int19 = strSet7.size();
        int int20 = strSet7.size();
        java.util.Spliterator<java.lang.String> strSpliterator21 = strSet7.spliterator();
        java.lang.String str22 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap23);
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.lang.String str26 = locale25.getISO3Country();
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = null;
        org.joda.time.format.DateTimeParser dateTimeParser28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter27, dateTimeParser28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter29.withOffsetParsed();
        org.joda.time.Chronology chronology31 = dateTimeFormatter29.getChronolgy();
        org.joda.time.Chronology chronology32 = dateTimeFormatter29.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = dateTimeFormatter29.getPrinter();
        java.util.Locale locale34 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter29.withLocale(locale34);
        java.lang.String str37 = locale25.getDisplayVariant(locale34);
        java.util.Set<java.lang.String> strSet38 = locale34.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet38);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.parse("taiwan");
        java.util.Locale locale44 = new java.util.Locale("eng", "hi!");
        java.util.Locale locale48 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str49 = locale44.getDisplayVariant(locale48);
        java.util.Set<java.lang.String> strSet50 = locale44.getUnicodeLocaleKeys();
        java.lang.Object[] objArray51 = strSet50.toArray();
        java.lang.Object obj52 = null;
        boolean boolean53 = strSet50.remove(obj52);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags(languageRangeList41, (java.util.Collection<java.lang.String>) strSet50);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.parse("eng");
        java.util.Locale locale59 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet60 = locale59.getUnicodeLocaleAttributes();
        java.lang.String str61 = locale59.getLanguage();
        java.util.Set<java.lang.String> strSet62 = locale59.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet63 = locale59.getUnicodeLocaleKeys();
        boolean boolean65 = strSet63.contains((java.lang.Object) '#');
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.util.Locale[] localeArray69 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList70 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList70, localeArray69);
        java.util.Locale.FilteringMode filteringMode72 = null;
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, (java.util.Collection<java.util.Locale>) localeList70, filteringMode72);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, strMap74);
        java.util.Locale locale78 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet79 = locale78.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray80 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList81 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81, languageRangeArray80);
        java.util.Locale[] localeArray83 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList84 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList84, localeArray83);
        java.util.Locale.FilteringMode filteringMode86 = null;
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList81, (java.util.Collection<java.util.Locale>) localeList84, filteringMode86);
        boolean boolean88 = strSet79.removeAll((java.util.Collection<java.util.Locale>) localeList87);
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter(languageRangeList75, (java.util.Collection<java.util.Locale>) localeList87);
        boolean boolean90 = strSet63.retainAll((java.util.Collection<java.util.Locale>) localeList87);
        java.util.stream.Stream<java.util.Locale> localeStream91 = localeList87.parallelStream();
        java.util.Locale locale92 = java.util.Locale.lookup(languageRangeList56, (java.util.Collection<java.util.Locale>) localeList87);
        boolean boolean93 = strSet50.retainAll((java.util.Collection<java.util.Locale>) localeList87);
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet50);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CHN" + "'", str26, "CHN");
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNull(chronology31);
        org.junit.Assert.assertNull(chronology32);
        org.junit.Assert.assertNull(dateTimePrinter33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertEquals(locale44.toString(), "eng_HI!");
        org.junit.Assert.assertEquals(locale48.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(localeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertEquals(locale78.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(languageRangeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(localeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(localeList89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(localeStream91);
        org.junit.Assert.assertNull(locale92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(strList94);
    }

    @Test
    public void test19555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19555");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        int int6 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusSeconds(10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.LocalDateTime localDateTime13 = property11.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withCenturyOfEra(2065);
        java.lang.Class<?> wildcardClass17 = localDateTime16.getClass();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test19556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19556");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = localDateTime8.indexOf(dateTimeFieldType9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withPeriodAdded(readablePeriod11, 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.plusWeeks(1968);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusYears(100);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test19557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19557");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        boolean boolean1 = dateTimeFormatter0.isParser();
        boolean boolean2 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear(0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withWeekOfWeekyear((int) (byte) 1);
        int int13 = localDateTime12.size();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusSeconds(10);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withWeekOfWeekyear(14);
        java.lang.String str22 = dateTimeFormatter4.print((org.joda.time.ReadablePartial) localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e0a\u534812:00" + "'", str22, "\u4e0a\u534812:00");
    }

    @Test
    public void test19558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19558");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.plusMonths(0);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readableDuration10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withYearOfEra(4);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test19559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19559");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        java.util.Date date8 = localDateTime2.toDate();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.fromDateFields(date8);
        int[] intArray10 = localDateTime9.getValues();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withMonthOfYear((int) (byte) 10);
        int int13 = localDateTime12.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plus(readablePeriod26);
        int int28 = localDateTime25.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.withTime(9, 19, 3, (int) (short) 100);
        boolean boolean34 = localDateTime12.isBefore((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.minus(readablePeriod35);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) readablePeriod35);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1970, 1, 1, 32]");
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
    }

    @Test
    public void test19560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19560");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withDefaultYear((int) (byte) 100);
        java.util.Locale locale5 = dateTimeFormatter0.getLocale();
        int int6 = dateTimeFormatter0.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '4');
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withChronology(chronology11);
        boolean boolean13 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter8.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter15.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withPivotYear(99);
        java.util.Locale locale21 = dateTimeFormatter18.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser22 = dateTimeFormatter18.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = org.joda.time.format.DateTimeFormat.fullDateTime();
        java.lang.String str27 = dateTimeFormatter25.print((long) 19);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeFormatter25.getZone();
        java.lang.Integer int29 = dateTimeFormatter25.getPivotYear();
        java.util.Locale locale30 = dateTimeFormatter25.getLocale();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime33.toDateTime(dateTimeZone39);
        int int41 = localDateTime33.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property42 = localDateTime33.millisOfSecond();
        int int43 = localDateTime33.getCenturyOfEra();
        java.lang.String str44 = dateTimeFormatter25.print((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.format.DateTimeParser dateTimeParser45 = dateTimeFormatter25.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser45);
        java.io.Writer writer47 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.yearOfEra();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime50.withMinuteOfHour(4);
        int int56 = localDateTime55.getDayOfYear();
        int int57 = localDateTime55.getEra();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter46.printTo(writer47, (org.joda.time.ReadablePartial) localDateTime55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimePrinter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeParser16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNull(locale21);
        org.junit.Assert.assertNotNull(dateTimeParser22);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u5e74\u6708\u65e5\u661f\u671f\u56db\u4e0a\u5348\u65f6\u5206\u79d2 +00:00:00.032" + "'", str27, "\u5e74\u6708\u65e5\u661f\u671f\u56db\u4e0a\u5348\u65f6\u5206\u79d2 +00:00:00.032");
        org.junit.Assert.assertNull(dateTimeZone28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 19 + "'", int43 == 19);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u5e74\u6708\u65e5\u661f\u671f\u56db\u4e0a\u5348\u65f6\u5206\u79d2 " + "'", str44, "\u5e74\u6708\u65e5\u661f\u671f\u56db\u4e0a\u5348\u65f6\u5206\u79d2 ");
        org.junit.Assert.assertNotNull(dateTimeParser45);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test19561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19561");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str5 = nameProvider0.getShortName(locale1, "English", "");
        java.util.Locale locale8 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale8.getLanguage();
        java.util.Locale locale11 = locale8.stripExtensions();
        java.lang.String str14 = nameProvider0.getShortName(locale8, "zh", "CHN");
        java.util.Locale.Category category15 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale19 = new java.util.Locale("hi!", "en", "Property[yearOfEra]");
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category15, locale19);
        java.lang.String str24 = nameProvider0.getName(locale19, "19", "Taiwan");
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("\u82f1\u6587");
        java.util.Locale locale27 = null;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        java.lang.String str31 = nameProvider0.getShortName(locale26, "32032", "-1971");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category15.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale19.toString(), "hi!_EN_Property[yearOfEra]");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test19562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19562");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        java.util.Locale locale7 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale7);
        boolean boolean10 = dateTimeFormatter2.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        java.util.Locale locale15 = new java.util.Locale("yearOfEra");
        java.util.Locale.setDefault(locale15);
        java.lang.String str17 = dateTimeZone12.getShortName(292278993L, locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter2.withZone(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.tz.Provider provider20 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone22 = provider20.getZone("Etc/UTC");
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone22);
        long long25 = dateTimeZone22.convertUTCToLocal((long) 3940);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter2.withZone(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals(locale15.toString(), "yearofera");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(provider20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3940L + "'", long25 == 3940L);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test19563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19563");
        java.util.Locale locale3 = new java.util.Locale("1/7/00", "1971", "10/10/69");
        org.junit.Assert.assertEquals(locale3.toString(), "1/7/00_1971_10/10/69");
    }

    @Test
    public void test19564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19564");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withDefaultYear(12);
        int int11 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear(86300000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((java.lang.Integer) 24130696);
        java.util.Locale.Category category16 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale locale18 = java.util.Locale.getDefault(category16);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
        java.util.Locale locale21 = java.util.Locale.getDefault(category19);
        java.util.Locale.setDefault(category16, locale21);
        java.util.Locale locale23 = java.util.Locale.getDefault(category16);
        java.util.Locale locale24 = java.util.Locale.GERMANY;
        java.util.Locale locale27 = new java.util.Locale("zho", "");
        java.lang.String str28 = locale27.getISO3Language();
        java.lang.String str29 = locale24.getDisplayScript(locale27);
        java.lang.String str30 = locale27.getDisplayName();
        java.util.Locale locale34 = new java.util.Locale("UTC", "Cor\351e du Sud", "yearofera");
        java.lang.String str35 = locale27.getDisplayCountry(locale34);
        java.util.Locale.setDefault(category16, locale27);
        java.lang.String str37 = locale27.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter13.withLocale(locale27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter38.withDefaultYear(241306);
        java.lang.Appendable appendable41 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter38.printTo(appendable41, 1200L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.FORMAT + "'", category16.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "yearofera");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "yearofera");
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "yearofera");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "yearofera");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "yearofera");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale27.toString(), "zho");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zho" + "'", str28, "zho");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zho" + "'", str30, "zho");
        org.junit.Assert.assertEquals(locale34.toString(), "utc_COR\351E DU SUD_yearofera");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
    }

    @Test
    public void test19565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19565");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.plusMonths(0);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readableDuration10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusMinutes(70);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusDays(70);
        int int28 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withCenturyOfEra(35);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.withDurationAdded(readableDuration31, 100000);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime36.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plus(readablePeriod46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.yearOfEra();
        long long52 = property51.remainder();
        java.util.Locale locale53 = java.util.Locale.PRC;
        java.util.Locale locale54 = locale53.stripExtensions();
        int int55 = property51.getMaximumShortTextLength(locale53);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.yearOfEra();
        org.joda.time.LocalDateTime localDateTime60 = property59.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone62);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime63.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = localDateTime63.toDateTime(dateTimeZone69);
        long long71 = property59.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime70);
        int int72 = property51.getDifference((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime73 = localDateTime47.toDateTime((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTimeZone dateTimeZone74 = dateTime70.getZone();
        long long77 = dateTimeZone74.adjustOffset(363L, true);
        org.joda.time.DateTime dateTime78 = localDateTime27.toDateTime(dateTimeZone74);
        long long80 = dateTimeZone74.nextTransition((long) 86300009);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property51);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + 32L + "'", long52 == 32L);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 9 + "'", int55 == 9);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 363L + "'", long77 == 363L);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 86300009L + "'", long80 == 86300009L);
    }

    @Test
    public void test19566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19566");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(273, 0);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 91, dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.secondOfMinute();
        int int6 = localDateTime4.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test19567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19567");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy(10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfSecond((int) 'a');
        java.lang.String str13 = localDateTime10.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusMinutes(1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime10.minus(readableDuration23);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-11T00:00:00.032" + "'", str13, "1970-01-11T00:00:00.032");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test19568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19568");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        int int10 = dateTimeZone1.getStandardOffset((long) 70);
        java.lang.String str12 = dateTimeZone1.getShortName(2022L);
        long long14 = dateTimeZone1.previousTransition((long) 3);
        long long16 = dateTimeZone1.nextTransition(1991L);
        boolean boolean17 = dateTimeZone1.isFixed();
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder19.setVariant("1970");
        java.util.Locale.Builder builder23 = builder21.removeUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder24 = builder23.clear();
        java.util.Locale.Builder builder26 = builder23.setLanguage("zh");
        java.util.Locale.Builder builder28 = builder23.removeUnicodeLocaleAttribute("Korean");
        java.util.Locale locale29 = builder23.build();
        java.lang.String str30 = dateTimeZone1.getShortName((-5L), locale29);
        long long32 = dateTimeZone1.convertUTCToLocal((long) 5875);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1991L + "'", long16 == 1991L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5875L + "'", long32 == 5875L);
    }

    @Test
    public void test19569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19569");
        java.util.Locale locale1 = new java.util.Locale("yearOfEra");
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "yearofera");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "yearofera");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test19570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19570");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        int int9 = property8.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = property8.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        long long15 = property14.remainder();
        java.util.Locale locale16 = java.util.Locale.PRC;
        java.util.Locale locale17 = locale16.stripExtensions();
        int int18 = property14.getMaximumShortTextLength(locale16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime26.toDateTime(dateTimeZone32);
        long long34 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        int int35 = property14.getDifference((org.joda.time.ReadableInstant) dateTime33);
        int int36 = property8.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (-100));
        boolean boolean39 = property8.equals((java.lang.Object) localDateTime38);
        java.lang.String str40 = property8.getAsShortText();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "19" + "'", str40, "19");
    }

    @Test
    public void test19571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19571");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        int int7 = localDateTime6.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusYears(2000);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readableDuration18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withDayOfYear((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        int int25 = localDateTime23.indexOf(dateTimeFieldType24);
        int int26 = localDateTime23.getMonthOfYear();
        org.joda.time.DateTime dateTime27 = localDateTime23.toDateTime();
        int int28 = localDateTime23.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.withMillisOfSecond((int) (byte) 1);
        int int31 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minusYears(370);
        java.util.Locale locale36 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.yearOfEra();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundFloorCopy();
        boolean boolean43 = strSet37.remove((java.lang.Object) localDateTime42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime46.toDateTime(dateTimeZone52);
        boolean boolean54 = strSet37.remove((java.lang.Object) localDateTime46);
        int int55 = strSet37.size();
        boolean boolean56 = localDateTime30.equals((java.lang.Object) strSet37);
        int int57 = strSet37.size();
        java.util.Iterator<java.lang.String> strItor58 = strSet37.iterator();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertEquals(locale36.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(strItor58);
    }

    @Test
    public void test19572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19572");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '4');
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withChronology(chronology3);
        boolean boolean5 = dateTimeFormatter0.isPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter7.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser9);
        java.io.Writer writer11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readableDuration15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusMonths(9);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.monthOfYear();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(writer11, (org.joda.time.ReadablePartial) localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test19573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19573");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone8);
        int int10 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(292278993);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds(86300000);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readableDuration19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusSeconds(2000);
        int int27 = localDateTime26.getYear();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = localDateTime26.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.yearOfEra();
        long long33 = property32.remainder();
        org.joda.time.LocalDateTime localDateTime34 = property32.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minus(readableDuration39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.withMinuteOfHour((int) '4');
        int int45 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = localDateTime34.getFieldType((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime26.withField(dateTimeFieldType47, 86300000);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime15.withField(dateTimeFieldType47, 0);
        int int52 = localDateTime15.size();
        org.joda.time.LocalDateTime.Property property53 = localDateTime15.centuryOfEra();
        org.joda.time.DurationField durationField54 = property53.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime55 = property53.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1970) + "'", int27 == (-1970));
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray28);
        org.junit.Assert.assertNotNull(property32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNull(durationField54);
        org.junit.Assert.assertNotNull(localDateTime55);
    }

    @Test
    public void test19574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19574");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("eng");
        java.util.Locale locale4 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundFloorCopy();
        boolean boolean11 = strSet5.remove((java.lang.Object) localDateTime10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale15 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfEra();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundFloorCopy();
        boolean boolean22 = strSet16.remove((java.lang.Object) localDateTime21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.yearOfEra();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDateTime30.toDateTime(dateTimeZone36);
        long long38 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime39 = localDateTime21.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        java.lang.String str40 = dateTimeFormatter12.print((org.joda.time.ReadableInstant) dateTime39);
        boolean boolean41 = strSet5.contains((java.lang.Object) str40);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int47 = dateTimeZone45.getOffset(1L);
        long long49 = dateTimeZone43.getMillisKeepLocal(dateTimeZone45, (long) 70);
        long long53 = dateTimeZone45.convertLocalToUTC((long) 'a', true, 100L);
        java.util.TimeZone timeZone54 = dateTimeZone45.toTimeZone();
        java.time.ZoneId zoneId55 = timeZone54.toZoneId();
        java.util.TimeZone timeZone56 = java.util.TimeZone.getTimeZone(zoneId55);
        boolean boolean57 = timeZone56.observesDaylightTime();
        boolean boolean58 = timeZone56.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        java.lang.String str60 = timeZone56.getID();
        boolean boolean61 = strSet5.remove((java.lang.Object) str60);
        java.lang.String str62 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet5);
        java.util.Spliterator<java.lang.String> strSpliterator63 = strSet5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = strSet5.add("sabato 1 gennaio 2000 0.00.00 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Thursday, January 1, 1970" + "'", str40, "Thursday, January 1, 1970");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 79L + "'", long49 == 79L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 97L + "'", long53 == 97L);
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId55);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "UTC" + "'", str60, "UTC");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(strSpliterator63);
    }

    @Test
    public void test19575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19575");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(99);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(8);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test19576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19576");
        java.util.Locale locale3 = new java.util.Locale("hi!", "Property[yearOfEra]", "");
        java.lang.String str4 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_PROPERTY[YEAROFERA]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
    }

    @Test
    public void test19577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19577");
        java.util.Locale locale3 = new java.util.Locale("Coordinated Universal Time", "9:19:03 AM ", "\u5e74\u6708\u65e5\u6642\u5206\u79d2 +00:00:00.032");
        java.lang.String str4 = locale3.getScript();
        java.util.Locale.setDefault(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u5e74\u6708\u65e5\u6642\u5206\u79d2 +00:00:00.032");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test19578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19578");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("+00:00:00.069", "\u4e2d\u6587\u4e2d\u56fd)", "US");
        java.util.Locale.setDefault(category0, locale5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int10 = dateTimeZone8.getOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        long long14 = dateTimeZone8.getMillisKeepLocal(dateTimeZone12, (long) 2000);
        org.joda.time.tz.NameProvider nameProvider16 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale17 = java.util.Locale.TAIWAN;
        java.lang.String str20 = nameProvider16.getName(locale17, "69", "yearOfEra");
        java.lang.String str21 = locale17.getDisplayName();
        java.lang.String str22 = dateTimeZone12.getShortName(0L, locale17);
        java.util.Locale locale25 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.yearOfEra();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundFloorCopy();
        boolean boolean32 = strSet26.remove((java.lang.Object) localDateTime31);
        java.util.Locale locale35 = new java.util.Locale("hi!", "");
        boolean boolean36 = strSet26.remove((java.lang.Object) locale35);
        java.lang.String str37 = locale17.getDisplayCountry(locale35);
        java.util.Set<java.lang.Character> charSet38 = locale35.getExtensionKeys();
        java.lang.String str39 = locale35.getCountry();
        java.util.Locale locale41 = new java.util.Locale("yearOfCentury");
        java.lang.String str42 = locale35.getDisplayLanguage(locale41);
        java.lang.String str43 = locale41.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale41);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "\u5e74\u6708\u65e5\u6642\u5206\u79d2 +00:00:00.032");
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\u4e2d\u6587\u4e2d\u56fd)_US");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1991L + "'", long14 == 1991L);
        org.junit.Assert.assertNotNull(nameProvider16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chinese (Taiwan)" + "'", str21, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.009" + "'", str22, "+00:00:00.009");
        org.junit.Assert.assertEquals(locale25.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Taiwan" + "'", str37, "Taiwan");
        org.junit.Assert.assertNotNull(charSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals(locale41.toString(), "yearofcentury");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "yearofcentury" + "'", str43, "yearofcentury");
    }

    @Test
    public void test19579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19579");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        boolean boolean6 = property3.equals((java.lang.Object) ' ');
        org.joda.time.LocalDateTime localDateTime7 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusYears(370);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minus(readableDuration13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withDayOfYear((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        int int20 = localDateTime18.indexOf(dateTimeFieldType19);
        int int21 = localDateTime18.getEra();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTime dateTime24 = localDateTime18.toDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = localDateTime7.toDateTime(dateTimeZone23);
        java.lang.String str26 = dateTimeZone23.toString();
        java.lang.String str28 = dateTimeZone23.getName(4041L);
        long long31 = dateTimeZone23.convertLocalToUTC((long) 31, true);
        long long33 = dateTimeZone23.nextTransition(0L);
        long long37 = dateTimeZone23.convertLocalToUTC((long) (-3), true, (long) 901);
        java.lang.String str39 = dateTimeZone23.getShortName((long) 31);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.009" + "'", str26, "+00:00:00.009");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.009" + "'", str28, "+00:00:00.009");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 22L + "'", long31 == 22L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-12L) + "'", long37 == (-12L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.009" + "'", str39, "+00:00:00.009");
    }

    @Test
    public void test19580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19580");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMillis((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) 'u');
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDateTime15.isSupported(durationFieldType16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withPeriodAdded(readablePeriod18, (-19034));
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readableDuration24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusHours((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withHourOfDay((int) (short) 1);
        boolean boolean34 = localDateTime15.equals((java.lang.Object) localDateTime33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime15.weekyear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long40 = dateTimeZone37.adjustOffset((-1L), true);
        java.util.Locale locale42 = java.util.Locale.US;
        java.lang.String str43 = locale42.getISO3Language();
        java.util.Set<java.lang.String> strSet44 = locale42.getUnicodeLocaleAttributes();
        java.lang.String str45 = dateTimeZone37.getShortName(0L, locale42);
        long long47 = dateTimeZone37.convertUTCToLocal((long) 100);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.dayOfWeek();
        org.joda.time.tz.NameProvider nameProvider50 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.yearOfEra();
        long long55 = property54.remainder();
        boolean boolean57 = property54.equals((java.lang.Object) "en");
        org.joda.time.LocalDateTime localDateTime58 = property54.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone60);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.yearOfEra();
        long long63 = property62.remainder();
        java.util.Locale locale64 = java.util.Locale.PRC;
        java.util.Locale locale65 = locale64.stripExtensions();
        int int66 = property62.getMaximumShortTextLength(locale64);
        java.lang.String str67 = locale64.getISO3Language();
        java.lang.String str68 = property54.getAsShortText(locale64);
        java.lang.String str71 = nameProvider50.getName(locale64, "CN", "1970-01-01T00:04:00.000");
        java.util.Locale.Category category72 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale73 = java.util.Locale.getDefault(category72);
        java.util.Locale locale74 = java.util.Locale.getDefault(category72);
        java.util.Locale.Category category75 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale76 = java.util.Locale.getDefault(category75);
        java.util.Locale locale77 = java.util.Locale.getDefault(category75);
        java.util.Locale.setDefault(category72, locale77);
        java.lang.String str81 = nameProvider50.getName(locale77, "jeudi 1 janvier 1970", "eng");
        java.util.Locale locale83 = new java.util.Locale("yearOfEra");
        java.lang.String str86 = nameProvider50.getShortName(locale83, "1969-01-01T00:00:00.000", "1970-01-01T00:00:00.000");
        java.util.Locale locale87 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet88 = locale87.getUnicodeLocaleKeys();
        java.lang.String str89 = locale83.getDisplayScript(locale87);
        java.lang.String str90 = property49.getAsText(locale87);
        java.lang.String str91 = property35.getAsShortText(locale87);
        org.joda.time.LocalDateTime localDateTime92 = property35.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int94 = localDateTime92.getValue(32400032);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32400032");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "eng" + "'", str43, "eng");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(nameProvider50);
        org.junit.Assert.assertNotNull(property54);
// flaky:         org.junit.Assert.assertTrue("'" + long55 + "' != '" + 32L + "'", long55 == 32L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property62);
// flaky:         org.junit.Assert.assertTrue("'" + long63 + "' != '" + 32L + "'", long63 == 32L);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 9 + "'", int66 == 9);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "zho" + "'", str67, "zho");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "1970" + "'", str68, "1970");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + category72 + "' != '" + java.util.Locale.Category.FORMAT + "'", category72.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "yearofcentury");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "yearofcentury");
        org.junit.Assert.assertTrue("'" + category75 + "' != '" + java.util.Locale.Category.FORMAT + "'", category75.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "yearofcentury");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "yearofcentury");
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertEquals(locale83.toString(), "yearofera");
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\u661f\u671f\u4e94" + "'", str90, "\u661f\u671f\u4e94");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "1971" + "'", str91, "1971");
        org.junit.Assert.assertNotNull(localDateTime92);
    }

    @Test
    public void test19581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19581");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone6);
        long long11 = dateTimeZone6.convertUTCToLocal(69L);
        int int13 = dateTimeZone6.getStandardOffset((long) 374);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 69L + "'", long11 == 69L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test19582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19582");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime2.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.minusMillis(4);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMinutes((int) 'u');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.lang.String str14 = localDateTime10.toString(dateTimeFormatter13);
        boolean boolean15 = dateTimeFormatter13.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withDefaultYear(198);
        boolean boolean18 = dateTimeFormatter13.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withPivotYear((int) '4');
        java.util.Locale locale24 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.yearOfEra();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundFloorCopy();
        boolean boolean31 = strSet25.remove((java.lang.Object) localDateTime30);
        java.util.Locale locale34 = new java.util.Locale("hi!", "");
        boolean boolean35 = strSet25.remove((java.lang.Object) locale34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter19.withLocale(locale34);
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale38.getDisplayLanguage();
        java.lang.String str40 = locale37.getDisplayCountry(locale38);
        java.lang.String str41 = locale38.getCountry();
        java.lang.String str42 = locale34.getDisplayScript(locale38);
        java.lang.String str43 = locale38.getVariant();
        java.lang.String str44 = locale38.getDisplayLanguage();
        boolean boolean45 = locale38.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter13.withLocale(locale38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime48 = dateTimeFormatter46.parseLocalDateTime("dayOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"dayOfYear\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "January 1, 1970 12:00:00 AM " + "'", str14, "January 1, 1970 12:00:00 AM ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertEquals(locale24.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "\u5e74\u6708\u65e5\u6642\u5206\u79d2 +00:00:00.032");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "\u5e74\u6708\u65e5\u6642\u5206\u79d2 +00:00:00.032");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "coordinated universal time" + "'", str39, "coordinated universal time");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "9:19:03 AM " + "'", str40, "9:19:03 AM ");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "9:19:03 AM " + "'", str41, "9:19:03 AM ");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u5e74\u6708\u65e5\u6642\u5206\u79d2 +00:00:00.032" + "'", str43, "\u5e74\u6708\u65e5\u6642\u5206\u79d2 +00:00:00.032");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "coordinated universal time" + "'", str44, "coordinated universal time");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
    }

    @Test
    public void test19583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19583");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        int int14 = localDateTime11.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusHours(0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.withMillisOfDay((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfEra();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder21.setVariant("1970");
        java.util.Locale.Builder builder25 = builder23.setLanguage("French");
        java.util.Locale locale26 = builder25.build();
        java.util.Locale.setDefault(locale26);
        java.lang.String str28 = locale26.getLanguage();
        java.lang.String str29 = property20.getAsShortText(locale26);
        int int30 = property20.getLeapAmount();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "french__1970");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "french" + "'", str28, "french");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1969" + "'", str29, "1969");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test19584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19584");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear(9);
        org.joda.time.Chronology chronology6 = dateTimeFormatter3.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        long long13 = dateTimeZone9.convertLocalToUTC((long) 10, false, (long) (byte) 1);
        int int15 = dateTimeZone9.getOffset((long) (short) 1);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 32, dateTimeZone9);
        long long19 = dateTimeZone9.adjustOffset((long) 2070, true);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter3.withZone(dateTimeZone9);
        java.io.Writer writer21 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minus(readableDuration25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusMonths(9);
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime32 = property31.withMinimumValue();
        int int33 = property31.get();
        org.joda.time.LocalDateTime localDateTime34 = property31.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withYearOfEra(363);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(writer21, (org.joda.time.ReadablePartial) localDateTime34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2070L + "'", long19 == 2070L);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19 + "'", int33 == 19);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
    }

    @Test
    public void test19585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19585");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 0);
        java.lang.String str4 = dateTimeFormatter0.print((long) 35486149);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long13 = dateTimeZone10.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long17 = dateTimeZone10.getMillisKeepLocal(dateTimeZone15, (long) (short) 100);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone15.getMillisKeepLocal(dateTimeZone19, 2L);
        long long24 = dateTimeZone19.convertLocalToUTC((long) 1, true);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter8.withZone(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.yearOfEra();
        long long30 = property29.remainder();
        org.joda.time.LocalDateTime localDateTime31 = property29.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minus(readableDuration36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMinuteOfHour((int) '4');
        int int42 = localDateTime31.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime37.minusMinutes(370);
        int int45 = localDateTime37.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime37.withYearOfEra(50400001);
        int int48 = localDateTime37.getYearOfEra();
        boolean boolean49 = dateTimeZone19.isLocalDateTimeGap(localDateTime37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter0.withZone(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime53.toDateTime(dateTimeZone59);
        int int61 = localDateTime53.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property62 = localDateTime53.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime64 = property62.addToCopy(292278993);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime64.withPeriodAdded(readablePeriod66, 2922789);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime64.plusHours((int) 'u');
        org.joda.time.LocalDateTime localDateTime72 = localDateTime64.plusMillis(7870);
        java.lang.String str73 = dateTimeFormatter50.print((org.joda.time.ReadablePartial) localDateTime72);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/1/70 9:51 AM" + "'", str4, "1/1/70 9:51 AM");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2L + "'", long21 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(property29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 70 + "'", int45 == 70);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1970 + "'", int48 == 1970);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4 + "'", int61 == 4);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "1/4/70 9:11 AM" + "'", str73, "1/4/70 9:11 AM");
    }

    @Test
    public void test19586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19586");
        java.util.Locale locale2 = new java.util.Locale("eng", "hi!");
        java.util.Locale locale6 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Set<java.lang.String> strSet8 = locale2.getUnicodeLocaleKeys();
        java.lang.Object[] objArray9 = strSet8.toArray();
        java.lang.Object obj10 = null;
        boolean boolean11 = strSet8.remove(obj10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.parse("it", strMap13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList14, strMap15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withYearOfCentury(5);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusSeconds(209980);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusHours((-100));
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.yearOfEra();
        long long33 = property32.remainder();
        org.joda.time.LocalDateTime localDateTime34 = property32.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.centuryOfEra();
        org.joda.time.Interval interval36 = property35.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property35.getFieldType();
        org.joda.time.LocalDateTime.Property property38 = localDateTime28.property(dateTimeFieldType37);
        org.joda.time.LocalDateTime localDateTime39 = property38.roundHalfFloorCopy();
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Locale[] localeArray43 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.Locale.FilteringMode filteringMode46 = null;
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList44, filteringMode46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, strMap48);
        java.util.Locale locale52 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Locale[] localeArray57 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList58 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList58, localeArray57);
        java.util.Locale.FilteringMode filteringMode60 = null;
        java.util.List<java.util.Locale> localeList61 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.util.Locale>) localeList58, filteringMode60);
        boolean boolean62 = strSet53.removeAll((java.util.Collection<java.util.Locale>) localeList61);
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter(languageRangeList49, (java.util.Collection<java.util.Locale>) localeList61);
        boolean boolean64 = property38.equals((java.lang.Object) localeList61);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter(languageRangeList14, (java.util.Collection<java.util.Locale>) localeList61);
        boolean boolean66 = strSet8.removeAll((java.util.Collection<java.util.Locale>) localeList61);
        org.junit.Assert.assertEquals(locale2.toString(), "eng_HI!");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(localeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(localeList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(localeList63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test19587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19587");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        long long8 = dateTimeZone1.convertLocalToUTC(1L, false, (long) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale12 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundFloorCopy();
        boolean boolean19 = strSet13.remove((java.lang.Object) localDateTime18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDateTime27.toDateTime(dateTimeZone33);
        long long35 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime36 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime34);
        int int37 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime34);
        java.lang.String str39 = dateTimeZone9.getShortName(1L);
        long long41 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (long) 999);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.withCenturyOfEra(365);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.minus(readablePeriod45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.plusYears(53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime50 = localDateTime48.withMillisOfSecond(1600);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1600 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(dateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.032" + "'", str39, "+00:00:00.032");
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 967L + "'", long41 == 967L);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
    }

    @Test
    public void test19588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19588");
        java.util.Locale locale2 = new java.util.Locale("zho", "");
        java.lang.String str3 = locale2.getISO3Language();
        java.lang.String str4 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
    }

    @Test
    public void test19589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19589");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMonths(9);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime10 = property9.withMinimumValue();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localDateTime10.isSupported(durationFieldType12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withMillisOfDay(3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = localDateTime15.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withDayOfMonth(12);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test19590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19590");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDateTime9.indexOf(dateTimeFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plus(readablePeriod13);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.year();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withYearOfCentury(97);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusDays(3940);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test19591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19591");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u30a4\u30bf\u30ea\u30a2\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19592");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withMinuteOfHour(4);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusSeconds((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        int int18 = localDateTime12.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        long long23 = property22.remainder();
        boolean boolean25 = property22.equals((java.lang.Object) "en");
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property22.getFieldType();
        org.joda.time.LocalDateTime.Property property27 = localDateTime12.property(dateTimeFieldType26);
        int int28 = localDateTime9.get(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime9.plusHours((-1));
        org.joda.time.LocalDateTime localDateTime32 = localDateTime9.plusHours((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plus(readablePeriod33);
        int int35 = localDateTime34.getYearOfCentury();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1969 + "'", int28 == 1969);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 70 + "'", int35 == 70);
    }

    @Test
    public void test19593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19593");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        long long5 = property4.remainder();
        boolean boolean7 = property4.equals((java.lang.Object) "en");
        org.joda.time.LocalDateTime localDateTime8 = property4.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        long long13 = property12.remainder();
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.util.Locale locale15 = locale14.stripExtensions();
        int int16 = property12.getMaximumShortTextLength(locale14);
        java.lang.String str17 = locale14.getISO3Language();
        java.lang.String str18 = property4.getAsShortText(locale14);
        java.lang.String str21 = nameProvider0.getName(locale14, "CN", "1970-01-01T00:04:00.000");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale25 = new java.util.Locale("1/1/69", "Corea del Sud");
        java.lang.String str26 = locale25.getDisplayName();
        java.util.Locale locale27 = java.util.Locale.PRC;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.lang.String str29 = locale25.getDisplayVariant(locale27);
        boolean boolean30 = locale27.hasExtensions();
        java.lang.String str31 = locale27.getDisplayVariant();
        java.lang.String str34 = nameProvider0.getName(locale27, "Thursday, January 1, 1970 12:00:00 AM +00:00:00.001", "monthOfYear");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale36 = null;
        java.lang.String str39 = nameProvider0.getShortName(locale36, "\u7fa9\u5927\u5229", "1970-01-01T00:00:00.019");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zho" + "'", str17, "zho");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970" + "'", str18, "1970");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals(locale25.toString(), "1/1/69_COREA DEL SUD");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1/1/69 (COREA DEL SUD)" + "'", str26, "1/1/69 (COREA DEL SUD)");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test19594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19594");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long15 = dateTimeZone12.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long19 = dateTimeZone12.getMillisKeepLocal(dateTimeZone17, (long) (short) 100);
        java.util.TimeZone timeZone20 = dateTimeZone12.toTimeZone();
        int int21 = timeZone20.getRawOffset();
        java.util.TimeZone.setDefault(timeZone20);
        java.util.TimeZone.setDefault(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        boolean boolean25 = timeZone9.hasSameRules(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long30 = dateTimeZone27.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long34 = dateTimeZone27.getMillisKeepLocal(dateTimeZone32, (long) (short) 100);
        java.util.TimeZone timeZone35 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long40 = dateTimeZone37.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long44 = dateTimeZone37.getMillisKeepLocal(dateTimeZone42, (long) (short) 100);
        java.util.TimeZone timeZone45 = dateTimeZone37.toTimeZone();
        int int46 = timeZone45.getRawOffset();
        boolean boolean47 = timeZone35.hasSameRules(timeZone45);
        boolean boolean48 = timeZone9.hasSameRules(timeZone35);
        java.util.TimeZone.setDefault(timeZone35);
        java.lang.String str50 = timeZone35.getID();
        java.time.ZoneId zoneId51 = timeZone35.toZoneId();
        java.time.ZoneId zoneId52 = timeZone35.toZoneId();
        boolean boolean53 = timeZone35.observesDaylightTime();
        int int54 = timeZone35.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UTC" + "'", str50, "UTC");
        org.junit.Assert.assertNotNull(zoneId51);
        org.junit.Assert.assertNotNull(zoneId52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test19595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19595");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        long long18 = property17.remainder();
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.util.Locale locale20 = locale19.stripExtensions();
        int int21 = property17.getMaximumShortTextLength(locale19);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.yearOfEra();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime29.toDateTime(dateTimeZone35);
        long long37 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        int int38 = property17.getDifference((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime39 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime13.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusHours(575);
        org.joda.time.DateTime dateTime44 = localDateTime43.toDateTime();
        org.joda.time.Instant instant45 = dateTime44.toInstant();
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime44.getZone();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
    }

    @Test
    public void test19596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19596");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusMonths(3939);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfCeilingCopy();
        java.lang.String str10 = property8.toString();
        int int11 = property8.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[hourOfDay]" + "'", str10, "Property[hourOfDay]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 23 + "'", int11 == 23);
    }

    @Test
    public void test19597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19597");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long15 = dateTimeZone11.convertLocalToUTC(100L, true, (long) (short) 100);
        java.lang.String str17 = dateTimeZone11.getName((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long22 = dateTimeZone19.adjustOffset((-1L), true);
        long long26 = dateTimeZone19.convertLocalToUTC(1L, false, (long) 0);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale30 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.yearOfEra();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundFloorCopy();
        boolean boolean37 = strSet31.remove((java.lang.Object) localDateTime36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.yearOfEra();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime45.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localDateTime45.toDateTime(dateTimeZone51);
        long long53 = property41.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTime dateTime54 = localDateTime36.toDateTime((org.joda.time.ReadableInstant) dateTime52);
        int int55 = dateTimeZone27.getOffset((org.joda.time.ReadableInstant) dateTime52);
        java.lang.String str57 = dateTimeZone27.getShortName(1L);
        long long59 = dateTimeZone19.getMillisKeepLocal(dateTimeZone27, (long) 999);
        long long61 = dateTimeZone11.getMillisKeepLocal(dateTimeZone27, (long) 100);
        java.lang.String str62 = dateTimeZone11.getID();
        org.joda.time.tz.Provider provider64 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone66 = provider64.getZone("Etc/UTC");
        boolean boolean68 = dateTimeZone66.isStandardOffset((long) 2070);
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) 916, dateTimeZone66);
        boolean boolean70 = dateTimeZone11.equals((java.lang.Object) 916);
        int int72 = dateTimeZone11.getOffset((-124326057600000L));
        java.lang.String str73 = dateTimeZone11.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals(locale30.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(dateTime54);
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00:00.032" + "'", str57, "+00:00:00.032");
// flaky:         org.junit.Assert.assertTrue("'" + long59 + "' != '" + 967L + "'", long59 == 967L);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 68L + "'", long61 == 68L);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "UTC" + "'", str62, "UTC");
        org.junit.Assert.assertNotNull(provider64);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "UTC" + "'", str73, "UTC");
    }

    @Test
    public void test19598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19598");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.util.TimeZone.setDefault(timeZone9);
        java.util.TimeZone.setDefault(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long18 = dateTimeZone15.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long22 = dateTimeZone15.getMillisKeepLocal(dateTimeZone20, (long) (short) 100);
        java.util.TimeZone timeZone23 = dateTimeZone15.toTimeZone();
        int int24 = timeZone23.getRawOffset();
        java.util.TimeZone.setDefault(timeZone23);
        java.util.TimeZone.setDefault(timeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        boolean boolean28 = timeZone9.hasSameRules(timeZone23);
        timeZone9.setRawOffset((int) 'x');
        java.util.TimeZone.setDefault(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.yearOfEra();
        long long38 = property37.remainder();
        boolean boolean40 = property37.equals((java.lang.Object) "en");
        org.joda.time.LocalDateTime localDateTime41 = property37.roundCeilingCopy();
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder44 = builder42.setVariant("1970");
        java.util.Locale.Builder builder46 = builder44.removeUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder47 = builder44.clearExtensions();
        java.util.Locale locale48 = builder47.build();
        java.util.Locale locale49 = builder47.build();
        java.util.Locale locale50 = builder47.build();
        int int51 = property37.getMaximumTextLength(locale50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = timeZone9.getDisplayName(false, 32400032, locale50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 32400032");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(property37);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
    }

    @Test
    public void test19599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19599");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(97);
        long long3 = dateTimeZone1.convertUTCToLocal(1L);
        long long6 = dateTimeZone1.convertLocalToUTC(28944000001L, false);
        java.lang.String str8 = dateTimeZone1.getNameKey(3939L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 349200001L + "'", long3 == 349200001L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 28594800001L + "'", long6 == 28594800001L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test19600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19600");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        boolean boolean9 = strSet3.remove((java.lang.Object) localDateTime8);
        strSet3.clear();
        boolean boolean11 = strSet3.isEmpty();
        int int12 = strSet3.size();
        boolean boolean13 = strSet3.isEmpty();
        boolean boolean15 = strSet3.contains((java.lang.Object) "+273:00");
        java.util.Iterator<java.lang.String> strItor16 = strSet3.iterator();
        strSet3.clear();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test19601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19601");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime7.toDateTime(dateTimeZone13);
        long long15 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property3.addWrapFieldToCopy(1970);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusSeconds(2922789);
        int int20 = localDateTime19.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.plus(readablePeriod21);
        java.util.Locale locale25 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.yearOfEra();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundFloorCopy();
        boolean boolean32 = strSet26.remove((java.lang.Object) localDateTime31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.yearOfEra();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDateTime40.toDateTime(dateTimeZone46);
        long long48 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDateTime31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime31.plus(readablePeriod50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusDays(12);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone55);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.yearOfEra();
        org.joda.time.LocalDateTime localDateTime58 = property57.roundFloorCopy();
        boolean boolean60 = property57.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = property57.getFieldType();
        int int62 = localDateTime51.get(dateTimeFieldType61);
        org.joda.time.LocalDateTime.Property property63 = localDateTime22.property(dateTimeFieldType61);
        int int64 = localDateTime22.getYearOfEra();
        int int65 = localDateTime22.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53 + "'", int20 == 53);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertEquals(locale25.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1970 + "'", int62 == 1970);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3940 + "'", int64 == 3940);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 53 + "'", int65 == 53);
    }

    @Test
    public void test19602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19602");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        int int7 = localDateTime6.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.plusWeeks((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.minusHours(2000);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean14 = dateTimeZone13.isFixed();
        java.lang.String str15 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getID();
        java.lang.String str17 = dateTimeZone13.getID();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime20.minusYears((int) (byte) 1);
        int int28 = localDateTime20.size();
        boolean boolean29 = dateTimeZone13.equals((java.lang.Object) int28);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone13);
        java.util.TimeZone timeZone31 = dateTimeZone13.toTimeZone();
        java.util.TimeZone.setDefault(timeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.lang.String str35 = dateTimeZone33.getName(2022L);
        org.joda.time.DateTime dateTime36 = localDateTime6.toDateTime(dateTimeZone33);
        java.util.Locale locale41 = new java.util.Locale("1969-01-01T00:00:32.000Z", "1970-01-01T00:00:00.999+00:00:00.032", "\u97e9\u56fd");
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str43 = locale42.getDisplayLanguage();
        java.lang.String str44 = locale42.getLanguage();
        java.lang.String str45 = locale41.getDisplayName(locale42);
        java.lang.String str46 = dateTimeZone33.getShortName((long) 209980, locale42);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertNotNull(dateTime36);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "\u97e9\u56fd");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "French" + "'", str43, "French");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "fr" + "'", str44, "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u97e9\u56fd)" + "'", str45, "\u97e9\u56fd)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
    }

    @Test
    public void test19603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19603");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMonths(9);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.monthOfYear();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusHours(70);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test19604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19604");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        boolean boolean9 = strSet3.remove((java.lang.Object) localDateTime8);
        strSet3.clear();
        boolean boolean11 = strSet3.isEmpty();
        int int12 = strSet3.size();
        java.util.Iterator<java.lang.String> strItor13 = strSet3.iterator();
        strSet3.clear();
        boolean boolean15 = strSet3.isEmpty();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test19605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19605");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime2.getFieldTypes();
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.year();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        long long15 = property14.remainder();
        org.joda.time.LocalDateTime localDateTime16 = property14.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDateTime20.toDateTime(dateTimeZone26);
        int int28 = property17.getDifference((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime31.toDateTime(dateTimeZone37);
        boolean boolean39 = dateTime27.isBefore((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.yearOfEra();
        long long44 = property43.remainder();
        org.joda.time.LocalDateTime localDateTime45 = property43.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime49.toDateTime(dateTimeZone55);
        int int57 = property46.getDifference((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone59);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime60.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = localDateTime60.toDateTime(dateTimeZone66);
        boolean boolean68 = dateTime56.isBefore((org.joda.time.ReadableInstant) dateTime67);
        int int69 = dateTime38.compareTo((org.joda.time.ReadableInstant) dateTime67);
        java.lang.String str70 = dateTime67.toString();
        int int71 = property9.compareTo((org.joda.time.ReadableInstant) dateTime67);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(property43);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 32L + "'", long44 == 32L);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "1970-01-01T00:00:00.032+00:00:00.032" + "'", str70, "1970-01-01T00:00:00.032+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test19606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19606");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        int int14 = localDateTime11.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = localDateTime17.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.plusSeconds((-1971));
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusMonths(0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test19607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19607");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str5 = nameProvider0.getShortName(locale1, "Chinese (Taiwan)", "English (United States)");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plus(readablePeriod18);
        int int20 = localDateTime17.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.minusHours(0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime17.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime25 = property23.setCopy(0);
        long long26 = property23.remainder();
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale28.getLanguage();
        java.lang.String str30 = locale27.getDisplayCountry(locale28);
        java.lang.String str31 = locale28.getDisplayName();
        int int32 = property23.getMaximumTextLength(locale28);
        java.util.Locale locale33 = java.util.Locale.ROOT;
        java.lang.String str34 = locale28.getDisplayLanguage(locale33);
        java.lang.String str37 = nameProvider0.getName(locale33, "fr", "fr");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale39 = java.util.Locale.ROOT;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale40.getLanguage();
        java.lang.String str42 = locale39.getDisplayCountry(locale40);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long47 = dateTimeZone44.adjustOffset((-1L), true);
        java.util.Locale locale49 = java.util.Locale.US;
        java.lang.String str50 = locale49.getISO3Language();
        java.util.Set<java.lang.String> strSet51 = locale49.getUnicodeLocaleAttributes();
        java.lang.String str52 = dateTimeZone44.getShortName(0L, locale49);
        java.lang.String str53 = locale49.getVariant();
        java.lang.String str54 = locale40.getDisplayLanguage(locale49);
        java.lang.String str56 = locale40.getExtension('a');
        java.lang.String str59 = nameProvider0.getName(locale40, "", "");
        java.util.Locale locale60 = null;
        java.lang.String str63 = nameProvider0.getShortName(locale60, "", "yearOfCentury");
        java.util.Locale locale64 = null;
        java.lang.String str67 = nameProvider0.getName(locale64, "\uc911\uad6d\uc5b4", "Property[dayOfYear]");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Taiwan" + "'", str2, "Taiwan");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32032L + "'", long26 == 32032L);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "french__1970");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "french" + "'", str29, "french");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "french (1970)" + "'", str31, "french (1970)");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "french" + "'", str34, "french");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "french__1970");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "french" + "'", str41, "french");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "eng" + "'", str50, "eng");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00" + "'", str52, "+00:00");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "french" + "'", str54, "french");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test19608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19608");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeParser dateTimeParser1 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withOffsetParsed();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronolgy();
        boolean boolean7 = dateTimeFormatter4.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long12 = dateTimeZone9.adjustOffset((-1L), true);
        long long16 = dateTimeZone9.convertLocalToUTC(1L, false, (long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter4.withZone(dateTimeZone9);
        long long19 = dateTimeZone9.nextTransition((long) 5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter0.withZone(dateTimeZone9);
        boolean boolean21 = dateTimeFormatter20.isParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeParser1);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5L + "'", long19 == 5L);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test19609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19609");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime7.toDateTime(dateTimeZone13);
        long long15 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property3.addWrapFieldToCopy(1970);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusSeconds(2922789);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.monthOfYear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minus(readableDuration25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withEra((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withDayOfYear((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        int int32 = localDateTime30.indexOf(dateTimeFieldType31);
        int int33 = localDateTime30.getMonthOfYear();
        org.joda.time.DateTime dateTime34 = localDateTime30.toDateTime();
        org.joda.time.DateTime dateTime35 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime34);
        java.lang.String str36 = dateTime35.toString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "3940-01-01T00:00:00.032+00:00:00.032" + "'", str36, "3940-01-01T00:00:00.032+00:00:00.032");
    }

    @Test
    public void test19610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19610");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getName(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean5 = dateTimeZone0.isStandardOffset((long) 5);
        long long7 = dateTimeZone0.convertUTCToLocal(8812800032L);
        long long9 = dateTimeZone0.convertUTCToLocal(2009L);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) 28800000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8812800064L + "'", long7 == 8812800064L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2041L + "'", long9 == 2041L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test19611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19611");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        java.lang.String str2 = dateTimeFormatter0.print((long) 19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withDefaultYear((int) (short) -1);
        int int5 = dateTimeFormatter4.getDefaultYear();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronology();
        java.lang.Integer int7 = dateTimeFormatter4.getPivotYear();
        boolean boolean8 = dateTimeFormatter4.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 69);
        java.lang.Appendable appendable11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(appendable11, readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Thursday, January 1, 1970 12:00:00 AM +00:00:00.032" + "'", str2, "Thursday, January 1, 1970 12:00:00 AM +00:00:00.032");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test19612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19612");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone.setDefault(timeZone9);
        java.time.ZoneId zoneId12 = timeZone9.toZoneId();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone(zoneId12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = timeZone13.getDisplayName(true, 35877752);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 35877752");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test19613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19613");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withDefaultYear((-1970));
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter0.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.Chronology chronology8 = dateTimeFormatter6.getChronolgy();
        boolean boolean9 = dateTimeFormatter6.isOffsetParsed();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withLocale(locale10);
        java.lang.String str12 = locale10.getDisplayCountry();
        java.util.Locale locale13 = locale10.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter0.withLocale(locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withDefaultYear(2022);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long21 = dateTimeZone18.adjustOffset((-1L), true);
        long long25 = dateTimeZone18.convertLocalToUTC(1L, false, (long) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale29 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.yearOfEra();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundFloorCopy();
        boolean boolean36 = strSet30.remove((java.lang.Object) localDateTime35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.yearOfEra();
        org.joda.time.LocalDateTime localDateTime41 = property40.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime44.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localDateTime44.toDateTime(dateTimeZone50);
        long long52 = property40.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime53 = localDateTime35.toDateTime((org.joda.time.ReadableInstant) dateTime51);
        int int54 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime51);
        java.lang.String str56 = dateTimeZone26.getShortName(1L);
        long long58 = dateTimeZone18.getMillisKeepLocal(dateTimeZone26, (long) 999);
        java.util.Locale locale60 = java.util.Locale.PRC;
        java.util.Locale locale61 = locale60.stripExtensions();
        java.lang.String str62 = locale60.getDisplayName();
        java.lang.String str63 = locale60.getDisplayName();
        java.lang.String str64 = dateTimeZone26.getShortName((long) (byte) 1, locale60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter16.withZone(dateTimeZone26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter16.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale69.getDisplayLanguage();
        java.lang.String str71 = locale68.getDisplayCountry(locale69);
        java.lang.String str72 = locale69.getDisplayName();
        boolean boolean73 = locale69.hasExtensions();
        java.util.Set<java.lang.Character> charSet74 = locale69.getExtensionKeys();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = dateTimeFormatter16.withLocale(locale69);
        java.util.Set<java.lang.Character> charSet76 = locale69.getExtensionKeys();
        java.util.Set<java.lang.String> strSet77 = locale69.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "South Korea" + "'", str12, "South Korea");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(dateTime53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00:00.032" + "'", str56, "+00:00:00.032");
// flaky:         org.junit.Assert.assertTrue("'" + long58 + "' != '" + 967L + "'", long58 == 967L);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Chinese (China)" + "'", str62, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Chinese (China)" + "'", str63, "Chinese (China)");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+00:00:00.032" + "'", str64, "+00:00:00.032");
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "french__1970");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "french__1970");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "french" + "'", str70, "french");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "french (1970)" + "'", str72, "french (1970)");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(charSet74);
        org.junit.Assert.assertNotNull(dateTimeFormatter75);
        org.junit.Assert.assertNotNull(charSet76);
        org.junit.Assert.assertNotNull(strSet77);
    }

    @Test
    public void test19614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19614");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        int int7 = localDateTime6.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withWeekyear(1969);
        java.lang.String str12 = localDateTime6.toString();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime6.withYear(575);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfEra();
        long long19 = property18.remainder();
        org.joda.time.LocalDateTime localDateTime20 = property18.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.centuryOfEra();
        java.util.Date date22 = localDateTime20.toDate();
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = localDateTime20.isSupported(durationFieldType23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.yearOfEra();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withWeekOfWeekyear((int) (byte) 1);
        int int31 = localDateTime30.size();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.plusYears((int) (byte) 100);
        int int34 = localDateTime33.getYearOfEra();
        int int35 = localDateTime33.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime38 = property36.addToCopy(8812800000L);
        org.joda.time.LocalDateTime localDateTime39 = property36.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.year();
        int int41 = property40.getMinimumValueOverall();
        org.joda.time.DateTimeField dateTimeField42 = property40.getField();
        long long43 = property40.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property40.getFieldType();
        org.joda.time.LocalDateTime.Property property45 = localDateTime20.property(dateTimeFieldType44);
        int int46 = localDateTime6.indexOf(dateTimeFieldType44);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime6.withYearOfEra(86300032);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1970-01-01T00:00:00.032" + "'", str12, "-1970-01-01T00:00:00.032");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Jan 01 00:00:00 UTC 1971");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2070 + "'", int34 == 2070);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-292275054) + "'", int41 == (-292275054));
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(localDateTime48);
    }

    @Test
    public void test19615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19615");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str3 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        long long9 = property8.remainder();
        org.joda.time.LocalDateTime localDateTime10 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime14.toDateTime(dateTimeZone20);
        int int22 = property11.getDifference((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime25.toDateTime(dateTimeZone31);
        boolean boolean33 = dateTime21.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.yearOfEra();
        long long38 = property37.remainder();
        org.joda.time.LocalDateTime localDateTime39 = property37.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = localDateTime43.toDateTime(dateTimeZone49);
        int int51 = property40.getDifference((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone53);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime54.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = localDateTime54.toDateTime(dateTimeZone60);
        boolean boolean62 = dateTime50.isBefore((org.joda.time.ReadableInstant) dateTime61);
        int int63 = dateTime32.compareTo((org.joda.time.ReadableInstant) dateTime61);
        int int64 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime32);
        long long67 = dateTimeZone1.convertLocalToUTC((long) 1, false);
        java.util.TimeZone timeZone68 = dateTimeZone1.toTimeZone();
        java.util.Locale locale69 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = timeZone68.getDisplayName(locale69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property37);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertNotNull(timeZone68);
        org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test19616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19616");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.lang.String str4 = nameProvider0.getName(locale1, "69", "yearOfEra");
        java.util.Locale locale5 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.lang.String str7 = locale5.getVariant();
        java.lang.String str8 = locale5.getDisplayName();
        java.util.Set<java.lang.String> strSet9 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str12 = nameProvider0.getShortName(locale5, "January 1, 1970 12:00:00 AM +00:00:00.032", "07/04/70 0.00");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.tz.NameProvider nameProvider14 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str18 = nameProvider14.getName(locale15, "69", "yearOfEra");
        java.util.Locale locale21 = new java.util.Locale("eng", "hi!");
        java.lang.String str24 = nameProvider14.getShortName(locale21, "English (United States)", "yearOfEra");
        java.lang.String str25 = locale21.getDisplayName();
        java.lang.String str28 = nameProvider0.getName(locale21, "french", "Deutsch (Deutschland)");
        boolean boolean29 = locale21.hasExtensions();
        java.util.Locale locale30 = java.util.Locale.UK;
        java.lang.String str31 = locale21.getDisplayCountry(locale30);
        java.lang.String str32 = locale30.getDisplayScript();
        java.lang.String str33 = locale30.getISO3Language();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.yearOfEra();
        org.joda.time.LocalDateTime localDateTime38 = property37.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime41.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime41.toDateTime(dateTimeZone47);
        long long49 = property37.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.LocalDateTime localDateTime51 = property37.addWrapFieldToCopy(1970);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusSeconds(2922789);
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.monthOfYear();
        org.joda.time.LocalDateTime.Property property55 = localDateTime51.dayOfYear();
        org.joda.time.DurationField durationField56 = property55.getLeapDurationField();
        java.lang.String str57 = property55.getAsShortText();
        java.util.Locale locale59 = java.util.Locale.forLanguageTag("19");
        java.lang.String str61 = locale59.getUnicodeLocaleType("69");
        java.lang.String str62 = property55.getAsText(locale59);
        java.lang.String str63 = locale59.getISO3Language();
        java.lang.String str64 = locale30.getDisplayLanguage(locale59);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nameProvider14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals(locale21.toString(), "eng_HI!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "English (HI!)" + "'", str25, "English (HI!)");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HI!" + "'", str31, "HI!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "eng" + "'", str33, "eng");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNull(durationField56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1" + "'", str57, "1");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1" + "'", str62, "1");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "English" + "'", str64, "English");
    }

    @Test
    public void test19617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19617");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withYear(70);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.hourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        org.joda.time.LocalDateTime localDateTime19 = property16.roundHalfFloorCopy();
        int int20 = property16.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime21 = property16.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test19618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19618");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        int int12 = localDateTime9.indexOf(dateTimeFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plus(readablePeriod13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withCenturyOfEra(10);
        int int17 = localDateTime14.getDayOfYear();
        org.joda.time.DateTimeField[] dateTimeFieldArray18 = localDateTime14.getFields();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.plusMillis(575);
        int int21 = localDateTime20.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYear(84400009);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test19619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19619");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("2969");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test19620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19620");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int3 = dateTimeZone1.getOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 2000);
        org.joda.time.tz.NameProvider nameProvider9 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str13 = nameProvider9.getName(locale10, "69", "yearOfEra");
        java.lang.String str14 = locale10.getDisplayName();
        java.lang.String str15 = dateTimeZone5.getShortName(0L, locale10);
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale20 = new java.util.Locale("eng", "hi!");
        java.util.Locale locale24 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str25 = locale20.getDisplayVariant(locale24);
        java.util.Set<java.lang.String> strSet26 = locale20.getUnicodeLocaleKeys();
        java.util.Locale locale27 = locale20.stripExtensions();
        java.lang.String str28 = locale16.getDisplayVariant(locale20);
        java.lang.String str29 = locale10.getDisplayScript(locale16);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str31 = locale16.getDisplayVariant(locale30);
        java.lang.String str32 = locale30.getISO3Country();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1991L + "'", long7 == 1991L);
        org.junit.Assert.assertNotNull(nameProvider9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese (Taiwan)" + "'", str14, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.009" + "'", str15, "+00:00:00.009");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale20.toString(), "eng_HI!");
        org.junit.Assert.assertEquals(locale24.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "eng_HI!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "TWN" + "'", str32, "TWN");
    }

    @Test
    public void test19621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19621");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        long long5 = property4.remainder();
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.util.Locale locale7 = locale6.stripExtensions();
        int int8 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Set<java.lang.String> strSet10 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str11 = locale6.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(strSet10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str11, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test19622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19622");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        boolean boolean9 = strSet3.remove((java.lang.Object) localDateTime8);
        strSet3.clear();
        boolean boolean11 = strSet3.isEmpty();
        int int12 = strSet3.size();
        java.util.Spliterator<java.lang.String> strSpliterator13 = strSet3.spliterator();
        java.lang.Object[] objArray14 = strSet3.toArray();
        java.util.Collection<java.util.Locale> localeCollection15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = strSet3.retainAll(localeCollection15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test19623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19623");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.plusMonths(0);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readableDuration10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusMonths(7);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plusMillis(198);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.plusHours(252000000);
        org.joda.time.LocalDateTime.Property property18 = localDateTime9.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime20 = property18.addToCopy(32009);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test19624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19624");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale.FilteringMode filteringMode6 = null;
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4, filteringMode6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap8);
        java.util.Locale locale12 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale[] localeArray17 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList18 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList18, localeArray17);
        java.util.Locale.FilteringMode filteringMode20 = null;
        java.util.List<java.util.Locale> localeList21 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList18, filteringMode20);
        boolean boolean22 = strSet13.removeAll((java.util.Collection<java.util.Locale>) localeList21);
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList21);
        java.util.Locale locale26 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Locale[] localeArray31 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList32 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList32, localeArray31);
        java.util.Locale.FilteringMode filteringMode34 = null;
        java.util.List<java.util.Locale> localeList35 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList32, filteringMode34);
        boolean boolean36 = strSet27.removeAll((java.util.Collection<java.util.Locale>) localeList35);
        java.lang.String[] strArray37 = java.util.TimeZone.getAvailableIDs();
        java.lang.Comparable<java.lang.String>[] strComparableArray38 = strSet27.toArray((java.lang.Comparable<java.lang.String>[]) strArray37);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strSet27, filteringMode39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.yearOfEra();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withWeekOfWeekyear((int) (byte) 1);
        boolean boolean47 = strSet27.contains((java.lang.Object) (byte) 1);
        java.util.Spliterator<java.lang.String> strSpliterator48 = strSet27.spliterator();
        java.util.Iterator<java.lang.String> strItor49 = strSet27.iterator();
        strSet27.clear();
        boolean boolean52 = strSet27.equals((java.lang.Object) "3939-01-01T00:00:00.000");
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int58 = dateTimeZone56.getOffset(1L);
        long long60 = dateTimeZone54.getMillisKeepLocal(dateTimeZone56, (long) 70);
        long long64 = dateTimeZone56.convertLocalToUTC((long) 'a', true, 100L);
        java.util.TimeZone timeZone65 = dateTimeZone56.toTimeZone();
        java.time.ZoneId zoneId66 = timeZone65.toZoneId();
        java.util.TimeZone.setDefault(timeZone65);
        java.time.ZoneId zoneId68 = timeZone65.toZoneId();
        boolean boolean69 = strSet27.remove((java.lang.Object) zoneId68);
        java.util.TimeZone timeZone70 = java.util.TimeZone.getTimeZone(zoneId68);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localeList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strComparableArray38);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode39.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strSpliterator48);
        org.junit.Assert.assertNotNull(strItor49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 79L + "'", long60 == 79L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 97L + "'", long64 == 97L);
        org.junit.Assert.assertNotNull(timeZone65);
        org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId66);
        org.junit.Assert.assertNotNull(zoneId68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(timeZone70);
        org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
    }

    @Test
    public void test19625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19625");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("1970");
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("Korean");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder4.setLanguage("zh");
        java.util.Locale.Builder builder9 = builder4.addUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder4.setRegion("02/01/70");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 02/01/70 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test19626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19626");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfMonth();
        java.util.Locale locale10 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundFloorCopy();
        boolean boolean17 = strSet11.remove((java.lang.Object) localDateTime16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime25.toDateTime(dateTimeZone31);
        long long33 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime34 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.yearOfEra();
        long long39 = property38.remainder();
        org.joda.time.LocalDateTime localDateTime40 = property38.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime44.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localDateTime44.toDateTime(dateTimeZone50);
        int int52 = property41.getDifference((org.joda.time.ReadableInstant) dateTime51);
        boolean boolean53 = dateTime32.isAfter((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Chronology chronology54 = dateTime32.getChronology();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime6, chronology54);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(chronology54);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusMinutes((-18669));
        int int61 = localDateTime60.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property38);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 29 + "'", int61 == 29);
    }

    @Test
    public void test19627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19627");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long4 = dateTimeZone1.adjustOffset((-1L), true);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (short) 100);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int10 = timeZone9.getRawOffset();
        java.util.TimeZone.setDefault(timeZone9);
        boolean boolean12 = timeZone9.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone9);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withOffsetParsed();
        org.joda.time.Chronology chronology18 = dateTimeFormatter16.getChronolgy();
        boolean boolean19 = dateTimeFormatter16.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatter16.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int26 = dateTimeZone24.getOffset(1L);
        long long28 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) 70);
        long long32 = dateTimeZone24.convertLocalToUTC((long) 'a', true, 100L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter16.withZone(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.yearOfEra();
        long long38 = property37.remainder();
        org.joda.time.LocalDateTime localDateTime39 = property37.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((java.lang.Object) 0L, dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.withTime((int) (byte) 10, (int) (short) 10, (int) '4', (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = localDateTime43.toDateTime(dateTimeZone49);
        int int51 = property40.getDifference((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTime50.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter16.withZone(dateTimeZone52);
        int int55 = dateTimeZone52.getStandardOffset(79L);
        java.util.TimeZone timeZone56 = dateTimeZone52.toTimeZone();
        boolean boolean57 = timeZone9.hasSameRules(timeZone56);
        int int59 = timeZone9.getOffset((long) 2969);
        java.lang.String str60 = timeZone9.getID();
        timeZone9.setRawOffset(197070);
        int int63 = timeZone9.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(chronology18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dateTimePrinter20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 79L + "'", long28 == 79L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(property37);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
        org.junit.Assert.assertNotNull(timeZone56);
// flaky:         org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "UTC" + "'", str60, "UTC");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }
}
